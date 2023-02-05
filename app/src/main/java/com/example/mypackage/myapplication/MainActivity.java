package com.example.mypackage.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SeekBar simpleSeekBar;
    static int progressChangedValue = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // initiate  views
        simpleSeekBar=findViewById(R.id.simpleSeekBar);
        // perform seek bar change listener event used for getting the progress value
        simpleSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {



            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
               // progressChangedValue = progress;
                Toast.makeText(MainActivity.this, "Seek bar progress is :" + progress + 5,
                        Toast.LENGTH_SHORT).show();
                simpleSeekBar.setProgress(progressChangedValue );
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
               // Toast.makeText(MainActivity.this, "Seek bar progress is :" + progressChangedValue,
                 //       Toast.LENGTH_SHORT).show();
            }
        });

    }


}

