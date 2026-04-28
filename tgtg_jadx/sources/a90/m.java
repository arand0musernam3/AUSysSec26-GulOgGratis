package a90;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1035a = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new o(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1035a;
            o oVar = (o) atomicReferenceFieldUpdater.get(this);
            int iA = oVar.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                o oVarC = oVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, oVar, oVarC) && atomicReferenceFieldUpdater.get(this) == oVar) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1035a;
            o oVar = (o) atomicReferenceFieldUpdater.get(this);
            if (oVar.b()) {
                return;
            }
            o oVarC = oVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, oVar, oVarC) && atomicReferenceFieldUpdater.get(this) == oVar) {
            }
        }
    }

    public final int c() {
        o oVar = (o) f1035a.get(this);
        oVar.getClass();
        long j9 = o.f1038f.get(oVar);
        return (((int) ((j9 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j9))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1035a;
            o oVar = (o) atomicReferenceFieldUpdater.get(this);
            Object objD = oVar.d();
            if (objD != o.f1039g) {
                return objD;
            }
            o oVarC = oVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, oVar, oVarC) && atomicReferenceFieldUpdater.get(this) == oVar) {
            }
        }
    }
}
