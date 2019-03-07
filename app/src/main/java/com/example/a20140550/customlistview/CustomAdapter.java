package com.example.a20140550.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 20140550 on 3/6/2019.
 */

public class CustomAdapter extends BaseAdapter {
    int[] flags;
    String[] countryName;
    Context context;
    private LayoutInflater layoutInflater;
    CustomAdapter(Context context,String[] countryName,int[] flags)
    {
        this.context=context;
        this.countryName=countryName;
        this.flags=flags;
    }
    @Override
    public int getCount() {
        return countryName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null)
        {

         layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         convertView= layoutInflater.inflate(R.layout.sample_view,parent,false);

        }
       ImageView imageView= (ImageView) convertView.findViewById(R.id.imageViewID);
       TextView textView= (TextView) convertView.findViewById(R.id.txtcountrynameID);

        imageView.setImageResource(flags[position]);
        textView.setText(countryName[position]);
        return convertView;
    }
}
