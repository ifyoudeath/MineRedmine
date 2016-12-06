package com.howzhi.myredmine.network;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Zhang on 2016/12/6.
 * 通用线程方案
 */

public class DefaultObservable<T> extends Observable<T>{

    /**
     * Creates an Observable with a Function to execute when it is subscribed to.
     * <p>
     * <em>Note:</em> Use {@link #create(OnSubscribe)} to create an Observable, instead of this constructor,
     * unless you specifically have a need for inheritance.
     *
     * @param f {@link OnSubscribe} to be executed when {@link #subscribe(Subscriber)} is called
     */
    protected DefaultObservable(OnSubscribe<T> f) {
        super(f);
        subscribeOn(Schedulers.io());
        observeOn(AndroidSchedulers.mainThread());
    }
}
