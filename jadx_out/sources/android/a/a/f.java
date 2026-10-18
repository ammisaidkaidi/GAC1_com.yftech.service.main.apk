package android.a.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class f extends ViewGroup {
    public static final String a = "Constraints";
    e b;

    public static class a extends d.a {
        public float aF;
        public boolean aG;
        public float aH;
        public float aI;
        public float aJ;
        public float aK;
        public float aL;
        public float aM;
        public float aN;
        public float aO;
        public float aP;
        public float aQ;
        public float aR;

        public a(int i, int i2) {
            super(i, i2);
            this.aF = 1.0f;
            this.aG = false;
            this.aH = 0.0f;
            this.aI = 0.0f;
            this.aJ = 0.0f;
            this.aK = 0.0f;
            this.aL = 1.0f;
            this.aM = 1.0f;
            this.aN = 0.0f;
            this.aO = 0.0f;
            this.aP = 0.0f;
            this.aQ = 0.0f;
            this.aR = 0.0f;
        }

        public a(a aVar) {
            super((d.a) aVar);
            this.aF = 1.0f;
            this.aG = false;
            this.aH = 0.0f;
            this.aI = 0.0f;
            this.aJ = 0.0f;
            this.aK = 0.0f;
            this.aL = 1.0f;
            this.aM = 1.0f;
            this.aN = 0.0f;
            this.aO = 0.0f;
            this.aP = 0.0f;
            this.aQ = 0.0f;
            this.aR = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.aF = 1.0f;
            this.aG = false;
            this.aH = 0.0f;
            this.aI = 0.0f;
            this.aJ = 0.0f;
            this.aK = 0.0f;
            this.aL = 1.0f;
            this.aM = 1.0f;
            this.aN = 0.0f;
            this.aO = 0.0f;
            this.aP = 0.0f;
            this.aQ = 0.0f;
            this.aR = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.ConstraintSet);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == j.c.ConstraintSet_android_alpha) {
                    this.aF = typedArrayObtainStyledAttributes.getFloat(index, this.aF);
                } else if (index == j.c.ConstraintSet_android_elevation) {
                    this.aH = typedArrayObtainStyledAttributes.getFloat(index, this.aH);
                    this.aG = true;
                } else if (index == j.c.ConstraintSet_android_rotationX) {
                    this.aJ = typedArrayObtainStyledAttributes.getFloat(index, this.aJ);
                } else if (index == j.c.ConstraintSet_android_rotationY) {
                    this.aK = typedArrayObtainStyledAttributes.getFloat(index, this.aK);
                } else if (index == j.c.ConstraintSet_android_rotation) {
                    this.aI = typedArrayObtainStyledAttributes.getFloat(index, this.aI);
                } else if (index == j.c.ConstraintSet_android_scaleX) {
                    this.aL = typedArrayObtainStyledAttributes.getFloat(index, this.aL);
                } else if (index == j.c.ConstraintSet_android_scaleY) {
                    this.aM = typedArrayObtainStyledAttributes.getFloat(index, this.aM);
                } else if (index == j.c.ConstraintSet_android_transformPivotX) {
                    this.aN = typedArrayObtainStyledAttributes.getFloat(index, this.aN);
                } else if (index == j.c.ConstraintSet_android_transformPivotY) {
                    this.aO = typedArrayObtainStyledAttributes.getFloat(index, this.aO);
                } else if (index == j.c.ConstraintSet_android_translationX) {
                    this.aP = typedArrayObtainStyledAttributes.getFloat(index, this.aP);
                } else if (index == j.c.ConstraintSet_android_translationY) {
                    this.aQ = typedArrayObtainStyledAttributes.getFloat(index, this.aQ);
                } else if (index == j.c.ConstraintSet_android_translationZ) {
                    this.aP = typedArrayObtainStyledAttributes.getFloat(index, this.aR);
                }
            }
        }
    }

    public f(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(attributeSet);
        super.setVisibility(8);
    }

    public f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(attributeSet);
        super.setVisibility(8);
    }

    private void b(AttributeSet attributeSet) {
        Log.v(a, " ################# init");
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

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new d.a(layoutParams);
    }

    public e getConstraintSet() {
        if (this.b == null) {
            this.b = new e();
        }
        this.b.a(this);
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
