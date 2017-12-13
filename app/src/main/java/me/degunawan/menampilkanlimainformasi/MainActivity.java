package me.degunawan.menampilkanlimainformasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, new InformasikeduaFragment())
                .commit();
    }

    public void dasarNegara(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, new InformasiPertamaFragment(), "informasiPertamaFragment")
                .commit();
    }

    public void openActivityMaps(View view) {
        Intent intent = new Intent(MainActivity.this, PetaIndonesia.class);
        startActivity(intent);
    }

    public void informasiUtama(View view) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, new InformasikeduaFragment())
                .commit();
    }

    public void openLayoutBaru(View view) {
        Intent intent = new Intent(MainActivity.this, Coba.class);
        startActivity(intent);
    }
}
