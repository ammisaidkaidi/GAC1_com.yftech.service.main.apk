package com.yftech.service.main.a.a.c;

import android.content.Context;
import android.content.SharedPreferences;
import com.yftech.service.main.a.e;
import com.yftech.service.main.a.i;
import java.io.PrintWriter;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements i {
    public static final float a = -5.0f;
    private Context b;
    private e c;

    @Override // com.yftech.service.main.a.i
    public float a(float f, int i) {
        if (f <= 15.0f) {
            return 0.0f;
        }
        if (f >= 150.0f) {
            f = 150.0f;
        }
        switch (i) {
            case 1:
                return Math.round(((f - 15.0f) * 0.0364f) * 10.0f) / 10.0f;
            case 2:
                return Math.round(((f - 15.0f) * 0.0588f) * 10.0f) / 10.0f;
            case 3:
                return Math.round(((f - 15.0f) * 0.1f) * 10.0f) / 10.0f;
            default:
                return 0.0f;
        }
    }

    @Override // com.yftech.service.main.a.i
    public int a(int i, int i2) {
        return i2;
    }

    @Override // com.yftech.service.main.a.i
    public String a() {
        return "AC8015";
    }

    @Override // com.yftech.service.main.a.i
    public void a(PrintWriter printWriter) {
    }

    @Override // com.yftech.service.main.a.i
    public boolean a(int i, float f) throws Throwable {
        int iA = com.yftech.service.main.a.d.a.a(i, f);
        com.yftech.service.main.j.a.c("setAndroidStreamVolume, set android, ret:" + iA + ", type:" + i + ", volume:" + f);
        return iA == 0;
    }

    @Override // com.yftech.service.main.a.i
    public boolean a(int i, boolean z) throws Throwable {
        com.yftech.service.main.j.a.c("muteVolumeByDSPAudio, channel:" + i + ", mute:" + z);
        com.yftech.service.main.c.a.c cVarA = com.yftech.service.main.c.a.b.a().a(i);
        if (!cVarA.d()) {
            boolean zA = this.c.a(i, z);
            com.yftech.service.main.j.a.c("muteVolumeByDSPAudio, set dsp, ret:" + zA + ", channel:" + i + ", mute:" + z);
            return zA;
        }
        int iB = com.yftech.service.main.b.e.a(this.b).b(i);
        com.yftech.service.main.b.e eVarA = com.yftech.service.main.b.e.a(this.b);
        if (z) {
            iB = 0;
        }
        float fB = eVarA.b(i, iB);
        for (com.yftech.service.main.c.a.e eVar : cVarA.j()) {
            com.yftech.service.main.j.a.c("muteVolumeByDSPAudio, set android, ret:" + com.yftech.service.main.a.d.a.a(eVar.a(), fB) + ", type:" + eVar.a() + ", mute:" + z);
        }
        return true;
    }

    @Override // com.yftech.service.main.a.i
    public boolean a(Context context, Collection<com.yftech.service.main.c.a.c> collection, SharedPreferences sharedPreferences) {
        this.b = context;
        this.c = com.yftech.service.main.a.a.a(context).b();
        a(false);
        com.yftech.service.main.a.d.a.a(1, i());
        return true;
    }

    @Override // com.yftech.service.main.a.i
    public boolean a(boolean z) {
        return false;
    }

    @Override // com.yftech.service.main.a.i
    public boolean b(int i, float f) throws Throwable {
        boolean zA = this.c.a(i, f);
        com.yftech.service.main.j.a.c("setDSPVolume, set dsp, ret:" + zA + ", channel:" + i + ", volume:" + f);
        return zA;
    }

    @Override // com.yftech.service.main.a.i
    public boolean b(int i, boolean z) {
        return this.c.b(i, z);
    }

    @Override // com.yftech.service.main.a.i
    public int h() {
        return 0;
    }

    public float i() {
        return -5.0f;
    }
}
