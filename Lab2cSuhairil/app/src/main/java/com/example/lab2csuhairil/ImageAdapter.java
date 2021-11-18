package com.example.lab2csuhairil;

import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;


public class ImageAdapter extends BaseAdapter {
    private  Context mContext;

    public Integer[] thumbImages = {
            R.drawable.logo1,R.drawable.logo2,R.drawable.logo3,R.drawable.logo4,
            R.drawable.logo5,R.drawable.logo6,R.drawable.logo7,R.drawable.logo8,
            R.drawable.logo9,R.drawable.logo10
    };
     public ImageAdapter(Context c){ mContext = c; }
     public int getCount(){return thumbImages.length; }
     public Object getItem(int position){return null;}
     public long getItemId(int position) {
         return 0;
     }

     public View getView(int position, View convertView, ViewGroup parent){
         ImageView imageView = new ImageView(mContext);
         imageView.setLayoutParams(new GridView.LayoutParams(250,250));
         imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
         imageView.setPadding(8 ,8 ,8 ,8);
         imageView.setImageResource(thumbImages[position]);
         return imageView;
    }
}
