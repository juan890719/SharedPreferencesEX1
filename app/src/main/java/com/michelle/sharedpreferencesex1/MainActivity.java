package com.michelle.sharedpreferencesex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText ed_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed_name = findViewById(R.id.name);
    }
    public void login (View view){
        String user = ed_name.getText().toString();
        SharedPreferences pref = getSharedPreferences("user",MODE_PRIVATE);
        pref.edit()
                .putString("USER",user)
                .commit();
        Intent intent = new Intent(this,Password.class);
        startActivity(intent);

    }
}
