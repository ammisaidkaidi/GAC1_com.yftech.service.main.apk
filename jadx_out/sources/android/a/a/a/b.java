package android.a.a.a;

/* JADX INFO: loaded from: classes.dex */
public class b implements f.a {
    private static final boolean f = false;
    public final a d;
    i a = null;
    float b = 0.0f;
    boolean c = false;
    boolean e = false;

    public b(d dVar) {
        this.d = new a(this, dVar);
    }

    public b a(float f2, float f3, float f4, i iVar, int i, i iVar2, int i2, i iVar3, int i3, i iVar4, int i4) {
        if (f3 == 0.0f || f2 == f4) {
            this.b = ((-i) - i2) + i3 + i4;
            this.d.a(iVar, 1.0f);
            this.d.a(iVar2, -1.0f);
            this.d.a(iVar4, 1.0f);
            this.d.a(iVar3, -1.0f);
        } else {
            float f5 = (f2 / f3) / (f4 / f3);
            this.b = ((-i) - i2) + (i3 * f5) + (i4 * f5);
            this.d.a(iVar, 1.0f);
            this.d.a(iVar2, -1.0f);
            this.d.a(iVar4, f5);
            this.d.a(iVar3, -f5);
        }
        return this;
    }

    public b a(float f2, float f3, float f4, i iVar, i iVar2, i iVar3, i iVar4) {
        if (f3 == 0.0f || f2 == f4) {
            this.b = 0.0f;
            this.d.a(iVar, 1.0f);
            this.d.a(iVar2, -1.0f);
            this.d.a(iVar4, 1.0f);
            this.d.a(iVar3, -1.0f);
        } else {
            float f5 = (f2 / f3) / (f4 / f3);
            this.b = 0.0f;
            this.d.a(iVar, 1.0f);
            this.d.a(iVar2, -1.0f);
            this.d.a(iVar4, f5);
            this.d.a(iVar3, -f5);
        }
        return this;
    }

    public b a(f fVar, int i) {
        this.d.a(fVar.a(i, "ep"), 1.0f);
        this.d.a(fVar.a(i, "em"), -1.0f);
        return this;
    }

    b a(i iVar, int i) {
        this.a = iVar;
        float f2 = i;
        iVar.l = f2;
        this.b = f2;
        this.e = true;
        return this;
    }

    public b a(i iVar, int i, i iVar2) {
        this.b = i;
        this.d.a(iVar, -1.0f);
        return this;
    }

