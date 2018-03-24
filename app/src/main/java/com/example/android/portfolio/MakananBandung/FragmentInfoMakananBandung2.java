package com.example.android.portfolio.MakananBandung;


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
public class FragmentInfoMakananBandung2 extends Fragment {

    private TextView mTextView;

    public FragmentInfoMakananBandung2() {
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

        mTextView.setText("Masakan khas bandung yang berikutnya akan ada dalam bahasan disini adalah sebuah makanan yang populer dengan nama Kupat Tahu. Makanan yang satu ini merupakan makanan yang di campur dengan saus kacang dengan ciri khas saus kacang yang di siramkan pada Kupat Tahu ini sangat kental. Yang mengenyangkan dalam Kupat Tahu ini adalah di dalamnya terdapat kupat atau lontong, tauge dan tahu yang sangat gurih.\n" +
                "\n" +
                "Kupat Tahu ini merupakan makanan legendaris yang berasal dari bandung dan di kota bandung sendiri banyak orang yang menjualnya. Beberapa orang sangat suka Kupat Tahu ini jika lontong atau kupat yang di gunakan cukup kenyal sehingga menimbulkan sensasi mengunyah yang butuh kerja keras. Kupat Tahu dari dulu hingga saat ini masih menjadi makanan favorit di jawa barat atau bandung, hal ini terbukti banyak juga orang yang menjual Kupat Tahu ini.");
    }




}
