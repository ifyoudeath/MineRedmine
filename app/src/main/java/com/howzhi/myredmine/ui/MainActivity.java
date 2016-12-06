package com.howzhi.myredmine.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.howzhi.myredmine.R;
import com.howzhi.myredmine.network.DefaultClient;
import com.howzhi.myredmine.network.entity.User;
import com.howzhi.myredmine.network.service.UserService;

import rx.Observer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        DefaultClient.execute(UserService.class)
//                .login("zhangruoyi", "Kzwll123!@#").
//                subscribe(new Observer<User>() {
//                    @Override
//                    public void onCompleted() {
//
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//
//                    }
//
//                    @Override
//                    public void onNext(User user) {
//                        if (user == null) {
//
//                        }
//                    }
//                });
    }
}
