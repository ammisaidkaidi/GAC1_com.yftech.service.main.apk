package android.a.a.a.a;

/* JADX INFO: loaded from: classes.dex */
public class d extends g {
    private a a;

    public enum a {
        BEGIN,
        MIDDLE,
        END,
        TOP,
        VERTICAL_MIDDLE,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public d() {
        this.a = a.MIDDLE;
    }

    public d(int i, int i2) {
        super(i, i2);
        this.a = a.MIDDLE;
    }

    public d(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.a = a.MIDDLE;
    }

    @Override // android.a.a.a.a.f
    public void a(android.a.a.a.f fVar) {
        if (this.aT.size() != 0) {
            int i = 0;
            int size = this.aT.size();
            f fVar2 = this;
            while (i < size) {
                f fVar3 = this.aT.get(i);
                if (fVar2 != this) {
                    fVar3.a(c.EnumC0000c.LEFT, fVar2, c.EnumC0000c.RIGHT);
                    fVar2.a(c.EnumC0000c.RIGHT, fVar3, c.EnumC0000c.LEFT);
                } else {
                    c.b bVar = c.b.STRONG;
                    if (this.a == a.END) {
                        bVar = c.b.WEAK;
                    }
                    fVar3.a(c.EnumC0000c.LEFT, fVar2, c.EnumC0000c.LEFT, 0, bVar);
                }
                fVar3.a(c.EnumC0000c.TOP, this, c.EnumC0000c.TOP);
                fVar3.a(c.EnumC0000c.BOTTOM, this, c.EnumC0000c.BOTTOM);
                i++;
                fVar2 = fVar3;
            }
            if (fVar2 != this) {
                c.b bVar2 = c.b.STRONG;
                if (this.a == a.BEGIN) {
                    bVar2 = c.b.WEAK;
                }
                f fVar4 = fVar2;
                fVar4.a(c.EnumC0000c.RIGHT, this, c.EnumC0000c.RIGHT, 0, bVar2);
            }
        }
        super.a(fVar);
    }
}
