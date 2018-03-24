package com.example.android.portfolio.Surabaya;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.portfolio.AdapterListview;
import com.example.android.portfolio.BajudaerahSurabaya.TablayoutInfoBajudaerahSurabaya1;
import com.example.android.portfolio.BajudaerahSurabaya.TablayoutInfoBajudaerahSurabaya2;
import com.example.android.portfolio.BajudaerahSurabaya.TablayoutInfoBajudaerahSurabaya3;
import com.example.android.portfolio.R;

/**
 * Created by nurcahyadiperdana on 11/28/17.
 */

public class ListviewBajudaerahSurabaya extends Activity {

    ListView list;

    String[] itemname = {
            "Pakaian Cak dan Ning",
            "Pakaian Mantenan",
            "Pakaian Pesaan"

    };

    Integer[] imgid = {
            R.mipmap.pakaiancakdanning,
            R.mipmap.pakaianmantenan,
            R.mipmap.pakaianpesaan,


    };
    String[] textname = {
            "sdadasdasdadsad",
            "dsadsadasdsdasdasdas",
            "dsadadasdas",
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
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoBajudaerahSurabaya1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoBajudaerahSurabaya2.class);
                    startActivityForResult(myIntent, 1);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoBajudaerahSurabaya3.class);
                    startActivityForResult(myIntent, 2);
                }
                if (position == 3) {
//                    Intent myIntent = new Intent(view.getContext(), infoBatik4.class);
//                    startActivityForResult(myIntent, 3);
                }
                if (position == 4) {
//                    Intent myIntent = new Intent(view.getContext(), infoBatik5.class);
//                    startActivityForResult(myIntent, 4);
                }

            }
        });
    }

}