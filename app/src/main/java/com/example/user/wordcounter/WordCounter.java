package com.example.user.wordcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 13/12/2016.
 */
public class WordCounter extends AppCompatActivity {

    EditText sentenceEditText;
    Button countButton;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sentenceEditText = (EditText)findViewById(R.id.user_string);
        countButton = (Button)findViewById(R.id.count_words);


        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user_sentence = sentenceEditText.getText().toString();
                WordCount wordCount = new WordCount();
                String result = wordCount.count(user_sentence);

                Intent intent = new Intent(WordCounter.this, ResultActivity.class);
                intent.putExtra("wordcount", result);
                startActivity(intent);
            }
        });

}

}