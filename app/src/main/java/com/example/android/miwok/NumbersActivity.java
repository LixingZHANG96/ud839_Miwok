/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<>();
        // String[] words = {"one", "two", "three", "four", "five", "six", "seven", "eigh", "nine", "ten", "one", "two", "three", "four", "five", "six", "seven", "eigh", "nine", "ten"};

        words.add(new Word("one", "eins"));
        words.add(new Word("two","zwei"));
        words.add(new Word("three","drei"));
        words.add(new Word("four","vier"));
        words.add(new Word("five","fünf"));
        words.add(new Word("six","sechs"));
        words.add(new Word("seven","sieben"));
        words.add(new Word("eight","acht"));
        //ArrayList<String> wordsList = new ArrayList<String>(); // List of numbers strings

        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        /*
        LinearLayout rootView = findViewById(R.id.rootView); // Find the View Group for holding all textViews
        for (int i = 0; i < words.length; i++) {
            wordsList.add(words[i]);
            // Log.v("NumbersActivity", "ber " + String.valueOf(i+1) + " is " + wordsList.get(i));
            // Create a textView and add it to the Layout. Then set the text.
            TextView newTV = new TextView(this);
            newTV.setText(wordsList.get(i));
            rootView.addView(newTV);
        }
         */
    }
}
