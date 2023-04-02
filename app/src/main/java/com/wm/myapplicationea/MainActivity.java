package com.wm.myapplicationea;

import static com.wm.myapplicationea.utils.Constants.LOGIN;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.wm.myapplicationea.dto.LoginDto;

public class MainActivity extends AppCompatActivity {
    private LoginDto loginDto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText login = (EditText) findViewById(R.id.editTextTextPersonName2);
        EditText pwd = (EditText) findViewById(R.id.editTextTextPersonName4);

        Button okBut = (Button) findViewById(R.id.button);
        Button regBut = (Button) findViewById(R.id.button2);

        regBut.setOnClickListener(view -> {
            Intent intentRegestration = new Intent(this, RegestrationActivity.class);
            startActivity(intentRegestration);
        });

        okBut.setOnClickListener(but -> {
            Bundle arguments = getIntent().getExtras();
            if (arguments != null) {
                loginDto = (LoginDto) arguments.get(LOGIN);
                Toast.makeText(this, loginDto.getLogin(), Toast.LENGTH_SHORT).show();
            }
            if (loginDto != null && (!loginDto.getLogin().equals(login.getText().toString()) || !loginDto.getHaslo().equals(pwd.getText().toString()))){
                Toast.makeText(this, "Login lub hasło podany niepoprawnie", Toast.LENGTH_SHORT).show();
            } else  {
                Toast.makeText(this, "Ok", Toast.LENGTH_SHORT).show();
            }
        });

    }


}