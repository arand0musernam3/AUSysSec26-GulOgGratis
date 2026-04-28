package v80;

import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class l2 extends a90.s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ThreadLocal f42123e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public l2(CoroutineContext coroutineContext, x70.c cVar) {
        m2 m2Var = m2.f42130a;
        super(coroutineContext.get(m2Var) == null ? coroutineContext.plus(m2Var) : coroutineContext, cVar);
        this.f42123e = new ThreadLocal();
        if (cVar.getContext().get(kotlin.coroutines.d.f26548k0) instanceof x) {
            return;
        }
        Object objC = a90.x.c(coroutineContext, null);
        a90.x.a(coroutineContext, objC);
        o0(coroutineContext, objC);
    }

    @Override // a90.s, v80.s1
    public final void l(Object obj) {
        n0();
        Object objC = f0.C(obj);
        x70.c cVar = this.f1046d;
        CoroutineContext context = cVar.getContext();
        Object objC2 = a90.x.c(context, null);
        l2 l2VarC = objC2 != a90.x.f1053a ? v.c(cVar, context, objC2) : null;
        try {
            cVar.resumeWith(objC);
            if (l2VarC == null || l2VarC.m0()) {
                a90.x.a(context, objC2);
            }
        } catch (Throwable th2) {
            if (l2VarC == null || l2VarC.m0()) {
                a90.x.a(context, objC2);
            }
            throw th2;
        }
    }

    @Override // a90.s
    public final void l0() {
        n0();
    }

    public final boolean m0() {
        boolean z11 = this.threadLocalIsSet && this.f42123e.get() == null;
        this.f42123e.remove();
        return !z11;
    }

    public final void n0() {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f42123e.get();
            if (pair != null) {
                a90.x.a((CoroutineContext) pair.f26485a, pair.f26486b);
            }
            this.f42123e.remove();
        }
    }

    public final void o0(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.f42123e.set(new Pair(coroutineContext, obj));
    }
}
