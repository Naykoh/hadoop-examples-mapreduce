package com.opstty.mapper;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class WordCountMapperTest {
    @Mock
    private Mapper.Context context;
    private WordCountMapper wordCountMapper;

    @Before
    public void setup() {
        this.wordCountMapper = new WordCountMapper();
    }

    @Test
    public void testMap() throws IOException, InterruptedException {
        String value = "foo bar tux";
        this.wordCountMapper.map(null, new Text(value), this.context);
        verify(this.context, times(3))
                .write(new Text("tux"), new IntWritable(1));
    }
}