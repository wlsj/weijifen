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
public class Zc extends AppCompatActivity {
   private ImageView fhj4;
    private Button tj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zc);

        tj=(Button)findViewById(R.id.tj);
        tj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Zc.this,Tj.class);
                startActivity(intent);
            }
        });
        fhj4=(ImageView) findViewById(R.id.fhj4);
        fhj4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Zc.this,Dljm.class);
                startActivity(intent);
            }
        });

    }
}
