package com.xy.lenovo.weijifen.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xy.lenovo.weijifen.R;
import com.xy.lenovo.weijifen.zyb.Fragment_a;
import com.xy.lenovo.weijifen.zyb.Fragment_b;
import com.xy.lenovo.weijifen.zyb.Fragment_c;
import com.xy.lenovo.weijifen.zyb.Fragment_d;
import com.xy.lenovo.weijifen.zyb.Fragment_e;
import com.xy.lenovo.weijifen.zyb.GuangGao_Adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/1/17.
 */

public class guanggao extends Fragment {
    private TabLayout tab_layout;
    private ViewPager vp_layout;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view =inflater.inflate(R.layout.guanggao,container,false);
        super.onActivityCreated(savedInstanceState);
        tab_layout = (TabLayout) view.findViewById(R.id.tab_layout);
        vp_layout = (ViewPager) view.findViewById(R.id.vp_layout);
        List<String> strings = new ArrayList<>();
        strings.add("未完成广告");
        strings.add("推荐广告");
        strings.add("我的订阅");
        strings.add("我的收藏");
        strings.add("缓存广告");
        tab_layout.addTab(tab_layout.newTab().setText(strings.get(0)));
        tab_layout.addTab(tab_layout.newTab().setText(strings.get(1)));
        tab_layout.addTab(tab_layout.newTab().setText(strings.get(2)));
        tab_layout.addTab(tab_layout.newTab().setText(strings.get(3)));
        tab_layout.addTab(tab_layout.newTab().setText(strings.get(4)));
        List<Fragment> flist = new ArrayList<>();
        flist.add(new Fragment_a());
        flist.add(new Fragment_b());
        flist.add(new Fragment_c());
        flist.add(new Fragment_d());
        flist.add(new Fragment_e());
        GuangGao_Adapter adapter = new GuangGao_Adapter(getActivity().getSupportFragmentManager(),flist,strings);
        vp_layout.setAdapter(adapter);
        tab_layout.setupWithViewPager(vp_layout);
        tab_layout.setTabsFromPagerAdapter(adapter);
        return view;
    }
}
