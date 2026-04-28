package z1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h3 f46584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v1.o1 f46585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l1 f46586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h2 f46587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f46588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v4.d f46589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g3 f46590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b3 f46591h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f46592i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f46593j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public q2 f46594k = y2.f46775b;
    public final k3 l = new k3(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sg.c f46595m = new sg.c(this, 27);

    public l3(h3 h3Var, v1.o1 o1Var, l1 l1Var, h2 h2Var, boolean z11, v4.d dVar, g3 g3Var, b3 b3Var) {
        this.f46584a = h3Var;
        this.f46585b = o1Var;
        this.f46586c = l1Var;
        this.f46587d = h2Var;
        this.f46588e = z11;
        this.f46589f = dVar;
        this.f46590g = g3Var;
        this.f46591h = b3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r12, z70.c r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof z1.i3
            if (r0 == 0) goto L13
            r0 = r14
            z1.i3 r0 = (z1.i3) r0
            int r1 = r0.f46551m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46551m = r1
            goto L18
        L13:
            z1.i3 r0 = new z1.i3
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f46550k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f46551m
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2f
            kotlin.jvm.internal.Ref$LongRef r12 = r0.f46549j
            ba0.g.M(r14)     // Catch: java.lang.Throwable -> L2b
            r6 = r11
            goto L58
        L2b:
            r0 = move-exception
            r12 = r0
            r6 = r11
            goto L68
        L2f:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r12)
            r12 = 0
            return r12
        L36:
            ba0.g.M(r14)
            kotlin.jvm.internal.Ref$LongRef r7 = new kotlin.jvm.internal.Ref$LongRef
            r7.<init>()
            r7.element = r12
            r11.f46592i = r4
            v1.j1 r14 = v1.j1.Default     // Catch: java.lang.Throwable -> L65
            z1.j3 r5 = new z1.j3     // Catch: java.lang.Throwable -> L65
            r10 = 0
            r6 = r11
            r8 = r12
            r5.<init>(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L62
            r0.f46549j = r7     // Catch: java.lang.Throwable -> L62
            r0.f46551m = r4     // Catch: java.lang.Throwable -> L62
            java.lang.Object r12 = r11.f(r14, r5, r0)     // Catch: java.lang.Throwable -> L62
            if (r12 != r1) goto L57
            return r1
        L57:
            r12 = r7
        L58:
            r6.f46592i = r3
            long r12 = r12.element
            z5.q r14 = new z5.q
            r14.<init>(r12)
            return r14
        L62:
            r0 = move-exception
        L63:
            r12 = r0
            goto L68
        L65:
            r0 = move-exception
            r6 = r11
            goto L63
        L68:
            r6.f46592i = r3
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.l3.a(long, z70.c):java.lang.Object");
    }

    public final Object b(long j9, boolean z11, z70.i iVar) {
        if (z11) {
            l1 l1Var = this.f46586c;
            yj.m mVar = y2.f46774a;
            if (l1Var instanceof e0) {
                return Unit.f26487a;
            }
        }
        long jA = z5.q.a(j9, 0.0f, 0.0f, this.f46587d == h2.Horizontal ? 1 : 2);
        mv.l0 l0Var = new mv.l0(this, null);
        v1.o1 o1Var = this.f46585b;
        if (o1Var != null && (this.f46584a.d() || this.f46584a.c())) {
            Object objB = ((v1.i) o1Var).b(jA, l0Var, iVar);
            return objB == y70.a.COROUTINE_SUSPENDED ? objB : Unit.f26487a;
        }
        mv.l0 l0Var2 = new mv.l0(this, iVar);
        l0Var2.f30201m = jA;
        Unit unit = Unit.f26487a;
        Object objInvokeSuspend = l0Var2.invokeSuspend(unit);
        return objInvokeSuspend == y70.a.COROUTINE_SUSPENDED ? objInvokeSuspend : unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013d  */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [o3.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(z1.q2 r25, long r26, int r28) {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.l3.c(z1.q2, long, int):long");
    }

    public final float d(float f11) {
        return this.f46588e ? f11 * (-1) : f11;
    }

    public final long e(long j9) {
        return this.f46588e ? h4.b.g(-1.0f, j9) : j9;
    }

    public final Object f(v1.j1 j1Var, Function2 function2, z70.c cVar) {
        Object objA = this.f46584a.a(j1Var, new d3(this, function2, (x70.c) null), cVar);
        return objA == y70.a.COROUTINE_SUSPENDED ? objA : Unit.f26487a;
    }

    public final float g(long j9) {
        return Float.intBitsToFloat((int) (this.f46587d == h2.Horizontal ? j9 >> 32 : j9 & 4294967295L));
    }

    public final long h(float f11) {
        long jFloatToRawIntBits;
        long j9;
        if (f11 == 0.0f) {
            return 0L;
        }
        if (this.f46587d == h2.Horizontal) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f11);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j9 = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(f11);
            j9 = jFloatToRawIntBits3 << 32;
        }
        return j9 | (jFloatToRawIntBits & 4294967295L);
    }

    public final float i(long j9) {
        int i11 = (int) (4294967295L & j9);
        int i12 = (int) (j9 >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i11)), Math.abs(Float.intBitsToFloat(i12)));
        h2 h2Var = this.f46587d;
        if (dAtan2 >= 0.7853981633974483d) {
            if (h2Var == h2.Vertical) {
                return Float.intBitsToFloat(i11);
            }
            return 0.0f;
        }
        if (h2Var == h2.Horizontal) {
            return Float.intBitsToFloat(i12);
        }
        return 0.0f;
    }
}
