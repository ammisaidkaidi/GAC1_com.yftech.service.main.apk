package com.yftech.service.main.a.g.b;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.SystemProperties;
import android.provider.Settings;
import com.yftech.car.screen.CarScreenManager;
import com.yftech.car.utils.PlatformProjectDescribe;
import com.yftech.vehicle.internal.adapter.ICarInfo;
import com.yftech.vehicle.internal.adapter.ICarKey;
import com.yftech.vehicle.sdk.CarBspManager;
import com.yftech.vehicle.sdk.CarIcmManager;
import com.yftech.vehicle.sdk.CarInfoManager;
import com.yftech.vehicle.sdk.CarMiscManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class b extends com.yftech.service.main.a.g.a.b {
    private Context b;
    private final int[] c;
    private final int[] d;
    private final float[] e;
    private int[] f;
    private int g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private int l;
    private int m;
    private boolean n;
    private AudioManager.OnAudioFocusChangeListener o;
    private CarScreenManager.CarScreenCallback p;
    private CarInfoManager.CarInfoListener q;
    private CarIcmManager.CarIcmListener r;

    public b(Context context) throws Throwable {
        super(context);
        this.l = Integer.MAX_VALUE;
        this.m = -1;
        this.n = false;
        this.o = new AudioManager.OnAudioFocusChangeListener() { // from class: com.yftech.service.main.a.g.b.b.3
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public void onAudioFocusChange(int i) {
            }
        };
        this.p = new CarScreenManager.CarScreenCallback() { // from class: com.yftech.service.main.a.g.b.b.4
            public void onChangedDayNightMode(int i) throws Throwable {
                com.yftech.service.main.j.a.c("onChangedDayNightMode, mode:" + i + ", isOpenLampLight:" + b.this.k);
                if (i == 0) {
                    if (!CarMiscManager.get().setKeyboardBacklight(b.this.d[0])) {
                        com.yftech.service.main.j.a.e("onChangedDayNightMode, set day key brightness(" + b.this.d[0] + ") failed");
                    }
                } else if (i == 1) {
                    if (b.this.m == -1) {
                        b.this.m = 300;
                    }
                    if (!CarMiscManager.get().setKeyboardBacklight(b.this.m)) {
                        com.yftech.service.main.j.a.e("onChangedDayNightMode, set night key brightness(" + b.this.m + ") failed");
                    }
                } else if (i == 2) {
                    if (b.this.k) {
                        if (b.this.m == -1) {
                            b.this.m = 300;
                        }
                        if (!CarMiscManager.get().setKeyboardBacklight(b.this.m)) {
                            com.yftech.service.main.j.a.e("onChangedDayNightMode, set auto night key brightness(" + b.this.m + ") failed");
                        }
                    } else if (!CarMiscManager.get().setKeyboardBacklight(b.this.d[0])) {
                        com.yftech.service.main.j.a.e("onChangedDayNightMode, set auto day key brightness(" + b.this.d[0] + ") failed");
                    }
                }
                b.this.l = i;
            }
        };
        this.q = new CarInfoManager.CarInfoListener() { // from class: com.yftech.service.main.a.g.b.b.5
            public void onDayNightModeChanged(ICarInfo.DayNightMode dayNightMode) throws Throwable {
                com.yftech.service.main.j.a.c("onDayNightModeChanged, mode:" + dayNightMode + ", mIsOpenLampLight:" + b.this.k);
                if (dayNightMode == ICarInfo.DayNightMode.__UNKNOWN__) {
                    return;
                }
                boolean z = b.this.k;
                b.this.k = dayNightMode == ICarInfo.DayNightMode.NIGHT;
                if (z != b.this.k) {
                    b.this.a.a(b.this.k);
                }
                if (b.this.l == Integer.MAX_VALUE) {
                    b.this.l = CarScreenManager.getInstance().getDayNightMode();
                }
                if (b.this.l == 2) {
                    b.this.p.onChangedDayNightMode(2);
                }
            }
        };
        this.r = new CarIcmManager.CarIcmListener() { // from class: com.yftech.service.main.a.g.b.b.6
            public void onKeyBoardBackLightChanged(int i) throws Throwable {
                com.yftech.service.main.j.a.c("onKeyBoardBackLightChanged, percent:" + i);
                int i2 = i * 30;
                if (b.this.m != i2) {
                    b.this.m = i2;
                    if (b.this.l == Integer.MAX_VALUE) {
                        b.this.l = CarScreenManager.getInstance().getDayNightMode();
                    }
                    if (b.this.l == 1 || (b.this.l == 2 && b.this.k)) {
                        b.this.p.onChangedDayNightMode(b.this.l);
                    }
                }
            }
        };
        this.b = context;
        int iD = (d() - c()) + 1 + c();
        float f = 10000.0f / (iD - 1);
        this.c = new int[]{0, 1, 9, 17, 25, 33, 41, 49, 57, 65, 75};
        this.d = new int[iD];
        for (int i = 0; i < iD; i++) {
            this.d[i] = (int) (i * f);
        }
        this.e = new float[4];
        this.e[0] = 2505.9373f;
        this.e[1] = 2360.4065f;
        this.e[2] = 2214.8005f;
        this.e[3] = 2099.8987f;
        this.g = k();
        this.h = g(this.g);
        this.i = 0;
        this.j = this.h;
        f(this.h);
        this.k = CarInfoManager.get().getDayNightMode() == ICarInfo.DayNightMode.NIGHT;
        CarScreenManager.getInstance().registerCarScreenCallback(this.p, (Handler) null);
        CarInfoManager.get().registerListener(this.q);
        CarIcmManager.get().registerListener(this.r);
        l();
        new Handler().post(new Runnable() { // from class: com.yftech.service.main.a.g.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.this.l = CarScreenManager.getInstance().getDayNightMode();
                b.this.p.onChangedDayNightMode(b.this.l);
            }
        });
    }

    static /* synthetic */ int d(b bVar) {
        int i = bVar.i;
        bVar.i = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    public void f(int i) throws Throwable {
        float f;
        int[] iArr;
        int i2;
        switch (i) {
            case 0:
                f = 1.0f;
                break;
            case 1:
                f = 0.8f;
                break;
            case 2:
                f = 0.5f;
                break;
            case 3:
                f = 0.3f;
                break;
            case 4:
                f = 0.2f;
                break;
            default:
                com.yftech.service.main.j.a.e("computeBrightnessCurveByLevel, invalid level");
                return;
        }
        int iD = d();
        int i3 = (int) (this.c[this.c.length - 1] * f);
        for (int length = this.c.length - 1; length >= 0; length--) {
            if (this.c[length] <= i3) {
                iD = length;
                iArr = new int[this.c.length];
                for (i2 = 0; i2 < this.c.length; i2++) {
                    if (i2 <= iD) {
                        iArr[i2] = this.c[i2];
                    } else {
                        iArr[i2] = this.c[iD];
                    }
                }
                this.f = iArr;
            }
        }
        iArr = new int[this.c.length];
        while (i2 < this.c.length) {
            if (i2 <= iD) {
                iArr[i2] = this.c[i2];
            } else {
                iArr[i2] = this.c[iD];
            }
        }
        this.f = iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int g(int i) {
        if (i > 82) {
            return 4;
        }
        if (i >= 78) {
            return 3;
        }
        if (i >= 73) {
            return 2;
        }
        return i >= 68 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [float] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v17, types: [float] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public int k() throws Throwable {
        FileReader fileReader;
        File file = new File("/sys/bus/iio/devices/iio:device0/in_voltage0_input");
        if (!file.exists()) {
            com.yftech.service.main.j.a.e("getScreenTemperature, temperature sample file not exist");
            return 0;
        }
        ?? r1 = 0;
        r1 = 0;
        r1 = 0;
        r1 = 0;
        r1 = 0;
        ?? r3 = 0;
        r3 = 0;
        r3 = 0;
        r3 = 0;
        r3 = 0;
        r3 = 0;
        r3 = 0;
        r3 = 0;
        r3 = 0;
        try {
            try {
                try {
                    fileReader = new FileReader(file);
                    try {
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        try {
                            r3 = Float.parseFloat(bufferedReader.readLine());
                            try {
                                bufferedReader.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            try {
                                fileReader.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                            r1 = r3;
                        } catch (FileNotFoundException e3) {
                            r3 = bufferedReader;
                            e = e3;
                            e.printStackTrace();
                            if (r3 != 0) {
                                try {
                                    r3.close();
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                }
                            }
                            if (fileReader != null) {
                                fileReader.close();
                                r3 = r3;
                            }
                        } catch (IOException e5) {
                            r3 = bufferedReader;
                            e = e5;
                            e.printStackTrace();
                            if (r3 != 0) {
                                try {
                                    r3.close();
                                } catch (IOException e6) {
                                    e6.printStackTrace();
                                }
                            }
                            if (fileReader != null) {
                                fileReader.close();
                                r3 = r3;
                            }
                        } catch (Exception e7) {
                            r3 = bufferedReader;
                            e = e7;
                            e.printStackTrace();
                            if (r3 != 0) {
                                try {
                                    r3.close();
                                } catch (IOException e8) {
                                    e8.printStackTrace();
                                }
                            }
                            if (fileReader != null) {
                                fileReader.close();
                                r3 = r3;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r3 = bufferedReader;
                            if (r3 != 0) {
                                try {
                                    r3.close();
                                } catch (IOException e9) {
                                    e9.printStackTrace();
                                }
                            }
                            if (fileReader == null) {
                                throw th;
                            }
                            try {
                                fileReader.close();
                                throw th;
                            } catch (IOException e10) {
                                e10.printStackTrace();
                                throw th;
                            }
                        }
                    } catch (FileNotFoundException e11) {
                        e = e11;
                    } catch (IOException e12) {
                        e = e12;
                    } catch (Exception e13) {
                        e = e13;
                    }
                } catch (IOException e14) {
                    e14.printStackTrace();
                }
            } catch (FileNotFoundException e15) {
                e = e15;
                fileReader = null;
            } catch (IOException e16) {
                e = e16;
                fileReader = null;
            } catch (Exception e17) {
                e = e17;
                fileReader = null;
            } catch (Throwable th2) {
                th = th2;
                fileReader = null;
            }
            if (r1 > this.e[0]) {
                return 67;
            }
            if (r1 > this.e[1]) {
                return 72;
            }
            if (r1 > this.e[2]) {
                return 77;
            }
            return r1 > this.e[3] ? 82 : 83;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void l() {
        new Thread(new Runnable() { // from class: com.yftech.service.main.a.g.b.b.2
            /* JADX INFO: Infinite loop detected, blocks: 24, insns: 0 */
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                while (true) {
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (SystemProperties.getInt("yf.temp.protect", 1) != 0) {
                        int iK = b.this.k();
                        int iG = b.this.g(iK);
                        b.d(b.this);
                        b.this.g = iK;
                        if (b.this.j != iG) {
                            b.this.i = 0;
                            b.this.j = iG;
                        }
                        if (b.this.i == 20 && b.this.h != iG) {
                            com.yftech.service.main.j.a.c("screen temperature level change, change to " + iG);
                            b.this.h = iG;
                            b.this.f(iG);
                            b.this.a(b.this.b());
                            b.this.i = 0;
                        }
                    }
                }
            }
        }, "screen.temp.monitor").start();
    }

    @Override // com.yftech.service.main.a.g
    public String a() {
        return PlatformProjectDescribe.Project.CA1105.toString();
    }

    @Override // com.yftech.service.main.a.g.a.b, com.yftech.service.main.a.g
    public void a(PrintWriter printWriter) {
        super.a(printWriter);
        printWriter.println("car1105 screen adapter:");
        printWriter.println("brightness curve=" + Arrays.toString(this.c));
        printWriter.println("dynamic brightness curve=" + Arrays.toString(this.f));
        printWriter.println("key board brightness curve=" + Arrays.toString(this.d));
        printWriter.println("temperature=" + this.g);
        printWriter.println("temperature level=" + this.h);
        printWriter.println("temperature monitor count=" + this.i);
        printWriter.println("last temperature level=" + this.j);
        printWriter.println("current dashboard to keyboard brightness=" + this.m);
        printWriter.println("mHasMuteAmp=" + this.n);
    }

    @Override // com.yftech.service.main.a.g.a.b, com.yftech.service.main.a.g
    public boolean a(int i, int i2) throws Throwable {
        if (this.l == Integer.MAX_VALUE) {
            this.l = CarScreenManager.getInstance().getDayNightMode();
        }
        this.p.onChangedDayNightMode(this.l);
        boolean zA = super.a(i, i2);
        if (!CarMiscManager.get().setScreenTouchEnabled(true)) {
            com.yftech.service.main.j.a.e("openScreenBrightness, enable screen touch failed");
        }
        ((AudioManager) this.b.getSystemService("audio")).abandonAudioFocus(this.o);
        Settings.System.putInt(this.b.getContentResolver(), "yf.false.standby.state", 0);
        if (this.n) {
            CarBspManager.get().setBspAMPMute(false);
            this.n = false;
        }
        return zA;
    }

    @Override // com.yftech.service.main.a.g
    public boolean a(ICarKey.CarKeyEvent carKeyEvent) {
        return false;
    }

    @Override // com.yftech.service.main.a.g.a.b, com.yftech.service.main.a.g
    public boolean b(int i) throws Throwable {
        if (!CarMiscManager.get().setKeyboardBacklight(this.d[0])) {
            com.yftech.service.main.j.a.e("closeScreenBrightness, close key brightness failed");
        }
        boolean zB = super.b(i);
        if (!CarMiscManager.get().setScreenTouchEnabled(false)) {
            com.yftech.service.main.j.a.e("closeScreenBrightness, disable screen touch failed");
        }
        if (i == 1) {
            ((AudioManager) this.b.getSystemService("audio")).requestAudioFocus(this.o, 31, 1);
            Settings.System.putInt(this.b.getContentResolver(), "yf.false.standby.state", 1);
            CarBspManager.get().setBspAMPMute(true);
            this.n = true;
        }
        return zB;
    }

    @Override // com.yftech.service.main.a.g
    public int c() {
        return 0;
    }

    @Override // com.yftech.service.main.a.g
    public int d() {
        return 10;
    }

    @Override // com.yftech.service.main.a.g
    public int e() {
        return 2;
    }

    @Override // com.yftech.service.main.a.g.a.b
    public int e(int i) {
        if (i >= this.f.length) {
            i = this.f.length - 1;
        }
        return this.f[i];
    }

    @Override // com.yftech.service.main.a.g
    public int f() {
        return 8;
    }

    @Override // com.yftech.service.main.a.g
    public int g() {
        return 2;
    }

    @Override // com.yftech.service.main.a.g
    public boolean i() {
        return true;
    }

    @Override // com.yftech.service.main.a.g
    public boolean j() {
        return this.k;
    }
}
