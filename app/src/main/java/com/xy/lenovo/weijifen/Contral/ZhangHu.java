package com.xy.lenovo.weijifen.Contral;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.xy.lenovo.weijifen.R;

/**
 * Created by 赵文轩 on 2017/1/17.
 */

public class ZhangHu  extends AppCompatActivity {
    private ImageView zhanghu_back;
    private ImageView  button_dingwei;
    private int i=1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shezhi_zhanghu);
        zhanghu_back= (ImageView) findViewById(R.id.zhanghao_back);
        button_dingwei= (ImageView) findViewById(R.id.button_dingwei);
        zhanghu_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        dianji();
    }

    private void dianji() {
        button_dingwei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                if(i%2==0){
                    button_dingwei.setImageResource(R.drawable.ic_anniu);
                }else{
                    button_dingwei.setImageResource(R.drawable.switch_off1);

                }
            }
        });

    }


}
