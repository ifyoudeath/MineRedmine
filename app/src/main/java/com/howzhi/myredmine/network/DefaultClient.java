package com.howzhi.myredmine.network;

import com.howzhi.myredmine.network.base.BaseService;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

/**
 * Created by Zhang on 2016/12/6.
 */

public class DefaultClient {

    private Retrofit mRetrofit;
    private static OkHttpClient okHttpClient;

    static {
        okHttpClient = new OkHttpClient();
        okHttpClient.interceptors().add(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request request = chain.request();
                Request.Builder builder = request.newBuilder();
                /**
                 *  Todo builder.addHeader();
                 */
                return chain.proceed(builder.build());
            }
        });
    }

    public static <T extends BaseService> T execute(T service) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(service.getUrl())
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        return (T) retrofit.create(service.getClass());
    }
}
