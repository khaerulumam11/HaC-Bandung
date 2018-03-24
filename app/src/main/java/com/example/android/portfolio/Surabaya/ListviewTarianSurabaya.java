package com.example.android.portfolio.Surabaya;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.portfolio.AdapterListview;
import com.example.android.portfolio.R;
import com.example.android.portfolio.TarianSurabaya.TablayoutInfoTarianSurabaya1;
import com.example.android.portfolio.TarianSurabaya.TablayoutInfoTarianSurabaya2;
import com.example.android.portfolio.TarianSurabaya.TablayoutInfoTarianSurabaya3;
import com.example.android.portfolio.TarianSurabaya.TablayoutInfoTarianSurabaya4;
import com.example.android.portfolio.TarianSurabaya.TablayoutInfoTarianSurabaya5;

/**
 * Created by nurcahyadiperdana on 11/28/17.
 */

public class ListviewTarianSurabaya extends Activity {

    ListView list;

    String[] itemname = {
            "Tari Batik Pace",
            "Tari Beskalan",
            "Tari Boran",
            "Tari Caping Ngancak",
            "Tari Gandrung Banyuwangi"
    };

    Integer[] imgid = {
            R.mipmap.taribatikpace,
            R.mipmap.taribeskalan,
            R.mipmap.tariboran,
            R.mipmap.taricapingngancak,
            R.mipmap.tarigandrungbanyuwangi,

    };


    String[] textname = {
            "Menurut beberapa sumber, Tari Batik Pace ini diciptakan oleh Anang, yaitu pendiri Sanggar Blarak Pacitan",
            "Tari Beskalan adalah salah satu tarian tradisional dari kabupaten Malang, Jawa Timur. Tarian ini biasanya dipertunjukan pada saat penyambutan tamu besar yang datang ke sana",
            "Tari Boran adalah tarian tradisional dari Lamongan yang menggambarkan kehidupan para penjual nasi boran yang menjajakan dagangannya dan berinteraksi dengan pembeli",
            "Tari Caping Ngancak adalah tarian tradisional dari kabupaten Lamongan, Jawa Timur, yang menggambarkan tentang aktivitas para petani di sawah",
            "Tari Gandrung adalah salah satu jenis tarian tradisional yang berasal dari Banyuwangi, Jawa Timur. Tarian ini merupakan tarian yang dilakukan secara berpasangan antara pria dan wanita",
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
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoTarianSurabaya1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoTarianSurabaya2.class);
                    startActivityForResult(myIntent, 1);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoTarianSurabaya3.class);
                    startActivityForResult(myIntent, 2);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoTarianSurabaya4.class);
                    startActivityForResult(myIntent, 3);
                }
                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoTarianSurabaya5.class);
                    startActivityForResult(myIntent, 4);
                }

            }
        });
    }

}