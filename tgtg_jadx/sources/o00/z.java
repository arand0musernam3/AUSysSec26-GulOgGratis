package o00;

import com.google.android.gms.internal.measurement.cg;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z extends v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final z f31782e = new z(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f31783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f31784d;

    public z(Object[] objArr, int i11) {
        this.f31783c = objArr;
        this.f31784d = i11;
    }

    @Override // o00.s
    public final Object[] b() {
        return this.f31783c;
    }

    @Override // o00.s
    public final int c() {
        return 0;
    }

    @Override // o00.s
    public final int d() {
        return this.f31784d;
    }

    @Override // o00.v, o00.s
    public final int e(Object[] objArr) {
        Object[] objArr2 = this.f31783c;
        int i11 = this.f31784d;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        cg.z(i11, this.f31784d);
        Object obj = this.f31783c[i11];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31784d;
    }
}
