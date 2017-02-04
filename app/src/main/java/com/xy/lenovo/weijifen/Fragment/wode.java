package com.xy.lenovo.weijifen.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.xy.lenovo.weijifen.Contral.AnQuanZhongXin;
import com.xy.lenovo.weijifen.Contral.GengHuanZhangHao;
import com.xy.lenovo.weijifen.Contral.ZhangHu;
import com.xy.lenovo.weijifen.R;

/**
 * Created by lenovo on 2017/1/17.
 */

public class wode extends Fragment {
    private RelativeLayout zhanghaoguanli;
    private RelativeLayout zhanghu;
    private RelativeLayout  anquanzhongxin;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.wode,container,false);
        zhanghaoguanli= (RelativeLayout)view.findViewById(R.id.zhanghaoguanli);
        zhanghu= (RelativeLayout)view.findViewById(R.id.zhanghu);
        anquanzhongxin= (RelativeLayout)view.findViewById(R.id.AnQuan);

        anquanzhongxin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(),AnQuanZhongXin.class);
                startActivity(intent);
            }
        });
        zhanghaoguanli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(),GengHuanZhangHao.class);
                startActivity(intent);
            }
        });
        zhanghu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(),ZhangHu.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
