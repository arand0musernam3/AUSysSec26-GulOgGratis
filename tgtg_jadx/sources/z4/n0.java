package z4;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends b5.i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f47188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f47189c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(q0 q0Var, Function2 function2, String str) {
        super(str);
        this.f47188b = q0Var;
        this.f47189c = function2;
    }

    @Override // z4.u0
    public final v0 c(w0 w0Var, List list, long j9) {
        q0 q0Var = this.f47188b;
        l0 l0Var = q0Var.f47207h;
        l0Var.f47173a = w0Var.getLayoutDirection();
        l0Var.f47174b = w0Var.a();
        l0Var.f47175c = w0Var.X();
        boolean Z = w0Var.Z();
        Function2 function2 = this.f47189c;
        if (Z || q0Var.f47200a.f5873i == null) {
            q0Var.f47203d = 0;
            v0 v0Var = (v0) function2.invoke(l0Var, new z5.a(j9));
            return new m0(v0Var, q0Var, q0Var.f47203d, v0Var, 1);
        }
        q0Var.f47204e = 0;
        v0 v0Var2 = (v0) function2.invoke(q0Var.f47208i, new z5.a(j9));
        return new m0(v0Var2, q0Var, q0Var.f47204e, v0Var2, 0);
    }
}
