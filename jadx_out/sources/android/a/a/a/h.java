package android.a.a.a;

/* JADX INFO: loaded from: classes.dex */
final class h {
    private static final boolean a = false;

    interface a<T> {
        T a();

        void a(T[] tArr, int i);

        boolean a(T t);
    }

    static class b<T> implements a<T> {
        private final Object[] a;
        private int b;

        b(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.a = new Object[i];
        }

        private boolean b(T t) {
            for (int i = 0; i < this.b; i++) {
                if (this.a[i] == t) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.a.a.a.h.a
        public T a() {
            if (this.b <= 0) {
                return null;
            }
            int i = this.b - 1;
            T t = (T) this.a[i];
            this.a[i] = null;
            this.b--;
            return t;
        }

        @Override // android.a.a.a.h.a
        public void a(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                if (this.b < this.a.length) {
                    this.a[this.b] = t;
                    this.b++;
                }
            }
        }

        @Override // android.a.a.a.h.a
        public boolean a(T t) {
            if (this.b >= this.a.length) {
                return false;
            }
            this.a[this.b] = t;
            this.b++;
            return true;
        }
    }

    private h() {
    }
}
