package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter {
    private int colorTextBackgroundID = R.color.tan_background;

    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> Words) {
        super(context, 0, Words);
    }

    public WordAdapter(@NonNull Context context, @NonNull List objects, int color) {
        super(context, 0, objects);
        colorTextBackgroundID = color;
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
        //first set the background color
        LinearLayout textLinearLayout = listItemView.findViewById(R.id.ll_text);
        int colorNumber = ContextCompat.getColor(getContext(), colorTextBackgroundID); //get the color from an ID
        textLinearLayout.setBackgroundColor(colorNumber);
        // The TextView of the default translation
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.text_English);
        defaultTextView.setText(currentWord.getDefaultTranslation());
        // The TextView of the Miwok(German) translation
        TextView translatedTextView = (TextView) listItemView.findViewById(R.id.text_Deutsch);
        translatedTextView.setText(currentWord.getMiWokTranslation());
        // Set the ImageView
        ImageView iconImageView = (ImageView) listItemView.findViewById(R.id.img_icon);
        if (currentWord.getImgResID() != -1){
            iconImageView.setImageResource(currentWord.getImgResID());
        }
        else {
            iconImageView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
