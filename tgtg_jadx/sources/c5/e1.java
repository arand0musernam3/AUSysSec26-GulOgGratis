package c5;

import android.view.Choreographer;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements m3.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Choreographer f7180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f7181b;

    public e1(Choreographer choreographer, c1 c1Var) {
        this.f7180a = choreographer;
        this.f7181b = c1Var;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }

    @Override // m3.x0
    public final Object t(Function1 function1, x70.c cVar) {
        c1 c1Var = this.f7181b;
        v80.l lVar = new v80.l(1, y70.f.b(cVar));
        lVar.t();
        d1 d1Var = new d1(lVar, this, function1);
        if (Intrinsics.areEqual(c1Var.f7138b, this.f7180a)) {
            synchronized (c1Var.f7140d) {
                c1Var.f7142f.add(d1Var);
                if (!c1Var.f7145i) {
                    c1Var.f7145i = true;
                    c1Var.f7138b.postFrameCallback(c1Var.f7146j);
                }
            }
            lVar.v(new b4.x(5, c1Var, d1Var));
        } else {
            this.f7180a.postFrameCallback(d1Var);
            lVar.v(new b4.x(6, this, d1Var));
        }
        Object objS = lVar.s();
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        return objS;
    }
}
