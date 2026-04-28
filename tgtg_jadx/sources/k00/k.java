package k00;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f25659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f25660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f25661e;

    public k(l lVar, int i11, int i12) {
        this.f25661e = lVar;
        this.f25659c = i11;
        this.f25660d = i12;
    }

    @Override // k00.h
    public final int c() {
        return this.f25661e.d() + this.f25659c + this.f25660d;
    }

    @Override // k00.h
    public final int d() {
        return this.f25661e.d() + this.f25659c;
    }

    @Override // k00.h
    public final Object[] g() {
        return this.f25661e.g();
    }

    @Override // java.util.List
    public final Object get(int i11) {
        a.e(i11, this.f25660d);
        return this.f25661e.get(i11 + this.f25659c);
    }

    @Override // k00.l, java.util.List
    /* JADX INFO: renamed from: i */
    public final l subList(int i11, int i12) {
        a.m(i11, i12, this.f25660d);
        int i13 = this.f25659c;
        return this.f25661e.subList(i11 + i13, i12 + i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25660d;
    }
}
