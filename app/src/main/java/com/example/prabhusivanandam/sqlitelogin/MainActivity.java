package com.example.prabhusivanandam.sqlitelogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.prabhusivanandam.myapplication.R;

/**
 * Created by Prabhu Sivanandam on 12-Mar-17.
 */

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    TextView tv1,tv2,tv3;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tv1=(TextView)findViewById(R.id.tv1);
        tv2=(TextView)findViewById(R.id.tv2);
        tv3=(TextView)findViewById(R.id.tv3);
        btn1=(Button)findViewById(R.id.btn1);
    }
    public void OnloginClick(View view){
        Intent intent=new Intent(this,Homescreen.class);
        startActivity(intent);

    }
}