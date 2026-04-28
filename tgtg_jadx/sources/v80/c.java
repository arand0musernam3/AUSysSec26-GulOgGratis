package v80;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends k1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f42071h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f42072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r0 f42073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f42074g;

    public c(e eVar, l lVar) {
        this.f42074g = eVar;
        this.f42072e = lVar;
    }

    @Override // v80.k1
    public final boolean k() {
        return false;
    }

    @Override // v80.k1
    public final void l(Throwable th2) throws DispatchException {
        l lVar = this.f42072e;
        if (th2 != null) {
            lVar.getClass();
            a90.v vVarF = lVar.F(new t(th2, false), null);
            if (vVarF != null) {
                lVar.o(vVarF);
                d dVar = (d) f42071h.get(this);
                if (dVar != null) {
                    dVar.a();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.f42079b;
        e eVar = this.f42074g;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            i0[] i0VarArr = eVar.f42080a;
            ArrayList arrayList = new ArrayList(i0VarArr.length);
            for (i0 i0Var : i0VarArr) {
                arrayList.add(i0Var.p());
            }
            u70.o oVar = u70.q.f40850b;
            lVar.resumeWith(arrayList);
        }
    }
}
