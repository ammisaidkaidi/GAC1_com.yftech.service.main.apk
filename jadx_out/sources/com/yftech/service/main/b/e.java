package com.yftech.service.main.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemProperties;
import com.yftech.car.utils.PlatformProjectDescribe;
import com.yftech.service.main.a.i;
import com.yftech.service.main.c.a.f;
import com.yftech.vehicle.sdk.CarInfoManager;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public class e {
    private static final int A = 0;
    private static final int B = 1;
    private static final int C = 1;
    private static final int D = 2;
    private static final int E = 3;
    private static final String H = "volume_curve_curve";
    public static final String a = "car_volume";
    public static final String b = "channel_";
    public static final String c = "volume_mute";
    public static final String d = "volume_speech_gain_level";
    public static final String e = "boot_volume_type";
    private static volatile e g = null;
    private static final long m = 5000;
    private static final int o = 100;
    private static final int z = -1;
    private Map<Integer, List<Float>> G;
    private SharedPreferences h;
    private Context i;
    private i j;
    private b k;
    private Thread l;
    private float t;
    private int u;
    private d x;
    private com.yftech.service.main.b.d y;
    private c n = new c();
    private BlockingQueue<a> p = new ArrayBlockingQueue(o);
    private float q = 0.0f;
    private boolean r = false;
    private int s = -1;
    private final boolean F = false;
    private Runnable I = new Runnable() { // from class: com.yftech.service.main.b.e.1
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            int vehicleSpeed = CarInfoManager.get().getVehicleSpeed();
            com.yftech.service.main.j.a.c("mVolumeBySpeedRunnable, speed=" + vehicleSpeed + ", lastSpeed=" + e.this.t);
            float f = (float) vehicleSpeed;
            if (e.this.t != f) {
                e.this.t = f;
                e.this.h();
            }
        }
    };
    private Runnable J = new Runnable() { // from class: com.yftech.service.main.b.e.2
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            com.yftech.service.main.j.a.c("mVolumeBySeedRunnableImmediately");
            e.this.I.run();
        }
    };
    CarInfoManager.CarInfoListener f = new CarInfoManager.CarInfoListener() { // from class: com.yftech.service.main.b.e.3
        private final int b = 20;
        private int c = 0;

        public void onVehicleSpeedChanged(int i) throws Throwable {
            if ("1".equals(SystemProperties.get("persist.canlog.state", "0"))) {
                com.yftech.service.main.j.a.c("onSpeedStateChanged speed:" + i);
            }
            if (e.this.t != i) {
                e.this.v.removeCallbacks(e.this.I);
                if (Math.abs(i - this.c) < 20) {
                    e.this.v.postDelayed(e.this.I, 200L);
                } else {
                    this.c = i;
                    e.this.v.post(e.this.J);
                }
            }
        }
    };
    private Handler v = new Handler(Looper.myLooper());
    private com.yftech.service.main.c.a.b w = com.yftech.service.main.c.a.b.a();

    class a {
        static final int a = 0;
        static final int b = 1;
        static final int c = 2;
        static final int d = 3;
        static final int e = 4;
        public int f;
        public int[] g;
        public int h;

        public a(int i, int... iArr) {
            this.f = i;
            this.g = iArr;
        }

        private e a() {
            return e.this;
        }

        public a a(int i) {
            this.h = i;
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return a().equals(aVar.a()) && Arrays.equals(this.g, aVar.g) && this.f == aVar.f;
        }

        public int hashCode() {
            return ((((a().hashCode() + 31) * 31) + Arrays.hashCode(this.g)) * 31) + this.f;
        }

        public String toString() {
            return "[cmd=" + this.f + ",args:" + Arrays.toString(this.g) + "]";
        }
    }

    class b implements Runnable {
        private boolean b = false;
        private float[][] c;
        private int[][] d;

        b() {
        }

        private float a(int i) {
            float[] fArr = this.c[i];
            float f = 0.0f;
            for (float f2 : fArr) {
                f += f2;
            }
            return f;
        }

        private void a(a aVar) throws Throwable {
            if (aVar != null) {
                switch (aVar.f) {
                    case 0:
                        a(aVar.g);
                        break;
                    case 1:
                        b(aVar.h, aVar.g);
                        break;
                    case 2:
                        a(aVar.h, aVar.g);
                        break;
                    case 3:
                        b(aVar.g);
                        break;
                    case 4:
                        c(aVar.g);
                        break;
                }
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Multi-variable type inference failed */
        private boolean a(int i, int... iArr) throws Throwable {
            int i2 = 0;
            if (iArr == null || iArr.length < 2) {
                return false;
            }
            switch (iArr[0]) {
                case 1:
                    int i3 = iArr[1];
                    boolean z = iArr[2] == 1;
                    boolean z2 = iArr.length < 4 || iArr[3] == 1;
                    if (!e.this.j.b(i3)) {
                        return false;
                    }
                    com.yftech.service.main.c.a.c cVarA = e.this.w.a(i3);
                    boolean zB = e.this.b(2, 1, i3);
                    if ((((zB ? true : z ? e.this.y.b(i3) : e.this.y.e(i3)) && cVarA.l().j() == z) || zB) && e.this.x != null && z2) {
                        Collection<com.yftech.service.main.c.a.e> collectionJ = cVarA.j();
                        int[] iArr2 = new int[collectionJ.size()];
                        Iterator<com.yftech.service.main.c.a.e> it = collectionJ.iterator();
                        while (it.hasNext()) {
                            iArr2[i2] = it.next().a();
                            i2++;
                        }
                        e.this.x.a(iArr2, cVarA.l().a(), cVarA.f(), z, i);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("invoke channel ");
                    sb.append(z ? "mute" : "unmute");
                    sb.append(" success, channel index:");
                    sb.append(i3);
                    sb.append(", isExistSameCmd:");
                    sb.append(zB);
                    com.yftech.service.main.j.a.c(sb.toString());
                    return true;
                case 2:
                    int i4 = iArr[1] == 1 ? 1 : 0;
                    boolean z3 = iArr.length < 3 || iArr[2] == 1;
                    for (com.yftech.service.main.c.a.c cVar : e.this.w.b()) {
                        if (e.this.j.b(cVar.b())) {
                            boolean zB2 = e.this.b(2, 2);
                            if (((zB2 ? true : i4 != 0 ? e.this.y.a(cVar.b()) : e.this.y.d(cVar.b())) && cVar.l().j() == i4) || zB2) {
                                if (e.this.x != null && z3) {
                                    Collection<com.yftech.service.main.c.a.e> collectionJ2 = cVar.j();
                                    int[] iArr3 = new int[collectionJ2.size()];
                                    Iterator<com.yftech.service.main.c.a.e> it2 = collectionJ2.iterator();
                                    int i5 = 0;
                                    while (it2.hasNext()) {
                                        iArr3[i5] = it2.next().a();
                                        i5++;
                                    }
                                    e.this.x.a(iArr3, cVar.l().a(), cVar.f(), i4, i);
                                }
                                e.this.h.edit().putInt(e.c, i4).commit();
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("invoke master ");
                            sb2.append(i4 != 0 ? "mute" : "unmute");
                            sb2.append(" success, channel index:");
                            sb2.append(cVar.b());
                            sb2.append(", isExistCmd:");
                            sb2.append(zB2);
                            com.yftech.service.main.j.a.c(sb2.toString());
                        }
                    }
                    return true;
                case 3:
                    int i6 = iArr[1];
                    boolean z4 = iArr[2] == 1;
                    boolean z5 = iArr.length < 4 || iArr[3] == 1;
                    boolean zB3 = e.this.b(2, 3, i6);
                    boolean zC = zB3 ? true : z4 ? e.this.y.c(i6) : e.this.y.f(i6);
                    com.yftech.service.main.c.a.e eVarB = e.this.w.b(i6);
                    if (((zC && eVarB.g().j() == z4) || zB3) && e.this.x != null && z5) {
                        e.this.x.a(new int[]{eVarB.a()}, eVarB.g().a(), eVarB.e().f(), z4, i);
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("invoke stream ");
                    sb3.append(z4 ? "mute" : "unmute");
                    sb3.append(" success, streamType:");
                    sb3.append(i6);
                    sb3.append(", isExistSameCmd:");
                    sb3.append(zB3);
                    com.yftech.service.main.j.a.c(sb3.toString());
                    return true;
                default:
                    return true;
            }
        }

        private boolean a(int... iArr) throws Throwable {
            boolean zB;
            if (iArr != null && iArr.length >= 1) {
                int i = iArr[0];
                if (e.this.s != i) {
                    e.this.s = i;
                    zB = e.this.j.b(e.this.s, true);
                } else {
                    com.yftech.service.main.j.a.c(" change channel is same do not change");
                    zB = true;
                }
                if (zB) {
                    com.yftech.service.main.j.a.c("invoke changed channel success,channel index:" + i);
                    return true;
                }
                com.yftech.service.main.j.a.d("changeChannel fail! info:" + Arrays.toString(iArr));
            }
            return false;
        }

        private int b(int i) {
            int[] iArr = this.d[i];
            int i2 = 0;
            for (int i3 : iArr) {
                i2 += i3;
            }
            return i2;
        }

        private void b() throws Throwable {
            Collection<com.yftech.service.main.c.a.c> collectionB = e.this.w.b();
            this.c = (float[][]) Array.newInstance((Class<?>) float.class, collectionB.size(), collectionB.size());
            this.d = (int[][]) Array.newInstance((Class<?>) int.class, collectionB.size(), collectionB.size());
            for (com.yftech.service.main.c.a.c cVar : collectionB) {
                e.this.p.add(e.this.new a(1, cVar.b(), cVar.k().a()));
                try {
                    Thread.sleep(20L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (e.this.j.f()) {
                boolean z = e.this.h.getInt(e.c, -1) == 1;
                if (z) {
                    if (e.this.h.getInt(e.e, e.this.j.g()) != 2) {
                        e.this.a(z, 0, true);
                    } else {
                        e.this.h.edit().putInt(e.c, 0).apply();
                    }
                }
            }
        }

        private synchronized boolean b(int i, int... iArr) {
            boolean zA;
            int i2 = 0;
            if (iArr != null) {
                if (iArr.length >= 2) {
                    int i3 = iArr[0];
                    int i4 = iArr[1];
                    if (e.this.b(1, i3)) {
                        e.this.w.a(i3).l().a(i4);
                        com.yftech.service.main.j.a.c("invoke changed volume success for skip,channel index:" + i3 + ", volumeIndex:" + i4);
                        zA = true;
                    } else if (e.this.y != null) {
                        zA = e.this.y.a(i3, i4);
                        com.yftech.service.main.j.a.c("invoke changed volume success,channel index:" + i3 + ", volumeIndex:" + i4);
                    } else {
                        zA = false;
                    }
                    if (zA) {
                        if (e.this.x != null) {
                            com.yftech.service.main.c.a.c cVarA = e.this.w.a(i3);
                            Collection<com.yftech.service.main.c.a.e> collectionJ = cVarA.j();
                            int[] iArr2 = new int[collectionJ.size()];
                            Iterator<com.yftech.service.main.c.a.e> it = collectionJ.iterator();
                            while (it.hasNext()) {
                                iArr2[i2] = it.next().a();
                                i2++;
                            }
                            e.this.x.a(iArr2, i4, cVarA.f(), cVarA.l().j(), i);
                        }
                        e.this.h.edit().putInt(e.b + i3, i4).commit();
                        return true;
                    }
                    com.yftech.service.main.j.a.d("changeVolume fail! info:" + Arrays.toString(iArr));
                }
            }
            return false;
        }

        private synchronized boolean b(int... iArr) {
            if (iArr != null) {
                if (iArr.length >= 3) {
                    int i = iArr[0];
                    int i2 = iArr[1];
                    int i3 = iArr[2];
                    if (e.this.w.a(i3).l().a() == 0) {
                        com.yftech.service.main.j.a.c("reVolumeIndex is 0, invokeMixPer return!");
                        return false;
                    }
                    if (e.this.y != null) {
                        e.this.y.a(i, i3, i2);
                        com.yftech.service.main.j.a.c("invoke MixPer success,mixChannelIndex:" + i + ", reChannelIndex:" + i3 + ", mixValPer:" + i2);
                        return true;
                    }
                }
            }
            return false;
        }

        private void c(int i) {
            int[] iArr = this.d[i];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                this.d[i][i2] = 0;
            }
        }

        private synchronized boolean c(int... iArr) {
            if (iArr != null) {
                if (iArr.length >= 2) {
                    int i = iArr[0];
                    int i2 = iArr[1];
                    if (e.this.y != null) {
                        e.this.y.b(i, i2);
                        com.yftech.service.main.j.a.c("invoke recoverMixPer success,mixChannelIndex:" + i + ", reChannelIndex:" + i2);
                        return true;
                    }
                }
            }
            return false;
        }

        private void d(int i) {
            float[] fArr = this.c[i];
            for (int i2 = 0; i2 < fArr.length; i2++) {
                this.c[i][i2] = 0.0f;
            }
        }

        public void a() {
            this.b = true;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            Thread.currentThread().setPriority(10);
            b();
            do {
                try {
                    e.this.v.removeCallbacks(e.this.n);
                    a aVar = e.this.n.a;
                    if (aVar == null) {
                        aVar = (a) e.this.p.take();
                        e.this.n.a = aVar;
                    }
                    e.this.v.postDelayed(e.this.n, e.m);
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        a(aVar);
                        com.yftech.service.main.j.a.c("invoke audio cmd time:" + (System.currentTimeMillis() - jCurrentTimeMillis));
                        if (this.b) {
                            return;
                        } else {
                            e.this.n.a = null;
                        }
                    } catch (Exception e) {
                        e.this.n.a = null;
                        e.printStackTrace();
                        com.yftech.service.main.j.a.c("invoke audio cmd error!" + aVar);
                    }
                    e.this.v.removeCallbacks(e.this.n);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } while (!this.b);
        }
    }

    class c implements Runnable {
        public a a;

        c() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            com.yftech.service.main.j.a.c("invoke audio cmd timeout!" + this.a);
            if (e.this.l != null) {
                e.this.k.a();
                e.this.l.interrupt();
                e.this.k = null;
                e.this.l = null;
            }
            e.this.k = e.this.new b();
            e.this.l = new Thread(e.this.k, e.class.getSimpleName());
            e.this.l.start();
        }
    }

    public interface d {
        void a(boolean z, int i);

        void a(int[] iArr, int i, int i2, boolean z, int i3);
    }

    private e(Context context) {
        this.t = -1.0f;
        this.i = context;
        this.h = this.i.getSharedPreferences(a, 0);
        this.j = com.yftech.service.main.a.a.a(context).a();
        this.w.a(context, this.j.c());
        this.y = com.yftech.service.main.b.d.a(this.i);
        this.u = this.h.getInt(d, 2);
        this.t = CarInfoManager.get().getVehicleSpeed();
        this.y.a(this.j.a(this.t, this.u));
        f();
        CarInfoManager.get().registerListener(this.f);
    }

    public static e a(Context context) {
        if (g == null) {
            synchronized (e.class) {
                if (g == null) {
                    g = new e(context);
                }
            }
        }
        return g;
    }

    private void a(int i, int... iArr) {
        ArrayList arrayList = new ArrayList();
        int length = iArr == null ? 0 : iArr.length;
        for (a aVar : this.p) {
            if (aVar.f == i && (length == 0 || (aVar.g != null && aVar.g.length >= length && Arrays.equals(Arrays.copyOf(aVar.g, length), iArr)))) {
                arrayList.add(aVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.p.remove((a) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(int i, int... iArr) {
        int length = iArr == null ? 0 : iArr.length;
        for (a aVar : this.p) {
            if (aVar.f == i) {
                if (length == 0) {
                    return true;
                }
                if (aVar.g != null && aVar.g.length >= length && Arrays.equals(Arrays.copyOf(aVar.g, length), iArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean e(int i, int i2, int i3) throws Throwable {
        boolean z2;
        int iA = this.j.a(i, i2);
        com.yftech.service.main.c.a.c cVarA = this.w.a(i);
        if (iA > cVarA.f() || iA < cVarA.e()) {
            return false;
        }
        cVarA.k().a(iA);
        boolean zAdd = this.p.add(new a(1, i, iA).a(i3));
        if (this.j.a(i)) {
            if (cVarA.k().l()) {
                a(false, i, i3 & (-2), true);
                z2 = true;
            } else {
                z2 = false;
            }
            if (cVarA.k().k()) {
                a(false, i3 & (-2), true);
                z2 = true;
            }
        } else {
            z2 = false;
        }
        return z2 ? this.p.add(new a(1, i, iA).a(i3)) : zAdd;
    }

    private void f() {
        com.yftech.service.main.a.a.a(this.i).b().b(this.i);
        a();
        this.k = new b();
        this.l = new Thread(this.k, e.class.getSimpleName());
        this.l.start();
    }

    private void g() {
        int iE = e();
        Collection<com.yftech.service.main.c.a.c> collectionB = this.w.b();
        switch (iE) {
            case 1:
                for (com.yftech.service.main.c.a.c cVar : collectionB) {
                    cVar.k().a(this.h.getInt(b + cVar.b(), cVar.g()));
                }
                break;
            case 2:
                for (com.yftech.service.main.c.a.c cVar2 : collectionB) {
                    cVar2.k().a(this.h.getInt(b + cVar2.b(), cVar2.g()));
                }
                break;
            case 3:
                for (com.yftech.service.main.c.a.c cVar3 : collectionB) {
                    cVar3.k().a(cVar3.g());
                }
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() throws Throwable {
        float fA = this.j.a(this.t, this.u);
        com.yftech.service.main.j.a.c("changedVolumeBySpeed gain:" + fA + "dB, speedGainLevel:" + this.u + ", tempSpeed:" + this.t);
        if (this.q != fA) {
            this.q = fA;
            if (this.y != null) {
                this.y.a(fA);
            }
            com.yftech.service.main.c.a.c cVarE = this.w.b(3).e();
            if (cVarE.k().j()) {
                return;
            }
            if (cVarE.k().a() == 0) {
                com.yftech.service.main.j.a.c("Current media channel volume is 0, no changedVolumeBySpeed");
            } else {
                i();
            }
        }
    }

    private void i() throws Throwable {
        k(0);
    }

    private void k(int i) throws Throwable {
        for (com.yftech.service.main.c.a.c cVar : this.w.b()) {
            if (this.j.c(cVar.b())) {
                e(cVar.b(), b(cVar.b()), i);
            }
        }
    }

    public void a() {
        g();
        this.j.a(this.i, this.w.b(), this.h);
        for (com.yftech.service.main.c.a.c cVar : this.w.b()) {
            if (cVar.k().a() > cVar.f()) {
                cVar.k().a(cVar.f());
            }
        }
    }

    public void a(int i) throws Throwable {
        if (i == -1) {
            com.yftech.service.main.j.a.d("the channel index = -1!!!!!");
            return;
        }
        com.yftech.service.main.c.a.c cVarA = this.w.a(i);
        com.yftech.service.main.j.a.c("change channel index:" + i + ",is need changed:" + cVarA.c());
        if (cVarA.c()) {
            this.p.add(new a(0, i));
        }
    }

    public void a(int i, int i2) {
        this.p.add(new a(4, i, i2));
    }

    public void a(int i, int i2, int i3) throws Throwable {
        com.yftech.service.main.j.a.c("set mix channel per channel:" + i + ",per:" + i2 + ",reChannel:" + i3);
        this.p.add(new a(3, i, i2, i3));
    }

    public void a(d dVar) {
        this.x = dVar;
    }

    public void a(PrintWriter printWriter) {
        printWriter.println();
        printWriter.println("version:");
        printWriter.println(" OS    " + SystemProperties.get("ro.build.realversion.date"));
        printWriter.println(" MCU   " + SystemProperties.get("persist.version.mcu"));
        printWriter.println(" FOTA  " + SystemProperties.get("ro.fota.version"));
        printWriter.println();
        printWriter.println("ACC    On: " + SystemProperties.get("sys.acc.state"));
        printWriter.println("System On: " + SystemProperties.get("sys.power.state"));
        printWriter.println();
        printWriter.println("adapter:");
        printWriter.println(" dsp         " + com.yftech.service.main.a.a.a(this.i).b().a());
        printWriter.println(" platform    " + this.j.a());
        printWriter.println(" volume      " + this.j.b());
        printWriter.println(" config      " + this.j.c());
        printWriter.println();
        printWriter.println("volume:");
        printWriter.println("speed:" + this.t);
        printWriter.println("speed level:" + this.u);
        printWriter.println("channel:");
        Collection<com.yftech.service.main.c.a.c> collectionB = this.w.b();
        printWriter.println("index | curVol | realVol | min | max | curMute | realMute | name");
        for (com.yftech.service.main.c.a.c cVar : collectionB) {
            f fVarK = cVar.k();
            f fVarL = cVar.l();
            StringBuilder sb = new StringBuilder();
            sb.append("  ");
            sb.append(cVar.b());
            sb.append("   |  ");
            sb.append(fVarK.a() >= 10 ? Integer.valueOf(fVarK.a()) : "0" + fVarK.a());
            sb.append(" | ");
            sb.append(fVarL.a() >= 10 ? Integer.valueOf(fVarL.a()) : "0" + fVarL.a());
            sb.append(" |  ");
            sb.append(cVar.e());
            sb.append("  |  ");
            sb.append(cVar.f());
            sb.append(" | ");
            sb.append(fVarK.n());
            sb.append(" | ");
            sb.append(fVarL.n());
            sb.append(" | ");
            sb.append(cVar.a());
            printWriter.println(sb.toString());
        }
        printWriter.println("stream:");
        printWriter.println("type | channel | curVol | realVol | curMute | realMute | name");
        for (com.yftech.service.main.c.a.c cVar2 : collectionB) {
            for (com.yftech.service.main.c.a.e eVar : cVar2.j()) {
                f fVarF = eVar.f();
                f fVarG = eVar.g();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(" ");
                sb2.append(eVar.a());
                sb2.append(" | ");
                sb2.append(cVar2.b());
                sb2.append(" | ");
                sb2.append(fVarF.a() >= 10 ? Integer.valueOf(fVarF.a()) : "0" + fVarF.a());
                sb2.append(" | ");
                sb2.append(fVarG.a() >= 10 ? Integer.valueOf(fVarG.a()) : "0" + fVarG.a());
                sb2.append(" | ");
                sb2.append(fVarF.n());
                sb2.append(" | ");
                sb2.append(fVarG.n());
                sb2.append(" | ");
                sb2.append(eVar.b());
                printWriter.println(sb2.toString());
            }
        }
        printWriter.println();
        printWriter.println("mute:");
        printWriter.println(" master  " + this.r);
        printWriter.println();
        printWriter.println("volume curve test: false");
        printWriter.println();
    }

    public void a(boolean z2, int i, int i2, boolean z3) throws Throwable {
        com.yftech.service.main.c.a.c cVarA = this.w.a(i);
        if (cVarA.k().l() == z2) {
            com.yftech.service.main.j.a.c("muteChannel, mute state same, not need to do again");
            return;
        }
        int[] iArrD = this.j.d(i);
        int[] iArr = new int[iArrD == null ? 1 : iArrD.length + 1];
        iArr[0] = i;
        for (int i3 = 1; i3 < iArr.length; i3++) {
            iArr[i3] = iArrD[i3 - 1];
        }
        for (int i4 : iArr) {
            if (this.j.b(i)) {
                this.p.add(new a(2, 1, i4, z2 ? 1 : 0, z3 ? 1 : 0).a(i2));
                com.yftech.service.main.c.a.c cVarA2 = this.w.a(i4);
                if (z2) {
                    cVarA2.k().d();
                } else {
                    cVarA2.k().e();
                }
            }
        }
        if (cVarA.k().j()) {
            return;
        }
        for (int i5 : iArr) {
            if (this.j.e(i5) && this.w.a(i5).k().a() == 0) {
                e(i5, this.j.f(i5), i2);
            }
        }
    }

    public void a(boolean z2, int i, boolean z3) throws Throwable {
        com.yftech.service.main.j.a.c("muteMasterVolume, mute:" + z2 + ",flag:" + i);
        if (this.r == z2) {
            com.yftech.service.main.j.a.c("muteMasterVolume, mute state is same, not need do again");
            return;
        }
        this.r = z2;
        boolean z4 = false;
        this.p.add(new a(2, 2, z2 ? 1 : 0, z3 ? 1 : 0).a(i));
        Collection<com.yftech.service.main.c.a.c> collectionB = this.w.b();
        for (com.yftech.service.main.c.a.c cVar : collectionB) {
            if (this.j.b(cVar.b())) {
                if (z2) {
                    cVar.k().b();
                } else {
                    cVar.k().c();
                }
            }
        }
        if (z2) {
            return;
        }
        for (com.yftech.service.main.c.a.c cVar2 : collectionB) {
            if (this.j.e(cVar2.b())) {
                if (this.j.c(cVar2.b())) {
                    z4 = true;
                }
                if (cVar2.k().a() == 0) {
                    e(cVar2.b(), this.j.f(cVar2.b()), i);
                }
            }
        }
        if (z4) {
            return;
        }
        k(i);
    }

    public boolean a(boolean z2, int i, int i2) throws Throwable {
        if (!this.w.c(i)) {
            com.yftech.service.main.j.a.e("muteStream, streamType(" + i + ") is invalid");
            return false;
        }
        com.yftech.service.main.c.a.e eVarB = this.w.b(i);
        if (z2 == eVarB.f().m()) {
            com.yftech.service.main.j.a.c("muteStream, mute state is same, not need do again");
            return true;
        }
        this.p.add(new a(2, 3, i, z2 ? 1 : 0).a(i2));
        if (z2) {
            eVarB.f().f();
        } else {
            eVarB.f().g();
        }
        return true;
    }

    public float b(int i, int i2) {
        return this.w.a(i).b(i2);
    }

    public int b(int i) {
        return this.w.a(i).k().a();
    }

    public void b(int i, int i2, int i3) throws Throwable {
        int i4;
        if (i == Integer.MIN_VALUE) {
            i = com.yftech.service.main.b.c.a(this.i).p();
        }
        if (!this.w.c(i)) {
            com.yftech.service.main.j.a.d("adjustStreamVolume the stream(" + i + ") is invalid !!!");
            return;
        }
        com.yftech.service.main.c.a.c cVarE = this.w.b(i).e();
        int iA = cVarE.k().a();
        int iE = cVarE.e();
        int iF = cVarE.f();
        if (i2 == 1 || i2 == -1) {
            i4 = i2 == 1 ? iA + 1 : iA - 1;
            if (i4 > iF) {
                i4 = iF;
            } else if (i4 < iE) {
                i4 = iE;
            }
            c(i, i4, i3);
        } else {
            if (i2 == -100 || i2 == o) {
                a(i2 == -100, cVarE.b(), i3, true);
            } else if (i2 == 101) {
                a(!cVarE.k().l(), cVarE.b(), i3, true);
            } else if (i2 == 0) {
                c(i, iA, i3);
            }
            i4 = iA;
        }
        com.yftech.service.main.j.a.c("adjustStreamVolume streamType:" + i + ",target index:" + i4 + ",current index:" + iA + ",min index:" + iE + ",max index:" + iF + ", channel:" + cVarE + ", direction:" + i2);
    }

    public boolean b() {
        return this.r;
    }

    public int c() {
        return this.u;
    }

    public int c(int i) throws Throwable {
        if (this.w.c(i)) {
            return this.w.b(i).e().k().a();
        }
        com.yftech.service.main.j.a.d("getStreamVolume the stream is invalid !!!");
        return -1;
    }

    public void c(int i, int i2, int i3) throws Throwable {
        if (!this.w.c(i)) {
            com.yftech.service.main.j.a.d("setStreamVolume the stream is invalid !!!");
            return;
        }
        com.yftech.service.main.c.a.c cVarE = this.w.b(i).e();
        int iA = cVarE.k().a();
        int iE = cVarE.e();
        int iF = cVarE.f();
        com.yftech.service.main.j.a.c("setStreamVolume streamType:" + i + ",target index:" + i2 + ",current index:" + iA + ",min index:" + iE + ",max index:" + iF + ",channel:" + cVarE.b());
        if (iA == i2) {
            return;
        }
        if (iE > i2 || iF < i2) {
            com.yftech.service.main.j.a.d("setStreamVolume the stream(" + i + ") index(" + i2 + ") is invalid !!!");
        } else {
            e(cVarE.b(), i2, i3);
        }
        int[] iArrD = this.j.d(cVarE.b());
        if (iArrD != null) {
            for (int i4 : iArrD) {
                com.yftech.service.main.c.a.c cVarA = this.w.a(i4);
                int iA2 = cVarA.k().a();
                int iE2 = cVarA.e();
                int iF2 = cVarA.f();
                com.yftech.service.main.j.a.c("setStreamVolume channel:" + i4 + ",target index:" + i2 + ",current index:" + iA2 + ",min index:" + iE2 + ",max index:" + iF2);
                if (iE2 > i2 || iF2 < i2) {
                    com.yftech.service.main.j.a.d("setStreamVolume the channel(" + i4 + ") index(" + i2 + ") is invalid !!!");
                } else {
                    e(i4, i2, i3);
                }
            }
        }
        if (i2 == 0) {
            int[] iArr = new int[iArrD == null ? 1 : iArrD.length + 1];
            iArr[0] = cVarE.b();
            for (int i5 = 1; i5 < iArr.length; i5++) {
                iArr[i5] = iArrD[i5 - 1];
            }
            for (int i6 : iArr) {
                if (this.j.b(i6) && this.j.e(i6)) {
                    String str = SystemProperties.get("ro.product.brand", "");
                    if (PlatformProjectDescribe.isCBIHU12C1Project() && ("A79".equals(str) || "A79_G".equals(str))) {
                        a(true, i3, true);
                        return;
                    } else {
                        this.p.add(new a(2, 1, i6, 1).a(i3));
                        this.w.a(i6).k().d();
                    }
                }
            }
        }
    }

    public int d(int i) throws Throwable {
        if (this.w.c(i)) {
            return this.w.b(i).e().f();
        }
        com.yftech.service.main.j.a.d("getStreamMaxVolume the stream is invalid !!!");
        return -1;
    }

    public void d(int i, int i2, int i3) {
    }

    public boolean d() {
        return this.j.e();
    }

    public int e() {
        return this.h.getInt(e, this.j.g());
    }

    public int e(int i) throws Throwable {
        if (this.w.c(i)) {
            return this.w.b(i).e().e();
        }
        com.yftech.service.main.j.a.d("getStreamMaxVolume the stream is invalid !!!");
        return -1;
    }

    public boolean f(int i) throws Throwable {
        this.u = i;
        h();
        this.h.edit().putInt(d, i).apply();
        return true;
    }

    public boolean g(int i) throws Throwable {
        if (i == 1 || i == 2 || i == 3) {
            this.h.edit().putInt(e, i).apply();
            return true;
        }
        com.yftech.service.main.j.a.e("setBootVolumeType, type(" + i + ") is invalid");
        return false;
    }

    public boolean h(int i) {
        if (this.w.c(i)) {
            return this.w.b(i).f().m();
        }
        return true;
    }

    public boolean i(int i) {
        return this.w.a(i).k().j();
    }

    public int[] j(int i) {
        return null;
    }
}
