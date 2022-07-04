package com.calculator.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String signo;
    private TextView tvista;
    private Button btnone;
    private Button btntwo;
    private Button btnthree;
    private Button btnfour;
    private Button btnfive;
    private Button btnsix;
    private Button btnseven;
    private Button btneigth;
    private Button btnnine;
    private Button btncero;
    private Button btnerase;
    private Button btnequals;
    private Button btnsum;
    private Button btnres;
    private Button btnmul;
    private Button btndiv;
    private Button btnpunt;
    public EditText mostrar;
    public Double resul = 0.0, num1, num2;
    public  boolean p = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boolean p = false;
        tvista=findViewById(R.id.vista);
        btnone=findViewById(R.id.uno);
        btnone.setOnClickListener(this);
        btntwo=findViewById(R.id.dos);
        btntwo.setOnClickListener(this);
        btnthree=findViewById(R.id.tres);
        btnthree.setOnClickListener(this);
        btnfour=findViewById(R.id.cuatro);
        btnfour.setOnClickListener(this);
        btnfive=findViewById(R.id.cinco);
        btnfive.setOnClickListener(this);
        btnsix=findViewById(R.id.seis);
        btnsix.setOnClickListener(this);
        btnseven=findViewById(R.id.siete);
        btnseven.setOnClickListener(this);
        btneigth=findViewById(R.id.ocho);
        btneigth.setOnClickListener(this);
        btnnine=findViewById(R.id.nueve);
        btnnine.setOnClickListener(this);
        btncero=findViewById(R.id.cero);
        btncero.setOnClickListener(this);
        btnerase=findViewById(R.id.borrar);
        btnerase.setOnClickListener(this);
        btndiv=findViewById(R.id.division);
        btndiv.setOnClickListener(this);
        btnmul=findViewById(R.id.mul);
        btnmul.setOnClickListener(this);
        btnres=findViewById(R.id.resta);
        btnres.setOnClickListener(this);
        btnsum=findViewById(R.id.suma);
        btnsum.setOnClickListener(this);
        btnequals=findViewById(R.id.igual);
        btnequals.setOnClickListener(this);
        btnpunt=findViewById(R.id.punto);
        btnpunt.setOnClickListener(this);




    }


    @Override
    public void onClick(View v) {
        String extra = tvista.getText().toString();
        if(v.getId() == R.id.uno){
            extra= extra +"1";
            tvista.setText(extra);
        }else if(v.getId() == R.id.dos){
            extra= extra +"2";
            tvista.setText(extra);
        }else if(v.getId() == R.id.tres){
            extra= extra +"3";
            tvista.setText(extra);
        }else if(v.getId() == R.id.cuatro){
            extra= extra +"4";
            tvista.setText(extra);
        }else if(v.getId() == R.id.cinco){
            extra= extra +"5";
            tvista.setText(extra);
        }else if(v.getId() == R.id.seis){
            extra= extra +"6";
            tvista.setText(extra);
        }else if(v.getId() == R.id.siete){
            extra= extra +"7";
            tvista.setText(extra);
        }else if(v.getId() == R.id.ocho){
            extra= extra +"8";
            tvista.setText(extra);
        }else if(v.getId() == R.id.nueve){
            extra= extra+"9";
            tvista.setText(extra);
        }else if(v.getId() == R.id.cero){
            extra= extra +"0";
            tvista.setText(extra);
        }else if(v.getId()== R.id.borrar){
            tvista.setText("");
        }else if(v.getId()== R.id.punto) {
                extra= extra + ".";
                tvista.setText(extra);
        }else if (v.getId() == R.id.igual){
            num2= Double.parseDouble(tvista.getText().toString());
            if (signo == "+"){
                resul = num1+num2;
                tvista.setText(String.valueOf(resul));
            }else if (signo == "-"){
                resul = num1-num2;
                tvista.setText(String.valueOf(resul));
            }else if (signo == "*"){
                resul = num1*num2;
                tvista.setText(String.valueOf(resul));
            }else {
                resul = num1/num2;
                tvista.setText(String.valueOf(resul));
            }

        }else if (v.getId() == R.id.suma){
             num1 = Double.parseDouble(extra);
             signo = "+";
            tvista.setText(" ");
        }
        else if (v.getId() == R.id.resta){
            num1 = Double.parseDouble(extra);
            signo = "-";
            tvista.setText(" ");
        }
        else if (v.getId() == R.id.mul){
            num1 = Double.parseDouble(tvista.getText().toString());
            signo = "*";
            tvista.setText(" ");
        }
        else if (v.getId() == R.id.division){
            num1 = Double.parseDouble(extra);
            signo = "/";
            tvista.setText(" ");
        }

                }
        }






