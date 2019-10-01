package com.example.moon.complaintsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class LoginScreen extends AppCompatActivity {

    String default_username = "admin";
    String default_password = "admin";
    EditText username,password;

    public void loginButton(View view){

        if (username.getText().toString().equals(default_username)) {
            if (password.getText().toString().equals(default_password)) {
                Intent i = new Intent(getBaseContext(), MainActivity.class);
                startActivity(i);

            } else {
                Toast.makeText(getApplicationContext(), "Invalid Password", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(getApplicationContext(), "Invalid Username", Toast.LENGTH_SHORT).show();
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

         username = findViewById(R.id.username);
         password = findViewById(R.id.password);





        }
    }

