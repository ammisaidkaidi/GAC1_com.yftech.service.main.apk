package com.yftech.service.main.a.a.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemProperties;
import com.yftech.car.utils.Loger;
import com.yftech.car.utils.PlatformProjectDescribe;
import com.yftech.service.main.CarMainService;
import com.yftech.vehicle.internal.adapter.ICarConfig;
import com.yftech.vehicle.internal.adapter.ICarMisc;
import com.yftech.vehicle.sdk.CarConfig;
import com.yftech.vehicle.sdk.CarMiscManager;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public class a extends com.yftech.service.main.a.a.c.a {
    private Context b;
    private boolean e;
    private Handler g;
    private final int[] c = {2};
    private boolean d = false;
    private com.yftech.service.main.b.c.b h = new com.yftech.service.main.b.c.b() { // from class: com.yftech.service.main.a.a.d.a.1
        @Override // com.yftech.service.main.b.c.b
        public void a(String str, int i, String str2) {
        }

        @Override // com.yftech.service.main.b.c.b
        public void a(String str, int i, String str2, int i2) {
        }

        @Override // com.yftech.service.main.b.c.b
        public void b(String str, int i, String str2, int i2) {
        }
    };
    private Runnable i = new Runnable() { // from class: com.yftech.service.main.a.a.d.a.2
        @Override // java.lang.Runnable
        public void run() {
            if (a.this.e) {
                AudioManager audioManager = (AudioManager) a.this.b.getSystemService("audio");
                for (int i : new int[]{3, 23, 9, 2, 0, 24}) {
                    com.yftech.service.main.c.a.c cVarE = com.yftech.service.main.c.a.b.a().b(i).e();
                    int iA = cVarE.k().a();
                    int iA2 = a.this.a(cVarE.b(), iA);
                    if (iA != iA2) {
                        audioManager.setStreamVolume(i, iA2, 1);
                    }
                }
                a.this.g.postDelayed(a.this.i, 1000L);
            }
        }
    };
    private CarMiscManager.CarMiscListener j = new CarMiscManager.CarMiscListener() { // from class: com.yftech.service.main.a.a.d.a.3
        public void onFactoryModeTransportModeChanged(ICarMisc.TransportMode transportMode) {
            Loger.i("onFactoryModeTransportModeChanged, mode=" + transportMode + ", lastMode=" + a.this.e);
            boolean z = transportMode == ICarMisc.TransportMode.TRANSPORT;
            if (z != a.this.e) {
                a.this.e = z;
                a.this.g.removeCallbacks(a.this.i);
                if (z) {
                    a.this.g.post(a.this.i);
                }
            }
        }
    };
    private HandlerThread f = new HandlerThread("volume.adapter");

    public a() {
        this.e = false;
        this.f.start();
        this.g = new Handler(this.f.getLooper());
        this.e = CarMiscManager.get().getFactoryModeTransportMode() == ICarMisc.TransportMode.TRANSPORT;
        Loger.i("CarVolumeAdapterA58, mIsTransportationMode=" + this.e);
        CarMiscManager.get().registerListener(this.j);
        this.g.postDelayed(this.i, 1000L);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    private void b(Context context, Collection<com.yftech.service.main.c.a.c> collection, SharedPreferences sharedPreferences) {
        if (sharedPreferences == null || collection == null || collection.isEmpty() || sharedPreferences.getInt(com.yftech.service.main.b.e.e, g()) != 2) {
            return;
        }
        for (com.yftech.service.main.c.a.c cVar : collection) {
            int iA = cVar.k().a();
            int i = 19;
            if (CarMainService.c) {
                if (iA < 2) {
                    i = 2;
                } else if (iA <= 19) {
                    i = iA;
                }
                cVar.k().a(i);
            } else if (c(cVar.b())) {
                if (iA < 5) {
                    i = 5;
                } else if (iA <= 19) {
                    i = iA;
                }
                cVar.k().a(i);
            }
        }
    }

    @Override // com.yftech.service.main.a.a.c.a, com.yftech.service.main.a.i
    public int a(int i, int i2) {
        if (!this.e) {
            return i2;
        }
        com.yftech.service.main.b.c cVarA = com.yftech.service.main.b.c.a(this.b);
        if (cVarA.o() || cVarA.g() || cVarA.m()) {
            return i2;
        }
        if (i == 11 || i == 15) {
            return 3;
        }
        com.yftech.service.main.c.a.c cVarA2 = com.yftech.service.main.c.a.b.a().a(i);
        if (cVarA2 == null) {
            return 0;
        }
        return cVarA2.e();
    }

    @Override // com.yftech.service.main.a.i
    public boolean a(int i) {
        return c(i);
    }

    @Override // com.yftech.service.main.a.a.c.a, com.yftech.service.main.a.i
    public boolean a(final Context context, Collection<com.yftech.service.main.c.a.c> collection, SharedPreferences sharedPreferences) {
        this.b = context;
        new Handler(context.getMainLooper()).post(new Runnable() { // from class: com.yftech.service.main.a.a.d.a.4
            @Override // java.lang.Runnable
            public void run() {
                com.yftech.service.main.b.c.a(context).a(a.this.h);
            }
        });
        b(context, collection, sharedPreferences);
        return super.a(context, collection, sharedPreferences);
    }

    @Override // com.yftech.service.main.a.i
    public String b() {
        return PlatformProjectDescribe.VehicleType.CBIHU12_A58.toString();
    }

    @Override // com.yftech.service.main.a.i
    public boolean b(int i) {
        return c(i);
    }

    @Override // com.yftech.service.main.a.i
    public String c() {
        PlatformProjectDescribe.Project project = PlatformProjectDescribe.getProject();
        String str = SystemProperties.get("ro.product.brand", "");
        if (project == PlatformProjectDescribe.Project.CBIHU23 || project == PlatformProjectDescribe.Project.CBIHU23_C1) {
            if (CarMainService.c) {
                return "source_policys_a58_auth.xml";
            }
            return "4.0".equals(SystemProperties.get("persist.version.hardware", "")) ? "source_policys_ihu23_v2.xml" : "source_policys_ihu23.xml";
        }
        if (CarMainService.c) {
            return "source_policys_a58_auth.xml";
        }
        return "A79_G".equals(str) ? "source_policys_a79.xml" : "source_policys_a58.xml";
    }

    @Override // com.yftech.service.main.a.i
    public boolean c(int i) {
        for (int i2 : this.c) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yftech.service.main.a.i
    public boolean d() {
        return true;
    }

    @Override // com.yftech.service.main.a.i
    public int[] d(int i) {
        for (int i2 : this.c) {
            if (i2 == i) {
                int[] iArr = new int[this.c.length - 1];
                int i3 = 0;
                for (int i4 = 0; i4 < this.c.length; i4++) {
                    if (this.c[i4] != i) {
                        iArr[i3] = this.c[i4];
                        i3++;
                    }
                }
                return iArr;
            }
        }
        return null;
    }

    @Override // com.yftech.service.main.a.i
    public boolean e() {
        return false;
    }

    @Override // com.yftech.service.main.a.i
    public boolean e(int i) {
        String str = SystemProperties.get("ro.product.brand", "");
        if (!PlatformProjectDescribe.isCBIHU12C1Project()) {
            return false;
        }
        if ("A79".equals(str) || "A79_G".equals(str)) {
            return c(i);
        }
        return false;
    }

    @Override // com.yftech.service.main.a.i
    public int f(int i) {
        String str = SystemProperties.get("ro.product.brand", "");
        if (PlatformProjectDescribe.isCBIHU12C1Project() && (("A79".equals(str) || "A79_G".equals(str)) && c(i))) {
            return 1;
        }
        return com.yftech.service.main.c.a.b.a().a(i).e();
    }

    @Override // com.yftech.service.main.a.i
    public boolean f() {
        return true;
    }

    @Override // com.yftech.service.main.a.i
    public int g() {
        return 2;
    }

    @Override // com.yftech.service.main.a.a.c.a
    public float i() {
        return CarConfig.getVehiclePlatform() == ICarConfig.VehiclePlatform.A88 ? -17.0f : -16.0f;
    }
}
