package com.example.mynews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import static java.lang.Thread.sleep;

public class firstview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstview);
       final Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(1500);
                    Intent intent=new Intent(firstview.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });thread.start();
    }
}
