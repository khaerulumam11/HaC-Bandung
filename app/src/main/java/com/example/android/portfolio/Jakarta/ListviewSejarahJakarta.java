package com.example.android.portfolio.Jakarta;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.android.portfolio.AdapterListview;
import com.example.android.portfolio.R;
import com.example.android.portfolio.SejarahJakarta.TablayoutInfoSejarahJakarta1;
import com.example.android.portfolio.SejarahJakarta.TablayoutInfoSejarahJakarta2;
import com.example.android.portfolio.SejarahJakarta.TablayoutInfoSejarahJakarta3;
import com.example.android.portfolio.SejarahJakarta.TablayoutInfoSejarahJakarta4;
import com.example.android.portfolio.SejarahJakarta.TablayoutInfoSejarahJakarta5;

/**
 * Created by nurcahyadiperdana on 11/28/17.
 */

public class ListviewSejarahJakarta extends Activity {
    ListView list;

    String[] itemname = {
            "Masjid Istiqlal",
            "Monumen Nasional",
            "Monumen Proklamator",
            "Museum Bahari",
            "Museum Nasional Indonesia"

    };

    Integer[] imgid = {
            R.mipmap.masjidistiqlal,
            R.mipmap.monas,
            R.mipmap.monumenproklamator,
            R.mipmap.museumbahari,
            R.mipmap.museumnasionalindonesia

    };

    String[] textname = {
            "Masjid Istiqlal merupakan sebuah masjid kebanggaan negeri ini yang terletak di pusat ibukota Jakarta",
            "Mengunjungi Monas di sore hari dengan berjalan – jalan atau bersepeda menyusuri taman yang ada di Monas merupakan kegiatan mengasyikan yang bisa Dolaners lakukan",
            "Monumen Proklamator terletak di Jl. Pegangsaan Timur no.56 Jakarta Pusat",
            "Museum Bahari adalah museum yang menyimpan koleksi yang berhubungan dengan kebaharian dan kenelayanan bangsa Indonesia dari Sabang hingga Merauke",
            "Museum Nasional Indinesia merupakan sebuah wisata bersejarah yang masih berada dalam satu kawasan dengan Monumen Nasional",
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
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoSejarahJakarta1.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoSejarahJakarta2.class);
                    startActivityForResult(myIntent, 1);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoSejarahJakarta3.class);
                    startActivityForResult(myIntent, 2);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoSejarahJakarta4.class);
                    startActivityForResult(myIntent, 3);
                }
                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), TablayoutInfoSejarahJakarta5.class);
                    startActivityForResult(myIntent, 4);
                }

            }
        });
    }

}