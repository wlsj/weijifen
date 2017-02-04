package com.xy.lenovo.weijifen.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.xy.lenovo.weijifen.R;
import com.xy.lenovo.weijifen.zyb.Sousuo;

/**
 * Created by lenovo on 2017/1/17.
 */

public class shangdian  extends Fragment{
    private ImageView img_shousuo;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.shangdian,container,false);
        return view;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        img_shousuo = (ImageView) getActivity().findViewById(R.id.img_sousuo);
        img_shousuo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(),Sousuo.class);
                getContext().startActivity(intent);
            }
        });
    }
}
