package v80;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n0 extends c90.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42133c;

    public n0(int i11) {
        super(0L, false);
        this.f42133c = i11;
    }

    public abstract x70.c c();

    public Throwable d(Object obj) {
        t tVar = obj instanceof t ? (t) obj : null;
        if (tVar != null) {
            return tVar.f42160a;
        }
        return null;
    }

    public final void f(Throwable th2) {
        f0.v(c().getContext(), new e0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            x70.c cVarC = c();
            cVarC.getClass();
            a90.f fVar = (a90.f) cVarC;
            z70.c cVar = fVar.f1019e;
            Object obj = fVar.f1021g;
            CoroutineContext context = cVar.getContext();
            Object objC = a90.x.c(context, obj);
            i1 i1Var = null;
            l2 l2VarC = objC != a90.x.f1053a ? v.c(cVar, context, objC) : null;
            try {
                CoroutineContext context2 = cVar.getContext();
                Object objH = h();
                Throwable thD = d(objH);
                if (thD == null) {
                    int i11 = this.f42133c;
                    boolean z11 = true;
                    if (i11 != 1 && i11 != 2) {
                        z11 = false;
                    }
                    if (z11) {
                        i1Var = (i1) context2.get(h1.f42106a);
                    }
                }
                if (i1Var != null && !i1Var.g()) {
                    CancellationException cancellationExceptionA = i1Var.A();
                    b(cancellationExceptionA);
                    u70.o oVar = u70.q.f40850b;
                    cVar.resumeWith(ba0.g.j(cancellationExceptionA));
                } else if (thD != null) {
                    u70.o oVar2 = u70.q.f40850b;
                    cVar.resumeWith(new u70.p(thD));
                } else {
                    u70.o oVar3 = u70.q.f40850b;
                    cVar.resumeWith(e(objH));
                }
                if (l2VarC == null || l2VarC.m0()) {
                    a90.x.a(context, objC);
                }
            } catch (Throwable th2) {
                if (l2VarC == null || l2VarC.m0()) {
                    a90.x.a(context, objC);
                }
                throw th2;
            }
        } catch (DispatchException e5) {
            f0.v(c().getContext(), e5.f26625a);
        } catch (Throwable th3) {
            f(th3);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object e(Object obj) {
        return obj;
    }
}
