package com.xy.lenovo.weijifen.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.flyco.tablayout.SegmentTabLayout;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.xy.lenovo.weijifen.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2017/1/17.
 */

public class jifen extends Fragment {
    private final String[] title={"账户余额","信用查看","转账支付","积分记录","我的"};
    private ViewPager viewPager;
    private SegmentTabLayout slidingTabLayout;
    private ArrayList<Fragment> mFragments = new ArrayList<>();
    private Adapter mAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.jifen,container,false);
        mFragments.add(new yue());
        mFragments.add(new chakan());
        mFragments.add(new zhifu());
        mFragments.add(new jilu());
        mFragments.add(new wode());
        viewPager = (ViewPager) view.findViewById(R.id.ji2);
        mAdapter = new Adapter(getChildFragmentManager(),mFragments);
        viewPager.setAdapter(mAdapter);
        slidingTabLayout = (SegmentTabLayout) view.findViewById(R.id.ji1);
        slidingTabLayout.setTabData(title);
        t1();
        return view;
    }
    public void t1(){
        slidingTabLayout.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                viewPager.setCurrentItem(position);
            }

            @Override
            public void onTabReselect(int position) {

            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                slidingTabLayout.setCurrentTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        viewPager.setCurrentItem(0);
    }
    public class Adapter extends FragmentPagerAdapter {
        private List<Fragment> fragmentList;
        public Adapter(FragmentManager fm, List<Fragment> fragmentList) {
            super(fm);
            this.fragmentList=fragmentList;
        }
        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return title[position];
        }
    }

}
