package com.example.android.portfolio.BajudaerahJakarta;


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
public class FragmentInfoBajudaerahJakarta2 extends Fragment {

    private TextView mTextView;

    public FragmentInfoBajudaerahJakarta2() {
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

        mTextView.setText("Sementara baju adat keseharian bagi wanita betawi, yang dipergunakan sehari-hari terdiri atas :\n" +
                "\n" +
                "a. Pakaian kurung/dinamakan Baju kurung berlengan pendek.\n" +
                "\n" +
                "Baju kurung yang digukanakan mempunyai lengan pendek, tak jarang ditambahkan saku pada bagian depannya dengan warna-warna yang mencolok.\n" +
                "\n" +
                "b. Kain Sarung Batik\n" +
                "\n" +
                "Kain sarung batik yang biasa dipakai di kepala para wanita betawi umumnya bercorak geometri dengan warna-warna yang cerah untuk dipadupadankan dengan baju kurung yang sedang dipakai.\n" +
                "\n" +
                "c. Kerudung\n" +
                "\n" +
                "Kerudung yang dikenakan wanita betawi yaitu selendang yang di pakai pada kepala para wanita betawi. Untuk warnanya biasanya diserasikan dengan baju kurung yang sedang/akan mereka kenakan.");
    }




}
