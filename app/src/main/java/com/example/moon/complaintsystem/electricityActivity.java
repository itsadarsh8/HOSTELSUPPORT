package com.example.moon.complaintsystem;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.moon.complaintsystem.MainActivity.electricity;
import static com.example.moon.complaintsystem.MainActivity.userNameDataBase;
import static com.example.moon.complaintsystem.MainActivity.userRoomDataBase;


public class electricityActivity extends AppCompatActivity {
    EditText userComplaint,userName,userRoom;

    static SharedPreferences prefs;

    public void pendingStatus(View view){

        Intent myIntent=new Intent(this,pending_request.class);
        startActivity(myIntent);


    }


    public void onClick(View view){

           try {
            InputMethodManager inputManager = (InputMethodManager)
                    getSystemService(Context.INPUT_METHOD_SERVICE);

            inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                    InputMethodManager.HIDE_NOT_ALWAYS);
        }
        catch(Exception e){

        }



        if(userComplaint.getText().toString().equals("")||userRoom.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Please enter a valid complaint", Toast.LENGTH_SHORT).show();


        }
        else if(userComplaint.getText().toString().equals(prefs.getString("ElectricityComplaint",null))){
            Toast.makeText(getApplicationContext(), "Already Registered", Toast.LENGTH_SHORT).show();

        }

        else{

            String enteredComplaint = userComplaint.getText().toString();
            Toast.makeText(getApplicationContext(), "Complaint Registered Successfully", Toast.LENGTH_SHORT).show();
            prefs.edit().putString("ElectricityComplaint", enteredComplaint).apply();
            //displayText.setText("Your Registered Complaint - " + enteredComplaint);
            electricity.setValue(enteredComplaint);
          //  userRoomDataBase.setValue(userPhone.getText().toString());

        }


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electricity);
        userComplaint=(EditText)findViewById(R.id.userComplaint);
        userName=(EditText)findViewById(R.id.userName);
        userRoom=(EditText)findViewById(R.id.userPhone);


        prefs = getSharedPreferences("com.example.moon.complaintsystem", MODE_PRIVATE);
      //  displayText.setText("Your Registered Complaint - "+prefs.getString("ElectricityComplaint","No Complaints registered"));

    }
}
