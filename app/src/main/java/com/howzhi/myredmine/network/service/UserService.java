package com.howzhi.myredmine.network.service;

import com.howzhi.myredmine.network.base.BaseService;

/**
 * Created by Zhang on 2016/12/6.
 */

public abstract class UserService implements BaseService {
    public static final String BASE_URL = "http://redmine.howzhi.net:8080/users/";

    @Override
    public String getUrl() {
        return BASE_URL;
    }


}
