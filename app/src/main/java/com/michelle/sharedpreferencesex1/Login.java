package com.michelle.sharedpreferencesex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    private EditText ed_user;
    private EditText ed_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ed_user = findViewById(R.id.name);
        ed_password = findViewById(R.id.password);
        String user = getSharedPreferences("user",MODE_PRIVATE)
                .getString("USER"," ");
        ed_user.setText(user);
        String password = getSharedPreferences("password",MODE_PRIVATE)
                .getString("PASSWORD"," ");
        ed_password.setText(password);
    }
}
