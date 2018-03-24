package com.example.android.portfolio.MakananSurabaya;


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
public class FragmentInfoMakananSurabaya4 extends Fragment {

    private TextView mTextView;

    public FragmentInfoMakananSurabaya4() {
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

        mTextView.setText("Kuliner khas Surabaya yang berikutnya adalah Sate Lisidu. Sate ini terbuat dari daging ayam kampung yang berbentuk pipih. Dengan bentuk yang pipih memungkinkan bumbu kacang lebih mudah meresap.\n" +
                "\n" +
                "Sate ini akan selalu siap disantap dalam keadaan hangat, karena disajikan dengan tempat memanggang sate yang akan menjaga kelezatan makanan dan bisa kamu gunakan untuk memanggang sate sendiri di atas meja.");
    }




}
