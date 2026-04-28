package oa0;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f32274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f32275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f32276f;

    public /* synthetic */ b0(Method method, int i11, int i12) {
        this.f32274d = i12;
        this.f32275e = method;
        this.f32276f = i11;
    }

    @Override // oa0.u0
    public final void a(k0 k0Var, Object obj) {
        switch (this.f32274d) {
            case 0:
                q90.t tVar = (q90.t) obj;
                if (tVar == null) {
                    throw u0.n(this.f32275e, this.f32276f, "Headers parameter must not be null.", new Object[0]);
                }
                ax.g0 g0Var = k0Var.f32304f;
                g0Var.getClass();
                int size = tVar.size();
                for (int i11 = 0; i11 < size; i11++) {
                    zz.f.k(g0Var, tVar.d(i11), tVar.g(i11));
                }
                return;
            default:
                if (obj == null) {
                    throw u0.n(this.f32275e, this.f32276f, "@Url parameter is null.", new Object[0]);
                }
                k0Var.f32301c = obj.toString();
                return;
        }
    }
}
