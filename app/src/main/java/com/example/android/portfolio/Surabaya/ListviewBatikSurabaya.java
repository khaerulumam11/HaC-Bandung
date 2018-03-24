package com.example.android.portfolio.Surabaya;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.portfolio.AdapterListview;
import com.example.android.portfolio.BatikSurabaya.TablayoutInfoBatikSurabaya1;
import com.example.android.portfolio.BatikSurabaya.TablayoutInfoBatikSurabaya2;
import com.example.android.portfolio.BatikSurabaya.TablayoutInfoBatikSurabaya3;
import com.example.android.portfolio.BatikSurabaya.TablayoutInfoBatikSurabaya4;
import com.example.android.portfolio.R;

/**
 * Created by nurcahyadiperdana on 11/28/17.
 */

public class ListviewBatikSurabaya extends Activity {

    ListView list;

    String[] itemname = {
            "Batik Mangrove Surabaya",
            "Batik Sura dan Baya",
            "Batik Sawunggaling",
            "Batik Semanggi"

    };

    Integer[] imgid = {
            R.mipmap.batikmangrovesurabaya,
            R.mipmap.batiksuradanbaya,
            R.mipmap.batiksawunggaling,
            R.mipmap.batiksemanggi
    };

    String[] textname = {
            "Batik Mangrove merupakan salah satu jenis batik tulis baru di Surabaya",
            "Batik Surabaya terinspirasi dari latar belakang sejarah dan simbol Surabaya",
            "Batik Surabaya motif Sawunggaling, motif ini berasal dari kisah Joko Berek yang suka adu ayam",
            "dsadsdSelain daun semanggi, motif kapal juga menjadi motif khas Surabaya. Seperti motif Ujung Galuh yang proses pembuatannya diambil dari cerita Ujung Galuh",
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
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoBatikSurabaya1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoBatikSurabaya2.class);
                    startActivityForResult(myIntent, 1);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoBatikSurabaya3.class);
                    startActivityForResult(myIntent, 2);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoBatikSurabaya4.class);
                    startActivityForResult(myIntent, 3);
                }
                if (position == 4) {
//                    Intent myIntent = new Intent(view.getContext(), infoBatik5.class);
//                    startActivityForResult(myIntent, 4);
                }

            }
        });
    }

}