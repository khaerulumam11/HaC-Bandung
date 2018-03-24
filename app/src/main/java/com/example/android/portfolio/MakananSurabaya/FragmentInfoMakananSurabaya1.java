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
public class FragmentInfoMakananSurabaya1 extends Fragment {

    private TextView mTextView;

    public FragmentInfoMakananSurabaya1() {
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

        mTextView.setText("Apa yang kamu bayangkan jika mendengar kuliner Rawon Setan? terdengar serem dan menakutkan bukan? atau mungkin rasanya sangat pedas? santai saja, bukan itu semua sebab rawon ini dinamakan Rawon Setan.\n" +
                "\n" +
                "Julukan setan dberikan, karena dahulu rawon ini dijual mulai pukul 22.00 WIB hingga dini hari. Seperti halnya setan yang muncul pada malam hari. Namun, sekarang kamu sudah bisa merasakan enaknya kuliner yang berlokasi di Jalam Embong Malang Bubutan, Surabaya Utara mulai dari jam 07.30 WIB.");
    }




}
