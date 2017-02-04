package com.xy.lenovo.weijifen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.xy.lenovo.weijifen.Contral.GengHuanZhangHao;
import com.xy.lenovo.weijifen.Contral.WoDeSheZhi;
import com.xy.lenovo.weijifen.Fragment.guanggao;
import com.xy.lenovo.weijifen.Fragment.jifen;
import com.xy.lenovo.weijifen.Fragment.shangdian;
import com.xy.lenovo.weijifen.Fragment.shouye;
import com.xy.lenovo.weijifen.Fragment.yingyong;
import com.xy.lenovo.weijifen.activity.Ssk;
import com.xy.lenovo.weijifen.luoji.TabEntity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fragment> list=new ArrayList<>();
    private String[] mTitles = {"首页", "广告", "应用", "积分","商店"};
    private int[] mIconUnselectIds = {
            R.drawable.ic_home_line, R.drawable.ic_advertising_line,
            R.drawable.ic_application_line, R.drawable.ic_integral_line,
            R.drawable.ic_store_line};
    private int[] mIconSelectIds = {
            R.drawable.ic_home_pink, R.drawable.ic_advertising_pink,
            R.drawable.ic_application_pink, R.drawable.ic_integral_pink,
            R.drawable.ic_store_pink};
    private ArrayList<CustomTabEntity> mTabEntities = new ArrayList<>();
    private ViewPager mViewPager;
    private CommonTabLayout mTabLayout_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionbar=getSupportActionBar();
        if (actionbar!=null){
            actionbar.hide();
        }
        list.add(new shouye());
        list.add(new guanggao());
        list.add(new yingyong());
        list.add(new jifen());
        list.add(new shangdian());
        for (int i = 0; i < mTitles.length; i++) {
            mTabEntities.add(new TabEntity(mTitles[i], mIconSelectIds[i], mIconUnselectIds[i]));
        }
        mViewPager = (ViewPager) findViewById( R.id.vp_2);
        mViewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager(),list));
        mTabLayout_2 = (CommonTabLayout) findViewById( R.id.tl_2);
        tl_2();
    }

    private void tl_2() {
        mTabLayout_2.setTabData(mTabEntities);
        mTabLayout_2.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                mViewPager.setCurrentItem(position);
            }

            public void onTabReselect(int position) {
            }
        });

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                mTabLayout_2.setCurrentTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        mViewPager.setCurrentItem(0);
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {
        private List<Fragment> list;
        public MyPagerAdapter(FragmentManager fm, List<Fragment> list) {
            super(fm);
            this.list=list;
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTitles[position];
        }

        @Override
        public Fragment getItem(int position) {
            return list .get(position);
        }
    }
    public void onclick1(View view){
        Intent intent=new Intent(MainActivity.this, Ssk.class);
        startActivity(intent);

    }
    public void SheZhi(View view) {
        Intent intent=new Intent(MainActivity.this,WoDeSheZhi.class);
        startActivity(intent);
    }

    public void button_genghuan(View view) {
        Intent intent=new Intent(MainActivity.this,GengHuanZhangHao.class);
        startActivity(intent);
    }

}

