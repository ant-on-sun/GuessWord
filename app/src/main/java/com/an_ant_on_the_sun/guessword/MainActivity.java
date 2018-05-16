package com.an_ant_on_the_sun.guessword;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.an_ant_on_the_sun.guessword.controller.GetQuestionAndAnswerFromString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String KEY_INDEX = "INDEX";
    private static final String KEY_SHUFFLED_ARRAY = "SHUFFLED_ARRAY";
    private static final String KEY_NUMBER_OF_WRONGS = "NUMBER_OF_WRONGS";
    private static final String KEY_OPENED_LETTERS = "OPENED_LETTERS";
    private static final String KEY_TEXT_INFO = "TEXT_INFO";
    private static final String KEY_EDIT_TEXT_IS_ENABLED = "EDIT_TEXT_IS_ENABLED";
    private static final int MAX_WORD_LENGTH = 12;
    private static final int MAX_NUMBER_OF_WRONGS = 7;

    private String[] quizArray;
    private List<String> quizList = new ArrayList<>();
    private String designationText;
    private String quizAnswer;
    private int mIndexOfElementInShuffledList;
    private List<TextView> listOfTextViewLetters = new ArrayList<>();
    private List<ImageView> listOfImageViewTiles = new ArrayList<>();
    private List<ImageView> listOfImageViewPictures = new ArrayList<>();
    private int numberOfLetters;
    private int numberOfWrongs;
    private boolean[] openedLetters;
    private boolean editTextIsEnabled;

    private ConstraintLayout mConstraintLayout;
    private TextView textViewDesignation;
    private ImageView imageViewTile1;
    private ImageView imageViewTile2;
    private ImageView imageViewTile3;
    private ImageView imageViewTile4;
    private ImageView imageViewTile5;
    private ImageView imageViewTile6;
    private ImageView imageViewTile7;
    private ImageView imageViewTile8;
    private ImageView imageViewTile9;
    private ImageView imageViewTile10;
    private ImageView imageViewTile11;
    private ImageView imageViewTile12;
    private TextView textViewLetter1;
    private TextView textViewLetter2;
    private TextView textViewLetter3;
    private TextView textViewLetter4;
    private TextView textViewLetter5;
    private TextView textViewLetter6;
    private TextView textViewLetter7;
    private TextView textViewLetter8;
    private TextView textViewLetter9;
    private TextView textViewLetter10;
    private TextView textViewLetter11;
    private TextView textViewLetter12;
    private EditText editTextUserInput;
    private TextView textViewResultInfo;
    private Button buttonEnter;
    private ImageView imageViewHangman1;
    private ImageView imageViewHangman2;
    private ImageView imageViewHangman3;
    private ImageView imageViewHangman4;
    private ImageView imageViewHangman5;
    private ImageView imageViewHangman6;
    private ImageView imageViewHangman7;
    private ImageView imageViewHangman8;
    private Button buttonAnotherWord;
    private Button buttonAbout;
    //private VideoView videoViewForMovie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mConstraintLayout = findViewById(R.id.mConstraintLayout);
        textViewDesignation = findViewById(R.id.textViewDesignation);
        imageViewTile1 = findViewById(R.id.imageViewTile1);
        imageViewTile2 = findViewById(R.id.imageViewTile2);
        imageViewTile3 = findViewById(R.id.imageViewTile3);
        imageViewTile4 = findViewById(R.id.imageViewTile4);
        imageViewTile5 = findViewById(R.id.imageViewTile5);
        imageViewTile6 = findViewById(R.id.imageViewTile6);
        imageViewTile7 = findViewById(R.id.imageViewTile7);
        imageViewTile8 = findViewById(R.id.imageViewTile8);
        imageViewTile9 = findViewById(R.id.imageViewTile9);
        imageViewTile10 = findViewById(R.id.imageViewTile10);
        imageViewTile11 = findViewById(R.id.imageViewTile11);
        imageViewTile12 = findViewById(R.id.imageViewTile12);
        textViewLetter1 = findViewById(R.id.textViewLetter1);
        textViewLetter2 = findViewById(R.id.textViewLetter2);
        textViewLetter3 = findViewById(R.id.textViewLetter3);
        textViewLetter4 = findViewById(R.id.textViewLetter4);
        textViewLetter5 = findViewById(R.id.textViewLetter5);
        textViewLetter6 = findViewById(R.id.textViewLetter6);
        textViewLetter7 = findViewById(R.id.textViewLetter7);
        textViewLetter8 = findViewById(R.id.textViewLetter8);
        textViewLetter9 = findViewById(R.id.textViewLetter9);
        textViewLetter10 = findViewById(R.id.textViewLetter10);
        textViewLetter11 = findViewById(R.id.textViewLetter11);
        textViewLetter12 = findViewById(R.id.textViewLetter12);
        editTextUserInput = findViewById(R.id.editTextUserInput);
        textViewResultInfo = findViewById(R.id.textViewResultInfo);
        buttonEnter = findViewById(R.id.buttonEnter);
        imageViewHangman1 = findViewById(R.id.imageViewHangman1);
        imageViewHangman2 = findViewById(R.id.imageViewHangman2);
        imageViewHangman3 = findViewById(R.id.imageViewHangman3);
        imageViewHangman4 = findViewById(R.id.imageViewHangman4);
        imageViewHangman5 = findViewById(R.id.imageViewHangman5);
        imageViewHangman6 = findViewById(R.id.imageViewHangman6);
        imageViewHangman7 = findViewById(R.id.imageViewHangman7);
        imageViewHangman8 = findViewById(R.id.imageViewHangman8);
        buttonAnotherWord = findViewById(R.id.buttonAnotherWord);
        //videoViewForMovie = findViewById(R.id.videoViewForMovie);

        listOfTextViewLetters.addAll(Arrays.asList(
                textViewLetter1,
                textViewLetter2,
                textViewLetter3,
                textViewLetter4,
                textViewLetter5,
                textViewLetter6,
                textViewLetter7,
                textViewLetter8,
                textViewLetter9,
                textViewLetter10,
                textViewLetter11,
                textViewLetter12
                )
        );

        listOfImageViewTiles.addAll(Arrays.asList(
                imageViewTile1,
                imageViewTile2,
                imageViewTile3,
                imageViewTile4,
                imageViewTile5,
                imageViewTile6,
                imageViewTile7,
                imageViewTile8,
                imageViewTile9,
                imageViewTile10,
                imageViewTile11,
                imageViewTile12
                )
        );

        listOfImageViewPictures.addAll(Arrays.asList(
                imageViewHangman1,
                imageViewHangman2,
                imageViewHangman3,
                imageViewHangman4,
                imageViewHangman5,
                imageViewHangman6,
                imageViewHangman7,
                imageViewHangman8
                )
        );

        buttonEnter.setEnabled(false);
        editTextUserInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (editTextUserInput.getText().toString().length() > 0){
                    buttonEnter.setEnabled(true);
                } else {
                    buttonEnter.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        if (savedInstanceState != null){
            mIndexOfElementInShuffledList = savedInstanceState.getInt(KEY_INDEX);
            quizList = savedInstanceState.getStringArrayList(KEY_SHUFFLED_ARRAY);
            numberOfWrongs = savedInstanceState.getInt(KEY_NUMBER_OF_WRONGS);
            openedLetters = savedInstanceState.getBooleanArray(KEY_OPENED_LETTERS);
            textViewResultInfo.setText(savedInstanceState.getString(KEY_TEXT_INFO));
            editTextIsEnabled = savedInstanceState.getBoolean(KEY_EDIT_TEXT_IS_ENABLED);
            editTextUserInput.setEnabled(editTextIsEnabled);
        } else {
            mIndexOfElementInShuffledList = 0;
            numberOfWrongs = 0;
            quizArray = getResources().getStringArray(R.array.quiz_array);
            quizList = Arrays.asList(quizArray);
            Collections.shuffle(quizList);
            editTextIsEnabled = true;
        }

        setupQuizDesignationAndAnswer();
        if (openedLetters == null) {
            openedLetters = new boolean[numberOfLetters];
        }
        handleOpenedLetters();
        handlePictures();
    }

    public  void onGuessButtonClick(View view){
        String userInput = editTextUserInput.getText().toString().toUpperCase();

        if (userInput.length() == 1){
            if (quizAnswer.contains(userInput)){
                for (int i = 0; i < numberOfLetters; i++){
                    if (String.valueOf(quizAnswer.charAt(i)).equalsIgnoreCase(userInput)){
                        listOfImageViewTiles.get(i).setVisibility(View.INVISIBLE);
                        listOfTextViewLetters.get(i).setVisibility(View.VISIBLE);
                        openedLetters[i] = true;
                    }
                }
                textViewResultInfo.setText("");
                editTextUserInput.getText().clear();
            } else {
                numberOfWrongs++;
                textViewResultInfo.setText(getString(R.string.no_such_letter, userInput));
                editTextUserInput.getText().clear();
                handlePictures();
            }
        } else {
            if (quizAnswer.equalsIgnoreCase(userInput)){
                setWinState();
            } else {
                numberOfWrongs = MAX_NUMBER_OF_WRONGS;
                handlePictures();
            }
        }
        if (userHasWon(openedLetters)){
            setWinState();
        }
        if (numberOfWrongs >= MAX_NUMBER_OF_WRONGS){
            setLooseState();
        }
    }

    public void onAnotherWordButtonClick(View view){
        if (mIndexOfElementInShuffledList >= quizList.size() - 1){
            mIndexOfElementInShuffledList = 0;
        } else {
            mIndexOfElementInShuffledList++;
        }
        numberOfWrongs = 0;
        textViewResultInfo.setText("");
        setupQuizDesignationAndAnswer();
        openedLetters = new boolean[numberOfLetters];
        handlePictures();
        editTextUserInput.setEnabled(true);
        editTextIsEnabled = true;
    }

    public void onAboutButtonClick(View view){
        Intent intentAbout = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intentAbout);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt(KEY_INDEX, mIndexOfElementInShuffledList);
        outState.putStringArrayList(KEY_SHUFFLED_ARRAY, new ArrayList<>(quizList));
        outState.putInt(KEY_NUMBER_OF_WRONGS, numberOfWrongs);
        outState.putBooleanArray(KEY_OPENED_LETTERS, openedLetters);
        outState.putString(KEY_TEXT_INFO, textViewResultInfo.getText().toString());
        outState.putBoolean(KEY_EDIT_TEXT_IS_ENABLED, editTextIsEnabled);
    }

    private void handlePictures(){
        for (int i = 0; i < listOfImageViewPictures.size(); i++){
            if (i == numberOfWrongs){
                listOfImageViewPictures.get(i).setVisibility(View.VISIBLE);
            } else {
                listOfImageViewPictures.get(i).setVisibility(View.INVISIBLE);
            }
        }
    }

    private void setupQuizDesignationAndAnswer(){
        String[] partsOfString = GetQuestionAndAnswerFromString
                .getQuestionAndAnswer(quizList.get(mIndexOfElementInShuffledList));
        textViewDesignation.setText(partsOfString[0]);
        quizAnswer = partsOfString[1].trim().toUpperCase();
        numberOfLetters = quizAnswer.length();
        for (int i = 0; i < MAX_WORD_LENGTH; i++){
            if (i < numberOfLetters){
                String letter = String.valueOf(quizAnswer.charAt(i));
                listOfTextViewLetters.get(i).setText(letter);
                listOfImageViewTiles.get(i).setVisibility(View.VISIBLE);
                listOfTextViewLetters.get(i).setVisibility(View.INVISIBLE);
            } else {
                listOfTextViewLetters.get(i).setVisibility(View.GONE);
                listOfImageViewTiles.get(i).setVisibility(View.GONE);
            }
        }
    }

    private void handleOpenedLetters(){
        if (openedLetters != null){
            for (int i = 0; i < numberOfLetters; i++){
                if (openedLetters[i]) {
                    listOfImageViewTiles.get(i).setVisibility(View.INVISIBLE);
                    listOfTextViewLetters.get(i).setVisibility(View.VISIBLE);
                }
            }
        }
    }

    private void setWinState(){
        for (int i = 0; i < numberOfLetters; i++){
            listOfImageViewTiles.get(i).setVisibility(View.INVISIBLE);
            listOfTextViewLetters.get(i).setVisibility(View.VISIBLE);
            openedLetters[i] = true;
        }
        textViewResultInfo.setText(getString(R.string.you_are_right));
        editTextUserInput.getText().clear();
        editTextUserInput.setEnabled(false);
        editTextIsEnabled = false;
    }

    private void setLooseState(){
        textViewResultInfo.setText(getString(R.string.you_loose));
        editTextUserInput.getText().clear();
        editTextUserInput.setEnabled(false);
        editTextIsEnabled = false;
    }

    private boolean userHasWon(boolean[] bArray){
        for (int i = 0; i < bArray.length; i++){
            if (!bArray[i]){
                return false;
            }
        }
        return true;
    }

}
