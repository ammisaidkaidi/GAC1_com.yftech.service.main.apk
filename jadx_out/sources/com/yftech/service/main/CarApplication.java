package com.yftech.service.main;

import android.app.Application;
import com.yftech.car.permission.CarPermission;

/* JADX INFO: loaded from: classes.dex */
public class CarApplication extends Application {
    @Override // android.app.Application
    public void onCreate() throws Throwable {
        super.onCreate();
        CarPermission.initAsync("MainService", new Runnable() { // from class: com.yftech.service.main.CarApplication.1
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                com.yftech.service.main.j.a.c("init permission finish");
            }
        });
        com.yftech.service.main.j.a.c("main service application start");
    }

    @Override // android.app.Application
    public void onTerminate() throws Throwable {
        super.onTerminate();
        com.yftech.service.main.j.a.c("main service application exit");
    }
}
