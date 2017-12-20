package com.example.albert.listviewwithspinner;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends Activity {


    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    public ListView lvitem;
    private Adaptador adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentmanager = this.getFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentmanager.beginTransaction();

        FragUno mainFragment = new FragUno();

        fragmentTransaction.add(R.id.main, mainFragment);

        fragmentTransaction.commit();


    }

}
