package com.example.android.portfolio.Surabaya;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.portfolio.AdapterListview;
import com.example.android.portfolio.MakananSurabaya.TablayoutInfoMakananSurabaya1;
import com.example.android.portfolio.MakananSurabaya.TablayoutInfoMakananSurabaya2;
import com.example.android.portfolio.MakananSurabaya.TablayoutInfoMakananSurabaya3;
import com.example.android.portfolio.MakananSurabaya.TablayoutInfoMakananSurabaya4;
import com.example.android.portfolio.MakananSurabaya.TablayoutInfoMakananSurabaya5;
import com.example.android.portfolio.R;

/**
 * Created by nurcahyadiperdana on 11/28/17.
 */

public class ListviewMakananSurabaya extends Activity {

    ListView list;

    String[] itemname = {
            "Rawon Setan",
            "Rujak Cingur",
            "Sate Klopo",
            "Sate Lisidu",
            "Tahu Campur Kalasan"

    };

    Integer[] imgid = {
            R.mipmap.rawonsetan,
            R.mipmap.rujakcingur,
            R.mipmap.sateklopo,
            R.mipmap.satelisidu,
            R.mipmap.tahucampurkalasan

    };

    String[] textname = {
            "Apa yang kamu bayangkan jika mendengar kuliner Rawon Setan? terdengar serem dan menakutkan bukan? atau mungkin rasanya sangat pedas? santai saja, bukan itu semua sebab rawon ini dinamakan Rawon Setan",
            "Kuliner yang satu ini menggunakan bahan baku daging yang unik yaitu daging yang berasal dari bagian cingur (hidung) sapi",
            "Sate klopo menggunakan bahan-bahan yang sama seperti sate pada umunya, yaitu dari daging sapi atau daging ayam, dan bukan dari kelapa yang dibuat menjadi sate",
            "Kuliner khas Surabaya yang berikutnya adalah Sate Lisidu. Sate ini terbuat dari daging ayam kampung yang berbentuk pipih",
            "Makanan khas Surabaya yang satu ini termasuk salah satu kuliner terlezat yang sayang untuk dilewatkan jika anda berada di Surabaya",
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
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoMakananSurabaya1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoMakananSurabaya2.class);
                    startActivityForResult(myIntent, 1);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoMakananSurabaya3.class);
                    startActivityForResult(myIntent, 2);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoMakananSurabaya4.class);
                    startActivityForResult(myIntent, 3);
                }
                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoMakananSurabaya5.class);
                    startActivityForResult(myIntent, 4);
                }

            }
        });
    }

}