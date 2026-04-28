package x80;

import a3.f2;
import com.braze.h2;
import com.google.firebase.messaging.a0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.JobCancellationException;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends v80.a implements u, m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f44084d;

    public t(CoroutineContext coroutineContext, i iVar) {
        super(coroutineContext, true);
        this.f44084d = iVar;
    }

    @Override // v80.s1, v80.i1
    public final void a(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(v(), null, this);
        }
        r(cancellationException);
    }

    @Override // x80.w
    public final Object b(x70.c cVar) {
        return this.f44084d.b(cVar);
    }

    @Override // x80.w
    public final a0 c() {
        return this.f44084d.c();
    }

    @Override // x80.w
    public final Object d() {
        return this.f44084d.d();
    }

    @Override // x80.w
    public final Object e(z80.o oVar) {
        i iVar = this.f44084d;
        iVar.getClass();
        Object objF = i.F(iVar, oVar);
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        return objF;
    }

    @Override // x80.x
    public final Object f(Object obj, x70.c cVar) {
        return this.f44084d.f(obj, cVar);
    }

    @Override // x80.x
    public final Object h(Object obj) {
        return this.f44084d.h(obj);
    }

    @Override // v80.a
    public final void h0(Throwable th2, boolean z11) {
        if (this.f44084d.n(th2, false) || z11) {
            return;
        }
        f0.v(this.f42066c, th2);
    }

    @Override // x80.w
    public final b iterator() {
        i iVar = this.f44084d;
        iVar.getClass();
        return new b(iVar);
    }

    @Override // v80.a
    public final void j0(Object obj) {
        this.f44084d.m(null);
    }

    public final boolean l0(Throwable th2) {
        return this.f44084d.n(th2, false);
    }

    public final void m0(f2 f2Var) {
        i iVar = this.f44084d;
        iVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i.l;
        while (!atomicReferenceFieldUpdater.compareAndSet(iVar, null, f2Var)) {
            if (atomicReferenceFieldUpdater.get(iVar) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(iVar);
                    a90.v vVar = k.f44070q;
                    if (obj != vVar) {
                        if (obj == k.f44071r) {
                            h2.b("Another handler was already registered and successfully invoked");
                            return;
                        } else {
                            org.bouncycastle.jce.provider.a.p(obj, "Another handler is already registered: ");
                            return;
                        }
                    }
                    a90.v vVar2 = k.f44071r;
                    while (!atomicReferenceFieldUpdater.compareAndSet(iVar, vVar, vVar2)) {
                        if (atomicReferenceFieldUpdater.get(iVar) != vVar) {
                            break;
                        }
                    }
                    f2Var.invoke(iVar.s());
                    return;
                }
            }
        }
    }

    @Override // v80.s1
    public final void r(Throwable th2) {
        CancellationException cancellationException = (CancellationException) th2;
        this.f44084d.n(cancellationException, true);
        q(cancellationException);
    }
}
