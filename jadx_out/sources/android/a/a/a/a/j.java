package android.a.a.a.a;

/* JADX INFO: loaded from: classes.dex */
public class j {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 4;
    public static final int e = 8;
    public static final int f = 16;
    public static final int g = 3;
    static boolean[] h = new boolean[3];
    static final int i = 0;
    static final int j = 1;
    static final int k = 2;

    static void a(int i2, f fVar) {
        fVar.t();
        l lVarA = fVar.J.a();
        l lVarA2 = fVar.K.a();
        l lVarA3 = fVar.L.a();
        l lVarA4 = fVar.M.a();
        boolean z = (i2 & 8) == 8;
        if (lVarA.g != 4 && lVarA3.g != 4) {
            if (fVar.aa[0] == f.b.FIXED) {
                if (fVar.J.f == null && fVar.L.f == null) {
                    lVarA.b(1);
                    lVarA3.b(1);
                    if (z) {
                        lVarA3.a(lVarA, 1, fVar.v());
                    } else {
                        lVarA3.a(lVarA, fVar.M());
                    }
                } else if (fVar.J.f != null && fVar.L.f == null) {
                    lVarA.b(1);
                    lVarA3.b(1);
                    if (z) {
                        lVarA3.a(lVarA, 1, fVar.v());
                    } else {
                        lVarA3.a(lVarA, fVar.M());
                    }
                } else if (fVar.J.f == null && fVar.L.f != null) {
                    lVarA.b(1);
                    lVarA3.b(1);
                    lVarA.a(lVarA3, -fVar.M());
                    if (z) {
                        lVarA.a(lVarA3, -1, fVar.v());
                    } else {
                        lVarA.a(lVarA3, -fVar.M());
                    }
                } else if (fVar.J.f != null && fVar.L.f != null) {
                    lVarA.b(2);
                    lVarA3.b(2);
                    if (z) {
                        fVar.v().a(lVarA);
                        fVar.v().a(lVarA3);
                        lVarA.b(lVarA3, -1, fVar.v());
                        lVarA3.b(lVarA, 1, fVar.v());
                    } else {
                        lVarA.b(lVarA3, -fVar.M());
                        lVarA3.b(lVarA, fVar.M());
                    }
                }
            } else if (fVar.aa[0] == f.b.MATCH_CONSTRAINT && a(fVar, 0)) {
                int iM = fVar.M();
                lVarA.b(1);
                lVarA3.b(1);
                if (fVar.J.f == null && fVar.L.f == null) {
                    if (z) {
                        lVarA3.a(lVarA, 1, fVar.v());
                    } else {
                        lVarA3.a(lVarA, iM);
                    }
                } else if (fVar.J.f == null || fVar.L.f != null) {
                    if (fVar.J.f != null || fVar.L.f == null) {
                        if (fVar.J.f != null && fVar.L.f != null) {
                            if (z) {
                                fVar.v().a(lVarA);
                                fVar.v().a(lVarA3);
                            }
                            if (fVar.ae == 0.0f) {
                                lVarA.b(3);
                                lVarA3.b(3);
                                lVarA.b(lVarA3, 0.0f);
                                lVarA3.b(lVarA, 0.0f);
                            } else {
                                lVarA.b(2);
                                lVarA3.b(2);
                                lVarA.b(lVarA3, -iM);
                                lVarA3.b(lVarA, iM);
                                fVar.p(iM);
                            }
                        }
                    } else if (z) {
                        lVarA.a(lVarA3, -1, fVar.v());
                    } else {
                        lVarA.a(lVarA3, -iM);
                    }
                } else if (z) {
                    lVarA3.a(lVarA, 1, fVar.v());
                } else {
                    lVarA3.a(lVarA, iM);
                }
            }
        }
        if (lVarA2.g == 4 || lVarA4.g == 4) {
            return;
        }
        if (fVar.aa[1] != f.b.FIXED) {
            if (fVar.aa[1] == f.b.MATCH_CONSTRAINT && a(fVar, 1)) {
                int iQ = fVar.Q();
                lVarA2.b(1);
                lVarA4.b(1);
                if (fVar.K.f == null && fVar.M.f == null) {
                    if (z) {
                        lVarA4.a(lVarA2, 1, fVar.w());
                        return;
                    } else {
                        lVarA4.a(lVarA2, iQ);
                        return;
                    }
                }
                if (fVar.K.f != null && fVar.M.f == null) {
                    if (z) {
                        lVarA4.a(lVarA2, 1, fVar.w());
                        return;
                    } else {
                        lVarA4.a(lVarA2, iQ);
                        return;
                    }
                }
                if (fVar.K.f == null && fVar.M.f != null) {
                    if (z) {
                        lVarA2.a(lVarA4, -1, fVar.w());
                        return;
                    } else {
                        lVarA2.a(lVarA4, -iQ);
                        return;
                    }
                }
                if (fVar.K.f == null || fVar.M.f == null) {
                    return;
                }
                if (z) {
                    fVar.w().a(lVarA2);
                    fVar.v().a(lVarA4);
                }
                if (fVar.ae == 0.0f) {
                    lVarA2.b(3);
                    lVarA4.b(3);
                    lVarA2.b(lVarA4, 0.0f);
                    lVarA4.b(lVarA2, 0.0f);
                    return;
                }
                lVarA2.b(2);
                lVarA4.b(2);
                lVarA2.b(lVarA4, -iQ);
                lVarA4.b(lVarA2, iQ);
                fVar.q(iQ);
                if (fVar.ak > 0) {
                    fVar.N.a().a(1, lVarA2, fVar.ak);
                    return;
                }
                return;
            }
            return;
        }
        if (fVar.K.f == null && fVar.M.f == null) {
            lVarA2.b(1);
            lVarA4.b(1);
            if (z) {
                lVarA4.a(lVarA2, 1, fVar.w());
            } else {
                lVarA4.a(lVarA2, fVar.Q());
            }
            if (fVar.N.f != null) {
                fVar.N.a().b(1);
                lVarA2.a(1, fVar.N.a(), -fVar.ak);
                return;
            }
            return;
        }
        if (fVar.K.f != null && fVar.M.f == null) {
            lVarA2.b(1);
            lVarA4.b(1);
            if (z) {
                lVarA4.a(lVarA2, 1, fVar.w());
            } else {
                lVarA4.a(lVarA2, fVar.Q());
            }
            if (fVar.ak > 0) {
                fVar.N.a().a(1, lVarA2, fVar.ak);
                return;
            }
            return;
        }
        if (fVar.K.f == null && fVar.M.f != null) {
            lVarA2.b(1);
            lVarA4.b(1);
            if (z) {
                lVarA2.a(lVarA4, -1, fVar.w());
            } else {
                lVarA2.a(lVarA4, -fVar.Q());
            }
            if (fVar.ak > 0) {
                fVar.N.a().a(1, lVarA2, fVar.ak);
                return;
            }
            return;
        }
        if (fVar.K.f == null || fVar.M.f == null) {
            return;
        }
        lVarA2.b(2);
        lVarA4.b(2);
        if (z) {
            lVarA2.b(lVarA4, -1, fVar.w());
            lVarA4.b(lVarA2, 1, fVar.w());
            fVar.w().a(lVarA2);
            fVar.v().a(lVarA4);
        } else {
            lVarA2.b(lVarA4, -fVar.Q());
            lVarA4.b(lVarA2, fVar.Q());
        }
        if (fVar.ak > 0) {
            fVar.N.a().a(1, lVarA2, fVar.ak);
        }
    }

