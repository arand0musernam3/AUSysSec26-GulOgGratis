package t1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1 f39493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3.k1 f39494b = m3.i.w(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q1 f39495c;

    public m1(q1 q1Var, v1 v1Var, String str) {
        this.f39495c = q1Var;
        this.f39493a = v1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l1 a(Function1 function1, Function1 function12) {
        m3.k1 k1Var = this.f39494b;
        l1 l1Var = (l1) k1Var.getValue();
        q1 q1Var = this.f39495c;
        if (l1Var == null) {
            Object objInvoke = function12.invoke(q1Var.f39537a.j());
            Object objInvoke2 = function12.invoke(q1Var.f39537a.j());
            v1 v1Var = this.f39493a;
            o oVar = (o) v1Var.f39591a.invoke(objInvoke2);
            oVar.d();
            p1 p1Var = new p1(q1Var, objInvoke, oVar, v1Var);
            l1Var = new l1(this, p1Var, function1, function12);
            k1Var.setValue(l1Var);
            q1Var.f39545i.add(p1Var);
        }
        l1Var.f39486c = (Lambda) function12;
        l1Var.f39485b = function1;
        l1Var.b(q1Var.f());
        return l1Var;
    }
}
