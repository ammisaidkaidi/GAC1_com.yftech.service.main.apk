package android.a.a.a;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class f {
    public static final boolean a = false;
    public static g h = null;
    private static final boolean i = false;
    private static int j = 1000;
    b[] c;
    final d g;
    private a l;
    private final a t;
    int b = 0;
    private HashMap<String, i> k = null;
    private int m = 32;
    private int n = this.m;
    public boolean d = false;
    private boolean[] o = new boolean[this.m];
    int e = 1;
    int f = 0;
    private int p = this.m;
    private i[] q = new i[j];
    private int r = 0;
    private b[] s = new b[this.m];

    interface a {
        i a(f fVar, boolean[] zArr);

        void a(a aVar);

        void d(i iVar);

        boolean f();

        void g();

        i h();
    }

    public f() {
        this.c = null;
        this.c = new b[this.m];
        p();
        this.g = new d();
        this.l = new e(this.g);
        this.t = new b(this.g);
    }

    private final int a(a aVar, boolean z) {
        if (h != null) {
            h.h++;
        }
        for (int i2 = 0; i2 < this.e; i2++) {
            this.o[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            if (h != null) {
                h.i++;
            }
            i3++;
            if (i3 >= this.e * 2) {
                return i3;
            }
            if (aVar.h() != null) {
                this.o[aVar.h().i] = true;
            }
            i iVarA = aVar.a(this, this.o);
            if (iVarA != null) {
                if (this.o[iVarA.i]) {
                    return i3;
                }
                this.o[iVarA.i] = true;
            }
            if (iVarA != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f; i5++) {
                    b bVar = this.c[i5];
                    if (bVar.a.o != i.a.UNRESTRICTED && !bVar.e && bVar.a(iVarA)) {
                        float fB = bVar.d.b(iVarA);
                        if (fB < 0.0f) {
                            float f2 = (-bVar.b) / fB;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    b bVar2 = this.c[i4];
                    bVar2.a.j = -1;
                    if (h != null) {
                        h.j++;
                    }
                    bVar2.c(iVarA);
                    bVar2.a.j = i4;
                    bVar2.a.c(bVar2);
                }
            }
            z2 = true;
        }
        return i3;
    }

    public static b a(f fVar, i iVar, i iVar2, int i2, float f, i iVar3, i iVar4, int i3, boolean z) {
        b bVarC = fVar.c();
        bVarC.a(iVar, iVar2, i2, f, iVar3, iVar4, i3);
        if (z) {
            bVarC.a(fVar, 4);
        }
        return bVarC;
    }

    public static b a(f fVar, i iVar, i iVar2, int i2, boolean z) {
        b bVarC = fVar.c();
        bVarC.a(iVar, iVar2, i2);
        if (z) {
            fVar.a(bVarC, 1);
        }
        return bVarC;
    }

    public static b a(f fVar, i iVar, i iVar2, i iVar3, float f, boolean z) {
        b bVarC = fVar.c();
        if (z) {
            fVar.b(bVarC);
        }
        return bVarC.a(iVar, iVar2, iVar3, f);
    }

    public static g a() {
        return h;
    }

    private i a(i.a aVar, String str) {
        i iVarA = this.g.b.a();
        if (iVarA == null) {
            iVarA = new i(aVar, str);
            iVarA.a(aVar, str);
        } else {
            iVarA.d();
            iVarA.a(aVar, str);
        }
        if (this.r >= j) {
            j *= 2;
            this.q = (i[]) Arrays.copyOf(this.q, j);
        }
        i[] iVarArr = this.q;
        int i2 = this.r;
        this.r = i2 + 1;
        iVarArr[i2] = iVarA;
        return iVarA;
    }

    private void a(b bVar, int i2) {
        a(bVar, i2, 0);
    }

    private int b(a aVar) {
        float f;
        boolean z;
        int i2 = 0;
        while (true) {
            f = 0.0f;
            if (i2 >= this.f) {
                z = false;
                break;
            }
            if (this.c[i2].a.o != i.a.UNRESTRICTED && this.c[i2].b < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            if (h != null) {
                h.k++;
            }
            i3++;
            float f2 = Float.MAX_VALUE;
            int i4 = -1;
            int i5 = -1;
            int i6 = 0;
            int i7 = 0;
            while (i6 < this.f) {
                b bVar = this.c[i6];
                if (bVar.a.o != i.a.UNRESTRICTED && !bVar.e && bVar.b < f) {
                    int i8 = 1;
                    while (i8 < this.e) {
                        i iVar = this.g.c[i8];
                        float fB = bVar.d.b(iVar);
                        if (fB > f) {
                            int i9 = i7;
                            float f3 = f2;
                            int i10 = i5;
                            int i11 = i4;
                            for (int i12 = 0; i12 < 7; i12++) {
                                float f4 = iVar.n[i12] / fB;
                                if ((f4 < f3 && i12 == i9) || i12 > i9) {
                                    i10 = i8;
                                    i11 = i6;
                                    f3 = f4;
                                    i9 = i12;
                                }
                            }
                            i4 = i11;
                            i5 = i10;
                            f2 = f3;
                            i7 = i9;
                        }
                        i8++;
                        f = 0.0f;
                    }
                }
                i6++;
                f = 0.0f;
            }
            if (i4 != -1) {
                b bVar2 = this.c[i4];
                bVar2.a.j = -1;
                if (h != null) {
                    h.j++;
                }
                bVar2.c(this.g.c[i5]);
                bVar2.a.j = i4;
                bVar2.a.c(bVar2);
            } else {
                z2 = true;
            }
            f = 0.0f;
        }
        return i3;
    }

    public static b b(f fVar, i iVar, i iVar2, int i2, boolean z) {
        i iVarD = fVar.d();
        b bVarC = fVar.c();
        bVarC.a(iVar, iVar2, iVarD, i2);
        if (z) {
            fVar.a(bVarC, (int) (bVarC.d.b(iVarD) * (-1.0f)));
        }
        return bVarC;
    }

    private i b(String str, i.a aVar) {
        if (h != null) {
            h.l++;
        }
        if (this.e + 1 >= this.n) {
            o();
        }
        i iVarA = a(aVar, (String) null);
        iVarA.a(str);
        this.b++;
        this.e++;
        iVarA.i = this.b;
        if (this.k == null) {
            this.k = new HashMap<>();
        }
        this.k.put(str, iVarA);
        this.g.c[this.b] = iVarA;
        return iVarA;
    }

    private String b(int i2) {
        int i3 = i2 * 4;
        int i4 = i3 / 1024;
        int i5 = i4 / 1024;
        if (i5 > 0) {
            return "" + i5 + " Mb";
        }
        if (i4 > 0) {
            return "" + i4 + " Kb";
        }
        return "" + i3 + " bytes";
    }

    private void b(b bVar) {
        bVar.a(this, 0);
    }

    public static b c(f fVar, i iVar, i iVar2, int i2, boolean z) {
        i iVarD = fVar.d();
        b bVarC = fVar.c();
        bVarC.b(iVar, iVar2, iVarD, i2);
        if (z) {
            fVar.a(bVarC, (int) (bVarC.d.b(iVarD) * (-1.0f)));
        }
        return bVarC;
    }

    private String c(int i2) {
        if (i2 == 1) {
            return "LOW";
        }
        if (i2 == 2) {
            return "MEDIUM";
        }
        if (i2 == 3) {
            return "HIGH";
        }
        if (i2 == 4) {
            return "HIGHEST";
        }
        if (i2 == 5) {
            return "EQUALITY";
        }
        return i2 == 6 ? "FIXED" : "NONE";
    }

    private final void c(b bVar) {
        if (this.f > 0) {
            bVar.d.a(bVar, this.c);
            if (bVar.d.a == 0) {
                bVar.e = true;
            }
        }
    }

    private final void d(b bVar) {
        if (this.c[this.f] != null) {
            this.g.a.a(this.c[this.f]);
        }
        this.c[this.f] = bVar;
        bVar.a.j = this.f;
        this.f++;
        bVar.a.c(bVar);
    }

    private void o() {
        this.m *= 2;
        this.c = (b[]) Arrays.copyOf(this.c, this.m);
        this.g.c = (i[]) Arrays.copyOf(this.g.c, this.m);
        this.o = new boolean[this.m];
        this.n = this.m;
        this.p = this.m;
        if (h != null) {
            h.d++;
            h.p = Math.max(h.p, this.m);
            h.D = h.p;
        }
    }

    private void p() {
        for (int i2 = 0; i2 < this.c.length; i2++) {
            b bVar = this.c[i2];
            if (bVar != null) {
                this.g.a.a(bVar);
            }
            this.c[i2] = null;
        }
    }

    private void q() {
        for (int i2 = 0; i2 < this.f; i2++) {
            b bVar = this.c[i2];
            bVar.a.l = bVar.b;
        }
    }

    private void r() {
        s();
        String str = "";
        for (int i2 = 0; i2 < this.f; i2++) {
            str = (str + this.c[i2]) + "\n";
        }
        System.out.println(str + this.l + "\n");
    }

    private void s() {
        System.out.println("Display Rows (" + this.f + "x" + this.e + ")\n");
    }

    float a(String str) {
        i iVarA = a(str, i.a.UNRESTRICTED);
        if (iVarA == null) {
            return 0.0f;
        }
        return iVarA.l;
    }

    b a(int i2) {
        return this.c[i2];
    }

    public i a(int i2, String str) {
        if (h != null) {
            h.m++;
        }
        if (this.e + 1 >= this.n) {
            o();
        }
        i iVarA = a(i.a.ERROR, str);
        this.b++;
        this.e++;
        iVarA.i = this.b;
        iVarA.k = i2;
        this.g.c[this.b] = iVarA;
        this.l.d(iVarA);
        return iVarA;
    }

    public i a(Object obj) {
        i iVarB = null;
        if (obj == null) {
            return null;
        }
        if (this.e + 1 >= this.n) {
            o();
        }
        if (obj instanceof android.a.a.a.a.c) {
            android.a.a.a.a.c cVar = (android.a.a.a.a.c) obj;
            iVarB = cVar.b();
            if (iVarB == null) {
                cVar.a(this.g);
                iVarB = cVar.b();
            }
            if (iVarB.i == -1 || iVarB.i > this.b || this.g.c[iVarB.i] == null) {
                if (iVarB.i != -1) {
                    iVarB.d();
                }
                this.b++;
                this.e++;
                iVarB.i = this.b;
                iVarB.o = i.a.UNRESTRICTED;
                this.g.c[this.b] = iVarB;
            }
        }
        return iVarB;
    }

    i a(String str, i.a aVar) {
        if (this.k == null) {
            this.k = new HashMap<>();
        }
        i iVar = this.k.get(str);
        return iVar == null ? b(str, aVar) : iVar;
    }

    public void a(android.a.a.a.a.f fVar, android.a.a.a.a.f fVar2, float f, int i2) {
        i iVarA = a(fVar.a(android.a.a.a.a.c.EnumC0000c.LEFT));
        i iVarA2 = a(fVar.a(android.a.a.a.a.c.EnumC0000c.TOP));
        i iVarA3 = a(fVar.a(android.a.a.a.a.c.EnumC0000c.RIGHT));
        i iVarA4 = a(fVar.a(android.a.a.a.a.c.EnumC0000c.BOTTOM));
        i iVarA5 = a(fVar2.a(android.a.a.a.a.c.EnumC0000c.LEFT));
        i iVarA6 = a(fVar2.a(android.a.a.a.a.c.EnumC0000c.TOP));
        i iVarA7 = a(fVar2.a(android.a.a.a.a.c.EnumC0000c.RIGHT));
        i iVarA8 = a(fVar2.a(android.a.a.a.a.c.EnumC0000c.BOTTOM));
        b bVarC = c();
        double d = f;
        double d2 = i2;
        bVarC.b(iVarA2, iVarA4, iVarA6, iVarA8, (float) (Math.sin(d) * d2));
        a(bVarC);
        b bVarC2 = c();
        bVarC2.b(iVarA, iVarA3, iVarA5, iVarA7, (float) (Math.cos(d) * d2));
        a(bVarC2);
    }

    public void a(b bVar) {
        i iVarB;
        if (bVar == null) {
            return;
        }
        if (h != null) {
            h.f++;
            if (bVar.e) {
                h.g++;
            }
        }
        if (this.f + 1 >= this.p || this.e + 1 >= this.n) {
            o();
        }
        boolean z = false;
        if (!bVar.e) {
            c(bVar);
            if (bVar.f()) {
                return;
            }
            bVar.e();
            if (bVar.a(this)) {
                i iVarE = e();
                bVar.a = iVarE;
                d(bVar);
                this.t.a(bVar);
                a(this.t, true);
                if (iVarE.j == -1) {
                    if (bVar.a == iVarE && (iVarB = bVar.b(iVarE)) != null) {
                        if (h != null) {
                            h.j++;
                        }
                        bVar.c(iVarB);
                    }
                    if (!bVar.e) {
                        bVar.a.c(bVar);
                    }
                    this.f--;
                }
                z = true;
            }
            if (!bVar.a()) {
                return;
            }
        }
        if (z) {
            return;
        }
        d(bVar);
    }

    void a(b bVar, int i2, int i3) {
        bVar.c(a(i3, (String) null), i2);
    }

    void a(a aVar) {
        if (h != null) {
            h.t++;
            h.u = Math.max(h.u, this.e);
            h.v = Math.max(h.v, this.f);
        }
        c((b) aVar);
        b(aVar);
        a(aVar, false);
        q();
    }

    public void a(g gVar) {
        h = gVar;
    }

    public void a(i iVar, int i2) {
        b bVarC = c();
        i iVarD = d();
        iVarD.k = 0;
        bVarC.a(iVar, i2, iVarD);
        a(bVarC);
    }

    public void a(i iVar, int i2, int i3) {
        int i4 = iVar.j;
        if (iVar.j == -1) {
            b bVarC = c();
            bVarC.a(iVar, i2);
            bVarC.a(this, i3);
            a(bVarC);
            return;
        }
        b bVar = this.c[i4];
        if (bVar.e) {
            bVar.b = i2;
            return;
        }
        b bVarC2 = c();
        bVarC2.b(iVar, i2);
        bVarC2.a(this, i3);
        a(bVarC2);
    }

    public void a(i iVar, i iVar2, int i2, float f, i iVar3, i iVar4, int i3, int i4) {
        b bVarC = c();
        bVarC.a(iVar, iVar2, i2, f, iVar3, iVar4, i3);
        if (i4 != 6) {
            bVarC.a(this, i4);
        }
        a(bVarC);
    }

    public void a(i iVar, i iVar2, int i2, int i3) {
        b bVarC = c();
        i iVarD = d();
        iVarD.k = 0;
        bVarC.a(iVar, iVar2, iVarD, i2);
        if (i3 != 6) {
            a(bVarC, (int) (bVarC.d.b(iVarD) * (-1.0f)), i3);
        }
        a(bVarC);
    }

    public void a(i iVar, i iVar2, i iVar3, i iVar4, float f, int i2) {
        b bVarC = c();
        bVarC.a(iVar, iVar2, iVar3, iVar4, f);
        if (i2 != 6) {
            bVarC.a(this, i2);
        }
        a(bVarC);
    }

    public void a(i iVar, i iVar2, boolean z) {
        b bVarC = c();
        i iVarD = d();
        iVarD.k = 0;
        bVarC.a(iVar, iVar2, iVarD, 0);
        if (z) {
            a(bVarC, (int) (bVarC.d.b(iVarD) * (-1.0f)), 1);
        }
        a(bVarC);
    }

    public int b(Object obj) {
        i iVarB = ((android.a.a.a.a.c) obj).b();
        if (iVarB != null) {
            return (int) (iVarB.l + 0.5f);
        }
        return 0;
    }

    public void b() {
        for (int i2 = 0; i2 < this.g.c.length; i2++) {
            i iVar = this.g.c[i2];
            if (iVar != null) {
                iVar.d();
            }
        }
        this.g.b.a(this.q, this.r);
        this.r = 0;
        Arrays.fill(this.g.c, (Object) null);
        if (this.k != null) {
            this.k.clear();
        }
        this.b = 0;
        this.l.g();
        this.e = 1;
        for (int i3 = 0; i3 < this.f; i3++) {
            this.c[i3].c = false;
        }
        p();
        this.f = 0;
    }

    public void b(i iVar, int i2) {
        int i3 = iVar.j;
        if (iVar.j == -1) {
            b bVarC = c();
            bVarC.a(iVar, i2);
            a(bVarC);
            return;
        }
        b bVar = this.c[i3];
        if (bVar.e) {
            bVar.b = i2;
            return;
        }
        if (bVar.d.a == 0) {
            bVar.e = true;
            bVar.b = i2;
        } else {
            b bVarC2 = c();
            bVarC2.b(iVar, i2);
            a(bVarC2);
        }
    }

    public void b(i iVar, i iVar2, int i2, int i3) {
        b bVarC = c();
        i iVarD = d();
        iVarD.k = 0;
        bVarC.b(iVar, iVar2, iVarD, i2);
        if (i3 != 6) {
            a(bVarC, (int) (bVarC.d.b(iVarD) * (-1.0f)), i3);
        }
        a(bVarC);
    }

    public void b(i iVar, i iVar2, boolean z) {
        b bVarC = c();
        i iVarD = d();
        iVarD.k = 0;
        bVarC.b(iVar, iVar2, iVarD, 0);
        if (z) {
            a(bVarC, (int) (bVarC.d.b(iVarD) * (-1.0f)), 1);
        }
        a(bVarC);
    }

    public b c() {
        b bVarA = this.g.a.a();
        if (bVarA == null) {
            bVarA = new b(this.g);
        } else {
            bVarA.c();
        }
        i.a();
        return bVarA;
    }

    public b c(i iVar, i iVar2, int i2, int i3) {
        b bVarC = c();
        bVarC.a(iVar, iVar2, i2);
        if (i3 != 6) {
            bVarC.a(this, i3);
        }
        a(bVarC);
        return bVarC;
    }

    public i d() {
        if (h != null) {
            h.n++;
        }
        if (this.e + 1 >= this.n) {
            o();
        }
        i iVarA = a(i.a.SLACK, (String) null);
        this.b++;
        this.e++;
        iVarA.i = this.b;
        this.g.c[this.b] = iVarA;
        return iVarA;
    }

    public i e() {
        if (h != null) {
            h.o++;
        }
        if (this.e + 1 >= this.n) {
            o();
        }
        i iVarA = a(i.a.SLACK, (String) null);
        this.b++;
        this.e++;
        iVarA.i = this.b;
        this.g.c[this.b] = iVarA;
        return iVarA;
    }

    a f() {
        return this.l;
    }

    public void g() {
        if (h != null) {
            h.e++;
        }
        if (!this.d) {
            a(this.l);
            return;
        }
        if (h != null) {
            h.r++;
        }
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f) {
                z = true;
                break;
            } else if (!this.c[i2].e) {
                break;
            } else {
                i2++;
            }
        }
        if (!z) {
            a(this.l);
            return;
        }
        if (h != null) {
            h.q++;
        }
        q();
    }

    void h() {
        s();
        String str = " #  ";
        for (int i2 = 0; i2 < this.f; i2++) {
            str = (str + this.c[i2].b()) + "\n #  ";
        }
        if (this.l != null) {
            str = str + this.l + "\n";
        }
        System.out.println(str);
    }

    public void i() {
        s();
        String str = "";
        for (int i2 = 0; i2 < this.f; i2++) {
            if (this.c[i2].a.o == i.a.UNRESTRICTED) {
                str = (str + this.c[i2].b()) + "\n";
            }
        }
        System.out.println(str + this.l + "\n");
    }

    public int j() {
        int iD = 0;
        for (int i2 = 0; i2 < this.f; i2++) {
            if (this.c[i2] != null) {
                iD += this.c[i2].d();
            }
        }
        return iD;
    }

    public int k() {
        return this.f;
    }

    public int l() {
        return this.b;
    }

    void m() {
        int iD = 0;
        for (int i2 = 0; i2 < this.m; i2++) {
            if (this.c[i2] != null) {
                iD += this.c[i2].d();
            }
        }
        int iD2 = 0;
        for (int i3 = 0; i3 < this.f; i3++) {
            if (this.c[i3] != null) {
                iD2 += this.c[i3].d();
            }
        }
        System.out.println("Linear System -> Table size: " + this.m + " (" + b(this.m * this.m) + ") -- row sizes: " + b(iD) + ", actual size: " + b(iD2) + " rows: " + this.f + "/" + this.p + " cols: " + this.e + "/" + this.n + " 0 occupied cells, " + b(0));
    }

    public d n() {
        return this.g;
    }
}
