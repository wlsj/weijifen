package com.xy.lenovo.weijifen.zyb;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by LENOVO on 2017/1/17.
 */

public class GuangGao_Adapter extends FragmentStatePagerAdapter {

    private List<Fragment> flist;
    private List<String> slist;
    public GuangGao_Adapter(FragmentManager fm, List<Fragment> flist, List<String> slist) {
        super(fm);
        this.flist = flist;
        this.slist = slist;
    }

    @Override
    public Fragment getItem(int position) {
        return flist.get(position);
    }

    @Override
    public int getCount() {
        return flist.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return slist.get(position);
    }
}
