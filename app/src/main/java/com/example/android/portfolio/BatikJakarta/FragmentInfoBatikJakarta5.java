package com.example.android.portfolio.BatikJakarta;


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
public class FragmentInfoBatikJakarta5 extends Fragment {

    private TextView mTextView;

    public FragmentInfoBatikJakarta5() {
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

        mTextView.setText("Motif Ondel-ondel pada Batik Betawi diangkat dari figur Ondel-ondel yang digunakan sebagai boneka penolak bala. Motif Ondel-ondel dibuat untuk mendapatkan kehidupan yang tenteram dan jauh dari bala bencana. Pada zaman dahulu, Motif Ondel-ondel digunakan pada acara-acara adat Betawi. Selain itu, ondel-ondel menjadi ciri khas Jakarta apalagi ketika perayaan ulang tahun Kota Jakarta.");

    }




}
