package com.opstty.reducer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;
import java.util.Arrays;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class HeightPerSpecieReducerTest {
    @Mock
    private Reducer.Context context;
    private HeightPerSpecieReducer heightPerSpecieReducer;

    @Before
    public void setup() {
        this.heightPerSpecieReducer = new HeightPerSpecieReducer();
    }

    @Test
    public void testReduce() throws IOException, InterruptedException {
        String key = "key";
        Iterable<IntWritable> values = Arrays.asList(new IntWritable(5),new IntWritable(13), new IntWritable(8));

        this.heightPerSpecieReducer.reduce(new Text(key), values, this.context);
        verify(this.context).write(new Text(key), new IntWritable(13));
    }
}
