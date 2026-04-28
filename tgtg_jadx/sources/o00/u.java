package o00;

import com.google.android.gms.internal.measurement.cg;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f31747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f31748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f31749e;

    public u(v vVar, int i11, int i12) {
        this.f31749e = vVar;
        this.f31747c = i11;
        this.f31748d = i12;
    }

    @Override // o00.s
    public final Object[] b() {
        return this.f31749e.b();
    }

    @Override // o00.s
    public final int c() {
        return this.f31749e.c() + this.f31747c;
    }

    @Override // o00.s
    public final int d() {
        return this.f31749e.c() + this.f31747c + this.f31748d;
    }

    @Override // o00.v, java.util.List
    /* JADX INFO: renamed from: g */
    public final v subList(int i11, int i12) {
        cg.B(i11, i12, this.f31748d);
        int i13 = this.f31747c;
        return this.f31749e.subList(i11 + i13, i12 + i13);
    }

    @Override // java.util.List
    public final Object get(int i11) {
        cg.z(i11, this.f31748d);
        return this.f31749e.get(i11 + this.f31747c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31748d;
    }
}
