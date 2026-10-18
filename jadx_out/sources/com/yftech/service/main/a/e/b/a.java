package com.yftech.service.main.a.e.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.os.SystemClock;
import android.os.SystemProperties;
import android.provider.Settings;
import com.yftech.car.bluetooth.CarBluetoothManager;
import com.yftech.car.bluetooth.model.PhoneCall;
import com.yftech.car.data.CarData;
import com.yftech.car.data.CarDataManager;
import com.yftech.car.phonelink.CarPhoneLinkManager;
import com.yftech.car.utils.PlatformProjectDescribe;
import com.yftech.service.main.b.e;
import com.yftech.vehicle.internal.adapter.IBaseApi;
import com.yftech.vehicle.internal.adapter.ICarInfo;
import com.yftech.vehicle.internal.adapter.ICarKey;
import com.yftech.vehicle.sdk.CarDeviceManager;
import com.yftech.vehicle.sdk.CarInfoManager;
import com.yftech.vehicle.sdk.MpuProjectManager;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.yftech.service.main.a.e.a.a {
    private static final String e = "KEEP_NO_TIP";
    private static final String f = "boot_warn_ui";
    private static final int g = 2;
    private static final int h = 1;
    private static final int i = 0;
    private Context j;
    private boolean k;
    private long l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private RunnableC0006a q;

    /* JADX INFO: renamed from: com.yftech.service.main.a.e.b.a$a, reason: collision with other inner class name */
    class RunnableC0006a implements Runnable {
        private static final int d = 300;
        private int c;
        private boolean b = false;
        private Thread e = new Thread(this, "VolumeLongClickThread");

        RunnableC0006a(int i) {
            this.c = i;
        }

        public void a() {
            if (this.e == null || this.e.isAlive()) {
                return;
            }
            this.b = true;
            this.e.start();
        }

        public void b() {
            this.b = false;
            if (this.e != null && this.e.isAlive()) {
                this.e.interrupt();
            }
            this.e = null;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            do {
                a.this.a(this.c == 3 ? 1 : -1);
                try {
                    Thread.sleep(300L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (this.b);
        }
    }

    public a(Context context) {
        super(context);
        this.k = false;
        this.l = 0L;
        this.o = false;
        this.p = false;
        this.j = context;
        this.l = SystemClock.uptimeMillis();
        this.m = Settings.System.getInt(this.j.getContentResolver(), e, 0) == 0;
        this.n = Settings.System.getInt(this.j.getContentResolver(), f, 0) != 0;
        this.k = this.n;
        this.j.getContentResolver().registerContentObserver(Settings.System.getUriFor(e), true, new ContentObserver(new Handler()) { // from class: com.yftech.service.main.a.e.b.a.1
            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                super.onChange(z);
                a.this.m = Settings.System.getInt(a.this.j.getContentResolver(), a.e, 0) == 0;
            }
        });
        this.j.getContentResolver().registerContentObserver(Settings.System.getUriFor(f), true, new ContentObserver(new Handler()) { // from class: com.yftech.service.main.a.e.b.a.2
            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                super.onChange(z);
                a.this.n = Settings.System.getInt(a.this.j.getContentResolver(), a.f, 0) != 0;
                if (a.this.n) {
                    a.this.k = true;
                }
            }
        });
        this.j.registerReceiver(new BroadcastReceiver() { // from class: com.yftech.service.main.a.e.b.a.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) throws Throwable {
                int intExtra = intent.getIntExtra("type", 0);
                if (intExtra == 2 || intExtra == 3) {
                    boolean booleanExtra = intent.getBooleanExtra("isShow", false);
                    com.yftech.service.main.j.a.c("receive avm show state, isShow=" + booleanExtra);
                    a.this.o = booleanExtra;
                }
            }
        }, new IntentFilter("com.yftech.avmservice.SHOW_STATE"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2) throws Throwable {
        a(i2, 1);
    }

    private void a(int i2, int i3) throws Throwable {
        com.yftech.service.main.b.c cVarA = com.yftech.service.main.b.c.a(this.j);
        e eVarA = e.a(this.j);
        int iP = cVarA.p();
        com.yftech.service.main.c.a.e eVarB = com.yftech.service.main.c.a.b.a().b(iP);
        int iC = eVarA.c(iP);
        boolean zD = com.yftech.service.main.a.a.a(this.j).a().d();
        if (i2 == -1 && iC == 0) {
            return;
        }
        if (eVarA.i(eVarB.e().b()) && zD) {
            eVarA.a(false, eVarB.e().b(), 1, true);
            if (eVarA.b()) {
                eVarA.a(false, 1, true);
            }
            if (i2 == 1 && iC == 0 && com.yftech.service.main.a.a.a(this.j).a().c(eVarB.e().b())) {
                eVarA.c(iP, 1, 1);
                return;
            }
            return;
        }
        int iD = eVarA.d(iP);
        int iE = eVarA.e(iP);
        if (i2 == 1) {
            int i4 = iC + i3;
            if (i4 <= iD) {
                iD = i4;
            }
        } else {
            iD = iC - i3;
            if (iD < iE) {
                iD = iE;
            }
        }
        eVarA.c(iP, iD, 1);
        if (iD == 0 && com.yftech.service.main.a.a.a(this.j).a().c(eVarB.e().b())) {
            eVarA.a(true, 1, true);
        }
    }

    private int b() throws Throwable {
        CarData carData = CarDataManager.get(new CarData(new CarData.CarDataEntry("Keep_Mute_Warning_Enable", 1)));
        if (carData == null || carData.getDataEntry("Keep_Mute_Warning_Enable") == null) {
            return 1;
        }
        int valueInt = carData.getDataEntry("Keep_Mute_Warning_Enable").getValueInt();
        com.yftech.service.main.j.a.c("isEffective, getKeepMuteWarning value:" + valueInt);
        return valueInt;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x015e A[EDGE_INSN: B:127:0x015e->B:128:0x0160 BREAK  A[LOOP:0: B:122:0x0149->B:234:?]] */
    /* JADX WARN: Code duplicated, block: B:143:0x0186  */
    private boolean b(ICarKey.CarKeyEvent carKeyEvent, int i2) throws Throwable {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (!this.k) {
            if (this.m && SystemClock.uptimeMillis() - this.l <= 60000) {
                com.yftech.service.main.j.a.c("isEffective, warning window has not show");
                return false;
            }
            this.k = true;
        }
        com.yftech.service.main.b.c cVarA = com.yftech.service.main.b.c.a(this.j);
        if (cVarA.n() && (carKeyEvent.keyCode != 128 || i2 != 10)) {
            return false;
        }
        if (carKeyEvent != null) {
            if (this.o) {
                ICarInfo.GearPosition gearPosition = CarInfoManager.get().getGearPosition();
                if (!(carKeyEvent.keyCode == 128 && (i2 == 10 || g())) ? !(gearPosition != ICarInfo.GearPosition.REVERSE ? carKeyEvent.keyCode == 3 || carKeyEvent.keyCode == 4 || carKeyEvent.keyCode == 5 || carKeyEvent.keyCode == 11 || carKeyEvent.keyCode == 1 || carKeyEvent.keyCode == 2 || carKeyEvent.keyCode == 7 || carKeyEvent.keyCode == 8 || carKeyEvent.keyCode == 9 || carKeyEvent.keyCode == 6 || (carKeyEvent.keyCode == 128 && i2 == 7) : carKeyEvent.keyCode == 3 || carKeyEvent.keyCode == 4 ? cVarA.g() || cVarA.h() || cVarA.i() || b() == 0 : carKeyEvent.keyCode != 11 ? carKeyEvent.keyCode == 7 || carKeyEvent.keyCode == 8 || carKeyEvent.keyCode == 9 ? e() || f() : carKeyEvent.keyCode == 5 : com.yftech.service.main.b.c.a(this.j).g() || b() == 0) : !(g() || carKeyEvent.action != 2)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else if (cVarA.j()) {
                if (7 == carKeyEvent.keyCode || 8 == carKeyEvent.keyCode || 9 == carKeyEvent.keyCode || 3 == carKeyEvent.keyCode || 4 == carKeyEvent.keyCode || 11 == carKeyEvent.keyCode || 5 == carKeyEvent.keyCode) {
                    if (7 == carKeyEvent.keyCode) {
                        List phoneCalls = CarBluetoothManager.getInstance().getPhoneCalls();
                        if ((phoneCalls != null && !phoneCalls.isEmpty()) || f()) {
                            if (phoneCalls == null) {
                                z4 = false;
                                break;
                            }
                            Iterator it = phoneCalls.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z4 = false;
                                    break;
                                }
                                if (((PhoneCall) it.next()).getCallState() == 2) {
                                    z4 = true;
                                    break;
                                }
                            }
                            z2 = z4;
                        }
                    } else if (3 != carKeyEvent.keyCode && 4 != carKeyEvent.keyCode) {
                        if (5 == carKeyEvent.keyCode || 11 == carKeyEvent.keyCode) {
                            if (!cVarA.g() && cVarA.a(12)) {
                                z2 = true;
                            }
                        }
                        z = true;
                    } else if (cVarA.g() || cVarA.h() || cVarA.i() || (!cVarA.a(29) && !cVarA.a(14))) {
                        z = true;
                    }
                }
                z2 = false;
            } else {
                if (cVarA.g() || cVarA.o()) {
                    z = true;
                    if (3 == carKeyEvent.keyCode || 4 == carKeyEvent.keyCode || 7 == carKeyEvent.keyCode || 8 == carKeyEvent.keyCode || 9 == carKeyEvent.keyCode || carKeyEvent.keyCode == 128) {
                    }
                } else {
                    if (cVarA.k()) {
                        if (22 == carKeyEvent.keyCode || 9 == carKeyEvent.keyCode || 2 == carKeyEvent.keyCode || 1 == carKeyEvent.keyCode || 11 == carKeyEvent.keyCode || 5 == carKeyEvent.keyCode || 3 == carKeyEvent.keyCode || 4 == carKeyEvent.keyCode || 7 == carKeyEvent.keyCode || 6 == carKeyEvent.keyCode || 128 == carKeyEvent.keyCode || i2 == 7) {
                            if (7 == carKeyEvent.keyCode || 9 == carKeyEvent.keyCode) {
                                List phoneCalls2 = CarBluetoothManager.getInstance().getPhoneCalls();
                                if (((phoneCalls2 != null && !phoneCalls2.isEmpty()) || f()) && phoneCalls2 != null) {
                                    Iterator it2 = phoneCalls2.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            z3 = false;
                                            break;
                                        }
                                        if (((PhoneCall) it2.next()).getCallState() == 2) {
                                            z3 = true;
                                            break;
                                        }
                                    }
                                } else {
                                    z3 = false;
                                    break;
                                }
                                if (z3) {
                                    z2 = z3;
                                } else {
                                    if (CarPhoneLinkManager.getInstance().getCallStatus() != 1) {
                                        z4 = false;
                                        break;
                                    }
                                    z4 = true;
                                    z2 = z4;
                                }
                            } else if (128 != carKeyEvent.keyCode || i2 != 3) {
                            }
                        }
                    }
                    z = true;
                }
                z2 = false;
            }
            com.yftech.service.main.j.a.c("isEffective:" + z2);
            return z2;
        }
        z = true;
        z2 = z;
        com.yftech.service.main.j.a.c("isEffective:" + z2);
        return z2;
    }

    private boolean c() throws Throwable {
        IBaseApi.EnableState bSVDisplayState = CarDeviceManager.get().getBSVDisplayState();
        com.yftech.service.main.j.a.c("getBSVDisplayState state:" + bSVDisplayState);
        return (bSVDisplayState == null || IBaseApi.EnableState.__UNKNOWN__ == bSVDisplayState || bSVDisplayState != IBaseApi.EnableState.ENABLED) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0175  */
    private boolean c(ICarKey.CarKeyEvent carKeyEvent, int i2) throws Throwable {
        boolean z;
        boolean z2 = true;
        if (!this.k) {
            if (this.m && SystemClock.uptimeMillis() - this.l <= 60000) {
                com.yftech.service.main.j.a.c("isEffective, warning window has not show");
                return false;
            }
            this.k = true;
        }
        com.yftech.service.main.b.c cVarA = com.yftech.service.main.b.c.a(this.j);
        if (cVarA.n() && (carKeyEvent.keyCode != 128 || i2 != 10)) {
            return false;
        }
        if (carKeyEvent != null) {
            if (c() && carKeyEvent.keyCode != 4 && carKeyEvent.keyCode != 3) {
                return false;
            }
            if (this.o) {
                ICarInfo.GearPosition gearPosition = CarInfoManager.get().getGearPosition();
                if (carKeyEvent.keyCode != 128 && (gearPosition != ICarInfo.GearPosition.REVERSE ? !(carKeyEvent.keyCode == 3 || carKeyEvent.keyCode == 4 || carKeyEvent.keyCode == 5 || carKeyEvent.keyCode == 11 || carKeyEvent.keyCode == 1 || carKeyEvent.keyCode == 2 || carKeyEvent.keyCode == 7 || carKeyEvent.keyCode == 8 || carKeyEvent.keyCode == 9 || carKeyEvent.keyCode == 6 || (carKeyEvent.keyCode == 128 && i2 == 7)) : !(carKeyEvent.keyCode == 3 || carKeyEvent.keyCode == 4 ? cVarA.g() || cVarA.h() || cVarA.i() || b() == 0 : carKeyEvent.keyCode != 11 ? carKeyEvent.keyCode == 7 || carKeyEvent.keyCode == 8 || carKeyEvent.keyCode == 9 ? e() || f() : carKeyEvent.keyCode == 5 : com.yftech.service.main.b.c.a(this.j).g() || b() == 0))) {
                    z2 = false;
                }
            } else if (cVarA.j()) {
                if (7 == carKeyEvent.keyCode || 8 == carKeyEvent.keyCode || 9 == carKeyEvent.keyCode || 3 == carKeyEvent.keyCode || 4 == carKeyEvent.keyCode || 11 == carKeyEvent.keyCode || 5 == carKeyEvent.keyCode) {
                    if (7 == carKeyEvent.keyCode) {
                        List phoneCalls = CarBluetoothManager.getInstance().getPhoneCalls();
                        if ((phoneCalls != null && !phoneCalls.isEmpty()) || f()) {
                            if (phoneCalls != null) {
                                Iterator it = phoneCalls.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((PhoneCall) it.next()).getCallState() == 2) {
                                            z2 = z;
                                        }
                                    }
                                }
                            }
                            z2 = z;
                        }
                    } else if (3 == carKeyEvent.keyCode || 4 == carKeyEvent.keyCode ? !(cVarA.g() || cVarA.h() || cVarA.i() || (!cVarA.a(29) && !cVarA.a(14))) : !((5 != carKeyEvent.keyCode && 11 != carKeyEvent.keyCode) || (!cVarA.g() && cVarA.a(12)))) {
                    }
                    z2 = false;
                } else {
                    z2 = false;
                }
            } else if (cVarA.g() || cVarA.o()) {
                if (3 != carKeyEvent.keyCode && 4 != carKeyEvent.keyCode && 7 != carKeyEvent.keyCode && 8 != carKeyEvent.keyCode && 9 != carKeyEvent.keyCode && carKeyEvent.keyCode != 128) {
                    z2 = false;
                }
            } else if (cVarA.k()) {
                if (22 != carKeyEvent.keyCode && 9 != carKeyEvent.keyCode && 2 != carKeyEvent.keyCode && 1 != carKeyEvent.keyCode && 11 != carKeyEvent.keyCode && 5 != carKeyEvent.keyCode && 3 != carKeyEvent.keyCode && 4 != carKeyEvent.keyCode && 7 != carKeyEvent.keyCode && 6 != carKeyEvent.keyCode && 128 != carKeyEvent.keyCode && i2 != 7) {
                    z2 = false;
                } else if (7 == carKeyEvent.keyCode || 9 == carKeyEvent.keyCode) {
                    List phoneCalls2 = CarBluetoothManager.getInstance().getPhoneCalls();
                    if (((phoneCalls2 != null && !phoneCalls2.isEmpty()) || f()) && phoneCalls2 != null) {
                        Iterator it2 = phoneCalls2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z = false;
                                break;
                            }
                            if (((PhoneCall) it2.next()).getCallState() == 2) {
                                z = true;
                                break;
                            }
                        }
                    } else {
                        z = false;
                        break;
                    }
                    if (z) {
                        z2 = z;
                    } else {
                        boolean z3 = CarPhoneLinkManager.getInstance().getCallStatus() == 1;
                        z2 = z3;
                    }
                } else if (128 == carKeyEvent.keyCode && i2 == 3) {
                    z2 = false;
                }
            }
        }
        com.yftech.service.main.j.a.c("isEffective:" + z2);
        return z2;
    }

    private void d() throws Throwable {
        com.yftech.service.main.j.a.c("closeAvmApa");
        if (MpuProjectManager.get().setAvmApaCloseByMutleKey()) {
            return;
        }
        com.yftech.service.main.j.a.e("closeAvmApa, close failed");
    }

    private boolean e() throws Throwable {
        List phoneCalls = CarBluetoothManager.getInstance().getPhoneCalls();
        StringBuilder sb = new StringBuilder();
        sb.append("hasBtPhone, callListSize=");
        sb.append(phoneCalls == null ? "null" : Integer.valueOf(phoneCalls.size()));
        com.yftech.service.main.j.a.c(sb.toString());
        return (phoneCalls == null || phoneCalls.isEmpty()) ? false : true;
    }

    private boolean f() throws Throwable {
        int callStatus = CarPhoneLinkManager.getInstance().getCallStatus();
        com.yftech.service.main.j.a.c("hasLinkPhone, status=" + callStatus);
        return callStatus == 1 || callStatus == 3 || callStatus == 2;
    }

    private boolean g() {
        return "A79_G".equals(SystemProperties.get("ro.product.vendor.brand", ""));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.yftech.service.main.a.f
    public int a(com.yftech.service.main.g.b bVar) throws Throwable {
        if ((bVar.a() == 3 || bVar.a() == 4) && bVar.b() == Integer.MAX_VALUE && bVar.c() == 0) {
            if (Settings.System.getInt(this.j.getContentResolver(), "sound_effects_enabled", 0) == 1) {
                ((AudioManager) this.j.getSystemService("audio")).playSoundEffect(0);
            }
        }
        int iA = bVar.a();
        if (iA != 128) {
            switch (iA) {
                case 1:
                case 2:
                case 6:
                    if (this.o) {
                        if (CarInfoManager.get().getGearPosition() != ICarInfo.GearPosition.REVERSE && bVar.c() == 1) {
                            d();
                        }
                        return 9;
                    }
                    break;
                case 3:
                case 4:
                    PlatformProjectDescribe.Project project = PlatformProjectDescribe.getProject();
                    if (project == PlatformProjectDescribe.Project.CBIHU12 || project == PlatformProjectDescribe.Project.CBIHU12_C1) {
                        if (bVar.c() == 0) {
                            if (this.q == null) {
                                return 5;
                            }
                            this.q.b();
                            this.q = null;
                            return 5;
                        }
                        if (bVar.c() == 2) {
                            if (this.q != null) {
                                this.q.b();
                                this.q = null;
                            }
                            this.q = new RunnableC0006a(bVar.a());
                            this.q.a();
                            return 5;
                        }
                        if (bVar.c() != 1) {
                            return 5;
                        }
                        if (this.q == null) {
                            a(bVar.a() != 3 ? -1 : 1);
                            return 5;
                        }
                        this.q.b();
                        this.q = null;
                        return 5;
                    }
                    break;
                case 5:
                    if (this.o) {
                        if (CarInfoManager.get().getGearPosition() == ICarInfo.GearPosition.REVERSE) {
                            if (bVar.c() == 1 && bVar.d() != 2) {
                                return 9;
                            }
                        } else if (bVar.c() == 1 && bVar.d() != 2) {
                            d();
                            return 9;
                        }
                    } else if (com.yftech.service.main.b.c.a(this.j).j() && bVar.c() == 1 && bVar.d() != 2) {
                        return 9;
                    }
                    break;
                case 7:
                case 8:
                case 9:
                    if (this.o) {
                        if (CarInfoManager.get().getGearPosition() != ICarInfo.GearPosition.REVERSE && bVar.c() == 1) {
                            d();
                        }
                        List phoneCalls = CarBluetoothManager.getInstance().getPhoneCalls();
                        if ((phoneCalls == null || phoneCalls.isEmpty()) && !f()) {
                            return 9;
                        }
                    }
                    break;
            }
        } else {
            if (g() && this.o) {
                if (bVar.c() == 2 || (bVar.c() == 1 && bVar.d() == 2)) {
                    return 9;
                }
                ICarInfo.GearPosition gearPosition = CarInfoManager.get().getGearPosition();
                if (bVar.b() == 3) {
                    return 9;
                }
                if (bVar.b() == 2) {
                    if (gearPosition != ICarInfo.GearPosition.REVERSE && bVar.c() == 1) {
                        d();
                    }
                    return 9;
                }
                if (bVar.b() == 7) {
                    if (gearPosition == ICarInfo.GearPosition.REVERSE) {
                        return 9;
                    }
                    if (bVar.c() == 1) {
                        d();
                    }
                    return 6;
                }
            }
            if (bVar.b() == 10 || bVar.b() == 12 || bVar.b() == 13) {
                return 6;
            }
            if (com.yftech.service.main.b.c.a(this.j).o()) {
                if (bVar.b() != 10) {
                    return 9;
                }
            } else {
                if (com.yftech.service.main.b.c.a(this.j).g()) {
                    int iB = bVar.b();
                    return (iB == 10 || iB == 3 || bVar.c() == 0 || bVar.c() == 2 || bVar.d() == 2) ? 6 : 9;
                }
                if (bVar.b() == 10 && bVar.c() == 1 && bVar.d() == 2) {
                    return 9;
                }
            }
        }
        return 6;
    }

    @Override // com.yftech.service.main.a.f
    public String a() {
        return PlatformProjectDescribe.VehicleType.CBIHU12_A58.toString();
    }

    /* JADX WARN: Code duplicated, block: B:139:0x0179  */
    @Override // com.yftech.service.main.a.f
    public boolean a(ICarKey.CarKeyEvent carKeyEvent, int i2) throws Throwable {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (carKeyEvent.keyCode == 129) {
            return true;
        }
        if (g()) {
            return c(carKeyEvent, i2);
        }
        if (PlatformProjectDescribe.isCBIHU12C1Project()) {
            return b(carKeyEvent, i2);
        }
        if (!this.k) {
            if (this.m && SystemClock.uptimeMillis() - this.l <= 60000) {
                com.yftech.service.main.j.a.c("isEffective, warning window has not show");
                return false;
            }
            this.k = true;
        }
        com.yftech.service.main.b.c cVarA = com.yftech.service.main.b.c.a(this.j);
        if (cVarA.n()) {
            return false;
        }
        if (carKeyEvent != null) {
            if (this.o) {
                ICarInfo.GearPosition gearPosition = CarInfoManager.get().getGearPosition();
                if ((carKeyEvent.keyCode != 128 || i2 != 10) && (gearPosition != ICarInfo.GearPosition.REVERSE ? !(carKeyEvent.keyCode == 3 || carKeyEvent.keyCode == 4 || carKeyEvent.keyCode == 5 || carKeyEvent.keyCode == 11 || carKeyEvent.keyCode == 1 || carKeyEvent.keyCode == 2 || carKeyEvent.keyCode == 7 || carKeyEvent.keyCode == 8 || carKeyEvent.keyCode == 9 || carKeyEvent.keyCode == 6) : !(carKeyEvent.keyCode == 3 || carKeyEvent.keyCode == 4 ? cVarA.g() || cVarA.h() || cVarA.i() || b() == 0 : carKeyEvent.keyCode != 11 ? carKeyEvent.keyCode == 7 || carKeyEvent.keyCode == 8 || carKeyEvent.keyCode == 9 ? e() || f() : carKeyEvent.keyCode == 5 : com.yftech.service.main.b.c.a(this.j).g() || b() == 0))) {
                    z3 = false;
                }
            } else if (cVarA.j()) {
                if (7 != carKeyEvent.keyCode && 8 != carKeyEvent.keyCode && 9 != carKeyEvent.keyCode && 3 != carKeyEvent.keyCode && 4 != carKeyEvent.keyCode && 11 != carKeyEvent.keyCode && 5 != carKeyEvent.keyCode) {
                    z3 = false;
                } else if (7 == carKeyEvent.keyCode) {
                    List phoneCalls = CarBluetoothManager.getInstance().getPhoneCalls();
                    if ((phoneCalls == null || phoneCalls.isEmpty()) && !f()) {
                        z3 = false;
                    } else {
                        if (phoneCalls == null) {
                            z2 = false;
                            break;
                        }
                        Iterator it = phoneCalls.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z2 = false;
                                break;
                            }
                            if (((PhoneCall) it.next()).getCallState() == 2) {
                                z2 = true;
                                break;
                            }
                        }
                        z3 = z2;
                    }
                } else if (3 != carKeyEvent.keyCode) {
                }
            } else if (cVarA.g() || cVarA.o()) {
                if (3 != carKeyEvent.keyCode && 4 != carKeyEvent.keyCode && 7 != carKeyEvent.keyCode && 8 != carKeyEvent.keyCode && 9 != carKeyEvent.keyCode) {
                    z3 = false;
                }
            } else if (cVarA.k()) {
                if (22 != carKeyEvent.keyCode && 9 != carKeyEvent.keyCode && 2 != carKeyEvent.keyCode && 1 != carKeyEvent.keyCode && 11 != carKeyEvent.keyCode && 5 != carKeyEvent.keyCode && 3 != carKeyEvent.keyCode && 4 != carKeyEvent.keyCode && 7 != carKeyEvent.keyCode && 6 != carKeyEvent.keyCode && 128 != carKeyEvent.keyCode && i2 != 7) {
                    z3 = false;
                } else if (7 == carKeyEvent.keyCode || 9 == carKeyEvent.keyCode) {
                    List phoneCalls2 = CarBluetoothManager.getInstance().getPhoneCalls();
                    if (((phoneCalls2 != null && !phoneCalls2.isEmpty()) || f()) && phoneCalls2 != null) {
                        Iterator it2 = phoneCalls2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z = false;
                                break;
                            }
                            if (((PhoneCall) it2.next()).getCallState() == 2) {
                                z = true;
                                break;
                            }
                        }
                    } else {
                        z = false;
                        break;
                    }
                    if (z) {
                        z3 = z;
                    } else if (CarPhoneLinkManager.getInstance().getCallStatus() != 1) {
                        z3 = false;
                    }
                }
            }
        }
        com.yftech.service.main.j.a.c("isEffective:" + z3);
        return z3;
    }
}
