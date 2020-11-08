package com.opstty.mapper;

import com.opstty.utils.IntPairWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;

public class OldestTreeMapper extends Mapper<Object, Text, Text, IntPairWritable>{
    private final static IntWritable one = new IntWritable(1);
    private Text line = new Text();

    public void map(Object key, Text value, Context context)
            throws IOException, InterruptedException {
        StringTokenizer itr = new StringTokenizer(value.toString(),"\n");

        while (itr.hasMoreTokens()) {
            line.set(itr.nextToken());
            String row = line.toString();
            String id = row.split(";")[11]; //get unique ID as String

            //skip header row
            if (!id.equals("OBJECTID"))
            {
                String age = row.split(";")[5];  //get age as a String
                String district = row.split(";")[1];  //get district as a String

                if (!age.equals("")){ //check for a NaN Values
                    context.write(new Text("tree"), new IntPairWritable((int)Double.parseDouble(district),(int)Double.parseDouble(age)));
                }
            }
        }
    }
}
