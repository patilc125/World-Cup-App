package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class customApdater extends ArrayAdapter<CountryModeClass> {
  private  ArrayList<CountryModeClass> countryArraylist;
  Context context;

  public customApdater(ArrayList<CountryModeClass> data, Context context){
    super(context,R.layout.my_list_layout,data);
    this.countryArraylist=data;
    this.context=context;
  }
   private static class ViewHolder {
    TextView countr;
    TextView wins;
    ImageView flagimg;
   }
  @NonNull
  @Override
  public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
    CountryModeClass dataMode=getItem(position);
    ViewHolder viewHolder;

    final View result;
    if(convertView==null){
      viewHolder=new ViewHolder();
      LayoutInflater inflater =LayoutInflater.from(getContext());
      convertView=inflater.inflate(R.layout.my_list_layout,parent,false);
      viewHolder.countr=(TextView) convertView.findViewById(R.id.tv);
      viewHolder.wins=(TextView) convertView.findViewById(R.id.winss);
      viewHolder.flagimg=(ImageView) convertView.findViewById(R.id.cn);
      result =convertView;
      convertView.setTag(viewHolder);
    }else{
      viewHolder=(ViewHolder) convertView.getTag();
      result=convertView;
    }

    viewHolder.countr.setText(dataMode.getCountry_name());
    viewHolder.wins.setText(dataMode.getCountry_win());
    viewHolder.flagimg.setImageResource(dataMode.getFlagimage()); ;
    return convertView;
  }
}
