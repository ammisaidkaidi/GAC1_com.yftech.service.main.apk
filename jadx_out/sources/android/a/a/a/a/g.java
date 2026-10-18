package android.a.a.a.a;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class g extends p {
    private static final boolean a = true;
    private static final boolean aU = false;
    private static final int b = 8;
    private static final boolean c = false;
    static final boolean d = false;
    protected android.a.a.a.f aJ;
    int aK;
    int aL;
    int aM;
    int aN;
    int aO;
    int aP;
    f[] aQ;
    f[] aR;
    int aS;
    private boolean aV;
    private o aW;
    private int aX;
    private boolean aY;
    private boolean aZ;

    public g() {
        this.aV = false;
        this.aJ = new android.a.a.a.f();
        this.aO = 0;
        this.aP = 0;
        this.aQ = new f[4];
        this.aR = new f[4];
        this.aX = 3;
        this.aY = false;
        this.aZ = false;
        this.aS = 0;
    }

    public g(int i, int i2) {
        super(i, i2);
        this.aV = false;
        this.aJ = new android.a.a.a.f();
        this.aO = 0;
        this.aP = 0;
        this.aQ = new f[4];
        this.aR = new f[4];
        this.aX = 3;
        this.aY = false;
        this.aZ = false;
        this.aS = 0;
    }

    public g(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.aV = false;
        this.aJ = new android.a.a.a.f();
        this.aO = 0;
        this.aP = 0;
        this.aQ = new f[4];
        this.aR = new f[4];
        this.aX = 3;
        this.aY = false;
        this.aZ = false;
        this.aS = 0;
    }

    private void e() {
        this.aO = 0;
        this.aP = 0;
    }

    private void h(f fVar) {
        for (int i = 0; i < this.aO; i++) {
            if (this.aR[i] == fVar) {
                return;
            }
        }
        if (this.aO + 1 >= this.aR.length) {
            this.aR = (f[]) Arrays.copyOf(this.aR, this.aR.length * 2);
        }
        this.aR[this.aO] = fVar;
        this.aO++;
    }

    private void i(f fVar) {
        for (int i = 0; i < this.aP; i++) {
            if (this.aQ[i] == fVar) {
                return;
            }
        }
        if (this.aP + 1 >= this.aQ.length) {
            this.aQ = (f[]) Arrays.copyOf(this.aQ, this.aQ.length * 2);
        }
        this.aQ[this.aP] = fVar;
        this.aP++;
    }

    public void A(int i) {
        this.aX = i;
    }

    public boolean B(int i) {
        if ((this.aX & i) == i) {
            return a;
        }
        return false;
    }

    void a(f fVar, int i) {
        if (i == 0) {
            while (fVar.J.f != null && fVar.J.f.d.L.f != null && fVar.J.f.d.L.f == fVar.J && fVar.J.f.d != fVar) {
                fVar = fVar.J.f.d;
            }
            h(fVar);
            return;
        }
        if (i == 1) {
            while (fVar.K.f != null && fVar.K.f.d.M.f != null && fVar.K.f.d.M.f == fVar.K && fVar.K.f.d != fVar) {
                fVar = fVar.K.f.d;
            }
            i(fVar);
        }
    }

    public void a(android.a.a.a.f fVar, boolean[] zArr) {
        zArr[2] = false;
        b(fVar);
        int size = this.aT.size();
        for (int i = 0; i < size; i++) {
            f fVar2 = this.aT.get(i);
            fVar2.b(fVar);
            if (fVar2.aa[0] == f.b.MATCH_CONSTRAINT && fVar2.M() < fVar2.P()) {
                zArr[2] = a;
            }
            if (fVar2.aa[1] == f.b.MATCH_CONSTRAINT && fVar2.Q() < fVar2.R()) {
                zArr[2] = a;
            }
        }
    }

    public void a(android.a.a.a.g gVar) {
        this.aJ.a(gVar);
    }

    public int aB() {
        return this.aX;
    }

    public boolean aC() {
        return this.aY;
    }

    public boolean aD() {
        return this.aZ;
    }

    public boolean aE() {
        return this.aV;
    }

    /* JADX WARN: Code duplicated, block: B:90:0x01fc A[PHI: r0 r8
      0x01fc: PHI (r0v32 ??) = (r0v31 ??), (r0v34 ??), (r0v34 ??), (r0v34 ??) binds: [B:77:0x01be, B:85:0x01e4, B:86:0x01e6, B:88:0x01ec] A[DONT_GENERATE, DONT_INLINE]
      0x01fc: PHI (r8v10 boolean) = (r8v9 boolean), (r8v12 boolean), (r8v12 boolean), (r8v12 boolean) binds: [B:77:0x01be, B:85:0x01e4, B:86:0x01e6, B:88:0x01ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v2 */
    @Override // android.a.a.a.a.p
    public void aF() {
        ?? C;
        ?? r15;
        boolean z;
        boolean z2;
        ?? r12;
        boolean z3;
        ?? r0;
        ?? r13;
        boolean z4;
        boolean z5;
        boolean z6;
        int i = this.ag;
        int i2 = this.ah;
        int i3 = 0;
        int iMax = Math.max(0, M());
        int iMax2 = Math.max(0, Q());
        this.aY = false;
        this.aZ = false;
        if (this.ab != null) {
            if (this.aW == null) {
                this.aW = new o(this);
            }
            this.aW.a(this);
            j(this.aK);
            k(this.aL);
            au();
            a(this.aJ.n());
        } else {
            this.ag = 0;
            this.ah = 0;
        }
        if (this.aX != 0) {
            if (!B(8)) {
                aJ();
            }
            aK();
            this.aJ.d = a;
        } else {
            this.aJ.d = false;
        }
        f.b bVar = this.aa[1];
        f.b bVar2 = this.aa[0];
        e();
        int size = this.aT.size();
        for (int i4 = 0; i4 < size; i4++) {
            f fVar = this.aT.get(i4);
            if (fVar instanceof p) {
                ((p) fVar).aF();
            }
        }
        int i5 = 0;
        boolean z7 = false;
        ?? r14 = 1;
        while (r14 != 0) {
            int i6 = i5 + 1;
            try {
                this.aJ.b();
                C = c(this.aJ);
                r15 = C;
                if (C != 0) {
                    try {
                        this.aJ.g();
                        r15 = C;
                    } catch (Exception e) {
                        e = e;
                        e.printStackTrace();
                        System.out.println("EXCEPTION : " + e);
                        r15 = C;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                C = r14;
            }
            if (r15 == 0) {
                b(this.aJ);
                int i7 = i3;
                while (i7 < size) {
                    f fVar2 = this.aT.get(i7);
                    if (fVar2.aa[i3] == f.b.MATCH_CONSTRAINT && fVar2.M() < fVar2.P()) {
                        j.h[2] = a;
                        break;
                    } else if (fVar2.aa[1] == f.b.MATCH_CONSTRAINT && fVar2.Q() < fVar2.R()) {
                        j.h[2] = a;
                        break;
                    } else {
                        i7++;
                        i3 = 0;
                    }
                }
            } else {
                a(this.aJ, j.h);
            }
            if (i6 >= 8 || !j.h[2]) {
                z = z7 ? 1 : 0;
                z2 = false;
            } else {
                int iMax3 = 0;
                int iMax4 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    f fVar3 = this.aT.get(i8);
                    iMax3 = Math.max(iMax3, fVar3.ag + fVar3.M());
                    iMax4 = Math.max(iMax4, fVar3.ah + fVar3.Q());
                }
                int iMax5 = Math.max(this.al, iMax3);
                int iMax6 = Math.max(this.am, iMax4);
                if (bVar2 != f.b.WRAP_CONTENT || M() >= iMax5) {
                    z5 = false;
                    z6 = z7;
                } else {
                    p(iMax5);
                    this.aa[0] = f.b.WRAP_CONTENT;
                    z5 = a;
                    z6 = a;
                }
                if (bVar != f.b.WRAP_CONTENT || Q() >= iMax6) {
                    z = z6;
                    z2 = z5;
                } else {
                    q(iMax6);
                    this.aa[1] = f.b.WRAP_CONTENT;
                    z2 = a;
                    z = a;
                }
            }
            int iMax7 = Math.max(this.al, M());
            boolean z8 = z2;
            boolean z9 = z;
            if (iMax7 > M()) {
                p(iMax7);
                this.aa[0] = f.b.FIXED;
                z8 = a;
                z9 = a;
            }
            int iMax8 = Math.max(this.am, Q());
            if (iMax8 > Q()) {
                q(iMax8);
                r12 = 1;
                this.aa[1] = f.b.FIXED;
                r0 = 1;
                z3 = true;
            } else {
                r12 = 1;
            }
            if (z3) {
                r0 = z8;
                z3 = z9;
                r13 = r0;
                z4 = z3;
            } else {
                r0 = z8;
                z3 = z9;
                if (this.aa[0] == f.b.WRAP_CONTENT && iMax > 0) {
                    r0 = r0;
                    z3 = z3;
                    if (M() > iMax) {
                        this.aY = r12;
                        this.aa[0] = f.b.FIXED;
                        p(iMax);
                        ?? r1 = r12;
                        z3 = r1 == true ? 1 : 0;
                        r0 = r1;
                    }
                }
                r0 = r0;
                r0 = r0;
                z3 = z3;
                z3 = z3;
                if (this.aa[r12] != f.b.WRAP_CONTENT || iMax2 <= 0 || Q() <= iMax2) {
                    r0 = z8;
                    z3 = z9;
                    r13 = r0;
                    z4 = z3;
                } else {
                    this.aZ = r12;
                    this.aa[r12] = f.b.FIXED;
                    q(iMax2);
                    r13 = 1;
                    z4 = a;
                }
            }
            i5 = i6;
            i3 = 0;
            r14 = r13;
            z7 = z4;
        }
        if (this.ab != null) {
            int iMax9 = Math.max(this.al, M());
            int iMax10 = Math.max(this.am, Q());
            this.aW.b(this);
            p(iMax9 + this.aK + this.aM);
            q(iMax10 + this.aL + this.aN);
        } else {
            this.ag = i;
            this.ah = i2;
        }
        if (z7) {
            this.aa[0] = bVar2;
            this.aa[1] = bVar;
        }
        a(this.aJ.n());
        if (this == aN()) {
            am();
        }
    }

    public void aG() {
        aJ();
        b(this.aX);
    }

    public void aH() {
        l lVarA = a(c.EnumC0000c.LEFT).a();
        l lVarA2 = a(c.EnumC0000c.TOP).a();
        lVarA.a((l) null, 0.0f);
        lVarA2.a((l) null, 0.0f);
    }

    public void aI() {
        l lVarA = a(c.EnumC0000c.LEFT).a();
        l lVarA2 = a(c.EnumC0000c.TOP).a();
        lVarA.f();
        lVarA2.f();
        lVarA.a((l) null, 0.0f);
        lVarA2.a((l) null, 0.0f);
    }

    public void aJ() {
        int size = this.aT.size();
        b();
        for (int i = 0; i < size; i++) {
            this.aT.get(i).b();
        }
    }

    public void aK() {
        if (!B(8)) {
            b(this.aX);
        }
        aH();
    }

    public android.a.a.a.f aL() {
        return this.aJ;
    }

    @Override // android.a.a.a.a.f
    public void b(int i) {
        super.b(i);
        int size = this.aT.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.aT.get(i2).b(i);
        }
    }

    public void b(int i, int i2, int i3, int i4) {
        this.aK = i;
        this.aL = i2;
        this.aM = i3;
        this.aN = i4;
    }

    public boolean c(android.a.a.a.f fVar) {
        a(fVar);
        int size = this.aT.size();
        for (int i = 0; i < size; i++) {
            f fVar2 = this.aT.get(i);
            if (fVar2 instanceof g) {
                f.b bVar = fVar2.aa[0];
                f.b bVar2 = fVar2.aa[1];
                if (bVar == f.b.WRAP_CONTENT) {
                    fVar2.a(f.b.FIXED);
                }
                if (bVar2 == f.b.WRAP_CONTENT) {
                    fVar2.b(f.b.FIXED);
                }
                fVar2.a(fVar);
                if (bVar == f.b.WRAP_CONTENT) {
                    fVar2.a(bVar);
                }
                if (bVar2 == f.b.WRAP_CONTENT) {
                    fVar2.b(bVar2);
                }
            } else {
                j.a(this, fVar, fVar2);
                fVar2.a(fVar);
            }
        }
        if (this.aO > 0) {
            b.a(this, fVar, 0);
        }
        if (this.aP > 0) {
            b.a(this, fVar, 1);
        }
        return a;
    }

    @Override // android.a.a.a.a.f
    public String d() {
        return "ConstraintLayout";
    }

    public void d(boolean z) {
        this.aV = z;
    }

    public void h(int i, int i2) {
        if (this.aa[0] != f.b.WRAP_CONTENT && this.v != null) {
            this.v.a(i);
        }
        if (this.aa[1] == f.b.WRAP_CONTENT || this.w == null) {
            return;
        }
        this.w.a(i2);
    }

    public ArrayList<h> j() {
        ArrayList<h> arrayList = new ArrayList<>();
        int size = this.aT.size();
        for (int i = 0; i < size; i++) {
            f fVar = this.aT.get(i);
            if (fVar instanceof h) {
                h hVar = (h) fVar;
                if (hVar.h() == 1) {
                    arrayList.add(hVar);
                }
            }
        }
        return arrayList;
    }

    public ArrayList<h> k() {
        ArrayList<h> arrayList = new ArrayList<>();
        int size = this.aT.size();
        for (int i = 0; i < size; i++) {
            f fVar = this.aT.get(i);
            if (fVar instanceof h) {
                h hVar = (h) fVar;
                if (hVar.h() == 0) {
                    arrayList.add(hVar);
                }
            }
        }
        return arrayList;
    }

    public boolean m() {
        return false;
    }

    @Override // android.a.a.a.a.p, android.a.a.a.a.f
    public void s() {
        this.aJ.b();
        this.aK = 0;
        this.aM = 0;
        this.aL = 0;
        this.aN = 0;
        super.s();
    }
}
