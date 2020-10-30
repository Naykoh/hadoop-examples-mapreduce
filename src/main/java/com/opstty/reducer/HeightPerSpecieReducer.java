package com.opstty.reducer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.lang.*;

import java.io.IOException;

public class HeightPerSpecieReducer extends Reducer<Text, IntWritable, Text, IntWritable> {
    private IntWritable result = new IntWritable();

    public void reduce(Text key, Iterable<IntWritable> values, Context context)
            throws IOException, InterruptedException {

        int max = values.iterator().next().get();

        for(IntWritable value : values){
            if(value.get() > max){
                max = value.get();
            }
        }
        result.set(max);
        context.write(key, result);
    }
}

