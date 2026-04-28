package f2;

import h2.x0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface u {
    static x0 a(z zVar, int i11) {
        c0 c0Var = zVar.f17234a;
        z3.g gVarC = z3.v.c();
        Function1 function1E = gVarC != null ? gVarC.e() : null;
        z3.g gVarD = z3.v.d(gVarC);
        try {
            s sVar = (s) c0Var.f17093f.getValue();
            z3.v.f(gVarC, gVarD, function1E);
            return c0Var.f17102p.a(i11, sVar.f17191j, c0Var.f17091d, new cp.i(i11, sVar));
        } catch (Throwable th2) {
            z3.v.f(gVarC, gVarD, function1E);
            throw th2;
        }
    }
}
