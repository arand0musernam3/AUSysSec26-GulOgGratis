package d2;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements z4.u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f13866b = new o(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f13867c = new o(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13868a;

    public /* synthetic */ o(int i11) {
        this.f13868a = i11;
    }

    @Override // z4.u0
    public final z4.v0 c(z4.w0 w0Var, List list, long j9) {
        switch (this.f13868a) {
            case 0:
                return z4.w0.f(w0Var, z5.a.k(j9), z5.a.j(j9), new cp.i(4));
            default:
                return z4.w0.f(w0Var, z5.a.g(j9) ? z5.a.i(j9) : 0, z5.a.f(j9) ? z5.a.h(j9) : 0, new cp.i(8));
        }
    }
}
