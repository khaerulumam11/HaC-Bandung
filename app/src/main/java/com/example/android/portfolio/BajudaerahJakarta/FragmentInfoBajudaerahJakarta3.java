package com.example.android.portfolio.BajudaerahJakarta;


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
public class FragmentInfoBajudaerahJakarta3 extends Fragment {

    private TextView mTextView;

    public FragmentInfoBajudaerahJakarta3() {
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

        mTextView.setText("Pakaian bangsawan sebenarnya adalah pakaian resmi yang dulunya hanya dikenakan oleh para demang. Pada saat ini pakaian yang bernama baju ujung serong ini telah resmi digunakan sebagai pakaian PNS pemda DKI jakarta untuk dikenakan pada hari-hari tertentu.\n" +
                "\n" +
                "Pakaian ujung serong hanya dikenakan oleh para bangsawan laki-laki, sementara untuk wanita digunakan varian pakaian yang sama dengan pakaian keseharian yakni baju kurung, kain batik, selendang, dan kerudung, dan dilengkapi dengan perhiasan emas mulai dari kalung, gelang, cincin dan giwang.");
    }




}
