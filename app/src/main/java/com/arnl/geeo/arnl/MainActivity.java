package com.arnl.geeo.arnl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button chooseBookBtn = findViewById(R.id.chooseBookBtn);
        chooseBookBtn.setOnClickListener(e-> {

            Intent scrollingIntent = new Intent(this, LibraryActivity.class);
            scrollingIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(scrollingIntent);
        });

        Button settingsBtn = findViewById(R.id.settingsBtn);
        settingsBtn.setOnClickListener(e-> {

            Intent settingsIntent = new Intent(this, SettingsActivity.class);
            settingsIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(settingsIntent);
        });

        Button exitBtn = findViewById(R.id.exitBtn);
        exitBtn.setOnClickListener(e->{

            finishAndRemoveTask ();
            /*
            Intent homeIntent = new Intent(Intent.ACTION_MAIN);
            homeIntent.addCategory( Intent.CATEGORY_HOME );
            homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(homeIntent);
            */
        });


    }

}
