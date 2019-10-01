package com.example.moon.complaintsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import static com.example.moon.complaintsystem.electricityActivity.prefs;

public class pending_request extends AppCompatActivity {
    static TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pending_request);

        displayText=(TextView)findViewById(R.id.displayText);


        displayText.setText(prefs.getString("ElectricityComplaint","No Complaints registered"));
    }
}
