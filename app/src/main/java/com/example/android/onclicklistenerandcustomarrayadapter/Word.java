package com.example.android.onclicklistenerandcustomarrayadapter;

public class Word {


    //String to store the first input
    private String mSpanTranslation;

    //String to store second input
    private String mDefaultTranslation;


    //Created a constructor for Word Class
    public Word(String spanTranslation, String defaultTranslation){
        mSpanTranslation = spanTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    //Declared a spanishTranslator Method
    public String getSpanTranslation() {
        return mSpanTranslation;
    }


    //Declared a DefaultTranslator Method
    public String getDefaultTranslation() {
        return  mDefaultTranslation;
    }
}
