package com.an_ant_on_the_sun.guessword.controller;

import android.util.Log;

import com.an_ant_on_the_sun.guessword.BuildConfig;

public class GetQuestionAndAnswerFromString {
    private static final String TAG = "GuessWord";

    public static String[] getQuestionAndAnswer(String s, String splitChar){
        String[] partsOfString;
        if (s.contains(":")){
            partsOfString = s.split(splitChar);
        } else {
            String exception = "String " + s + " doesn't contain split character '" + splitChar + "'";
            if (BuildConfig.DEBUG){
                Log.d(TAG, "In GetQuestionAndAnswerFromString, " + exception);
            }
            throw new IllegalArgumentException(exception);
        }
        return partsOfString;
    }
}
