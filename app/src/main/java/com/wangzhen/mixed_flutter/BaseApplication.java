package com.wangzhen.mixed_flutter;

import android.app.Application;

import io.flutter.view.FlutterMain;

/**
 * BaseApplication
 * Created by wangzhen on 2019-05-29.
 */
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FlutterMain.startInitialization(this);
    }
}
