package com.example.jsondemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        try {
//            InputStreamReader isr = new InputStreamReader(getAssets().open("test.json"),"UTF-8");
//            BufferedReader br = new BufferedReader(isr);
//            String line;
//            StringBuilder builder = new StringBuilder();
//            while ((line = br.readLine()) != null){
//                builder.append(line);
//            }
//            br.close();
//            isr.close();
//            JSONObject root = new JSONObject(builder.toString());
//            JSONArray array = root.getJSONArray("comments");
//            for (int i = 0;i < array.length();i++){
//                JSONObject array1 = array.getJSONObject(i);
//                System.out.println("-------------->");
//                System.out.println("id=" + array1.getInt("id"));
//                System.out.println("author=" + array1.getString("author"));
//                System.out.println("url=" + array1.getString("url"));
//                System.out.println("content=" + array1.getString("content"));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        JSONObject root = new JSONObject();
        try {
            JSONObject json = new JSONObject();
            json.put("id",1);
            json.putOpt("author","someone1");
            json.putOpt("url","http://someone1.x2design.net");
            json.putOpt("content","hello");

            JSONObject json1 = new JSONObject();
            json1.put("id",2);
            json1.putOpt("author","someone2");
            json1.putOpt("url","http://someone2.x2design.net");
            json1.putOpt("content","hello word");

            JSONObject json2 = new JSONObject();
            json2.put("id",3);
            json2.putOpt("author","someone3");
            json2.putOpt("url","http://someone3.x2design.net");
            json2.putOpt("content","hello luoxiaojian");

            JSONArray array = new JSONArray();
            array.put(json);
            array.put(json1);
            array.put(json2);

            root.put("comments",array);

            System.out.println(root.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
