package android.a.a.a.a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class p extends f {
    protected ArrayList<f> aT;

    public p() {
        this.aT = new ArrayList<>();
    }

    public p(int i, int i2) {
        super(i, i2);
        this.aT = new ArrayList<>();
    }

    public p(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.aT = new ArrayList<>();
    }

    public static k a(ArrayList<f> arrayList) {
        k kVar = new k();
        if (arrayList.size() == 0) {
            return kVar;
        }
        int size = arrayList.size();
        int iK = Integer.MAX_VALUE;
        int iL = Integer.MAX_VALUE;
        int iAe = 0;
        int iAf = 0;
        for (int i = 0; i < size; i++) {
            f fVar = arrayList.get(i);
            if (fVar.K() < iK) {
                iK = fVar.K();
            }
            if (fVar.L() < iL) {
                iL = fVar.L();
            }
            if (fVar.ae() > iAe) {
                iAe = fVar.ae();
            }
            if (fVar.af() > iAf) {
                iAf = fVar.af();
            }
        }
        kVar.a(iK, iL, iAe - iK, iAf - iL);
        return kVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006d A[PHI: r3
      0x006d: PHI (r3v5 android.a.a.a.a.f) = (r3v4 android.a.a.a.a.f), (r3v7 android.a.a.a.a.f) binds: [B:26:0x006b, B:17:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    public f a(float f, float f2) {
        int iS = S();
        int iT = T();
        f fVar = (f < ((float) iS) || f > ((float) (M() + iS)) || f2 < ((float) iT) || f2 > ((float) (Q() + iT))) ? null : this;
        int size = this.aT.size();
        for (int i = 0; i < size; i++) {
            f fVarA = this.aT.get(i);
            if (fVarA instanceof p) {
                fVarA = ((p) fVarA).a(f, f2);
                if (fVarA != null) {
                    fVar = fVarA;
                }
            } else {
                int iS2 = fVarA.S();
                int iT2 = fVarA.T();
                int iM = fVarA.M() + iS2;
                int iQ = fVarA.Q() + iT2;
                if (f >= iS2 && f <= iM && f2 >= iT2 && f2 <= iQ) {
                    fVar = fVarA;
                }
            }
        }
        return fVar;
    }

    @Override // android.a.a.a.a.f
    public void a(android.a.a.a.d dVar) {
        super.a(dVar);
        int size = this.aT.size();
        for (int i = 0; i < size; i++) {
            this.aT.get(i).a(dVar);
        }
    }

    public void aF() {
        am();
        if (this.aT == null) {
            return;
        }
        int size = this.aT.size();
        for (int i = 0; i < size; i++) {
            f fVar = this.aT.get(i);
            if (fVar instanceof p) {
                ((p) fVar).aF();
            }
        }
    }

    public ArrayList<f> aM() {
        return this.aT;
    }

    public g aN() {
        f fVarB = B();
        g gVar = this instanceof g ? (g) this : null;
        while (fVarB != null) {
            f fVarB2 = fVarB.B();
            if (fVarB instanceof g) {
                gVar = (g) fVarB;
            }
            fVarB = fVarB2;
        }
        return gVar;
    }

    public void aO() {
        this.aT.clear();
    }

    @Override // android.a.a.a.a.f
    public void am() {
        super.am();
        if (this.aT == null) {
            return;
        }
        int size = this.aT.size();
        for (int i = 0; i < size; i++) {
            f fVar = this.aT.get(i);
            fVar.c(S(), T());
            if (!(fVar instanceof g)) {
                fVar.am();
            }
        }
    }

    public ArrayList<f> c(int i, int i2, int i3, int i4) {
        ArrayList<f> arrayList = new ArrayList<>();
        k kVar = new k();
        kVar.a(i, i2, i3, i4);
        int size = this.aT.size();
        for (int i5 = 0; i5 < size; i5++) {
            f fVar = this.aT.get(i5);
            k kVar2 = new k();
            kVar2.a(fVar.S(), fVar.T(), fVar.M(), fVar.Q());
            if (kVar.a(kVar2)) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    @Override // android.a.a.a.a.f
    public void c(int i, int i2) {
        super.c(i, i2);
        int size = this.aT.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.aT.get(i3).c(Y(), Z());
        }
    }

    public void f(f fVar) {
        this.aT.add(fVar);
        if (fVar.B() != null) {
            ((p) fVar.B()).g(fVar);
        }
        fVar.b(this);
    }

    public void g(f fVar) {
        this.aT.remove(fVar);
        fVar.b((f) null);
    }

    @Override // android.a.a.a.a.f
    public void s() {
        this.aT.clear();
        super.s();
    }
}
