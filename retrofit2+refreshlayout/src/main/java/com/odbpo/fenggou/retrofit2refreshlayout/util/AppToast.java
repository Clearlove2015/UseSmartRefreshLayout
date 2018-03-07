package com.odbpo.fenggou.retrofit2refreshlayout.util;

import android.widget.Toast;

import com.odbpo.fenggou.retrofit2refreshlayout.App;

/**
 * @author: zjl
 * @Time: 2018/3/7 14:20
 * @Desc:
 */
public class AppToast {
    public static void show(String content){
        Toast.makeText(App.context,content,Toast.LENGTH_SHORT).show();
    }
}
