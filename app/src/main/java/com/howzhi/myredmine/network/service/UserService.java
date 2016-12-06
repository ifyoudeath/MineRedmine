package com.howzhi.myredmine.network.service;

import com.howzhi.myredmine.network.entity.User;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Zhang on 2016/12/6.
 */

public interface UserService{

    @GET("users/current.json")
    Observable<User> login(@Query("username") String username
            , @Query("password") String password);

    @GET("users/3.json")
    Observable<User> info();

}
