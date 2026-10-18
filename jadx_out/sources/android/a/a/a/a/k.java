package android.a.a.a.a;

/* JADX INFO: loaded from: classes.dex */
public class k {
    public int a;
    public int b;
    public int c;
    public int d;

    public int a() {
        return (this.a + this.c) / 2;
    }

    void a(int i, int i2) {
        this.a -= i;
        this.b -= i2;
        this.c += i * 2;
        this.d += i2 * 2;
    }

    public void a(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    boolean a(k kVar) {
        return this.a >= kVar.a && this.a < kVar.a + kVar.c && this.b >= kVar.b && this.b < kVar.b + kVar.d;
    }

    public int b() {
        return (this.b + this.d) / 2;
    }

    public boolean b(int i, int i2) {
        return i >= this.a && i < this.a + this.c && i2 >= this.b && i2 < this.b + this.d;
    }
}
