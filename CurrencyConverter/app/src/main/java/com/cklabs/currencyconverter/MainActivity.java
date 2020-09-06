package com.cklabs.currencyconverter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public double canadianAmount = 0.00;
    public double brazilianAmount = 0.00;
    public double rate = 4;

    public void btnConvert_Click(View view){
        EditText txtCanadianAmount = (EditText) findViewById(R.id.txtCanadianAmount);
        TextView txtBrazilianAmount = (TextView) findViewById(R.id.lblBrazilianAmount);

        canadianAmount = Double.parseDouble(txtCanadianAmount.getText().toString());
        brazilianAmount = canadianAmount * rate;
        txtBrazilianAmount.setText(String.format("%.2f", brazilianAmount));
    }
}