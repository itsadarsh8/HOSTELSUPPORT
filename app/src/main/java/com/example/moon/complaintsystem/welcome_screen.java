package com.example.moon.complaintsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class welcome_screen extends AppCompatActivity {

    static FirebaseDatabase database;
    static  DatabaseReference furniture,sanitary,laundry,electricity,mess,others,userPhoneDataBase,userPanel,userAdmissionNumber;
    static CardView sanitaryButton,messButton,laundryButton,furnitureButton,otherButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        database = FirebaseDatabase.getInstance();

        furniture = database.getReference("furniture");
        sanitary = database.getReference("sanitary");
        laundry = database.getReference("laundry");
        electricity= database.getReference("electricity");
        mess = database.getReference("mess");
        others=database.getReference("other complaints");

        userPanel = database.getReference("User Panel");
        userPhoneDataBase=database.getReference("Student PhoneNo: ");



        sanitaryButton=(CardView)findViewById(R.id.sanitaryButton);
        messButton=(CardView)findViewById(R.id.messButton);
        laundryButton=(CardView)findViewById(R.id.laundaryButton);
        furnitureButton=(CardView)findViewById(R.id.furnitureButton);
        otherButton=(CardView)findViewById(R.id.otherButton);



        Thread background = new Thread() {
            public void run() {
                try {
                    // Thread will sleep for 5 seconds
                    sleep(2*1000);

                    // After 5 seconds redirect to another intent
                    Intent i=new Intent(getBaseContext(),LoginScreen.class);
                    startActivity(i);

                    //Remove activity
                    finish();
                } catch (Exception e) {
                }
            }
        };
        // start thread
        background.start();
//
    }
}
