package x80;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends a90.t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f44079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f44080f;

    public q(long j9, q qVar, i iVar, int i11) {
        super(j9, qVar, i11);
        this.f44079e = iVar;
        this.f44080f = new AtomicReferenceArray(k.f44056b * 2);
    }

    @Override // a90.t
    public final int g() {
        return k.f44056b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        n(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004b, code lost:
    
        if (r1 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004d, code lost:
    
        r4.getClass();
        r7 = r4.f44052b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0052, code lost:
    
        if (r7 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0054, code lost:
    
        a90.g.a(r7, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0057, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    @Override // a90.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r7, kotlin.coroutines.CoroutineContext r8) {
        /*
            r6 = this;
            int r0 = x80.k.f44056b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            int r0 = r7 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r6.f44080f
            java.lang.Object r0 = r2.get(r0)
        L12:
            java.lang.Object r2 = r6.l(r7)
            boolean r3 = r2 instanceof v80.n2
            x80.i r4 = r6.f44079e
            r5 = 0
            if (r3 != 0) goto L58
            boolean r3 = r2 instanceof x80.y
            if (r3 == 0) goto L22
            goto L58
        L22:
            a90.v r3 = x80.k.f44064j
            if (r2 == r3) goto L48
            a90.v r3 = x80.k.f44065k
            if (r2 != r3) goto L2b
            goto L48
        L2b:
            a90.v r3 = x80.k.f44061g
            if (r2 == r3) goto L12
            a90.v r3 = x80.k.f44060f
            if (r2 != r3) goto L34
            goto L12
        L34:
            a90.v r7 = x80.k.f44063i
            if (r2 == r7) goto L79
            a90.v r7 = x80.k.f44058d
            if (r2 != r7) goto L3d
            goto L79
        L3d:
            a90.v r7 = x80.k.l
            if (r2 != r7) goto L42
            goto L79
        L42:
            java.lang.String r7 = "unexpected state: "
            org.bouncycastle.jce.provider.a.p(r2, r7)
            return
        L48:
            r6.n(r7, r5)
            if (r1 == 0) goto L79
            r4.getClass()
            kotlin.jvm.functions.Function1 r7 = r4.f44052b
            if (r7 == 0) goto L79
            a90.g.a(r7, r0, r8)
            return
        L58:
            if (r1 == 0) goto L5d
            a90.v r3 = x80.k.f44064j
            goto L5f
        L5d:
            a90.v r3 = x80.k.f44065k
        L5f:
            boolean r2 = r6.k(r7, r2, r3)
            if (r2 == 0) goto L12
            r6.n(r7, r5)
            r2 = r1 ^ 1
            r6.m(r7, r2)
            if (r1 == 0) goto L79
            r4.getClass()
            kotlin.jvm.functions.Function1 r7 = r4.f44052b
            if (r7 == 0) goto L79
            a90.g.a(r7, r0, r8)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x80.q.h(int, kotlin.coroutines.CoroutineContext):void");
    }

    public final boolean k(int i11, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i12 = (i11 * 2) + 1;
        do {
            atomicReferenceArray = this.f44080f;
            if (atomicReferenceArray.compareAndSet(i12, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i12) == obj);
        return false;
    }

    public final Object l(int i11) {
        return this.f44080f.get((i11 * 2) + 1);
    }

    public final void m(int i11, boolean z11) {
        if (z11) {
            i iVar = this.f44079e;
            iVar.getClass();
            iVar.M((this.f1048c * ((long) k.f44056b)) + ((long) i11));
        }
        i();
    }

    public final void n(int i11, Object obj) {
        this.f44080f.set(i11 * 2, obj);
    }

    public final void o(int i11, Object obj) {
        this.f44080f.set((i11 * 2) + 1, obj);
    }
}
