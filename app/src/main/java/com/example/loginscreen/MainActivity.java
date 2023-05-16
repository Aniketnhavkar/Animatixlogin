package com.example.loginscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText Email=(EditText)  findViewById(R.id.email);
         MaterialButton regbtn =(MaterialButton) findViewById(R.id.signupbtn);


         regbtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String Email1 =Email.getText().toString();
                 Toast.makeText(MainActivity.this, "Successfully done "+Email1, Toast.LENGTH_SHORT).show();

             }
         });
    }
}