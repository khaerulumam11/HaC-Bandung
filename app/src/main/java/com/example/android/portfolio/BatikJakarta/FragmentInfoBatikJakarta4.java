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
public class FragmentInfoBatikJakarta4 extends Fragment {

    private TextView mTextView;

    public FragmentInfoBatikJakarta4() {
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

        mTextView.setText("Melalui Motif Salakanegara, Batik Betawi ingin bercerita tentang kerajaan pertama di tanah Betawi yang didirikan oleh Aki Tirem pada tahun 130 M. Orang Betawi percaya bahwa gunung memiliki kekuatan dan gunung yang mereka percayai itu adalah Gunung Salak. Sehingga mereka menamai kerajaannya dengan nama Salakanegara.");

    }




}
