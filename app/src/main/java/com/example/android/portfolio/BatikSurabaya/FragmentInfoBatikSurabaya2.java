package com.example.android.portfolio.BatikSurabaya;


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
public class FragmentInfoBatikSurabaya2 extends Fragment {

    private TextView mTextView;

    public FragmentInfoBatikSurabaya2() {
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

        mTextView.setText("Batik Surabaya terinspirasi dari latar belakang sejarah dan simbol Surabaya. Misal, batik motif semanggi, dimana semanggi merupakan makanan khas Surabaya yang keberadaannya kini mulai punah. Batik Semanggi yang berwarna hijau cerah akan sangat cocok jika dipadukan dengan warna-warna cerah lain seperti merah, biru dan warna lainnya.\n" +
                "Batik Surabaya Motif Semanggi");

    }




}
