package com.JDHCreations.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView ViewResult;
    private Button Btncero;
    private Button Btnuno;
    private Button Btndos;
    private Button Btntres;
    private Button Btncuatro;
    private Button Btncinco;
    private Button Btnseis;
    private Button Btnsiete;
    private Button Btnocho;
    private Button Btnnueve;
    private Button Btnlimpiar;
    private Button Btnmas;
    private Button Btnmenos;
    private Button Btnpor;
    private Button Btndividir;
    private Button Btnborrar;
    private Button Btnpunto;
    private Button Btnigual;

    private ExpresionRegular expresionRegular;


    private boolean clickMas;
    private boolean clickMenos;
    private boolean clickDividir;
    private boolean clickPor;
    private boolean clickPunto;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expresionRegular = new ExpresionRegular();

        ViewResult = findViewById(R.id.resultView);
        ViewResult.setFocusable(true);
        ViewResult.setFocusableInTouchMode(true);
        ViewResult.setInputType(InputType.TYPE_NULL);

        Btncero = findViewById(R.id.ceroBtn);
        Btncero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String txtAnterior = ViewResult.getText().toString();
                ViewResult.setText(txtAnterior + "0");
                otrasAcciones(R.id.ceroBtn);
            }
        });

        Btnuno = findViewById(R.id.unoBtn);
        Btnuno.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String txtAnterior = ViewResult.getText().toString();
                ViewResult.setText(txtAnterior + "1");
                otrasAcciones(R.id.unoBtn);
            }
        });

        Btndos = findViewById(R.id.dosBtn);
        Btndos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String txtAnterior = ViewResult.getText().toString();
                ViewResult.setText(txtAnterior + "2");
                otrasAcciones(R.id.dosBtn);
            }
        });

        Btntres = findViewById(R.id.tresBtn);
        Btntres.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String txtAnterior = ViewResult.getText().toString();
                ViewResult.setText(txtAnterior + "3");
                otrasAcciones(R.id.tresBtn);
            }
        });

        Btncuatro = findViewById(R.id.cuatroBtn);
        Btncuatro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String txtAnterior = ViewResult.getText().toString();
                ViewResult.setText(txtAnterior + "4");
                otrasAcciones(R.id.cuatroBtn);
            }
        });

        Btncinco = findViewById(R.id.cincoBtn);
        Btncinco.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String txtAnterior = ViewResult.getText().toString();
                ViewResult.setText(txtAnterior + "5");
                otrasAcciones(R.id.cincoBtn);
            }
        });

        Btnseis = findViewById(R.id.seisBtn);
        Btnseis.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String txtAnterior = ViewResult.getText().toString();
                ViewResult.setText(txtAnterior + "6");
                otrasAcciones(R.id.seisBtn);
            }
        });

        Btnsiete = findViewById(R.id.sieteBtn);
        Btnsiete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String txtAnterior = ViewResult.getText().toString();
                ViewResult.setText(txtAnterior + "7");
                otrasAcciones(R.id.sieteBtn);
            }
        });

        Btnocho = findViewById(R.id.ochoBtn);
        Btnocho.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String txtAnterior = ViewResult.getText().toString();
                ViewResult.setText(txtAnterior + "8");
                otrasAcciones(R.id.ochoBtn);
            }
        });

        Btnnueve = findViewById(R.id.nueveBtn);
        Btnnueve.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String txtAnterior = ViewResult.getText().toString();
                ViewResult.setText(txtAnterior + "9");
                otrasAcciones(R.id.nueveBtn);
            }
        });

        Btnlimpiar = findViewById(R.id.limpiarBtn);
        Btnlimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewResult.setText("");
                otrasAcciones(R.id.limpiarBtn);
            }
        });

        Btnmas = findViewById(R.id.masBtn);
        Btnmas.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String txtAnterior = ViewResult.getText().toString();
                if(txtAnterior.trim().length() > 0 && clickMas == false){
                    if(txtAnterior.endsWith("*")
                            ||txtAnterior.endsWith("/")
                            ||txtAnterior.endsWith("-")){
                        txtAnterior = txtAnterior.substring(0, txtAnterior.length() - 1);
                        ViewResult.setText(txtAnterior);
                    }
                    ViewResult.setText(txtAnterior + "+");
                    clickMas = true;
                    otrasAcciones(R.id.masBtn);
                }

            }
        });

        Btnmenos = findViewById(R.id.menosBtn);
        Btnmenos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String txtAnterior = ViewResult.getText().toString();
                if(clickMenos == false){
                    if(txtAnterior.endsWith("*")
                            ||txtAnterior.endsWith("/")
                            ||txtAnterior.endsWith("+")){
                        txtAnterior = txtAnterior.substring(0, txtAnterior.length() - 1);
                        ViewResult.setText(txtAnterior);
                    }
                    ViewResult.setText(txtAnterior + "-");
                    clickMenos = true;
                    otrasAcciones(R.id.menosBtn);
                }
            }
        });

        Btndividir = findViewById(R.id.dividirBtn);
        Btndividir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String txtAnterior = ViewResult.getText().toString();
                if(txtAnterior.trim().length() > 0 && clickDividir == false){
                    if(txtAnterior.endsWith("*")
                            ||txtAnterior.endsWith("+")
                            ||txtAnterior.endsWith("-")){
                        txtAnterior = txtAnterior.substring(0, txtAnterior.length() - 1);
                        ViewResult.setText(txtAnterior);
                    }
                    ViewResult.setText(txtAnterior + "/");
                    clickDividir = true;
                    otrasAcciones(R.id.dividirBtn);
                }

            }
        });

        Btnpor = findViewById(R.id.porBtn);
        Btnpor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String txtAnterior = ViewResult.getText().toString();
                if(txtAnterior.trim().length() > 0 && clickPor == false){
                    if(txtAnterior.endsWith("+")
                            ||txtAnterior.endsWith("/")
                            ||txtAnterior.endsWith("-")){
                        txtAnterior = txtAnterior.substring(0, txtAnterior.length() - 1);
                        ViewResult.setText(txtAnterior);
                    }
                    ViewResult.setText(txtAnterior + "*");
                    clickPor = true;
                    otrasAcciones(R.id.porBtn);
                }
            }
        });

        Btnborrar = findViewById(R.id.borrarBtn);
        Btnborrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtAnterior = ViewResult.getText().toString();
                if(txtAnterior.length() > 0) {
                    String nuevaOperacion = txtAnterior.substring(0, txtAnterior.length() - 1);
                    ViewResult.setText(nuevaOperacion);
                }

                otrasAcciones(R.id.borrarBtn);
            }
        });

        Btnpunto = findViewById(R.id.puntoBtn);
        Btnpunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtAnterior = ViewResult.getText().toString();

                if(clickPunto == false){
                    ViewResult.setText(txtAnterior + ".");
                    clickPunto = true;
                    otrasAcciones(R.id.puntoBtn);
                }
            }
        });

        Btnigual = findViewById(R.id.igualBtn);
        Btnigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtAnterior = ViewResult.getText().toString();

                if(txtAnterior.trim().length() > 0){
                    String resultado = expresionRegular.resolverFormula(txtAnterior.trim());
                    ViewResult.setText(resultado);
                }
            }
        });

    }

    private void otrasAcciones(int idBotonActual){

        if (idBotonActual != R.id.masBtn){
            clickMas = false;
        }

        if(idBotonActual != R.id.menosBtn){
            clickMenos =  false;
        }

        if(idBotonActual != R.id.porBtn){
            clickPor =  false;
        }

        if(idBotonActual != R.id.dividirBtn){
            clickDividir =  false;
        }

        if(idBotonActual != R.id.masBtn
                ||idBotonActual != R.id.menosBtn
                ||idBotonActual != R.id.porBtn
                ||idBotonActual != R.id.dividirBtn){
            clickPunto =  false;
        }
    }


}