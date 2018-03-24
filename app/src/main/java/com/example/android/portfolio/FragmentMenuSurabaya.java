package com.example.android.portfolio;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.android.portfolio.Jakarta.ListviewBajudaerahJakarta;
import com.example.android.portfolio.Jakarta.ListviewBatikJakarta;
import com.example.android.portfolio.Jakarta.ListviewMakananJakarta;
import com.example.android.portfolio.Jakarta.ListviewSejarahJakarta;
import com.example.android.portfolio.Jakarta.ListviewTarianJakarta;
import com.example.android.portfolio.Surabaya.ListviewBajudaerahSurabaya;
import com.example.android.portfolio.Surabaya.ListviewBatikSurabaya;
import com.example.android.portfolio.Surabaya.ListviewMakananSurabaya;
import com.example.android.portfolio.Surabaya.ListviewSejarahSurabaya;
import com.example.android.portfolio.Surabaya.ListviewTarianSurabaya;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentMenuSurabaya extends Fragment {

    private ImageButton mButtonBatikSurabaya;
    private ImageButton mButtonMakananSurabaya;
    private ImageButton mButtonSejarahSurabaya;
    private ImageButton mButtonTarianSurabaya;
    private ImageButton mButtonBajudaerahSurabaya;

    public FragmentMenuSurabaya() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu_surabaya, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mButtonBatikSurabaya = (ImageButton) view.findViewById(R.id.ButtonBatikSby);
        mButtonMakananSurabaya = (ImageButton) view.findViewById(R.id.ButtonMakananSby);
        mButtonSejarahSurabaya = (ImageButton) view.findViewById(R.id.ButtonSejarahSby);
        mButtonTarianSurabaya = (ImageButton) view.findViewById(R.id.ButtonTarianSby);
        mButtonBajudaerahSurabaya = (ImageButton) view.findViewById(R.id.ButtonBajudaerahSby);

        mButtonBatikSurabaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ListviewBatikSurabaya.class);
                getActivity().startActivity(intent);
            }
        });
        mButtonMakananSurabaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ListviewMakananSurabaya.class);
                getActivity().startActivity(intent);
            }
        });
        mButtonSejarahSurabaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ListviewSejarahSurabaya.class);
                getActivity().startActivity(intent);
            }
        });
        mButtonTarianSurabaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ListviewTarianSurabaya.class);
                getActivity().startActivity(intent);
            }
        });
        mButtonBajudaerahSurabaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ListviewBajudaerahSurabaya.class);
                getActivity().startActivity(intent);
            }
        });

    }
}
