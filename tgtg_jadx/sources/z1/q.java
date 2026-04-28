package z1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f46637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f46638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f46639c = Float.NaN;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f46640d;

    public q(r rVar) {
        this.f46640d = rVar;
    }

    public final void a(float f11, float f12) {
        r rVar = this.f46640d;
        m3.g1 g1Var = rVar.f46655j;
        float fH = g1Var.h();
        g1Var.i(f11);
        rVar.f46656k.i(f12);
        if (Float.isNaN(fH)) {
            return;
        }
        boolean z11 = f11 >= fH;
        g1 g1VarD = rVar.d();
        m3.k1 k1Var = rVar.f46652g;
        if (g1Var.h() == ((a0) g1VarD).f(k1Var.getValue())) {
            Object objB = ((a0) rVar.d()).b(g1Var.h() + (z11 ? 1.0f : -1.0f), z11);
            if (objB == null) {
                objB = k1Var.getValue();
            }
            if (z11) {
                this.f46637a = k1Var.getValue();
                this.f46638b = objB;
            } else {
                this.f46637a = objB;
                this.f46638b = k1Var.getValue();
            }
        } else {
            Object objB2 = ((a0) rVar.d()).b(g1Var.h(), false);
            if (objB2 == null) {
                objB2 = k1Var.getValue();
            }
            Object objB3 = ((a0) rVar.d()).b(g1Var.h(), true);
            if (objB3 == null) {
                objB3 = k1Var.getValue();
            }
            this.f46637a = objB2;
            this.f46638b = objB3;
        }
        g1 g1VarD2 = rVar.d();
        Object obj = this.f46637a;
        obj.getClass();
        float f13 = ((a0) g1VarD2).f(obj);
        g1 g1VarD3 = rVar.d();
        Object obj2 = this.f46638b;
        obj2.getClass();
        this.f46639c = Math.abs(f13 - ((a0) g1VarD3).f(obj2));
        if (Math.abs(g1Var.h() - ((a0) rVar.d()).f(k1Var.getValue())) >= this.f46639c / 2.0f) {
            Object value = z11 ? this.f46638b : this.f46637a;
            if (value == null) {
                value = k1Var.getValue();
            }
            if (((Boolean) rVar.f46646a.invoke(value)).booleanValue()) {
                rVar.h(value);
            }
        }
    }
}
