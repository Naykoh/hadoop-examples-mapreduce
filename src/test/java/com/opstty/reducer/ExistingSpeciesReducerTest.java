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
public class ExistingSpeciesReducerTest {
    @Mock
    private Reducer.Context context;
    private ExistingSpeciesReducer existingSpeciesReducer;

    @Before
    public void setup() {
        this.existingSpeciesReducer = new ExistingSpeciesReducer();
    }

    @Test
    public void testReduce() throws IOException, InterruptedException {
        IntWritable district = new IntWritable(2);
        IntWritable nul = new IntWritable(-1);
        Iterable<IntWritable> values = Arrays.asList(nul, nul, nul);

        this.existingSpeciesReducer.reduce(new Text(String.valueOf(district)), values, this.context);
        verify(this.context).write(new Text(String.valueOf(2)), new IntWritable(-1));
    }
}
