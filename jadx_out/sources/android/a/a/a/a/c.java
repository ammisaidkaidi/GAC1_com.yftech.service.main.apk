package android.a.a.a.a;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    private static final boolean j = false;
    private static final int l = -1;
    final f d;
    final EnumC0000c e;
    c f;
    android.a.a.a.i i;
    private l k = new l(this);
    public int g = 0;
    int h = -1;
    private b m = b.NONE;
    private a n = a.RELAXED;
    private int o = 0;

    public enum a {
        RELAXED,
        STRICT
    }

    public enum b {
        NONE,
        STRONG,
        WEAK
    }

    /* JADX INFO: renamed from: android.a.a.a.a.c$c, reason: collision with other inner class name */
    public enum EnumC0000c {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public c(f fVar, EnumC0000c enumC0000c) {
        this.d = fVar;
        this.e = enumC0000c;
    }

    private boolean a(f fVar, HashSet<f> hashSet) {
        if (hashSet.contains(fVar)) {
            return false;
        }
        hashSet.add(fVar);
        if (fVar == c()) {
            return true;
        }
        ArrayList<c> arrayListAl = fVar.al();
        int size = arrayListAl.size();
        for (int i = 0; i < size; i++) {
            c cVar = arrayListAl.get(i);
            if (cVar.b(this) && cVar.k() && a(cVar.g().c(), hashSet)) {
                return true;
            }
        }
        return false;
    }

    public l a() {
        return this.k;
    }

    public void a(int i) {
        this.o = i;
    }

    public void a(a aVar) {
        this.n = aVar;
    }

    public void a(b bVar) {
        if (k()) {
            this.m = bVar;
        }
    }

    public void a(android.a.a.a.d dVar) {
        if (this.i == null) {
            this.i = new android.a.a.a.i(android.a.a.a.i.a.UNRESTRICTED, (String) null);
        } else {
            this.i.d();
        }
    }

    public boolean a(c cVar) {
        if (cVar == null) {
            return false;
        }
        EnumC0000c enumC0000cD = cVar.d();
        if (enumC0000cD == this.e) {
            return this.e != EnumC0000c.BASELINE || (cVar.c().ai() && c().ai());
        }
        switch (this.e) {
            case CENTER:
                return (enumC0000cD == EnumC0000c.BASELINE || enumC0000cD == EnumC0000c.CENTER_X || enumC0000cD == EnumC0000c.CENTER_Y) ? false : true;
            case LEFT:
            case RIGHT:
                boolean z = enumC0000cD == EnumC0000c.LEFT || enumC0000cD == EnumC0000c.RIGHT;
                if (cVar.c() instanceof h) {
                    return z || enumC0000cD == EnumC0000c.CENTER_X;
                }
                return z;
            case TOP:
            case BOTTOM:
                boolean z2 = enumC0000cD == EnumC0000c.TOP || enumC0000cD == EnumC0000c.BOTTOM;
                if (cVar.c() instanceof h) {
                    return z2 || enumC0000cD == EnumC0000c.CENTER_Y;
                }
                return z2;
            case BASELINE:
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return false;
            default:
                throw new AssertionError(this.e.name());
        }
    }

    public boolean a(c cVar, int i) {
        return a(cVar, i, -1, b.STRONG, 0, false);
    }

    public boolean a(c cVar, int i, int i2) {
        return a(cVar, i, -1, b.STRONG, i2, false);
    }

    public boolean a(c cVar, int i, int i2, b bVar, int i3, boolean z) {
        if (cVar == null) {
            this.f = null;
            this.g = 0;
            this.h = -1;
            this.m = b.NONE;
            this.o = 2;
            return true;
        }
        if (!z && !a(cVar)) {
            return false;
        }
        this.f = cVar;
        if (i > 0) {
            this.g = i;
        } else {
            this.g = 0;
        }
        this.h = i2;
        this.m = bVar;
        this.o = i3;
        return true;
    }

    public boolean a(c cVar, int i, b bVar, int i2) {
        return a(cVar, i, -1, bVar, i2, false);
    }

    public boolean a(f fVar) {
        if (a(fVar, new HashSet<>())) {
            return false;
        }
        f fVarB = c().B();
        return fVarB == fVar || fVar.B() == fVarB;
    }

    public boolean a(f fVar, c cVar) {
        return a(fVar);
    }

    public android.a.a.a.i b() {
        return this.i;
    }

    public void b(int i) {
        if (k()) {
            this.g = i;
        }
    }

    public boolean b(c cVar) {
        EnumC0000c enumC0000cD = cVar.d();
        if (enumC0000cD == this.e) {
            return true;
        }
        switch (this.e) {
            case CENTER:
                return enumC0000cD != EnumC0000c.BASELINE;
            case LEFT:
            case RIGHT:
            case CENTER_X:
                return enumC0000cD == EnumC0000c.LEFT || enumC0000cD == EnumC0000c.RIGHT || enumC0000cD == EnumC0000c.CENTER_X;
            case TOP:
            case BOTTOM:
            case BASELINE:
            case CENTER_Y:
                return enumC0000cD == EnumC0000c.TOP || enumC0000cD == EnumC0000c.BOTTOM || enumC0000cD == EnumC0000c.CENTER_Y || enumC0000cD == EnumC0000c.BASELINE;
            case NONE:
                return false;
            default:
                throw new AssertionError(this.e.name());
        }
    }

    public f c() {
        return this.d;
    }

    public void c(int i) {
        if (k()) {
            this.h = i;
        }
    }

    public boolean c(c cVar) {
        if (this.e == EnumC0000c.CENTER) {
            return false;
        }
        if (this.e == cVar.d()) {
            return true;
        }
        switch (this.e) {
            case CENTER:
            case BASELINE:
            case NONE:
                return false;
            case LEFT:
                int i = AnonymousClass1.a[cVar.d().ordinal()];
                return i == 3 || i == 7;
            case RIGHT:
                int i2 = AnonymousClass1.a[cVar.d().ordinal()];
                return i2 == 2 || i2 == 7;
            case TOP:
                int i3 = AnonymousClass1.a[cVar.d().ordinal()];
                return i3 == 5 || i3 == 8;
            case BOTTOM:
                int i4 = AnonymousClass1.a[cVar.d().ordinal()];
                return i4 == 4 || i4 == 8;
            case CENTER_X:
                switch (cVar.d()) {
                    case LEFT:
                        return true;
                    case RIGHT:
                        return true;
                    default:
                        return false;
                }
            case CENTER_Y:
                switch (cVar.d()) {
                    case TOP:
                        return true;
                    case BOTTOM:
                        return true;
                    default:
                        return false;
                }
            default:
                throw new AssertionError(this.e.name());
        }
    }

    public EnumC0000c d() {
        return this.e;
    }

    public int e() {
        if (this.d.E() == 8) {
            return 0;
        }
        return (this.h <= -1 || this.f == null || this.f.d.E() != 8) ? this.g : this.h;
    }

    public b f() {
        return this.m;
    }

    public c g() {
        return this.f;
    }

    public a h() {
        return this.n;
    }

    public int i() {
        return this.o;
    }

    public void j() {
        this.f = null;
        this.g = 0;
        this.h = -1;
        this.m = b.STRONG;
        this.o = 0;
        this.n = a.RELAXED;
        this.k.b();
    }

    public boolean k() {
        return this.f != null;
    }

    public boolean l() {
        switch (this.e) {
            case CENTER:
            case BASELINE:
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return false;
            case LEFT:
            case RIGHT:
            case TOP:
            case BOTTOM:
                return true;
            default:
                throw new AssertionError(this.e.name());
        }
    }

    public boolean m() {
        switch (this.e) {
            case CENTER:
            case LEFT:
            case RIGHT:
            case CENTER_X:
                return false;
            case TOP:
            case BOTTOM:
            case BASELINE:
            case CENTER_Y:
            case NONE:
                return true;
            default:
                throw new AssertionError(this.e.name());
        }
    }

    public int n() {
        switch (this.e) {
            case CENTER:
                return 3;
            case LEFT:
                return 1;
            case RIGHT:
                return 1;
            case TOP:
                return 0;
            case BOTTOM:
                return 0;
            case BASELINE:
                return 2;
            case CENTER_X:
                return 0;
            case CENTER_Y:
                return 1;
            case NONE:
                return 0;
            default:
                throw new AssertionError(this.e.name());
        }
    }

    public int o() {
        switch (this.e) {
            case CENTER:
                return 2;
            case LEFT:
                return 2;
            case RIGHT:
                return 2;
            case TOP:
                return 2;
            case BOTTOM:
                return 2;
            case BASELINE:
                return 1;
            case CENTER_X:
                return 0;
            case CENTER_Y:
                return 0;
            case NONE:
                return 0;
            default:
                throw new AssertionError(this.e.name());
        }
    }

    public final c p() {
        switch (this.e) {
            case CENTER:
            case BASELINE:
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return null;
            case LEFT:
                return this.d.L;
            case RIGHT:
                return this.d.J;
            case TOP:
                return this.d.M;
            case BOTTOM:
                return this.d.K;
            default:
                throw new AssertionError(this.e.name());
        }
    }

    public String toString() {
        return this.d.F() + ":" + this.e.toString();
    }
}
