package com.yftech.service.main.h;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public class a extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws Throwable {
        com.yftech.service.main.j.a.c("-------------MainService------BootBroadcastReceiver---------------------------");
        Intent intent2 = new Intent("com.yftech.action.mainservice.start");
        intent2.setPackage(com.yftech.service.main.a.b);
        context.getApplicationContext().startService(intent2);
    }
}
