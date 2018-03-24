package com.example.android.portfolio;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.android.portfolio.Bandung.ListviewBajudaerahBandung;
import com.example.android.portfolio.Bandung.ListviewBatikBandung;
import com.example.android.portfolio.Bandung.ListviewMakananBandung;
import com.example.android.portfolio.Bandung.ListviewSejarahBandung;
import com.example.android.portfolio.Bandung.ListviewTarianBandung;
import com.example.android.portfolio.Jakarta.ListviewBajudaerahJakarta;
import com.example.android.portfolio.Jakarta.ListviewBatikJakarta;
import com.example.android.portfolio.Jakarta.ListviewMakananJakarta;
import com.example.android.portfolio.Jakarta.ListviewSejarahJakarta;
import com.example.android.portfolio.Jakarta.ListviewTarianJakarta;
import com.example.android.portfolio.Kuis.Kuis1;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentMenuBandung extends Fragment {

    private ImageButton mButtonBatikBandung;
    private ImageButton mButtonMakananBandung;
    private ImageButton mButtonSejarahBandung;
    private ImageButton mButtonTarianBandung;
    private ImageButton mButtonBajudaerahBandung;
    private ImageButton kuis;

    public FragmentMenuBandung() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu_bandung, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mButtonBatikBandung = (ImageButton) view.findViewById(R.id.ButtonBatikBdg);
        mButtonMakananBandung = (ImageButton) view.findViewById(R.id.ButtonMakananBdg);
        mButtonSejarahBandung = (ImageButton) view.findViewById(R.id.ButtonSejarahBdg);
        mButtonTarianBandung = (ImageButton) view.findViewById(R.id.ButtonTarianBdg);
        mButtonBajudaerahBandung = (ImageButton) view.findViewById(R.id.ButtonBajudaerahBdg);
        kuis = (ImageButton) view.findViewById(R.id.Kuis);

        mButtonBatikBandung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ListviewBatikBandung.class);
                getActivity().startActivity(intent);
            }
        });
        mButtonMakananBandung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ListviewMakananBandung.class);
                getActivity().startActivity(intent);
            }
        });
        mButtonSejarahBandung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ListviewSejarahBandung.class);
                getActivity().startActivity(intent);
            }
        });
        mButtonTarianBandung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ListviewTarianBandung.class);
                getActivity().startActivity(intent);
            }
        });
        mButtonBajudaerahBandung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ListviewBajudaerahBandung.class);
                getActivity().startActivity(intent);
            }
        });

        kuis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Kuis1.class);
                getActivity().startActivity(intent);
            }
        });


    }
}
