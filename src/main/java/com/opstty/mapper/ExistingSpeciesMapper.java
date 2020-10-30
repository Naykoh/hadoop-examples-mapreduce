package com.opstty.mapper;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;

public class ExistingSpeciesMapper extends Mapper<Object, Text, Text, IntWritable> {
    private final static IntWritable nul = new IntWritable(-1);
    private Text line = new Text();

    public void map(Object key, Text value, Context context)
            throws IOException, InterruptedException {
        StringTokenizer itr = new StringTokenizer(value.toString(),"\n");




        while (itr.hasMoreTokens()) {
            line.set(itr.nextToken());
            String specie = line.toString().split(";")[3];
            //skip header row
            if (!specie.equals("ESPECE"))
            {
                context.write(new Text(specie), nul);
            }
        }
    }
}
