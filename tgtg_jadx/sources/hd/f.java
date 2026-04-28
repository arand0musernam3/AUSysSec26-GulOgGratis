package hd;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import v80.w;
import v80.x;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f implements CoroutineContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f21862a;

    public f(CoroutineContext coroutineContext) {
        this.f21862a = coroutineContext;
    }

    public final boolean equals(Object obj) {
        return Intrinsics.areEqual(this.f21862a, obj);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return this.f21862a.fold(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f fVar) {
        return this.f21862a.get(fVar);
    }

    public final int hashCode() {
        return this.f21862a.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.f fVar) {
        CoroutineContext coroutineContextMinusKey = this.f21862a.minusKey(fVar);
        int i11 = h.f21865b;
        w wVar = x.f42171a;
        x xVar = (x) get(wVar);
        x xVar2 = (x) coroutineContextMinusKey.get(wVar);
        if ((xVar instanceof e) && !Intrinsics.areEqual(xVar, xVar2)) {
            ((e) xVar).f21861c = 0;
        }
        return new d(coroutineContextMinusKey);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextPlus = this.f21862a.plus(coroutineContext);
        int i11 = h.f21865b;
        w wVar = x.f42171a;
        x xVar = (x) get(wVar);
        x xVar2 = (x) coroutineContextPlus.get(wVar);
        if ((xVar instanceof e) && !Intrinsics.areEqual(xVar, xVar2)) {
            ((e) xVar).f21861c = 0;
        }
        return new d(coroutineContextPlus);
    }

    public final String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.f21862a + ")";
    }
}
