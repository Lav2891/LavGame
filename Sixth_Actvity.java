package com.example.ashwin.lavgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ashwin on 8/31/2017.
 */

public class Sixth_Actvity extends AppCompatActivity {
    TextView t1;
    ImageView i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sixth_main);


        method();
    }

    void method(){
        t1=(TextView)findViewById(R.id.textview2);
        t1.setText("CRAZY");

        i=(ImageView)findViewById(R.id.imgvw);
        i.setImageResource(R.drawable.crazy2);

    }


}

