package com.example.services;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import Service.service;

public class MainActivity extends AppCompatActivity {
    private Button btnstart, btnstop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnstart=findViewById(R.id.btnstart);
        btnstop=findViewById(R.id.btnstop);

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMyService();

            }
        });

        btnstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopMyService();
            }
        });

    }

    private void startMyService() {
        startMyService(new Intent(this, service.class));
    }

    private void stopMyService() {
        stopMyService(new Intent(this, service.class));
    }


}
