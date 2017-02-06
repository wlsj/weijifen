package com.xy.lenovo.weijifen.ql;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xy.lenovo.weijifen.R;

/**
 * Created by Administrator on 2017/1/17.
 */
public class Q1 extends AppCompatActivity {
//    private ImageView q2;
    private LinearLayout nine_con;//九宫格容器

    NinePointLineView nv;//九宫格View

    private TextView q2;

    boolean isSetFirst = false;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);//设置标题不显示
        setContentView(R.layout.q1);
//        q2=(ImageView)findViewById(R.id.q2);
//        q2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(Q1.this,Q2.class);
//                startActivity(intent);
//            }
//        });

        nv = new NinePointLineView(Q1.this);

        nine_con = (LinearLayout)findViewById(R.id.nine_con);

        nine_con.addView(nv);

        q2 =(TextView)findViewById(R.id.q2);

        getSetPwd();

    }
    /**
     * 作用：获取现在密码的设置步骤
     * 作者：坤坤
     * 时间：2014年10月29日 14:20:36
     * */
    public void getSetPwd(){

        SharedPreferences shareDate = getSharedPreferences("GUE_PWD", 0);

        isSetFirst = shareDate.getBoolean("IS_SET_FIRST", false);

        if(!isSetFirst){

            q2.setText("请设置手势密码");

            shareDate.edit().clear().commit();

        }else{

            q2.setText("请再次确认手势密码");

        }

        boolean is_second_error = shareDate.getBoolean("SECOND_ERROR", false);

        if(is_second_error){

            q2.setText("和第一次输入手势密码不一致，重新输入");

        }

    }
}
