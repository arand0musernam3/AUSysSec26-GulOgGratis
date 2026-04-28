package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends o0 {
    public String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c1 f3416m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(c1 c1Var, String str, Object obj) {
        super(obj);
        str.getClass();
        this.l = str;
        this.f3416m = c1Var;
    }

    @Override // androidx.lifecycle.k0
    public final void k(Object obj) {
        n1 n1Var;
        c1 c1Var = this.f3416m;
        if (c1Var != null && (n1Var = c1Var.f3420b) != null) {
            n1Var.z(obj, this.l);
        }
        super.k(obj);
    }
}
