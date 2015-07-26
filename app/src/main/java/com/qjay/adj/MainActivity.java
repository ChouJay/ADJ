package com.qjay.adj;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static String areasJson = "";
    private static List<AreasBean> areasBeans1;
    private static List<AreasBean> areasBeans2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        areasJson = getString(R.string.json);
        findViewById(R.id.btn_testGsonParseJsonToObject).setOnClickListener(this);
        findViewById(R.id.btn_testFastJsonParseJsonToObject).setOnClickListener(this);
        findViewById(R.id.btn_testGsonParseObjectToJson).setOnClickListener(this);
        findViewById(R.id.btn_testFastJsonParseObjectToJson).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            /**测试Gson解析Json成对象*/
            case R.id.btn_testGsonParseJsonToObject:
                testGsonParseJsonToObject();
                break;
            /**测试FastJson解析Json成对象*/
            case R.id.btn_testFastJsonParseJsonToObject:
                testFastJsonParseJsonToObject();
                break;
            /**测试Gson解析对象成Json*/
            case R.id.btn_testGsonParseObjectToJson:
                testGsonParseObjectToJson();
                break;
            /**测试FastJson解析对象成Json*/
            case R.id.btn_testFastJsonParseObjectToJson:
                testFastJsonParseObjectToJson();
                break;
        }
    }

    /**
     * 测试用 Gson 解析 Json 数据成对象
     */
    private static void testGsonParseJsonToObject() {
        final long time0 = System.currentTimeMillis();
        Gson gson = new Gson();
        final Type type = new TypeToken<List<AreasBean>>() {
        }.getType();
        for (int i = 0; i < 10; i++) {
            areasBeans1 = gson.fromJson(areasJson, type);
        }
        Log.d("Test Json", "Gson：testGsonParseJsonToObject time = " + (System.currentTimeMillis() - time0));
    }

    /**
     * 测试用 FastJson 解析 Json 数据成对象
     */
    private static void testFastJsonParseJsonToObject() {
        final long time0 = System.currentTimeMillis();
        final Class<AreasBean> areasBeanClass = AreasBean.class;
        for (int i = 0; i < 10; i++) {
            areasBeans2 = JSON.parseArray(areasJson, areasBeanClass);
        }
        Log.d("Test Json", "FastJson：testFastJsonParseJsonToObject time = " + (System.currentTimeMillis() - time0));
    }

    /**
     * 测试用 Gson 将对象解析 Json 数据
     */
    private static void testGsonParseObjectToJson() {
        final long time0 = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            String jsonString = new Gson().toJson(areasBeans1);
        }
        Log.d("Test Json", "Gson：testGsonParseObjectToJson time = " + (System.currentTimeMillis() - time0));
    }

    /**
     * 测试用 FastJson 将对象解析 Json 数据
     */
    private static void testFastJsonParseObjectToJson() {
        final long time0 = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            String jsonString = JSON.toJSONString(areasBeans2);
        }
        Log.d("Test Json", "FastJson：testFastJsonParseObjectToJson time = " + (System.currentTimeMillis() - time0));
    }
}
