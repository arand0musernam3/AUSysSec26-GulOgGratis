package o00;

import com.google.android.gms.internal.measurement.cg;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f31642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f31643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f31644e;

    public d0(Object[] objArr, int i11, int i12) {
        this.f31642c = objArr;
        this.f31643d = i11;
        this.f31644e = i12;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        cg.z(i11, this.f31644e);
        Object obj = this.f31642c[i11 + i11 + this.f31643d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31644e;
    }
}
