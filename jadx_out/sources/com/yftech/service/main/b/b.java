package com.yftech.service.main.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Handler;
import android.os.Process;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.yftech.car.audio.CarSoundEffectManager;
import com.yftech.car.audio.ICarSoundEffectCallback;
import com.yftech.car.audio.ICarSoundEffectService;
import com.yftech.car.permission.CarPermission;
import com.yftech.car.utils.PlatformProjectDescribe;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class b extends ICarSoundEffectService.Stub {
    public static final String a = "car_sound_effect";
    private static final String b = "eq_enable";
    private static final String c = "delay_fl";
    private static final String d = "delay_fr";
    private static final String e = "delay_rl";
    private static final String f = "delay_rr";
    private static final String g = "eq_type";
    private static final String h = "dts_enable";
    private static final String i = "dts_type";
    private static final String j = "dts_sound_position";
    private static final String k = "balance_fl";
    private static final String l = "balance_fr";
    private static final String m = "balance_rl";
    private static final String n = "balance_rr";
    private static final String o = "loudness_enable";
    private static final int p = 1;
    private static final int q = 2;
    private com.yftech.service.main.a.e A;
    private com.yftech.service.main.a.b B;
    private int[] r;
    private Context s;
    private float[] w;
    private float[] x;
    private SharedPreferences z;
    private int t = 0;
    private RemoteCallbackList<ICarSoundEffectCallback> u = new RemoteCallbackList<>();
    private boolean v = true;
    private int D = -1;
    private boolean E = false;
    private int F = -1;
    private int G = -1;
    private float H = 0.0f;
    private float I = 0.0f;
    private float J = 0.0f;
    private float K = 0.0f;
    private boolean L = false;
    private float M = 0.0f;
    private float N = 0.0f;
    private float O = 0.0f;
    private float P = 0.0f;
    private com.yftech.service.main.c.b.a C = com.yftech.service.main.c.b.a.a();
    private Handler y = new Handler();

    public b(Context context) throws Throwable {
        this.s = context;
        this.A = com.yftech.service.main.a.a.a(context).b();
        this.B = com.yftech.service.main.a.a.a(context).e();
        com.yftech.service.main.j.a.c("car sound effect service start");
        if (!this.A.a(context)) {
            this.y.postDelayed(new Runnable() { // from class: com.yftech.service.main.b.b.1
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    if (!b.this.A.a(b.this.s)) {
                        b.this.y.postDelayed(this, 200L);
                        return;
                    }
                    b.this.t |= 1;
                    b.this.a();
                }
            }, 200L);
        } else {
            this.t |= 1;
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() throws Throwable {
        com.yftech.service.main.j.a.c("car sound effect service init");
        this.r = this.A.f();
        if (this.r != null) {
            this.w = new float[this.r.length];
            this.x = new float[this.r.length];
        }
        int i2 = 0;
        this.z = this.s.getSharedPreferences(a, 0);
        this.v = this.z.getBoolean(b, this.C.m());
        this.E = this.z.getBoolean(h, this.C.n());
        if (this.B == null && this.E) {
            this.E = false;
            this.z.edit().putBoolean(h, false).commit();
        }
        if (this.v && this.E) {
            com.yftech.service.main.j.a.e("it is open both eq and dts");
            this.E = false;
            this.z.edit().putBoolean(h, false).commit();
        }
        this.D = this.z.getInt(g, this.C.l());
        if (this.r != null) {
            if (PlatformProjectDescribe.getProject() == PlatformProjectDescribe.Project.CA1105) {
                float[] fArrC = this.A.c(1);
                float[] fArrD = this.A.d(1);
                while (i2 < this.r.length) {
                    this.w[i2] = this.z.getFloat(Integer.toString(this.r[i2]), fArrC[i2]);
                    this.x[i2] = this.z.getFloat(Integer.toString(this.r[i2]) + "_Q", fArrD[i2]);
                    i2++;
                }
            } else {
                float[] fArrB = this.A.b();
                float[] fArrC2 = this.A.c();
                float[] fArrD2 = this.A.d();
                float[] fArrE = this.A.e();
                while (i2 < this.r.length) {
                    this.w[i2] = this.z.getFloat(Integer.toString(this.r[i2]), ((fArrB[i2] - fArrC2[i2]) / 2.0f) + fArrC2[i2]);
                    this.x[i2] = this.z.getFloat(Integer.toString(this.r[i2]) + "_Q", ((fArrE[i2] - fArrD2[i2]) / 2.0f) + fArrD2[i2]);
                    i2++;
                }
            }
        }
        this.M = this.z.getFloat(c, this.C.e());
        this.N = this.z.getFloat(d, this.C.f());
        this.O = this.z.getFloat(e, this.C.g());
        this.P = this.z.getFloat(f, this.C.h());
        this.F = this.z.getInt(i, this.C.o());
        this.G = this.z.getInt(j, this.C.p());
        this.H = this.z.getFloat(k, this.C.q());
        this.I = this.z.getFloat(l, this.C.r());
        this.J = this.z.getFloat(m, this.C.s());
        this.K = this.z.getFloat(n, this.C.t());
        this.L = this.z.getBoolean(o, this.C.u());
        if (!this.v) {
            b();
        }
        if (!this.E) {
            c();
        }
        if (this.v) {
            b();
        }
        if (this.E) {
            c();
        }
        this.t |= 2;
        this.y.post(new Runnable() { // from class: com.yftech.service.main.b.b.5
            @Override // java.lang.Runnable
            public void run() {
                com.yftech.service.main.f.a aVarA = com.yftech.service.main.f.a.a();
                if (aVarA == null) {
                    b.this.y.postDelayed(this, 500L);
                } else {
                    aVarA.a(1);
                }
            }
        });
    }

    private boolean a(PrintWriter printWriter, String[] strArr) {
        int i2 = 0;
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        if ("set_eq_enable".equals(strArr[0])) {
            if (CarSoundEffectManager.getInstance().setEQEnable("true".equals(strArr[1]))) {
                printWriter.println("success");
            } else {
                printWriter.println("fail");
            }
        } else if ("set_eq_band".equals(strArr[0])) {
            float[] fArr = new float[this.r.length];
            float[] fArr2 = new float[this.r.length];
            if (!"gains".equals(strArr[1])) {
                printWriter.println("not has gain params");
                return true;
            }
            int i3 = 2;
            int i4 = 0;
            while (i4 < fArr.length) {
                fArr[i4] = Float.parseFloat(strArr[i3]);
                i4++;
                i3++;
            }
            int i5 = i3 + 1;
            if (!"qs".equals(strArr[i3])) {
                printWriter.println("not has q params");
                return true;
            }
            while (i2 < fArr2.length) {
                fArr2[i2] = Float.parseFloat(strArr[i5]);
                i2++;
                i5++;
            }
            if (CarSoundEffectManager.getInstance().setBandValue(fArr, fArr2)) {
                printWriter.println("success");
            } else {
                printWriter.println("fail");
            }
        } else {
            printWriter.println("dumpsys car_sound_effect [cmd] [args...]");
            printWriter.println("\tcmd:");
            printWriter.println("\t\tset_eq_enable:\tdumpsys car_sound_effect set_eq_enable true/false");
            printWriter.println("\t\tset_eq_band:\tdumpsys car_sound_effect set_eq_band gains [...] qs [...]");
        }
        return true;
    }

    private void b() throws Throwable {
        com.yftech.service.main.j.a.c("initEQ");
        if (!this.A.a(this.v)) {
            com.yftech.service.main.j.a.e("init, setEQEnabled failed:" + this.v);
        }
        if (this.v) {
            if (!this.A.e(this.D)) {
                com.yftech.service.main.j.a.e("init, setEQType failed:" + this.D);
            }
            if (this.D == 1 && !this.A.a(this.w, this.x)) {
                com.yftech.service.main.j.a.e("init, setBandValue failed");
            }
        }
        if (!this.A.a(this.M, this.N, this.O, this.P)) {
            com.yftech.service.main.j.a.e("init, set delay fl:" + this.M + ",fr:" + this.N + ",rl:" + this.O + ",rr:" + this.P + ",failed!!");
        }
        if (!this.A.b(this.H, this.I, this.J, this.K)) {
            com.yftech.service.main.j.a.e("init, set balance failed, fl:" + this.H + ", fr:" + this.I + ", rl:" + this.J + ", rr:" + this.K);
        }
        if (!this.A.b(this.L)) {
            com.yftech.service.main.j.a.e("init, set loudness enable failed, " + this.L);
        }
        com.yftech.service.main.j.a.c("initEQ end");
    }

    private void c() throws Throwable {
        com.yftech.service.main.j.a.c("initDTS");
        if (this.B != null) {
            this.B.a(this.E, this.F, this.G);
            if (!this.B.a(this.E)) {
                com.yftech.service.main.j.a.e("init, set dts enable failed:" + this.E);
            }
            if (this.E) {
                if (!this.B.a(this.F)) {
                    com.yftech.service.main.j.a.e("init, set dts type failed:" + this.F);
                }
                if (!this.B.b(this.G)) {
                    com.yftech.service.main.j.a.e("init, set dts sound position failed");
                }
            }
        }
        com.yftech.service.main.j.a.c("initDTS end");
    }

    private boolean d() throws Throwable {
        if ((this.t & 3) == 3 || Binder.getCallingPid() == Process.myPid()) {
            return true;
        }
        com.yftech.service.main.j.a.e("service not ready");
        return false;
    }

    protected void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (a(printWriter, strArr)) {
            return;
        }
        printWriter.println("car sound effect:");
        printWriter.println("init flag:" + this.t);
        printWriter.println("eq enable:" + this.v);
        printWriter.println("eq type:" + this.D);
        printWriter.println("| index | band | gain | q | min | max |");
        float[] fArrB = this.A.b();
        float[] fArrC = this.A.c();
        if (this.r != null) {
            for (int i2 = 0; i2 < this.r.length; i2++) {
                printWriter.println("| " + i2 + "     | " + this.r[i2] + " | " + this.w[i2] + " | " + this.x[i2] + " | " + fArrC[i2] + " | " + fArrB[i2] + " |");
            }
        }
        printWriter.println();
        printWriter.println("delay:");
        printWriter.println("      fl:" + this.M + ",fr:" + this.N + ",rl:" + this.O + ",rr:" + this.P);
        printWriter.println("balance:");
        printWriter.println("      fl:" + this.H + ",fr:" + this.I + ",rl:" + this.J + ",rr:" + this.K);
        StringBuilder sb = new StringBuilder();
        sb.append("loudness enable:");
        sb.append(this.L);
        printWriter.println(sb.toString());
        printWriter.println();
        printWriter.println("dts:");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("is support dts:");
        sb2.append(this.B == null ? "false" : "true");
        printWriter.println(sb2.toString());
        printWriter.println("dts enable:" + this.E);
        printWriter.println("dts type:" + this.F);
        printWriter.println("dts sound position:" + this.G);
        if (this.B != null) {
            this.B.a(printWriter);
        }
        printWriter.println();
        printWriter.println("listener:");
        synchronized (this.u) {
            int iBeginBroadcast = this.u.beginBroadcast();
            while (iBeginBroadcast != 0) {
                iBeginBroadcast--;
                printWriter.println("  " + this.u.getBroadcastItem(iBeginBroadcast));
            }
            this.u.finishBroadcast();
        }
        super.dump(fileDescriptor, printWriter, strArr);
    }

    public float getBalanceMaxValue() throws Throwable {
        com.yftech.service.main.j.a.c("getBalanceMaxValue");
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("getBalanceMaxValue, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (d()) {
            return this.A.j();
        }
        com.yftech.service.main.j.a.e("getBalanceMaxValue, error: not allow invoke");
        return Float.MAX_VALUE;
    }

    public float getBalanceMinValue() throws Throwable {
        com.yftech.service.main.j.a.c("getBalanceMinValue");
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("getBalanceMinValue, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (d()) {
            return this.A.k();
        }
        com.yftech.service.main.j.a.e("getBalanceMinValue, error: not allow invoke");
        return Float.MAX_VALUE;
    }

    public float getBalanceValueFL() throws Throwable {
        com.yftech.service.main.j.a.c("getBalanceValueFL");
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("getBalanceValueFL, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (d()) {
            return this.H;
        }
        com.yftech.service.main.j.a.e("getBalanceValueFL, error: not allow invoke");
        return Float.MAX_VALUE;
    }

    public float getBalanceValueFR() throws Throwable {
        com.yftech.service.main.j.a.c("getBalanceValueFR");
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("getBalanceValueFR, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (d()) {
            return this.I;
        }
        com.yftech.service.main.j.a.e("getBalanceValueFR, error: not allow invoke");
        return Float.MAX_VALUE;
    }

    public float getBalanceValueRL() throws Throwable {
        com.yftech.service.main.j.a.c("getBalanceValueRL");
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("getBalanceValueRL, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (d()) {
            return this.J;
        }
        com.yftech.service.main.j.a.e("getBalanceValueRL, error: not allow invoke");
        return Float.MAX_VALUE;
    }

    public float getBalanceValueRR() throws Throwable {
        com.yftech.service.main.j.a.c("getBalanceValueRR");
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("getBalanceValueRR, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (d()) {
            return this.K;
        }
        com.yftech.service.main.j.a.e("getBalanceValueRR, error: not allow invoke");
        return Float.MAX_VALUE;
    }

    public float[] getBalanceXY() {
        return null;
    }

    public float[] getBandCurQ() throws Throwable {
        com.yftech.service.main.j.a.c("getBandCurQ");
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("getBandCurQ, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (!d()) {
            com.yftech.service.main.j.a.e("getBandCurQ, error: not allow invoke");
            return null;
        }
        if (this.x != null) {
            return this.D == 1 ? Arrays.copyOf(this.x, this.x.length) : this.A.d(this.D);
        }
        com.yftech.service.main.j.a.e("getBandCurQ, not support eq");
        return null;
    }

    public float[] getBandCurValue() throws Throwable {
        com.yftech.service.main.j.a.c("getBandCurValue");
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("getBandCurValue, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (!d()) {
            com.yftech.service.main.j.a.e("getBandCurValue, error: not allow invoke");
            return null;
        }
        if (this.w != null) {
            return this.D == 1 ? Arrays.copyOf(this.w, this.w.length) : this.A.c(this.D);
        }
        com.yftech.service.main.j.a.e("getBandCurValue, not support eq");
        return null;
    }

    public float[] getBandMaxQ() throws Throwable {
        com.yftech.service.main.j.a.c("getBandMaxQ");
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("getBandMaxQ, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (d()) {
            return this.A.e();
        }
        com.yftech.service.main.j.a.e("getBandMaxQ, error: not allow invoke");
        return null;
    }

    public float[] getBandMaxValue() throws Throwable {
        com.yftech.service.main.j.a.c("getBandMaxValue");
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("getBandMaxValue, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (d()) {
            return this.A.b();
        }
        com.yftech.service.main.j.a.e("getBandMaxValue, error: not allow invoke");
        return null;
    }

    public float[] getBandMinQ() throws Throwable {
        com.yftech.service.main.j.a.c("getBandMinQ");
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("getBandMinQ, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (d()) {
            return this.A.d();
        }
        com.yftech.service.main.j.a.e("getBandMinQ, error: not allow invoke");
        return null;
    }

    public float[] getBandMinValue() throws Throwable {
        com.yftech.service.main.j.a.c("getBandMinValue");
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("getBandMinValue, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (d()) {
            return this.A.c();
        }
        com.yftech.service.main.j.a.e("getBandMinValue, error: not allow invoke");
        return null;
    }

    public int[] getBandsHz() throws Throwable {
        com.yftech.service.main.j.a.c("getBandsHz");
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("getBandsHz, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (d()) {
            return this.r;
        }
        com.yftech.service.main.j.a.e("getBandsHz, error: not allow invoke");
        return null;
    }

    public int getDTSSoundPosition() throws Throwable {
        com.yftech.service.main.j.a.c("getDTSSoundPosition");
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("getDTSSoundPosition, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (d()) {
            return this.G;
        }
        com.yftech.service.main.j.a.e("getDTSSoundPosition, error: not allow invoke");
        return -1;
    }

    public int getDTSType() throws Throwable {
        com.yftech.service.main.j.a.c("getDTSType");
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("getDTSType, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (d()) {
            return this.F;
        }
        com.yftech.service.main.j.a.e("getDTSType, error: not allow invoke");
        return -1;
    }

    public float getDelayMaxValue() throws Throwable {
        com.yftech.service.main.j.a.c("getDelayMaxValue");
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("getDelayMaxValue, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (d()) {
            return this.A.g();
        }
        com.yftech.service.main.j.a.e("getDelayMaxValue, error: not allow invoke");
        return Float.MAX_VALUE;
    }

    public float getDelayMinValue() throws Throwable {
        com.yftech.service.main.j.a.c("getDelayMinValue");
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("getDelayMinValue, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (d()) {
            return this.A.h();
        }
        com.yftech.service.main.j.a.e("getDelayMinValue, error: not allow invoke");
        return Float.MAX_VALUE;
    }

    public float getDelayValueFL() throws Throwable {
        com.yftech.service.main.j.a.c("getDelayValueFL");
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("getDelayValueFL, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (d()) {
            return this.M;
        }
        com.yftech.service.main.j.a.e("getDelayValueFL, error: not allow invoke");
        return Float.MAX_VALUE;
    }

    public float getDelayValueFR() throws Throwable {
        com.yftech.service.main.j.a.c("getDelayValueFR");
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("getDelayValueFR, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (d()) {
            return this.N;
        }
        com.yftech.service.main.j.a.e("getDelayValueFR, error: not allow invoke");
        return Float.MAX_VALUE;
    }

    public float getDelayValueRL() throws Throwable {
        com.yftech.service.main.j.a.c("getDelayValueRL");
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("getDelayValueRL, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (d()) {
            return this.O;
        }
        com.yftech.service.main.j.a.e("getDelayValueRL, error: not allow invoke");
        return Float.MAX_VALUE;
    }

    public float getDelayValueRR() throws Throwable {
        com.yftech.service.main.j.a.c("getDelayValueRR");
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("getDelayValueRR, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (d()) {
            return this.P;
        }
        com.yftech.service.main.j.a.e("getDelayValueRR, error: not allow invoke");
        return Float.MAX_VALUE;
    }

    public int getEQType() throws Throwable {
        com.yftech.service.main.j.a.c("getEQType");
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("getEQType, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (d()) {
            return this.D;
        }
        com.yftech.service.main.j.a.e("getEQType, error: not allow invoke");
        return -1;
    }

    public int getSceneSoundEffectType() {
        return 0;
    }

    public boolean isDTSEnable() throws Throwable {
        com.yftech.service.main.j.a.c("isDTSEnable");
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("isDTSEnable, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (d()) {
            return this.E;
        }
        com.yftech.service.main.j.a.e("isDTSEnable, error: not allow invoke");
        return false;
    }

    public boolean isEQEnable() throws Throwable {
        com.yftech.service.main.j.a.c("isEQEnable");
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("isEQEnable, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (d()) {
            return this.v;
        }
        com.yftech.service.main.j.a.e("isEQEnable, error: not allow invoke");
        return false;
    }

    public boolean isLoudnessEnable() throws Throwable {
        com.yftech.service.main.j.a.c("isLoudnessEnable");
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("isLoudnessEnable, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (d()) {
            return this.L;
        }
        com.yftech.service.main.j.a.e("isLoudnessEnable, error: not allow invoke");
        return false;
    }

    public void registerCarSoundEffectCallback(ICarSoundEffectCallback iCarSoundEffectCallback) throws Throwable {
        com.yftech.service.main.j.a.c("registerCarSoundEffectCallback: " + iCarSoundEffectCallback);
        if (CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            this.u.register(iCarSoundEffectCallback);
        } else {
            com.yftech.service.main.j.a.e("registerCarSoundEffectCallback, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
    }

    public boolean setBalance(final float f2, final float f3, final float f4, final float f5) throws Throwable {
        com.yftech.service.main.j.a.c("setBalance, fl:" + f2 + ", fr:" + f3 + ", rl:" + f4 + ", rr:" + f5 + ", pid=" + Binder.getCallingPid());
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("setBalance, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (!d()) {
            com.yftech.service.main.j.a.e("setBalance, error: not allow invoke");
            return false;
        }
        if (this.H == f2 && this.I == f3 && this.J == f4 && this.K == f5) {
            com.yftech.service.main.j.a.c("setBalance, params same");
        }
        if (!this.A.b(f2, f3, f4, f5)) {
            com.yftech.service.main.j.a.e("setBalance, set failed");
            return false;
        }
        this.H = f2;
        this.I = f3;
        this.J = f4;
        this.K = f5;
        this.z.edit().putFloat(k, f2).putFloat(l, f3).putFloat(m, f4).putFloat(n, f5).apply();
        this.y.post(new Runnable() { // from class: com.yftech.service.main.b.b.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (b.this.u) {
                    int iBeginBroadcast = b.this.u.beginBroadcast();
                    while (iBeginBroadcast != 0) {
                        iBeginBroadcast--;
                        try {
                            b.this.u.getBroadcastItem(iBeginBroadcast).onChangedBalanceValue(f2, f3, f4, f5);
                        } catch (RemoteException e2) {
                            e2.printStackTrace();
                        }
                    }
                    b.this.u.finishBroadcast();
                }
            }
        });
        return true;
    }

    public boolean setBalanceXY(float f2, float f3) {
        return false;
    }

    public boolean setBandValue(final float[] fArr, final float[] fArr2) throws Throwable {
        com.yftech.service.main.j.a.c("setBandValue values:" + Arrays.toString(fArr) + ", qs:" + Arrays.toString(fArr2));
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("setBandValue, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (!d()) {
            com.yftech.service.main.j.a.e("setBandValue, error: not allow invoke");
            return false;
        }
        if (!this.v) {
            com.yftech.service.main.j.a.e("setBandValue, eq is disabled, not allow set.");
            return false;
        }
        if (this.r == null) {
            com.yftech.service.main.j.a.e("setBandValue, not support eq");
            return false;
        }
        if (fArr == null || fArr.length != this.r.length || (fArr2 != null && fArr2.length != this.r.length)) {
            com.yftech.service.main.j.a.e("setBandValue, params error");
            return false;
        }
        float[] fArrC = this.A.c();
        float[] fArrB = this.A.b();
        for (int i2 = 0; i2 < fArr.length; i2++) {
            if (fArr[i2] < fArrC[i2] || fArr[i2] > fArrB[i2]) {
                com.yftech.service.main.j.a.e("setBandValue, gain out of range");
                return false;
            }
        }
        if (fArr2 != null) {
            float[] fArrD = this.A.d();
            float[] fArrE = this.A.e();
            for (int i3 = 0; i3 < fArr2.length; i3++) {
                if (fArr2[i3] < fArrD[i3] || fArr2[i3] > fArrE[i3]) {
                    com.yftech.service.main.j.a.e("setBandValue, q out of range");
                    return false;
                }
            }
        }
        if (this.D != 1) {
            if (!this.A.e(1)) {
                com.yftech.service.main.j.a.e("setBandValue, switch to custom type failed");
                return false;
            }
            this.D = 1;
            this.z.edit().putInt(g, 1).commit();
            this.y.post(new Runnable() { // from class: com.yftech.service.main.b.b.7
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (b.this.u) {
                        int iBeginBroadcast = b.this.u.beginBroadcast();
                        while (iBeginBroadcast != 0) {
                            iBeginBroadcast--;
                            try {
                                b.this.u.getBroadcastItem(iBeginBroadcast).onChangedEQType(1, fArr, fArr2);
                            } catch (RemoteException e2) {
                                e2.printStackTrace();
                            }
                        }
                        b.this.u.finishBroadcast();
                    }
                }
            });
        }
        if (Arrays.equals(fArr, this.w) && (fArr2 == null || this.x == null || Arrays.equals(fArr2, this.x))) {
            com.yftech.service.main.j.a.c("setBandValue, value is same");
            return true;
        }
        if (!this.A.a(fArr, fArr2)) {
            com.yftech.service.main.j.a.e("setBandValue, set failed");
            return false;
        }
        SharedPreferences.Editor editorEdit = this.z.edit();
        for (int i4 = 0; i4 < fArr.length; i4++) {
            this.w[i4] = fArr[i4];
            editorEdit.putFloat(Integer.toString(this.r[i4]), fArr[i4]);
            if (fArr2 != null) {
                this.x[i4] = fArr2[i4];
                editorEdit.putFloat(Integer.toString(this.r[i4]) + "_Q", fArr2[i4]);
            }
        }
        editorEdit.commit();
        this.y.post(new Runnable() { // from class: com.yftech.service.main.b.b.8
            @Override // java.lang.Runnable
            public void run() {
                synchronized (b.this.u) {
                    int iBeginBroadcast = b.this.u.beginBroadcast();
                    while (iBeginBroadcast != 0) {
                        iBeginBroadcast--;
                        try {
                            b.this.u.getBroadcastItem(iBeginBroadcast).onChangedBandValue(fArr, fArr2);
                        } catch (RemoteException e2) {
                            e2.printStackTrace();
                        }
                    }
                    b.this.u.finishBroadcast();
                }
            }
        });
        return true;
    }

    public boolean setDTSEnable(final boolean z) throws Throwable {
        com.yftech.service.main.j.a.c("setDTSEnable, enable:" + z);
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("setDTSEnable, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (!d()) {
            com.yftech.service.main.j.a.e("setDTSEnable, error: not allow invoke");
            return false;
        }
        if (this.B == null) {
            com.yftech.service.main.j.a.e("setDTSEnable, not support dts");
            return false;
        }
        if (z && this.v && !setEQEnable(false)) {
            com.yftech.service.main.j.a.e("setDTSEnable failed, close eq failed");
            return false;
        }
        if (this.E == z) {
            StringBuilder sb = new StringBuilder();
            sb.append("setDTSEnable, has ");
            sb.append(z ? "enable" : "disable");
            com.yftech.service.main.j.a.c(sb.toString());
            return true;
        }
        if (!this.B.a(z)) {
            com.yftech.service.main.j.a.e("setDTSEnable failed, set failed");
            return false;
        }
        this.E = z;
        this.z.edit().putBoolean(h, z).commit();
        this.y.post(new Runnable() { // from class: com.yftech.service.main.b.b.11
            @Override // java.lang.Runnable
            public void run() {
                synchronized (b.this.u) {
                    int iBeginBroadcast = b.this.u.beginBroadcast();
                    while (iBeginBroadcast != 0) {
                        iBeginBroadcast--;
                        try {
                            b.this.u.getBroadcastItem(iBeginBroadcast).onChangedDTSEnable(z);
                        } catch (RemoteException e2) {
                            e2.printStackTrace();
                        }
                    }
                    b.this.u.finishBroadcast();
                }
            }
        });
        if (z) {
            setDTSType(this.F);
        }
        return true;
    }

    public boolean setDTSSoundPosition(final int i2) throws Throwable {
        com.yftech.service.main.j.a.c("setDTSSoundPosition, position:" + i2);
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("setDTSSoundPosition, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (!d()) {
            com.yftech.service.main.j.a.e("setDTSSoundPosition, error: not allow invoke");
            return false;
        }
        if (this.B == null) {
            com.yftech.service.main.j.a.e("setDTSSoundPosition, not support dts");
            return false;
        }
        if (!this.E) {
            com.yftech.service.main.j.a.e("setDTSSoundPosition, dts not enable");
            return false;
        }
        if (!this.B.b(i2)) {
            com.yftech.service.main.j.a.e("setDTSSoundPosition, set failed");
            return false;
        }
        this.G = i2;
        this.z.edit().putInt(j, i2).commit();
        this.y.post(new Runnable() { // from class: com.yftech.service.main.b.b.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (b.this.u) {
                    int iBeginBroadcast = b.this.u.beginBroadcast();
                    while (iBeginBroadcast != 0) {
                        iBeginBroadcast--;
                        try {
                            b.this.u.getBroadcastItem(iBeginBroadcast).onChangedDTSSoundPosition(i2);
                        } catch (RemoteException e2) {
                            e2.printStackTrace();
                        }
                    }
                    b.this.u.finishBroadcast();
                }
            }
        });
        return true;
    }

    public boolean setDTSType(final int i2) throws Throwable {
        com.yftech.service.main.j.a.c("setDTSType, type:" + i2);
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("setDTSType, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (!d()) {
            com.yftech.service.main.j.a.e("setDTSType, error: not allow invoke");
            return false;
        }
        if (this.B == null) {
            com.yftech.service.main.j.a.e("setDTSType, not support dts");
            return false;
        }
        if (!this.E) {
            com.yftech.service.main.j.a.e("setDTSType, dts not enable");
            return false;
        }
        if (!this.B.a(i2)) {
            com.yftech.service.main.j.a.e("setDTSType, set failed");
            return false;
        }
        this.F = i2;
        this.z.edit().putInt(i, i2).commit();
        this.y.post(new Runnable() { // from class: com.yftech.service.main.b.b.12
            @Override // java.lang.Runnable
            public void run() {
                synchronized (b.this.u) {
                    int iBeginBroadcast = b.this.u.beginBroadcast();
                    while (iBeginBroadcast != 0) {
                        iBeginBroadcast--;
                        try {
                            b.this.u.getBroadcastItem(iBeginBroadcast).onChangedDTSType(i2);
                        } catch (RemoteException e2) {
                            e2.printStackTrace();
                        }
                    }
                    b.this.u.finishBroadcast();
                }
            }
        });
        return true;
    }

    public boolean setDelayValue(final float f2, final float f3, final float f4, final float f5) throws Throwable {
        com.yftech.service.main.j.a.c("setDelayValue value,fl:" + f2 + ",fr:" + f3 + ",rl:" + f4 + ",rr:" + f5);
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("setDelayValue, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (!d()) {
            com.yftech.service.main.j.a.e("setDelayValue, error: not allow invoke");
            return false;
        }
        if (!this.A.a(f2, f3, f4, f5)) {
            com.yftech.service.main.j.a.e("setDelayValue, set failed");
            return false;
        }
        this.M = f2;
        this.N = f3;
        this.O = f4;
        this.P = f5;
        this.z.edit().putFloat(c, f2).putFloat(d, f3).putFloat(e, f4).putFloat(f, f5).apply();
        this.y.post(new Runnable() { // from class: com.yftech.service.main.b.b.9
            @Override // java.lang.Runnable
            public void run() {
                synchronized (b.this.u) {
                    int iBeginBroadcast = b.this.u.beginBroadcast();
                    while (iBeginBroadcast != 0) {
                        iBeginBroadcast--;
                        try {
                            b.this.u.getBroadcastItem(iBeginBroadcast).onChangedDelayValue(f2, f3, f4, f5);
                        } catch (RemoteException e2) {
                            e2.printStackTrace();
                        }
                    }
                    b.this.u.finishBroadcast();
                }
            }
        });
        return true;
    }

    public boolean setEQEnable(final boolean z) throws Throwable {
        com.yftech.service.main.j.a.c("setEnable enable:" + z);
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("setEQEnable, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (!d()) {
            com.yftech.service.main.j.a.e("setEQEnable, error: not allow invoke");
            return false;
        }
        if (!this.A.a(z)) {
            com.yftech.service.main.j.a.e("setEQEnable, setEQEnable failed");
            return false;
        }
        this.v = z;
        this.z.edit().putBoolean(b, this.v).commit();
        if (z) {
            if (!this.A.e(this.D)) {
                com.yftech.service.main.j.a.e("setEnable, set eq type failed, type:" + this.D);
            }
            if (this.D == 1 && !this.A.a(this.w, this.x)) {
                com.yftech.service.main.j.a.e("setEQEnable, setBandValue failed");
            }
        }
        this.y.post(new Runnable() { // from class: com.yftech.service.main.b.b.6
            @Override // java.lang.Runnable
            public void run() {
                synchronized (b.this.u) {
                    int iBeginBroadcast = b.this.u.beginBroadcast();
                    while (iBeginBroadcast != 0) {
                        iBeginBroadcast--;
                        try {
                            b.this.u.getBroadcastItem(iBeginBroadcast).onChangedEnable(z);
                        } catch (RemoteException e2) {
                            e2.printStackTrace();
                        }
                    }
                    b.this.u.finishBroadcast();
                }
            }
        });
        return true;
    }

    public boolean setEQType(final int i2) throws Throwable {
        final float[] fArrC;
        final float[] fArrD;
        com.yftech.service.main.j.a.c("setEQType, type:" + i2);
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("setEQType, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (!d()) {
            com.yftech.service.main.j.a.e("setEQType, error: not allow invoke");
            return false;
        }
        if (!this.v) {
            com.yftech.service.main.j.a.e("setEQType, eq not enable, can not set eq type.");
            return false;
        }
        if (this.w == null) {
            com.yftech.service.main.j.a.e("setEQType, not support eq");
            return false;
        }
        if (this.D == i2) {
            return true;
        }
        if (!this.A.e(i2)) {
            com.yftech.service.main.j.a.e("setEQType, set failed");
            return false;
        }
        if (i2 == 1 && !this.A.a(this.w, this.x)) {
            com.yftech.service.main.j.a.e("setEQType, set custom band failed");
        }
        this.D = i2;
        if (i2 == 1) {
            fArrC = Arrays.copyOf(this.w, this.w.length);
            fArrD = Arrays.copyOf(this.x, this.x.length);
        } else {
            fArrC = this.A.c(i2);
            fArrD = this.A.d(i2);
        }
        this.z.edit().putInt(g, i2).commit();
        this.y.post(new Runnable() { // from class: com.yftech.service.main.b.b.10
            @Override // java.lang.Runnable
            public void run() {
                synchronized (b.this.u) {
                    int iBeginBroadcast = b.this.u.beginBroadcast();
                    while (iBeginBroadcast != 0) {
                        iBeginBroadcast--;
                        try {
                            b.this.u.getBroadcastItem(iBeginBroadcast).onChangedEQType(i2, fArrC, fArrD);
                        } catch (RemoteException e2) {
                            e2.printStackTrace();
                        }
                    }
                    b.this.u.finishBroadcast();
                }
            }
        });
        return true;
    }

    public boolean setLoudnessEnable(final boolean z) throws Throwable {
        com.yftech.service.main.j.a.c("setLoudnessEnable, enable:" + z);
        if (!CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            com.yftech.service.main.j.a.e("setLoudnessEnable, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
        if (!d()) {
            com.yftech.service.main.j.a.e("setLoudnessEnable, error: not allow invoke");
            return false;
        }
        if (z == this.L) {
            return true;
        }
        if (!this.A.b(z)) {
            com.yftech.service.main.j.a.e("setLoudnessEnable, set fail");
            return false;
        }
        this.L = z;
        this.z.edit().putBoolean(o, z).apply();
        this.y.post(new Runnable() { // from class: com.yftech.service.main.b.b.4
            @Override // java.lang.Runnable
            public void run() {
                synchronized (b.this.u) {
                    int iBeginBroadcast = b.this.u.beginBroadcast();
                    while (iBeginBroadcast != 0) {
                        iBeginBroadcast--;
                        try {
                            b.this.u.getBroadcastItem(iBeginBroadcast).onChangedLoudnessEnable(z);
                        } catch (RemoteException e2) {
                            e2.printStackTrace();
                        }
                    }
                    b.this.u.finishBroadcast();
                }
            }
        });
        return true;
    }

    public boolean setSceneSoundEffectType(int i2) {
        return false;
    }

    public void unregisterCarSoundEffectCallback(ICarSoundEffectCallback iCarSoundEffectCallback) throws Throwable {
        com.yftech.service.main.j.a.c("unregisterCarSoundEffectCallback: " + iCarSoundEffectCallback);
        if (CarPermission.checkPermission(this.s, com.yftech.service.main.b.a.g)) {
            this.u.unregister(iCarSoundEffectCallback);
        } else {
            com.yftech.service.main.j.a.e("unregisterCarSoundEffectCallback, permission not granted");
            throw new SecurityException("require com.yftech.permission.service.main.audio.effect");
        }
    }
}
