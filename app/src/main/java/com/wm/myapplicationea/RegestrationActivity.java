package com.wm.myapplicationea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

public class RegestrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regestration);

        setTitle("Rejestruj konto");
//        getWindow().getDecorView().setBackgroundColor(Color.CYAN);

        EditText login = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText pwd = (EditText) findViewById(R.id.editTextTextPersonName);

        Button registrationBut = (Button) findViewById(R.id.button3);

        registrationBut.setOnClickListener(view -> {
            String loginValue = login.getText().toString();
            String pwdValue = pwd.getText().toString();
            Intent intentRegestration = new Intent(this, MainActivity.class);
            intentRegestration.putExtra("login", loginValue);
            intentRegestration.putExtra("password", pwdValue);
            startActivity(intentRegestration);
        });
    }
}