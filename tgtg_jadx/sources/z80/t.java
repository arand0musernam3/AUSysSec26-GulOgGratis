package z80;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import v80.f0;
import z1.c3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends z70.c implements y80.j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y80.j f47400j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CoroutineContext f47401k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CoroutineContext f47402m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public x70.c f47403n;

    public t(y80.j jVar, CoroutineContext coroutineContext) {
        super(kotlin.coroutines.g.f26549a, r.f47397a);
        this.f47400j = jVar;
        this.f47401k = coroutineContext;
        this.l = ((Number) coroutineContext.fold(0, new yn.a(14))).intValue();
    }

    public final Object a(x70.c cVar, Object obj) {
        CoroutineContext context = cVar.getContext();
        f0.p(context);
        CoroutineContext coroutineContext = this.f47402m;
        if (coroutineContext != context) {
            if (coroutineContext instanceof p) {
                throw new IllegalStateException(kotlin.text.s.c("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((p) coroutineContext).f47396b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new c3(this, 2))).intValue() != this.l) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f47401k + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f47402m = context;
        }
        this.f47403n = cVar;
        i80.n nVar = v.f47405a;
        y80.j jVar = this.f47400j;
        jVar.getClass();
        Object objInvoke = nVar.invoke(jVar, obj, this);
        if (!Intrinsics.areEqual(objInvoke, y70.a.COROUTINE_SUSPENDED)) {
            this.f47403n = null;
        }
        return objInvoke;
    }

    @Override // y80.j
    public final Object emit(Object obj, x70.c cVar) {
        try {
            Object objA = a(cVar, obj);
            return objA == y70.a.COROUTINE_SUSPENDED ? objA : Unit.f26487a;
        } catch (Throwable th2) {
            this.f47402m = new p(cVar.getContext(), th2);
            throw th2;
        }
    }

    @Override // z70.a, z70.d
    public final z70.d getCallerFrame() {
        x70.c cVar = this.f47403n;
        if (cVar instanceof z70.d) {
            return (z70.d) cVar;
        }
        return null;
    }

    @Override // z70.c, x70.c
    public final CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.f47402m;
        return coroutineContext == null ? kotlin.coroutines.g.f26549a : coroutineContext;
    }

    @Override // z70.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        Throwable thA = u70.q.a(obj);
        if (thA != null) {
            this.f47402m = new p(getContext(), thA);
        }
        x70.c cVar = this.f47403n;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return y70.a.COROUTINE_SUSPENDED;
    }
}
