package com.khilman.www.hitungbangundatar;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Buat activity ini pindah setelah 3 detik
        // TODO 1 : Panggil Class Hander
        Handler hander = new Handler();
        // TODO 2 : gunakan delayed Function
        hander.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Perinah yang akan di jalankan
                // TODO 2.1 : Mulai activity baru
                Intent mIntent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(mIntent);
                // akhiri activity sekarang
                finish();

            }
        }, 3000); // delay selama 3detik = 3000
    }
}
