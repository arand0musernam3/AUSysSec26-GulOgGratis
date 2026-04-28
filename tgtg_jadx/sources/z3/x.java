package z3;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import z1.c3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f47076a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f47078c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public gn.q f47083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public w f47084i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f47077b = new AtomicReference(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c3 f47079d = new c3(this, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sg.c f47080e = new sg.c(this, 28);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o3.e f47081f = new o3.e(new w[16], 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f47082g = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f47085j = -1;

    public x(Function1 function1) {
        this.f47076a = function1;
    }

    public final void a() {
        synchronized (this.f47082g) {
            o3.e eVar = this.f47081f;
            Object[] objArr = eVar.f31830a;
            int i11 = eVar.f31832c;
            for (int i12 = 0; i12 < i11; i12++) {
                w wVar = (w) objArr[i12];
                wVar.f47068e.g();
                wVar.f47069f.g();
                wVar.l.g();
                wVar.f47075m.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.Object r2 = r1.f47082g
            monitor-enter(r2)
            o3.e r3 = r1.f47081f     // Catch: java.lang.Throwable -> L90
            int r4 = r3.f31832c     // Catch: java.lang.Throwable -> L90
            r6 = 0
            r7 = 0
        Ld:
            java.lang.Object[] r8 = r3.f31830a
            if (r6 >= r4) goto L98
            r8 = r8[r6]     // Catch: java.lang.Throwable -> L90
            z3.w r8 = (z3.w) r8     // Catch: java.lang.Throwable -> L90
            q1.t0 r9 = r8.f47069f     // Catch: java.lang.Throwable -> L90
            java.lang.Object r9 = r9.k(r0)     // Catch: java.lang.Throwable -> L90
            q1.n0 r9 = (q1.n0) r9     // Catch: java.lang.Throwable -> L90
            if (r9 != 0) goto L22
        L1f:
            r16 = r6
            goto L7a
        L22:
            java.lang.Object[] r10 = r9.f35869b     // Catch: java.lang.Throwable -> L90
            int[] r11 = r9.f35870c     // Catch: java.lang.Throwable -> L90
            long[] r9 = r9.f35868a     // Catch: java.lang.Throwable -> L90
            int r12 = r9.length     // Catch: java.lang.Throwable -> L90
            int r12 = r12 + (-2)
            if (r12 < 0) goto L1f
            r13 = 0
        L2e:
            r14 = r9[r13]     // Catch: java.lang.Throwable -> L90
            r16 = r6
            long r5 = ~r14     // Catch: java.lang.Throwable -> L90
            r17 = 7
            long r5 = r5 << r17
            long r5 = r5 & r14
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r17
            int r5 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r5 == 0) goto L71
            int r5 = r13 - r12
            int r5 = ~r5     // Catch: java.lang.Throwable -> L90
            int r5 = r5 >>> 31
            r6 = 8
            int r5 = 8 - r5
            r17 = r6
            r6 = 0
        L4f:
            if (r6 >= r5) goto L6d
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r14 & r18
            r20 = 128(0x80, double:6.3E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L66
            int r18 = r13 << 3
            int r18 = r18 + r6
            r1 = r10[r18]     // Catch: java.lang.Throwable -> L90
            r18 = r11[r18]     // Catch: java.lang.Throwable -> L90
            r8.c(r0, r1)     // Catch: java.lang.Throwable -> L90
        L66:
            long r14 = r14 >> r17
            int r6 = r6 + 1
            r1 = r22
            goto L4f
        L6d:
            r1 = r17
            if (r5 != r1) goto L7a
        L71:
            if (r13 == r12) goto L7a
            int r13 = r13 + 1
            r1 = r22
            r6 = r16
            goto L2e
        L7a:
            q1.t0 r1 = r8.f47069f     // Catch: java.lang.Throwable -> L90
            boolean r1 = r1.f()     // Catch: java.lang.Throwable -> L90
            if (r1 != 0) goto L85
            int r7 = r7 + 1
            goto L92
        L85:
            if (r7 <= 0) goto L92
            java.lang.Object[] r1 = r3.f31830a     // Catch: java.lang.Throwable -> L90
            int r6 = r16 - r7
            r5 = r1[r16]     // Catch: java.lang.Throwable -> L90
            r1[r6] = r5     // Catch: java.lang.Throwable -> L90
            goto L92
        L90:
            r0 = move-exception
            goto La2
        L92:
            int r6 = r16 + 1
            r1 = r22
            goto Ld
        L98:
            int r0 = r4 - r7
            r1 = 0
            java.util.Arrays.fill(r8, r0, r4, r1)     // Catch: java.lang.Throwable -> L90
            r3.f31832c = r0     // Catch: java.lang.Throwable -> L90
            monitor-exit(r2)
            return
        La2:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.x.b(java.lang.Object):void");
    }

    public final boolean c() {
        boolean z11;
        Set set;
        Set set2;
        synchronized (this.f47082g) {
            z11 = this.f47078c;
        }
        if (z11) {
            return false;
        }
        boolean z12 = false;
        while (true) {
            AtomicReference atomicReference = this.f47077b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        m3.v.b("Unexpected notification");
                        qc.y.m();
                        return false;
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                while (!atomicReference.compareAndSet(obj, obj2)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z12;
            }
            synchronized (this.f47082g) {
                o3.e eVar = this.f47081f;
                Object[] objArr = eVar.f31830a;
                int i11 = eVar.f31832c;
                for (int i12 = 0; i12 < i11; i12++) {
                    z12 = ((w) objArr[i12]).a(set) || z12;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.Object r24, kotlin.jvm.functions.Function1 r25, kotlin.jvm.functions.Function0 r26) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.x.d(java.lang.Object, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0):void");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    public final void e() {
        c3 c3Var = this.f47079d;
        l.e(l.f47036a);
        synchronized (l.f47038c) {
            l.f47043h = CollectionsKt.e0(l.f47043h, c3Var);
        }
        this.f47083h = new gn.q(3, c3Var);
    }
}
