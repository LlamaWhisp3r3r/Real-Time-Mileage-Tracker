package com.nathan.realtimemileagetracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DialogFragment newFragment = new SignInDialog();
        newFragment.show(getSupportFragmentManager(), "Sign in");
    }
}
