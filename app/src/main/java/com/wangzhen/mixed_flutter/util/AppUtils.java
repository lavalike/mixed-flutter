package com.wangzhen.mixed_flutter.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/**
 * AppUtils
 * Created by wangzhen on 2019-05-29.
 */
public class AppUtils {
    /**
     * 通过Context获取真正的Activity
     *
     * @param ctx context
     * @return activity
     */
    public static Activity getRealActivity(Context ctx) {
        while (ctx instanceof ContextWrapper) {
            if (ctx instanceof Activity) {
                return (Activity) ctx;
            }
            ctx = ((ContextWrapper) ctx).getBaseContext();
        }
        return null;
    }
}
