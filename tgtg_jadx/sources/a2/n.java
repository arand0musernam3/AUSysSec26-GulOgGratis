package a2;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import z1.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f232a = 400;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(z1.q2 r10, float r11, t1.j r12, t1.s r13, kotlin.jvm.functions.Function1 r14, z70.c r15) {
        /*
            boolean r0 = r15 instanceof a2.l
            if (r0 == 0) goto L13
            r0 = r15
            a2.l r0 = (a2.l) r0
            int r1 = r0.f226n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226n = r1
            goto L18
        L13:
            a2.l r0 = new a2.l
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f225m
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f226n
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            float r11 = r0.f223j
            kotlin.jvm.internal.Ref$FloatRef r10 = r0.l
            t1.j r12 = r0.f224k
            ba0.g.M(r15)
            goto L69
        L2d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r10)
            r10 = 0
            return r10
        L34:
            ba0.g.M(r15)
            kotlin.jvm.internal.Ref$FloatRef r6 = new kotlin.jvm.internal.Ref$FloatRef
            r6.<init>()
            java.lang.Object r15 = r12.b()
            java.lang.Number r15 = (java.lang.Number) r15
            float r15 = r15.floatValue()
            r2 = 0
            int r15 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r15 != 0) goto L4d
            r15 = r3
            goto L4e
        L4d:
            r15 = 0
        L4e:
            r15 = r15 ^ r3
            a2.k r4 = new a2.k
            r9 = 0
            r7 = r10
            r5 = r11
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f224k = r12
            r0.l = r6
            r0.f223j = r5
            r0.f226n = r3
            java.lang.Object r10 = t1.j1.d(r12, r13, r15, r4, r0)
            if (r10 != r1) goto L67
            return r1
        L67:
            r11 = r5
            r10 = r6
        L69:
            a2.a r13 = new a2.a
            float r10 = r10.element
            float r11 = r11 - r10
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r11)
            r13.<init>(r10, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.n.a(z1.q2, float, t1.j, t1.s, kotlin.jvm.functions.Function1, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(z1.q2 r16, float r17, float r18, t1.j r19, t1.i r20, kotlin.jvm.functions.Function1 r21, z70.c r22) {
        /*
            r0 = r17
            r1 = r22
            boolean r2 = r1 instanceof a2.m
            if (r2 == 0) goto L18
            r2 = r1
            a2.m r2 = (a2.m) r2
            int r3 = r2.f231o
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f231o = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            a2.m r2 = new a2.m
            r2.<init>(r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.f230n
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r8.f231o
            r9 = 0
            r4 = 1
            if (r3 == 0) goto L3f
            if (r3 != r4) goto L38
            float r0 = r8.f228k
            float r2 = r8.f227j
            kotlin.jvm.internal.Ref$FloatRef r3 = r8.f229m
            t1.j r4 = r8.l
            ba0.g.M(r1)
            r1 = r0
            r0 = r2
            goto L90
        L38:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r0)
            r0 = 0
            return r0
        L3f:
            ba0.g.M(r1)
            kotlin.jvm.internal.Ref$FloatRef r12 = new kotlin.jvm.internal.Ref$FloatRef
            r12.<init>()
            java.lang.Object r1 = r19.b()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            java.lang.Object r5 = r19.b()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L66
            r5 = r4
            goto L67
        L66:
            r5 = 0
        L67:
            r6 = r5 ^ 1
            a2.k r10 = new a2.k
            r15 = 1
            r13 = r16
            r11 = r18
            r14 = r21
            r10.<init>(r11, r12, r13, r14, r15)
            r5 = r3
            r3 = r19
            r8.l = r3
            r8.f229m = r12
            r8.f227j = r0
            r8.f228k = r1
            r8.f231o = r4
            r4 = r5
            r7 = r10
            r5 = r20
            java.lang.Object r4 = t1.j1.e(r3, r4, r5, r6, r7, r8)
            if (r4 != r2) goto L8d
            return r2
        L8d:
            r4 = r19
            r3 = r12
        L90:
            java.lang.Object r2 = r4.b()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r1 = d(r2, r1)
            a2.a r2 = new a2.a
            float r3 = r3.element
            float r0 = r0 - r3
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            r0 = 29
            t1.j r0 = t1.c.f(r4, r9, r1, r0)
            r2.<init>(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.n.b(z1.q2, float, float, t1.j, t1.i, kotlin.jvm.functions.Function1, z70.c):java.lang.Object");
    }

    public static final void c(t1.h hVar, q2 q2Var, Function1 function1, float f11) {
        float fA;
        try {
            fA = q2Var.a(f11);
        } catch (CancellationException unused) {
            hVar.a();
            fA = 0.0f;
        }
        function1.invoke(Float.valueOf(fA));
        if (Math.abs(f11 - fA) > 0.5f) {
            hVar.a();
        }
    }

    public static final float d(float f11, float f12) {
        if (f12 == 0.0f) {
            return 0.0f;
        }
        return (f12 <= 0.0f ? f11 >= f12 : f11 <= f12) ? f11 : f12;
    }
}
