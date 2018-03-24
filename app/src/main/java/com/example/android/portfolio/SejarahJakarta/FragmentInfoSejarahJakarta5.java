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
public class FragmentInfoSejarahJakarta5 extends Fragment {

    private TextView mTextView;

    public FragmentInfoSejarahJakarta5() {
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

        mTextView.setText("Museum Nasional Indinesia merupakan sebuah wisata bersejarah yang masih berada dalam satu kawasan dengan Monumen Nasional. Di Museum Nasional Indonesia ini Dolaners bisa mengenal sejarah bangsa Indonesia lebih dalam lagi. Beragam history dan peninggalan bangsa ini ada di dalamnya. Museum ini menampung pengunjung kurang lebih 500 orang. museum ini berisikan sejarah Indonesia mulai dari jaman prasejarah sampai masa Orde Baru. Didalam museum Dolaners akan menemukan 51 diorama dengan ruangan yang berlapiskan marmer.");

    }




}
