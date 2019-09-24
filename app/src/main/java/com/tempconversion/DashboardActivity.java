package com.tempconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnCalc, btnSi, btnTemp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnCalc=findViewById(R.id.btnCalc);
        btnSi=findViewById(R.id.btnSi);
        btnTemp=findViewById(R.id.btnTemp);

        btnCalc.setOnClickListener(this);
        btnSi.setOnClickListener(this);
        btnTemp.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnCalc){
            Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
            new MainActivity(intent);
        }
    }
}
