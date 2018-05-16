package com.an_ant_on_the_sun.guessword.controller;

public class GetQuestionAndAnswerFromString {
    public static String[] getQuestionAndAnswer(String s){
        String[] partsOfString;
        if (s.contains(":")){
            partsOfString = s.split(":");
        } else {
            String exception = "String " + s + " doesn't contain ':'";
            throw new IllegalArgumentException(exception);
        }
        return partsOfString;
    }
}
