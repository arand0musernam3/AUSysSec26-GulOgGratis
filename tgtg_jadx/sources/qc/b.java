package qc;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f36883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e90.i f36884b;

    public b(int i11, l lVar) {
        this.f36883a = lVar;
        this.f36884b = e90.j.a(i11);
    }

    @Override // qc.i
    public final j a(tc.n nVar, zc.n nVar2) {
        return new d(nVar.f39950a, nVar2, this.f36884b, this.f36883a);
    }

    public final boolean equals(Object obj) {
        return obj instanceof b;
    }

    public final int hashCode() {
        return b.class.hashCode();
    }
}
