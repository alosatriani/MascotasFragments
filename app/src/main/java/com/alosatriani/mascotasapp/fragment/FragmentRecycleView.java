package com.alosatriani.mascotasapp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alosatriani.mascotasapp.R;
import com.alosatriani.mascotasapp.adaptador.MascotasAdapter;
import com.alosatriani.mascotasapp.vo.MascotasVO;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentRecycleView extends Fragment {
    ArrayList<MascotasVO> mascotas;
    private RecyclerView rvListaMascotas;

    public FragmentRecycleView() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);


        rvListaMascotas = (RecyclerView)v.findViewById(R.id.rvMascotas);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());

        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvListaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();

        inicializarAdaptadorMascotas();
        return v;
    }



    public void inicializarListaMascotas(){


         mascotas = new ArrayList<MascotasVO>();


           // mascotas.add(new MascotasVO("Pelusa", R.drawable.pelusa));
            mascotas.add(new MascotasVO("Bola", R.drawable.dog5));
           // mascotas.add(new MascotasVO("Frida", R.drawable.frida));
            mascotas.add(new MascotasVO("Kika", R.drawable.dog4));
           // mascotas.add(new MascotasVO("Bombón", R.drawable.enzo));

            mascotas.add(new MascotasVO("lambda", R.drawable.dog1));
           // mascotas.add(new MascotasVO("Bombón", R.drawable.karin));

            mascotas.add(new MascotasVO("Roosky", R.drawable.dog6));
          //  mascotas.add(new MascotasVO("Bombón", R.drawable.kika));

            mascotas.add(new MascotasVO("Roberto", R.drawable.dog7));
           // mascotas.add(new MascotasVO("Bombón", R.drawable.dodo));
            mascotas.add(new MascotasVO("Huesos", R.drawable.dogpug));

            //mascotas.add(new MascotasVO("Bombón", R.drawable.niko));
            mascotas.add(new MascotasVO("Enzo", R.drawable.dog2));
            //mascotas.add(new MascotasVO("Bombón", R.drawable.luna));





    }


    public void inicializarAdaptadorMascotas(){
        MascotasAdapter mascotasAdapter = new MascotasAdapter(mascotas, getActivity(), false);
        rvListaMascotas.setAdapter(mascotasAdapter);
    }



}
