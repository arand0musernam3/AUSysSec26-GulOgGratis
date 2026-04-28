package y9;

import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f45736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f45737c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(k kVar, a0 a0Var) {
        super(a0Var.f45672a);
        a0Var.getClass();
        this.f45736b = kVar;
        this.f45737c = new WeakReference(a0Var);
    }

    @Override // y9.i
    public final void a(Set set) {
        set.getClass();
        i iVar = (i) this.f45737c.get();
        if (iVar != null) {
            iVar.a(set);
            return;
        }
        k kVar = this.f45736b;
        kVar.getClass();
        ReentrantLock reentrantLock = kVar.f45685d;
        reentrantLock.lock();
        try {
            q qVar = (q) kVar.f45684c.remove(this);
            if (qVar != null) {
                p0 p0Var = kVar.f45683b;
                int[] iArr = qVar.f45733b;
                p0Var.getClass();
                iArr.getClass();
                if (p0Var.f45728h.b(iArr)) {
                    wd.a.F(new j(kVar, null, 1));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
