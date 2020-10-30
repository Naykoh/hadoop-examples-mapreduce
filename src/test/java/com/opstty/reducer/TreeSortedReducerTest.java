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
public class TreeSortedReducerTest {
    @Mock
    private Reducer.Context context;
    private TreeSortedReducer treeSortedReducer;

    @Before
    public void setup() {
        this.treeSortedReducer = new TreeSortedReducer();
    }

    @Test
    public void testReduce() throws IOException, InterruptedException {
        String key = "key";
        IntWritable value = new IntWritable(13);
        Iterable<IntWritable> values = Arrays.asList(value);

        this.treeSortedReducer.reduce(new Text(key), values, this.context);
        verify(this.context).write(new IntWritable(13), new Text(key));
    }
}
