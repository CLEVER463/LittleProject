package com.android.liusirui.littleproject.util;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.android.liusirui.littleproject.R;

import java.util.List;

/**
 * Created by Thl on 2017/8/13.
 */

public class SeatAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private List<Integer> data;

    public SeatAdapter(Context c, List<Integer> data) {
        this.inflater = LayoutInflater.from(c);
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    static class ViewHolder{
        private View seat;
    }

    @Override
    public View getView(int position , View convertView , ViewGroup parent){
        ViewHolder holder;
        if(convertView == null){
            convertView = inflater.inflate(R.layout.item_seat, null);
            holder = new ViewHolder();
            holder.seat = (View)convertView.findViewById(R.id.btn_seat_symbol);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        Integer type = (Integer) getItem(position);
        switch (type){
            case 0:
                holder.seat.setBackgroundColor(Color.parseColor("#3F51B5"));
                break;
            case 1:
                holder.seat.setBackgroundColor(Color.parseColor("#FF4081"));
                break;
            case -1:
                holder.seat.setBackgroundColor(Color.parseColor("#660000"));
                break;
        }
        return convertView;
    }
}

