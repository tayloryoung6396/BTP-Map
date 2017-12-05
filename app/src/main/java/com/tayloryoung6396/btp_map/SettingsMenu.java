package com.tayloryoung6396.btp_map;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Switch;

import com.example.BTPMap.R;

public class SettingsMenu extends AppCompatActivity {

    //Public Switch Switch1;
    Switch switch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_menu);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();


        //String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        // Capture the layout's TextView and set the string as its text
        //TextView textView = findViewById(R.id.textView);
        //textView.setText(message);


        String statesw1 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE1);
        Switch1Value = Boolean.valueOf(statesw1);

        boolean currentstatesw1 = switch1.isChecked();
        if(Switch1Value && !currentstatesw1){
            Switch1Value = !Switch1Value;
        }
        else if(!Switch1Value && currentstatesw1){
            Switch1Value = !Switch1Value;
        }


        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    /** The boolean I'll save in a bundle when a state change happens */
    public boolean Switch1Value;

    /**@Override
    public void onSaveInstanceState(@NonNull Bundle savedInstanceState) {
    super.onSaveInstanceState(savedInstanceState);
    SharedPreferences mSharedPreferencesManager = PreferenceManager.getDefaultSharedPreferences(this);
    Switch1Value = mSharedPreferencesManager.getBoolean("switch1", false);
    savedInstanceState.putBoolean("mySwitch1", Switch1Value);
    }

     @Override
     public void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
     super.onRestoreInstanceState(savedInstanceState);
     Switch1Value = savedInstanceState.getBoolean("mySwitch1");
     }

     @Override
     protected void onResume() {
     super.onResume();
     SharedPreferences mSharedPreferencesManager = PreferenceManager.getDefaultSharedPreferences(this);
     Switch1Value = mSharedPreferencesManager.getBoolean("switch1", false);

     }*/


}
