package com.example.android.portfolio.SejarahJakarta;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.portfolio.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentInfoSejarahJakarta3 extends Fragment {

    private TextView mTextView;

    public FragmentInfoSejarahJakarta3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info_batik_jakarta1, container, false);



    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        mTextView = (TextView) view.findViewById(R.id.Text);

        mTextView.setText("Monumen Proklamator terletak di Jl. Pegangsaan Timur no.56 Jakarta Pusat. Monumen Proklamasi terdiri dari 17 pilar tepat dibelakang patung proklamator yang menggambarkan tanggal kemerdekaan Indonesia 17 Agustus 1945 patung Ir.Sukarno yang sedang membaca naskah proklamasi dan diseberangnya patung Drs.mohammad hatta dan tepat di tengah-tengah mereka terdapat tulisan naskah proklamasi diatas batu marmer hitam tepat dibawah batu marmer tersebut terdapat piagam persmian monumen proklamator oleh Bapak Soeharto presiden ke-2 bangsa Indonesia dalam marmer putih.");

    }




}
