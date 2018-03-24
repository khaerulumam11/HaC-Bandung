package com.example.android.portfolio.BatikJakarta;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.portfolio.Bandung.ListviewBatikBandung;
import com.example.android.portfolio.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentInfoBatikJakarta1 extends Fragment {

    private TextView mTextView;

    public FragmentInfoBatikJakarta1() {
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

        mTextView.setText("Batik Betawi Motif Ciliwung bermula dari peradaban manusia di tepian Sungai Ciliwung. " +
                "Konon bangsa Portugis, Inggris, dan Belanda ingin menguasai Jakarta karena tertarik dengan Sungai Ciliwung. " +
                "Penggunaan Sungai Ciliwung sebagai motif Batik Betawi diharapkan sebagai daya tarik dan sebagai simbol rezeki yang " +
                "terus mengalir bagaikan aliran sungai Ciliwung.");

    }




}
