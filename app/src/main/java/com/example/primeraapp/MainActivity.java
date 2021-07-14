package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText e1,e2;
    private TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Toast.makeText(this,"hola",Toast.LENGTH_LONG).show();


        e1=findViewById(R.id.edit1);
        e2=findViewById(R.id.edit2);
        t1=findViewById(R.id.text1);

}


    public void sumar(View v) {
        int valor1=Integer.parseInt(e1.getText().toString());
        int valor2=Integer.parseInt(e2.getText().toString());

        int suma=valor1+valor2;

        t1.setText("La suma es:" +suma);
    }
}
