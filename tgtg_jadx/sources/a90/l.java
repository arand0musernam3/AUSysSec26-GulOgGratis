package a90;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1032a = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1033b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1034c = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean d(l lVar, int i11) {
        while (true) {
            l lVarE = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1033b;
            if (lVarE == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    lVarE = (l) obj;
                    if (!lVarE.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lVarE);
                }
            }
            if (lVarE instanceof i) {
                return (((i) lVarE).f1030d & i11) == 0 && lVarE.d(lVar, i11);
            }
            atomicReferenceFieldUpdater.set(lVar, lVarE);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1032a;
            atomicReferenceFieldUpdater2.set(lVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(lVarE, this, lVar)) {
                if (atomicReferenceFieldUpdater2.get(lVarE) != this) {
                    break;
                }
            }
            lVar.f(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        r6 = ((a90.q) r6).f1045a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a90.l e() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = a90.l.f1033b
            java.lang.Object r1 = r0.get(r9)
            a90.l r1 = (a90.l) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = a90.l.f1032a
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            goto L1c
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
        L1c:
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.i()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            boolean r7 = r6 instanceof a90.q
            if (r7 == 0) goto L4b
            if (r4 == 0) goto L44
            a90.q r6 = (a90.q) r6
            a90.l r6 = r6.f1045a
        L35:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L3d
            r3 = r4
            goto La
        L3d:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L35
            goto L0
        L44:
            java.lang.Object r3 = r0.get(r3)
            a90.l r3 = (a90.l) r3
            goto Lb
        L4b:
            r6.getClass()
            r4 = r6
            a90.l r4 = (a90.l) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: a90.l.e():a90.l");
    }

    public final void f(l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1033b;
            l lVar2 = (l) atomicReferenceFieldUpdater.get(lVar);
            if (f1032a.get(this) != lVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, lVar2, this)) {
                if (atomicReferenceFieldUpdater.get(lVar) != lVar2) {
                    break;
                }
            }
            if (i()) {
                lVar.e();
                return;
            }
            return;
        }
    }

    public final l h() {
        Object obj = f1032a.get(this);
        q qVar = obj instanceof q ? (q) obj : null;
        if (qVar != null) {
            return qVar.f1045a;
        }
        obj.getClass();
        return (l) obj;
    }

    public boolean i() {
        return f1032a.get(this) instanceof q;
    }

    public String toString() {
        return new k(1, this, f0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 0) + '@' + f0.s(this);
    }
}
