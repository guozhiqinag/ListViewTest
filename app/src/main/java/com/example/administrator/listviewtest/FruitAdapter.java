package com.example.administrator.listviewtest;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.listviewtest.entry.Fruit;

import java.util.List;

/**
 * Created by Administrator on 2016/8/18.
 */
public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resourceId;

    public FruitAdapter(Context context, int resource, List<Fruit> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fruit fruit = getItem(position);
        ViewHold vh;
        View view;

        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, null);
            vh = new ViewHold();
            vh.iv = (ImageView) view.findViewById(R.id.imageView);
            vh.tv = (TextView) view.findViewById(R.id.textView);
            view.setTag(vh);
        } else {
            view = convertView;
            vh = (ViewHold) view.getTag();
        }

        vh = (ViewHold) view.getTag();
        vh.iv.setImageResource(fruit.getImg());
        vh.tv.setText(fruit.getName());

        return view;
    }

    class ViewHold {
        ImageView iv;
        TextView tv;
    }
}
