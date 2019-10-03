package com.example.moon.complaintsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import static com.example.moon.complaintsystem.electricityActivity.prefs;
import static com.example.moon.complaintsystem.welcome_screen.electricity;
import static com.example.moon.complaintsystem.welcome_screen.userPanel;

public class pending_request extends AppCompatActivity {
    static TextView displayText;

    public void cancelB(View view){
        userPanel.child("electricity").removeValue();
        displayText.setText("");
        prefs.edit().putString("ElectricityComplaint", "No Complaints registered").apply();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pending_request);

        displayText=findViewById(R.id.displayText);


        displayText.setText(prefs.getString("ElectricityComplaint","No Complaints registered"));
    }
}
