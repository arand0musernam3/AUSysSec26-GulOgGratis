package c5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m3.d3 f7151a = new m3.d3(z2.f7483b);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final y70.a a(c5.y2 r4, kotlin.jvm.functions.Function2 r5, z70.c r6) {
        /*
            boolean r0 = r6 instanceof c5.a3
            if (r0 == 0) goto L13
            r0 = r6
            c5.a3 r0 = (c5.a3) r0
            int r1 = r0.f7111k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7111k = r1
            goto L18
        L13:
            c5.a3 r0 = new c5.a3
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f7110j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f7111k
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 == r3) goto L2a
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
        L28:
            r4 = 0
            return r4
        L2a:
            ba0.g.M(r6)
            goto L5e
        L2e:
            ba0.g.M(r6)
            r6 = r4
            b4.s r6 = (b4.s) r6
            b4.s r6 = r6.getNode()
            boolean r6 = r6.isAttached()
            if (r6 == 0) goto L66
            androidx.compose.ui.node.Owner r6 = b5.m.h(r4)
            b5.m0 r4 = b5.m.g(r4)
            m3.c0 r4 = r4.C
            u3.i r4 = (u3.i) r4
            r4.getClass()
            m3.d3 r2 = c5.c3.f7151a
            java.lang.Object r4 = m3.i.y(r4, r2)
            if (r4 != 0) goto L62
            r0.f7111k = r3
            y70.a r4 = b(r6, r5, r0)
            if (r4 != r1) goto L5e
            return r1
        L5e:
            qc.y.m()
            goto L28
        L62:
            org.bouncycastle.jce.provider.a.c()
            goto L28
        L66:
            java.lang.String r4 = "establishTextInputSession called from an unattached node"
            i4.a.f(r4)
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.c3.a(c5.y2, kotlin.jvm.functions.Function2, z70.c):y70.a");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final y70.a b(androidx.compose.ui.node.Owner r4, kotlin.jvm.functions.Function2 r5, z70.c r6) {
        /*
            boolean r0 = r6 instanceof c5.b3
            if (r0 == 0) goto L13
            r0 = r6
            c5.b3 r0 = (c5.b3) r0
            int r1 = r0.f7125k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7125k = r1
            goto L18
        L13:
            c5.b3 r0 = new c5.b3
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f7124j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f7125k
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 == r3) goto L34
            r4 = 2
            if (r2 == r4) goto L2d
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
        L2b:
            r4 = 0
            return r4
        L2d:
            ba0.g.M(r6)
            qc.y.m()
            goto L2b
        L34:
            ba0.g.M(r6)
            goto L46
        L38:
            ba0.g.M(r6)
            r0.f7125k = r3
            c5.y r4 = (c5.y) r4
            y70.a r4 = r4.J(r5, r0)
            if (r4 != r1) goto L46
            return r1
        L46:
            qc.y.m()
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.c3.b(androidx.compose.ui.node.Owner, kotlin.jvm.functions.Function2, z70.c):y70.a");
    }
}
