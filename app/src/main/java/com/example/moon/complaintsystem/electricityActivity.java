package com.example.moon.complaintsystem;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.moon.complaintsystem.welcome_screen.electricity;
import static com.example.moon.complaintsystem.welcome_screen.userAdmissionNumber;
import static com.example.moon.complaintsystem.welcome_screen.userPanel;
import static com.example.moon.complaintsystem.welcome_screen.userPhoneDataBase;


public class electricityActivity extends AppCompatActivity {
    EditText userComplaint,userPhone;

    static SharedPreferences prefs;

    public void pendingStatus(View view){

        Intent myIntent=new Intent(this,pending_request.class);
        startActivity(myIntent);


    }


    public void onClick(View view){

        if(userComplaint.getText().toString().equals("")||userPhone.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Please enter a valid complaint", Toast.LENGTH_SHORT).show();


        }
        else if(userComplaint.getText().toString().equals(prefs.getString("ElectricityComplaint",null))){
            Toast.makeText(getApplicationContext(), "Already Registered", Toast.LENGTH_SHORT).show();

        }

        else{

            String enteredComplaint = userComplaint.getText().toString();
            Toast.makeText(getApplicationContext(), "Complaint Registered Successfully", Toast.LENGTH_SHORT).show();
            prefs.edit().putString("ElectricityComplaint", enteredComplaint).apply();
            userPanel.child("electricity").setValue(enteredComplaint);
            userPanel.child("Phone Number").setValue(userPhone.getText().toString());


        }


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electricity);
        userComplaint=(EditText)findViewById(R.id.userComplaint);
        userPhone=(EditText)findViewById(R.id.userPhone);


        prefs = getSharedPreferences("com.example.moon.complaintsystem", MODE_PRIVATE);


    }
}
