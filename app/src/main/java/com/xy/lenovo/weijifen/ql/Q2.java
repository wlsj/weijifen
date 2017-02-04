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
public class Q2 extends AppCompatActivity {
    private ImageView fhj1;
    private Button xxxx;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.q2);
        xxxx=(Button)findViewById(R.id.xxxx);
        xxxx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Q2.this,Xxxx.class);
                startActivity(intent);
            }
        });
        fhj1=(ImageView)findViewById(R.id.fhj1);
        fhj1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Q2.this,Tj1.class);
                startActivity(intent);
            }
        });


    }
}
