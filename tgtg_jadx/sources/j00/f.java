package j00;

import bx.o;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f24357e = new f(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f24358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f24359d;

    public f(Object[] objArr, int i11) {
        this.f24358c = objArr;
        this.f24359d = i11;
    }

    @Override // j00.a
    public final Object[] b() {
        return this.f24358c;
    }

    @Override // j00.a
    public final int c() {
        return 0;
    }

    @Override // j00.a
    public final int d() {
        return this.f24359d;
    }

    @Override // j00.e, j00.a
    public final int e(Object[] objArr) {
        Object[] objArr2 = this.f24358c;
        int i11 = this.f24359d;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        o.T(i11, this.f24359d);
        Object obj = this.f24358c[i11];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24359d;
    }
}
