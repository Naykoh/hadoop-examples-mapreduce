package com.opstty.mapper;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.IntWritable;
import java.io.IOException;

import com.opstty.utils.IntPairWritable;

public class MostTreesMapper extends Mapper<Object, Text, IntWritable, IntPairWritable> {

    public void map(Object key, Text value, Context context) throws IOException, InterruptedException {
        IntWritable one = new IntWritable(1);
        String line[] = value.toString().split("\t");
        try {
            int district = Integer.parseInt(line[0]);
            int nbTree = Integer.parseInt(line[1]);
            IntPairWritable v = new IntPairWritable(district,nbTree);
            context.write(one, v);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}