package v80;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class u1 extends b2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x70.c f42167d;

    public u1(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.f42167d = y70.f.a(function2, this, this);
    }

    @Override // v80.s1
    public final void X() throws Throwable {
        try {
            x70.c cVarB = y70.f.b(this.f42167d);
            u70.o oVar = u70.q.f40850b;
            a90.g.h(Unit.f26487a, cVarB);
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).f26625a;
            }
            u70.o oVar2 = u70.q.f40850b;
            resumeWith(ba0.g.j(th));
            throw th;
        }
    }
}
