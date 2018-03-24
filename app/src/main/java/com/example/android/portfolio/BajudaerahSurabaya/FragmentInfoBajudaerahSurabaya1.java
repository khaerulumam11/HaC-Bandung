package com.example.android.portfolio.BajudaerahSurabaya;


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
public class FragmentInfoBajudaerahSurabaya1 extends Fragment {

    private TextView mTextView;

    public FragmentInfoBajudaerahSurabaya1() {
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

        mTextView.setText("Pakaian adat Jawa Timur Cak digunakan oleh para pria. Pakaian ini berupa perpaduan beskap atau jas tutup sebagai atasan, jarik sebagai bawahan, kuku macan sebagai hiasan yang digantung pada saku beskap, sapu tangan merah, dan terompah.  Sementara pakaian adat Jawa Timur Ning dikenakan oleh para wanita. Pakaian ini berupa perpaduan kebaya sebagai atasan, jarik sebagai bawahan, kerudung dengan renda, dan beragam aksesoris tambahan lainnya seperti anting, selendang, selop, dan gelang.\n" +
                "\n" +
                "Sumber: http://adat-tradisional.blogspot.com/2016/07/pakaian-adat-jawa-timur.html\n" +
                "Disalin dari Blog Adat Tradisional.");
    }




}
