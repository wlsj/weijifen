package com.xy.lenovo.weijifen.ql;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.jude.rollviewpager.RollPagerView;
import com.jude.rollviewpager.adapter.StaticPagerAdapter;
import com.jude.rollviewpager.hintview.ColorPointHintView;
import com.xy.lenovo.weijifen.R;

/**
 * Created by lenovo on 2017/1/18.
 */

public class MainActivity2 extends AppCompatActivity{
    private FloatingActionButton fab;

    private RollPagerView rollPV = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        fab=(FloatingActionButton)findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,Dljm.class);
                startActivity(intent);
            }
        });


        ActionBar actionbar=getSupportActionBar();
        if (actionbar!=null){
            actionbar.hide();
        }

        rollPV = (RollPagerView) findViewById(R.id.rollPV);
        //设置每个图片的切换时间
//        rollPV.setPlayDelay(3000);
        //设置图片切换动画时间
//        rollPV.setAnimationDurtion(500);
        //设置指示器:
        //rollPV.setHintView(new IconHintView());
        //rollPV.setHintView(new IconHintView(this,R.mipmap.ic_launcher,R.mipmap.ic_launcher));
        rollPV.setHintView(new ColorPointHintView(this,
                getResources().getColor(R.color.colorPrimary),
                Color.WHITE));
        //设置适配器
        rollPV.setAdapter(new RollPagerAdapter());

        //设置每一个图片的点击事件
//        rollPV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(int position) {
//                Toast.makeText(SecondActivity.this, "点击了图片"+position, Toast.LENGTH_SHORT).show();
//
//            }
//        });
    }
    //图片资源
    private int images[] = {
            R.drawable.ydy1,
            R.drawable.ydy2,
            R.drawable.ydy3,
            R.drawable.ydy4
    };
    //适配器
    private class RollPagerAdapter extends StaticPagerAdapter {

        @Override
        public View getView(ViewGroup container, int position) {

            ImageView view=new ImageView(container.getContext());
            //设置图片资源
            view.setImageResource(images[position]);
            //设置高度和宽度
            view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            //设置拉伸方式
            view.setScaleType(ImageView.ScaleType.CENTER_CROP);

            return view;
        }

        @Override
        public int getCount() {
            return images.length;
        }
    }
}
