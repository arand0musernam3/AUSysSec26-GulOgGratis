package k30;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f25876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f25877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f25878e;

    public b0(Object[] objArr, int i11, int i12) {
        this.f25876c = objArr;
        this.f25877d = i11;
        this.f25878e = i12;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        na0.a.Z(i11, this.f25878e);
        Object obj = this.f25876c[(i11 * 2) + this.f25877d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // k30.b
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25878e;
    }

    @Override // k30.h, k30.b
    public Object writeReplace() {
        return super.writeReplace();
    }
}
