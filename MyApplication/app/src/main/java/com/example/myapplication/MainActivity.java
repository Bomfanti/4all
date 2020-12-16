package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.sql.Timestamp;


public class MainActivity extends AppCompatActivity {

    View screenView;
    Button clickMe;
    int[] color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        color = new int[] {Color.WHITE, Color.BLACK, Color.BLUE, Color.GREEN, Color.YELLOW, Color.RED, Color.CYAN, Color.YELLOW, Color.GRAY, Color.MAGENTA};

        screenView = findViewById(R.id.rView);
        clickMe= (Button) findViewById(R.id.button);




        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int aryLength = color.length;
                Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                int var = (int) timestamp.getTime();
                var = Math.abs(var % 10);
                int finalVar = var;
                int finalVar1 = var;

               
                //int rNum = random.nextInt(aryLength);
                //int rNum = 0;
                System.out.println("var="+ finalVar1);
                screenView.setBackgroundColor(color[finalVar]);
            }
        });
    }


}