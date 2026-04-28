package v80;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class t0 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42161a;

    public t0(boolean z11) {
        this.f42161a = z11;
    }

    @Override // v80.e1
    public final w1 b() {
        return null;
    }

    @Override // v80.e1
    public final boolean g() {
        return this.f42161a;
    }

    public final String toString() {
        return w2.l1.f(new StringBuilder("Empty{"), this.f42161a ? "Active" : "New", '}');
    }
}
