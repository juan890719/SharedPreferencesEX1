package com.michelle.sharedpreferencesex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Password extends AppCompatActivity {

    private EditText ed_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        ed_password = findViewById(R.id.password);
    }
    public void login2 (View view){
        String password = ed_password.getText().toString();
        SharedPreferences pref = getSharedPreferences("password",MODE_PRIVATE);
        pref.edit()
                .putString("PASSWORD",password)
                .commit();
        Intent intent = new Intent(this,Login.class);
        startActivity(intent);
    }
}
