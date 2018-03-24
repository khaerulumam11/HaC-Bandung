package com.example.android.portfolio.Surabaya;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.portfolio.AdapterListview;
import com.example.android.portfolio.R;
import com.example.android.portfolio.SejarahSurabaya.TablayoutInfoSejarahSurabaya1;
import com.example.android.portfolio.SejarahSurabaya.TablayoutInfoSejarahSurabaya2;
import com.example.android.portfolio.SejarahSurabaya.TablayoutInfoSejarahSurabaya3;
import com.example.android.portfolio.SejarahSurabaya.TablayoutInfoSejarahSurabaya4;

/**
 * Created by nurcahyadiperdana on 11/28/17.
 */

public class ListviewSejarahSurabaya extends Activity {

    ListView list;

    String[] itemname = {
            "Monumen Jendral Sudirman",
            "Monumen Kapal Selam",
            "Mpu Tantular",
            "Tugu Pahlawan"
    };

    Integer[] imgid = {
            R.mipmap.monumenjendralsudirman,
            R.mipmap.monumenkapalselam,
            R.mipmap.mputantular,
            R.mipmap.tugupahlawan

    };

    String[] textname = {
            "Monumen Jenderal Soedirman yang berada di Yos Sudarso berdiri sejak 10 November 1970 oleh Presiden Soeharto untuk memperingati Hari Pahlawan",
            "Monumen Kapal Selam yang dibangun di sisi Sungai Kalimas adalah monumen kapal terbesar di Asia. Monumen Kapal Selam dibangun karena ide para sesepuh Kapal Selam",
            "Di dalam Museum Mpu Tantular terdapat berbagai barang peninggalan sejarah, terutama dari zaman kerajaan. Ada kurang lebih 1.500 koleksi barang antik dari Kerajaan Hindhu, Islam, dan Buddha",
            "Untuk mengenang Hari Pahlawan yang jatuh setiap 10 November, Surabaya membangun Tugu Pahlawan di jalan Tembaan, depan kantor gubernur",
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
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoSejarahSurabaya1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoSejarahSurabaya2.class);
                    startActivityForResult(myIntent, 1);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoSejarahSurabaya3.class);
                    startActivityForResult(myIntent, 2);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoSejarahSurabaya4.class);
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