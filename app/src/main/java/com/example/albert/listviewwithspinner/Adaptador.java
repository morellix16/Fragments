package com.example.albert.listviewwithspinner;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Albert on 15/11/2017.
 */

public class Adaptador extends BaseAdapter {

    private Context context;
    ArrayList<Producto> listItems;


    public Adaptador(Context context, ArrayList<Producto> listItems) {
        this.context = context;
        this.listItems = listItems;

    }

    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int i) {
        return listItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Producto p = (Producto) getItem(i);
        view = LayoutInflater.from(context).inflate(R.layout.itemlistview,null);

        String [] values = context.getResources().getStringArray(R.array.spinner_array);
        Spinner spinner = (Spinner) view.findViewById(R.id.spinner);
        ArrayAdapter adapter = new ArrayAdapter(context, android.R.layout.simple_list_item_1, values);
        spinner.setAdapter(adapter);

        ImageView imgFoto = (ImageView) view.findViewById(R.id.imgfoto);
        TextView titulo = (TextView) view.findViewById(R.id.titulo);
        TextView stock = (TextView) view.findViewById(R.id.stock);

        imgFoto.setImageResource(p.getImgFoto());
        titulo.setText(p.getTitulo());
        stock.setText(p.getStock());
        return view;
    }
}
