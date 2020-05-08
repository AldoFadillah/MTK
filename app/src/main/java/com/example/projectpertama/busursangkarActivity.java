package com.example.projectpertama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class busursangkarActivity extends AppCompatActivity {
    EditText sisi;
    TextView hasil, rumus, penjelasan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busursangkar);
        sisi = findViewById(R.id.sisi);
        hasil = findViewById(R.id.txthasil);
        rumus = findViewById(R.id.txtrumus);
        penjelasan = findViewById(R.id.txtpenjelasan);
    }

    public void tombolhitung(View view) {
        String inputsisi = sisi.getText().toString();

        if (TextUtils.isEmpty(inputsisi)) {
            sisi.setError("Sisi Harus Di Isi");
            sisi.requestFocus();
        } else {
            Double nilaisisi = Double.parseDouble(inputsisi);
            Double hasilhitung = nilaisisi * nilaisisi;
            rumus.setText("Luas Bujur Sangkar = Sisi x Sisi");
            penjelasan.setText(inputsisi + " x " + inputsisi + " =");
            hasil.setText(hasilhitung.toString());
        }
    }
}
