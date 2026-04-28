package z1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yj.m f46774a = new yj.m(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u2 f46775b = new u2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t2 f46776c = new t2();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v2 f46777d = new v2();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(z1.l3 r10, long r11, z70.c r13) {
        /*
            boolean r0 = r13 instanceof z1.w2
            if (r0 == 0) goto L13
            r0 = r13
            z1.w2 r0 = (z1.w2) r0
            int r1 = r0.f46755m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46755m = r1
            goto L18
        L13:
            z1.w2 r0 = new z1.w2
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f46755m
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            kotlin.jvm.internal.Ref$FloatRef r10 = r0.f46754k
            z1.l3 r11 = r0.f46753j
            ba0.g.M(r13)
            r8 = r10
            r10 = r11
            goto L54
        L2d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r10)
            r10 = 0
            return r10
        L34:
            ba0.g.M(r13)
            kotlin.jvm.internal.Ref$FloatRef r8 = new kotlin.jvm.internal.Ref$FloatRef
            r8.<init>()
            v1.j1 r13 = v1.j1.Default
            z1.x2 r4 = new z1.x2
            r9 = 0
            r5 = r10
            r6 = r11
            r4.<init>(r5, r6, r8, r9)
            r0.f46753j = r5
            r0.f46754k = r8
            r0.f46755m = r3
            java.lang.Object r10 = r5.f(r13, r4, r0)
            if (r10 != r1) goto L53
            return r1
        L53:
            r10 = r5
        L54:
            float r11 = r8.element
            long r10 = r10.h(r11)
            h4.b r12 = new h4.b
            r12.<init>(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.y2.a(z1.l3, long, z70.c):java.lang.Object");
    }

    public static b4.t b(b4.t tVar, h3 h3Var, h2 h2Var, boolean z11, boolean z12, b2.l lVar) {
        return tVar.then(new s2(h3Var, h2Var, z11, z12, lVar));
    }
}
