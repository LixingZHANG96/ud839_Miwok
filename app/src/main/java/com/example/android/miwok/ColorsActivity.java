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
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<>();

        //Manuelly create the list of words
        words.add(new Word("Red", "Rot", R.drawable.color_red));
        words.add(new Word("Brown","Braun", R.drawable.color_brown));
        words.add(new Word("Yellow","Gelb", R.drawable.color_mustard_yellow));
        words.add(new Word("Green","Grün",R.drawable.color_green));
        words.add(new Word("Gray","Glau", R.drawable.color_gray));
        words.add(new Word("White","Weiß", R.drawable.color_white));
        words.add(new Word("Black","Schwarz", R.drawable.color_black));

        //Set the Adapter
        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
