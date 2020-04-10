package com.goelrishabh.simplelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText mUserNametipl;
    private TextInputEditText mUserPasstipl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUserNametipl = findViewById(R.id.am_username_tipet);
        mUserPasstipl = findViewById(R.id.am_password_tipet);
    }

    /**
     * On SignIn Button Click
     */
    public void signIn(View view) {
        HelpersUI.showToast("clicked::signIn()");
    }


}
