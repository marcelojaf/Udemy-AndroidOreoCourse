package com.example.exampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view){
        EditText txtName = (EditText) findViewById(R.id.txtLogin);
        EditText txtPassword = (EditText) findViewById(R.id.txtPassword);

        Log.i("Login", txtName.getText().toString());
        Log.i("Password", txtPassword.getText().toString());

        Toast.makeText(this, "Testing Toast!", Toast.LENGTH_SHORT).show();
    }
}