package com.example.user.wordcounter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by user on 13/12/2016.
 */
public class WordCount {

    private ArrayList<String> words;
    private HashMap<String, Integer> wordFrequencies;

    public WordCount() {
        this.words = new ArrayList<String>();
        this.wordFrequencies = new HashMap<String, Integer>();
    }

    public String count(String string) {
        String[] wordsArray = string.split("\\s+");
            for (String word : wordsArray){
                this.words.add(word);
            }
        int wordCount = words.size();
        return "Number of words: " + wordCount;
    }

    public String countWordFrequency() {
        for (String word : words) {
            Integer countOfWord = Collections.frequency(words, word);
            wordFrequencies.put(word, countOfWord);
        }
            return wordFrequencies.toString();
    }
}
