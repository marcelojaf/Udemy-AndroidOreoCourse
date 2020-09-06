package com.example.exampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtName = (EditText) findViewById(R.id.txtLogin);
    private EditText txtPassword = (EditText) findViewById(R.id.txtPassword);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view){
        Log.i("Login", txtName.getText().toString());
        Log.i("Password", txtPassword.getText().toString());
    }
}