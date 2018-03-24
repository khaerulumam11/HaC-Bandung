package com.example.android.portfolio.Bandung;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.portfolio.AdapterListview;
import com.example.android.portfolio.R;
import com.example.android.portfolio.SejarahBandung.TablayoutInfoSejarahBandung1;
import com.example.android.portfolio.SejarahBandung.TablayoutInfoSejarahBandung2;
import com.example.android.portfolio.SejarahBandung.TablayoutInfoSejarahBandung3;
import com.example.android.portfolio.SejarahBandung.TablayoutInfoSejarahBandung4;
import com.example.android.portfolio.SejarahBandung.TablayoutInfoSejarahBandung5;

/**
 * Created by nurcahyadiperdana on 11/28/17.
 */

public class ListviewSejarahBandung extends Activity {

    ListView list;

    String[] itemname = {
            "Gedung Merdeka Bandung",
            "Gedung Sate",
            "Gedung Landmark Bandung",
            "Alun-Alun Bandung",
            "Stasiun Bandung",

    };

    Integer[] imgid = {
            R.mipmap.gedungmerdeka,
            R.mipmap.gedungsate,
            R.mipmap.gedunglandmarkbandung,
            R.mipmap.alunalunbandung,
            R.mipmap.stasiunbandung,

    };


    String[] textname = {
            "Pada tahun 1926, Van Galen Lasr dan C.P Wolff Schoemaker yang merupakan Guru Besar Technische Hoogeschool te Bandoeng",
            "Kota  Wisata Bandung yang berhawa sejuk, mempunyai sebuah bangunan yang disebut dengan Gedung sate. Gedung eksotis yang kental dengan nilai sejarah dan seni tersebut",
            "Kota wisata Bandung yang penuh dengan bangunan bersejarah pada masa penjajahan kolonial Belanda, menyisakan berbagai peninggalan penting yang keberadaannya bisa disaksikan hingga di zaman modern",
            "Ada banyak hal yang menarik dari obyek wisata Bandung  ini, terutama dari sisi sejarahnya di masa silam. Dahulu, ketika kota Bandung baru berdiri",
            "Sejarah mencatat, bahwa ide awal pembangunan Stasiun Bandung mempunyai kaitan yang erat dengan dibukanya areal perkebunan di sekitar wilayah Bandung dan sekitarnya",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        AdapterListview adapter = new AdapterListview(this, itemname, imgid, textname);
        list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                //String Slecteditem = itemname[+position];
                // Toast.makeText(getApplicationContext(), "selamat datang", Toast.LENGTH_SHORT).show();
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoSejarahBandung1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoSejarahBandung2.class);
                    startActivityForResult(myIntent, 1);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoSejarahBandung3.class);
                    startActivityForResult(myIntent, 2);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoSejarahBandung4.class);
                    startActivityForResult(myIntent, 3);
                }
                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoSejarahBandung5.class);
                    startActivityForResult(myIntent, 4);
                }

            }
        });
    }

}