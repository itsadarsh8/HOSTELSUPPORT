package com.example.moon.complaintsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    public void electricityButton(View view){
        Intent myIntent=new Intent(MainActivity.this,electricityActivity.class);
        startActivity(myIntent);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





}

}
