package com.example.nz.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    GridView gridView;
    String[] countryName;
    int[] flags = {R.drawable.afghanistan, R.drawable.albania, R.drawable.algeria, R.drawable.andorra, R.drawable.angola,
            R.drawable.bahrain, R.drawable.bangladesh, R.drawable.belarus, R.drawable.belgium, R.drawable.cambodia, R.drawable.cameroon, R.drawable.canada};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridView);

        countryName = getResources().getStringArray(R.array.country_name);

        CustomAdapter adapter = new CustomAdapter(this,countryName,flags);

        gridView.setAdapter(adapter);
/*
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name = countryName[position].toString();
                Toast.makeText(MainActivity.this,name,Toast.LENGTH_SHORT).show();
            }
        });

        */
    }
}
