package com.wm.myapplicationea;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.wm.myapplicationea.dto.LoginDto;

import static com.wm.myapplicationea.dto.Constant.LOGIN;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button okBut = (Button) findViewById(R.id.button);
        Button regBut = (Button) findViewById(R.id.button2);

        regBut.setOnClickListener(view -> {
            Intent intentRegestration = new Intent(this, RegestrationActivity.class);
            startActivity(intentRegestration);
        });

        okBut.setOnClickListener(but -> {
            Bundle arguments = getIntent().getExtras();
            if (arguments != null) {
                LoginDto loginDto = (LoginDto)arguments.get(LOGIN);
                Toast.makeText(this, loginDto.getLogin, Toast.LENGTH_SHORT).show();
            }

        });

    }


}