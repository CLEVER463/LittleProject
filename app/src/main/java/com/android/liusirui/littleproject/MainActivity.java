package com.android.liusirui.littleproject;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.android.liusirui.littleproject.util.SeatAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    private List<Integer> data ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initdata();
        gridView = (GridView)findViewById(R.id.seat_figure);
        gridView.setAdapter(new SeatAdapter(getApplicationContext(),data));
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
