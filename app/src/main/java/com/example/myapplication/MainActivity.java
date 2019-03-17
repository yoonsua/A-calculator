package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtresult;
    Button btnac, btnone, btntwo, btnthree, btnfour, btnfive, btnsix, btnseven, btneight, btnnine, btnzero, btnplus, btnminus, btnequal, btnmultiplication, btndivision, btnpersent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setViews();
    }

    private  void setViews() {
        txtresult = (TextView)findViewById(R.id.txtresult);
        btnac = (Button)findViewById(R.id.btnac);
        btnone = (Button)findViewById(R.id.btnone);
        btntwo = (Button)findViewById(R.id.btntwo);
        btnthree = (Button)findViewById(R.id.btnthree);
        btnfour = (Button)findViewById(R.id.btnfour);
        btnfive = (Button)findViewById(R.id.btnfive);
        btnsix = (Button)findViewById(R.id.btnsix);
        btnseven = (Button)findViewById(R.id.btnseven);
        btneight = (Button)findViewById(R.id.btneight);
        btnnine = (Button)findViewById(R.id.btnnine);
        btnzero = (Button)findViewById(R.id.btnzero);
        btnplus = (Button)findViewById(R.id.btnplus);
        btnminus = (Button)findViewById(R.id.btnminus);
        btnequal = (Button)findViewById(R.id.btnequal);
        btnmultiplication = (Button)findViewById(R.id.btnmultiplication);
        btndivision = (Button)findViewById(R.id.btndivision);
        btnpersent = (Button)findViewById(R.id.btnpersent);


        txtresult.setText("크하하하");
        btnac.setOnClickListener(this);
        btnone.setOnClickListener(this);
        btntwo.setOnClickListener(this);
        btnthree.setOnClickListener(this);
        btnfour.setOnClickListener(this);
        btnfive.setOnClickListener(this);
        btnsix.setOnClickListener(this);
        btnseven.setOnClickListener(this);
        btneight.setOnClickListener(this);
        btnnine.setOnClickListener(this);
        btnzero.setOnClickListener(this);
        btnplus.setOnClickListener(this);
        btnminus.setOnClickListener(this);
        btnequal.setOnClickListener(this);
        btnmultiplication.setOnClickListener(this);
        btndivision.setOnClickListener(this);
        btnpersent.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btnac:
                txtresult.setText("0");
                break;
            case R.id.btnone:
                txtresult.setText("1");
                break;
            case R.id.btntwo:
                txtresult.setText("2");
                break;
            case R.id.btnthree:
                txtresult.setText("3");
                break;
            case R.id.btnfour:
                txtresult.setText("4");
                break;
            case R.id.btnfive:
                txtresult.setText("5");
                break;
            case R.id.btnsix:
                txtresult.setText("6");
                break;
            case R.id.btnseven:
                txtresult.setText("7");
                break;
            case R.id.btneight:
                txtresult.setText("8");
                break;
            case R.id.btnnine:
                txtresult.setText("9");
                break;
            case R.id.btnplus:
                txtresult.setText("+");
                break;
            case R.id.btnminus:
                txtresult.setText("-");
                break;
            case R.id.btnequal:
                txtresult.setText("=");
                break;
            case R.id.btnmultiplication:
                txtresult.setText("X");
                break;
            case R.id.btnzero:
                txtresult.setText("0");
                break;
            case R.id.btndivision:
                txtresult.setText("/");
                break;
            case R.id.btnpersent:
                txtresult.setText("%");
                break;
        }
    }
}
