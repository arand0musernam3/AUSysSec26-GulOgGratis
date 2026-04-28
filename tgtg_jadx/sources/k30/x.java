package k30;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f25926e = new x(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f25927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f25928d;

    public x(Object[] objArr, int i11) {
        this.f25927c = objArr;
        this.f25928d = i11;
    }

    @Override // k30.h, k30.b
    public final int c(Object[] objArr) {
        Object[] objArr2 = this.f25927c;
        int i11 = this.f25928d;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // k30.b
    public final Object[] d() {
        return this.f25927c;
    }

    @Override // k30.b
    public final int e() {
        return this.f25928d;
    }

    @Override // k30.b
    public final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        na0.a.Z(i11, this.f25928d);
        Object obj = this.f25927c[i11];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // k30.b
    public final boolean h() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25928d;
    }

    @Override // k30.h, k30.b
    public Object writeReplace() {
        return super.writeReplace();
    }
}
