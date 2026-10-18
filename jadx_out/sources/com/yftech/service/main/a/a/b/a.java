package com.yftech.service.main.a.a.b;

import android.os.SystemProperties;
import com.autochips.audiosettings.AudioSettings;
import com.yftech.car.audio.CarSoundEffectManager;
import com.yftech.car.utils.PlatformProjectDescribe;
import com.yftech.service.main.a.b;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class a implements b {
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    private static final int e = 4;
    private static final int f = 5;
    private static final int g = 6;
    private static final int h = 7;
    private int i = -1;
    private boolean j = false;
    private int k = -1;

    private boolean b() throws Throwable {
        com.yftech.service.main.j.a.c("setValueToDsp, enable=" + this.j + ", type=" + this.i + ", position=" + this.k);
        int[] iArr = new int[2];
        iArr[0] = this.j ? 1 : 0;
        switch (this.i) {
            case 0:
                iArr[1] = this.k != 0 ? 4 : 0;
                break;
            case 1:
                iArr[1] = this.k == 0 ? 1 : 5;
                break;
            case 2:
                iArr[1] = this.k == 0 ? 2 : 6;
                break;
            case 3:
                iArr[1] = this.k == 0 ? 3 : 7;
                break;
            default:
                com.yftech.service.main.j.a.e("setValueToDsp, unknown type:" + this.i);
                if (this.j) {
                    return false;
                }
                for (int i = 0; i < 8; i++) {
                    iArr[1] = i;
                    com.yftech.service.main.j.a.c("setValueToDsp, value=" + Arrays.toString(iArr) + ", result=" + AudioSettings.SetValue(62, iArr, 2));
                }
                return true;
        }
        com.yftech.service.main.j.a.c("setValueToDsp, value=" + Arrays.toString(iArr) + ", result=" + AudioSettings.SetValue(62, iArr, 2));
        return true;
    }

    @Override // com.yftech.service.main.a.b
    public String a() {
        return PlatformProjectDescribe.VehicleType.CBIHU12_A58.toString();
    }

    @Override // com.yftech.service.main.a.b
    public void a(PrintWriter printWriter) {
        printWriter.println("=======CarDtsAdapterA58=====");
        printWriter.println("enable=" + this.j);
        printWriter.println("type=" + this.i);
        printWriter.println("soundPosition=" + this.k);
    }

    @Override // com.yftech.service.main.a.b
    public void a(boolean z, int i, int i2) {
        this.i = i;
        this.k = i2;
        this.j = z;
    }

    @Override // com.yftech.service.main.a.b
    public boolean a(int i) throws Throwable {
        com.yftech.service.main.j.a.c("setType, type=" + i);
        this.i = i;
        return b();
    }

    @Override // com.yftech.service.main.a.b
    public boolean a(boolean z) throws Throwable {
        com.yftech.service.main.j.a.c("setEnable, enable=" + z);
        if (z) {
            SystemProperties.set("vendor.audiosetting.se_peak", "0");
            try {
                Process processExec = Runtime.getRuntime().exec("tinymix lmtr_enable 0");
                if (processExec == null) {
                    com.yftech.service.main.j.a.e("set tinymix lmtr_enable 0 failed");
                } else if (!processExec.waitFor(3L, TimeUnit.SECONDS)) {
                    com.yftech.service.main.j.a.e("set tinymix lmtr_enable 0 timeout");
                }
            } catch (IOException | InterruptedException e2) {
                e2.printStackTrace();
            }
        }
        this.j = z;
        StringBuilder sb = new StringBuilder();
        sb.append("tinymix 7 ");
        sb.append(z ? "1" : "0");
        try {
            Runtime.getRuntime().exec(sb.toString());
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        boolean zB = b();
        if (!z) {
            com.yftech.service.main.j.a.c("setEnable, to recovery sound position");
            CarSoundEffectManager.getInstance().setBalance(CarSoundEffectManager.getInstance().getBalanceValueFL(), CarSoundEffectManager.getInstance().getBalanceValueFR(), CarSoundEffectManager.getInstance().getBalanceValueRL(), CarSoundEffectManager.getInstance().getBalanceValueRR());
        }
        return zB;
    }

    @Override // com.yftech.service.main.a.b
    public boolean b(int i) throws Throwable {
        com.yftech.service.main.j.a.c("setSoundPosition, position=" + i);
        this.k = i;
        return b();
    }
}
