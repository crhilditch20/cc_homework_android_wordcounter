package com.example.user.wordcounter;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 13/12/2016.
 */
public class WordCountTest {

    @Test
    public void testCount(){
        String testString = "I want a gin";
        WordCount wordCount = new WordCount();
        assertEquals("Number of words: 4", wordCount.count(testString));
    }

    @Test
    public void testCountWordFrequency(){
        String testString = "I really really want a gin";
        WordCount wordCount = new WordCount();
        wordCount.count(testString);
        assertEquals("I: 1, really: 2, want: 1, a: 1, gin: 1", wordCount.countWordFrequency());
    }
}
