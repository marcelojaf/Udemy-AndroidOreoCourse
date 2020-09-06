package com.cklabs.imagedemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean isShowingCat1 = true;

    public void btnSwitchCat_Click(View view){
        ImageView imgCat = (ImageView)findViewById(R.id.imgCat);

        if (isShowingCat1){
            isShowingCat1 = false;
            imgCat.setImageResource(R.drawable.cat2);
        } else {
            isShowingCat1 = true;
            imgCat.setImageResource(R.drawable.cat1);
        }

    }
}