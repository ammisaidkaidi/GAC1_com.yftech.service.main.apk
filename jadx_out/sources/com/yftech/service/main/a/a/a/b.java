package com.yftech.service.main.a.a.a;

import android.content.Context;
import android.media.AudioManager;
import android.os.SystemProperties;
import android.text.TextUtils;
import com.autochips.audiosettings.AudioSettings;
import com.yftech.car.utils.PlatformProjectDescribe;
import com.yftech.service.main.a.e;
import com.yftech.service.main.b.d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import vendor.autochips.hardware.audiosettings.V1_0.IAudioSettings;

/* JADX INFO: loaded from: classes.dex */
public class b implements e {
    private static final boolean A;
    private static final int B = 10;
    private static final int C = 1;
    private static final int D = 0;
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    public static final int f = 6;
    public static final int g = 7;
    public static final int h = 8;
    private static final int[] i = {31, 62, 125, 250, 500, 1000, 2000, 4000, 8000, 16000};
    private static final float j = 15.0f;
    private static final float k = -15.0f;
    private static final float l = 10.0f;
    private static final float m = 0.0f;
    private static final float n = 0.1f;
    private static final float o = 131072.0f;
    private static final float p = 0.0f;
    private static final int[] q;
    private static final int[] r;
    private static final int[] s;
    private static final int[] t;
    private static final int[] u;
    private static final int[] v;
    private static final int[] w;
    private static final int[] x;
    private static final int[] y;
    private static final int[] z;
    private Context E;
    private AudioManager I;
    private int F = -1;
    private int G = Integer.MAX_VALUE;
    private int[] H = new int[i.length];
    private d.a J = new d.a() { // from class: com.yftech.service.main.a.a.a.b.1
        @Override // com.yftech.service.main.b.d.a
        public void a(int i2, boolean z2, int i3, int i4) throws Throwable {
            if (b.this.G == 1 && com.yftech.service.main.a.a.a(b.this.E).a().c(i2) && i3 != i4) {
                b.this.a(true, i3);
            }
        }
    };

    /* JADX INFO: renamed from: com.yftech.service.main.a.a.a.b$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[PlatformProjectDescribe.Project.values().length];

        static {
            try {
                a[PlatformProjectDescribe.Project.CA1105.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static {
        if (AnonymousClass2.a[PlatformProjectDescribe.getProject().ordinal()] != 1) {
            A = false;
            q = new int[]{15, 15, 15, 15, 15, 15, 15, 15, 15, 15};
            r = new int[]{10, 15, 14, 8, 18, 21, 23, 22, 14, 10};
            s = new int[]{20, 21, 18, 9, 18, 18, 9, 20, 23, 20};
            t = new int[]{19, 19, 22, 10, 16, 10, 12, 19, 21, 19};
            u = new int[]{12, 20, 20, 15, 8, 16, 15, 18, 20, 16};
            v = new int[]{17, 21, 20, 11, 18, 23, 11, 19, 21, 19};
            w = new int[]{18, 22, 19, 13, 19, 10, 10, 24, 11, 18};
            x = new int[]{22, 20, 15, 14, 13, 13, 14, 16, 20, 22};
            y = new int[]{18, 19, 11, 17, 11, 19, 15, 23, 21, 24};
            z = new int[]{19, 22, 20, 10, 9, 13, 15, 14, 11, 11};
            return;
        }
        A = true;
        q = new int[]{16, 16, 12, 16, 16, 12, 15, 12, 16, 16};
        r = new int[]{10, 15, 14, 8, 18, 21, 23, 22, 14, 10};
        s = new int[]{20, 21, 18, 9, 18, 18, 9, 20, 23, 20};
        t = new int[]{19, 20, 20, 13, 15, 10, 14, 18, 21, 19};
        u = new int[]{15, 16, 14, 15, 15, 12, 17, 18, 18, 16};
        v = new int[]{15, 16, 14, 17, 16, 12, 16, 13, 17, 16};
        w = new int[]{18, 22, 19, 13, 19, 10, 10, 24, 11, 18};
        x = new int[]{21, 19, 13, 15, 15, 11, 15, 12, 19, 21};
        y = new int[]{18, 19, 11, 17, 11, 19, 15, 23, 21, 24};
        z = new int[]{19, 20, 15, 16, 16, 12, 15, 12, 16, 16};
    }

    public b() {
        if (PlatformProjectDescribe.getProject() == PlatformProjectDescribe.Project.CA1105) {
            System.arraycopy(new int[]{16, 16, 12, 16, 16, 12, 15, 12, 16, 16}, 0, this.H, 0, i.length);
        } else {
            Arrays.fill(this.H, 15);
        }
    }

    private void a(int[] iArr, int i2, int[] iArr2, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            iArr2[i5 + i3] = iArr[i5 + i2];
        }
    }

    private boolean a(float f2) {
        return f2 >= m && f2 <= l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    /* JADX WARN: Instruction removed from duplicated block: B:9:0x0011, please report this as an issue */
    public boolean a(boolean z2, int i2) throws Throwable {
        if (this.G == Integer.MAX_VALUE) {
            this.G = z2 ? 1 : 0;
            this.I.setParameters("Upper_Loud_Enable=" + (z2 ? 1 : 0));
        } else {
            if ((this.G == 1) != z2) {
                this.G = z2 ? 1 : 0;
                this.I.setParameters("Upper_Loud_Enable=" + (z2 ? 1 : 0));
            }
        }
        if (z2) {
            if (i2 == Integer.MAX_VALUE) {
                i2 = com.yftech.service.main.b.e.a(this.E).c(3);
            }
            this.I.setParameters("Upper_Loud_Index=" + i2);
        }
        return true;
    }

