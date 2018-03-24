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
public class FragmentInfoBatikSurabaya4 extends Fragment {

    private TextView mTextView;

    public FragmentInfoBatikSurabaya4() {
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

        mTextView.setText("Selain daun semanggi, motif kapal juga menjadi motif khas Surabaya. Seperti motif Ujung Galuh yang proses pembuatannya diambil dari cerita Ujung Galuh. Dimana saat itu, Raden Wijaya, pendiri kerajaan Majapahit bertempur dengan tentara Tar-Tar di sungai Kalimas yang bermuara di Ujung Galuh. Ujung Galuh sendiri merupakan cikal bakal kota Surabaya. Selain itu, ada juga motif Cheng Ho yang terinspirasi kapal yang digunakan Laksamana Chengho yang pernah mampir di sungai Kalimas Surabaya.");

    }




}
