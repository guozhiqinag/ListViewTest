package com.example.administrator.listviewtest;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends Activity {

    private String[] fruit;
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
        fruit = new String[] {"apple","pear","apricot","peach","banana","pineapple","plum","watermelon","lemon","mango"};
    }

    private void setListeners() {
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

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,fruit);
        lv1.setAdapter(adapter);
    }


}
