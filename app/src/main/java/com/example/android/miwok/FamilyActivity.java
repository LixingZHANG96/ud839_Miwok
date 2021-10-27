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

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<>();

        //Manuelly create the list of words
        words.add(new Word("Father", "Vater", R.drawable.family_father));
        words.add(new Word("Mother","Mutter", R.drawable.family_mother));
        words.add(new Word("Brother","Bruder", R.drawable.family_older_brother));
        words.add(new Word("Sister","Schwester", R.drawable.family_older_sister));
        words.add(new Word("Grandpa", "Opa", R.drawable.family_grandfather));
        words.add(new Word("Grandma","Oma", R.drawable.family_grandmother));

        //Set the Adapter
        WordAdapter itemsAdapter = new WordAdapter(this, words, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
    }
}
