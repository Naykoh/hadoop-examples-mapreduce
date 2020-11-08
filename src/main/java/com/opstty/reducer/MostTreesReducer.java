package com.opstty.reducer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

import com.opstty.utils.IntPairWritable;

public class MostTreesReducer extends Reducer<IntWritable, IntPairWritable, Text, IntWritable> {

    public void reduce(IntWritable key, Iterable<IntPairWritable> values, Context context) throws IOException, InterruptedException {

        IntPairWritable result = new IntPairWritable();

        for(IntPairWritable val: values){
            if(val.getInt2() > result.getInt2()){
                result = new IntPairWritable(val.getInt1(),val.getInt2());

            }
        }

        context.write(new Text("district containing the most trees: "), new IntWritable(result.getInt1()));

    }
}