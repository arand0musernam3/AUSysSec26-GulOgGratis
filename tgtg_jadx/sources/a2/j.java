package a2;

import kotlin.jvm.internal.Intrinsics;
import t1.s;
import z1.l1;
import z1.q2;
import z1.t2;
import z1.y2;
import z1.z3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t1.i f216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t2 f217d = y2.f46776c;

    public j(o oVar, s sVar, t1.i iVar) {
        this.f214a = oVar;
        this.f215b = sVar;
        this.f216c = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(a2.j r4, z1.q2 r5, float r6, float r7, a2.f r8, z70.c r9) {
        /*
            boolean r0 = r9 instanceof a2.i
            if (r0 == 0) goto L14
            r0 = r9
            a2.i r0 = (a2.i) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.l = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            a2.i r0 = new a2.i
            r0.<init>(r4, r9)
            goto L12
        L1a:
            java.lang.Object r0 = r9.f212j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r9.l
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ba0.g.M(r0)
            goto L84
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
            r4 = 0
            return r4
        L30:
            ba0.g.M(r0)
            float r0 = java.lang.Math.abs(r6)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L3d
            goto L45
        L3d:
            float r0 = java.lang.Math.abs(r7)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L4c
        L45:
            r4 = 28
            t1.j r4 = t1.c.b(r6, r7, r4)
            return r4
        L4c:
            r9.l = r3
            t1.s r0 = r4.f215b
            float r2 = t1.c.d(r0, r2, r7)
            float r2 = java.lang.Math.abs(r2)
            float r3 = java.lang.Math.abs(r6)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L68
            se.d r4 = new se.d
            r2 = 1
            r4.<init>(r0, r2)
        L66:
            r0 = r6
            goto L72
        L68:
            a50.c r0 = new a50.c
            t1.i r4 = r4.f216c
            r2 = 2
            r0.<init>(r4, r2)
            r4 = r0
            goto L66
        L72:
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r0)
            r0 = r7
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r0)
            java.lang.Object r0 = r4.a(r5, r6, r7, r8, r9)
            if (r0 != r1) goto L84
            return r1
        L84:
            a2.a r0 = (a2.a) r0
            t1.j r4 = r0.f194b
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.j.b(a2.j, z1.q2, float, float, a2.f, z70.c):java.lang.Object");
    }

    @Override // z1.l1
    public Object a(q2 q2Var, float f11, x70.c cVar) {
        return d(q2Var, f11, z3.f46794a, (z70.c) cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(z1.q2 r11, float r12, kotlin.jvm.functions.Function1 r13, z70.c r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r14 instanceof a2.e
            if (r0 == 0) goto L13
            r0 = r14
            a2.e r0 = (a2.e) r0
            int r1 = r0.f201m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f201m = r1
            goto L18
        L13:
            a2.e r0 = new a2.e
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f200k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f201m
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L2a
            kotlin.jvm.functions.Function1 r13 = r0.f199j
            ba0.g.M(r14)
            r5 = r10
            goto L4c
        L2a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r11)
            r11 = 0
            return r11
        L31:
            ba0.g.M(r14)
            a2.g r4 = new a2.g
            r9 = 0
            r5 = r10
            r8 = r11
            r6 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f199j = r7
            r0.f201m = r3
            z1.t2 r11 = r5.f217d
            java.lang.Object r14 = v80.f0.K(r11, r4, r0)
            if (r14 != r1) goto L4b
            return r1
        L4b:
            r13 = r7
        L4c:
            a2.a r14 = (a2.a) r14
            java.lang.Float r11 = new java.lang.Float
            r12 = 0
            r11.<init>(r12)
            r13.invoke(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.j.c(z1.q2, float, kotlin.jvm.functions.Function1, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(z1.q2 r5, float r6, kotlin.jvm.functions.Function1 r7, z70.c r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof a2.h
            if (r0 == 0) goto L13
            r0 = r8
            a2.h r0 = (a2.h) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a2.h r0 = new a2.h
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f210j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r8)
            goto L3a
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r8)
            r0.l = r3
            java.lang.Object r8 = r4.c(r5, r6, r7, r0)
            if (r8 != r1) goto L3a
            return r1
        L3a:
            a2.a r8 = (a2.a) r8
            java.lang.Float r5 = r8.f193a
            float r5 = r5.floatValue()
            t1.j r6 = r8.f194b
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L4a
            goto L54
        L4a:
            java.lang.Object r5 = r6.b()
            java.lang.Number r5 = (java.lang.Number) r5
            float r7 = r5.floatValue()
        L54:
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.j.d(z1.q2, float, kotlin.jvm.functions.Function1, z70.c):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (Intrinsics.areEqual(jVar.f216c, this.f216c) && Intrinsics.areEqual(jVar.f215b, this.f215b) && Intrinsics.areEqual(jVar.f214a, this.f214a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f214a.hashCode() + ((this.f215b.hashCode() + (this.f216c.hashCode() * 31)) * 31);
    }
}