    public b a(i iVar, i iVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.d.a(iVar, 1.0f);
            this.d.a(iVar2, -1.0f);
        } else {
            this.d.a(iVar, -1.0f);
            this.d.a(iVar2, 1.0f);
        }
        return this;
    }

    b a(i iVar, i iVar2, int i, float f2, i iVar3, i iVar4, int i2) {
        if (iVar2 == iVar3) {
            this.d.a(iVar, 1.0f);
            this.d.a(iVar4, 1.0f);
            this.d.a(iVar2, -2.0f);
            return this;
        }
        if (f2 == 0.5f) {
            this.d.a(iVar, 1.0f);
            this.d.a(iVar2, -1.0f);
            this.d.a(iVar3, -1.0f);
            this.d.a(iVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.b = (-i) + i2;
            }
        } else if (f2 <= 0.0f) {
            this.d.a(iVar, -1.0f);
            this.d.a(iVar2, 1.0f);
            this.b = i;
        } else if (f2 >= 1.0f) {
            this.d.a(iVar3, -1.0f);
            this.d.a(iVar4, 1.0f);
            this.b = i2;
        } else {
            float f3 = 1.0f - f2;
            this.d.a(iVar, f3 * 1.0f);
            this.d.a(iVar2, f3 * (-1.0f));
            this.d.a(iVar3, (-1.0f) * f2);
            this.d.a(iVar4, 1.0f * f2);
            if (i > 0 || i2 > 0) {
                this.b = ((-i) * f3) + (i2 * f2);
            }
        }
        return this;
    }

    b a(i iVar, i iVar2, i iVar3, float f2) {
        this.d.a(iVar, -1.0f);
        this.d.a(iVar2, 1.0f - f2);
        this.d.a(iVar3, f2);
        return this;
    }

    public b a(i iVar, i iVar2, i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.d.a(iVar, 1.0f);
            this.d.a(iVar2, -1.0f);
            this.d.a(iVar3, -1.0f);
        } else {
            this.d.a(iVar, -1.0f);
            this.d.a(iVar2, 1.0f);
            this.d.a(iVar3, 1.0f);
        }
        return this;
    }

    public b a(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.d.a(iVar, -1.0f);
        this.d.a(iVar2, 1.0f);
        this.d.a(iVar3, f2);
        this.d.a(iVar4, -f2);
        return this;
    }

    @Override // android.a.a.a.f.a
    public i a(f fVar, boolean[] zArr) {
        return this.d.a(zArr, (i) null);
    }

    @Override // android.a.a.a.f.a
    public void a(f.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.a = null;
            this.d.a();
            for (int i = 0; i < bVar.d.a; i++) {
                this.d.a(bVar.d.a(i), bVar.d.b(i), true);
            }
        }
    }

    boolean a() {
        return this.a != null && (this.a.o == i.a.UNRESTRICTED || this.b >= 0.0f);
    }

    boolean a(f fVar) {
        boolean z;
        i iVarA = this.d.a(fVar);
        if (iVarA == null) {
            z = true;
        } else {
            c(iVarA);
            z = false;
        }
        if (this.d.a == 0) {
            this.e = true;
        }
        return z;
    }

    boolean a(i iVar) {
        return this.d.a(iVar);
    }

    public b b(i iVar, int i) {
        if (i < 0) {
            this.b = i * (-1);
            this.d.a(iVar, 1.0f);
        } else {
            this.b = i;
            this.d.a(iVar, -1.0f);
        }
        return this;
    }

    public b b(i iVar, i iVar2, i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        if (z) {
            this.d.a(iVar, 1.0f);
            this.d.a(iVar2, -1.0f);
            this.d.a(iVar3, 1.0f);
        } else {
            this.d.a(iVar, -1.0f);
            this.d.a(iVar2, 1.0f);
            this.d.a(iVar3, -1.0f);
        }
        return this;
    }

    public b b(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.d.a(iVar3, 0.5f);
        this.d.a(iVar4, 0.5f);
        this.d.a(iVar, -0.5f);
        this.d.a(iVar2, -0.5f);
        this.b = -f2;
        return this;
    }

    i b(i iVar) {
        return this.d.a((boolean[]) null, iVar);
    }

    String b() {
        boolean z;
        String str = (this.a == null ? "0" : "" + this.a) + " = ";
        if (this.b != 0.0f) {
            str = str + this.b;
            z = true;
        } else {
            z = false;
        }
        int i = this.d.a;
        for (int i2 = 0; i2 < i; i2++) {
            i iVarA = this.d.a(i2);
            if (iVarA != null) {
                float fB = this.d.b(i2);
                if (fB != 0.0f) {
                    String string = iVarA.toString();
                    if (z) {
                        if (fB > 0.0f) {
                            str = str + " + ";
                        } else {
                            str = str + " - ";
                            fB *= -1.0f;
                        }
                    } else if (fB < 0.0f) {
                        str = str + "- ";
                        fB *= -1.0f;
                    }
                    str = fB == 1.0f ? str + string : str + fB + " " + string;
                    z = true;
                }
            }
        }
        if (z) {
            return str;
        }
        return str + "0.0";
    }

    b c(i iVar, int i) {
        this.d.a(iVar, i);
        return this;
    }

    public void c() {
        this.a = null;
        this.d.a();
        this.b = 0.0f;
        this.e = false;
    }

    void c(i iVar) {
        if (this.a != null) {
            this.d.a(this.a, -1.0f);
            this.a = null;
        }
        float fA = this.d.a(iVar, true) * (-1.0f);
        this.a = iVar;
        if (fA == 1.0f) {
            return;
        }
        this.b /= fA;
        this.d.a(fA);
    }

    int d() {
        return (this.a != null ? 4 : 0) + 4 + 4 + this.d.e();
    }

    @Override // android.a.a.a.f.a
    public void d(i iVar) {
        float f2 = 1.0f;
        if (iVar.k != 1) {
            if (iVar.k == 2) {
                f2 = 1000.0f;
            } else if (iVar.k == 3) {
                f2 = 1000000.0f;
            } else if (iVar.k == 4) {
                f2 = 1.0E9f;
            } else if (iVar.k == 5) {
                f2 = 1.0E12f;
            }
        }
        this.d.a(iVar, f2);
    }

    void e() {
        if (this.b < 0.0f) {
            this.b *= -1.0f;
            this.d.c();
        }
    }

    @Override // android.a.a.a.f.a
    public boolean f() {
        return this.a == null && this.b == 0.0f && this.d.a == 0;
    }

    @Override // android.a.a.a.f.a
    public void g() {
        this.d.a();
        this.a = null;
        this.b = 0.0f;
    }

    @Override // android.a.a.a.f.a
    public i h() {
        return this.a;
    }

    public String toString() {
        return b();
    }
}
