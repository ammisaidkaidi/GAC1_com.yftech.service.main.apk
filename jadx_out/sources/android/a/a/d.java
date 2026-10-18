package android.a.a;

import android.a.a.a.a.l;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class d extends ViewGroup {
    static final boolean a = false;
    public static final String b = "ConstraintLayout-1.1.0";
    public static final int i = 0;
    private static final String j = "ConstraintLayout";
    private static final boolean k = true;
    private static final boolean l = false;
    SparseArray<View> c;
    android.a.a.a.a.g d;
    int e;
    int f;
    int g;
    int h;
    private ArrayList<c> m;
    private final ArrayList<android.a.a.a.a.f> n;
    private int o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private int t;
    private e u;
    private int v;
    private HashMap<String, Integer> w;
    private int x;
    private int y;
    private android.a.a.a.g z;

    public static class a extends ViewGroup.MarginLayoutParams {
        public static final int a = 0;
        public static final int b = 0;
        public static final int c = -1;
        public static final int d = 0;
        public static final int e = 1;
        public static final int f = 1;
        public static final int g = 2;
        public static final int h = 3;
        public static final int i = 4;
        public static final int j = 5;
        public static final int k = 6;
        public static final int l = 7;
        public static final int m = 1;
        public static final int n = 0;
        public static final int o = 2;
        public static final int p = 0;
        public static final int q = 1;
        public static final int r = 2;
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;
        public float G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public float R;
        public float S;
        public String T;
        float U;
        int V;
        public float W;
        public float X;
        public int Y;
        public int Z;
        int aA;
        int aB;
        float aC;
        android.a.a.a.a.f aD;
        public boolean aE;
        public int aa;
        public int ab;
        public int ac;
        public int ad;
        public int ae;
        public int af;
        public float ag;
        public float ah;
        public int ai;
        public int aj;
        public int ak;
        public boolean al;
        public boolean am;
        boolean an;
        boolean ao;
        boolean ap;
        boolean aq;
        boolean ar;
        boolean as;
        int at;
        int au;
        int av;
        int aw;
        int ax;
        int ay;
        float az;
        public int s;
        public int t;
        public float u;
        public int v;
        public int w;
        public int x;
        public int y;
        public int z;

        /* JADX INFO: renamed from: android.a.a.d$a$a, reason: collision with other inner class name */
        private static class C0001a {
            public static final int A = 26;
            public static final int B = 27;
            public static final int C = 28;
            public static final int D = 29;
            public static final int E = 30;
            public static final int F = 31;
            public static final int G = 32;
            public static final int H = 33;
            public static final int I = 34;
            public static final int J = 35;
            public static final int K = 36;
            public static final int L = 37;
            public static final int M = 38;
            public static final int N = 39;
            public static final int O = 40;
            public static final int P = 41;
            public static final int Q = 42;
            public static final int R = 43;
            public static final int S = 44;
            public static final int T = 45;
            public static final int U = 46;
            public static final int V = 47;
            public static final int W = 48;
            public static final int X = 49;
            public static final int Y = 50;
            public static final SparseIntArray Z = new SparseIntArray();
            public static final int a = 0;
            public static final int b = 1;
            public static final int c = 2;
            public static final int d = 3;
            public static final int e = 4;
            public static final int f = 5;
            public static final int g = 6;
            public static final int h = 7;
            public static final int i = 8;
            public static final int j = 9;
            public static final int k = 10;
            public static final int l = 11;
            public static final int m = 12;
            public static final int n = 13;
            public static final int o = 14;
            public static final int p = 15;
            public static final int q = 16;
            public static final int r = 17;
            public static final int s = 18;
            public static final int t = 19;
            public static final int u = 20;
            public static final int v = 21;
            public static final int w = 22;
            public static final int x = 23;
            public static final int y = 24;
            public static final int z = 25;

            static {
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintCircle, 2);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                Z.append(j.c.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                Z.append(j.c.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                Z.append(j.c.ConstraintLayout_Layout_android_orientation, 1);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                Z.append(j.c.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                Z.append(j.c.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                Z.append(j.c.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                Z.append(j.c.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                Z.append(j.c.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                Z.append(j.c.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                Z.append(j.c.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                Z.append(j.c.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                Z.append(j.c.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
            }

            private C0001a() {
            }
        }

        public a(int i2, int i3) {
            super(i2, i3);
            this.s = -1;
            this.t = -1;
            this.u = -1.0f;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = -1;
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = 0;
            this.G = 0.0f;
            this.H = -1;
            this.I = -1;
            this.J = -1;
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = -1;
            this.P = -1;
            this.Q = -1;
            this.R = 0.5f;
            this.S = 0.5f;
            this.T = null;
            this.U = 0.0f;
            this.V = 1;
            this.W = 0.0f;
            this.X = 0.0f;
            this.Y = 0;
            this.Z = 0;
            this.aa = 0;
            this.ab = 0;
            this.ac = 0;
            this.ad = 0;
            this.ae = 0;
            this.af = 0;
            this.ag = 1.0f;
            this.ah = 1.0f;
            this.ai = -1;
            this.aj = -1;
            this.ak = -1;
            this.al = false;
            this.am = false;
            this.an = d.k;
            this.ao = d.k;
            this.ap = false;
            this.aq = false;
            this.ar = false;
            this.as = false;
            this.at = -1;
            this.au = -1;
            this.av = -1;
            this.aw = -1;
            this.ax = -1;
            this.ay = -1;
            this.az = 0.5f;
            this.aD = new android.a.a.a.a.f();
            this.aE = false;
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.s = -1;
            this.t = -1;
            this.u = -1.0f;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = -1;
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = 0;
            this.G = 0.0f;
            this.H = -1;
            this.I = -1;
            this.J = -1;
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = -1;
            this.P = -1;
            this.Q = -1;
            this.R = 0.5f;
            this.S = 0.5f;
            this.T = null;
            this.U = 0.0f;
            this.V = 1;
            this.W = 0.0f;
            this.X = 0.0f;
            this.Y = 0;
            this.Z = 0;
            this.aa = 0;
            this.ab = 0;
            this.ac = 0;
            this.ad = 0;
            this.ae = 0;
            this.af = 0;
            this.ag = 1.0f;
            this.ah = 1.0f;
            this.ai = -1;
            this.aj = -1;
            this.ak = -1;
            this.al = false;
            this.am = false;
            this.an = d.k;
            this.ao = d.k;
            this.ap = false;
            this.aq = false;
            this.ar = false;
            this.as = false;
            this.at = -1;
            this.au = -1;
            this.av = -1;
            this.aw = -1;
            this.ax = -1;
            this.ay = -1;
            this.az = 0.5f;
            this.aD = new android.a.a.a.a.f();
            this.aE = false;
            this.s = aVar.s;
            this.t = aVar.t;
            this.u = aVar.u;
            this.v = aVar.v;
            this.w = aVar.w;
            this.x = aVar.x;
            this.y = aVar.y;
            this.z = aVar.z;
            this.A = aVar.A;
            this.B = aVar.B;
            this.C = aVar.C;
            this.D = aVar.D;
            this.E = aVar.E;
            this.F = aVar.F;
            this.G = aVar.G;
            this.H = aVar.H;
            this.I = aVar.I;
            this.J = aVar.J;
            this.K = aVar.K;
            this.L = aVar.L;
            this.M = aVar.M;
            this.N = aVar.N;
            this.O = aVar.O;
            this.P = aVar.P;
            this.Q = aVar.Q;
            this.R = aVar.R;
            this.S = aVar.S;
            this.T = aVar.T;
            this.U = aVar.U;
            this.V = aVar.V;
            this.W = aVar.W;
            this.X = aVar.X;
            this.Y = aVar.Y;
            this.Z = aVar.Z;
            this.al = aVar.al;
            this.am = aVar.am;
            this.aa = aVar.aa;
            this.ab = aVar.ab;
            this.ac = aVar.ac;
            this.ae = aVar.ae;
            this.ad = aVar.ad;
            this.af = aVar.af;
            this.ag = aVar.ag;
            this.ah = aVar.ah;
            this.ai = aVar.ai;
            this.aj = aVar.aj;
            this.ak = aVar.ak;
            this.an = aVar.an;
            this.ao = aVar.ao;
            this.ap = aVar.ap;
            this.aq = aVar.aq;
            this.at = aVar.at;
            this.au = aVar.au;
            this.av = aVar.av;
            this.aw = aVar.aw;
            this.ax = aVar.ax;
            this.ay = aVar.ay;
            this.az = aVar.az;
            this.aD = aVar.aD;
        }

        public a(Context context, AttributeSet attributeSet) {
            int i2;
            super(context, attributeSet);
            this.s = -1;
            this.t = -1;
            this.u = -1.0f;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = -1;
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = 0;
            this.G = 0.0f;
            this.H = -1;
            this.I = -1;
            this.J = -1;
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = -1;
            this.P = -1;
            this.Q = -1;
            this.R = 0.5f;
            this.S = 0.5f;
            this.T = null;
            this.U = 0.0f;
            this.V = 1;
            this.W = 0.0f;
            this.X = 0.0f;
            this.Y = 0;
            this.Z = 0;
            this.aa = 0;
            this.ab = 0;
            this.ac = 0;
            this.ad = 0;
            this.ae = 0;
            this.af = 0;
            this.ag = 1.0f;
            this.ah = 1.0f;
            this.ai = -1;
            this.aj = -1;
            this.ak = -1;
            this.al = false;
            this.am = false;
            this.an = d.k;
            this.ao = d.k;
            this.ap = false;
            this.aq = false;
            this.ar = false;
            this.as = false;
            this.at = -1;
            this.au = -1;
            this.av = -1;
            this.aw = -1;
            this.ax = -1;
            this.ay = -1;
            this.az = 0.5f;
            this.aD = new android.a.a.a.a.f();
            this.aE = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                switch (C0001a.Z.get(index)) {
                    case 1:
                        this.ak = typedArrayObtainStyledAttributes.getInt(index, this.ak);
                        break;
                    case 2:
                        this.E = typedArrayObtainStyledAttributes.getResourceId(index, this.E);
                        if (this.E == -1) {
                            this.E = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.F);
                        break;
                    case 4:
                        this.G = typedArrayObtainStyledAttributes.getFloat(index, this.G) % 360.0f;
                        if (this.G < 0.0f) {
                            this.G = (360.0f - this.G) % 360.0f;
                        }
                        break;
                    case 5:
                        this.s = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.s);
                        break;
                    case 6:
                        this.t = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.t);
                        break;
                    case 7:
                        this.u = typedArrayObtainStyledAttributes.getFloat(index, this.u);
                        break;
                    case 8:
                        this.v = typedArrayObtainStyledAttributes.getResourceId(index, this.v);
                        if (this.v == -1) {
                            this.v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        this.w = typedArrayObtainStyledAttributes.getResourceId(index, this.w);
                        if (this.w == -1) {
                            this.w = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        this.x = typedArrayObtainStyledAttributes.getResourceId(index, this.x);
                        if (this.x == -1) {
                            this.x = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        this.y = typedArrayObtainStyledAttributes.getResourceId(index, this.y);
                        if (this.y == -1) {
                            this.y = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        this.z = typedArrayObtainStyledAttributes.getResourceId(index, this.z);
                        if (this.z == -1) {
                            this.z = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        this.A = typedArrayObtainStyledAttributes.getResourceId(index, this.A);
                        if (this.A == -1) {
                            this.A = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        this.B = typedArrayObtainStyledAttributes.getResourceId(index, this.B);
                        if (this.B == -1) {
                            this.B = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        this.C = typedArrayObtainStyledAttributes.getResourceId(index, this.C);
                        if (this.C == -1) {
                            this.C = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        this.D = typedArrayObtainStyledAttributes.getResourceId(index, this.D);
                        if (this.D == -1) {
                            this.D = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        this.H = typedArrayObtainStyledAttributes.getResourceId(index, this.H);
                        if (this.H == -1) {
                            this.H = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        this.I = typedArrayObtainStyledAttributes.getResourceId(index, this.I);
                        if (this.I == -1) {
                            this.I = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        this.J = typedArrayObtainStyledAttributes.getResourceId(index, this.J);
                        if (this.J == -1) {
                            this.J = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        this.K = typedArrayObtainStyledAttributes.getResourceId(index, this.K);
                        if (this.K == -1) {
                            this.K = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 22:
                        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 23:
                        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 24:
                        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 25:
                        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 26:
                        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 27:
                        this.al = typedArrayObtainStyledAttributes.getBoolean(index, this.al);
                        break;
                    case 28:
                        this.am = typedArrayObtainStyledAttributes.getBoolean(index, this.am);
                        break;
                    case 29:
                        this.R = typedArrayObtainStyledAttributes.getFloat(index, this.R);
                        break;
                    case 30:
                        this.S = typedArrayObtainStyledAttributes.getFloat(index, this.S);
                        break;
                    case 31:
                        this.aa = typedArrayObtainStyledAttributes.getInt(index, 0);
                        if (this.aa == 1) {
                            Log.e(d.j, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        this.ab = typedArrayObtainStyledAttributes.getInt(index, 0);
                        if (this.ab == 1) {
                            Log.e(d.j, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.ac = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.ac);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.ac) == -2) {
                                this.ac = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.ae = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.ae);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.ae) == -2) {
                                this.ae = -2;
                            }
                        }
                        break;
                    case 35:
                        this.ag = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.ag));
                        break;
                    case 36:
                        try {
                            this.ad = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.ad);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.ad) == -2) {
                                this.ad = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.af = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.af);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.af) == -2) {
                                this.af = -2;
                            }
                        }
                        break;
                    case 38:
                        this.ah = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.ah));
                        break;
                    case 44:
                        this.T = typedArrayObtainStyledAttributes.getString(index);
                        this.U = Float.NaN;
                        this.V = -1;
                        if (this.T != null) {
                            int length = this.T.length();
                            int iIndexOf = this.T.indexOf(44);
                            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                i2 = 0;
                            } else {
                                String strSubstring = this.T.substring(0, iIndexOf);
                                if (strSubstring.equalsIgnoreCase("W")) {
                                    this.V = 0;
                                } else if (strSubstring.equalsIgnoreCase("H")) {
                                    this.V = 1;
                                }
                                i2 = iIndexOf + 1;
                            }
                            int iIndexOf2 = this.T.indexOf(58);
                            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                String strSubstring2 = this.T.substring(i2);
                                if (strSubstring2.length() > 0) {
                                    this.U = Float.parseFloat(strSubstring2);
                                }
                            } else {
                                String strSubstring3 = this.T.substring(i2, iIndexOf2);
                                String strSubstring4 = this.T.substring(iIndexOf2 + 1);
                                if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                    try {
                                        float f2 = Float.parseFloat(strSubstring3);
                                        float f3 = Float.parseFloat(strSubstring4);
                                        if (f2 > 0.0f && f3 > 0.0f) {
                                            if (this.V == 1) {
                                                this.U = Math.abs(f3 / f2);
                                            } else {
                                                this.U = Math.abs(f2 / f3);
                                            }
                                        }
                                    } catch (NumberFormatException unused5) {
                                    }
                                }
                            }
                        }
                        break;
                    case 45:
                        this.W = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                        break;
                    case 46:
                        this.X = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                        break;
                    case 47:
                        this.Y = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 48:
                        this.Z = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 49:
                        this.ai = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.ai);
                        break;
                    case 50:
                        this.aj = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.aj);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            b();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.s = -1;
            this.t = -1;
            this.u = -1.0f;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1;
            this.z = -1;
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = 0;
            this.G = 0.0f;
            this.H = -1;
            this.I = -1;
            this.J = -1;
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = -1;
            this.P = -1;
            this.Q = -1;
            this.R = 0.5f;
            this.S = 0.5f;
            this.T = null;
            this.U = 0.0f;
            this.V = 1;
            this.W = 0.0f;
            this.X = 0.0f;
            this.Y = 0;
            this.Z = 0;
            this.aa = 0;
            this.ab = 0;
            this.ac = 0;
            this.ad = 0;
            this.ae = 0;
            this.af = 0;
            this.ag = 1.0f;
            this.ah = 1.0f;
            this.ai = -1;
            this.aj = -1;
            this.ak = -1;
            this.al = false;
            this.am = false;
            this.an = d.k;
            this.ao = d.k;
            this.ap = false;
            this.aq = false;
            this.ar = false;
            this.as = false;
            this.at = -1;
            this.au = -1;
            this.av = -1;
            this.aw = -1;
            this.ax = -1;
            this.ay = -1;
            this.az = 0.5f;
            this.aD = new android.a.a.a.a.f();
            this.aE = false;
        }

        public void a() {
            if (this.aD != null) {
                this.aD.s();
            }
        }

        public void b() {
            this.aq = false;
            this.an = d.k;
            this.ao = d.k;
            if (this.width == -2 && this.al) {
                this.an = false;
                this.aa = 1;
            }
            if (this.height == -2 && this.am) {
                this.ao = false;
                this.ab = 1;
            }
            if (this.width == 0 || this.width == -1) {
                this.an = false;
                if (this.width == 0 && this.aa == 1) {
                    this.width = -2;
                    this.al = d.k;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.ao = false;
                if (this.height == 0 && this.ab == 1) {
                    this.height = -2;
                    this.am = d.k;
                }
            }
            if (this.u == -1.0f && this.s == -1 && this.t == -1) {
                return;
            }
            this.aq = d.k;
            this.an = d.k;
            this.ao = d.k;
            if (!(this.aD instanceof android.a.a.a.a.h)) {
                this.aD = new android.a.a.a.a.h();
            }
            ((android.a.a.a.a.h) this.aD).a(this.ak);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0050  */
        /* JADX WARN: Code duplicated, block: B:19:0x0059  */
        /* JADX WARN: Code duplicated, block: B:22:0x0062  */
        /* JADX WARN: Code duplicated, block: B:25:0x006a  */
        /* JADX WARN: Code duplicated, block: B:28:0x0072  */
        /* JADX WARN: Code duplicated, block: B:35:0x0088  */
        /* JADX WARN: Code duplicated, block: B:36:0x0092  */
        /* JADX WARN: Code duplicated, block: B:38:0x0096  */
        /* JADX WARN: Code duplicated, block: B:39:0x009f  */
        /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @TargetApi(17)
        public void resolveLayoutDirection(int i2) {
            int i3 = this.leftMargin;
            int i4 = this.rightMargin;
            super.resolveLayoutDirection(i2);
            this.av = -1;
            this.aw = -1;
            this.at = -1;
            this.au = -1;
            this.ax = -1;
            this.ay = -1;
            this.ax = this.L;
            this.ay = this.N;
            this.az = this.R;
            this.aA = this.s;
            this.aB = this.t;
            this.aC = this.u;
            boolean z = false;
            if (1 == getLayoutDirection()) {
                if (this.H != -1) {
                    this.av = this.H;
                } else if (this.I != -1) {
                    this.aw = this.I;
                } else {
                    if (this.J != -1) {
                        this.au = this.J;
                        z = true;
                    }
                    if (this.K != -1) {
                        this.at = this.K;
                        z = true;
                    }
                    if (this.P != -1) {
                        this.ay = this.P;
                    }
                    if (this.Q != -1) {
                        this.ax = this.Q;
                    }
                    if (z) {
                        this.az = 1.0f - this.R;
                    }
                    if (this.aq && this.ak == 1) {
                        if (this.u != -1.0f) {
                            this.aC = 1.0f - this.u;
                            this.aA = -1;
                            this.aB = -1;
                        } else if (this.s != -1) {
                            this.aB = this.s;
                            this.aA = -1;
                            this.aC = -1.0f;
                        } else if (this.t != -1) {
                            this.aA = this.t;
                            this.aB = -1;
                            this.aC = -1.0f;
                        }
                    }
                }
                z = true;
                if (this.J != -1) {
                    this.au = this.J;
                    z = true;
                }
                if (this.K != -1) {
                    this.at = this.K;
                    z = true;
                }
                if (this.P != -1) {
                    this.ay = this.P;
                }
                if (this.Q != -1) {
                    this.ax = this.Q;
                }
                if (z) {
                    this.az = 1.0f - this.R;
                }
                if (this.aq) {
                    if (this.u != -1.0f) {
                        this.aC = 1.0f - this.u;
                        this.aA = -1;
                        this.aB = -1;
                    } else if (this.s != -1) {
                        this.aB = this.s;
                        this.aA = -1;
                        this.aC = -1.0f;
                    } else if (this.t != -1) {
                        this.aA = this.t;
                        this.aB = -1;
                        this.aC = -1.0f;
                    }
                }
            } else {
                if (this.H != -1) {
                    this.au = this.H;
                }
                if (this.I != -1) {
                    this.at = this.I;
                }
                if (this.J != -1) {
                    this.av = this.J;
                }
                if (this.K != -1) {
                    this.aw = this.K;
                }
                if (this.P != -1) {
                    this.ax = this.P;
                }
                if (this.Q != -1) {
                    this.ay = this.Q;
                }
            }
            if (this.J == -1 && this.K == -1 && this.I == -1 && this.H == -1) {
                if (this.x != -1) {
                    this.av = this.x;
                    if (this.rightMargin <= 0 && i4 > 0) {
                        this.rightMargin = i4;
                    }
                } else if (this.y != -1) {
                    this.aw = this.y;
                    if (this.rightMargin <= 0 && i4 > 0) {
                        this.rightMargin = i4;
                    }
                }
                if (this.v != -1) {
                    this.at = this.v;
                    if (this.leftMargin > 0 || i3 <= 0) {
                        return;
                    }
                    this.leftMargin = i3;
                    return;
                }
                if (this.w != -1) {
                    this.au = this.w;
                    if (this.leftMargin > 0 || i3 <= 0) {
                        return;
                    }
                    this.leftMargin = i3;
                }
            }
        }
    }

    public d(Context context) {
        super(context);
        this.c = new SparseArray<>();
        this.m = new ArrayList<>(4);
        this.n = new ArrayList<>(100);
        this.d = new android.a.a.a.a.g();
        this.o = 0;
        this.p = 0;
        this.q = Integer.MAX_VALUE;
        this.r = Integer.MAX_VALUE;
        this.s = k;
        this.t = 3;
        this.u = null;
        this.v = -1;
        this.w = new HashMap<>();
        this.x = -1;
        this.y = -1;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        b((AttributeSet) null);
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new SparseArray<>();
        this.m = new ArrayList<>(4);
        this.n = new ArrayList<>(100);
        this.d = new android.a.a.a.a.g();
        this.o = 0;
        this.p = 0;
        this.q = Integer.MAX_VALUE;
        this.r = Integer.MAX_VALUE;
        this.s = k;
        this.t = 3;
        this.u = null;
        this.v = -1;
        this.w = new HashMap<>();
        this.x = -1;
        this.y = -1;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        b(attributeSet);
    }

    public d(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.c = new SparseArray<>();
        this.m = new ArrayList<>(4);
        this.n = new ArrayList<>(100);
        this.d = new android.a.a.a.a.g();
        this.o = 0;
        this.p = 0;
        this.q = Integer.MAX_VALUE;
        this.r = Integer.MAX_VALUE;
        this.s = k;
        this.t = 3;
        this.u = null;
        this.v = -1;
        this.w = new HashMap<>();
        this.x = -1;
        this.y = -1;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        b(attributeSet);
    }

    private void a(int i2, int i3) {
        boolean z;
        boolean z2;
        int baseline;
        int childMeasureSpec;
        int childMeasureSpec2;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                android.a.a.a.a.f fVar = aVar.aD;
                if (!aVar.aq && !aVar.ar) {
                    fVar.i(childAt.getVisibility());
                    int measuredWidth = aVar.width;
                    int measuredHeight = aVar.height;
                    if (aVar.an || aVar.ao || (!aVar.an && aVar.aa == 1) || aVar.width == -1 || (!aVar.ao && (aVar.ab == 1 || aVar.height == -1))) {
                        if (measuredWidth == 0) {
                            childMeasureSpec = getChildMeasureSpec(i2, paddingLeft, -2);
                            z = true;
                        } else if (measuredWidth == -1) {
                            childMeasureSpec = getChildMeasureSpec(i2, paddingLeft, -1);
                            z = false;
                        } else {
                            z = measuredWidth == -2;
                            childMeasureSpec = getChildMeasureSpec(i2, paddingLeft, measuredWidth);
                        }
                        if (measuredHeight == 0) {
                            z2 = true;
                            childMeasureSpec2 = getChildMeasureSpec(i3, paddingTop, -2);
                        } else if (measuredHeight == -1) {
                            childMeasureSpec2 = getChildMeasureSpec(i3, paddingTop, -1);
                            z2 = false;
                        } else {
                            z2 = measuredHeight == -2;
                            childMeasureSpec2 = getChildMeasureSpec(i3, paddingTop, measuredHeight);
                        }
                        childAt.measure(childMeasureSpec, childMeasureSpec2);
                        if (this.z != null) {
                            this.z.a++;
                        }
                        fVar.b(measuredWidth == -2 ? k : false);
                        fVar.c(measuredHeight == -2 ? k : false);
                        measuredWidth = childAt.getMeasuredWidth();
                        measuredHeight = childAt.getMeasuredHeight();
                    } else {
                        z = false;
                        z2 = false;
                    }
                    fVar.p(measuredWidth);
                    fVar.q(measuredHeight);
                    if (z) {
                        fVar.t(measuredWidth);
                    }
                    if (z2) {
                        fVar.u(measuredHeight);
                    }
                    if (aVar.ap && (baseline = childAt.getBaseline()) != -1) {
                        fVar.v(baseline);
                    }
                }
            }
        }
    }

    private final android.a.a.a.a.f b(int i2) {
        View view;
        if (i2 != 0 && (view = this.c.get(i2)) != this) {
            if (view == null) {
                return null;
            }
            return ((a) view.getLayoutParams()).aD;
        }
        return this.d;
    }

    private void b() {
        int childCount = getChildCount();
        boolean z = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (getChildAt(i2).isLayoutRequested()) {
                z = k;
                break;
            }
        }
        if (z) {
            this.n.clear();
            c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x002e  */
    private void b(int i2, int i3) {
        long j2;
        int i4;
        int i5;
        int i6;
        boolean z;
        int childMeasureSpec;
        int i7;
        boolean z2;
        int childMeasureSpec2;
        long j3;
        int baseline;
        int baseline2;
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        int i8 = 0;
        while (true) {
            j2 = 1;
            i4 = 8;
            if (i8 >= childCount) {
                break;
            }
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 8) {
                paddingTop = paddingTop;
            } else {
                a aVar = (a) childAt.getLayoutParams();
                android.a.a.a.a.f fVar = aVar.aD;
                if (aVar.aq || aVar.ar) {
                    paddingTop = paddingTop;
                } else {
                    fVar.i(childAt.getVisibility());
                    int i9 = aVar.width;
                    int i10 = aVar.height;
                    if (i9 == 0 || i10 == 0) {
                        paddingTop = paddingTop;
                        fVar.v().e();
                        fVar.w().e();
                    } else {
                        boolean z3 = i9 == -2 ? k : false;
                        int childMeasureSpec3 = getChildMeasureSpec(i2, paddingLeft, i9);
                        boolean z4 = i10 == -2 ? k : false;
                        childAt.measure(childMeasureSpec3, getChildMeasureSpec(i3, paddingTop, i10));
                        if (this.z != null) {
                            this.z.a++;
                        }
                        fVar.b(i9 == -2 ? k : false);
                        fVar.c(i10 == -2 ? k : false);
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight = childAt.getMeasuredHeight();
                        fVar.p(measuredWidth);
                        fVar.q(measuredHeight);
                        if (z3) {
                            fVar.t(measuredWidth);
                        }
                        if (z4) {
                            fVar.u(measuredHeight);
                        }
                        if (aVar.ap && (baseline2 = childAt.getBaseline()) != -1) {
                            fVar.v(baseline2);
                        }
                        if (aVar.an && aVar.ao) {
                            fVar.v().a(measuredWidth);
                            fVar.w().a(measuredHeight);
                        }
                    }
                }
            }
            i8++;
            paddingTop = paddingTop;
        }
        int i11 = paddingTop;
        this.d.aH();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() == i4) {
                i6 = i12;
                i5 = childCount;
                j3 = j2;
                i7 = i11;
            } else {
                a aVar2 = (a) childAt2.getLayoutParams();
                android.a.a.a.a.f fVar2 = aVar2.aD;
                if (aVar2.aq || aVar2.ar) {
                    i6 = i12;
                    i5 = childCount;
                    j3 = j2;
                    i7 = i11;
                } else {
                    fVar2.i(childAt2.getVisibility());
                    int iD = aVar2.width;
                    int iD2 = aVar2.height;
                    if (iD == 0 || iD2 == 0) {
                        l lVarA = fVar2.a(android.a.a.a.a.c.EnumC0000c.LEFT).a();
                        l lVarA2 = fVar2.a(android.a.a.a.a.c.EnumC0000c.RIGHT).a();
                        boolean z5 = (fVar2.a(android.a.a.a.a.c.EnumC0000c.LEFT).g() == null || fVar2.a(android.a.a.a.a.c.EnumC0000c.RIGHT).g() == null) ? false : k;
                        l lVarA3 = fVar2.a(android.a.a.a.a.c.EnumC0000c.TOP).a();
                        l lVarA4 = fVar2.a(android.a.a.a.a.c.EnumC0000c.BOTTOM).a();
                        boolean z6 = (fVar2.a(android.a.a.a.a.c.EnumC0000c.TOP).g() == null || fVar2.a(android.a.a.a.a.c.EnumC0000c.BOTTOM).g() == null) ? false : k;
                        if (iD == 0 && iD2 == 0 && z5 && z6) {
                            i6 = i12;
                            i5 = childCount;
                            i7 = i11;
                            j3 = 1;
                        } else {
                            i5 = childCount;
                            i6 = i12;
                            boolean z7 = this.d.av() != android.a.a.a.a.f.b.WRAP_CONTENT ? k : false;
                            boolean z8 = this.d.aw() != android.a.a.a.a.f.b.WRAP_CONTENT ? k : false;
                            if (!z7) {
                                fVar2.v().e();
                            }
                            if (!z8) {
                                fVar2.w().e();
                            }
                            if (iD == 0) {
                                if (z7 && fVar2.q() && z5 && lVarA.h() && lVarA2.h()) {
                                    iD = (int) (lVarA2.d() - lVarA.d());
                                    fVar2.v().a(iD);
                                    childMeasureSpec = getChildMeasureSpec(i2, paddingLeft, iD);
                                    z = false;
                                } else {
                                    childMeasureSpec = getChildMeasureSpec(i2, paddingLeft, -2);
                                    z7 = false;
                                    z = k;
                                }
                            } else if (iD == -1) {
                                childMeasureSpec = getChildMeasureSpec(i2, paddingLeft, -1);
                                z = false;
                            } else {
                                z = iD == -2 ? k : false;
                                childMeasureSpec = getChildMeasureSpec(i2, paddingLeft, iD);
                            }
                            if (iD2 != 0) {
                                i7 = i11;
                                if (iD2 == -1) {
                                    childMeasureSpec2 = getChildMeasureSpec(i3, i7, -1);
                                    z2 = false;
                                } else {
                                    z2 = iD2 == -2 ? k : false;
                                    childMeasureSpec2 = getChildMeasureSpec(i3, i7, iD2);
                                }
                            } else if (z8 && fVar2.r() && z6 && lVarA3.h() && lVarA4.h()) {
                                iD2 = (int) (lVarA4.d() - lVarA3.d());
                                fVar2.w().a(iD2);
                                i7 = i11;
                                childMeasureSpec2 = getChildMeasureSpec(i3, i7, iD2);
                                z2 = false;
                            } else {
                                i7 = i11;
                                childMeasureSpec2 = getChildMeasureSpec(i3, i7, -2);
                                z8 = false;
                                z2 = k;
                            }
                            childAt2.measure(childMeasureSpec, childMeasureSpec2);
                            if (this.z != null) {
                                j3 = 1;
                                this.z.a++;
                            } else {
                                j3 = 1;
                            }
                            fVar2.b(iD == -2 ? k : false);
                            fVar2.c(iD2 == -2 ? k : false);
                            int measuredWidth2 = childAt2.getMeasuredWidth();
                            int measuredHeight2 = childAt2.getMeasuredHeight();
                            fVar2.p(measuredWidth2);
                            fVar2.q(measuredHeight2);
                            if (z) {
                                fVar2.t(measuredWidth2);
                            }
                            if (z2) {
                                fVar2.u(measuredHeight2);
                            }
                            if (z7) {
                                fVar2.v().a(measuredWidth2);
                            } else {
                                fVar2.v().c();
                            }
                            if (z8) {
                                fVar2.w().a(measuredHeight2);
                            } else {
                                fVar2.w().c();
                            }
                            if (aVar2.ap && (baseline = childAt2.getBaseline()) != -1) {
                                fVar2.v(baseline);
                            }
                        }
                    } else {
                        i6 = i12;
                        i5 = childCount;
                        j3 = j2;
                        i7 = i11;
                    }
                }
            }
            i12 = i6 + 1;
            i11 = i7;
            j2 = j3;
            childCount = i5;
            i4 = 8;
        }
    }

    private void b(AttributeSet attributeSet) {
        this.d.a(this);
        this.c.put(getId(), this);
        this.u = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.c.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == j.c.ConstraintLayout_Layout_android_minWidth) {
                    this.o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.o);
                } else if (index == j.c.ConstraintLayout_Layout_android_minHeight) {
                    this.p = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.p);
                } else if (index == j.c.ConstraintLayout_Layout_android_maxWidth) {
                    this.q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.q);
                } else if (index == j.c.ConstraintLayout_Layout_android_maxHeight) {
                    this.r = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.r);
                } else if (index == j.c.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.t = typedArrayObtainStyledAttributes.getInt(index, this.t);
                } else if (index == j.c.ConstraintLayout_Layout_constraintSet) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        this.u = new e();
                        this.u.b(getContext(), resourceId);
                    } catch (Resources.NotFoundException unused) {
                        this.u = null;
                    }
                    this.v = resourceId;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.d.A(this.t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v0, types: [android.a.a.d] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v67 */
    private void c() {
        int i2;
        int i3;
        int i4;
        int i5;
        android.a.a.a.a.f fVarB;
        android.a.a.a.a.f fVarB2;
        android.a.a.a.a.f fVarB3;
        android.a.a.a.a.f fVarB4;
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        ?? r3 = 0;
        if (zIsInEditMode) {
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    a(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    b(childAt.getId()).c(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            android.a.a.a.a.f fVarA = a(getChildAt(i7));
            if (fVarA != null) {
                fVarA.s();
            }
        }
        if (this.v != -1) {
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt2 = getChildAt(i8);
                if (childAt2.getId() == this.v && (childAt2 instanceof f)) {
                    this.u = ((f) childAt2).getConstraintSet();
                }
            }
        }
        if (this.u != null) {
            this.u.c((d) this);
        }
        this.d.aO();
        int size = this.m.size();
        if (size > 0) {
            for (int i9 = 0; i9 < size; i9++) {
                this.m.get(i9).a((d) this);
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt3 = getChildAt(i10);
            if (childAt3 instanceof i) {
                ((i) childAt3).a((d) this);
            }
        }
        int i11 = 0;
        while (i11 < childCount) {
            View childAt4 = getChildAt(i11);
            android.a.a.a.a.f fVarA2 = a(childAt4);
            if (fVarA2 != null) {
                a aVar = (a) childAt4.getLayoutParams();
                aVar.b();
                if (aVar.aE) {
                    aVar.aE = r3;
                } else if (zIsInEditMode) {
                    try {
                        String resourceName2 = getResources().getResourceName(childAt4.getId());
                        a(r3, resourceName2, Integer.valueOf(childAt4.getId()));
                        b(childAt4.getId()).c(resourceName2.substring(resourceName2.indexOf("id/") + 3));
                    } catch (Resources.NotFoundException unused2) {
                    }
                }
                fVarA2.i(childAt4.getVisibility());
                if (aVar.as) {
                    fVarA2.i(8);
                }
                fVarA2.a(childAt4);
                this.d.f(fVarA2);
                if (!aVar.ao || !aVar.an) {
                    this.n.add(fVarA2);
                }
                if (aVar.aq) {
                    android.a.a.a.a.h hVar = (android.a.a.a.a.h) fVarA2;
                    int i12 = aVar.aA;
                    int i13 = aVar.aB;
                    float f = aVar.aC;
                    if (Build.VERSION.SDK_INT < 17) {
                        i12 = aVar.s;
                        i13 = aVar.t;
                        f = aVar.u;
                    }
                    if (f != -1.0f) {
                        hVar.e(f);
                    } else if (i12 != -1) {
                        hVar.e(i12);
                    } else if (i13 != -1) {
                        hVar.f(i13);
                    }
                } else if (aVar.v != -1 || aVar.w != -1 || aVar.x != -1 || aVar.y != -1 || aVar.I != -1 || aVar.H != -1 || aVar.J != -1 || aVar.K != -1 || aVar.z != -1 || aVar.A != -1 || aVar.B != -1 || aVar.C != -1 || aVar.D != -1 || aVar.ai != -1 || aVar.aj != -1 || aVar.E != -1 || aVar.width == -1 || aVar.height == -1) {
                    int i14 = aVar.at;
                    int i15 = aVar.au;
                    int i16 = aVar.av;
                    int i17 = aVar.aw;
                    int i18 = aVar.ax;
                    int i19 = aVar.ay;
                    float f2 = aVar.az;
                    if (Build.VERSION.SDK_INT < 17) {
                        int i20 = aVar.v;
                        int i21 = aVar.w;
                        i16 = aVar.x;
                        i17 = aVar.y;
                        int i22 = aVar.L;
                        int i23 = aVar.N;
                        f2 = aVar.R;
                        if (i20 == -1 && i21 == -1) {
                            if (aVar.I != -1) {
                                i20 = aVar.I;
                            } else if (aVar.H != -1) {
                                i21 = aVar.H;
                            }
                        }
                        int i24 = i21;
                        i14 = i20;
                        i2 = i24;
                        if (i16 == -1 && i17 == -1) {
                            if (aVar.J != -1) {
                                i16 = aVar.J;
                            } else if (aVar.K != -1) {
                                i17 = aVar.K;
                            }
                        }
                        i4 = i22;
                        i3 = i23;
                    } else {
                        i2 = i15;
                        i3 = i19;
                        i4 = i18;
                    }
                    int i25 = i17;
                    float f3 = f2;
                    int i26 = i16;
                    if (aVar.E != -1) {
                        android.a.a.a.a.f fVarB5 = b(aVar.E);
                        if (fVarB5 != null) {
                            fVarA2.a(fVarB5, aVar.G, aVar.F);
                        }
                    } else {
                        if (i14 != -1) {
                            android.a.a.a.a.f fVarB6 = b(i14);
                            if (fVarB6 != null) {
                                fVarA2.a(android.a.a.a.a.c.EnumC0000c.LEFT, fVarB6, android.a.a.a.a.c.EnumC0000c.LEFT, aVar.leftMargin, i4);
                            }
                            i5 = i25;
                        } else {
                            f3 = f3;
                            i5 = i25;
                            if (i2 != -1 && (fVarB = b(i2)) != null) {
                                fVarA2.a(android.a.a.a.a.c.EnumC0000c.LEFT, fVarB, android.a.a.a.a.c.EnumC0000c.RIGHT, aVar.leftMargin, i4);
                            }
                        }
                        if (i26 != -1) {
                            android.a.a.a.a.f fVarB7 = b(i26);
                            if (fVarB7 != null) {
                                fVarA2.a(android.a.a.a.a.c.EnumC0000c.RIGHT, fVarB7, android.a.a.a.a.c.EnumC0000c.LEFT, aVar.rightMargin, i3);
                            }
                        } else if (i5 != -1 && (fVarB2 = b(i5)) != null) {
                            fVarA2.a(android.a.a.a.a.c.EnumC0000c.RIGHT, fVarB2, android.a.a.a.a.c.EnumC0000c.RIGHT, aVar.rightMargin, i3);
                        }
                        if (aVar.z != -1) {
                            android.a.a.a.a.f fVarB8 = b(aVar.z);
                            if (fVarB8 != null) {
                                fVarA2.a(android.a.a.a.a.c.EnumC0000c.TOP, fVarB8, android.a.a.a.a.c.EnumC0000c.TOP, aVar.topMargin, aVar.M);
                            }
                        } else if (aVar.A != -1 && (fVarB3 = b(aVar.A)) != null) {
                            fVarA2.a(android.a.a.a.a.c.EnumC0000c.TOP, fVarB3, android.a.a.a.a.c.EnumC0000c.BOTTOM, aVar.topMargin, aVar.M);
                        }
                        if (aVar.B != -1) {
                            android.a.a.a.a.f fVarB9 = b(aVar.B);
                            if (fVarB9 != null) {
                                fVarA2.a(android.a.a.a.a.c.EnumC0000c.BOTTOM, fVarB9, android.a.a.a.a.c.EnumC0000c.TOP, aVar.bottomMargin, aVar.O);
                            }
                        } else if (aVar.C != -1 && (fVarB4 = b(aVar.C)) != null) {
                            fVarA2.a(android.a.a.a.a.c.EnumC0000c.BOTTOM, fVarB4, android.a.a.a.a.c.EnumC0000c.BOTTOM, aVar.bottomMargin, aVar.O);
                        }
                        if (aVar.D != -1) {
                            View view = this.c.get(aVar.D);
                            android.a.a.a.a.f fVarB10 = b(aVar.D);
                            if (fVarB10 != null && view != null && (view.getLayoutParams() instanceof a)) {
                                a aVar2 = (a) view.getLayoutParams();
                                aVar.ap = k;
                                aVar2.ap = k;
                                fVarA2.a(android.a.a.a.a.c.EnumC0000c.BASELINE).a(fVarB10.a(android.a.a.a.a.c.EnumC0000c.BASELINE), 0, -1, android.a.a.a.a.c.b.STRONG, 0, k);
                                fVarA2.a(android.a.a.a.a.c.EnumC0000c.TOP).j();
                                fVarA2.a(android.a.a.a.a.c.EnumC0000c.BOTTOM).j();
                            }
                        }
                        float f4 = f3;
                        if (f4 >= 0.0f && f4 != 0.5f) {
                            fVarA2.a(f4);
                        }
                        if (aVar.S >= 0.0f && aVar.S != 0.5f) {
                            fVarA2.b(aVar.S);
                        }
                    }
                    if (zIsInEditMode && (aVar.ai != -1 || aVar.aj != -1)) {
                        fVarA2.b(aVar.ai, aVar.aj);
                    }
                    if (aVar.an) {
                        fVarA2.a(android.a.a.a.a.f.b.FIXED);
                        fVarA2.p(aVar.width);
                    } else if (aVar.width == -1) {
                        fVarA2.a(android.a.a.a.a.f.b.MATCH_PARENT);
                        fVarA2.a(android.a.a.a.a.c.EnumC0000c.LEFT).g = aVar.leftMargin;
                        fVarA2.a(android.a.a.a.a.c.EnumC0000c.RIGHT).g = aVar.rightMargin;
                    } else {
                        fVarA2.a(android.a.a.a.a.f.b.MATCH_CONSTRAINT);
                        fVarA2.p(0);
                    }
                    if (aVar.ao) {
                        r3 = 0;
                        fVarA2.b(android.a.a.a.a.f.b.FIXED);
                        fVarA2.q(aVar.height);
                    } else if (aVar.height == -1) {
                        fVarA2.b(android.a.a.a.a.f.b.MATCH_PARENT);
                        fVarA2.a(android.a.a.a.a.c.EnumC0000c.TOP).g = aVar.topMargin;
                        fVarA2.a(android.a.a.a.a.c.EnumC0000c.BOTTOM).g = aVar.bottomMargin;
                        r3 = 0;
                    } else {
                        fVarA2.b(android.a.a.a.a.f.b.MATCH_CONSTRAINT);
                        r3 = 0;
                        fVarA2.q(0);
                    }
                    if (aVar.T != null) {
                        fVarA2.d(aVar.T);
                    }
                    fVarA2.c(aVar.W);
                    fVarA2.d(aVar.X);
                    fVarA2.x(aVar.Y);
                    fVarA2.y(aVar.Z);
                    fVarA2.a(aVar.aa, aVar.ac, aVar.ae, aVar.ag);
                    fVarA2.b(aVar.ab, aVar.ad, aVar.af, aVar.ah);
                }
            }
            i11++;
            r3 = r3;
        }
    }

    private void c(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        android.a.a.a.a.f.b bVar = android.a.a.a.a.f.b.FIXED;
        android.a.a.a.a.f.b bVar2 = android.a.a.a.a.f.b.FIXED;
        getLayoutParams();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                bVar = android.a.a.a.a.f.b.WRAP_CONTENT;
            } else if (mode == 1073741824) {
                size = Math.min(this.q, size) - paddingLeft;
            }
            size = 0;
        } else {
            bVar = android.a.a.a.a.f.b.WRAP_CONTENT;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                bVar2 = android.a.a.a.a.f.b.WRAP_CONTENT;
            } else if (mode2 == 1073741824) {
                size2 = Math.min(this.r, size2) - paddingTop;
            }
            size2 = 0;
        } else {
            bVar2 = android.a.a.a.a.f.b.WRAP_CONTENT;
        }
        this.d.r(0);
        this.d.s(0);
        this.d.a(bVar);
        this.d.p(size);
        this.d.b(bVar2);
        this.d.q(size2);
        this.d.r((this.o - getPaddingLeft()) - getPaddingRight());
        this.d.s((this.p - getPaddingTop()) - getPaddingBottom());
    }

    private void d() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof i) {
                ((i) childAt).b(this);
            }
        }
        int size = this.m.size();
        if (size > 0) {
            for (int i3 = 0; i3 < size; i3++) {
                this.m.get(i3).c(this);
            }
        }
    }

    public final android.a.a.a.a.f a(View view) {
        if (view == this) {
            return this.d;
        }
        if (view == null) {
            return null;
        }
        return ((a) view.getLayoutParams()).aD;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public View a(int i2) {
        return this.c.get(i2);
    }

    public Object a(int i2, Object obj) {
        if (i2 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if (this.w == null || !this.w.containsKey(str)) {
            return null;
        }
        return this.w.get(str);
    }

    public void a(int i2, Object obj, Object obj2) {
        if (i2 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.w == null) {
                this.w = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.w.put(strSubstring, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public void a(android.a.a.a.g gVar) {
        this.z = gVar;
        this.d.a(gVar);
    }

    protected void a(String str) {
        this.d.aF();
        if (this.z != null) {
            this.z.c++;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(com.yftech.service.main.c.a.b.a);
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int getMaxHeight() {
        return this.r;
    }

    public int getMaxWidth() {
        return this.q;
    }

    public int getMinHeight() {
        return this.p;
    }

    public int getMinWidth() {
        return this.o;
    }

    public int getOptimizationLevel() {
        return this.d.aB();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            a aVar = (a) childAt.getLayoutParams();
            android.a.a.a.a.f fVar = aVar.aD;
            if ((childAt.getVisibility() != 8 || aVar.aq || aVar.ar || zIsInEditMode) && !aVar.as) {
                int iS = fVar.S();
                int iT = fVar.T();
                int iM = fVar.M() + iS;
                int iQ = fVar.Q() + iT;
                childAt.layout(iS, iT, iM, iQ);
                if ((childAt instanceof i) && (content = ((i) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iS, iT, iM, iQ);
                }
            }
        }
        int size = this.m.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                this.m.get(i7).b(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int i4;
        boolean z;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int baseline;
        int i8;
        System.currentTimeMillis();
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (this.x != -1) {
            int i9 = this.y;
        }
        if (mode == 1073741824 && mode2 == 1073741824 && size == this.x) {
            int i10 = this.y;
        }
        boolean z3 = mode == this.g && mode2 == this.h;
        if (z3 && size == this.e) {
            int i11 = this.f;
        }
        if (z3 && mode == Integer.MIN_VALUE && mode2 == 1073741824 && size >= this.x) {
            int i12 = this.y;
        }
        if (z3 && mode == 1073741824 && mode2 == Integer.MIN_VALUE && size == this.x) {
            int i13 = this.y;
        }
        this.g = mode;
        this.h = mode2;
        this.e = size;
        this.f = size2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        this.d.j(paddingLeft);
        this.d.k(paddingTop);
        this.d.g(this.q);
        this.d.h(this.r);
        if (Build.VERSION.SDK_INT >= 17) {
            this.d.d(getLayoutDirection() == 1);
        }
        c(i2, i3);
        int iM = this.d.M();
        int iQ = this.d.Q();
        if (this.s) {
            this.s = false;
            b();
        }
        boolean z4 = (this.t & 8) == 8;
        if (z4) {
            this.d.aG();
            this.d.h(iM, iQ);
            b(i2, i3);
        } else {
            a(i2, i3);
        }
        d();
        if (getChildCount() > 0) {
            a("First pass");
        }
        int size3 = this.n.size();
        int paddingBottom = paddingTop + getPaddingBottom();
        int paddingRight = paddingLeft + getPaddingRight();
        if (size3 > 0) {
            boolean z5 = this.d.av() == android.a.a.a.a.f.b.WRAP_CONTENT;
            boolean z6 = this.d.aw() == android.a.a.a.a.f.b.WRAP_CONTENT ? k : false;
            int iMax = Math.max(this.d.M(), this.o);
            int iMax2 = Math.max(this.d.Q(), this.p);
            int iMax3 = iMax;
            int i14 = 0;
            boolean z7 = false;
            int iCombineMeasuredStates = 0;
            while (i14 < size3) {
                android.a.a.a.a.f fVar = this.n.get(i14);
                View view = (View) fVar.ak();
                if (view == null) {
                    i7 = iM;
                    i6 = iQ;
                    i5 = size3;
                } else {
                    i5 = size3;
                    a aVar = (a) view.getLayoutParams();
                    i6 = iQ;
                    if (aVar.ar || aVar.aq) {
                        i7 = iM;
                    } else {
                        i7 = iM;
                        if (view.getVisibility() != 8 && (!z4 || !fVar.v().h() || !fVar.w().h())) {
                            view.measure((aVar.width == -2 && aVar.an) ? getChildMeasureSpec(i2, paddingRight, aVar.width) : View.MeasureSpec.makeMeasureSpec(fVar.M(), 1073741824), (aVar.height == -2 && aVar.ao) ? getChildMeasureSpec(i3, paddingBottom, aVar.height) : View.MeasureSpec.makeMeasureSpec(fVar.Q(), 1073741824));
                            if (this.z != null) {
                                this.z.b++;
                            }
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            if (measuredWidth != fVar.M()) {
                                fVar.p(measuredWidth);
                                if (z4) {
                                    fVar.v().a(measuredWidth);
                                }
                                if (z5 && fVar.ae() > iMax3) {
                                    iMax3 = Math.max(iMax3, fVar.ae() + fVar.a(android.a.a.a.a.c.EnumC0000c.RIGHT).e());
                                }
                                z7 = k;
                            }
                            if (measuredHeight != fVar.Q()) {
                                fVar.q(measuredHeight);
                                if (z4) {
                                    fVar.w().a(measuredHeight);
                                }
                                if (z6) {
                                    i8 = iMax2;
                                    if (fVar.af() > i8) {
                                        iMax2 = Math.max(i8, fVar.af() + fVar.a(android.a.a.a.a.c.EnumC0000c.BOTTOM).e());
                                    }
                                    z7 = k;
                                } else {
                                    i8 = iMax2;
                                }
                                iMax2 = i8;
                                z7 = k;
                            }
                            if (aVar.ap && (baseline = view.getBaseline()) != -1 && baseline != fVar.aj()) {
                                fVar.v(baseline);
                                z7 = k;
                            }
                            if (Build.VERSION.SDK_INT >= 11) {
                                iCombineMeasuredStates = combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                            }
                        }
                        i14++;
                        size3 = i5;
                        iQ = i6;
                        iM = i7;
                    }
                }
                iMax2 = iMax2;
                iCombineMeasuredStates = iCombineMeasuredStates;
                i14++;
                size3 = i5;
                iQ = i6;
                iM = i7;
            }
            int i15 = iM;
            int i16 = iQ;
            int i17 = size3;
            int i18 = iMax2;
            i4 = iCombineMeasuredStates;
            if (z7) {
                this.d.p(i15);
                this.d.q(i16);
                if (z4) {
                    this.d.aH();
                }
                a("2nd pass");
                if (this.d.M() < iMax3) {
                    this.d.p(iMax3);
                    z = k;
                } else {
                    z = false;
                }
                if (this.d.Q() < i18) {
                    this.d.q(i18);
                    z2 = k;
                } else {
                    z2 = z;
                }
                if (z2) {
                    a("3rd pass");
                }
            }
            for (int i19 = 0; i19 < i17; i19++) {
                android.a.a.a.a.f fVar2 = this.n.get(i19);
                View view2 = (View) fVar2.ak();
                if (view2 != null && (view2.getMeasuredWidth() != fVar2.M() || view2.getMeasuredHeight() != fVar2.Q())) {
                    view2.measure(View.MeasureSpec.makeMeasureSpec(fVar2.M(), 1073741824), View.MeasureSpec.makeMeasureSpec(fVar2.Q(), 1073741824));
                    if (this.z != null) {
                        this.z.b++;
                    }
                }
            }
        } else {
            i4 = 0;
        }
        int iM2 = this.d.M() + paddingRight;
        int iQ2 = this.d.Q() + paddingBottom;
        if (Build.VERSION.SDK_INT < 11) {
            setMeasuredDimension(iM2, iQ2);
            this.x = iM2;
            this.y = iQ2;
            return;
        }
        int iResolveSizeAndState = resolveSizeAndState(iM2, i2, i4);
        int iResolveSizeAndState2 = resolveSizeAndState(iQ2, i3, i4 << 16) & 16777215;
        int iMin = Math.min(this.q, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.r, iResolveSizeAndState2);
        if (this.d.aC()) {
            iMin |= 16777216;
        }
        if (this.d.aD()) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.x = iMin;
        this.y = iMin2;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        android.a.a.a.a.f fVarA = a(view);
        if ((view instanceof h) && !(fVarA instanceof android.a.a.a.a.h)) {
            a aVar = (a) view.getLayoutParams();
            aVar.aD = new android.a.a.a.a.h();
            aVar.aq = k;
            ((android.a.a.a.a.h) aVar.aD).a(aVar.ak);
        }
        if (view instanceof c) {
            c cVar = (c) view;
            cVar.a();
            ((a) view.getLayoutParams()).ar = k;
            if (!this.m.contains(cVar)) {
                this.m.add(cVar);
            }
        }
        this.c.put(view.getId(), view);
        this.s = k;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.c.remove(view.getId());
        android.a.a.a.a.f fVarA = a(view);
        this.d.g(fVarA);
        this.m.remove(view);
        this.n.remove(fVarA);
        this.s = k;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        this.s = k;
        this.x = -1;
        this.y = -1;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
    }

    public void setConstraintSet(e eVar) {
        this.u = eVar;
    }

    @Override // android.view.View
    public void setId(int i2) {
        this.c.remove(getId());
        super.setId(i2);
        this.c.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 == this.r) {
            return;
        }
        this.r = i2;
        requestLayout();
    }

    public void setMaxWidth(int i2) {
        if (i2 == this.q) {
            return;
        }
        this.q = i2;
        requestLayout();
    }

    public void setMinHeight(int i2) {
        if (i2 == this.p) {
            return;
        }
        this.p = i2;
        requestLayout();
    }

    public void setMinWidth(int i2) {
        if (i2 == this.o) {
            return;
        }
        this.o = i2;
        requestLayout();
    }

    public void setOptimizationLevel(int i2) {
        this.d.A(i2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
