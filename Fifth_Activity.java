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

public class Fifth_Activity extends AppCompatActivity {
    TextView t1;

    Button b1;
    TextView t2;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifth_main);


        method();
    }

    void method(){
        t1=(TextView)findViewById(R.id.textview2);
        t1.setText("You're just one step away from knowing your personality!!");


        b1=(Button)findViewById(R.id.nextbutton);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=new Intent(Fifth_Activity.this,Sixth_Actvity.class);
                startActivity(i);

            }
        });



    }


}
