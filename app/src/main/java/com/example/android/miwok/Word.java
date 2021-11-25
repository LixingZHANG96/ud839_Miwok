package com.example.android.miwok;

public class Word {
    private final int NO_IMAGE_ID = -1;
    private final int NO_AUDIO_ID = -1;
    private String DefaultWord;
    private String MiWokWord;

    private int audResID=NO_AUDIO_ID;
    private int imgResID=NO_IMAGE_ID;

    public Word(String defaultWord, String miWokWord, int imgResID, int audResID) {
        DefaultWord = defaultWord;
        MiWokWord = miWokWord;
        this.audResID = audResID;
        this.imgResID = imgResID;
    }

    public Word(String defaultWord, String miWokWord, int imgResID) {
        DefaultWord = defaultWord;
        MiWokWord = miWokWord;
        this.imgResID = imgResID;
    }

    public Word(String defaultWord, String miWokWord) {
        DefaultWord = defaultWord;
        MiWokWord = miWokWord;
    }

    public String getDefaultTranslation(){
        return DefaultWord;
    }

    public String getMiWokTranslation(){
        return MiWokWord;
    }

    public int getImgResID() {
        return imgResID;
    }
}
