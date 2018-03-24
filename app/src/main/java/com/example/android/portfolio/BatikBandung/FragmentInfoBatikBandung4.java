package com.example.android.portfolio.BatikBandung;


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
public class FragmentInfoBatikBandung4 extends Fragment {

    private TextView mTextView;

    public FragmentInfoBatikBandung4() {
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

        mTextView.setText("Batik ini bermotifkan Bunga Patrakomala sebagai Flora Khas Kota bandung dan dipadukan Burung Cangkurileung sebagai Fauna khas Kota Bandung, banyak orang yang belum mengetahui apa yang menjadi ke khasan kota yang kita tempati. Oleh karena itu, mari kita gali apa yang menjadi ke khasan kota kita. Jangan sampai batik yang menjadi ke khasan kota kita di klaim oleh negara lain. Mari kita lestarikan kebudayaan batik ini.");

    }




}
