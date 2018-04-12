package com.shangxiawang.demotest;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by ASUS on 2018/1/27.
 */

public class TabFragment extends Fragment {

    public static final String TITLE_TAG = "tabTitle";

    private int[] colors = {0xff009999, 0xffc6e2ff, 0xff668b8b, 0xff7A67EE, 0xffCD853F, 0xffEECFA1};

    public static TabFragment newInstance(String tabTitle) {

        Bundle args = new Bundle();

        TabFragment fragment = new TabFragment();
        args.putString(TITLE_TAG, tabTitle);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab, container, false);

        TextView tv = view.findViewById(R.id.tv);
        //设置View背景色
        tv.setBackgroundColor(colors[new Random().nextInt(colors.length)]);
        if (getArguments() != null) {
            tv.setText(getArguments().getString(TITLE_TAG));
        }
        //tv.setTextColor(this.getResources().getColor(R.color.blue));
        return view;
    }
}
