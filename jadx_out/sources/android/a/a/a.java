package android.a.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class a extends c {
    public static final int a = 0;
    public static final int b = 2;
    public static final int c = 1;
    public static final int d = 3;
    public static final int e = 5;
    public static final int f = 6;
    private int l;
    private int m;
    private android.a.a.a.a.a n;

    public a(Context context) {
        super(context);
        this.l = 0;
        this.m = 0;
        super.setVisibility(8);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = 0;
        this.m = 0;
        super.setVisibility(8);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = 0;
        this.m = 0;
        super.setVisibility(8);
    }

    @Override // android.a.a.c
    protected void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        this.n = new android.a.a.a.a.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.c.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == j.c.ConstraintLayout_Layout_barrierDirection) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == j.c.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.n.a(typedArrayObtainStyledAttributes.getBoolean(index, true));
                }
            }
        }
        this.j = this.n;
        a();
    }

    public int getType() {
        return this.l;
    }

    public void setType(int i) {
        this.l = i;
        this.m = i;
        if (Build.VERSION.SDK_INT >= 17) {
            if (1 == getResources().getConfiguration().getLayoutDirection()) {
                if (this.l == 5) {
                    this.m = 1;
                } else if (this.l == 6) {
                    this.m = 0;
                }
            } else if (this.l == 5) {
                this.m = 0;
            } else if (this.l == 6) {
                this.m = 1;
            }
        } else if (this.l == 5) {
            this.m = 0;
        } else if (this.l == 6) {
            this.m = 1;
        }
        this.n.a(this.m);
    }
}
