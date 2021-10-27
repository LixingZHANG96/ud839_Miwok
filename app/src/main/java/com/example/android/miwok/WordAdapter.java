package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter {
    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> Words) {
        super(context, 0, Words);
    }

    @NonNull
    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = (Word) getItem(position);
        // The TextView of the default translation
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.text_English);
        defaultTextView.setText(currentWord.getDefaultTranslation());
        // The TextView of the Miwok(German) translation
        TextView translatedTextView = (TextView) listItemView.findViewById(R.id.text_Deutsch);
        translatedTextView.setText(currentWord.getMiWokTranslation());

        return listItemView;
    }
}
