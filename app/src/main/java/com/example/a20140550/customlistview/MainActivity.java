package com.example.a20140550.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private ListView listView;
    private String[] countryName;
    private int[] flags={R.drawable.bicon,R.drawable.iicon,R.drawable.picon,R.drawable.nicon,R.drawable.bhicon};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= (ListView) findViewById(R.id.listviewID);
        countryName=getResources().getStringArray(R.array.country_name);
        CustomAdapter adapter=new CustomAdapter(this,countryName,flags);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value=countryName[position];
                Toast.makeText(MainActivity.this,value+" "+ position,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
