package e90;

import a3.m2;
import a90.t;
import a90.v;
import c50.p;
import i80.n;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.DispatchException;
import v80.l;
import v80.n2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements v80.k, n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f15874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f15875b;

    public b(c cVar, l lVar) {
        this.f15875b = cVar;
        this.f15874a = lVar;
    }

    @Override // v80.n2
    public final void a(t tVar, int i11) {
        this.f15874a.a(tVar, i11);
    }

    @Override // v80.k
    public final boolean g() {
        return this.f15874a.g();
    }

    @Override // x70.c
    public final CoroutineContext getContext() {
        return this.f15874a.f42119e;
    }

    @Override // v80.k
    public final boolean j(Throwable th2) {
        return this.f15874a.j(th2);
    }

    @Override // v80.k
    public final void k(Object obj, n nVar) throws DispatchException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f15876h;
        c cVar = this.f15875b;
        atomicReferenceFieldUpdater.set(cVar, null);
        p pVar = new p(cVar, this);
        l lVar = this.f15874a;
        lVar.C(lVar.f42133c, new tq.c(pVar, 2), (Unit) obj);
    }

    @Override // v80.k
    public final v n(Object obj, n nVar) {
        c cVar = this.f15875b;
        m2 m2Var = new m2(cVar, this);
        v vVarF = this.f15874a.F((Unit) obj, m2Var);
        if (vVarF != null) {
            c.f15876h.set(cVar, null);
        }
        return vVarF;
    }

    @Override // v80.k
    public final void o(Object obj) throws DispatchException {
        this.f15874a.o(obj);
    }

    @Override // x70.c
    public final void resumeWith(Object obj) {
        this.f15874a.resumeWith(obj);
    }
}