    static void a(g gVar, android.a.a.a.f fVar, f fVar2) {
        if (gVar.aa[0] != f.b.WRAP_CONTENT && fVar2.aa[0] == f.b.MATCH_PARENT) {
            int i2 = fVar2.J.g;
            int iM = gVar.M() - fVar2.L.g;
            fVar2.J.i = fVar.a(fVar2.J);
            fVar2.L.i = fVar.a(fVar2.L);
            fVar.b(fVar2.J.i, i2);
            fVar.b(fVar2.L.i, iM);
            fVar2.t = 2;
            fVar2.f(i2, iM);
        }
        if (gVar.aa[1] == f.b.WRAP_CONTENT || fVar2.aa[1] != f.b.MATCH_PARENT) {
            return;
        }
        int i3 = fVar2.K.g;
        int iQ = gVar.Q() - fVar2.M.g;
        fVar2.K.i = fVar.a(fVar2.K);
        fVar2.M.i = fVar.a(fVar2.M);
        fVar.b(fVar2.K.i, i3);
        fVar.b(fVar2.M.i, iQ);
        if (fVar2.ak > 0 || fVar2.E() == 8) {
            fVar2.N.i = fVar.a(fVar2.N);
            fVar.b(fVar2.N.i, fVar2.ak + i3);
        }
        fVar2.u = 2;
        fVar2.g(i3, iQ);
    }

