package com.example.modul1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class MainActivity2 extends AppCompatActivity {
    private EditText Angka1;
    private EditText Angka2;
    private  EditText Hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        Angka1 = findViewById(R.id.Etext1);
        Angka2 = findViewById(R.id.Etext2);
        Hasil = findViewById(R.id.Etext3);

        Button BtnTambah = findViewById(R.id.Btn1);
        Button BtnKali = findViewById(R.id.btn2);
        Button BtnKurang = findViewById(R.id.Btn3);
        Button BtnBagi = findViewById(R.id.Btn4);
        Button Hapus = findViewById(R.id.BtnClear);

        BtnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung("+");
            }
        });

        BtnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung("-");
            }
        });
        BtnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung("*");
            }
        });
        BtnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 hitung("/");
            }
        });
        Hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Angka1.setText("");
                Angka2.setText("");
                Hasil.setText("");
            }
        });



    }
    private void hitung(String operator){

        double Bil1 = Double.parseDouble(Angka1.getText().toString());
        double Bil2 = Double.parseDouble(Angka2.getText().toString());
        double hasil = 0;

        switch (operator){

            case "+":
                hasil = Bil1 + Bil2;
                break;
            case "-":
                hasil = Bil1 - Bil2;
                break;
            case "*":
                hasil = Bil1 * Bil2;
                break;
            case "/":
                hasil = Bil1 / Bil2;
                break;



        }
        String Format;

        if(hasil==(int)hasil){

            Format = String.valueOf((int)hasil);

        }else {
            Format = new DecimalFormat("#.####").format(hasil);
        }
       Hasil.setText(Format);



    }




}