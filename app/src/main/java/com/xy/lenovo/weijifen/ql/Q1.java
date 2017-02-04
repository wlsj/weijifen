package com.xy.lenovo.weijifen.ql;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.xy.lenovo.weijifen.R;

/**
 * Created by Administrator on 2017/1/17.
 */
public class Q1 extends AppCompatActivity {
    private ImageView q2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q1);
        q2=(ImageView)findViewById(R.id.q2);
        q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Q1.this,Q2.class);
                startActivity(intent);
            }
        });

    }
}
