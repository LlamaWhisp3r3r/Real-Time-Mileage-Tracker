package com.nathan.realtimemileagetracker;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.DialogFragment;

public class SignInDialog extends DialogFragment {

    private AlertDialog.Builder builder;
    private Activity activity;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        activity = getActivity();
        builder = new AlertDialog.Builder(activity);
        setView(R.id.sign_in_title);
        setPositiveAndNegativeButtons();

        return builder.create();
    }

    private void setView(int dialogID) {
        builder.setView(dialogID);
    }

    private void setPositiveAndNegativeButtons() {
        builder.setPositiveButton("Sign in", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Do something when it is clicked
            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Do something when this is clicked
            }
        });
    }
}