    private boolean a(int[] iArr, int i2, boolean z2) throws Throwable {
        int[] iArr2 = new int[468];
        int[] iArr3 = {313, 344, 375, 406, 437};
        int[] iArr4 = {322, 353, 384, 415, 446};
        int[] iArr5 = {158, 189, 220, 251, 282};
        int[] iArr6 = {167, 198, 229, 260, 291};
        int[] iArr7 = {200, 200, 200, 200, 200, 200, 200, 200, 200, 200};
        int[] iArr8 = {50, 50, 50, 50, 50, 50, 50, 50, 50, 50};
        iArr2[0] = z2 ? 1 : 0;
        iArr2[1] = 10;
        iArr2[2] = i2;
        a(i, 0, iArr2, 3, 10);
        a(i, 0, iArr2, 34, 10);
        a(i, 0, iArr2, 65, 10);
        a(i, 0, iArr2, 96, 10);
        a(i, 0, iArr2, 127, 10);
        a(iArr, 0, iArr2, 313, 10);
        a(iArr, 0, iArr2, 344, 10);
        a(iArr, 0, iArr2, 375, 10);
        a(iArr, 0, iArr2, 406, 10);
        a(iArr, 0, iArr2, 437, 10);
        for (int i3 = 0; i3 < 5; i3++) {
            int i4 = iArr5[i3];
            int i5 = iArr3[i3];
            int i6 = 0;
            while (i4 <= iArr6[i3] && i5 <= iArr4[i3]) {
                if (iArr2[i5] >= 15) {
                    iArr2[i4] = iArr7[i6];
                } else {
                    iArr2[i4] = iArr8[i6];
                }
                i4++;
                i5++;
                i6++;
            }
        }
        if (AudioSettings.SetValue(1, iArr2, iArr2.length) == 0) {
            return true;
        }
        com.yftech.service.main.j.a.e("setBandGains, failed: presetType:" + i2 + ", enable:" + z2);
        return false;
    }

    private String f(int i2) {
        switch (i2) {
            case 1:
                return "Media_Master_Vol";
            case 2:
                return "Media_Pri_Vol";
            case 3:
                return "Media_Sec_Vol";
            case 4:
                return "Media_Ter_Vol";
            case 5:
                return "Sys_DL1_Vol";
            case 6:
                return "Sys_DL2_Vol";
            case 7:
                return "Sys_DL3_Vol";
            case 8:
                return "Sys_DL4_Vol";
            default:
                return null;
        }
    }

