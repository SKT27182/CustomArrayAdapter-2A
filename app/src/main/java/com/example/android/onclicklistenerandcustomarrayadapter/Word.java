package com.example.android.onclicklistenerandcustomarrayadapter;

public class Word {

    private String mSpanTranslation;

    private String mDefaultTranslation;

    public Word(String spanTranslation, String defaultTranslation){
        mSpanTranslation = spanTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    public String getSpanTranslation() {
        return mSpanTranslation;
    }

    public String getDefaultTranslation() {
        return  mDefaultTranslation;
    }
}
