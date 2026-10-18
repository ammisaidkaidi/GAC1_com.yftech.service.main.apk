package android.a.a.a.a;

/* JADX INFO: loaded from: classes.dex */
public class l extends n {
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 3;
    public static final int l = 4;
    public static final int m = 5;
    c a;
    float b;
    l c;
    float d;
    l e;
    float f;
    private l s;
    private float t;
    int g = 0;
    private m u = null;
    private int v = 1;
    private m w = null;
    private int x = 1;

    public l(c cVar) {
        this.a = cVar;
    }

    String a(int i2) {
        if (i2 == 1) {
            return "DIRECT";
        }
        if (i2 == 2) {
            return "CENTER";
        }
        if (i2 == 3) {
            return "MATCH";
        }
        if (i2 == 4) {
            return "CHAIN";
        }
        return i2 == 5 ? "BARRIER" : "UNCONNECTED";
    }

    @Override // android.a.a.a.a.n
    public void a() {
        float fM;
        float f;
        if (this.r == 1 || this.g == 4) {
            return;
        }
        if (this.u != null) {
            if (this.u.r != 1) {
                return;
            } else {
                this.d = this.v * this.u.a;
            }
        }
        if (this.w != null) {
            if (this.w.r != 1) {
                return;
            } else {
                this.t = this.x * this.w.a;
            }
        }
        if (this.g == 1 && (this.c == null || this.c.r == 1)) {
            if (this.c == null) {
                this.e = this;
                this.f = this.d;
            } else {
                this.e = this.c.e;
                this.f = this.c.f + this.d;
            }
            g();
            return;
        }
        if (this.g != 2 || this.c == null || this.c.r != 1 || this.s == null || this.s.c == null || this.s.c.r != 1) {
            if (this.g != 3 || this.c == null || this.c.r != 1 || this.s == null || this.s.c == null || this.s.c.r != 1) {
                if (this.g == 5) {
                    this.a.d.c();
                    return;
                }
                return;
            }
            if (android.a.a.a.f.a() != null) {
                android.a.a.a.f.a().x++;
            }
            this.e = this.c.e;
            this.s.e = this.s.c.e;
            this.f = this.c.f + this.d;
            this.s.f = this.s.c.f + this.s.d;
            g();
            this.s.g();
            return;
        }
        if (android.a.a.a.f.a() != null) {
            android.a.a.a.f.a().w++;
        }
        this.e = this.c.e;
        this.s.e = this.s.c.e;
        float f2 = this.t > 0.0f ? this.c.f - this.s.c.f : this.s.c.f - this.c.f;
        if (this.a.e == c.EnumC0000c.LEFT || this.a.e == c.EnumC0000c.RIGHT) {
            fM = f2 - this.a.d.M();
            f = this.a.d.ao;
        } else {
            fM = f2 - this.a.d.Q();
            f = this.a.d.ap;
        }
        int iE = this.a.e();
        int iE2 = this.s.a.e();
        if (this.a.g() == this.s.a.g()) {
            f = 0.5f;
            iE = 0;
            iE2 = 0;
        }
        float f3 = iE;
        float f4 = iE2;
        float f5 = (fM - f3) - f4;
        if (this.t > 0.0f) {
            this.s.f = this.s.c.f + f4 + (f5 * f);
            this.f = (this.c.f - f3) - (f5 * (1.0f - f));
        } else {
            this.f = this.c.f + f3 + (f5 * f);
            this.s.f = (this.s.c.f - f4) - (f5 * (1.0f - f));
        }
        g();
        this.s.g();
    }

    public void a(int i2, l lVar, int i3) {
        this.g = i2;
        this.c = lVar;
        this.d = i3;
        this.c.a(this);
    }

    public void a(l lVar, float f) {
        if (this.r == 0 || !(this.e == lVar || this.f == f)) {
            this.e = lVar;
            this.f = f;
            if (this.r == 1) {
                e();
            }
            g();
        }
    }

    public void a(l lVar, int i2) {
        this.c = lVar;
        this.d = i2;
        this.c.a(this);
    }

    public void a(l lVar, int i2, m mVar) {
        this.c = lVar;
        this.c.a(this);
        this.u = mVar;
        this.v = i2;
        this.u.a(this);
    }

    @Override // android.a.a.a.a.n
    public void a(m mVar) {
        if (this.u == mVar) {
            this.u = null;
            this.d = this.v;
        } else if (this.u == this.w) {
            this.w = null;
            this.t = this.x;
        }
        a();
    }

    void a(android.a.a.a.f fVar) {
        android.a.a.a.i iVarB = this.a.b();
        if (this.e == null) {
            fVar.b(iVarB, (int) this.f);
        } else {
            fVar.c(iVarB, fVar.a(this.e.a), (int) this.f, 6);
        }
    }

    @Override // android.a.a.a.a.n
    public void b() {
        super.b();
        this.c = null;
        this.d = 0.0f;
        this.u = null;
        this.v = 1;
        this.w = null;
        this.x = 1;
        this.e = null;
        this.f = 0.0f;
        this.b = 0.0f;
        this.s = null;
        this.t = 0.0f;
        this.g = 0;
    }

    public void b(int i2) {
        this.g = i2;
    }

    public void b(l lVar, float f) {
        this.s = lVar;
        this.t = f;
    }

    public void b(l lVar, int i2, m mVar) {
        this.s = lVar;
        this.w = mVar;
        this.x = i2;
    }

    public void c() {
        c cVarG = this.a.g();
        if (cVarG == null) {
            return;
        }
        if (cVarG.g() == this.a) {
            this.g = 4;
            cVarG.a().g = 4;
        }
        int iE = this.a.e();
        if (this.a.e == c.EnumC0000c.RIGHT || this.a.e == c.EnumC0000c.BOTTOM) {
            iE = -iE;
        }
        a(cVarG.a(), iE);
    }

    public float d() {
        return this.f;
    }

    public String toString() {
        if (this.r != 1) {
            return "{ " + this.a + " UNRESOLVED} type: " + a(this.g);
        }
        if (this.e == this) {
            return "[" + this.a + ", RESOLVED: " + this.f + "]  type: " + a(this.g);
        }
        return "[" + this.a + ", RESOLVED: " + this.e + ":" + this.f + "] type: " + a(this.g);
    }
}
