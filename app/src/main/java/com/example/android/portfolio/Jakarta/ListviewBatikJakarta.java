package com.example.android.portfolio.Jakarta;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.portfolio.AdapterListview;
import com.example.android.portfolio.R;
import com.example.android.portfolio.BatikJakarta.TablayoutInfoBatikJakarta1;
import com.example.android.portfolio.BatikJakarta.TablayoutInfoBatikJakarta2;
import com.example.android.portfolio.BatikJakarta.TablayoutInfoBatikJakarta3;
import com.example.android.portfolio.BatikJakarta.TablayoutInfoBatikJakarta4;
import com.example.android.portfolio.BatikJakarta.TablayoutInfoBatikJakarta5;

/**
 * Created by nurcahyadiperdana on 11/28/17.
 */

public class ListviewBatikJakarta extends Activity {

    ListView list;

    String[] itemname = {
            "Batik Ciliwung",
            "Batik Nusa Kelapa",
            "Batik Rasamala",
            "Batik Salakanegara",
            "Batik Ondel-Ondel"

    };

    Integer[] imgid = {
            R.mipmap.batikciliwung,
            R.mipmap.batiknusakelapa,
            R.mipmap.batikrasamala,
            R.mipmap.batiksalakanegara,
            R.mipmap.batikondelondel

    };

    String[] textname = {
            "Batik Betawi Motif Ciliwung bermula dari peradaban manusia di tepian Sungai Ciliwung.",
            "Ide pembuatan Batik Betawi Motif Nusa Kelapa terinspirasi dari Peta Ceila yang dibuat pada masa kekuasaan Prabu Siliwangi 1482-1521.",
            "Batik Betawi Motif Rasamala mengisahkan ketika Belanda mulai memasuki wilayah Sunda Kelapa.",
            "Melalui Motif Salakanegara, Batik Betawi ingin bercerita tentang kerajaan pertama di tanah Betawi yang didirikan oleh Aki Tirem",
            "Motif Ondel-ondel pada Batik Betawi diangkat dari figur Ondel-ondel yang digunakan sebagai boneka penolak bala.",
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
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoBatikJakarta1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoBatikJakarta2.class);
                    startActivityForResult(myIntent, 1);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoBatikJakarta3.class);
                    startActivityForResult(myIntent, 2);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoBatikJakarta4.class);
                    startActivityForResult(myIntent, 3);
                }
                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoBatikJakarta5.class);
                    startActivityForResult(myIntent, 4);
                }

            }
        });
    }

}