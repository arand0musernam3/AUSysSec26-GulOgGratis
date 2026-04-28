package m3;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements e2, v80.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f29462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function2 f29463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a90.d f29464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v80.b2 f29465d;

    public v0(CoroutineContext coroutineContext, Function2 function2) {
        this.f29462a = coroutineContext;
        this.f29463b = function2;
        this.f29464c = v80.f0.b(coroutineContext.plus(this));
    }

    @Override // m3.e2
    public final void b() {
        v80.b2 b2Var = this.f29465d;
        if (b2Var != null) {
            b2Var.r(new n0(1));
        }
        this.f29465d = null;
    }

    @Override // m3.e2
    public final void c() {
        v80.b2 b2Var = this.f29465d;
        if (b2Var != null) {
            b2Var.r(new n0(1));
        }
        this.f29465d = null;
    }

    @Override // m3.e2
    public final void d() {
        v80.b2 b2Var = this.f29465d;
        if (b2Var != null) {
            CancellationException cancellationException = new CancellationException("Old job was still running!");
            cancellationException.initCause(null);
            b2Var.a(cancellationException);
        }
        this.f29465d = v80.f0.B(this.f29464c, null, null, this.f29463b, 3);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return v80.y.f42175a;
    }

    @Override // v80.z
    public final void handleException(CoroutineContext coroutineContext, Throwable th2) throws Throwable {
        a4.h hVar = (a4.h) coroutineContext.get(a4.h.f684b);
        if (hVar != null) {
            a4.e.b(th2, new a3.n2(2, hVar, this));
        }
        v80.z zVar = (v80.z) this.f29462a.get(v80.y.f42175a);
        if (zVar == null) {
            throw th2;
        }
        zVar.handleException(coroutineContext, th2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }
}
