package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements i4.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18649b;

    public /* synthetic */ g1(Object obj, int i11) {
        this.f18648a = i11;
        this.f18649b = obj;
    }

    @Override // i4.y
    public final long a() {
        switch (this.f18648a) {
            case 0:
                h1 h1Var = (h1) this.f18649b;
                long jA = h1Var.f18714t.a();
                if (jA != 16) {
                    return jA;
                }
                r5 r5Var = (r5) b5.o.e(h1Var, s5.f19473a);
                if (r5Var != null) {
                    long j9 = r5Var.f19412a;
                    if (j9 != 16) {
                        return j9;
                    }
                }
                return ((i4.v) b5.o.e(h1Var, v0.f19606a)).f23317a;
            default:
                return ((t5) this.f18649b).f19527c;
        }
    }
}
