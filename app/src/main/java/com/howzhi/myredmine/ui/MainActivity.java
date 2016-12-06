package com.howzhi.myredmine.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.howzhi.myredmine.R;
import com.howzhi.myredmine.network.DefaultClient;
import com.howzhi.myredmine.network.entity.User;
import com.howzhi.myredmine.network.service.UserService;
import com.howzhi.myredmine.ui.activity.BaseActivity;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DefaultClient.execute(UserService.class)
                .login("zhangruoyi", "Kzwll123!@#")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<User>() {
                    @Override
                    public void onCompleted() {
                        Log.e("a", "a");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("a", "a");
                    }

                    @Override
                    public void onNext(User user) {
                        user = new User();
                    }
                });
    }
}
