package com.example.android.portfolio.Jakarta;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.portfolio.AdapterListview;
import com.example.android.portfolio.MakananJakarta.TablayoutInfoMakananJakarta1;
import com.example.android.portfolio.MakananJakarta.TablayoutInfoMakananJakarta2;
import com.example.android.portfolio.MakananJakarta.TablayoutInfoMakananJakarta3;
import com.example.android.portfolio.MakananJakarta.TablayoutInfoMakananJakarta4;
import com.example.android.portfolio.MakananJakarta.TablayoutInfoMakananJakarta5;
import com.example.android.portfolio.R;

/**
 * Created by nurcahyadiperdana on 11/28/17.
 */

public class ListviewMakananJakarta extends Activity {

    ListView list;

    String[] itemname = {
            "Asinan Betawi",
            "Kembang Goyang",
            "Kerak Telor",
            "Kue Rangi",
            "Toge Goreng"

    };

    Integer[] imgid = {
            R.mipmap.asinanbetawi,
            R.mipmap.kembanggoyang,
            R.mipmap.keraktelor,
            R.mipmap.kuerangi,
            R.mipmap.togegoreng

    };

    String[] textname = {
            "Di Indonesia, terkenal dua jenis asinan yakni asinan Bogor dan asinan Betawi. Asinan bogor umumnya menggunakan buah-buahan tropis dan jarang yang menggunakan sayur",
            "Kue kembang goyang adalah makanan khas Betawi berikutnya yang bisa kamu coba. Kue ini dinamakan kembang goyang karena bentuknya yang seperti bunga kembang dan dibuat dengan cara digoyang-goyang ",
            "Untuk yang pertama, kamu mungkin sudah tidak asing dengan makanan ini, Namanya kerak telor",
            "Belum beranjak dari bahasan kue khas Betawi, kali ini ada kue rangi atau sagu rangi yang juga termasuk salah satu kue traidisonal dari Betawi",
            "Toge goreng saat ini masih banyak di jual di kawasan ibukota. Biasanya makanan khas orang Betawi ini bisa ditemukan di pinggiran jalan atau saat festival-festival tertentu",
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
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoMakananJakarta1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoMakananJakarta2.class);
                    startActivityForResult(myIntent, 1);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoMakananJakarta3.class);
                    startActivityForResult(myIntent, 2);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoMakananJakarta4.class);
                    startActivityForResult(myIntent, 3);
                }
                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoMakananJakarta5.class);
                    startActivityForResult(myIntent, 4);
                }

            }
        });
    }

}