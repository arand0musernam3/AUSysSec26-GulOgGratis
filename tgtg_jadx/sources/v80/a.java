package v80;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends s1 implements x70.c, b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineContext f42066c;

    public a(CoroutineContext coroutineContext, boolean z11) {
        super(z11);
        N((i1) coroutineContext.get(h1.f42106a));
        this.f42066c = coroutineContext.plus(this);
    }

    @Override // v80.s1
    public final void M(CompletionHandlerException completionHandlerException) {
        f0.v(this.f42066c, completionHandlerException);
    }

    @Override // v80.s1
    public final void W(Object obj) {
        if (!(obj instanceof t)) {
            j0(obj);
        } else {
            t tVar = (t) obj;
            h0(tVar.f42160a, t.f42159b.get(tVar) == 1);
        }
    }

    @Override // x70.c
    public final CoroutineContext getContext() {
        return this.f42066c;
    }

    @Override // v80.b0
    public final CoroutineContext getCoroutineContext() {
        return this.f42066c;
    }

    public final void k0(d0 d0Var, a aVar, Function2 function2) {
        d0Var.getClass();
        int i11 = c0.$EnumSwitchMapping$0[d0Var.ordinal()];
        if (i11 == 1) {
            bx.o.P(function2, aVar, this);
            return;
        }
        if (i11 == 2) {
            function2.getClass();
            x70.c cVarB = y70.f.b(y70.f.a(function2, aVar, this));
            Unit unit = Unit.f26487a;
            u70.o oVar = u70.q.f40850b;
            cVarB.resumeWith(unit);
            return;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return;
            }
            e40.a.f();
            return;
        }
        try {
            CoroutineContext coroutineContext = this.f42066c;
            Object objC = a90.x.c(coroutineContext, null);
            try {
                Object objC2 = !(function2 instanceof z70.a) ? y70.f.c(function2, aVar, this) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(aVar, this);
                a90.x.a(coroutineContext, objC);
                if (objC2 != y70.a.COROUTINE_SUSPENDED) {
                    u70.o oVar2 = u70.q.f40850b;
                    resumeWith(objC2);
                }
            } catch (Throwable th2) {
                a90.x.a(coroutineContext, objC);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).f26625a;
            }
            u70.o oVar3 = u70.q.f40850b;
            resumeWith(ba0.g.j(th));
        }
    }

    @Override // x70.c
    public final void resumeWith(Object obj) {
        Throwable thA = u70.q.a(obj);
        if (thA != null) {
            obj = new t(thA, false);
        }
        Object objS = S(obj);
        if (objS == f0.f42087e) {
            return;
        }
        l(objS);
    }

    @Override // v80.s1
    public final String v() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void j0(Object obj) {
    }

    public void h0(Throwable th2, boolean z11) {
    }
}
