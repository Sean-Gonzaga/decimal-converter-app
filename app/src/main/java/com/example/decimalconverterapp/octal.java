package com.example.decimalconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class octal extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_octal);
        }

        public void backBtn(View view){
            Intent intent = new Intent (this, MainActivity.class);
            startActivity(intent);
        }

        public void octResult(View view) {
            EditText TextOcta = (EditText) findViewById(R.id.editOct);
            int OctaCon = Integer.parseInt(TextOcta.getText().toString());
            String ConvertOctaNow = Integer.toOctalString(OctaCon);

            TextView Answer = (TextView) findViewById(R.id.octResult);
            Answer.setText(ConvertOctaNow);
        }
}