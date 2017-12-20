package com.example.albert.listviewwithspinner;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    String gas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();

        TextView textView = (TextView) findViewById(R.id.titulo2);
        String s1 = intent.getStringExtra("t");
        textView.setText(s1);

        TextView textSpin = (TextView) findViewById(R.id.cantidad);
        String spin = intent.getStringExtra("s");
        textSpin.setText(spin);

        ImageView imgcompra = (ImageView) findViewById(R.id.foto);
        Bundle extras = getIntent().getExtras();
        Bitmap bmp = (Bitmap) extras.getParcelable("imagebitmap");

        imgcompra.setImageBitmap(bmp);



    }
}