    private static boolean a(f fVar, int i2) {
        if (fVar.aa[i2] != f.b.MATCH_CONSTRAINT) {
            return false;
        }
        if (fVar.ae != 0.0f) {
            return fVar.aa[i2 != 0 ? (char) 0 : (char) 1] == f.b.MATCH_CONSTRAINT ? false : false;
        }
        if (i2 == 0) {
            if (fVar.x != 0 || fVar.z != 0 || fVar.A != 0) {
                return false;
            }
        } else if (fVar.y != 0 || fVar.C != 0 || fVar.D != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055 A[PHI: r6 r7
      0x0055: PHI (r6v28 boolean) = (r6v2 boolean), (r6v31 boolean) binds: [B:42:0x0069, B:30:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0055: PHI (r7v30 boolean) = (r7v2 boolean), (r7v33 boolean) binds: [B:42:0x0069, B:30:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0057 A[PHI: r6 r7
      0x0057: PHI (r6v4 boolean) = (r6v2 boolean), (r6v31 boolean) binds: [B:42:0x0069, B:30:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0057: PHI (r7v4 boolean) = (r7v2 boolean), (r7v33 boolean) binds: [B:42:0x0069, B:30:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x012f  */
    static boolean a(g gVar, android.a.a.a.f fVar, int i2, int i3, f fVar2) {
        f fVar3;
        boolean z;
        boolean z2;
        boolean z3;
        float fE;
        f fVar4;
        f fVar5;
        f.b bVar = gVar.aa[i2];
        f.b bVar2 = f.b.WRAP_CONTENT;
        if (i2 == 0 && gVar.aE()) {
            fVar3 = fVar2;
            boolean z4 = false;
            while (!z4) {
                c cVar = fVar3.W[i3 + 1].f;
                if (cVar != null) {
                    fVar5 = cVar.d;
                    if (fVar5.W[i3].f == null || fVar5.W[i3].f.d != fVar3) {
                        fVar5 = null;
                    }
                } else {
                    fVar5 = null;
                }
                if (fVar5 != null) {
                    fVar3 = fVar5;
                } else {
                    z4 = true;
                }
            }
        } else {
            fVar3 = fVar2;
        }
        if (i2 == 0) {
            z = fVar3.aA == 0;
            z2 = fVar3.aA == 1;
            if (fVar3.aA == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z = fVar3.aB == 0;
            z2 = fVar3.aB == 1;
            if (fVar3.aB == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        f fVar6 = fVar2;
        f fVar7 = null;
        f fVar8 = null;
        f fVar9 = null;
        f fVar10 = null;
        boolean z5 = false;
        int i4 = 0;
        int i5 = 0;
        float fM = 0.0f;
        float fE2 = 0.0f;
        float f2 = 0.0f;
        while (!z5) {
            fVar6.aG[i2] = null;
            if (fVar6.E() != 8) {
                if (fVar8 != null) {
                    fVar8.aG[i2] = fVar6;
                }
                if (fVar9 == null) {
                    fVar9 = fVar6;
                }
                i4++;
                fM = i2 == 0 ? fM + fVar6.M() : fM + fVar6.Q();
                if (fVar6 != fVar9) {
                    fM += fVar6.W[i3].e();
                }
                fE2 = fE2 + fVar6.W[i3].e() + fVar6.W[i3 + 1].e();
                fVar8 = fVar6;
            }
            c cVar2 = fVar6.W[i3];
            fVar6.aF[i2] = null;
            if (fVar6.E() != 8 && fVar6.aa[i2] == f.b.MATCH_CONSTRAINT) {
                i5++;
                if (i2 == 0) {
                    if (fVar6.x != 0 || fVar6.z != 0 || fVar6.A != 0) {
                        return false;
                    }
                } else if (fVar6.y != 0 || fVar6.C != 0 || fVar6.D != 0) {
                    return false;
                }
                f2 += fVar6.aE[i2];
                if (fVar10 == null) {
                    fVar10 = fVar6;
                } else {
                    fVar7.aF[i2] = fVar6;
                }
                fVar7 = fVar6;
            }
            c cVar3 = fVar6.W[i3 + 1].f;
            if (cVar3 != null) {
                fVar4 = cVar3.d;
                if (fVar4.W[i3].f == null || fVar4.W[i3].f.d != fVar6) {
                    fVar4 = null;
                }
            } else {
                fVar4 = null;
            }
            if (fVar4 != null) {
                fVar6 = fVar4;
            } else {
                z5 = true;
            }
        }
        l lVarA = fVar2.W[i3].a();
        int i6 = i3 + 1;
        l lVarA2 = fVar6.W[i6].a();
        if (lVarA.c == null || lVarA2.c == null) {
            return false;
        }
        if (lVarA.c.r != 1 && lVarA2.c.r != 1) {
            return false;
        }
        if (i5 > 0 && i5 != i4) {
            return false;
        }
        if (z3 || z || z2) {
            fE = fVar9 != null ? fVar9.W[i3].e() : 0.0f;
            if (fVar8 != null) {
                fE += fVar8.W[i6].e();
            }
        } else {
            fE = 0.0f;
        }
        float fE3 = lVarA.c.f;
        float f3 = lVarA2.c.f;
        float f4 = fE3 < f3 ? (f3 - fE3) - fM : (fE3 - f3) - fM;
        if (i5 > 0 && i5 == i4) {
            if (fVar6.B() != null && fVar6.B().aa[i2] == f.b.WRAP_CONTENT) {
                return false;
            }
            float f5 = (f4 + fM) - fE2;
            if (z) {
                f5 -= fE2 - fE;
            }
            if (z) {
                fE3 += fVar9.W[i6].e();
                f fVar11 = fVar9.aG[i2];
                if (fVar11 != null) {
                    fE3 += fVar11.W[i3].e();
                }
            }
            while (fVar9 != null) {
                if (android.a.a.a.f.h != null) {
                    android.a.a.a.f.h.B--;
                    android.a.a.a.f.h.s++;
                    android.a.a.a.f.h.y++;
                }
                f fVar12 = fVar9.aG[i2];
                if (fVar12 != null || fVar9 == fVar8) {
                    float f6 = f5 / i5;
                    if (f2 > 0.0f) {
                        f6 = (fVar9.aE[i2] * f5) / f2;
                    }
                    float fE4 = fE3 + fVar9.W[i3].e();
                    fVar9.W[i3].a().a(lVarA.e, fE4);
                    float f7 = fE4 + f6;
                    fVar9.W[i6].a().a(lVarA.e, f7);
                    fVar9.W[i3].a().a(fVar);
                    fVar9.W[i6].a().a(fVar);
                    fE3 = f7 + fVar9.W[i6].e();
                }
                fVar9 = fVar12;
            }
            return true;
        }
        if (f4 < fM) {
            return false;
        }
        if (z3) {
            float fAg = fE3 + ((f4 - fE) * fVar2.ag());
            while (fVar9 != null) {
                if (android.a.a.a.f.h != null) {
                    android.a.a.a.f.h.B--;
                    android.a.a.a.f.h.s++;
                    android.a.a.a.f.h.y++;
                }
                f fVar13 = fVar9.aG[i2];
                if (fVar13 != null || fVar9 == fVar8) {
                    float fM2 = i2 == 0 ? fVar9.M() : fVar9.Q();
                    float fE5 = fAg + fVar9.W[i3].e();
                    fVar9.W[i3].a().a(lVarA.e, fE5);
                    float f8 = fE5 + fM2;
                    fVar9.W[i6].a().a(lVarA.e, f8);
                    fVar9.W[i3].a().a(fVar);
                    fVar9.W[i6].a().a(fVar);
                    fAg = f8 + fVar9.W[i6].e();
                }
                fVar9 = fVar13;
            }
            return true;
        }
        if (!z && !z2) {
            return true;
        }
        if (z || z2) {
            f4 -= fE;
        }
        float f9 = f4 / (i4 + 1);
        if (z2) {
            f9 = i4 > 1 ? f4 / (i4 - 1) : f4 / 2.0f;
        }
        float fE6 = fE3 + f9;
        if (z2 && i4 > 1) {
            fE6 = fVar9.W[i3].e() + fE3;
        }
        if (z && fVar9 != null) {
            fE6 += fVar9.W[i3].e();
        }
        while (fVar9 != null) {
            if (android.a.a.a.f.h != null) {
                android.a.a.a.f.h.B--;
                android.a.a.a.f.h.s++;
                android.a.a.a.f.h.y++;
            }
            f fVar14 = fVar9.aG[i2];
            if (fVar14 != null || fVar9 == fVar8) {
                float fM3 = i2 == 0 ? fVar9.M() : fVar9.Q();
                fVar9.W[i3].a().a(lVarA.e, fE6);
                fVar9.W[i6].a().a(lVarA.e, fE6 + fM3);
                fVar9.W[i3].a().a(fVar);
                fVar9.W[i6].a().a(fVar);
                fE6 += fM3 + f9;
            }
            fVar9 = fVar14;
        }
        return true;
    }
}
