package com.opstty.mapper;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;

public class HeightPerSpecieMapper extends Mapper<Object, Text, Text, IntWritable> {
    private Text line = new Text();

    public void map(Object key, Text value, Context context)
            throws IOException, InterruptedException {
        StringTokenizer itr = new StringTokenizer(value.toString(),"\n");

        while (itr.hasMoreTokens()) {
            line.set(itr.nextToken());
            String row = line.toString();
            String specie = row.split(";")[3];

            //skip header row
            if (!specie.equals("ESPECE"))
            {
                String heightString = row.split(";")[6];  //get my height as a String
                if (!heightString.equals("")){ //check for a NaN Values
                    IntWritable height = new IntWritable((int)Double.parseDouble(heightString));
                    context.write(new Text(specie), height);
                }
            }
        }
    }
}
