package com.example.moon.complaintsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import static com.example.moon.complaintsystem.welcome_screen.userPanel;



public class LoginScreen extends AppCompatActivity {
    EditText username,password;
    String usernameTemp;

   public void loginButton(View view){

       usernameTemp=username.getText().toString();


        if (usernameTemp.equals(password.getText().toString())) {

                Intent i = new Intent(getBaseContext(), MainActivity.class);
                startActivity(i);
                String AdmissionNumber= username.getText().toString();
                userPanel.child("Admission Number").setValue(AdmissionNumber);
        }

        else {
            Toast.makeText(getApplicationContext(), "Invalid Username or Password", Toast.LENGTH_SHORT).show();
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

