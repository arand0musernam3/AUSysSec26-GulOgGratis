package oa0;

import androidx.lifecycle.n1;
import java.util.ArrayList;
import q90.v0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class n0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q90.p0 f32351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f32352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q90.r0 f32353c;

    public n0(q90.p0 p0Var, Object obj, q90.q0 q0Var) {
        this.f32351a = p0Var;
        this.f32352b = obj;
        this.f32353c = q0Var;
    }

    public static n0 a(Object obj, q90.p0 p0Var) {
        if (p0Var.f36597q) {
            return new n0(p0Var, obj, null);
        }
        i4.a.f("rawResponse must be successful response");
        return null;
    }

    public static n0 b(u70.q qVar) {
        q90.q0 q0Var = q90.r0.f36605a;
        ArrayList arrayList = new ArrayList(20);
        q90.f0 f0Var = q90.f0.HTTP_1_1;
        f0Var.getClass();
        n1 n1Var = new n1();
        n1Var.D("http://localhost/");
        return a(qVar, new q90.p0(new q90.g0(n1Var), f0Var, "OK", 200, null, new q90.t((String[]) arrayList.toArray(new String[0])), q0Var, null, null, null, null, 0L, 0L, null, v0.f36632p0));
    }

    public final String toString() {
        return this.f32351a.toString();
    }
}
