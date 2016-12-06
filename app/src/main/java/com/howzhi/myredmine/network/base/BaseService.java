package com.howzhi.myredmine.network.base;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by DEL on 2016/12/5.
 */

public interface BaseService {
    String getUrl();
}
