package com.adith.wallpaperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_1, btn_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_1 = (Button) findViewById(R.id.btn_wal1);
        btn_2 = (Button) findViewById(R.id.btn_wal2);



        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,ThemeActivity.class);
                String pathpic="btn_1";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });



        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,ThemeActivity.class);
                String pathpic="btn_2";
                i.putExtra("PATH_PICTURE",pathpic);
                startActivity(i);

            }
        });


    }
}
