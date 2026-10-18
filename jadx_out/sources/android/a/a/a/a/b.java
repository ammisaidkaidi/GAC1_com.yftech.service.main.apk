package android.a.a.a.a;

/* JADX INFO: loaded from: classes.dex */
class b {
    private static final boolean a = false;

    b() {
    }

    static void a(g gVar, android.a.a.a.f fVar, int i) {
        int i2;
        int i3;
        f[] fVarArr;
        if (i == 0) {
            int i4 = gVar.aO;
            fVarArr = gVar.aR;
            i3 = i4;
            i2 = 0;
        } else {
            i2 = 2;
            i3 = gVar.aP;
            fVarArr = gVar.aQ;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            f fVar2 = fVarArr[i5];
            if (!gVar.B(4)) {
                a(gVar, fVar, i, i2, fVar2);
            } else if (!j.a(gVar, fVar, i, i2, fVar2)) {
                a(gVar, fVar, i, i2, fVar2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0197  */
    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:261:0x0492  */
    /* JADX WARN: Code duplicated, block: B:262:0x0497  */
    /* JADX WARN: Code duplicated, block: B:265:0x049c  */
    /* JADX WARN: Code duplicated, block: B:266:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:268:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:35:0x005b A[PHI: r7 r8
      0x005b: PHI (r7v40 boolean) = (r7v2 boolean), (r7v43 boolean) binds: [B:47:0x007d, B:34:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x005b: PHI (r8v32 boolean) = (r8v2 boolean), (r8v35 boolean) binds: [B:47:0x007d, B:34:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x005d A[PHI: r7 r8
      0x005d: PHI (r7v4 boolean) = (r7v2 boolean), (r7v43 boolean) binds: [B:47:0x007d, B:34:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x005d: PHI (r8v4 boolean) = (r8v2 boolean), (r8v35 boolean) binds: [B:47:0x007d, B:34:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x0160  */
    /* JADX WARN: Multi-variable type inference failed */
    static void a(g gVar, android.a.a.a.f fVar, int i, int i2, f fVar2) {
        f fVar3;
        boolean z;
        boolean z2;
        boolean z3;
        f fVar4;
        int i3;
        int i4;
        c cVar;
        android.a.a.a.i iVar;
        android.a.a.a.i iVar2;
        c cVar2;
        android.a.a.a.i iVar3;
        android.a.a.a.i iVar4;
        f fVar5;
        f fVar6;
        c cVar3;
        int i5;
        c cVar4;
        android.a.a.a.i iVar5;
        android.a.a.a.i iVar6;
        int i6;
        int i7;
        boolean z4;
        f fVar7;
        f fVar8;
        boolean z5 = gVar.aa[i] == f.b.WRAP_CONTENT;
        android.a.a.a.i iVar7 = null;
        if (i == 0 && gVar.aE()) {
            fVar3 = fVar2;
            boolean z6 = false;
            while (!z6) {
                c cVar5 = fVar3.W[i2 + 1].f;
                if (cVar5 != null) {
                    fVar8 = cVar5.d;
                    if (fVar8.W[i2].f == null || fVar8.W[i2].f.d != fVar3) {
                        fVar8 = null;
                    }
                } else {
                    fVar8 = null;
                }
                if (fVar8 != null) {
                    fVar3 = fVar8;
                } else {
                    z6 = true;
                }
            }
        } else {
            fVar3 = fVar2;
        }
        if (i == 0) {
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
        boolean z7 = z3;
        float f = 0.0f;
        boolean z8 = z;
        boolean z9 = z2;
        f fVar9 = fVar2;
        f fVar10 = null;
        f fVar11 = null;
        f fVar12 = null;
        f fVar13 = null;
        boolean z10 = false;
        int i8 = 0;
        while (!z10) {
            fVar9.aG[i] = iVar7;
            if (fVar9.E() != 8) {
                if (fVar13 != null) {
                    fVar13.aG[i] = fVar9;
                }
                if (fVar12 == null) {
                    fVar12 = fVar9;
                }
                fVar13 = fVar9;
            }
            c cVar6 = fVar9.W[i2];
            int iE = cVar6.e();
            if (cVar6.f == null || fVar9 == fVar2) {
                z4 = z10;
            } else {
                z4 = z10;
                if (fVar9.E() != 8) {
                    iE += cVar6.f.e();
                }
            }
            int i9 = iE;
            int i10 = (!z7 || fVar9 == fVar2 || fVar9 == fVar12) ? 1 : 6;
            if (fVar9 == fVar12) {
                fVar.a(cVar6.i, cVar6.f.i, i9, 5);
            } else {
                fVar.a(cVar6.i, cVar6.f.i, i9, 6);
            }
            fVar.c(cVar6.i, cVar6.f.i, i9, i10);
            iVar7 = null;
            fVar9.aF[i] = null;
            if (fVar9.E() != 8 && fVar9.aa[i] == f.b.MATCH_CONSTRAINT) {
                i8++;
                f += fVar9.aE[i];
                if (fVar11 == null) {
                    fVar11 = fVar9;
                } else {
                    fVar10.aF[i] = fVar9;
                }
                if (z5) {
                    fVar.a(fVar9.W[i2 + 1].i, fVar9.W[i2].i, 0, 6);
                }
                fVar10 = fVar9;
            }
            if (z5) {
                fVar.a(fVar9.W[i2].i, gVar.W[i2].i, 0, 6);
            }
            c cVar7 = fVar9.W[i2 + 1].f;
            if (cVar7 != null) {
                fVar7 = cVar7.d;
                if (fVar7.W[i2].f == null || fVar7.W[i2].f.d != fVar9) {
                    fVar7 = null;
                }
            } else {
                fVar7 = null;
            }
            if (fVar7 != null) {
                fVar9 = fVar7;
                z10 = z4;
            } else {
                z10 = true;
            }
            fVar12 = fVar12;
            fVar13 = fVar13;
            fVar3 = fVar3;
        }
        f fVar14 = fVar3;
        if (fVar13 != null) {
            int i11 = i2 + 1;
            if (fVar9.W[i11].f != null) {
                c cVar8 = fVar13.W[i11];
                fVar.b(cVar8.i, fVar9.W[i11].f.i, -cVar8.e(), 5);
            }
        }
        if (z5) {
            int i12 = i2 + 1;
            fVar.a(gVar.W[i12].i, fVar9.W[i12].i, fVar9.W[i12].e(), 6);
        }
        if (i8 > 0) {
            while (fVar11 != null) {
                f fVar15 = fVar11.aF[i];
                if (fVar15 != null) {
                    float f2 = fVar11.aE[i];
                    float f3 = fVar15.aE[i];
                    android.a.a.a.i iVar8 = fVar11.W[i2].i;
                    int i13 = i2 + 1;
                    android.a.a.a.i iVar9 = fVar11.W[i13].i;
                    android.a.a.a.i iVar10 = fVar15.W[i2].i;
                    android.a.a.a.i iVar11 = fVar15.W[i13].i;
                    if (i == 0) {
                        i6 = fVar11.x;
                        i7 = fVar15.x;
                    } else {
                        i6 = fVar11.y;
                        i7 = fVar15.y;
                    }
                    if ((i6 == 0 || i6 == 3) && (i7 == 0 || i7 == 3)) {
                        android.a.a.a.b bVarC = fVar.c();
                        bVarC.a(f2, f, f3, iVar8, iVar9, iVar10, iVar11);
                        fVar.a(bVarC);
                    }
                }
                fVar11 = fVar15;
            }
        }
        if (fVar12 != null && (fVar12 == fVar13 || z7)) {
            c cVar9 = fVar2.W[i2];
            int i14 = i2 + 1;
            c cVar10 = fVar9.W[i14];
            android.a.a.a.i iVar12 = fVar2.W[i2].f != null ? fVar2.W[i2].f.i : iVar7;
            android.a.a.a.i iVar13 = fVar9.W[i14].f != null ? fVar9.W[i14].f.i : iVar7;
            if (fVar12 == fVar13) {
                cVar9 = fVar12.W[i2];
                cVar10 = fVar12.W[i14];
            }
            if (iVar12 != null && iVar13 != null) {
                float f4 = i == 0 ? fVar14.ao : fVar14.ap;
                int iE2 = cVar9.e();
                if (fVar13 == null) {
                    fVar13 = fVar9;
                }
                fVar.a(cVar9.i, iVar12, iE2, f4, iVar13, cVar10.i, fVar13.W[i14].e(), 5);
            }
            fVar4 = fVar12;
        } else {
            if (!z8 || fVar12 == null) {
                fVar4 = fVar12;
                if (z9 && fVar4 != null) {
                    f fVar16 = fVar4;
                    f fVar17 = fVar16;
                    while (fVar17 != null) {
                        f fVar18 = fVar17.aG[i];
                        if (fVar17 == fVar4 || fVar17 == fVar13 || fVar18 == null) {
                            fVar17 = fVar17;
                            fVar17 = fVar18;
                        } else {
                            f fVar19 = fVar18 == fVar13 ? null : fVar18;
                            c cVar11 = fVar17.W[i2];
                            android.a.a.a.i iVar14 = cVar11.i;
                            if (cVar11.f != null) {
                                android.a.a.a.i iVar15 = cVar11.f.i;
                            }
                            int i15 = i2 + 1;
                            android.a.a.a.i iVar16 = fVar16.W[i15].i;
                            int iE3 = cVar11.e();
                            int iE4 = fVar17.W[i15].e();
                            if (fVar19 != null) {
                                c cVar12 = fVar19.W[i2];
                                iVar2 = cVar12.i;
                                cVar = cVar12;
                                iVar = cVar12.f != null ? cVar12.f.i : null;
                            } else {
                                cVar = fVar17.W[i15].f;
                                android.a.a.a.i iVar17 = cVar != null ? cVar.i : null;
                                iVar = fVar17.W[i15].i;
                                iVar2 = iVar17;
                            }
                            if (cVar != null) {
                                iE4 += cVar.e();
                            }
                            int i16 = iE4;
                            if (fVar16 != null) {
                                iE3 += fVar16.W[i15].e();
                            }
                            int i17 = iE3;
                            if (iVar14 != null && iVar16 != null && iVar2 != null && iVar != null) {
                                fVar.a(iVar14, iVar16, i17, 0.5f, iVar2, iVar, i16, 4);
                            }
                            fVar17 = fVar19;
                        }
                        fVar16 = fVar17;
                    }
                    c cVar13 = fVar4.W[i2];
                    c cVar14 = fVar2.W[i2].f;
                    int i18 = i2 + 1;
                    c cVar15 = fVar13.W[i18];
                    c cVar16 = fVar9.W[i18].f;
                    if (cVar14 != null) {
                        if (fVar4 != fVar13) {
                            i4 = 5;
                            fVar.c(cVar13.i, cVar14.i, cVar13.e(), 5);
                        } else {
                            i4 = 5;
                            if (cVar16 != null) {
                                i3 = 5;
                                fVar.a(cVar13.i, cVar14.i, cVar13.e(), 0.5f, cVar15.i, cVar16.i, cVar15.e(), 5);
                            }
                        }
                        i3 = i4;
                    } else {
                        i3 = 5;
                    }
                    if (cVar16 != null && fVar4 != fVar13) {
                        fVar.c(cVar15.i, cVar16.i, -cVar15.e(), i3);
                    }
                }
                fVar6 = fVar13;
                if ((!z8 || z9) && fVar4 != null) {
                    cVar3 = fVar4.W[i2];
                    i5 = i2 + 1;
                    cVar4 = fVar6.W[i5];
                    if (cVar3.f != null) {
                        iVar5 = cVar3.f.i;
                    } else {
                        iVar5 = null;
                    }
                    if (cVar4.f != null) {
                        iVar6 = cVar4.f.i;
                    } else {
                        iVar6 = null;
                    }
                    if (fVar4 == fVar6) {
                        cVar3 = fVar4.W[i2];
                        cVar4 = fVar4.W[i5];
                    }
                    if (iVar5 != null || iVar6 == null) {
                    }
                    int iE5 = cVar3.e();
                    if (fVar6 == null) {
                        fVar6 = fVar9;
                    }
                    fVar.a(cVar3.i, iVar5, iE5, 0.5f, iVar6, cVar4.i, fVar6.W[i5].e(), 5);
                    return;
                }
                return;
            }
            f fVar20 = fVar12;
            f fVar21 = fVar20;
            while (fVar21 != null) {
                f fVar22 = fVar21.aG[i];
                if (fVar22 != null || fVar21 == fVar13) {
                    c cVar17 = fVar21.W[i2];
                    android.a.a.a.i iVar18 = cVar17.i;
                    android.a.a.a.i iVar19 = cVar17.f != null ? cVar17.f.i : iVar7;
                    if (fVar20 != fVar21) {
                        iVar19 = fVar20.W[i2 + 1].i;
                    } else if (fVar21 == fVar12 && fVar20 == fVar21) {
                        iVar19 = fVar2.W[i2].f != null ? fVar2.W[i2].f.i : iVar7;
                    }
                    int iE6 = cVar17.e();
                    int i19 = i2 + 1;
                    int iE7 = fVar21.W[i19].e();
                    if (fVar22 != null) {
                        cVar2 = fVar22.W[i2];
                        android.a.a.a.i iVar20 = cVar2.i;
                        iVar4 = cVar2.f != null ? cVar2.f.i : null;
                        iVar3 = iVar20;
                    } else {
                        cVar2 = fVar9.W[i19].f;
                        iVar3 = cVar2 != null ? cVar2.i : null;
                        iVar4 = fVar21.W[i19].i;
                    }
                    if (cVar2 != null) {
                        iE7 += cVar2.e();
                    }
                    if (fVar20 != null) {
                        iE6 += fVar20.W[i19].e();
                    }
                    if (iVar18 == null || iVar19 == null || iVar3 == null || iVar4 == null) {
                        fVar5 = fVar22;
                    } else {
                        fVar5 = fVar22;
                        fVar.a(iVar18, iVar19, fVar21 == fVar12 ? fVar12.W[i2].e() : iE6, 0.5f, iVar3, iVar4, fVar21 == fVar13 ? fVar13.W[i19].e() : iE7, 4);
                    }
                } else {
                    fVar5 = fVar22;
                }
                fVar12 = fVar12;
                fVar20 = fVar21;
                fVar21 = fVar5;
                iVar7 = null;
            }
            fVar4 = fVar12;
        }
        fVar9 = fVar9;
        fVar6 = fVar13;
        if (z8) {
        }
        cVar3 = fVar4.W[i2];
        i5 = i2 + 1;
        cVar4 = fVar6.W[i5];
        if (cVar3.f != null) {
            iVar5 = cVar3.f.i;
        } else {
            iVar5 = null;
        }
        if (cVar4.f != null) {
            iVar6 = cVar4.f.i;
        } else {
            iVar6 = null;
        }
        if (fVar4 == fVar6) {
            cVar3 = fVar4.W[i2];
            cVar4 = fVar4.W[i5];
        }
        if (iVar5 != null) {
        }
    }
}
