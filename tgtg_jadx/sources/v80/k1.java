package v80;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k1 extends a90.l implements r0, e1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s1 f42113d;

    @Override // v80.r0
    public final void a() {
        s1 s1VarJ = j();
        s1VarJ.getClass();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s1.f42157a;
            Object obj = atomicReferenceFieldUpdater.get(s1VarJ);
            if (obj instanceof k1) {
                if (obj != this) {
                    return;
                }
                t0 t0Var = f0.f42092j;
                while (!atomicReferenceFieldUpdater.compareAndSet(s1VarJ, obj, t0Var)) {
                    if (atomicReferenceFieldUpdater.get(s1VarJ) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof e1) || ((e1) obj).b() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a90.l.f1032a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof a90.q) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                obj2.getClass();
                a90.l lVar = (a90.l) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = a90.l.f1034c;
                a90.q qVar = (a90.q) atomicReferenceFieldUpdater3.get(lVar);
                if (qVar == null) {
                    qVar = new a90.q(lVar);
                    atomicReferenceFieldUpdater3.set(lVar, qVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, qVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                lVar.e();
                return;
            }
        }
    }

    @Override // v80.e1
    public final w1 b() {
        return null;
    }

    @Override // v80.e1
    public final boolean g() {
        return true;
    }

    public i1 getParent() {
        return j();
    }

    public final s1 j() {
        s1 s1Var = this.f42113d;
        if (s1Var != null) {
            return s1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("job");
        return null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th2);

    @Override // a90.l
    public final String toString() {
        return getClass().getSimpleName() + '@' + f0.s(this) + "[job@" + f0.s(j()) + ']';
    }
}
