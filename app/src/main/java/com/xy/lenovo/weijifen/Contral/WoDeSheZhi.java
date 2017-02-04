package com.xy.lenovo.weijifen.Contral;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.xy.lenovo.weijifen.R;

/**
 * Created by 赵文轩 on 2017/1/17.
 */
public class WoDeSheZhi extends AppCompatActivity {
    private ImageView image_back;
    private ImageView  button_open1,button_open2,button_open3;
    private RelativeLayout BanBen;
    private RelativeLayout WoDeShezhi;
    private int i=1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wode_shezhi);
        initView();
        dianjishijian();
    }
    private void initView() {
        image_back= (ImageView) findViewById(R.id.shezhi_back);
        button_open1= (ImageView) findViewById(R.id.button_open1);
        button_open2= (ImageView) findViewById(R.id.button_open2);
        button_open3= (ImageView) findViewById(R.id.button_open3);
        BanBen= (RelativeLayout) findViewById(R.id.Banben);
        WoDeShezhi= (RelativeLayout) findViewById(R.id.guanyuwomen);
    }
    private void dianjishijian() {
        image_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        button_open1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                if(i%2==0){
                    button_open1.setImageResource(R.drawable.ic_anniu);
                }else{
                    button_open1.setImageResource(R.drawable.switch_off1);

                }

            }
        });
        button_open2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                if(i%2==0){
                    button_open2.setImageResource(R.drawable.ic_anniu);
                }else{
                    button_open2.setImageResource(R.drawable.switch_off1);

                }
            }
        });
        button_open3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                if(i%2==0){
                    button_open3.setImageResource(R.drawable.ic_anniu);
                }else{
                    button_open3.setImageResource(R.drawable.switch_off1);
                }
            }
        });
        BanBen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(WoDeSheZhi.this,SheZhiBanBen.class);
                startActivity(intent);
            }
        });
        WoDeShezhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(WoDeSheZhi.this,SheZhiGuanYu.class);
                startActivity(intent);
            }
        });
    }
}
