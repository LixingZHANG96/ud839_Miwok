package com.example.android.miwok;

public class Word {
    private String DefaultWord;
    private String MiWokWord;

    public Word(String DefaultWord, String MiWokWord){
        this.DefaultWord = DefaultWord;
        this.MiWokWord = MiWokWord;
    }

    public String getDefaultTranslation(){
        return DefaultWord;
    }

    public String getMiWokTranslation(){
        return MiWokWord;
    }
}
