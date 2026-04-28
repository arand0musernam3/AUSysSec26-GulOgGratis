package t1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import m3.c3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 implements c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1 f39484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function1 f39485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Lambda f39486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m1 f39487d;

    /* JADX WARN: Multi-variable type inference failed */
    public l1(m1 m1Var, p1 p1Var, Function1 function1, Function1 function12) {
        this.f39487d = m1Var;
        this.f39484a = p1Var;
        this.f39485b = function1;
        this.f39486c = (Lambda) function12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    public final void b(n1 n1Var) {
        Object objInvoke = this.f39486c.invoke(n1Var.c());
        boolean zH = this.f39487d.f39495c.h();
        p1 p1Var = this.f39484a;
        if (zH) {
            p1Var.g(this.f39486c.invoke(n1Var.a()), objInvoke, (x) this.f39485b.invoke(n1Var));
        } else {
            p1Var.h(objInvoke, (x) this.f39485b.invoke(n1Var));
        }
    }

    @Override // m3.c3
    public final Object getValue() {
        b(this.f39487d.f39495c.f());
        return this.f39484a.f39513j.getValue();
    }
}
