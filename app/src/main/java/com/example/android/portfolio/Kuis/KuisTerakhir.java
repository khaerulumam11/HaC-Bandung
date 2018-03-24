package com.example.android.portfolio.Kuis;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.portfolio.R;

public class KuisTerakhir extends AppCompatActivity {

    private EditText a;
    private TextView bd,e;
    private Button c;
    private ImageView d;
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis_terakhir);

        a = (EditText) findViewById(R.id.jawaban);
        bd = (TextView) findViewById(R.id.pertanyaan);
        c = (Button) findViewById(R.id.submit);
        d = (ImageView) findViewById(R.id.image);
        e = (TextView) findViewById(R.id.skor);

        final String b = getIntent().getStringExtra("score");

        d.setImageResource(R.mipmap.batikbinarikawung);
        bd.setText("Apa nama batik ini ?");

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jwb = a.getText().toString();



                if (jwb.equals("Batik Binari Kawung")|| jwb.equals("Binari Kawung")){

                    int skor1 = Integer.parseInt(b) +10;

                    AlertDialog.Builder myAlertDialog = new AlertDialog.Builder(KuisTerakhir.this);
                    myAlertDialog.setTitle("Hasil");
                    myAlertDialog.setMessage("Skor kamu : "+skor1);

                    myAlertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent ab = new Intent(KuisTerakhir.this,KuisTerakhir.class);
                            startActivity(ab);
                        }
                    });

                    myAlertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(getApplicationContext(),"Pressed Cancel",Toast.LENGTH_SHORT).show();
                        }
                    });
                    myAlertDialog.show();
                }
            else
                {

                    AlertDialog.Builder myAlertDialog = new AlertDialog.Builder(KuisTerakhir.this);
                    myAlertDialog.setTitle("Hasil");
                    myAlertDialog.setMessage("Yakin dengan jawaban anda ?");

                    myAlertDialog.setPositiveButton("Skor kamu : "+b, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent ab = new Intent(KuisTerakhir.this,KuisTerakhir.class);
                            startActivity(ab);
                        }
                    });

                    myAlertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(getApplicationContext(),"Pressed Cancel",Toast.LENGTH_SHORT).show();
                        }
                    });
                    myAlertDialog.show();
                }
            }
        });
    }
}
