package com.example.android.portfolio.SejarahJakarta;


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
public class FragmentInfoSejarahJakarta1 extends Fragment {

    private TextView mTextView;

    public FragmentInfoSejarahJakarta1() {
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

        mTextView.setText("Masjid Istiqlal merupakan sebuah masjid kebanggaan negeri ini yang terletak di pusat ibukota Jakarta. Masjid Istiqlal merupakan masjid terbesar di Asia Tenggara. Selain digunakan sebagai aktivitas ibadah umat Islam, masjid ini juga digunakan sebagai kantor berbagai organisasi Islam di Indonesia, aktivitas sosial, dan kegiatan umum. Masjid ini juga menjadi salah satu daya tarik wisata yang terkenal di Jakarta. Kebanyakan Dolaners yang berkunjung umumnya dari dalam maupun luar negeri yang beragama Islam.\n" +
                "\n");
    }




}
