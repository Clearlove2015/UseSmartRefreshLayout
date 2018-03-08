package com.odbpo.fenggou.retrofit2refreshlayout.net;

import com.odbpo.fenggou.retrofit2refreshlayout.bean.Course;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * @author: zc
 * @Time: 2018/3/7 13:17
 * @Desc:
 */
public interface ApiClient {
    @GET("/v2/course/list")
    Observable<Course> getCourseList(@Query("page") int page, @Query("pagesize") int pagesize);
}
