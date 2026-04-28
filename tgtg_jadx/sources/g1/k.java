package g1;

import java.util.UUID;
import s0.a1;
import s0.g0;
import v0.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends a1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18114c;

    public k(g0 g0Var) {
        super(g0Var);
        this.f18113b = "virtual-" + g0Var.d() + "-" + UUID.randomUUID().toString();
    }

    @Override // s0.a1, m0.q
    public final int b() {
        return n(0);
    }

    @Override // s0.a1, s0.g0
    public final String d() {
        return this.f18113b;
    }

    @Override // s0.a1, m0.q
    public final int n(int i11) {
        return o.j(this.f38278a.n(i11) - this.f18114c);
    }
}
