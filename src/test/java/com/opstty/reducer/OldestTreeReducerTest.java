package com.opstty.reducer;

import com.opstty.utils.IntPairWritable;
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
public class OldestTreeReducerTest {
    @Mock
    private Reducer.Context context;
    private OldestTreeReducer oldestTreeReducer;

    @Before
    public void setup() {
        this.oldestTreeReducer = new OldestTreeReducer();
    }

    @Test
    public void testReduce() throws IOException, InterruptedException {
        String key = "tree";
        IntPairWritable value1 = new IntPairWritable(1,1950);
        IntPairWritable value2 = new IntPairWritable(2,1951);
        IntPairWritable value3 = new IntPairWritable(3,1949);
        Iterable<IntPairWritable> values = Arrays.asList(value1,value2,value3);

        //this.oldestTreeReducer.reduce(new Text(key), values, this.context);
        //verify(this.context).write(new Text(key), new IntPairWritable(3,1949));
    }
}
