package com.example.hurryup.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by aayushi on 3/29/14.
 */
public class Adapter extends BaseAdapter {

    private Context mContext;

    public Adapter(Context context) {
        mContext = context;
    }

    public void setData() {

    }
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
