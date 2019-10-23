package com.intentimplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnPagWeb;
    private Button btnTrucadaTelefon;
    private Button btnMaps;
    private Button btnFoto;
    private Button btnCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPagWeb = (Button) findViewById(R.id.btnPagWeb);
        btnPagWeb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                startActivity(intent);
            }
        });

        btnTrucadaTelefon = (Button) findViewById(R.id.btnTrucadaTelefon);
        btnTrucadaTelefon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:625356114"));
                startActivity(intent);
            }
        });

        btnMaps = (Button) findViewById(R.id.btnMaps);
        btnMaps.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:41.301435, 2.083894"));
                startActivity(intent);
            }
        });

        btnFoto = (Button) findViewById(R.id.btnFoto);
        btnFoto.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intent);
            }
        });

        btnCorreo = (Button) findViewById(R.id.btnCorreo);
        btnCorreo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Hello");
                intent.putExtra(Intent.EXTRA_TEXT, "ONII-CHAN, YAMETE (test)");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"g.royo1999@gmail.com"});

                startActivity(intent);
            }
        });

    }
}
