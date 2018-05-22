package com.an_ant_on_the_sun.guessword.view;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.an_ant_on_the_sun.guessword.R;

public class AboutActivity extends AppCompatActivity {
    private TextView textViewAbout;
    private Button buttonRateApp;
    private Button buttonSupportDeveloper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        textViewAbout = findViewById(R.id.textViewAbout);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    public void onRateAppButtonClick(View view){}

    public void onSupportDeveloperButtonClick(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://yasobe.ru/na/na_poezdku_v_kitai"));
        startActivity(browserIntent);
    }

}
