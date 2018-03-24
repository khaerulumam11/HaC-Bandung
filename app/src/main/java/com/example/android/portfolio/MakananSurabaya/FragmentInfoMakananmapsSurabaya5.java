package com.example.android.portfolio.MakananSurabaya;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.portfolio.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentInfoMakananmapsSurabaya5 extends Fragment implements OnMapReadyCallback {


    public FragmentInfoMakananmapsSurabaya5() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info_batikmaps_jakarta1, container, false);
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {

        LatLng marker = new LatLng(-7.259217, 112.757165);
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(marker,13));
        googleMap.addMarker(new MarkerOptions().title("Tahu Campur Kalasan Surabaya").position(marker));

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment fragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        fragment.getMapAsync(this);
    }

}
