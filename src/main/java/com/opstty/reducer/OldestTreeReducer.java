package com.opstty.reducer;

import com.opstty.utils.IntPairWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class OldestTreeReducer extends Reducer<Text, IntPairWritable, Text, IntPairWritable> {

    public void reduce(Text key, Iterable<IntPairWritable> values, Context context)
            throws IOException, InterruptedException {


        int lowestYear = 2021;
        int lowestDistrict= -1;

        for(IntPairWritable value : values){
            if(value.getInt2() < lowestYear){
                lowestYear = value.getInt2();
                lowestDistrict = value.getInt1();
            }
        }

        context.write(new Text("District containing oldest tree :"), new IntPairWritable(lowestDistrict,lowestYear));

    }
}
