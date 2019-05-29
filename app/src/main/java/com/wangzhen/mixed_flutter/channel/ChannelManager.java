package com.wangzhen.mixed_flutter.channel;

import android.app.Activity;
import android.view.Gravity;
import android.widget.Toast;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.view.FlutterView;

/**
 * ChannelManager
 * Created by wangzhen on 2019-05-29.
 */
public class ChannelManager {
    private static final String CHANNEL_NAME = "com.wangzhen.mixed_flutter/ui";
    private Activity activity;

    public ChannelManager(Activity activity) {
        this.activity = activity;
    }

    public void initChannel(FlutterView flutterView) {
        new MethodChannel(flutterView, CHANNEL_NAME).setMethodCallHandler(new MethodChannel.MethodCallHandler() {
            @Override
            public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                methodCall(methodCall, result);
            }
        });
    }

    private void methodCall(MethodCall methodCall, MethodChannel.Result result) {
        if ("back".equals(methodCall.method)) {
            if (activity != null)
                activity.finish();
            result.success(true);
        } else if ("show_toast".equals(methodCall.method)) {
            String msg = (String) methodCall.arguments;
            Toast toast = Toast.makeText(activity, msg, Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        } else {
            result.notImplemented();
        }
    }
}
