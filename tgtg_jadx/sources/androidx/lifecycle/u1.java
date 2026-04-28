package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v80.x f3530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f3531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v1 f3532c;

    public u1(w80.c cVar, Lifecycle lifecycle, v1 v1Var) {
        this.f3530a = cVar;
        this.f3531b = lifecycle;
        this.f3532c = v1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f26549a;
        v80.x xVar = this.f3530a;
        boolean zY0 = xVar.y0(gVar);
        v1 v1Var = this.f3532c;
        Lifecycle lifecycle = this.f3531b;
        if (zY0) {
            xVar.u0(gVar, new o30.m0(3, lifecycle, v1Var));
        } else {
            lifecycle.d(v1Var);
        }
        return Unit.f26487a;
    }
}
