package v80;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends k1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f42131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f42132f;

    public /* synthetic */ n(l lVar, int i11) {
        this.f42131e = i11;
        this.f42132f = lVar;
    }

    @Override // v80.k1
    public final boolean k() {
        switch (this.f42131e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // v80.k1
    public final void l(Throwable th2) throws DispatchException {
        int i11 = this.f42131e;
        l lVar = this.f42132f;
        switch (i11) {
            case 0:
                Throwable thR = lVar.r(j());
                if (lVar.y()) {
                    x70.c cVar = lVar.f42118d;
                    cVar.getClass();
                    a90.f fVar = (a90.f) cVar;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a90.f.f1017h;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        a90.v vVar = a90.g.f1023b;
                        if (Intrinsics.areEqual(obj, vVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, vVar, thR)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != vVar) {
                                }
                                break;
                            }
                        } else if (!(obj instanceof Throwable)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                }
                            }
                        }
                    }
                }
                lVar.j(thR);
                if (!lVar.y()) {
                    lVar.p();
                }
                break;
            default:
                u70.o oVar = u70.q.f40850b;
                lVar.resumeWith(Unit.f26487a);
                break;
        }
    }
}
