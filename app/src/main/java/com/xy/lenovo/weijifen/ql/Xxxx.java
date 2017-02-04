package com.xy.lenovo.weijifen.ql;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.xy.lenovo.weijifen.MainActivity;
import com.xy.lenovo.weijifen.R;

/**
 * Created by Administrator on 2017/1/17.
 */
public class Xxxx extends AppCompatActivity {
    private ImageView fhj;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xxxx);
        fhj=(ImageView)findViewById(R.id.fhj);
        fhj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Xxxx.this,Q2.class);
                startActivity(intent);
            }
        });
    }
    public void tx(View view){
        Intent intent=new Intent(Xxxx.this,MainActivity.class);
        startActivity(intent);
}
}
