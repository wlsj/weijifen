package com.xy.lenovo.weijifen.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xy.lenovo.weijifen.R;

/**
 * Created by lenovo on 2017/1/17.
 */

public class guanli extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.guanli,container,false);
        return view;
    }
}
