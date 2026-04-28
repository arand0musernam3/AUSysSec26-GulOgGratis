package a90;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import v80.e2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class y implements e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadLocal f1058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f1059c;

    public y(Object obj, ThreadLocal threadLocal) {
        this.f1057a = obj;
        this.f1058b = threadLocal;
        this.f1059c = new z(threadLocal);
    }

    @Override // v80.e2
    public final void Q(CoroutineContext coroutineContext, Object obj) {
        this.f1058b.set(obj);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f fVar) {
        if (Intrinsics.areEqual(this.f1059c, fVar)) {
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return this.f1059c;
    }

    @Override // v80.e2
    public final Object i0(CoroutineContext coroutineContext) {
        ThreadLocal threadLocal = this.f1058b;
        Object obj = threadLocal.get();
        threadLocal.set(this.f1057a);
        return obj;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.f fVar) {
        return Intrinsics.areEqual(this.f1059c, fVar) ? kotlin.coroutines.g.f26549a : this;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f1057a + ", threadLocal = " + this.f1058b + ')';
    }
}
