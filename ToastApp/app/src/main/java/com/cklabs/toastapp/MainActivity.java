package com.cklabs.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClickMe_Click(View view){
        EditText txtName = (EditText) findViewById(R.id.txtName);

        Toast.makeText(this, "Hello " + txtName.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}