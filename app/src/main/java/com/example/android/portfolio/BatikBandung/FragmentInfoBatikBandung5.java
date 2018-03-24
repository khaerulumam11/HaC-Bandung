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
public class FragmentInfoBatikBandung5 extends Fragment {

    private TextView mTextView;

    public FragmentInfoBatikBandung5() {
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

        mTextView.setText("Batik sunda atau pajajaran pun memiliki ciri khas yang lain daripada yang lain yaitu motif tumbuhan. Sayangnya perubahan zaman dan runtuhnya kerajaan pajajaran membuat batik tersebut tenggelam di telan bumi. Akan tetapi yang cukup menggembirakan sekarang adalah motif-motif batik zaman dahulu seperti ragen panganten, pasi-pasi, kembang muncang, jayanti, dan bayak ngantrang mulai direkonstruksi kembali untuk diperkenalkan kembali.");

    }




}
