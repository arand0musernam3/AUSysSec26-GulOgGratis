package z3;

import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import q1.n0;
import q1.t0;
import q1.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f47064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f47065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n0 f47066c;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f47073j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f47074k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f47067d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t0 f47068e = v0.n.u();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t0 f47069f = new t0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u0 f47070g = new u0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o3.e f47071h = new o3.e(new m3.i0[16], 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m3.r f47072i = new m3.r(this, 1);
    public final t0 l = v0.n.u();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashMap f47075m = new HashMap();

    public w(Function1 function1) {
        this.f47064a = function1;
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final boolean a(java.util.Set r46) {
        /*
            Method dump skipped, instruction units count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.w.a(java.util.Set):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r21, int r22, java.lang.Object r23, q1.n0 r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            int r4 = r0.f47074k
            if (r4 <= 0) goto Le
            goto La4
        Le:
            int r4 = r3.d(r1)
            if (r4 >= 0) goto L17
            int r4 = ~r4
            r6 = -1
            goto L1b
        L17:
            int[] r6 = r3.f35870c
            r6 = r6[r4]
        L1b:
            java.lang.Object[] r7 = r3.f35869b
            r7[r4] = r1
            int[] r3 = r3.f35870c
            r3[r4] = r2
            boolean r3 = r1 instanceof m3.i0
            r4 = 2
            if (r3 == 0) goto L90
            if (r6 == r2) goto L90
            r2 = r1
            m3.i0 r2 = (m3.i0) r2
            m3.h0 r2 = r2.i()
            java.util.HashMap r3 = r0.f47075m
            java.lang.Object r7 = r2.f29289f
            r3.put(r1, r7)
            q1.z0 r2 = r2.f29288e
            q1.t0 r3 = r0.l
            v0.n.F(r3, r1)
            java.lang.Object[] r7 = r2.f35869b
            long[] r2 = r2.f35868a
            int r8 = r2.length
            int r8 = r8 - r4
            if (r8 < 0) goto L90
            r10 = 0
        L48:
            r11 = r2[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L8b
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L62:
            if (r15 >= r13) goto L89
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L85
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r7[r16]
            r9 = r16
            z3.d0 r9 = (z3.d0) r9
            boolean r5 = r9 instanceof z3.e0
            if (r5 == 0) goto L82
            r5 = r9
            z3.e0 r5 = (z3.e0) r5
            r5.g(r4)
        L82:
            v0.n.p(r3, r9, r1)
        L85:
            long r11 = r11 >> r14
            int r15 = r15 + 1
            goto L62
        L89:
            if (r13 != r14) goto L90
        L8b:
            if (r10 == r8) goto L90
            int r10 = r10 + 1
            goto L48
        L90:
            r2 = -1
            if (r6 != r2) goto La4
            boolean r2 = r1 instanceof z3.e0
            if (r2 == 0) goto L9d
            r2 = r1
            z3.e0 r2 = (z3.e0) r2
            r2.g(r4)
        L9d:
            q1.t0 r2 = r0.f47068e
            r3 = r23
            v0.n.p(r2, r1, r3)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.w.b(java.lang.Object, int, java.lang.Object, q1.n0):void");
    }

    public final void c(Object obj, Object obj2) {
        t0 t0Var = this.f47068e;
        v0.n.E(t0Var, obj2, obj);
        if (!(obj2 instanceof m3.i0) || t0Var.b(obj2)) {
            return;
        }
        v0.n.F(this.l, obj2);
        this.f47075m.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(kotlin.jvm.functions.Function1 r34) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.w.d(kotlin.jvm.functions.Function1):void");
    }
}
