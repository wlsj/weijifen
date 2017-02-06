package com.xy.lenovo.weijifen.ql;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.TextView;

import com.xy.lenovo.weijifen.R;

/**
 * Created by Administrator on 2017/2/6.
 */

public class SetPwdResActivity extends AppCompatActivity {

    private TextView showInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.res);

        showInfo = (TextView)findViewById(R.id.res_info);

        SharedPreferences shareDate = getSharedPreferences("GUE_PWD", 0);

        String pwd = shareDate.getString("GUE_PWD", "NO HAVE PWD !");

        showInfo.setText("设置成成功！您设置的手势密码是："+pwd);
    }
}
