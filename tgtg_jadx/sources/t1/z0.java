package t1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39624a;

    public z0(int i11) {
        this.f39624a = i11;
    }

    @Override // t1.i
    public final z1 a(v1 v1Var) {
        return new e10.t(this.f39624a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof z0) && ((z0) obj).f39624a == this.f39624a;
    }

    public final int hashCode() {
        return this.f39624a;
    }
}
