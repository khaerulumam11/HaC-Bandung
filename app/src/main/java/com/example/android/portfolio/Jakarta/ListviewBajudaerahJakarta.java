package com.example.android.portfolio.Jakarta;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.portfolio.AdapterListview;
import com.example.android.portfolio.BajudaerahJakarta.TablayoutInfoBajudaerahJakarta1;
import com.example.android.portfolio.BajudaerahJakarta.TablayoutInfoBajudaerahJakarta2;
import com.example.android.portfolio.BajudaerahJakarta.TablayoutInfoBajudaerahJakarta3;
import com.example.android.portfolio.BajudaerahJakarta.TablayoutInfoBajudaerahJakarta4;
import com.example.android.portfolio.BajudaerahJakarta.TablayoutInfoBajudaerahJakarta5;
import com.example.android.portfolio.R;

/**
 * Created by nurcahyadiperdana on 11/28/17.
 */

public class ListviewBajudaerahJakarta extends Activity {
    ListView list;

    String[] itemname = {
            "Pakaian Keseharian Pria Betawi",
            "Pakaian Keseharian Wanita Betawi",
            "Pakaian Adat Betawi untuk Bangsawan",
            "Pakaian Pengantin Pria Betawi",
            "Pakaian Pengantin Wanita Betawi"

    };

    Integer[] imgid = {
            R.mipmap.bajukeseharianpriabetawi,
            R.mipmap.bajukeseharianwanitabetawi,
            R.mipmap.bajubangsawanbetawi,
            R.mipmap.bajupengantinwanitabetawi,
            R.mipmap.bajupengantinpriabetawi,

    };

    String[] textname = {
            "Yang dimaksud dengan pakaian keseharian disini adalah baju yang umum dipakai oleh orang betawi dalam kesehariannya.",
            "Sementara baju adat keseharian bagi wanita betawi, yang dipergunakan sehari-hari terdiri atas :",
            "Pakaian bangsawan sebenarnya adalah pakaian resmi yang dulunya hanya dikenakan oleh para demang.",
            "Bagi para pengantin Pria, pakaian adat betawi yang dikenakan bernama Dandanan Care Haji.",
            "Pengantin wanita dalam perinikahan adat betawi menggunakan baju adat betawi yang bernama Rias besar Dandanan care none pengantin cine.",
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
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoBajudaerahJakarta1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoBajudaerahJakarta2.class);
                    startActivityForResult(myIntent, 1);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoBajudaerahJakarta3.class);
                    startActivityForResult(myIntent, 2);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoBajudaerahJakarta4.class);
                    startActivityForResult(myIntent, 3);
                }
                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoBajudaerahJakarta5.class);
                    startActivityForResult(myIntent, 4);
                }

            }
        });
    }

}