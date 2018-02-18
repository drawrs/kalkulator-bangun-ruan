package com.khilman.www.hitungbangundatar;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Deklarasi Widget
    Button btnHitung;
    EditText etNilaiAlas;
    EditText etNilaiTnggi;
    TextView tvHasilHitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Inisialisasi Widget
        btnHitung = (Button) findViewById(R.id.btnHitung);
        etNilaiAlas = (EditText) findViewById(R.id.etNilaiAlas);
        etNilaiTnggi = (EditText) findViewById(R.id.etNilaiTinggi);
        tvHasilHitung = (TextView) findViewById(R.id.tvHasilHitung);

        // Event untuk btnHitung
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Kita mau apa -- perintah yang akan di eksekusi/jalankan
                // Pastikan nilai alas dan tinggi tidak NULL/KOSONG
                if (!etNilaiAlas.getText().toString().isEmpty() && !etNilaiTnggi.getText().toString().isEmpty()){ // proses hitung hanya akan di jalankan ketika tidak NULL/kosong
                    // Dapatkan nilai dari EditText -> Convert ke tipe data Double
                    Double nilai_alas = Double.parseDouble(etNilaiAlas.getText().toString());
                    Double nilai_tinggi = Double.parseDouble(etNilaiTnggi.getText().toString());
                    // Hitung 1/2 * (alas/tinggi)
                    Double hasil_hitung = ( 0.5 *nilai_alas ) *nilai_tinggi;
                    // Set ke text view hasil hitung
                    tvHasilHitung.setText("Hasil hitung : " + hasil_hitung.toString());
                }

            }
        });

    }

    // Override method onCreateOptionsMenu

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO 1 : Panggil class MenuInflater
        MenuInflater inflater = getMenuInflater();
        // TODO 2 : Inflate menu
        inflater.inflate(R.menu.menu_utama, menu);
        return true;

    }
    // Handle menu click

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Cek id yg di klik itu apa sih ?

        // TODO 1 : Cek id dari menu yang di pilih
        if (item.getItemId() == R.id.menuAbout){
            // Kita ngapain (Aksi yang akan kita jalankan)
            // Tampilkan Alert dialog
            // TODO 1 : Panggil class Alert Dialog
            AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
            // TODO 2 : Set property sesuai keperluan
            alert.setTitle("About Application");
            alert.setMessage("Menghitung Bangun Datar - V.2.0 - Rizal Hilman");
            // TODO 3 : Tampilkan Alert dialog
            alert.show();


        } else if (item.getItemId() == R.id.menuExit) {
            // Kita ngapain (Aksi yang akan kita jalankan)
            System.exit(0);
        }

        return super.onOptionsItemSelected(item);
    }
}
