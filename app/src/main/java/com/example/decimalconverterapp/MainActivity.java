package com.example.decimalconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void binaryView(View view) {
            Intent intent = new Intent(this, binary.class);
            startActivity(intent);
        }
//
        public void hexView(View view){
            Intent intent = new Intent (this, hexadecimal.class);
            startActivity(intent);
        }
        public void octaView(View view){
            Intent intent = new Intent (this, octal.class);
            startActivity(intent);
        }


}