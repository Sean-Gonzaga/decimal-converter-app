package com.example.decimalconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class binary extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_binary);
        }

        public void backBtn(View view){
            Intent intent = new Intent (this, MainActivity.class);
            startActivity(intent);
        }

        public void binResult(View view){
            EditText TextBinary =(EditText)findViewById(R.id.editBin);
            int binCon =Integer.parseInt(TextBinary.getText().toString());
            String ConvertBinNow = Integer.toBinaryString(binCon);

            TextView Answer=(TextView)findViewById(R.id.binResult);
            Answer.setText(ConvertBinNow);
        }

}