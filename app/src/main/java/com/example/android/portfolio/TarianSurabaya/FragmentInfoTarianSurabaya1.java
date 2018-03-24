package com.example.android.portfolio.TarianSurabaya;


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
public class FragmentInfoTarianSurabaya1 extends Fragment {

    private TextView mTextView;

    public FragmentInfoTarianSurabaya1() {
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

        mTextView.setText("Menurut beberapa sumber, Tari Batik Pace ini diciptakan oleh Anang, yaitu pendiri Sanggar Blarak Pacitan. Tarian ini mengakomodasi sejarah dari buah pace dan kebutuhan memperkenalkan karya khas yang berupa batik Pace. Menurut Anang tarian Batik Pace ini merupakan tari kontemporer, dengan mengadopsi gerakan tari yang indah.\n" +
                "\n" +
                "Pemberian nama Batik Pace ini sendiri karena dahulu Pacitan memiliki riwayat sebagai daerah yang banyak ditumbuhi oleh tanaman pace (mengkudu). Mitos yang menyebar di kalangan masyarakat, pendiri Pacitan didalam perjuangannya meminum sari buah pace ini kemudian menjadi kuat. Cerita tersebut tertulis dikitab Babad Ing Pacitan, sehingga sebagian dari masyarakat Pacitan percaya bahwa nama Pacitan ini berasal dari kalimat pace sak pengetan, yang bermakna tempat buah pace." +
                "" +
                "\n" +
                "Tari Batik Pace ini diiringi oleh alunan musik yang berasal dari 2 (dua) orang pemukul tabuh perkusi dan 2 (dua) orang memainkan slenthem. Kolaborasi musik tersebut menghasilkan suara yang apik. Suara perkusi dan slenthem menghasilkan alunan nada yang indah dalam mengiringi gerakan tari Batik Pace menjadi lebih atraktif.");
    }




}
