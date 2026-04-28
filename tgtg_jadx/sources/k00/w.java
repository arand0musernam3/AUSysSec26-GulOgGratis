package k00;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w f25698e = new w(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f25699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f25700d;

    public w(Object[] objArr, int i11) {
        this.f25699c = objArr;
        this.f25700d = i11;
    }

    @Override // k00.l, k00.h
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f25699c;
        int i11 = this.f25700d;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // k00.h
    public final int c() {
        return this.f25700d;
    }

    @Override // k00.h
    public final int d() {
        return 0;
    }

    @Override // k00.h
    public final Object[] g() {
        return this.f25699c;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        a.e(i11, this.f25700d);
        Object obj = this.f25699c[i11];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25700d;
    }
}
