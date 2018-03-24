package com.example.android.portfolio.SejarahSurabaya;


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
public class FragmentInfoSejarahSurabaya4 extends Fragment {

    private TextView mTextView;

    public FragmentInfoSejarahSurabaya4() {
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

        mTextView.setText("Untuk mengenang Hari Pahlawan yang jatuh setiap 10 November, Surabaya membangun Tugu Pahlawan di jalan Tembaan, depan kantor gubernur. Tugu Pahlawan dibangun untuk menghormati prajurit Surabaya yang tewas ketika pertempuran besar. Tugu Pahlawan juga dibangun dengan bentuk paku terbalik dan memiliki ketinggian 40,45 meter dan diameter 3,10 meter. Bagian bawahnya berdiameter 1,30 meter dan dihiasi dengan ukuran “Trisula” bergambar, “Cakra”, dan “Padma” yang merupakan simbol api perjuangan.");
    }




}
