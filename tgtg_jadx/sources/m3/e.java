package m3;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1 f29264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u3.c f29265b = new u3.c();

    public e(y1 y1Var) {
        this.f29264a = y1Var;
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
        v80.l lVar = new v80.l(1, y70.f.b(cVar));
        lVar.t();
        d dVar = new d();
        dVar.f29258a = lVar;
        dVar.f29259b = function1;
        lVar.v(new a3.f2(this.f29265b.a(dVar, this.f29264a), 6));
        Object objS = lVar.s();
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        return objS;
    }
}
