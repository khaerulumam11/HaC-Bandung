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
public class FragmentInfoBatikJakarta2 extends Fragment {

    private TextView mTextView;

    public FragmentInfoBatikJakarta2() {
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

        mTextView.setText("Ide pembuatan Batik Betawi Motif Nusa Kelapa terinspirasi dari Peta Ceila yang dibuat " +
                "pada masa kekuasaan Prabu Siliwangi 1482-1521. Peta Ceila menjabarkan bahwa Jakarta dulunya berganti-ganti " +
                "nama mulai dari Nusa Kelapa, Sunda Kelapa, Jayakarta, Batavia, hingga Jakarta. Nama “Nusa Kelapa” diberikan " +
                "oleh leluhur masyarakat Betawi yang kini dijadikan salah satu motif Batik Betawi. Selain itu, bagi orang Betawi, " +
                "daun kelapa merupakan simbol upacara adat Betawi.\n" +
                "\n");
    }




}
