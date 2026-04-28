package oa0;

import java.io.IOException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f32401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f32402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f32403f;

    public y(Method method, int i11, k kVar) {
        this.f32401d = method;
        this.f32402e = i11;
        this.f32403f = kVar;
    }

    @Override // oa0.u0
    public final void a(k0 k0Var, Object obj) {
        int i11 = this.f32402e;
        Method method = this.f32401d;
        if (obj == null) {
            throw u0.n(method, i11, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            k0Var.f32309k = (q90.n0) this.f32403f.f(obj);
        } catch (IOException e5) {
            throw u0.o(method, e5, i11, org.bouncycastle.jcajce.provider.asymmetric.a.c(obj, "Unable to convert ", " to RequestBody"), new Object[0]);
        }
    }
}
