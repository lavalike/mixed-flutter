package com.wangzhen.mixed_flutter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_flutter_detail).setOnClickListener(this);
        findViewById(R.id.btn_flutter2).setOnClickListener(this);
        findViewById(R.id.btn_flutter3).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_flutter_detail:
                openFlutter("detail_page");
                break;
            case R.id.btn_flutter2:
                openFlutter("route2");
                break;
            case R.id.btn_flutter3:
                openFlutter("route3");
                break;
        }
    }

    private void openFlutter(String params) {
        Intent intent = new Intent(this, FlutterUIActivity.class);
        intent.putExtra("route", params);
        startActivity(intent);
    }
}
