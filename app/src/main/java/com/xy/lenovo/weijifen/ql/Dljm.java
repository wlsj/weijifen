package com.xy.lenovo.weijifen.ql;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.xy.lenovo.weijifen.MainActivity;
import com.xy.lenovo.weijifen.R;

/**
 * Created by Administrator on 2017/1/17.
 */
public class Dljm extends AppCompatActivity {
    private ImageView zc;
    private ImageView ljdl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dljm);
        ActionBar actionbar=getSupportActionBar();
        if (actionbar!=null){
            actionbar.hide();

        }       zc=(ImageView)findViewById(R.id.zc);
        zc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Dljm.this,Zc.class);
                startActivity(intent);
            }
        });

        ljdl=(ImageView) findViewById(R.id.ljdl);
        ljdl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Dljm.this,MainActivity.class);
                startActivity(intent);
            }
        });



    }}
