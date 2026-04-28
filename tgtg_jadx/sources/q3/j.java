package q3;

import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f35980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f35981f;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public j(Object[] objArr, int i11, int i12, int i13) {
        super(i11, i12, 0);
        this.f35979d = i13;
        Object[] objArr2 = new Object[i13];
        this.f35980e = objArr2;
        ?? r52 = i11 == i12 ? 1 : 0;
        this.f35981f = r52;
        objArr2[0] = objArr;
        b(i11 - r52, 1);
    }

    public final Object a() {
        int i11 = this.f35953b & 31;
        Object obj = this.f35980e[this.f35979d - 1];
        obj.getClass();
        return ((Object[]) obj)[i11];
    }

    public final void b(int i11, int i12) {
        int i13 = (this.f35979d - i12) * 5;
        while (i12 < this.f35979d) {
            Object[] objArr = this.f35980e;
            Object obj = objArr[i12 - 1];
            obj.getClass();
            objArr[i12] = ((Object[]) obj)[jf.e.H(i11, i13)];
            i13 -= 5;
            i12++;
        }
    }

    public final void d(int i11) {
        int i12 = 0;
        while (jf.e.H(this.f35953b, i12) == i11) {
            i12 += 5;
        }
        if (i12 > 0) {
            b(this.f35953b, ((this.f35979d - 1) - (i12 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            i1.c();
            return null;
        }
        Object objA = a();
        int i11 = this.f35953b + 1;
        this.f35953b = i11;
        if (i11 == this.f35954c) {
            this.f35981f = true;
            return objA;
        }
        d(0);
        return objA;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            i1.c();
            return null;
        }
        this.f35953b--;
        if (this.f35981f) {
            this.f35981f = false;
            return a();
        }
        d(31);
        return a();
    }
}
