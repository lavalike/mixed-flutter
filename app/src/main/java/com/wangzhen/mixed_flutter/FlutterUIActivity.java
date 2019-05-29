package com.wangzhen.mixed_flutter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wangzhen.mixed_flutter.channel.ChannelManager;

import io.flutter.facade.Flutter;
import io.flutter.view.FlutterView;

/**
 * FlutterUIActivity Flutter UI
 * Created by wangzhen on 2019-05-28.
 */
public class FlutterUIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String route = getIntent().getStringExtra("route");
        FlutterView flutterView = Flutter.createView(this, getLifecycle(), route);
        new ChannelManager(this).initChannel(flutterView);
        setContentView(flutterView);
    }
}
