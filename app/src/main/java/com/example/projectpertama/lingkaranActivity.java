package com.example.projectpertama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class lingkaranActivity extends AppCompatActivity {
    EditText jarilingkaran;
    TextView hasil, rumus, penjelasan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        jarilingkaran = findViewById(R.id.jarilingkaran);
        hasil = findViewById(R.id.txthasil);
        rumus = findViewById(R.id.txtrumus);
        penjelasan = findViewById(R.id.txtpenjelasan);
    }

    public void tombolhitung(View view) {
        String inputjarilingkaran = jarilingkaran.getText().toString();

        if (TextUtils.isEmpty(inputjarilingkaran)) {
            jarilingkaran.setError("Jari-jari lingkaran Harus Di Isi");
            jarilingkaran.requestFocus();
        }else {
            Double nilaijarilingkaran = Double.parseDouble(inputjarilingkaran);
            Double hasilhitung = 3.14 * nilaijarilingkaran * nilaijarilingkaran;
            rumus.setText("Luas Lingkaran = 3.14 x r x r");
            penjelasan.setText("3.14 x " + inputjarilingkaran + " x " + inputjarilingkaran + " =");
            hasil.setText(hasilhitung.toString());
        }
    }
}
