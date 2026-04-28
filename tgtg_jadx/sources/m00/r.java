package m00;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r f28693e = new r(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f28694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f28695d;

    public r(Object[] objArr, int i11) {
        this.f28694c = objArr;
        this.f28695d = i11;
    }

    @Override // m00.n
    public final Object[] b() {
        return this.f28694c;
    }

    @Override // m00.n
    public final int c() {
        return 0;
    }

    @Override // m00.n
    public final int d() {
        return this.f28695d;
    }

    @Override // m00.n
    public final boolean e() {
        return false;
    }

    @Override // m00.q, m00.n
    public final int g(Object[] objArr) {
        Object[] objArr2 = this.f28694c;
        int i11 = this.f28695d;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        xz.b.O(i11, this.f28695d);
        Object obj = this.f28694c[i11];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28695d;
    }
}
