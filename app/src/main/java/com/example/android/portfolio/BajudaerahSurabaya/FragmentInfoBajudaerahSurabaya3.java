package com.example.android.portfolio.BajudaerahSurabaya;


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
public class FragmentInfoBajudaerahSurabaya3 extends Fragment {

    private TextView mTextView;

    public FragmentInfoBajudaerahSurabaya3() {
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

        mTextView.setText("Baju pesaan sebetulnya merupakan baju keseharian yang biasa dikenakan hanya oleh orang-orang Madura dan sebagian pesisir utara Jawa Timur. Kendati demikian, karena keunikan dan ciri khas yang dimilikinya, baju inilah yang justru menjadi ikon utama yang mewakili Timur di kancah Nasional. \n" +
                "\n" +
                "Sumber: http://adat-tradisional.blogspot.com/2016/07/pakaian-adat-jawa-timur.html\n" +
                "Disalin dari Blog Adat Tradisional.");
    }




}
