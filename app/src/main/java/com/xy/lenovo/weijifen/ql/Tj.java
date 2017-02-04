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
public class Tj extends AppCompatActivity {
  private ImageView fhj3;
    private Button tj1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tj);

        tj1=(Button)findViewById(R.id.tj1);
        tj1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Tj.this,Tj1.class);
                startActivity(intent);
            }
        });
        fhj3=(ImageView) findViewById(R.id.fhj3);
        fhj3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Tj.this,Zc.class);
                startActivity(intent);
            }
        });
    }
}
