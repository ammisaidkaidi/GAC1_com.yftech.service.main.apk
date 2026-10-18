package android.a.a.a.a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f {
    protected static final int R = 0;
    protected static final int S = 1;
    protected static final int T = 2;
    protected static final int U = 3;
    protected static final int V = 4;
    static final int Y = 0;
    static final int Z = 1;
    private static final boolean a = false;
    public static float an = 0.5f;
    private static final int b = -2;
    protected static final int e = 1;
    protected static final int f = 2;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    public static final int k = -1;
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 0;
    public static final int o = 4;
    public static final int p = 8;
    public static final int q = 0;
    public static final int r = 1;
    public static final int s = 2;
    int A;
    float B;
    int C;
    int D;
    float E;
    boolean F;
    boolean G;
    int H;
    float I;
    c J;
    c K;
    c L;
    c M;
    c N;
    c O;
    c P;
    c Q;
    protected c[] W;
    protected ArrayList<c> X;
    int aA;
    int aB;
    boolean aC;
    boolean aD;
    float[] aE;
    protected f[] aF;
    protected f[] aG;
    f aH;
    f aI;
    private int aJ;
    private int aK;
    private int aL;
    private int aM;
    private int aN;
    private int aO;
    private Object aP;
    private int aQ;
    private int aR;
    private String aS;
    private String aT;
    protected b[] aa;
    f ab;
    int ac;
    int ad;
    protected float ae;
    protected int af;
    protected int ag;
    protected int ah;
    protected int ai;
    protected int aj;
    int ak;
    protected int al;
    protected int am;
    float ao;
    float ap;
    int aq;
    int ar;
    int as;
    int at;
    boolean au;
    boolean av;
    boolean aw;
    boolean ax;
    boolean ay;
    boolean az;
    private int[] c;
    private float d;
    public int t;
    public int u;
    m v;
    m w;
    int x;
    int y;
    int z;

    public enum a {
        BEGIN,
        MIDDLE,
        END,
        TOP,
        VERTICAL_MIDDLE,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public f() {
        this.t = -1;
        this.u = -1;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = 0;
        this.D = 0;
        this.E = 1.0f;
        this.H = -1;
        this.I = 1.0f;
        this.c = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.d = 0.0f;
        this.J = new c(this, c.EnumC0000c.LEFT);
        this.K = new c(this, c.EnumC0000c.TOP);
        this.L = new c(this, c.EnumC0000c.RIGHT);
        this.M = new c(this, c.EnumC0000c.BOTTOM);
        this.N = new c(this, c.EnumC0000c.BASELINE);
        this.O = new c(this, c.EnumC0000c.CENTER_X);
        this.P = new c(this, c.EnumC0000c.CENTER_Y);
        this.Q = new c(this, c.EnumC0000c.CENTER);
        this.W = new c[]{this.J, this.L, this.K, this.M, this.N, this.Q};
        this.X = new ArrayList<>();
        this.aa = new b[]{b.FIXED, b.FIXED};
        this.ab = null;
        this.ac = 0;
        this.ad = 0;
        this.ae = 0.0f;
        this.af = -1;
        this.ag = 0;
        this.ah = 0;
        this.aJ = 0;
        this.aK = 0;
        this.aL = 0;
        this.aM = 0;
        this.ai = 0;
        this.aj = 0;
        this.ak = 0;
        this.ao = an;
        this.ap = an;
        this.aQ = 0;
        this.aR = 0;
        this.aS = null;
        this.aT = null;
        this.aA = 0;
        this.aB = 0;
        this.aE = new float[]{0.0f, 0.0f};
        this.aF = new f[]{null, null};
        this.aG = new f[]{null, null};
        this.aH = null;
        this.aI = null;
        e();
    }

    public f(int i2, int i3) {
        this(0, 0, i2, i3);
    }

    public f(int i2, int i3, int i4, int i5) {
        this.t = -1;
        this.u = -1;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = 0;
        this.D = 0;
        this.E = 1.0f;
        this.H = -1;
        this.I = 1.0f;
        this.c = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.d = 0.0f;
        this.J = new c(this, c.EnumC0000c.LEFT);
        this.K = new c(this, c.EnumC0000c.TOP);
        this.L = new c(this, c.EnumC0000c.RIGHT);
        this.M = new c(this, c.EnumC0000c.BOTTOM);
        this.N = new c(this, c.EnumC0000c.BASELINE);
        this.O = new c(this, c.EnumC0000c.CENTER_X);
        this.P = new c(this, c.EnumC0000c.CENTER_Y);
        this.Q = new c(this, c.EnumC0000c.CENTER);
        this.W = new c[]{this.J, this.L, this.K, this.M, this.N, this.Q};
        this.X = new ArrayList<>();
        this.aa = new b[]{b.FIXED, b.FIXED};
        this.ab = null;
        this.ac = 0;
        this.ad = 0;
        this.ae = 0.0f;
        this.af = -1;
        this.ag = 0;
        this.ah = 0;
        this.aJ = 0;
        this.aK = 0;
        this.aL = 0;
        this.aM = 0;
        this.ai = 0;
        this.aj = 0;
        this.ak = 0;
        this.ao = an;
        this.ap = an;
        this.aQ = 0;
        this.aR = 0;
        this.aS = null;
        this.aT = null;
        this.aA = 0;
        this.aB = 0;
        this.aE = new float[]{0.0f, 0.0f};
        this.aF = new f[]{null, null};
        this.aG = new f[]{null, null};
        this.aH = null;
        this.aI = null;
        this.ag = i2;
        this.ah = i3;
        this.ac = i4;
        this.ad = i5;
        e();
        an();
    }

    /* JADX WARN: Code duplicated, block: B:161:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:164:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:165:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:167:0x0300  */
    /* JADX WARN: Code duplicated, block: B:168:0x0305  */
    /* JADX WARN: Code duplicated, block: B:170:0x0308  */
    /* JADX WARN: Code duplicated, block: B:179:? A[RETURN, SYNTHETIC] */
    private void a(android.a.a.a.f fVar, boolean z, android.a.a.a.i iVar, android.a.a.a.i iVar2, b bVar, boolean z2, c cVar, c cVar2, int i2, int i3, int i4, int i5, float f2, boolean z3, boolean z4, int i6, int i7, int i8, float f3, boolean z5) {
        boolean z6;
        int iMin;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        android.a.a.a.i iVarA;
        android.a.a.a.i iVarA2;
        int i16;
        int i17;
        int i18;
        android.a.a.a.i iVar3;
        boolean z7;
        boolean z8;
        int i19;
        int i20;
        int i21;
        boolean z9;
        int i22;
        android.a.a.a.i iVarA3 = fVar.a(cVar);
        android.a.a.a.i iVarA4 = fVar.a(cVar2);
        android.a.a.a.i iVarA5 = fVar.a(cVar.g());
        android.a.a.a.i iVarA6 = fVar.a(cVar2.g());
        if (fVar.d && cVar.a().r == 1 && cVar2.a().r == 1) {
            if (android.a.a.a.f.a() != null) {
                android.a.a.a.f.a().s++;
            }
            cVar.a().a(fVar);
            cVar2.a().a(fVar);
            if (z4 || !z) {
                return;
            }
            fVar.a(iVar2, iVarA4, 0, 6);
            return;
        }
        if (android.a.a.a.f.a() != null) {
            android.a.a.a.f.a().B++;
        }
        boolean zK = cVar.k();
        boolean zK2 = cVar2.k();
        boolean zK3 = this.Q.k();
        int i23 = zK ? 1 : 0;
        if (zK2) {
            i23++;
        }
        if (zK3) {
            i23++;
        }
        int i24 = z3 ? 3 : i6;
        switch (bVar) {
            case FIXED:
            case WRAP_CONTENT:
            case MATCH_PARENT:
            default:
                z6 = false;
                break;
            case MATCH_CONSTRAINT:
                z6 = true;
                break;
        }
        int i25 = i23;
        if (this.aR == 8) {
            iMin = 0;
            z6 = false;
        } else {
            iMin = i3;
        }
        if (z5) {
            if (!zK && !zK2 && !zK3) {
                fVar.b(iVarA3, i2);
            } else if (zK && !zK2) {
                i9 = 6;
                fVar.c(iVarA3, iVarA5, cVar.e(), 6);
            }
            i9 = 6;
        } else {
            i9 = 6;
        }
        if (z6) {
            i10 = i7 == -2 ? iMin : i7;
            if (i8 == -2) {
                i8 = iMin;
            }
            if (i10 > 0) {
                if (z) {
                    i11 = 6;
                    fVar.a(iVarA4, iVarA3, i10, 6);
                } else {
                    i11 = 6;
                    fVar.a(iVarA4, iVarA3, i10, 6);
                }
                iMin = Math.max(iMin, i10);
            } else {
                i11 = 6;
            }
            if (i8 > 0) {
                if (z) {
                    i12 = 1;
                    fVar.b(iVarA4, iVarA3, i8, 1);
                } else {
                    i12 = 1;
                    fVar.b(iVarA4, iVarA3, i8, i11);
                }
                iMin = Math.min(iMin, i8);
            } else {
                i12 = 1;
            }
            int i26 = iMin;
            i13 = i24;
            if (i13 == i12) {
                if (z) {
                    fVar.c(iVarA4, iVarA3, i26, 6);
                    i13 = i13;
                    iVarA5 = iVarA5;
                    iVarA6 = iVarA6;
                    i25 = i25;
                    i14 = 2;
                    i16 = 3;
                    i15 = 4;
                } else {
                    if (z4) {
                        i17 = 4;
                        fVar.c(iVarA4, iVarA3, i26, 4);
                    } else {
                        i17 = 4;
                        fVar.c(iVarA4, iVarA3, i26, i12);
                    }
                    i15 = i17;
                    i14 = 2;
                    i16 = 3;
                }
            } else if (i13 == 2) {
                if (cVar.d() == c.EnumC0000c.TOP || cVar.d() == c.EnumC0000c.BOTTOM) {
                    iVarA = fVar.a(this.ab.a(c.EnumC0000c.TOP));
                    iVarA2 = fVar.a(this.ab.a(c.EnumC0000c.BOTTOM));
                } else {
                    iVarA = fVar.a(this.ab.a(c.EnumC0000c.LEFT));
                    iVarA2 = fVar.a(this.ab.a(c.EnumC0000c.RIGHT));
                }
                i13 = i13;
                i15 = 4;
                i25 = i25;
                i14 = 2;
                i16 = 3;
                iVarA6 = iVarA6;
                iVarA5 = iVarA5;
                fVar.a(fVar.c().a(iVarA4, iVarA3, iVarA2, iVarA, f3));
                z6 = false;
            } else {
                i14 = 2;
                i15 = 4;
                i16 = 3;
            }
            if (z6 && i25 != i14 && !z3) {
                int iMax = Math.max(i10, i26);
                if (i8 > 0) {
                    iMax = Math.min(i8, iMax);
                }
                fVar.c(iVarA4, iVarA3, iMax, 6);
                z6 = false;
            }
        } else {
            if (z2) {
                i22 = 3;
                fVar.c(iVarA4, iVarA3, 0, 3);
                if (i4 > 0) {
                    fVar.a(iVarA4, iVarA3, i4, i9);
                }
                if (i5 < Integer.MAX_VALUE) {
                    fVar.b(iVarA4, iVarA3, i5, i9);
                }
            } else {
                i22 = 3;
                fVar.c(iVarA4, iVarA3, iMin, i9);
            }
            i10 = i7;
            i8 = i8;
            iVarA5 = iVarA5;
            iVarA6 = iVarA6;
            i13 = i24;
            i25 = i25;
            i14 = 2;
            i15 = 4;
            i16 = i22;
        }
        if (!z5 || z4) {
            if (i25 >= i14 || !z) {
                return;
            }
            fVar.a(iVarA3, iVar, 0, 6);
            fVar.a(iVar2, iVarA4, 0, 6);
            return;
        }
        int i27 = 5;
        if (!zK && !zK2 && !zK3) {
            if (z) {
                i18 = 0;
                fVar.a(iVar2, iVarA4, 0, 5);
            } else {
                i20 = 0;
            }
            i19 = 6;
            if (z) {
                fVar.a(iVar2, iVarA4, i20, i19);
            }
        }
        i18 = 0;
        if (!zK || zK2) {
            if (zK || !zK2) {
                int i28 = i16;
                android.a.a.a.i iVar4 = iVarA6;
                if (zK && zK2) {
                    if (z6) {
                        if (z && i4 == 0) {
                            fVar.a(iVarA4, iVarA3, 0, 6);
                        }
                        if (i13 == 0) {
                            if (i8 > 0 || i10 > 0) {
                                i21 = i15;
                                z9 = true;
                            } else {
                                i21 = 6;
                                z9 = false;
                            }
                            iVar3 = iVarA5;
                            fVar.c(iVarA3, iVar3, cVar.e(), i21);
                            fVar.c(iVarA4, iVar4, -cVar2.e(), i21);
                            boolean z10 = i8 > 0 || i10 > 0;
                            i27 = 5;
                            z8 = z9;
                            z7 = z10;
                        } else {
                            int i29 = i13;
                            iVar3 = iVarA5;
                            z7 = true;
                            if (i29 == 1) {
                                z8 = true;
                                i27 = 6;
                            } else if (i29 == i28) {
                                int i30 = !z3 ? 6 : i15;
                                fVar.c(iVarA3, iVar3, cVar.e(), i30);
                                fVar.c(iVarA4, iVar4, -cVar2.e(), i30);
                                i27 = 5;
                                z8 = true;
                            } else {
                                z7 = false;
                            }
                        }
                        if (z7) {
                            fVar.a(iVarA3, iVar3, cVar.e(), f2, iVar4, iVarA4, cVar2.e(), i27);
                        }
                        if (z8) {
                            i19 = 6;
                            fVar.a(iVarA3, iVar3, cVar.e(), 6);
                            iVarA4 = iVarA4;
                            fVar.b(iVarA4, iVar4, -cVar2.e(), 6);
                        } else {
                            iVarA4 = iVarA4;
                            i19 = 6;
                        }
                        if (z) {
                            i20 = 0;
                            fVar.a(iVarA3, iVar, 0, i19);
                        } else {
                            i20 = 0;
                        }
                    } else {
                        iVar3 = iVarA5;
                        z7 = true;
                        if (z) {
                            fVar.a(iVarA3, iVar3, cVar.e(), 5);
                            fVar.b(iVarA4, iVar4, -cVar2.e(), 5);
                        }
                    }
                    z8 = false;
                    if (z7) {
                        fVar.a(iVarA3, iVar3, cVar.e(), f2, iVar4, iVarA4, cVar2.e(), i27);
                    }
                    if (z8) {
                        i19 = 6;
                        fVar.a(iVarA3, iVar3, cVar.e(), 6);
                        iVarA4 = iVarA4;
                        fVar.b(iVarA4, iVar4, -cVar2.e(), 6);
                    } else {
                        iVarA4 = iVarA4;
                        i19 = 6;
                    }
                    if (z) {
                        i20 = 0;
                        fVar.a(iVarA3, iVar, 0, i19);
                    } else {
                        i20 = 0;
                    }
                }
                if (z) {
                    fVar.a(iVar2, iVarA4, i20, i19);
                }
            }
            fVar.c(iVarA4, iVarA6, -cVar2.e(), 6);
            if (z) {
                fVar.a(iVarA3, iVar, 0, 5);
            }
        } else if (z) {
            fVar.a(iVar2, iVarA4, 0, 5);
        }
        i20 = i18;
        i19 = 6;
        if (z) {
            fVar.a(iVar2, iVarA4, i20, i19);
        }
    }

    private void e() {
        this.X.add(this.J);
        this.X.add(this.K);
        this.X.add(this.L);
        this.X.add(this.M);
        this.X.add(this.O);
        this.X.add(this.P);
        this.X.add(this.Q);
        this.X.add(this.N);
    }

    public p A() {
        while (this.B() != null) {
            this = this.B();
        }
        if (this instanceof p) {
            return (p) this;
        }
        return null;
    }

    public f B() {
        return this.ab;
    }

    public boolean C() {
        return this.F;
    }

    public boolean D() {
        return this.G;
    }

    public int E() {
        return this.aR;
    }

    public String F() {
        return this.aS;
    }

    int G() {
        return this.aJ;
    }

    int H() {
        return this.aK;
    }

    public int I() {
        return this.aJ + this.aL;
    }

    public int J() {
        return this.aK + this.aM;
    }

    public int K() {
        return this.ag;
    }

    public int L() {
        return this.ah;
    }

    public int M() {
        if (this.aR == 8) {
            return 0;
        }
        return this.ac;
    }

    public int N() {
        int iMax;
        int i2 = this.ac;
        if (this.aa[0] != b.MATCH_CONSTRAINT) {
            return i2;
        }
        if (this.x == 1) {
            iMax = Math.max(this.z, i2);
        } else if (this.z > 0) {
            iMax = this.z;
            this.ac = iMax;
        } else {
            iMax = 0;
        }
        return (this.A <= 0 || this.A >= iMax) ? iMax : this.A;
    }

    public int O() {
        int iMax;
        int i2 = this.ad;
        if (this.aa[1] != b.MATCH_CONSTRAINT) {
            return i2;
        }
        if (this.y == 1) {
            iMax = Math.max(this.C, i2);
        } else if (this.C > 0) {
            iMax = this.C;
            this.ad = iMax;
        } else {
            iMax = 0;
        }
        return (this.D <= 0 || this.D >= iMax) ? iMax : this.D;
    }

    public int P() {
        return this.aN;
    }

    public int Q() {
        if (this.aR == 8) {
            return 0;
        }
        return this.ad;
    }

    public int R() {
        return this.aO;
    }

    public int S() {
        return this.aJ + this.ai;
    }

    public int T() {
        return this.aK + this.aj;
    }

    public int U() {
        return this.aL;
    }

    public int V() {
        return this.aM;
    }

    public int W() {
        return T() + this.aM;
    }

    public int X() {
        return S() + this.aL;
    }

    protected int Y() {
        return this.ag + this.ai;
    }

    protected int Z() {
        return this.ah + this.aj;
    }

    public c a(c.EnumC0000c enumC0000c) {
        switch (enumC0000c) {
            case LEFT:
                return this.J;
            case TOP:
                return this.K;
            case RIGHT:
                return this.L;
            case BOTTOM:
                return this.M;
            case BASELINE:
                return this.N;
            case CENTER:
                return this.Q;
            case CENTER_X:
                return this.O;
            case CENTER_Y:
                return this.P;
            case NONE:
                return null;
            default:
                throw new AssertionError(enumC0000c.name());
        }
    }

    public void a(float f2) {
        this.ao = f2;
    }

    public void a(float f2, int i2) {
        this.ae = f2;
        this.af = i2;
    }

    public void a(int i2, int i3, int i4, float f2) {
        this.x = i2;
        this.z = i3;
        this.A = i4;
        this.B = f2;
        if (f2 >= 1.0f || this.x != 0) {
            return;
        }
        this.x = 2;
    }

    public void a(int i2, int i3, int i4, int i5) {
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        this.ag = i2;
        this.ah = i3;
        if (this.aR == 8) {
            this.ac = 0;
            this.ad = 0;
            return;
        }
        if (this.aa[0] == b.FIXED && i6 < this.ac) {
            i6 = this.ac;
        }
        if (this.aa[1] == b.FIXED && i7 < this.ad) {
            i7 = this.ad;
        }
        this.ac = i6;
        this.ad = i7;
        if (this.ad < this.am) {
            this.ad = this.am;
        }
        if (this.ac < this.al) {
            this.ac = this.al;
        }
    }

    public void a(c.EnumC0000c enumC0000c, int i2) {
        switch (enumC0000c) {
            case LEFT:
                this.J.h = i2;
                break;
            case TOP:
                this.K.h = i2;
                break;
            case RIGHT:
                this.L.h = i2;
                break;
            case BOTTOM:
                this.M.h = i2;
                break;
        }
    }

    public void a(c.EnumC0000c enumC0000c, f fVar, c.EnumC0000c enumC0000c2) {
        a(enumC0000c, fVar, enumC0000c2, 0, c.b.STRONG);
    }

    public void a(c.EnumC0000c enumC0000c, f fVar, c.EnumC0000c enumC0000c2, int i2) {
        a(enumC0000c, fVar, enumC0000c2, i2, c.b.STRONG);
    }

    public void a(c.EnumC0000c enumC0000c, f fVar, c.EnumC0000c enumC0000c2, int i2, int i3) {
        a(enumC0000c).a(fVar.a(enumC0000c2), i2, i3, c.b.STRONG, 0, true);
    }

    public void a(c.EnumC0000c enumC0000c, f fVar, c.EnumC0000c enumC0000c2, int i2, c.b bVar) {
        a(enumC0000c, fVar, enumC0000c2, i2, bVar, 0);
    }

    public void a(c.EnumC0000c enumC0000c, f fVar, c.EnumC0000c enumC0000c2, int i2, c.b bVar, int i3) {
        boolean z;
        int i4 = 0;
        if (enumC0000c == c.EnumC0000c.CENTER) {
            if (enumC0000c2 != c.EnumC0000c.CENTER) {
                if (enumC0000c2 == c.EnumC0000c.LEFT || enumC0000c2 == c.EnumC0000c.RIGHT) {
                    a(c.EnumC0000c.LEFT, fVar, enumC0000c2, 0, bVar, i3);
                    a(c.EnumC0000c.RIGHT, fVar, enumC0000c2, 0, bVar, i3);
                    a(c.EnumC0000c.CENTER).a(fVar.a(enumC0000c2), 0, i3);
                    return;
                } else {
                    if (enumC0000c2 == c.EnumC0000c.TOP || enumC0000c2 == c.EnumC0000c.BOTTOM) {
                        a(c.EnumC0000c.TOP, fVar, enumC0000c2, 0, bVar, i3);
                        a(c.EnumC0000c.BOTTOM, fVar, enumC0000c2, 0, bVar, i3);
                        a(c.EnumC0000c.CENTER).a(fVar.a(enumC0000c2), 0, i3);
                        return;
                    }
                    return;
                }
            }
            c cVarA = a(c.EnumC0000c.LEFT);
            c cVarA2 = a(c.EnumC0000c.RIGHT);
            c cVarA3 = a(c.EnumC0000c.TOP);
            c cVarA4 = a(c.EnumC0000c.BOTTOM);
            boolean z2 = true;
            if ((cVarA == null || !cVarA.k()) && (cVarA2 == null || !cVarA2.k())) {
                a(c.EnumC0000c.LEFT, fVar, c.EnumC0000c.LEFT, 0, bVar, i3);
                a(c.EnumC0000c.RIGHT, fVar, c.EnumC0000c.RIGHT, 0, bVar, i3);
                z = true;
            } else {
                z = false;
            }
            if ((cVarA3 == null || !cVarA3.k()) && (cVarA4 == null || !cVarA4.k())) {
                a(c.EnumC0000c.TOP, fVar, c.EnumC0000c.TOP, 0, bVar, i3);
                a(c.EnumC0000c.BOTTOM, fVar, c.EnumC0000c.BOTTOM, 0, bVar, i3);
            } else {
                z2 = false;
            }
            if (z && z2) {
                a(c.EnumC0000c.CENTER).a(fVar.a(c.EnumC0000c.CENTER), 0, i3);
                return;
            } else if (z) {
                a(c.EnumC0000c.CENTER_X).a(fVar.a(c.EnumC0000c.CENTER_X), 0, i3);
                return;
            } else {
                if (z2) {
                    a(c.EnumC0000c.CENTER_Y).a(fVar.a(c.EnumC0000c.CENTER_Y), 0, i3);
                    return;
                }
                return;
            }
        }
        if (enumC0000c == c.EnumC0000c.CENTER_X && (enumC0000c2 == c.EnumC0000c.LEFT || enumC0000c2 == c.EnumC0000c.RIGHT)) {
            c cVarA5 = a(c.EnumC0000c.LEFT);
            c cVarA6 = fVar.a(enumC0000c2);
            c cVarA7 = a(c.EnumC0000c.RIGHT);
            cVarA5.a(cVarA6, 0, i3);
            cVarA7.a(cVarA6, 0, i3);
            a(c.EnumC0000c.CENTER_X).a(cVarA6, 0, i3);
            return;
        }
        if (enumC0000c == c.EnumC0000c.CENTER_Y && (enumC0000c2 == c.EnumC0000c.TOP || enumC0000c2 == c.EnumC0000c.BOTTOM)) {
            c cVarA8 = fVar.a(enumC0000c2);
            a(c.EnumC0000c.TOP).a(cVarA8, 0, i3);
            a(c.EnumC0000c.BOTTOM).a(cVarA8, 0, i3);
            a(c.EnumC0000c.CENTER_Y).a(cVarA8, 0, i3);
            return;
        }
        if (enumC0000c == c.EnumC0000c.CENTER_X && enumC0000c2 == c.EnumC0000c.CENTER_X) {
            a(c.EnumC0000c.LEFT).a(fVar.a(c.EnumC0000c.LEFT), 0, i3);
            a(c.EnumC0000c.RIGHT).a(fVar.a(c.EnumC0000c.RIGHT), 0, i3);
            a(c.EnumC0000c.CENTER_X).a(fVar.a(enumC0000c2), 0, i3);
            return;
        }
        if (enumC0000c == c.EnumC0000c.CENTER_Y && enumC0000c2 == c.EnumC0000c.CENTER_Y) {
            a(c.EnumC0000c.TOP).a(fVar.a(c.EnumC0000c.TOP), 0, i3);
            a(c.EnumC0000c.BOTTOM).a(fVar.a(c.EnumC0000c.BOTTOM), 0, i3);
            a(c.EnumC0000c.CENTER_Y).a(fVar.a(enumC0000c2), 0, i3);
            return;
        }
        c cVarA9 = a(enumC0000c);
        c cVarA10 = fVar.a(enumC0000c2);
        if (cVarA9.a(cVarA10)) {
            if (enumC0000c == c.EnumC0000c.BASELINE) {
                c cVarA11 = a(c.EnumC0000c.TOP);
                c cVarA12 = a(c.EnumC0000c.BOTTOM);
                if (cVarA11 != null) {
                    cVarA11.j();
                }
                if (cVarA12 != null) {
                    cVarA12.j();
                }
            } else {
                if (enumC0000c == c.EnumC0000c.TOP || enumC0000c == c.EnumC0000c.BOTTOM) {
                    c cVarA13 = a(c.EnumC0000c.BASELINE);
                    if (cVarA13 != null) {
                        cVarA13.j();
                    }
                    c cVarA14 = a(c.EnumC0000c.CENTER);
                    if (cVarA14.g() != cVarA10) {
                        cVarA14.j();
                    }
                    c cVarP = a(enumC0000c).p();
                    c cVarA15 = a(c.EnumC0000c.CENTER_Y);
                    if (cVarA15.k()) {
                        cVarP.j();
                        cVarA15.j();
                    }
                } else if (enumC0000c == c.EnumC0000c.LEFT || enumC0000c == c.EnumC0000c.RIGHT) {
                    c cVarA16 = a(c.EnumC0000c.CENTER);
                    if (cVarA16.g() != cVarA10) {
                        cVarA16.j();
                    }
                    c cVarP2 = a(enumC0000c).p();
                    c cVarA17 = a(c.EnumC0000c.CENTER_X);
                    if (cVarA17.k()) {
                        cVarP2.j();
                        cVarA17.j();
                    }
                }
                i4 = i2;
            }
            cVarA9.a(cVarA10, i4, bVar, i3);
            cVarA10.c().c(cVarA9.c());
        }
    }

    public void a(c cVar) {
        if (B() != null && (B() instanceof g) && ((g) B()).m()) {
            return;
        }
        c cVarA = a(c.EnumC0000c.LEFT);
        c cVarA2 = a(c.EnumC0000c.RIGHT);
        c cVarA3 = a(c.EnumC0000c.TOP);
        c cVarA4 = a(c.EnumC0000c.BOTTOM);
        c cVarA5 = a(c.EnumC0000c.CENTER);
        c cVarA6 = a(c.EnumC0000c.CENTER_X);
        c cVarA7 = a(c.EnumC0000c.CENTER_Y);
        if (cVar == cVarA5) {
            if (cVarA.k() && cVarA2.k() && cVarA.g() == cVarA2.g()) {
                cVarA.j();
                cVarA2.j();
            }
            if (cVarA3.k() && cVarA4.k() && cVarA3.g() == cVarA4.g()) {
                cVarA3.j();
                cVarA4.j();
            }
            this.ao = 0.5f;
            this.ap = 0.5f;
        } else if (cVar == cVarA6) {
            if (cVarA.k() && cVarA2.k() && cVarA.g().c() == cVarA2.g().c()) {
                cVarA.j();
                cVarA2.j();
            }
            this.ao = 0.5f;
        } else if (cVar == cVarA7) {
            if (cVarA3.k() && cVarA4.k() && cVarA3.g().c() == cVarA4.g().c()) {
                cVarA3.j();
                cVarA4.j();
            }
            this.ap = 0.5f;
        } else if (cVar == cVarA || cVar == cVarA2) {
            if (cVarA.k() && cVarA.g() == cVarA2.g()) {
                cVarA5.j();
            }
        } else if ((cVar == cVarA3 || cVar == cVarA4) && cVarA3.k() && cVarA3.g() == cVarA4.g()) {
            cVarA5.j();
        }
        cVar.j();
    }

    public void a(c cVar, c cVar2, int i2) {
        a(cVar, cVar2, i2, c.b.STRONG, 0);
    }

    public void a(c cVar, c cVar2, int i2, int i3) {
        a(cVar, cVar2, i2, c.b.STRONG, i3);
    }

    public void a(c cVar, c cVar2, int i2, c.b bVar, int i3) {
        if (cVar.c() == this) {
            a(cVar.d(), cVar2.c(), cVar2.d(), i2, bVar, i3);
        }
    }

    public void a(b bVar) {
        this.aa[0] = bVar;
        if (bVar == b.WRAP_CONTENT) {
            p(this.aN);
        }
    }

    public void a(f fVar, float f2, int i2) {
        a(c.EnumC0000c.CENTER, fVar, c.EnumC0000c.CENTER, i2, 0);
        this.d = f2;
    }

    public void a(android.a.a.a.d dVar) {
        this.J.a(dVar);
        this.K.a(dVar);
        this.L.a(dVar);
        this.M.a(dVar);
        this.N.a(dVar);
        this.Q.a(dVar);
        this.O.a(dVar);
        this.P.a(dVar);
    }

    public void a(android.a.a.a.f fVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        boolean z5;
        android.a.a.a.i iVar;
        android.a.a.a.f fVar2;
        f fVar3;
        boolean z6;
        boolean z7;
        android.a.a.a.i iVarA = fVar.a(this.J);
        android.a.a.a.i iVarA2 = fVar.a(this.L);
        android.a.a.a.i iVarA3 = fVar.a(this.K);
        android.a.a.a.i iVarA4 = fVar.a(this.M);
        android.a.a.a.i iVarA5 = fVar.a(this.N);
        if (this.ab != null) {
            z = this.ab != null && this.ab.aa[0] == b.WRAP_CONTENT;
            boolean z8 = this.ab != null && this.ab.aa[1] == b.WRAP_CONTENT;
            if ((this.J.f == null || this.J.f.f != this.J) && (this.L.f == null || this.L.f.f != this.L)) {
                z6 = false;
            } else {
                ((g) this.ab).a(this, 0);
                z6 = true;
            }
            if ((this.K.f == null || this.K.f.f != this.K) && (this.M.f == null || this.M.f.f != this.M)) {
                z7 = false;
            } else {
                ((g) this.ab).a(this, 1);
                z7 = true;
            }
            if (z && this.aR != 8 && this.J.f == null && this.L.f == null) {
                fVar.a(fVar.a(this.ab.L), iVarA2, 0, 1);
            }
            if (z8 && this.aR != 8 && this.K.f == null && this.M.f == null && this.N == null) {
                fVar.a(fVar.a(this.ab.M), iVarA4, 0, 1);
            }
            z2 = z8;
            z3 = z6;
            z4 = z7;
        } else {
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
        }
        int i4 = this.ac;
        if (i4 < this.al) {
            i4 = this.al;
        }
        int i5 = this.ad;
        if (i5 < this.am) {
            i5 = this.am;
        }
        boolean z9 = this.aa[0] != b.MATCH_CONSTRAINT;
        boolean z10 = this.aa[1] != b.MATCH_CONSTRAINT;
        this.H = this.af;
        this.I = this.ae;
        if (this.ae <= 0.0f || this.aR == 8) {
            i2 = i4;
            i3 = i5;
            z5 = false;
        } else {
            if (this.aa[0] == b.MATCH_CONSTRAINT && this.aa[1] == b.MATCH_CONSTRAINT) {
                a(z, z2, z9, z10);
            } else {
                if (this.aa[0] == b.MATCH_CONSTRAINT) {
                    this.H = 0;
                    i2 = (int) (this.I * this.ad);
                    i3 = i5;
                } else if (this.aa[1] == b.MATCH_CONSTRAINT) {
                    this.H = 1;
                    if (this.af == -1) {
                        this.I = 1.0f / this.I;
                    }
                    i3 = (int) (this.I * this.ac);
                    i2 = i4;
                }
                z5 = true;
            }
            i2 = i4;
            i3 = i5;
            z5 = true;
        }
        boolean z11 = z5 && (this.H == 0 || this.H == -1);
        boolean z12 = this.aa[0] == b.WRAP_CONTENT && (this instanceof g);
        boolean z13 = !this.Q.k();
        if (this.t != 2) {
            a(fVar, z, this.ab != null ? fVar.a(this.ab.J) : null, this.ab != null ? fVar.a(this.ab.L) : null, this.aa[0], z12, this.J, this.L, this.ag, i2, this.al, this.c[0], this.ao, z11, z3, this.x, this.z, this.A, this.B, z13);
        }
        if (this.u == 2) {
            return;
        }
        boolean z14 = this.aa[1] == b.WRAP_CONTENT && (this instanceof g);
        boolean z15 = z5 && (this.H == 1 || this.H == -1);
        if (this.ak <= 0) {
            iVar = iVarA3;
            fVar2 = fVar;
        } else if (this.N.a().r == 1) {
            fVar2 = fVar;
            this.N.a().a(fVar2);
            iVar = iVarA3;
        } else {
            fVar2 = fVar;
            iVar = iVarA3;
            fVar2.c(iVarA5, iVar, aj(), 6);
            if (this.N.f != null) {
                fVar2.c(iVarA5, fVar2.a(this.N.f), 0, 6);
                z13 = false;
            }
        }
        android.a.a.a.i iVar2 = iVar;
        a(fVar, z2, this.ab != null ? fVar2.a(this.ab.K) : null, this.ab != null ? fVar2.a(this.ab.M) : null, this.aa[1], z14, this.K, this.M, this.ah, i3, this.am, this.c[1], this.ap, z15, z4, this.y, this.C, this.D, this.E, z13);
        if (z5) {
            fVar3 = this;
            if (fVar3.H == 1) {
                fVar.a(iVarA4, iVar2, iVarA2, iVarA, fVar3.I, 6);
            } else {
                fVar.a(iVarA2, iVarA, iVarA4, iVar2, fVar3.I, 6);
            }
        } else {
            fVar3 = this;
        }
        if (fVar3.Q.k()) {
            fVar.a(fVar3, fVar3.Q.g().c(), (float) Math.toRadians(fVar3.d + 90.0f), fVar3.Q.e());
        }
    }

    public void a(android.a.a.a.f fVar, String str) {
        this.aS = str;
        android.a.a.a.i iVarA = fVar.a(this.J);
        android.a.a.a.i iVarA2 = fVar.a(this.K);
        android.a.a.a.i iVarA3 = fVar.a(this.L);
        android.a.a.a.i iVarA4 = fVar.a(this.M);
        iVarA.a(str + ".left");
        iVarA2.a(str + ".top");
        iVarA3.a(str + ".right");
        iVarA4.a(str + ".bottom");
        if (this.ak > 0) {
            fVar.a(this.N).a(str + ".baseline");
        }
    }

    public void a(Object obj) {
        this.aP = obj;
    }

    public void a(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.x == 0) {
            this.x = 3;
        }
        if (this.y == 0) {
            this.y = 3;
        }
        if (this.H == -1) {
            if (z3 && !z4) {
                this.H = 0;
            } else if (!z3 && z4) {
                this.H = 1;
                if (this.af == -1) {
                    this.I = 1.0f / this.I;
                }
            }
        }
        if (this.H == 0 && (!this.K.k() || !this.M.k())) {
            this.H = 1;
        } else if (this.H == 1 && (!this.J.k() || !this.L.k())) {
            this.H = 0;
        }
        if (this.H == -1 && (!this.K.k() || !this.M.k() || !this.J.k() || !this.L.k())) {
            if (this.K.k() && this.M.k()) {
                this.H = 0;
            } else if (this.J.k() && this.L.k()) {
                this.I = 1.0f / this.I;
                this.H = 1;
            }
        }
        if (this.H == -1) {
            if (z && !z2) {
                this.H = 0;
            } else if (!z && z2) {
                this.I = 1.0f / this.I;
                this.H = 1;
            }
        }
        if (this.H == -1) {
            if (this.z > 0 && this.C == 0) {
                this.H = 0;
                return;
            }
            if (this.z != 0 || this.C <= 0) {
                this.I = 1.0f / this.I;
                this.H = 1;
            } else {
                this.I = 1.0f / this.I;
                this.H = 1;
            }
        }
    }

    public boolean a() {
        return this.aR != 8;
    }

    public boolean a(f fVar) {
        f fVarB = B();
        if (fVarB == fVar) {
            return true;
        }
        if (fVarB == fVar.B()) {
            return false;
        }
        while (fVarB != null) {
            if (fVarB == fVar || fVarB == fVar.B()) {
                return true;
            }
            fVarB = fVarB.B();
        }
        return false;
    }

    public f aA() {
        if (!az()) {
            return null;
        }
        f fVar = this;
        f fVar2 = null;
        while (fVar2 == null && fVar != null) {
            c cVarA = fVar.a(c.EnumC0000c.TOP);
            c cVarG = cVarA == null ? null : cVarA.g();
            f fVarC = cVarG == null ? null : cVarG.c();
            if (fVarC == B()) {
                return fVar;
            }
            c cVarG2 = fVarC == null ? null : fVarC.a(c.EnumC0000c.BOTTOM).g();
            if (cVarG2 == null || cVarG2.c() == fVar) {
                fVar = fVarC;
            } else {
                fVar2 = fVar;
            }
        }
        return fVar2;
    }

    public int aa() {
        return this.al;
    }

    public int ab() {
        return this.am;
    }

    public int ac() {
        return K();
    }

    public int ad() {
        return L();
    }

    public int ae() {
        return K() + this.ac;
    }

    public int af() {
        return L() + this.ad;
    }

    public float ag() {
        return this.ao;
    }

    public float ah() {
        return this.ap;
    }

    public boolean ai() {
        return this.ak > 0;
    }

    public int aj() {
        return this.ak;
    }

    public Object ak() {
        return this.aP;
    }

    public ArrayList<c> al() {
        return this.X;
    }

    public void am() {
        int i2 = this.ag;
        int i3 = this.ah;
        int i4 = this.ag + this.ac;
        int i5 = this.ah + this.ad;
        this.aJ = i2;
        this.aK = i3;
        this.aL = i4 - i2;
        this.aM = i5 - i3;
    }

    public void an() {
        int i2 = this.ag;
        int i3 = this.ah;
        int i4 = this.ag + this.ac;
        int i5 = this.ah + this.ad;
        this.aJ = i2;
        this.aK = i3;
        this.aL = i4 - i2;
        this.aM = i5 - i3;
    }

    public float ao() {
        return this.ae;
    }

    public int ap() {
        return this.af;
    }

    public int aq() {
        return this.aQ;
    }

    public int ar() {
        return this.aA;
    }

    public int as() {
        return this.aB;
    }

    public void at() {
        au();
        b(an);
        a(an);
        if (this instanceof g) {
            return;
        }
        if (av() == b.MATCH_CONSTRAINT) {
            if (M() == P()) {
                a(b.WRAP_CONTENT);
            } else if (M() > aa()) {
                a(b.FIXED);
            }
        }
        if (aw() == b.MATCH_CONSTRAINT) {
            if (Q() == R()) {
                b(b.WRAP_CONTENT);
            } else if (Q() > ab()) {
                b(b.FIXED);
            }
        }
    }

    public void au() {
        f fVarB = B();
        if (fVarB != null && (fVarB instanceof g) && ((g) B()).m()) {
            return;
        }
        int size = this.X.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.X.get(i2).j();
        }
    }

    public b av() {
        return this.aa[0];
    }

    public b aw() {
        return this.aa[1];
    }

    public boolean ax() {
        if (this.J.f == null || this.J.f.f != this.J) {
            return this.L.f != null && this.L.f.f == this.L;
        }
        return true;
    }

    public f ay() {
        if (!ax()) {
            return null;
        }
        f fVar = this;
        f fVar2 = null;
        while (fVar2 == null && fVar != null) {
            c cVarA = fVar.a(c.EnumC0000c.LEFT);
            c cVarG = cVarA == null ? null : cVarA.g();
            f fVarC = cVarG == null ? null : cVarG.c();
            if (fVarC == B()) {
                return fVar;
            }
            c cVarG2 = fVarC == null ? null : fVarC.a(c.EnumC0000c.RIGHT).g();
            if (cVarG2 == null || cVarG2.c() == fVar) {
                fVar = fVarC;
            } else {
                fVar2 = fVar;
            }
        }
        return fVar2;
    }

    public boolean az() {
        if (this.K.f == null || this.K.f.f != this.K) {
            return this.M.f != null && this.M.f.f == this.M;
        }
        return true;
    }

    public void b() {
        for (int i2 = 0; i2 < 6; i2++) {
            this.W[i2].a().b();
        }
    }

    public void b(float f2) {
        this.ap = f2;
    }

    public void b(int i2) {
        j.a(i2, this);
    }

    public void b(int i2, int i3) {
        this.ag = i2;
        this.ah = i3;
    }

    public void b(int i2, int i3, int i4, float f2) {
        this.y = i2;
        this.C = i3;
        this.D = i4;
        this.E = f2;
        if (f2 >= 1.0f || this.y != 0) {
            return;
        }
        this.y = 2;
    }

    public void b(b bVar) {
        this.aa[1] = bVar;
        if (bVar == b.WRAP_CONTENT) {
            q(this.aO);
        }
    }

    public void b(f fVar) {
        this.ab = fVar;
    }

    public void b(android.a.a.a.f fVar) {
        a(fVar.b(this.J), fVar.b(this.K), fVar.b(this.L), fVar.b(this.M));
    }

    public void b(String str) {
        this.aT = str;
    }

    public void b(boolean z) {
        this.F = z;
    }

    public void c() {
    }

    public void c(float f2) {
        this.aE[0] = f2;
    }

    public void c(int i2, int i3) {
        this.ai = i2;
        this.aj = i3;
    }

    public void c(f fVar) {
    }

    public void c(String str) {
        this.aS = str;
    }

    public void c(boolean z) {
        this.G = z;
    }

    public String d() {
        return this.aT;
    }

    public void d(float f2) {
        this.aE[1] = f2;
    }

    public void d(int i2, int i3) {
        this.aJ = i2 - this.ai;
        this.aK = i3 - this.aj;
        this.ag = this.aJ;
        this.ah = this.aK;
    }

    public void d(f fVar) {
        ArrayList<c> arrayListAl = al();
        int size = arrayListAl.size();
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = arrayListAl.get(i2);
            if (cVar.k() && cVar.g().c() == fVar) {
                cVar.j();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0084 A[PHI: r0
      0x0084: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:45:0x0084, B:35:0x007d, B:23:0x004f, B:25:0x0055, B:27:0x0061, B:29:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:39:0x0085). Please report as a decompilation issue!!! */
    public void d(String str) {
        float fAbs;
        int i2 = 0;
        if (str == null || str.length() == 0) {
            this.ae = 0.0f;
            return;
        }
        int i3 = -1;
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i4 = 0;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (strSubstring.equalsIgnoreCase("W")) {
                i3 = 0;
            } else if (strSubstring.equalsIgnoreCase("H")) {
                i3 = 1;
            }
            i4 = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        try {
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i4);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                } else {
                    fAbs = i2;
                }
            } else {
                String strSubstring3 = str.substring(i4, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                    fAbs = i2;
                } else {
                    float f2 = Float.parseFloat(strSubstring3);
                    float f3 = Float.parseFloat(strSubstring4);
                    if (f2 <= 0.0f || f3 <= 0.0f) {
                        fAbs = i2;
                    } else {
                        fAbs = i3 == 1 ? Math.abs(f3 / f2) : Math.abs(f2 / f3);
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        i2 = (fAbs > i2 ? 1 : (fAbs == i2 ? 0 : -1));
        if (i2 > 0) {
            this.ae = fAbs;
            this.af = i3;
        }
    }

    public void e(int i2, int i3) {
        this.ac = i2;
        if (this.ac < this.al) {
            this.ac = this.al;
        }
        this.ad = i3;
        if (this.ad < this.am) {
            this.ad = this.am;
        }
    }

    public void e(f fVar) {
        ArrayList<c> arrayListAl = al();
        int size = arrayListAl.size();
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = arrayListAl.get(i2);
            if (cVar.k() && cVar.g().c() == fVar && cVar.i() == 2) {
                cVar.j();
            }
        }
    }

    public void f(int i2, int i3) {
        this.ag = i2;
        this.ac = i3 - i2;
        if (this.ac < this.al) {
            this.ac = this.al;
        }
    }

    public void g(int i2) {
        this.c[0] = i2;
    }

    public void g(int i2, int i3) {
        this.ah = i2;
        this.ad = i3 - i2;
        if (this.ad < this.am) {
            this.ad = this.am;
        }
    }

    public void h(int i2) {
        this.c[1] = i2;
    }

    public void i(int i2) {
        this.aR = i2;
    }

    public void j(int i2) {
        this.ag = i2;
    }

    public void k(int i2) {
        this.ah = i2;
    }

    public void l(int i2) {
        this.aJ = i2 - this.ai;
        this.ag = this.aJ;
    }

    public void m(int i2) {
        this.aK = i2 - this.aj;
        this.ah = this.aK;
    }

    public void n(int i2) {
        this.aL = i2;
    }

    public int o() {
        return this.c[1];
    }

    public void o(int i2) {
        this.aM = i2;
    }

    public int p() {
        return this.c[0];
    }

    public void p(int i2) {
        this.ac = i2;
        if (this.ac < this.al) {
            this.ac = this.al;
        }
    }

    public void q(int i2) {
        this.ad = i2;
        if (this.ad < this.am) {
            this.ad = this.am;
        }
    }

    public boolean q() {
        return this.x == 0 && this.ae == 0.0f && this.z == 0 && this.A == 0 && this.aa[0] == b.MATCH_CONSTRAINT;
    }

    public void r(int i2) {
        if (i2 < 0) {
            this.al = 0;
        } else {
            this.al = i2;
        }
    }

    public boolean r() {
        return this.y == 0 && this.ae == 0.0f && this.C == 0 && this.D == 0 && this.aa[1] == b.MATCH_CONSTRAINT;
    }

    public void s() {
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.ab = null;
        this.d = 0.0f;
        this.ac = 0;
        this.ad = 0;
        this.ae = 0.0f;
        this.af = -1;
        this.ag = 0;
        this.ah = 0;
        this.aJ = 0;
        this.aK = 0;
        this.aL = 0;
        this.aM = 0;
        this.ai = 0;
        this.aj = 0;
        this.ak = 0;
        this.al = 0;
        this.am = 0;
        this.aN = 0;
        this.aO = 0;
        this.ao = an;
        this.ap = an;
        this.aa[0] = b.FIXED;
        this.aa[1] = b.FIXED;
        this.aP = null;
        this.aQ = 0;
        this.aR = 0;
        this.aT = null;
        this.ay = false;
        this.az = false;
        this.aA = 0;
        this.aB = 0;
        this.aC = false;
        this.aD = false;
        this.aE[0] = 0.0f;
        this.aE[1] = 0.0f;
        this.t = -1;
        this.u = -1;
        this.c[0] = Integer.MAX_VALUE;
        this.c[1] = Integer.MAX_VALUE;
        this.x = 0;
        this.y = 0;
        this.B = 1.0f;
        this.E = 1.0f;
        this.A = Integer.MAX_VALUE;
        this.D = Integer.MAX_VALUE;
        this.z = 0;
        this.C = 0;
        this.H = -1;
        this.I = 1.0f;
        if (this.v != null) {
            this.v.b();
        }
        if (this.w != null) {
            this.w.b();
        }
    }

    public void s(int i2) {
        if (i2 < 0) {
            this.am = 0;
        } else {
            this.am = i2;
        }
    }

    public void t() {
        for (int i2 = 0; i2 < 6; i2++) {
            this.W[i2].a().c();
        }
    }

    public void t(int i2) {
        this.aN = i2;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (this.aT != null) {
            str = "type: " + this.aT + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.aS != null) {
            str2 = "id: " + this.aS + " ";
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.ag);
        sb.append(", ");
        sb.append(this.ah);
        sb.append(") - (");
        sb.append(this.ac);
        sb.append(" x ");
        sb.append(this.ad);
        sb.append(") wrap: (");
        sb.append(this.aN);
        sb.append(" x ");
        sb.append(this.aO);
        sb.append(")");
        return sb.toString();
    }

    public void u(int i2) {
        this.aO = i2;
    }

    public boolean u() {
        return this.J.a().r == 1 && this.L.a().r == 1 && this.K.a().r == 1 && this.M.a().r == 1;
    }

    public m v() {
        if (this.v == null) {
            this.v = new m();
        }
        return this.v;
    }

    public void v(int i2) {
        this.ak = i2;
    }

    public m w() {
        if (this.w == null) {
            this.w = new m();
        }
        return this.w;
    }

    public void w(int i2) {
        if (i2 >= 0) {
            this.aQ = i2;
        } else {
            this.aQ = 0;
        }
    }

    public void x(int i2) {
        this.aA = i2;
    }

    public boolean x() {
        return this.ab == null;
    }

    public void y(int i2) {
        this.aB = i2;
    }

    public boolean y() {
        return (this instanceof g) && (this.ab == null || !(this.ab instanceof g));
    }

    public void z(int i2) {
        f fVarB = B();
        if (fVarB != null && (fVarB instanceof g) && ((g) B()).m()) {
            return;
        }
        int size = this.X.size();
        for (int i3 = 0; i3 < size; i3++) {
            c cVar = this.X.get(i3);
            if (i2 == cVar.i()) {
                if (cVar.m()) {
                    b(an);
                } else {
                    a(an);
                }
                cVar.j();
            }
        }
    }

    public boolean z() {
        f fVarB = B();
        if (fVarB == null) {
            return false;
        }
        while (fVarB != null) {
            if (fVarB instanceof g) {
                return true;
            }
            fVarB = fVarB.B();
        }
        return false;
    }
}
