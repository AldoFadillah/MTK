package com.example.projectpertama;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void persegipanjang(View view) {
        final AlertDialog.Builder persegipanjangalert = new AlertDialog.Builder(MainActivity.this);
        persegipanjangalert.setMessage("Apakah anda yakin ingin menghitung luas Persegi Panjang");
        persegipanjangalert.setPositiveButton("ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(MainActivity.this, PersegiPanjangActivity.class));
            }
        });
        persegipanjangalert.setNegativeButton("tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                dialogInterface.cancel();
            }
        });
        persegipanjangalert.show();
    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder tombolkeluar = new AlertDialog.Builder(MainActivity.this);
        tombolkeluar.setMessage("Apakah Anda Yakin Ingin Keluar Dari Aplikasi ini?");
        tombolkeluar.setTitle("Keluar Aplikasi");
        tombolkeluar.setIcon(R.drawable.exit);
        tombolkeluar.setPositiveButton("ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                MainActivity.this.finish();
            }
        });
        tombolkeluar.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        tombolkeluar.setNeutralButton("Batal", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        tombolkeluar.show();
    }

    public void busursangkar(View view) {
        final AlertDialog.Builder busursangkaralert = new AlertDialog.Builder(MainActivity.this);
        busursangkaralert.setMessage("Apakah anda yakin ingin menghitung luas bujur sangkar");
        busursangkaralert.setPositiveButton("ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(MainActivity.this, busursangkarActivity.class));
            }
        });
        busursangkaralert.setNegativeButton("tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                dialogInterface.cancel();
            }
        });
        busursangkaralert.show();
    }

    public void segitiga(View view) {
        final AlertDialog.Builder segitigaalert = new AlertDialog.Builder(MainActivity.this);
        segitigaalert.setMessage("Apakah anda yakin ingin menghitung luas segitiga");
        segitigaalert.setPositiveButton("ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(MainActivity.this, segitigaActivity.class));
            }
        });
        segitigaalert.setNegativeButton("tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                dialogInterface.cancel();
            }
        });
        segitigaalert.show();
    }

    public void lingkaran(View view) {
        final AlertDialog.Builder lingkaranalert = new AlertDialog.Builder(MainActivity.this);
        lingkaranalert.setMessage("Apakah anda yakin ingin menghitung luas lingkaran");
        lingkaranalert.setPositiveButton("ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(MainActivity.this, lingkaranActivity.class));
            }
        });
        lingkaranalert.setNegativeButton("tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                dialogInterface.cancel();
            }
        });
        lingkaranalert.show();
    }

    public void jajargenjang(View view) {
        final AlertDialog.Builder jajargenjangalert = new AlertDialog.Builder(MainActivity.this);
        jajargenjangalert.setMessage("Apakah anda yakin ingin menghitung luas jajar genjang");
        jajargenjangalert.setPositiveButton("ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(MainActivity.this, jajargenjangActivity.class));
            }
        });
        jajargenjangalert.setNegativeButton("tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                dialogInterface.cancel();
            }
        });
        jajargenjangalert.show();
    }

    public void trapesium(View view) {
        final AlertDialog.Builder trapesiumalert = new AlertDialog.Builder(MainActivity.this);
        trapesiumalert.setMessage("Apakah anda yakin ingin menghitung luas trapesium");
        trapesiumalert.setPositiveButton("ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(MainActivity.this, trapesiumActivity.class));
            }
        });
        trapesiumalert.setNegativeButton("tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                dialogInterface.cancel();
            }
        });
        trapesiumalert.show();
    }
}
