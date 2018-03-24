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
public class FragmentInfoSejarahJakarta2 extends Fragment {

    private TextView mTextView;

    public FragmentInfoSejarahJakarta2() {
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

        mTextView.setText("Mengunjungi Monas di sore hari dengan berjalan – jalan atau bersepeda menyusuri taman yang ada di Monas merupakan kegiatan mengasyikan yang bisa Dolaners lakukan, Dolaners juga bisa menghabiskan waktu dengan berfoto – foto sambil melihat pemandangan sekitar. Tidak hanya itu, Dolaners juga bisa melihat keindahan pemandangan Ibu Kota Jakarta dari atas Monas dengan menaiki lift untuk mencapai puncaknya. Pengelola Monas juga menyediakan teropong yang bisa Dolaners gunakan untuk melihat panorama Kota Jakarta lebih jauh lagi.");
    }




}
