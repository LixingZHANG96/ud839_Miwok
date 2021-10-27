package com.example.android.miwok;

public class Word {
    private final int NO_IMAGE_ID = -1;
    private String DefaultWord;
    private String MiWokWord;

    private int imgResID=NO_IMAGE_ID;

    public Word(String DefaultWord, String MiWokWord, int ImgResID){
        this.DefaultWord = DefaultWord;
        this.MiWokWord = MiWokWord;
        this.imgResID = ImgResID;
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
