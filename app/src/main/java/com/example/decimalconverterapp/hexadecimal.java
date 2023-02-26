package com.example.decimalconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class hexadecimal extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_hexadecimal);
        }

        public void backBtn(View view){
            Intent intent = new Intent (this, MainActivity.class);
            startActivity(intent);
        }

        public void hexResult(View view){
            EditText TextHex =(EditText)findViewById(R.id.editHex);
            int HexCon =Integer.parseInt(TextHex.getText().toString());
            String ConvertHexNow = Integer.toHexString(HexCon);

            TextView Answer=(TextView)findViewById(R.id.hexResult);
            Answer.setText(ConvertHexNow);
        }
}