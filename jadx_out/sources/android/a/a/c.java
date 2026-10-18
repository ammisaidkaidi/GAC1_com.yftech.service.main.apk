package android.a.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends View {
    private String a;
    protected int[] g;
    protected int h;
    protected Context i;
    protected android.a.a.a.a.i j;
    protected boolean k;

    public c(Context context) {
        super(context);
        this.g = new int[32];
        this.h = 0;
        this.j = null;
        this.k = false;
        this.i = context;
        a((AttributeSet) null);
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new int[32];
        this.h = 0;
        this.j = null;
        this.k = false;
        this.i = context;
        a(attributeSet);
    }

    public c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new int[32];
        this.h = 0;
        this.j = null;
        this.k = false;
        this.i = context;
        a(attributeSet);
    }

    private void a(String str) {
        int iIntValue;
        Object objA;
        if (str == null || this.i == null) {
            return;
        }
        String strTrim = str.trim();
        try {
            iIntValue = j.b.class.getField(strTrim).getInt(null);
        } catch (Exception unused) {
            iIntValue = 0;
        }
        if (iIntValue == 0) {
            iIntValue = this.i.getResources().getIdentifier(strTrim, "id", this.i.getPackageName());
        }
        if (iIntValue == 0 && isInEditMode() && (getParent() instanceof d) && (objA = ((d) getParent()).a(0, strTrim)) != null && (objA instanceof Integer)) {
            iIntValue = ((Integer) objA).intValue();
        }
        if (iIntValue != 0) {
            setTag(iIntValue, null);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    private void setIds(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                a(str.substring(i));
                return;
            } else {
                a(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void a() {
        if (this.j == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof d.a) {
            ((d.a) layoutParams).aD = this.j;
        }
    }

    public void a(d dVar) {
        if (isInEditMode()) {
            setIds(this.a);
        }
        if (this.j == null) {
            return;
        }
        this.j.e();
        for (int i = 0; i < this.h; i++) {
            View viewFindViewById = dVar.findViewById(this.g[i]);
            if (viewFindViewById != null) {
                this.j.f(dVar.a(viewFindViewById));
            }
        }
    }

    protected void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.c.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == j.c.ConstraintLayout_Layout_constraint_referenced_ids) {
                    this.a = typedArrayObtainStyledAttributes.getString(index);
                    setIds(this.a);
                }
            }
        }
    }

    public void b(d dVar) {
    }

    public void c(d dVar) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.g, this.h);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.k) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.h = 0;
        for (int i : iArr) {
            setTag(i, null);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        if (this.h + 1 > this.g.length) {
            this.g = Arrays.copyOf(this.g, this.g.length * 2);
        }
        this.g[this.h] = i;
        this.h++;
    }
}
