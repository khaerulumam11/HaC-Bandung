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
public class FragmentInfoBatikBandung2 extends Fragment {

    private TextView mTextView;

    public FragmentInfoBatikBandung2() {
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

        mTextView.setText("Ada beberapa wilayah dimana batik khas Kabupaten Bandung Barat berkembang, salah satunya adalah batik Lembang. Batik Lembang muncul di daerah kayu ambon pada tahun 2007 atas prakarsa salah seorang kolektor batik. Pada awalnya daerah ini hanya menjual batik dari berbagai daerah, lambat laun daerah ini memproduksi batik dengan motif sendiri yang tersinspirasi dari kearifan tanah Lembang. Saat ini ada beberapa motif yang dikembangkan antara lain motif kenanga, bintang, boscha, papatong pucuk teh, kawung stroberi, dan pinus.");

    }




}
