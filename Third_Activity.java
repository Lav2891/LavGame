package com.example.ashwin.lavgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Created by Ashwin on 8/30/2017.
 */

public class Third_Activity extends AppCompatActivity {
    TextView t1;
    SeekBar sb1;
    Button b1;
    TextView t2;
    Intent i;
    //int a;
    //String b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_main);


        method();
    }

    void method(){
        t1=(TextView)findViewById(R.id.textview2);
        t1.setText("How sensitive are you?");

        sb1=(SeekBar)findViewById(R.id.seekbar1);
        sb1.setProgress(0);
        sb1.incrementProgressBy(1);
        sb1.setMax(10);
        //a = sb1.getProgress();
        //b = String.valueOf(a);

        sb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                t2=(TextView)findViewById(R.id.textview3);
                t2.setText(String.valueOf(progress));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        b1=(Button)findViewById(R.id.nextbutton);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=new Intent(Third_Activity.this,Fourth_Activity.class);
                startActivity(i);

            }
        });


    }


}

