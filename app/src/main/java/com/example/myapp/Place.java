package com.example.myapp;

public class Place {

    private String mPlace;
    private int mImageResourseId;
    String textView1;
    String textView2;
    String textView3;
    String textView4;

    public Place(String mPlace, int mImageResourseId, String textView1, String textView2, String textView3, String textView4) {
        this.mPlace = mPlace;
        this.mImageResourseId = mImageResourseId;
        this.textView1 = textView1;
        this.textView2 = textView2;
        this.textView3 = textView3;
        this.textView4 = textView4;
    }


    public String getmPlace() {
        return mPlace;
    }

    public int getmImageResourseId() {
        return mImageResourseId;
    }

    public String getTextView1() {
        return textView1;
    }

    public String getTextView2() {
        return textView2;
    }

    public String getTextView3() {
        return textView3;
    }

    public String getTextView4() {
        return textView4;
    }
}
