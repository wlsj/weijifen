package com.xy.lenovo.weijifen.luoji;

import com.flyco.tablayout.listener.CustomTabEntity;

/**
 * Created by lenovo on 2017/1/17.
 */

public class TabEntitys implements CustomTabEntity {
    public String title;

    public TabEntitys(String title) {
        this.title = title;

    }
    @Override
    public String getTabTitle() {
        return title;
    }

    @Override
    public int getTabSelectedIcon() {
        return 0;
    }

    @Override
    public int getTabUnselectedIcon() {
        return 0;
    }
}
