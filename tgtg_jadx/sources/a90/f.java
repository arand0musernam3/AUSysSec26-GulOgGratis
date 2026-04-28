package a90;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.DispatchException;
import v80.f0;
import v80.f2;
import v80.n0;
import v80.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends n0 implements z70.d, x70.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1017h = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v80.x f1018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z70.c f1019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f1020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f1021g;

    public f(v80.x xVar, z70.c cVar) {
        super(-1);
        this.f1018d = xVar;
        this.f1019e = cVar;
        this.f1020f = g.f1022a;
        this.f1021g = x.b(cVar.getContext());
    }

    @Override // z70.d
    public final z70.d getCallerFrame() {
        return this.f1019e;
    }

    @Override // x70.c
    public final CoroutineContext getContext() {
        return this.f1019e.getContext();
    }

    @Override // v80.n0
    public final Object h() {
        Object obj = this.f1020f;
        this.f1020f = g.f1022a;
        return obj;
    }

    @Override // x70.c
    public final void resumeWith(Object obj) throws DispatchException {
        Throwable thA = u70.q.a(obj);
        Object tVar = thA == null ? obj : new v80.t(thA, false);
        z70.c cVar = this.f1019e;
        CoroutineContext context = cVar.getContext();
        v80.x xVar = this.f1018d;
        if (g.j(xVar, context)) {
            this.f1020f = tVar;
            this.f42133c = 0;
            g.i(xVar, cVar.getContext(), this);
            return;
        }
        u0 u0VarA = f2.a();
        if (u0VarA.f42164b >= 4294967296L) {
            this.f1020f = tVar;
            this.f42133c = 0;
            u0VarA.B0(this);
            return;
        }
        u0VarA.C0(true);
        try {
            CoroutineContext context2 = cVar.getContext();
            Object objC = x.c(context2, this.f1021g);
            try {
                cVar.resumeWith(obj);
                while (u0VarA.E0()) {
                }
            } finally {
                x.a(context2, objC);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f1018d + ", " + f0.I(this.f1019e) + ']';
    }

    @Override // v80.n0
    public final x70.c c() {
        return this;
    }
}
