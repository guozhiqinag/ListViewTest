package com.example.administrator.listviewtest;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.listviewtest.entry.Fruit;

import java.util.ArrayList;

public class DiyListView extends Activity {

    private ListView lv2;
    private ArrayList<Fruit> fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diy_list_view);

        Toast.makeText(this,"DiyListView.onCreate",Toast.LENGTH_SHORT).show();

        setData();
        setViews();
        setListeners();

    }

    private void setListeners() {
        lv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Fruit fruit = fruits.get(i);

                AlertDialog.Builder adb = new AlertDialog.Builder(DiyListView.this);
                adb.setTitle(fruit.getName());
                adb.setMessage("hello jack");
                adb.setCancelable(false);
                adb.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //
                    }
                });
                adb.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //
                    }
                });
                adb.show();

            }
        });
    }

    private void setViews() {
        lv2 = (ListView)findViewById(R.id.lv2);
        FruitAdapter fruitAdapter = new FruitAdapter(this,R.layout.item,fruits);
        lv2.setAdapter(fruitAdapter);
    }

    private void setData() {
        fruits = new ArrayList<Fruit>();
        // "apple","pear","apricot","peach","banana","pineapple","plum","watermelon","lemon","mango"
        Fruit fruit = new Fruit("apple",R.drawable.a01);
        fruits.add(fruit);
        fruit = new Fruit("pear",R.drawable.a02);
        fruits.add(fruit);
        fruit = new Fruit("apricot",R.drawable.a03);
        fruits.add(fruit);
        fruit = new Fruit("peach",R.drawable.a04);
        fruits.add(fruit);
        fruit = new Fruit("banana",R.drawable.a05);
        fruits.add(fruit);
        fruit = new Fruit("pineapple",R.drawable.a06);
        fruits.add(fruit);
        fruit = new Fruit("plum",R.drawable.a07);
        fruits.add(fruit);
        fruit = new Fruit("watermelon",R.drawable.a08);
        fruits.add(fruit);
        fruit = new Fruit("lemon",R.drawable.a09);
        fruits.add(fruit);
        fruit = new Fruit("mango",R.drawable.a10);
        fruits.add(fruit);
    }
}