    private String g(int i2) {
        switch (i2) {
            case 1:
                return "Media_Master_Mute";
            case 2:
                return "Media_Pri_Mute";
            case 3:
                return "Media_Sec_Mute";
            case 4:
                return "Media_Ter_Mute";
            case 5:
                return "Sys_DL1_Mute";
            case 6:
                return "Sys_DL2_Mute";
            case 7:
                return "Sys_DL3_Mute";
            case 8:
                return "Sys_DL4_Mute";
            default:
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a8 A[PHI: r5
      0x00a8: PHI (r5v8 java.lang.Process) = (r5v7 java.lang.Process), (r5v9 java.lang.Process) binds: [B:43:0x0093, B:53:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.BufferedReader] */
    @Override // com.yftech.service.main.a.e
    public float a(int i2) throws Throwable {
        ?? r0;
        Process processExec;
        BufferedReader bufferedReader;
        String line;
        String strF = f(i2);
        ?? IsEmpty = TextUtils.isEmpty(strF);
        if (IsEmpty != 0) {
            com.yftech.service.main.j.a.e("getChannelVol, channel(" + i2 + ") is invalid");
            return Float.MAX_VALUE;
        }
        ?? r6 = 0;
        BufferedReader bufferedReader2 = null;
        r6 = 0;
        str = null;
        str = null;
        String str = null;
        try {
            try {
                processExec = Runtime.getRuntime().exec("tinymix " + strF);
                if (processExec != null) {
                    try {
                        if (processExec.waitFor() == 0) {
                            bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                            try {
                                line = bufferedReader.readLine();
                                bufferedReader2 = bufferedReader;
                            } catch (IOException e2) {
                                e = e2;
                                e.printStackTrace();
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e3) {
                                        e3.printStackTrace();
                                    }
                                }
                                if (processExec != null) {
                                    processExec.destroy();
                                }
                            } catch (InterruptedException e4) {
                                e = e4;
                                e.printStackTrace();
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e5) {
                                        e5.printStackTrace();
                                    }
                                }
                                if (processExec != null) {
                                    processExec.destroy();
                                }
                            }
                        } else {
                            line = null;
                        }
                    } catch (IOException e6) {
                        e = e6;
                        bufferedReader = null;
                    } catch (InterruptedException e7) {
                        e = e7;
                        bufferedReader = null;
                    } catch (Throwable th) {
                        r0 = processExec;
                        th = th;
                        if (r6 != 0) {
                            try {
                                r6.close();
                            } catch (IOException e8) {
                                e8.printStackTrace();
                            }
                        }
                        if (r0 == 0) {
                            throw th;
                        }
                        r0.destroy();
                        throw th;
                    }
                } else {
                    line = null;
                }
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e9) {
                        e9.printStackTrace();
                    }
                }
                if (processExec != null) {
                    processExec.destroy();
                }
                str = line;
            } catch (Throwable th2) {
                r0 = strF;
                th = th2;
                r6 = IsEmpty;
            }
        } catch (IOException e10) {
            e = e10;
            processExec = null;
            bufferedReader = null;
        } catch (InterruptedException e11) {
            e = e11;
            processExec = null;
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
            r0 = 0;
        }
        com.yftech.service.main.j.a.c("getChannelVol, print:" + str);
        if (TextUtils.isEmpty(str)) {
            return Float.MAX_VALUE;
        }
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(" ");
        if (iIndexOf == -1 || iIndexOf2 == -1 || iIndexOf2 >= iIndexOf) {
            return Float.MAX_VALUE;
        }
        String strTrim = str.substring(iIndexOf2, iIndexOf).trim();
        if (TextUtils.isEmpty(strTrim)) {
            return Float.MAX_VALUE;
        }
        try {
            return Float.parseFloat(strTrim);
        } catch (NumberFormatException e12) {
            e12.printStackTrace();
            return Float.MAX_VALUE;
        }
    }

    @Override // com.yftech.service.main.a.e
    public String a() {
        return "8015";
    }

    @Override // com.yftech.service.main.a.e
    public void a(PrintWriter printWriter) {
        printWriter.println("----8015 dsp----");
        printWriter.println("mUseCustomEqTypeGain:" + A);
    }

    @Override // com.yftech.service.main.a.e
    public boolean a(float f2, float f3, float f4, float f5) throws Throwable {
        if (a(f2) && a(f3) && a(f4) && a(f5)) {
            int iSetValue = AudioSettings.SetValue(21, new int[]{(int) (f2 * l), (int) (f3 * l), 0, 0, (int) (f4 * l), (int) (f5 * l)}, 6);
            if (iSetValue == 0) {
                return true;
            }
            com.yftech.service.main.j.a.e("setDelayValue, failed:" + iSetValue);
        }
        com.yftech.service.main.j.a.e("setDelayValue, params error");
        return false;
    }

    @Override // com.yftech.service.main.a.e
    public boolean a(int i2, float f2) throws Throwable {
        if (f2 < m || f2 > o) {
            com.yftech.service.main.j.a.e("setChannelVol, volume(" + f2 + ") out of range");
            return false;
        }
        String strF = f(i2);
        if (TextUtils.isEmpty(strF)) {
            com.yftech.service.main.j.a.e("setChannelVol, channel(" + i2 + ") is invalid");
            return false;
        }
        Process process = null;
        process = null;
        process = null;
        process = null;
        int i3 = -1;
        i3 = -1;
        i3 = -1;
        i3 = -1;
        try {
            try {
                Process processExec = Runtime.getRuntime().exec("tinymix " + strF + " " + ((int) f2));
                if (processExec != null) {
                    try {
                        int iWaitFor = processExec.waitFor();
                        i3 = iWaitFor;
                        process = iWaitFor;
                    } catch (IOException e2) {
                        process = processExec;
                        e = e2;
                        e.printStackTrace();
                        process = process;
                        if (process != null) {
                            process.destroy();
                        }
                    } catch (InterruptedException e3) {
                        process = processExec;
                        e = e3;
                        e.printStackTrace();
                        if (process != null) {
                            process = process;
                            process.destroy();
                        }
                    } catch (Throwable th) {
                        process = processExec;
                        th = th;
                        if (process != null) {
                            process.destroy();
                        }
                        throw th;
                    }
                }
                if (processExec != null) {
                    processExec.destroy();
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e4) {
            e = e4;
        } catch (InterruptedException e5) {
            e = e5;
        }
        return i3 == 0;
    }

    @Override // com.yftech.service.main.a.e
    public boolean a(int i2, boolean z2) throws Throwable {
        String strG = g(i2);
        if (TextUtils.isEmpty(strG)) {
            com.yftech.service.main.j.a.e("setChannelMute, channel(" + i2 + ") is invalid");
            return false;
        }
        Process process = null;
        process = null;
        process = null;
        process = null;
        int i3 = -1;
        i3 = -1;
        i3 = -1;
        i3 = -1;
        try {
            try {
                Process processExec = Runtime.getRuntime().exec("tinymix " + strG + " " + (z2 ? 1 : 0));
                if (processExec != null) {
                    try {
                        int iWaitFor = processExec.waitFor();
                        i3 = iWaitFor;
                        process = iWaitFor;
                    } catch (IOException e2) {
                        process = processExec;
                        e = e2;
                        e.printStackTrace();
                        process = process;
                        if (process != null) {
                            process.destroy();
                        }
                    } catch (InterruptedException e3) {
                        process = processExec;
                        e = e3;
                        e.printStackTrace();
                        if (process != null) {
                            process = process;
                            process.destroy();
                        }
                    } catch (Throwable th) {
                        process = processExec;
                        th = th;
                        if (process != null) {
                            process.destroy();
                        }
                        throw th;
                    }
                }
                if (processExec != null) {
                    processExec.destroy();
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e4) {
            e = e4;
        } catch (InterruptedException e5) {
            e = e5;
        }
        return i3 == 0;
    }

    @Override // com.yftech.service.main.a.e
    public boolean a(Context context) throws Throwable {
        try {
            IAudioSettings service = IAudioSettings.getService();
            if (service == null || service.asBinder() == null) {
                return false;
            }
            service.ping();
            return true;
        } catch (Exception e2) {
            com.yftech.service.main.j.a.c("isDspReady, get audio setting service failed: " + e2.getMessage());
            return false;
        }
    }

    @Override // com.yftech.service.main.a.e
    public boolean a(boolean z2) throws Throwable {
        if (z2) {
            SystemProperties.set("vendor.audiosetting.se_peak", "1");
            try {
                Process processExec = Runtime.getRuntime().exec("tinymix lmtr_enable 1");
                if (processExec == null) {
                    com.yftech.service.main.j.a.e("set tinymix lmtr_enable 1 failed");
                } else if (!processExec.waitFor(3L, TimeUnit.SECONDS)) {
                    com.yftech.service.main.j.a.e("set tinymix lmtr_enable 1 timeout");
                }
                Process processExec2 = Runtime.getRuntime().exec("tinymix lmtr_gain 20");
                if (processExec2 == null) {
                    com.yftech.service.main.j.a.e("set tinymix lmtr_gain 20 failed");
                } else if (!processExec2.waitFor(3L, TimeUnit.SECONDS)) {
                    com.yftech.service.main.j.a.e("set tinymix lmtr_gain 20 timeout");
                }
            } catch (IOException | InterruptedException e2) {
                e2.printStackTrace();
            }
        }
        if (!z2) {
            if (a(q, 0, false)) {
                return true;
            }
            com.yftech.service.main.j.a.e("setEQEnabled, set eq disable failed");
            return false;
        }
        if (this.F == -1 || e(this.F)) {
            return true;
        }
        com.yftech.service.main.j.a.e("setEQEnabled, set eq enable failed");
        return false;
    }

    @Override // com.yftech.service.main.a.e
    public boolean a(float[] fArr, float[] fArr2) throws Throwable {
        if (fArr == null || fArr.length != i.length) {
            com.yftech.service.main.j.a.e("setBandValue, param error");
            return false;
        }
        int[] iArr = new int[fArr.length];
        for (int i2 = 0; i2 < fArr.length; i2++) {
            iArr[i2] = (int) (fArr[i2] - k);
        }
        if (this.F == 1) {
            for (int i3 = 0; i3 < iArr.length && i3 < this.H.length; i3++) {
                this.H[i3] = iArr[i3];
            }
        }
        return a(iArr, 10, true);
    }

    @Override // com.yftech.service.main.a.e
    public boolean b(float f2, float f3, float f4, float f5) throws Throwable {
        int[] iArr = {AudioSettings.BalanceType.BALANCE_FRONT_LEFT.ordinal(), (int) f2};
        com.yftech.service.main.j.a.e("setBalanceValue, set fl result: " + AudioSettings.SetValue(27, iArr, iArr.length));
        iArr[0] = AudioSettings.BalanceType.BALANCE_FRONT_RIGHT.ordinal();
        iArr[1] = (int) f3;
        com.yftech.service.main.j.a.e("setBalanceValue, set fr result: " + AudioSettings.SetValue(27, iArr, iArr.length));
        iArr[0] = AudioSettings.BalanceType.BALANCE_REAR_LEFT.ordinal();
        iArr[1] = (int) f4;
        com.yftech.service.main.j.a.e("setBalanceValue, set rl result: " + AudioSettings.SetValue(27, iArr, iArr.length));
        iArr[0] = AudioSettings.BalanceType.BALANCE_REAR_RIGHT.ordinal();
        iArr[1] = (int) f5;
        com.yftech.service.main.j.a.e("setBalanceValue, set rr result: " + AudioSettings.SetValue(27, iArr, iArr.length));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a6 A[PHI: r5
      0x00a6: PHI (r5v8 java.lang.Process) = (r5v7 java.lang.Process), (r5v9 java.lang.Process) binds: [B:43:0x0091, B:53:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Process] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.BufferedReader] */
    @Override // com.yftech.service.main.a.e
    public boolean b(int i2) throws Throwable {
        ?? r0;
        Process processExec;
        BufferedReader bufferedReader;
        int iIndexOf;
        String line;
        String strG = g(i2);
        ?? IsEmpty = TextUtils.isEmpty(strG);
        if (IsEmpty != 0) {
            com.yftech.service.main.j.a.e("isChannelMute, channel(" + i2 + ") is invalid");
            return false;
        }
        ?? r6 = 0;
        BufferedReader bufferedReader2 = null;
        r6 = 0;
        str = null;
        str = null;
        String str = null;
        try {
            try {
                processExec = Runtime.getRuntime().exec("tinymix " + strG);
                if (processExec != null) {
                    try {
                        if (processExec.waitFor() == 0) {
                            bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                            try {
                                line = bufferedReader.readLine();
                                bufferedReader2 = bufferedReader;
                            } catch (IOException e2) {
                                e = e2;
                                e.printStackTrace();
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e3) {
                                        e3.printStackTrace();
                                    }
                                }
                                if (processExec != null) {
                                    processExec.destroy();
                                }
                            } catch (InterruptedException e4) {
                                e = e4;
                                e.printStackTrace();
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e5) {
                                        e5.printStackTrace();
                                    }
                                }
                                if (processExec != null) {
                                    processExec.destroy();
                                }
                            }
                        } else {
                            line = null;
                        }
                    } catch (IOException e6) {
                        e = e6;
                        bufferedReader = null;
                    } catch (InterruptedException e7) {
                        e = e7;
                        bufferedReader = null;
                    } catch (Throwable th) {
                        r0 = processExec;
                        th = th;
                        if (r6 != 0) {
                            try {
                                r6.close();
                            } catch (IOException e8) {
                                e8.printStackTrace();
                            }
                        }
                        if (r0 == 0) {
                            throw th;
                        }
                        r0.destroy();
                        throw th;
                    }
                } else {
                    line = null;
                }
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e9) {
                        e9.printStackTrace();
                    }
                }
                if (processExec != null) {
                    processExec.destroy();
                }
                str = line;
            } catch (Throwable th2) {
                r0 = strG;
                th = th2;
                r6 = IsEmpty;
            }
        } catch (IOException e10) {
            e = e10;
            processExec = null;
            bufferedReader = null;
        } catch (InterruptedException e11) {
            e = e11;
            processExec = null;
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
            r0 = 0;
        }
        com.yftech.service.main.j.a.c("isChannelMute, print:" + str);
        if (TextUtils.isEmpty(str) || (iIndexOf = str.indexOf(" ")) == -1) {
            return false;
        }
        return "On".equals(str.substring(iIndexOf).trim());
    }

    @Override // com.yftech.service.main.a.e
    public boolean b(int i2, boolean z2) {
        return true;
    }

    @Override // com.yftech.service.main.a.e
    public boolean b(Context context) throws Throwable {
        this.E = context;
        this.I = (AudioManager) context.getSystemService("audio");
        d.a(context).a(this.J);
        boolean z2 = true;
        if (!a(1, o)) {
            com.yftech.service.main.j.a.e("init, init dsp master volume failed");
            z2 = false;
        }
        if (!a(2, o)) {
            com.yftech.service.main.j.a.e("init, init dsp pri volume failed");
            z2 = false;
        }
        if (a(5, o)) {
            return z2;
        }
        com.yftech.service.main.j.a.e("init, init dsp dl1 volume failed");
        return false;
    }

    @Override // com.yftech.service.main.a.e
    public boolean b(boolean z2) throws Throwable {
        a(z2, Integer.MAX_VALUE);
        return true;
    }

    @Override // com.yftech.service.main.a.e
    public float[] b() {
        float[] fArr = new float[i.length];
        Arrays.fill(fArr, j);
        return fArr;
    }

    @Override // com.yftech.service.main.a.e
    public float[] c() {
        float[] fArr = new float[i.length];
        Arrays.fill(fArr, k);
        return fArr;
    }

    @Override // com.yftech.service.main.a.e
    public float[] c(int i2) throws Throwable {
        int[] iArr;
        switch (i2) {
            case 0:
                iArr = q;
                break;
            case 1:
                iArr = this.H;
                break;
            case 2:
                iArr = a(r, 1, true) ? r : r;
                break;
            case 3:
                iArr = s;
                break;
            case 4:
                iArr = t;
                break;
            case 5:
                iArr = u;
                break;
            case 6:
                iArr = v;
                break;
            case 7:
                iArr = w;
                break;
            case 8:
                iArr = x;
                break;
            case 9:
                iArr = y;
                break;
            case 10:
                iArr = z;
                break;
            default:
                com.yftech.service.main.j.a.e("getEQTypeBandValues, not support this type(" + i2 + ")");
                iArr = null;
                break;
        }
        if (iArr == null) {
            return null;
        }
        float[] fArr = new float[iArr.length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            fArr[i3] = iArr[i3] + k;
        }
        return fArr;
    }

    @Override // com.yftech.service.main.a.e
    public float[] d() {
        float[] fArr = new float[i.length];
        Arrays.fill(fArr, 50.0f);
        return fArr;
    }

    @Override // com.yftech.service.main.a.e
    public float[] d(int i2) throws Throwable {
        int[] iArr;
        switch (i2) {
            case 0:
                iArr = q;
                break;
            case 1:
                iArr = this.H;
                break;
            case 2:
                iArr = r;
                break;
            case 3:
                iArr = s;
                break;
            case 4:
                iArr = t;
                break;
            case 5:
                iArr = u;
                break;
            case 6:
                iArr = v;
                break;
            case 7:
                iArr = w;
                break;
            case 8:
                iArr = x;
                break;
            case 9:
                iArr = y;
                break;
            case 10:
                iArr = z;
                break;
            default:
                iArr = this.H;
                com.yftech.service.main.j.a.e("getEQTypeBandQs, not support this type(" + i2 + ")");
                break;
        }
        float[] fArr = new float[i.length];
        int[] iArr2 = {200, 200, 200, 200, 200, 200, 200, 200, 200, 200};
        int[] iArr3 = {50, 50, 50, 50, 50, 50, 50, 50, 50, 50};
        for (int i3 = 0; i3 < fArr.length; i3++) {
            if (iArr[i3] >= 15) {
                fArr[i3] = iArr2[i3];
            } else {
                fArr[i3] = iArr3[i3];
            }
        }
        return fArr;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006e  */
    @Override // com.yftech.service.main.a.e
    public boolean e(int i2) throws Throwable {
        boolean zA;
        if (!A) {
            switch (i2) {
                case 0:
                    zA = a(q, 10, true);
                    break;
                case 1:
                    zA = true;
                    break;
                case 2:
                    zA = a(r, 1, true);
                    break;
                case 3:
                    zA = a(s, 4, true);
                    break;
                case 4:
                    zA = a(t, 7, true);
                    break;
                case 5:
                    zA = a(u, 5, true);
                    break;
                case 6:
                    zA = a(v, 6, true);
                    break;
                case 7:
                    zA = a(w, 3, true);
                    break;
                case 8:
                    zA = a(x, 2, true);
                    break;
                case 9:
                    zA = a(y, 8, true);
                    break;
                case 10:
                    zA = a(z, 9, true);
                    break;
                default:
                    com.yftech.service.main.j.a.e("setEQType, not support this type(" + i2 + ")");
                    zA = false;
                    break;
            }
        } else {
            switch (i2) {
                case 0:
                    zA = a(q, 10, true);
                    break;
                case 1:
                    zA = true;
                    break;
                case 2:
                    zA = a(r, 10, true);
                    break;
                case 3:
                    zA = a(s, 10, true);
                    break;
                case 4:
                    zA = a(t, 10, true);
                    break;
                case 5:
                    zA = a(u, 10, true);
                    break;
                case 6:
                    zA = a(v, 10, true);
                    break;
                case 7:
                    zA = a(w, 10, true);
                    break;
                case 8:
                    zA = a(x, 10, true);
                    break;
                case 9:
                    zA = a(y, 10, true);
                    break;
                case 10:
                    zA = a(z, 10, true);
                    break;
                default:
                    com.yftech.service.main.j.a.e("setEQType, not support this type(" + i2 + ")");
                    zA = false;
                    break;
            }
        }
        if (zA) {
            this.F = i2;
            return true;
        }
        com.yftech.service.main.j.a.e("setEQType, set type(" + i2 + ") failed");
        return false;
    }

    @Override // com.yftech.service.main.a.e
    public float[] e() {
        float[] fArr = new float[i.length];
        Arrays.fill(fArr, 200.0f);
        return fArr;
    }

    @Override // com.yftech.service.main.a.e
    public int[] f() {
        return i;
    }

    @Override // com.yftech.service.main.a.e
    public float g() {
        return l;
    }

    @Override // com.yftech.service.main.a.e
    public float h() {
        return m;
    }

    @Override // com.yftech.service.main.a.e
    public float i() {
        return n;
    }

    @Override // com.yftech.service.main.a.e
    public float j() {
        return o;
    }

    @Override // com.yftech.service.main.a.e
    public float k() {
        return m;
    }
}
