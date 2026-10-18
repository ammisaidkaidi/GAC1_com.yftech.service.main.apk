package com.yftech.service.main.b;

import android.content.Context;
import com.yftech.service.main.CarMainService;
import com.yftech.service.main.a.i;
import com.yftech.service.main.c.a.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class d {
    private static volatile d a = null;
    private static final int f = 1;
    private static final int g = 0;
    private i b;
    private final List<a> d = new ArrayList();
    private Map<Integer, Map<Integer, b>> e = new HashMap();
    private float h = 0.0f;
    private com.yftech.service.main.c.a.b c = com.yftech.service.main.c.a.b.a();

    public static class a {
        public void a(int i, boolean z, int i2, int i3) {
        }
    }

    private class b {
        public float a;
        public int b;

        private b() {
        }
    }

    private d(Context context) {
        this.b = com.yftech.service.main.a.a.a(context).a();
        Iterator<com.yftech.service.main.c.a.c> it = this.c.b().iterator();
        while (it.hasNext()) {
            this.e.put(Integer.valueOf(it.next().b()), new HashMap());
        }
    }

    public static d a(Context context) {
        if (a == null) {
            synchronized (d.class) {
                if (a == null) {
                    a = new d(context);
                }
            }
        }
        return a;
    }

    private boolean b(int i, int i2, int i3) throws Throwable {
        if (CarMainService.c) {
            return c(i, i2, i3);
        }
        f fVarK = k(i);
        f fVarK2 = k(i2);
        com.yftech.service.main.c.a.c cVarA = this.c.a(i);
        com.yftech.service.main.c.a.c cVarA2 = this.c.a(i2);
        float fB = cVarA.b(fVarK.a());
        int iA = (fVarK2.a() * cVarA.f()) / cVarA2.f();
        float fB2 = cVarA.b(iA);
        float fB3 = cVarA.b(1);
        float f2 = ((fB2 - fB3) * i3 * 0.01f) + (fB - fB2);
        Map<Integer, b> map = this.e.get(Integer.valueOf(i));
        b bVar = map.get(Integer.valueOf(i2));
        if (bVar == null) {
            bVar = new b();
        }
        com.yftech.service.main.j.a.c("computeTempGain tarCurVolGain:" + fB + ", tarToRefVolGain:" + fB2 + ", validVolGain:" + fB3 + ", refToTarTempVolGainValue:" + f2 + ", tarToRefVol:" + iA);
        if (bVar.a == f2) {
            return false;
        }
        if (f2 > 0.0f) {
            bVar.a = f2;
            bVar.b = i3;
            map.put(Integer.valueOf(i2), bVar);
        } else {
            bVar.a = 0.0f;
            bVar.b = 0;
            map.put(Integer.valueOf(i2), bVar);
        }
        return true;
    }

    private boolean c(int i, int i2, int i3) throws Throwable {
        float fB = this.c.a(i).b(k(i).a());
        float f2 = i3 * fB * (-0.01f);
        Map<Integer, b> map = this.e.get(Integer.valueOf(i));
        b bVar = map.get(Integer.valueOf(i2));
        if (bVar == null) {
            bVar = new b();
        }
        com.yftech.service.main.j.a.c("computeTempGainForAuth tarCurVolGain:" + fB + ", refToTarTempVolGainValue:" + f2);
        if (bVar.a == f2) {
            return false;
        }
        if (f2 > 0.0f) {
            bVar.a = f2;
            bVar.b = i3;
            map.put(Integer.valueOf(i2), bVar);
            return true;
        }
        bVar.a = 0.0f;
        bVar.b = 0;
        map.put(Integer.valueOf(i2), bVar);
        return true;
    }

    private void g(int i) throws Throwable {
        f fVarK = k(i);
        com.yftech.service.main.c.a.c cVarA = this.c.a(i);
        if (fVarK.j()) {
            b(i, cVarA.i().get(0).floatValue());
            return;
        }
        float fB = cVarA.b(fVarK.a());
        Map<Integer, b> map = this.e.get(Integer.valueOf(i));
        for (Map.Entry<Integer, b> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            b value = entry.getValue();
            if (value != null && value.a != 0.0f) {
                f fVarK2 = k(iIntValue);
                if (!fVarK2.j() && fVarK2.a() != 0) {
                    fB -= value.a;
                }
                com.yftech.service.main.j.a.c("changeChannelVolume volumeGain:" + fB + ", refTempGain.gain:" + value.a);
            } else if (this.b.c(i)) {
                fB += this.h;
                com.yftech.service.main.j.a.c("changeChannelVolume volumeGain:" + fB + ", mVolumeBySpeedGain:" + this.h);
            }
        }
        if (map.isEmpty() && this.b.c(i)) {
            fB += this.h;
            com.yftech.service.main.j.a.c("changeChannelVolume volumeGain:" + fB + ", mVolumeBySpeedGain:" + this.h);
        }
        b(i, fB);
    }

    private void h(int i) throws Throwable {
        for (Map.Entry<Integer, b> entry : this.e.get(Integer.valueOf(i)).entrySet()) {
            int iIntValue = entry.getKey().intValue();
            b value = entry.getValue();
            if (value != null && value.a != 0.0f && value.b != 0) {
                b(i, iIntValue, value.b);
            }
        }
    }

    private void i(int i) throws Throwable {
        Iterator<com.yftech.service.main.c.a.c> it = this.c.b().iterator();
        while (it.hasNext()) {
            int iB = it.next().b();
            b bVar = this.e.get(Integer.valueOf(iB)).get(Integer.valueOf(i));
            if (bVar != null && bVar.a != 0.0f && bVar.b != 0 && b(iB, i, bVar.b)) {
                g(iB);
            }
        }
    }

    private boolean j(int i) {
        return this.c.a(i) != null;
    }

    private f k(int i) {
        return this.c.a(i).l();
    }

    public void a(float f2) {
        this.h = f2;
    }

    public void a(int i, int i2, int i3) throws Throwable {
        b(i, i2, i3);
        g(i);
    }

    public void a(a aVar) {
        if (aVar == null || this.d.contains(aVar)) {
            return;
        }
        this.d.add(aVar);
    }

    public boolean a(int i) throws Throwable {
        if (!j(i)) {
            com.yftech.service.main.j.a.d("muteMaster::config channels not included the channel index:" + i);
            return false;
        }
        f fVarK = k(i);
        if (fVarK.j()) {
            fVarK.b();
            return true;
        }
        fVarK.b();
        g(i);
        return true;
    }

    public boolean a(int i, float f2) {
        return this.b.a(i, f2);
    }

    public boolean a(int i, int i2) throws Throwable {
        if (!j(i)) {
            com.yftech.service.main.j.a.d("setChannelGain::config channels not included the channel index:" + i);
            return false;
        }
        f fVarK = k(i);
        int iA = fVarK.a();
        fVarK.a(i2);
        h(i);
        i(i);
        g(i);
        Iterator<a> it = this.d.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                return true;
            }
            a next = it.next();
            if (!fVarK.l() && !fVarK.k()) {
                z = false;
            }
            next.a(i, z, fVarK.a(), iA);
        }
    }

    public void b(int i, int i2) throws Throwable {
        Map<Integer, b> map = this.e.get(Integer.valueOf(i));
        b bVar = map.get(Integer.valueOf(i2));
        if (bVar != null) {
            bVar.a = 0.0f;
            bVar.b = 0;
            map.put(Integer.valueOf(i2), bVar);
            g(i);
        }
    }

    public void b(a aVar) {
        this.d.remove(aVar);
    }

    public boolean b(int i) throws Throwable {
        if (!j(i)) {
            com.yftech.service.main.j.a.d("muteChannel::config channels not included the channel index:" + i);
            return false;
        }
        f fVarK = k(i);
        if (fVarK.j()) {
            fVarK.d();
            return true;
        }
        fVarK.d();
        g(i);
        return true;
    }

    public boolean b(int i, float f2) {
        com.yftech.service.main.c.a.c cVarA = this.c.a(i);
        if (!cVarA.d()) {
            return this.b.b(i, f2);
        }
        for (com.yftech.service.main.c.a.e eVar : cVarA.j()) {
            if (!eVar.g().m()) {
                a(eVar.a(), f2);
            }
        }
        return true;
    }

    public boolean c(int i) throws Throwable {
        if (!this.c.c(i)) {
            com.yftech.service.main.j.a.d("muteStream::config stream not included the stream type:" + i);
            return false;
        }
        com.yftech.service.main.c.a.e eVarB = this.c.b(i);
        f fVarG = eVarB.g();
        if (fVarG.j()) {
            fVarG.f();
            return true;
        }
        fVarG.f();
        return a(i, eVarB.a(0));
    }

    public boolean d(int i) throws Throwable {
        if (!j(i)) {
            com.yftech.service.main.j.a.d("unmuteMaster::config channels not included the channel index:" + i);
            return false;
        }
        f fVarK = k(i);
        fVarK.c();
        if (fVarK.j()) {
            return true;
        }
        g(i);
        return true;
    }

    public boolean e(int i) throws Throwable {
        if (!j(i)) {
            com.yftech.service.main.j.a.d("unmuteChannel::config channels not included the channel index:" + i);
            return false;
        }
        f fVarK = k(i);
        fVarK.e();
        if (fVarK.j()) {
            return true;
        }
        g(i);
        return true;
    }

    public boolean f(int i) throws Throwable {
        if (!this.c.c(i)) {
            com.yftech.service.main.j.a.d("unmuteStream::config streams not included the stream type:" + i);
            return false;
        }
        com.yftech.service.main.c.a.e eVarB = this.c.b(i);
        f fVarG = eVarB.g();
        fVarG.g();
        if (fVarG.j()) {
            return true;
        }
        return a(i, eVarB.e().b(fVarG.a()));
    }
}
