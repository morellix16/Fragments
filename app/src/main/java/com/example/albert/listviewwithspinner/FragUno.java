package com.example.albert.listviewwithspinner;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragUno.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragUno#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragUno extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Adapter adaptador;

    private OnFragmentInteractionListener mListener;

    public FragUno() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragUno.
     */
    // TODO: Rename and change types and number of parameters
    public static FragUno newInstance(String param1, String param2) {
        FragUno fragment = new FragUno();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_frag_uno, container, false);


        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayList<Producto> listItems = new ArrayList<>();
        listItems.add(new Producto(R.drawable.imagea,"Persona","10"));
        listItems.add(new Producto(R.drawable.leonidas,"Leonidas","15"));
        listItems.add(new Producto(R.drawable.stark,"Ned Stark","20"));
        // Inflate the layout for this fragment

        ListView listview = getActivity().findViewById(R.id.listView);

        adaptador = new Adaptador(getActivity(), listItems);
        listview.setAdapter((ListAdapter) adaptador);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity(), "This is my Toast message!",
                        Toast.LENGTH_LONG).show();
            }
        });
    }




    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
