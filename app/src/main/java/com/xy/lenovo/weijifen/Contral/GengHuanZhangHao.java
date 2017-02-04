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

public class GengHuanZhangHao  extends AppCompatActivity {
    private ImageView genghuan_back;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shezhi_genghuan);
        genghuan_back= (ImageView) findViewById(R.id.genghuan_back);
        genghuan_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
