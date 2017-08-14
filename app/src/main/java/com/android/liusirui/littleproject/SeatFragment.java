package com.android.liusirui.littleproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.android.liusirui.littleproject.util.SeatAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class SeatFragment extends Fragment {

    private GridView gridView;
    private List<Integer> data ;

    public SeatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_seat, container, false);
        initdata();
        gridView = (GridView) view.findViewById(R.id.seat_figure);
        gridView.setAdapter(new SeatAdapter(getContext(),data));
        return view;
    }

    private void initdata(){
        data = new ArrayList<>();
        for(int i=0;i<10;i++){
            data.add(0);
            data.add(1);
            data.add(-1);
            data.add(0);
        }
    }

}
