package com.arnl.geeo.arnl;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Spinner pageTypeSpn = (Spinner) findViewById(R.id.pageTypeSpn);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.pageType, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        pageTypeSpn.setAdapter(adapter);

        CheckBox musicOnOffChb= findViewById(R.id.musicOnOffChb);
        musicOnOffChb.setOnCheckedChangeListener((compoundButton, b)->{

            if(b){

                Log.i("Checked","checked");
            }
            else{

                Log.i("Checked","Not Checked");
            }
        });

        Button backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(e->{

            Intent mainIntent = new Intent(SettingsActivity.this, MainActivity.class);
            mainIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(mainIntent);
        });


    }

}
