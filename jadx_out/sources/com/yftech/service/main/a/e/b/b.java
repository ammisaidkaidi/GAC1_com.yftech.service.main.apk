package com.yftech.service.main.a.e.b;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import com.yftech.car.data.CarData;
import com.yftech.car.data.CarDataManager;
import com.yftech.car.screen.CarScreenManager;
import com.yftech.car.utils.PlatformProjectDescribe;
import com.yftech.service.main.CarMainService;
import com.yftech.service.main.b.e;
import com.yftech.vehicle.internal.adapter.ICarKey;

/* JADX INFO: loaded from: classes.dex */
public class b extends com.yftech.service.main.a.e.a.a {
    private Context e;
    private boolean f;
    private a g;
    private int h;
    private int i;
    private int j;
    private int k;
    private boolean l;

    class a implements Runnable {
        private static final int d = 300;
        private int c;
        private boolean b = false;
        private Thread e = new Thread(this, "VolumeLongClickThread");

        a(int i) {
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
                b.this.a(this.c == 3 ? 1 : -1);
                try {
                    Thread.sleep(300L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (this.b);
        }
    }

    public b(Context context) {
        super(context);
        this.f = false;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = false;
        this.e = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) throws Throwable {
        a(i, 1);
    }

    private void a(int i, int i2) throws Throwable {
        e eVarA = e.a(this.e);
        com.yftech.service.main.b.c cVarA = com.yftech.service.main.b.c.a(this.e);
        if (cVarA.m()) {
            if (this.j != -1) {
                eVarA.c(2, this.j, 1);
                this.j = -1;
                return;
            }
        } else if (cVarA.g()) {
            if (this.i != -1) {
                eVarA.c(0, this.i, 1);
                this.i = -1;
                return;
            }
        } else if (cVarA.i()) {
            if (this.k != -1) {
                eVarA.c(9, this.k, 1);
                this.k = -1;
                return;
            }
        } else if (!cVarA.h() && cVarA.p() != 24) {
            AudioManager audioManager = (AudioManager) this.e.getSystemService("audio");
            if (audioManager.isStreamMute(3)) {
                audioManager.adjustStreamVolume(3, 100, 1);
                return;
            }
        } else if (this.h != -1) {
            eVarA.c(24, this.h, 1);
            this.h = -1;
            return;
        }
        eVarA.b(Integer.MIN_VALUE, i, 1);
    }

    @Override // com.yftech.service.main.a.f
    public int a(com.yftech.service.main.g.b bVar) throws Throwable {
        int iA = bVar.a();
        if (iA == 11) {
            if (bVar.c() == 1 && bVar.d() != 2) {
                com.yftech.service.main.b.c cVarA = com.yftech.service.main.b.c.a(this.e);
                e eVarA = e.a(this.e);
                if (cVarA.m()) {
                    if (this.j == -1) {
                        this.j = eVarA.c(2);
                        eVarA.c(2, eVarA.e(2), 1);
                    } else {
                        eVarA.c(2, this.j, 1);
                        this.j = -1;
                    }
                } else if (cVarA.g()) {
                    if (this.i == -1) {
                        this.i = eVarA.c(0);
                        eVarA.c(0, eVarA.e(0), 1);
                    } else {
                        eVarA.c(0, this.i, 1);
                        this.i = -1;
                    }
                } else if (cVarA.i()) {
                    if (this.k == -1) {
                        this.k = eVarA.c(9);
                        eVarA.c(9, eVarA.e(9), 1);
                    } else {
                        eVarA.c(9, this.k, 1);
                        this.k = -1;
                    }
                } else if (!cVarA.h() && cVarA.p() != 24) {
                    AudioManager audioManager = (AudioManager) this.e.getSystemService("audio");
                    audioManager.adjustStreamVolume(3, audioManager.isStreamMute(3) ? 100 : -100, 1);
                } else if (this.h == -1) {
                    this.h = eVarA.c(24);
                    eVarA.c(24, eVarA.e(24), 1);
                } else {
                    eVarA.c(24, this.h, 1);
                    this.h = -1;
                }
            }
            return 5;
        }
        if (iA != 22) {
            switch (iA) {
                case 3:
                case 4:
                    if (bVar.c() == 0) {
                        if (this.g != null) {
                            this.g.b();
                            this.g = null;
                        }
                    } else if (bVar.c() == 2) {
                        if (this.g != null) {
                            this.g.b();
                            this.g = null;
                        }
                        this.g = new a(bVar.a());
                        this.g.a();
                    } else if (bVar.c() == 1) {
                        if (this.g != null) {
                            this.g.b();
                            this.g = null;
                        } else {
                            a(bVar.a() == 3 ? 1 : -1);
                        }
                    }
                    return 5;
                default:
                    return 6;
            }
        }
        if (!CarMainService.c) {
            if (bVar.c() == 2) {
                if (com.yftech.service.main.a.a.a(this.e).c().h()) {
                    if (CarScreenManager.getInstance().closeScreenBrightness(1)) {
                        this.l = true;
                    }
                } else if (CarScreenManager.getInstance().openScreenBrightness(1) && this.l) {
                    this.l = false;
                }
            }
            return 5;
        }
        if (bVar.c() == 1 && bVar.d() != 2) {
            com.yftech.service.main.b.c cVarA2 = com.yftech.service.main.b.c.a(this.e);
            e eVarA2 = e.a(this.e);
            if (cVarA2.m()) {
                if (this.j == -1) {
                    this.j = eVarA2.c(2);
                    eVarA2.c(2, eVarA2.e(2), 1);
                } else {
                    eVarA2.c(2, this.j, 1);
                    this.j = -1;
                }
            } else if (cVarA2.g()) {
                if (this.i == -1) {
                    this.i = eVarA2.c(0);
                    eVarA2.c(0, eVarA2.e(0), 1);
                } else {
                    eVarA2.c(0, this.i, 1);
                    this.i = -1;
                }
            } else if (cVarA2.i()) {
                if (this.k == -1) {
                    this.k = eVarA2.c(9);
                    eVarA2.c(9, eVarA2.e(9), 1);
                } else {
                    eVarA2.c(9, this.k, 1);
                    this.k = -1;
                }
            } else if (!cVarA2.h() && cVarA2.p() != 24) {
                AudioManager audioManager2 = (AudioManager) this.e.getSystemService("audio");
                audioManager2.adjustStreamVolume(3, audioManager2.isStreamMute(3) ? 100 : -100, 1);
            } else if (this.h == -1) {
                this.h = eVarA2.c(24);
                eVarA2.c(24, eVarA2.e(24), 1);
            } else {
                eVarA2.c(24, this.h, 1);
                this.h = -1;
            }
        }
        return 9;
    }

    @Override // com.yftech.service.main.a.f
    public String a() {
        return PlatformProjectDescribe.Project.CA1105.toString();
    }

    @Override // com.yftech.service.main.a.f
    public boolean a(ICarKey.CarKeyEvent carKeyEvent, int i) throws Throwable {
        com.yftech.service.main.b.c cVarA = com.yftech.service.main.b.c.a(this.e);
        if (cVarA.o()) {
            return false;
        }
        boolean z = true;
        if (carKeyEvent == null) {
            return true;
        }
        if (!com.yftech.service.main.a.a.a(this.e).c().h()) {
            if (carKeyEvent.keyCode != 22) {
                return false;
            }
            if (carKeyEvent.action == 0) {
                this.f = false;
                return true;
            }
            if (carKeyEvent.action == 2) {
                this.f = true;
                return true;
            }
            boolean z2 = this.f;
            this.f = false;
            return z2;
        }
        if (carKeyEvent.action == 1 && 11 != carKeyEvent.keyCode && 4 != carKeyEvent.keyCode && 3 != carKeyEvent.keyCode) {
            this.e.sendBroadcast(new Intent("com.android.systemui.ACTION_INPUT_EXIT_WARNING"));
            if (22 != carKeyEvent.keyCode) {
                this.e.sendBroadcast(new Intent("com.android.systemui.ACTION_INPUT_EXIT_SCREEN_SAVER"));
            }
        }
        if (cVarA.g() && (22 == carKeyEvent.keyCode || 1 == carKeyEvent.keyCode || 2 == carKeyEvent.keyCode)) {
            z = false;
        }
        if (z) {
            CarData carData = new CarData();
            carData.addDataEntry(new CarData.CarDataEntry("com.android.systemui.EnginehoodWarningOpen", false));
            CarData carData2 = CarDataManager.get(carData);
            if (carData2 != null && carData2.containsKey("com.android.systemui.EnginehoodWarningOpen") && carData2.getDataEntry("com.android.systemui.EnginehoodWarningOpen").getValueBoolean()) {
                com.yftech.service.main.j.a.c("isEffective, engine hood warning is show");
                z = false;
            }
        }
        com.yftech.service.main.j.a.c("isEffective:" + z);
        return z;
    }
}
