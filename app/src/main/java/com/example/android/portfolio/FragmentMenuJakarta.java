package com.example.android.portfolio;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.widget.ImageButton;

import com.example.android.portfolio.Jakarta.ListviewBajudaerahJakarta;
import com.example.android.portfolio.Jakarta.ListviewBatikJakarta;
import com.example.android.portfolio.Jakarta.ListviewMakananJakarta;
import com.example.android.portfolio.Jakarta.ListviewSejarahJakarta;
import com.example.android.portfolio.Jakarta.ListviewTarianJakarta;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentMenuJakarta extends Fragment {

    private ImageButton mButtonBatikJakarta;
    private ImageButton mButtonMakananJakarta;
    private ImageButton mButtonSejarahJakarta;
    private ImageButton mButtonTarianJakarta;
    private ImageButton mButtonBajudaerahJakarta;

    public FragmentMenuJakarta() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu_jakarta, container, false);

    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mButtonBatikJakarta = (ImageButton) view.findViewById(R.id.ButtonBatikJkt);
        mButtonMakananJakarta = (ImageButton) view.findViewById(R.id.ButtonMakananJkt);
        mButtonSejarahJakarta = (ImageButton) view.findViewById(R.id.ButtonSejarahJkt);
        mButtonTarianJakarta = (ImageButton) view.findViewById(R.id.ButtonTarianJkt);
        mButtonBajudaerahJakarta = (ImageButton) view.findViewById(R.id.ButtonBajudaerahJkt);

        mButtonBatikJakarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ListviewBatikJakarta.class);
                getActivity().startActivity(intent);
            }
        });
        mButtonMakananJakarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ListviewMakananJakarta.class);
                getActivity().startActivity(intent);
            }
        });
        mButtonSejarahJakarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ListviewSejarahJakarta.class);
                getActivity().startActivity(intent);
            }
        });
        mButtonTarianJakarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ListviewTarianJakarta.class);
                getActivity().startActivity(intent);
            }
        });
        mButtonBajudaerahJakarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ListviewBajudaerahJakarta.class);
                getActivity().startActivity(intent);
            }
        });


    }


}
