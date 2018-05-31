package com.an_ant_on_the_sun.guessword.controller;

import android.util.Log;

import com.an_ant_on_the_sun.guessword.BuildConfig;

import java.util.Iterator;
import java.util.List;

public class CheckQuizList {
    private static final String TAG = "GuessWord";

    public static List<String> removeWrongStrings(List<String> s, String splitChar){
        Iterator<String> iterator = s.iterator();
        while (iterator.hasNext()){
            String itemString = iterator.next();
            int i = itemString.indexOf(splitChar);
            // If item does not contain splitChar or item contains more than one splitChar,
            // it will be removed from list
            if (i == -1 || i != itemString.lastIndexOf(splitChar)){
                iterator.remove();
                if (BuildConfig.DEBUG){
                    Log.d(TAG, "In CheckQuizList, string '" + itemString + "' was removed.");
                }
            }
        }
        return s;
    }
}
