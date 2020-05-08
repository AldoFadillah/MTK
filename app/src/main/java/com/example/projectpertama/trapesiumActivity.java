package com.example.projectpertama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class trapesiumActivity extends AppCompatActivity {
    EditText panjangsisix,panjangsisiy, tinggi;
    TextView hasil, rumus, penjelasan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapesium);
        panjangsisix = findViewById(R.id.panjangsisix);
        panjangsisiy = findViewById(R.id.panjangsisiy);
        tinggi = findViewById(R.id.tinggi);
        hasil = findViewById(R.id.txthasil);
        rumus = findViewById(R.id.txtrumus);
        penjelasan = findViewById(R.id.txtpenjelasan);
    }

    public void tombolhitung(View view) {
        String inputpanjangsisix = panjangsisix.getText().toString();
        String inputpanjangsisiy = panjangsisiy.getText().toString();
        String inputtinggi = tinggi.getText().toString();

        if (TextUtils.isEmpty(inputpanjangsisix)) {
            panjangsisix.setError("panjangsisix Harus Di Isi");
            panjangsisix.requestFocus();
        }
        else if (TextUtils.isEmpty(inputpanjangsisiy)) {
            panjangsisiy.setError("panjangsisiy Harus Di Isi");
            panjangsisiy.requestFocus();
        }else if (TextUtils.isEmpty(inputtinggi)) {
            tinggi.setError("Tinggi Harus Di Isi");
            tinggi.requestFocus();
        } else {
            Double nilaipanjangsisix = Double.parseDouble(inputpanjangsisix);
            Double nilaipanjangsisiy = Double.parseDouble(inputpanjangsisiy);
            Double nilaitinggi = Double.parseDouble(inputtinggi);
            Double hasilhitung = ((nilaipanjangsisix + nilaipanjangsisiy) * nilaitinggi) / 2;
            rumus.setText("Luas Trapesium = ((panjangsisix + panjangsisiy) × tinggi) / 2");
            penjelasan.setText("((panjangsisix " + inputpanjangsisix + " + panjangsisiy " + inputpanjangsisiy + ") x tinggi "+inputtinggi+") /2 =");
            hasil.setText(hasilhitung.toString());
        }
    }
}
