package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r6 implements v4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w6 f19414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1.l1 f19415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1.h2 f19416c;

    public r6(w6 w6Var, s3 s3Var, z1.h2 h2Var) {
        this.f19414a = w6Var;
        this.f19415b = s3Var;
        this.f19416c = h2Var;
    }

    @Override // v4.a
    public final long J(int i11, long j9) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f19416c == z1.h2.Horizontal ? j9 >> 32 : j9 & 4294967295L));
        if (fIntBitsToFloat >= 0.0f || i11 != 1) {
            return 0L;
        }
        return a(this.f19414a.f19706e.c(fIntBitsToFloat));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // v4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(long r5, long r7, x70.c r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof g3.p6
            if (r0 == 0) goto L13
            r0 = r9
            g3.p6 r0 = (g3.p6) r0
            int r1 = r0.f19316m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19316m = r1
            goto L1a
        L13:
            g3.p6 r0 = new g3.p6
            z70.c r9 = (z70.c) r9
            r0.<init>(r4, r9)
        L1a:
            java.lang.Object r9 = r0.f19315k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f19316m
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            long r5 = r0.f19314j
            ba0.g.M(r9)
            goto L53
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r9)
            z1.h2 r9 = r4.f19416c
            z1.h2 r2 = z1.h2.Horizontal
            if (r9 != r2) goto L40
            float r7 = z5.q.b(r7)
            goto L44
        L40:
            float r7 = z5.q.c(r7)
        L44:
            r0.f19314j = r5
            r0.f19316m = r3
            g3.w6 r8 = r4.f19414a
            z1.l1 r9 = r4.f19415b
            java.lang.Object r9 = r8.a(r9, r7, r0)
            if (r9 != r1) goto L53
            return r1
        L53:
            java.lang.Number r9 = (java.lang.Number) r9
            float r7 = r9.floatValue()
            float r5 = z5.q.b(r5)
            long r5 = ba0.g.g(r5, r7)
            z5.q r7 = new z5.q
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.r6.V(long, long, x70.c):java.lang.Object");
    }

    public final long a(float f11) {
        z1.h2 h2Var = z1.h2.Horizontal;
        z1.h2 h2Var2 = this.f19416c;
        float f12 = h2Var2 == h2Var ? f11 : 0.0f;
        if (h2Var2 != z1.h2.Vertical) {
            f11 = 0.0f;
        }
        return (((long) Float.floatToRawIntBits(f12)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L);
    }

    @Override // v4.a
    public final long o0(int i11, long j9, long j11) {
        if (i11 == 1) {
            return a(this.f19414a.f19706e.c(Float.intBitsToFloat((int) (this.f19416c == z1.h2.Horizontal ? j11 >> 32 : 4294967295L & j11))));
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // v4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(long r8, x70.c r10) {
        /*
            r7 = this;
            g3.w6 r0 = r7.f19414a
            z1.r r1 = r0.f19706e
            boolean r2 = r10 instanceof g3.q6
            if (r2 == 0) goto L17
            r2 = r10
            g3.q6 r2 = (g3.q6) r2
            int r3 = r2.f19359m
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f19359m = r3
            goto L1e
        L17:
            g3.q6 r2 = new g3.q6
            z70.c r10 = (z70.c) r10
            r2.<init>(r7, r10)
        L1e:
            java.lang.Object r10 = r2.f19358k
            y70.a r3 = y70.a.COROUTINE_SUSPENDED
            int r4 = r2.f19359m
            r5 = 1
            if (r4 == 0) goto L36
            if (r4 != r5) goto L2f
            long r8 = r2.f19357j
            ba0.g.M(r10)
            goto L6e
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L36:
            ba0.g.M(r10)
            z1.h2 r10 = r7.f19416c
            z1.h2 r4 = z1.h2.Horizontal
            if (r10 != r4) goto L44
            float r10 = z5.q.b(r8)
            goto L48
        L44:
            float r10 = z5.q.c(r8)
        L48:
            float r4 = r1.g()
            z1.g1 r1 = r1.d()
            z1.a0 r1 = (z1.a0) r1
            float r1 = r1.e()
            r6 = 0
            int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r6 >= 0) goto L6c
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L6c
            r2.f19357j = r8
            r2.f19359m = r5
            z1.l1 r1 = r7.f19415b
            java.lang.Object r10 = r0.a(r1, r10, r2)
            if (r10 != r3) goto L6e
            return r3
        L6c:
            r8 = 0
        L6e:
            z5.q r10 = new z5.q
            r10.<init>(r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.r6.q(long, x70.c):java.lang.Object");
    }
}
