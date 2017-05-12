package com.example.administrator.checkboxpreventerror;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;

import java.util.ArrayList;

import adapters.JavaB;
import adapters.MyAdapter;

/**
 * checkBox防错乱
 */
public class MainActivity extends AppCompatActivity{

    private ListView lv;
    private ArrayList<JavaB> data;
    private CheckBox cb;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    private void initData() {
        data=new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            JavaB javaBean=new JavaB(i,i+"网球");
            data.add(javaBean);
        }
    }

    private void initView() {
        lv = ((ListView) findViewById(R.id.listView));
        adapter=new MyAdapter(data,this,R.layout.item);
        lv.setAdapter(adapter);
    }

}
