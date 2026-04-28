package a90;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1013a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1014b = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public c(t tVar) {
        this._prev$volatile = tVar;
    }

    public final void a() {
        f1014b.set(this, null);
    }

    public final c c() {
        Object obj = f1013a.get(this);
        if (obj == b.f1008a) {
            return null;
        }
        return (c) obj;
    }

    public abstract boolean d();

    public final void e() {
        c cVarC;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1014b;
            c cVar = (c) atomicReferenceFieldUpdater.get(this);
            while (cVar != null && cVar.d()) {
                cVar = (c) atomicReferenceFieldUpdater.get(cVar);
            }
            c cVarC2 = c();
            cVarC2.getClass();
            while (cVarC2.d() && (cVarC = cVarC2.c()) != null) {
                cVarC2 = cVarC;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(cVarC2);
                c cVar2 = ((c) obj) == null ? null : cVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(cVarC2, obj, cVar2)) {
                    if (atomicReferenceFieldUpdater.get(cVarC2) != obj) {
                        break;
                    }
                }
            }
            if (cVar != null) {
                f1013a.set(cVar, cVarC2);
            }
            if (!cVarC2.d() || cVarC2.c() == null) {
                if (cVar == null || !cVar.d()) {
                    return;
                }
            }
        }
    }
}
