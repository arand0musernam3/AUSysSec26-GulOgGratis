package z1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a3 implements v4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l3 f46399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f46400b;

    public a3(l3 l3Var, boolean z11) {
        this.f46399a = l3Var;
        this.f46400b = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // v4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(long r5, long r7, x70.c r9) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r5 = r9 instanceof z1.z2
            if (r5 == 0) goto L13
            r5 = r9
            z1.z2 r5 = (z1.z2) r5
            int r6 = r5.f46793m
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r0
            if (r1 == 0) goto L13
            int r6 = r6 - r0
            r5.f46793m = r6
            goto L1a
        L13:
            z1.z2 r5 = new z1.z2
            z70.c r9 = (z70.c) r9
            r5.<init>(r4, r9)
        L1a:
            java.lang.Object r6 = r5.f46792k
            y70.a r9 = y70.a.COROUTINE_SUSPENDED
            int r0 = r5.f46793m
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2b
            long r7 = r5.f46791j
            ba0.g.M(r6)
            goto L4d
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            boolean r6 = r4.f46400b
            r2 = 0
            if (r6 == 0) goto L55
            z1.l3 r6 = r4.f46399a
            boolean r0 = r6.f46592i
            if (r0 == 0) goto L42
            goto L51
        L42:
            r5.f46791j = r7
            r5.f46793m = r1
            java.lang.Object r6 = r6.a(r7, r5)
            if (r6 != r9) goto L4d
            return r9
        L4d:
            z5.q r6 = (z5.q) r6
            long r2 = r6.f47292a
        L51:
            long r2 = z5.q.d(r7, r2)
        L55:
            z5.q r5 = new z5.q
            r5.<init>(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.a3.V(long, long, x70.c):java.lang.Object");
    }

    @Override // v4.a
    public final long o0(int i11, long j9, long j11) {
        if (!this.f46400b) {
            return 0L;
        }
        l3 l3Var = this.f46399a;
        if (l3Var.f46584a.b()) {
            return 0L;
        }
        return l3Var.h(l3Var.d(l3Var.f46584a.e(l3Var.d(l3Var.g(j11)))));
    }
}
