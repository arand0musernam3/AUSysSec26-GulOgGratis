package c5;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 implements x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function0 f7349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m3.k1 f7350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3.k1 f7351c = m3.i.w(Boolean.FALSE);

    public final long a() {
        a2 a2Var;
        if (this.f7350b == null) {
            Function0 function0 = this.f7349a;
            if (function0 == null || (a2Var = (a2) function0.invoke()) == null) {
                a2Var = a2.f7107c;
            }
            this.f7350b = m3.i.w(a2Var);
            this.f7349a = null;
        }
        m3.k1 k1Var = this.f7350b;
        k1Var.getClass();
        return ((a2) k1Var.getValue()).f7108a;
    }

    public final boolean b() {
        return ((Boolean) this.f7351c.getValue()).booleanValue();
    }
}
