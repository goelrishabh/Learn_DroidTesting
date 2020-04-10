package com.goelrishabh.simplelogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import static com.goelrishabh.simplelogin.EditTextUtil.basicUiValidation;
import static com.goelrishabh.simplelogin.EditTextUtil.getValue;
import static com.goelrishabh.simplelogin.HelpersUI.showToast;

public class LoginActivity extends AppCompatActivity {

    private TextInputEditText mUserNametipl;
    private TextInputEditText mUserPasstipl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mUserNametipl = findViewById(R.id.al_usernale_tipet);
        mUserPasstipl = findViewById(R.id.al_password_tipet);
    }

    /**
     * On SignIn Button Click
     */
    public void signIn(View view) {
        view.setEnabled(false);
        final String email = getValue(mUserNametipl);
        final String pass = getValue(mUserPasstipl);
        if (basicUiValidation(email, pass)) navigateToHome();
        else {
            showToast("Invalid Username of Password!");
            view.setEnabled(true);
        }
    }

    private void navigateToHome() {
        Intent homeIntent = new Intent(this, HomeActivity.class);
        startActivity(homeIntent);
        finish();
    }

}
