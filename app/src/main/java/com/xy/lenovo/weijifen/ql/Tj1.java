package com.xy.lenovo.weijifen.ql;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.xy.lenovo.weijifen.R;

/**
 * Created by Administrator on 2017/1/17.
 */
public class Tj1 extends AppCompatActivity {
    private Button tj2;
    private ImageView fhj2;
    private Button tj1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tj1);
        tj2=(Button)findViewById(R.id.tj2);
        tj2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Tj1.this,Tj2.class);
                startActivity(intent);
            }
        });

        fhj2=(ImageView) findViewById(R.id.fhj2);
        fhj2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Tj1.this,Tj.class);
                startActivity(intent);
            }
        });

    }}
