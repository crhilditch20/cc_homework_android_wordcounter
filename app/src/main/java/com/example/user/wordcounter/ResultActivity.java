package com.example.user.wordcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by user on 13/12/2016.
 */
public class ResultActivity extends AppCompatActivity {

        TextView resultTextView;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_result);

            resultTextView = (TextView) findViewById(R.id.result);

            Intent intent = getIntent();
            Bundle extras = intent.getExtras();
            String result = extras.getString("wordcount");
            resultTextView.setText(result);

        }
}
