package y00;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o1 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f45037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f45038c;

    public o1(l4 l4Var, t4 t4Var) {
        this.f45036a = 2;
        this.f45038c = t4Var;
        Objects.requireNonNull(l4Var);
        this.f45037b = l4Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f45036a) {
            case 0:
                v1 v1Var = (v1) this.f45037b;
                v1Var.f45249g.W();
                m mVar = v1Var.f45249g.f44922c;
                l4.U(mVar);
                return mVar.m0((String) this.f45038c);
            case 1:
                v1 v1Var2 = (v1) this.f45037b;
                v1Var2.f45249g.W();
                return new i(v1Var2.f45249g.q0(((t4) this.f45038c).f45170a));
            default:
                t4 t4Var = (t4) this.f45038c;
                String str = t4Var.f45170a;
                com.google.android.gms.common.internal.i0.h(str);
                l4 l4Var = (l4) this.f45037b;
                b2 b2VarE = l4Var.e(str);
                a2 a2Var = a2.ANALYTICS_STORAGE;
                if (b2VarE.i(a2Var) && b2.c(100, t4Var.f45187s).i(a2Var)) {
                    return l4Var.d0(t4Var).F();
                }
                l4Var.b().f45267o.a("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }

    public /* synthetic */ o1(v1 v1Var, Object obj, int i11) {
        this.f45036a = i11;
        this.f45038c = obj;
        this.f45037b = v1Var;
    }
}
