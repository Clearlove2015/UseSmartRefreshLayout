package com.odbpo.fenggou.retrofit2refreshlayout;

import android.app.Application;
import android.content.Context;

/**
 * @author: zc
 * @Time: 2018/3/7 14:21
 * @Desc:
 */
public class App extends Application {
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }
}
