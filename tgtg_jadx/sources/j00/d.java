package j00;

import bx.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient int f24353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f24354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f24355e;

    public d(e eVar, int i11, int i12) {
        this.f24355e = eVar;
        this.f24353c = i11;
        this.f24354d = i12;
    }

    @Override // j00.a
    public final Object[] b() {
        return this.f24355e.b();
    }

    @Override // j00.a
    public final int c() {
        return this.f24355e.c() + this.f24353c;
    }

    @Override // j00.a
    public final int d() {
        return this.f24355e.c() + this.f24353c + this.f24354d;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        o.T(i11, this.f24354d);
        return this.f24355e.get(i11 + this.f24353c);
    }

    @Override // j00.e, java.util.List
    /* JADX INFO: renamed from: h */
    public final e subList(int i11, int i12) {
        o.U(i11, i12, this.f24354d);
        int i13 = this.f24353c;
        return this.f24355e.subList(i11 + i13, i12 + i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24354d;
    }
}
