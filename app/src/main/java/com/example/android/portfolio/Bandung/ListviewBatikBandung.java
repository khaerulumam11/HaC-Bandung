package com.example.android.portfolio.Bandung;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.portfolio.AdapterListview;
import com.example.android.portfolio.BajudaerahBandung.TablayoutInfoBajudaerahBandung3;
import com.example.android.portfolio.BajudaerahBandung.TablayoutInfoBajudaerahBandung4;
import com.example.android.portfolio.BatikBandung.TablayoutInfoBatikBandung1;
import com.example.android.portfolio.BatikBandung.TablayoutInfoBatikBandung2;
import com.example.android.portfolio.BatikBandung.TablayoutInfoBatikBandung3;
import com.example.android.portfolio.BatikBandung.TablayoutInfoBatikBandung4;
import com.example.android.portfolio.BatikBandung.TablayoutInfoBatikBandung5;
import com.example.android.portfolio.R;

/**
 * Created by nurcahyadiperdana on 11/28/17.
 */

public class ListviewBatikBandung extends Activity {

    ListView list;

    String[] itemname = {
            "Batik Binari Kawung",
            "Batik Boscha Perkasa",
            "Batik Jalak Harupat",
            "Batik Pattrkomala Cangkurileung",
            "Batik Ragen Penganten",

    };

    Integer[] imgid = {
            R.mipmap.batikbinarikawung,
            R.mipmap.batikboschaperkasa,
            R.mipmap.batikjalakharupat,
            R.mipmap.batikpatrakomalacangkurileung,
            R.mipmap.batikragenpanganten,

    };

    String[] textname = {
            "Sejarah batik kawung yang lain menyebutkan bahwa terdapat cerita rakyat dimana seorang pemuda dari desa yang berwibawa juga disegani oleh lingkungannya karena tutur kata yang santun dan bijak hingga menjadi perhatian oleh kalangan keraton Mataram",
            "Ada beberapa wilayah dimana batik khas Kabupaten Bandung Barat berkembang, salah satunya adalah batik Lembang",
            "Motif-motif batik Bandung berkaitan erat dengan kerajaan Pajajaran. Konon dalam naskah kuno Siksa Kanda Ing Karesian, telah dikenal berbagai motif batik di Rakean Darma siksa",
            "Batik ini bermotifkan Bunga Patrakomala sebagai Flora Khas Kota bandung dan dipadukan Burung Cangkurileung sebagai Fauna khas Kota Bandung",
            "Batik sunda atau pajajaran pun memiliki ciri khas yang lain daripada yang lain yaitu motif tumbuhan. Sayangnya perubahan zaman dan runtuhnya kerajaan pajajaran membuat batik tersebut tenggelam di telan bumi",
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
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoBatikBandung1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoBatikBandung2.class);
                    startActivityForResult(myIntent, 1);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoBatikBandung3.class);
                    startActivityForResult(myIntent, 2);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoBatikBandung4.class);
                    startActivityForResult(myIntent, 3);
                }
                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoBatikBandung5.class);
                    startActivityForResult(myIntent, 4);
                }

            }
        });
    }

}