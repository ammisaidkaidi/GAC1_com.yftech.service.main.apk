package com.yftech.service.main.c.a;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class e {
    private final int a;
    private final String b;
    private final String c;
    private WeakReference<d> d;
    private WeakReference<c> e;
    private f f = new f();
    private f g = new f();

    public e(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public float a(int i) {
        return e().i().get(i).floatValue();
    }

    public int a() {
        return this.a;
    }

    public void a(c cVar) {
        this.e = new WeakReference<>(cVar);
    }

    public void a(d dVar) {
        this.d = new WeakReference<>(dVar);
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public d d() {
        return this.d.get();
    }

    public c e() {
        return this.e.get();
    }

    public f f() {
        return this.f;
    }

    public f g() {
        return this.g;
    }

    public String toString() {
        return "Stream:{streamType=" + this.a + ", id=" + this.b + ", use=" + this.c + ", policy=" + this.d.get() + ", channel=" + this.e.get() + "}";
    }
}
