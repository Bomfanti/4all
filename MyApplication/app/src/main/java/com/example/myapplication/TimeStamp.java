package com.example.myapplication;


import android.graphics.Color;
import android.view.View;

import java.sql.Timestamp;
import java.time.Instant;

public class TimeStamp {

    private static View YourView;

    public static void main(String[] args) {

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp.getTime());
        int var = (int) timestamp.getTime();   // ta dizendo que tem errro mas parece que deu certo ué
        //System.out.println("var="+var);
        var = Math.abs(var % 10);
        System.out.println("var="+var);   //VAMO PORRA

        switch(var){
            case 1:
                YourView.setBackgroundColor(Color.argb(255, 255, 0, 0));
                break;
            case 2:
                YourView.setBackgroundColor(Color.argb(255, 0, 255, 0));
                break;
            case 3:
                YourView.setBackgroundColor(Color.argb(250, 0, 0, 255));
                break;
        }
    }
}