package com.example.administrator.listviewtest;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.administrator.listviewtest.entry.Fruit;

public class MainActivity extends Activity {

    private String[] fruits;
    private Button bt1;
    private ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setData();
        setViews();
        setListeners();
    }

    private void setData() {
        fruits = new String[] {"apple","pear","apricot","peach","banana","pineapple","plum","watermelon","lemon","mango"};
    }

    private void setListeners() {
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //
                String fruit = fruits[i];
                AlertDialog.Builder adb = new AlertDialog.Builder(MainActivity.this);
                adb.setTitle("alert...");
                adb.setMessage("当前选择水果为：" + fruit);
                adb.setCancelable(false);
                adb.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //
                    }
                });
                adb.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //
                    }
                });
                adb.show();
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 启动自定义的listView
                startActivity(new Intent(MainActivity.this,DiyListView.class));
            }
        });
    }

    private void setViews() {
        bt1 = (Button)findViewById(R.id.bt1);
        lv1 = (ListView)findViewById(R.id.lv1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,fruits);
        lv1.setAdapter(adapter);
    }


}
