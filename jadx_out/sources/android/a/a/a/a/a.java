package android.a.a.a.a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class a extends i {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    private int aL = 0;
    private ArrayList<l> aM = new ArrayList<>(4);
    private boolean aN = true;

    public void a(int i) {
        this.aL = i;
    }

    @Override // android.a.a.a.a.f
    public void a(android.a.a.a.f fVar) {
        boolean z;
        this.W[0] = this.J;
        this.W[2] = this.K;
        this.W[1] = this.L;
        this.W[3] = this.M;
        for (int i = 0; i < this.W.length; i++) {
            this.W[i].i = fVar.a(this.W[i]);
        }
        if (this.aL < 0 || this.aL >= 4) {
            return;
        }
        c cVar = this.W[this.aL];
        int i2 = 0;
        while (true) {
            if (i2 >= this.aK) {
                z = false;
                break;
            }
            f fVar2 = this.aJ[i2];
            if ((this.aN || fVar2.a()) && (((this.aL == 0 || this.aL == 1) && fVar2.av() == f.b.MATCH_CONSTRAINT) || ((this.aL == 2 || this.aL == 3) && fVar2.aw() == f.b.MATCH_CONSTRAINT))) {
                z = true;
                break;
            }
            i2++;
        }
        if (this.aL == 0 || this.aL == 1 ? B().av() == f.b.WRAP_CONTENT : B().aw() == f.b.WRAP_CONTENT) {
            z = false;
        }
        for (int i3 = 0; i3 < this.aK; i3++) {
            f fVar3 = this.aJ[i3];
            if (this.aN || fVar3.a()) {
                android.a.a.a.i iVarA = fVar.a(fVar3.W[this.aL]);
                fVar3.W[this.aL].i = iVarA;
                if (this.aL == 0 || this.aL == 2) {
                    fVar.b(cVar.i, iVarA, z);
                } else {
                    fVar.a(cVar.i, iVarA, z);
                }
            }
        }
        if (this.aL == 0) {
            fVar.c(this.L.i, this.J.i, 0, 6);
            if (z) {
                return;
            }
            fVar.c(this.J.i, this.ab.L.i, 0, 5);
            return;
        }
        if (this.aL == 1) {
            fVar.c(this.J.i, this.L.i, 0, 6);
            if (z) {
                return;
            }
            fVar.c(this.J.i, this.ab.J.i, 0, 5);
            return;
        }
        if (this.aL == 2) {
            fVar.c(this.M.i, this.K.i, 0, 6);
            if (z) {
                return;
            }
            fVar.c(this.K.i, this.ab.M.i, 0, 5);
            return;
        }
        if (this.aL == 3) {
            fVar.c(this.K.i, this.M.i, 0, 6);
            if (z) {
                return;
            }
            fVar.c(this.K.i, this.ab.K.i, 0, 5);
        }
    }

    public void a(boolean z) {
        this.aN = z;
    }

    @Override // android.a.a.a.a.f
    public boolean a() {
        return true;
    }

    @Override // android.a.a.a.a.f
    public void b() {
        super.b();
        this.aM.clear();
    }

    @Override // android.a.a.a.a.f
    public void b(int i) {
        l lVarA;
        l lVarA2;
        if (this.ab != null && ((g) this.ab).B(2)) {
            switch (this.aL) {
                case 0:
                    lVarA = this.J.a();
                    break;
                case 1:
                    lVarA = this.L.a();
                    break;
                case 2:
                    lVarA = this.K.a();
                    break;
                case 3:
                    lVarA = this.M.a();
                    break;
                default:
                    return;
            }
            lVarA.b(5);
            if (this.aL == 0 || this.aL == 1) {
                this.K.a().a((l) null, 0.0f);
                this.M.a().a((l) null, 0.0f);
            } else {
                this.J.a().a((l) null, 0.0f);
                this.L.a().a((l) null, 0.0f);
            }
            this.aM.clear();
            for (int i2 = 0; i2 < this.aK; i2++) {
                f fVar = this.aJ[i2];
                if (this.aN || fVar.a()) {
                    switch (this.aL) {
                        case 0:
                            lVarA2 = fVar.J.a();
                            break;
                        case 1:
                            lVarA2 = fVar.L.a();
                            break;
                        case 2:
                            lVarA2 = fVar.K.a();
                            break;
                        case 3:
                            lVarA2 = fVar.M.a();
                            break;
                        default:
                            lVarA2 = null;
                            break;
                    }
                    if (lVarA2 != null) {
                        this.aM.add(lVarA2);
                        lVarA2.a(lVarA);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Code duplicated, block: B:33:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Code duplicated, block: B:35:0x0092  */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:39:0x003d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x005d A[SYNTHETIC] */
    @Override // android.a.a.a.a.f
    public void c() {
        l lVarA;
        int size;
        l lVar;
        int i;
        l lVar2;
        float f = Float.MAX_VALUE;
        switch (this.aL) {
            case 0:
                lVarA = this.J.a();
                size = this.aM.size();
                lVar = null;
                for (i = 0; i < size; i++) {
                    lVar2 = this.aM.get(i);
                    if (lVar2.r != 1) {
                        if (this.aL != 0 || this.aL == 2) {
                            if (lVar2.f < f) {
                                f = lVar2.f;
                                lVar = lVar2.e;
                            }
                        } else if (lVar2.f > f) {
                            f = lVar2.f;
                            lVar = lVar2.e;
                        }
                    }
                    break;
                }
                if (android.a.a.a.f.a() != null) {
                    android.a.a.a.f.a().z++;
                }
                lVarA.e = lVar;
                lVarA.f = f;
                lVarA.g();
                switch (this.aL) {
                    case 0:
                        this.L.a().a(lVar, f);
                        break;
                    case 1:
                        this.J.a().a(lVar, f);
                        break;
                    case 2:
                        this.M.a().a(lVar, f);
                        break;
                    case 3:
                        this.K.a().a(lVar, f);
                        break;
                }
                break;
            case 1:
                lVarA = this.L.a();
                f = 0.0f;
                size = this.aM.size();
                lVar = null;
                while (i < size) {
                    lVar2 = this.aM.get(i);
                    if (lVar2.r != 1) {
                        if (this.aL != 0) {
                            if (lVar2.f < f) {
                                f = lVar2.f;
                                lVar = lVar2.e;
                            }
                        } else if (lVar2.f < f) {
                            f = lVar2.f;
                            lVar = lVar2.e;
                        }
                    }
                    break;
                }
                if (android.a.a.a.f.a() != null) {
                    android.a.a.a.f.a().z++;
                }
                lVarA.e = lVar;
                lVarA.f = f;
                lVarA.g();
                switch (this.aL) {
                    case 0:
                        this.L.a().a(lVar, f);
                        break;
                    case 1:
                        this.J.a().a(lVar, f);
                        break;
                    case 2:
                        this.M.a().a(lVar, f);
                        break;
                    case 3:
                        this.K.a().a(lVar, f);
                        break;
                }
                break;
            case 2:
                lVarA = this.K.a();
                size = this.aM.size();
                lVar = null;
                while (i < size) {
                    lVar2 = this.aM.get(i);
                    if (lVar2.r != 1) {
                        if (this.aL != 0) {
                            if (lVar2.f < f) {
                                f = lVar2.f;
                                lVar = lVar2.e;
                            }
                        } else if (lVar2.f < f) {
                            f = lVar2.f;
                            lVar = lVar2.e;
                        }
                    }
                    break;
                }
                if (android.a.a.a.f.a() != null) {
                    android.a.a.a.f.a().z++;
                }
                lVarA.e = lVar;
                lVarA.f = f;
                lVarA.g();
                switch (this.aL) {
                    case 0:
                        this.L.a().a(lVar, f);
                        break;
                    case 1:
                        this.J.a().a(lVar, f);
                        break;
                    case 2:
                        this.M.a().a(lVar, f);
                        break;
                    case 3:
                        this.K.a().a(lVar, f);
                        break;
                }
                break;
            case 3:
                lVarA = this.M.a();
                f = 0.0f;
                size = this.aM.size();
                lVar = null;
                while (i < size) {
                    lVar2 = this.aM.get(i);
                    if (lVar2.r != 1) {
                        if (this.aL != 0) {
                            if (lVar2.f < f) {
                                f = lVar2.f;
                                lVar = lVar2.e;
                            }
                        } else if (lVar2.f < f) {
                            f = lVar2.f;
                            lVar = lVar2.e;
                        }
                    }
                    break;
                }
                if (android.a.a.a.f.a() != null) {
                    android.a.a.a.f.a().z++;
                }
                lVarA.e = lVar;
                lVarA.f = f;
                lVarA.g();
                switch (this.aL) {
                    case 0:
                        this.L.a().a(lVar, f);
                        break;
                    case 1:
                        this.J.a().a(lVar, f);
                        break;
                    case 2:
                        this.M.a().a(lVar, f);
                        break;
                    case 3:
                        this.K.a().a(lVar, f);
                        break;
                }
                break;
        }
    }
}
