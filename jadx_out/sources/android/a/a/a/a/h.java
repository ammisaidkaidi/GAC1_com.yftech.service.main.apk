package android.a.a.a.a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class h extends f {
    public static final int a = 0;
    public static final int aJ = 2;
    public static final int aK = -1;
    public static final int b = 1;
    public static final int c = 0;
    public static final int d = 1;
    protected float aL = -1.0f;
    protected int aM = -1;
    protected int aN = -1;
    private c aO = this.K;
    private int aP = 0;
    private boolean aQ = false;
    private int aR = 0;
    private k aS = new k();
    private int aT = 8;

    public h() {
        this.X.clear();
        this.X.add(this.aO);
        int length = this.W.length;
        for (int i = 0; i < length; i++) {
            this.W[i] = this.aO;
        }
    }

    @Override // android.a.a.a.a.f
    public c a(c.EnumC0000c enumC0000c) {
        switch (enumC0000c) {
            case LEFT:
            case RIGHT:
                if (this.aP == 1) {
                    return this.aO;
                }
                break;
            case TOP:
            case BOTTOM:
                if (this.aP == 0) {
                    return this.aO;
                }
                break;
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return null;
        }
        throw new AssertionError(enumC0000c.name());
    }

    public void a(int i) {
        if (this.aP == i) {
            return;
        }
        this.aP = i;
        this.X.clear();
        if (this.aP == 1) {
            this.aO = this.J;
        } else {
            this.aO = this.K;
        }
        this.X.add(this.aO);
        int length = this.W.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.W[i2] = this.aO;
        }
    }

    @Override // android.a.a.a.a.f
    public void a(android.a.a.a.f fVar) {
        g gVar = (g) B();
        if (gVar == null) {
            return;
        }
        c cVarA = gVar.a(c.EnumC0000c.LEFT);
        c cVarA2 = gVar.a(c.EnumC0000c.RIGHT);
        boolean z = this.ab != null && this.ab.aa[0] == f.b.WRAP_CONTENT;
        if (this.aP == 0) {
            cVarA = gVar.a(c.EnumC0000c.TOP);
            cVarA2 = gVar.a(c.EnumC0000c.BOTTOM);
            z = this.ab != null && this.ab.aa[1] == f.b.WRAP_CONTENT;
        }
        if (this.aM != -1) {
            android.a.a.a.i iVarA = fVar.a(this.aO);
            fVar.c(iVarA, fVar.a(cVarA), this.aM, 6);
            if (z) {
                fVar.a(fVar.a(cVarA2), iVarA, 0, 5);
                return;
            }
            return;
        }
        if (this.aN == -1) {
            if (this.aL != -1.0f) {
                fVar.a(android.a.a.a.f.a(fVar, fVar.a(this.aO), fVar.a(cVarA), fVar.a(cVarA2), this.aL, this.aQ));
                return;
            }
            return;
        }
        android.a.a.a.i iVarA2 = fVar.a(this.aO);
        android.a.a.a.i iVarA3 = fVar.a(cVarA2);
        fVar.c(iVarA2, iVarA3, -this.aN, 6);
        if (z) {
            fVar.a(iVarA2, fVar.a(cVarA), 0, 5);
            fVar.a(iVarA3, iVarA2, 0, 5);
        }
    }

    public void a(boolean z) {
        if (this.aQ == z) {
            return;
        }
        this.aQ = z;
    }

    @Override // android.a.a.a.a.f
    public boolean a() {
        return true;
    }

    public void aB() {
        if (this.aM != -1) {
            l();
        } else if (this.aL != -1.0f) {
            n();
        } else if (this.aN != -1) {
            m();
        }
    }

    @Override // android.a.a.a.a.f
    public ArrayList<c> al() {
        return this.X;
    }

    @Override // android.a.a.a.a.f
    public void b(int i) {
        f fVarB = B();
        if (fVarB == null) {
            return;
        }
        if (h() == 1) {
            this.K.a().a(1, fVarB.K.a(), 0);
            this.M.a().a(1, fVarB.K.a(), 0);
            if (this.aM != -1) {
                this.J.a().a(1, fVarB.J.a(), this.aM);
                this.L.a().a(1, fVarB.J.a(), this.aM);
                return;
            } else if (this.aN != -1) {
                this.J.a().a(1, fVarB.L.a(), -this.aN);
                this.L.a().a(1, fVarB.L.a(), -this.aN);
                return;
            } else {
                if (this.aL == -1.0f || fVarB.av() != f.b.FIXED) {
                    return;
                }
                int i2 = (int) (fVarB.ac * this.aL);
                this.J.a().a(1, fVarB.J.a(), i2);
                this.L.a().a(1, fVarB.J.a(), i2);
                return;
            }
        }
        this.J.a().a(1, fVarB.J.a(), 0);
        this.L.a().a(1, fVarB.J.a(), 0);
        if (this.aM != -1) {
            this.K.a().a(1, fVarB.K.a(), this.aM);
            this.M.a().a(1, fVarB.K.a(), this.aM);
        } else if (this.aN != -1) {
            this.K.a().a(1, fVarB.M.a(), -this.aN);
            this.M.a().a(1, fVarB.M.a(), -this.aN);
        } else {
            if (this.aL == -1.0f || fVarB.aw() != f.b.FIXED) {
                return;
            }
            int i3 = (int) (fVarB.ad * this.aL);
            this.K.a().a(1, fVarB.K.a(), i3);
            this.M.a().a(1, fVarB.K.a(), i3);
        }
    }

    @Override // android.a.a.a.a.f
    public void b(android.a.a.a.f fVar) {
        if (B() == null) {
            return;
        }
        int iB = fVar.b(this.aO);
        if (this.aP == 1) {
            j(iB);
            k(0);
            q(B().Q());
            p(0);
            return;
        }
        j(0);
        k(iB);
        p(B().M());
        q(0);
    }

    public void c(int i) {
        this.aR = i;
    }

    @Override // android.a.a.a.a.f
    public String d() {
        return "Guideline";
    }

    public void d(int i) {
        e(i / 100.0f);
    }

    @Override // android.a.a.a.a.f
    public void d(int i, int i2) {
        if (this.aP == 1) {
            int i3 = i - this.ai;
            if (this.aM != -1) {
                e(i3);
                return;
            } else if (this.aN != -1) {
                f(B().M() - i3);
                return;
            } else {
                if (this.aL != -1.0f) {
                    e(i3 / B().M());
                    return;
                }
                return;
            }
        }
        int i4 = i2 - this.aj;
        if (this.aM != -1) {
            e(i4);
        } else if (this.aN != -1) {
            f(B().Q() - i4);
        } else if (this.aL != -1.0f) {
            e(i4 / B().Q());
        }
    }

    public int e() {
        if (this.aL != -1.0f) {
            return 0;
        }
        if (this.aM != -1) {
            return 1;
        }
        return this.aN != -1 ? 2 : -1;
    }

    public void e(float f) {
        if (f > -1.0f) {
            this.aL = f;
            this.aM = -1;
            this.aN = -1;
        }
    }

    public void e(int i) {
        if (i > -1) {
            this.aL = -1.0f;
            this.aM = i;
            this.aN = -1;
        }
    }

    public k f() {
        this.aS.a(S() - this.aT, T() - (this.aT * 2), this.aT * 2, this.aT * 2);
        if (h() == 0) {
            this.aS.a(S() - (this.aT * 2), T() - this.aT, this.aT * 2, this.aT * 2);
        }
        return this.aS;
    }

    public void f(int i) {
        if (i > -1) {
            this.aL = -1.0f;
            this.aM = -1;
            this.aN = i;
        }
    }

    public c g() {
        return this.aO;
    }

    public int h() {
        return this.aP;
    }

    public float i() {
        return this.aL;
    }

    public int j() {
        return this.aM;
    }

    public int k() {
        return this.aN;
    }

    void l() {
        float fK = K() / B().M();
        if (this.aP == 0) {
            fK = L() / B().Q();
        }
        e(fK);
    }

    void m() {
        int iK = K();
        if (this.aP == 0) {
            iK = L();
        }
        e(iK);
    }

    void n() {
        int iM = B().M() - K();
        if (this.aP == 0) {
            iM = B().Q() - L();
        }
        f(iM);
    }
}
