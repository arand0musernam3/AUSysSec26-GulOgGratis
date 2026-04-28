package a90;

import com.braze.h2;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1037e = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f1038f = AtomicLongFieldUpdater.newUpdater(o.class, "_state$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v f1039g = new v("REMOVE_FROZEN", 0);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f1043d;

    public o(int i11, boolean z11) {
        this.f1040a = i11;
        this.f1041b = z11;
        int i12 = i11 - 1;
        this.f1042c = i12;
        this.f1043d = new AtomicReferenceArray(i11);
        if (i12 > 1073741823) {
            h2.b("Check failed.");
            throw null;
        }
        if ((i11 & i12) == 0) {
            return;
        }
        h2.b("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1038f;
            long j9 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j9) != 0) {
                return (2305843009213693952L & j9) != 0 ? 2 : 1;
            }
            int i11 = (int) (1073741823 & j9);
            int i12 = (int) ((1152921503533105152L & j9) >> 30);
            int i13 = this.f1042c;
            if (((i12 + 2) & i13) == (i11 & i13)) {
                return 1;
            }
            boolean z11 = this.f1041b;
            AtomicReferenceArray atomicReferenceArray = this.f1043d;
            if (z11 || atomicReferenceArray.get(i12 & i13) == null) {
                if (f1038f.compareAndSet(this, j9, ((-1152921503533105153L) & j9) | (((long) ((i12 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i12 & i13, obj);
                    o oVarC = this;
                    while ((atomicLongFieldUpdater.get(oVarC) & 1152921504606846976L) != 0) {
                        oVarC = oVarC.c();
                        AtomicReferenceArray atomicReferenceArray2 = oVarC.f1043d;
                        int i14 = oVarC.f1042c & i12;
                        Object obj2 = atomicReferenceArray2.get(i14);
                        if ((obj2 instanceof n) && ((n) obj2).f1036a == i12) {
                            atomicReferenceArray2.set(i14, obj);
                        } else {
                            oVarC = null;
                        }
                        if (oVarC == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i15 = this.f1040a;
                if (i15 < 1024 || ((i12 - i11) & 1073741823) > (i15 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j9;
        do {
            atomicLongFieldUpdater = f1038f;
            j9 = atomicLongFieldUpdater.get(this);
            if ((j9 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j9) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j9, 2305843009213693952L | j9));
        return true;
    }

    public final o c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j9;
        o oVar;
        while (true) {
            atomicLongFieldUpdater = f1038f;
            j9 = atomicLongFieldUpdater.get(this);
            if ((j9 & 1152921504606846976L) != 0) {
                oVar = this;
                break;
            }
            long j11 = 1152921504606846976L | j9;
            oVar = this;
            if (atomicLongFieldUpdater.compareAndSet(oVar, j9, j11)) {
                j9 = j11;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1037e;
            o oVar2 = (o) atomicReferenceFieldUpdater.get(this);
            if (oVar2 != null) {
                return oVar2;
            }
            o oVar3 = new o(oVar.f1040a * 2, oVar.f1041b);
            int i11 = (int) (1073741823 & j9);
            int i12 = (int) ((1152921503533105152L & j9) >> 30);
            while (true) {
                int i13 = oVar.f1042c;
                int i14 = i11 & i13;
                if (i14 == (i13 & i12)) {
                    break;
                }
                Object nVar = oVar.f1043d.get(i14);
                if (nVar == null) {
                    nVar = new n(i11);
                }
                oVar3.f1043d.set(oVar3.f1042c & i11, nVar);
                i11++;
            }
            atomicLongFieldUpdater.set(oVar3, (-1152921504606846977L) & j9);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, oVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d() {
        /*
            r30 = this;
            r1 = r30
        L2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = a90.o.f1038f
            long r2 = r6.get(r1)
            r7 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r7
            r9 = 0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L15
            a90.v r0 = a90.o.f1039g
            return r0
        L15:
            r11 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r2 & r11
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r13 = 30
            long r4 = r4 >> r13
            int r4 = (int) r4
            int r5 = r1.f1042c
            r4 = r4 & r5
            r13 = r0 & r5
            r14 = 0
            if (r4 != r13) goto L2e
            goto L41
        L2e:
            java.util.concurrent.atomic.AtomicReferenceArray r15 = r1.f1043d
            java.lang.Object r4 = r15.get(r13)
            boolean r5 = r1.f1041b
            if (r4 != 0) goto L3b
            if (r5 == 0) goto L2
            goto L41
        L3b:
            r16 = r7
            boolean r7 = r4 instanceof a90.n
            if (r7 == 0) goto L42
        L41:
            return r14
        L42:
            int r0 = r0 + 1
            r7 = 1073741823(0x3fffffff, float:1.9999999)
            r0 = r0 & r7
            r7 = -1073741824(0xffffffffc0000000, double:NaN)
            long r18 = r2 & r7
            r20 = r7
            long r7 = (long) r0
            long r18 = r18 | r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = a90.o.f1038f
            r28 = r18
            r18 = r4
            r19 = r5
            r4 = r28
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L66
            r15.set(r13, r14)
            return r18
        L66:
            r1 = r30
            if (r19 == 0) goto L2
        L6a:
            long r24 = r6.get(r1)
            long r2 = r24 & r11
            int r0 = (int) r2
            long r2 = r24 & r16
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 == 0) goto L7d
            a90.o r0 = r1.c()
            r1 = r0
            goto L96
        L7d:
            long r2 = r24 & r20
            long r26 = r2 | r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r22 = a90.o.f1038f
            r23 = r1
            boolean r1 = r22.compareAndSet(r23, r24, r26)
            r2 = r23
            if (r1 == 0) goto L99
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r2.f1043d
            int r2 = r2.f1042c
            r0 = r0 & r2
            r1.set(r0, r14)
            r1 = r14
        L96:
            if (r1 != 0) goto L6a
            return r18
        L99:
            r1 = r2
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: a90.o.d():java.lang.Object");
    }
}
