package g3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements v4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n1 f19074a;

    public m1(n1 n1Var) {
        this.f19074a = n1Var;
    }

    @Override // v4.a
    public final long J(int i11, long j9) {
        n1 n1Var = this.f19074a;
        ka kaVar = n1Var.f19132a;
        if (!((Boolean) n1Var.f19135d.invoke()).booleanValue()) {
            return 0L;
        }
        float fH = kaVar.f18985c.h();
        kaVar.b(Float.intBitsToFloat((int) (4294967295L & j9)) + kaVar.f18985c.h());
        if (fH == kaVar.f18985c.h()) {
            return 0L;
        }
        return h4.b.a(0.0f, 2, j9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if (r15 == r2) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // v4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(long r11, long r13, x70.c r15) {
        /*
            r10 = this;
            g3.n1 r0 = r10.f19074a
            g3.ka r1 = r0.f19132a
            boolean r2 = r15 instanceof g3.l1
            if (r2 == 0) goto L18
            r2 = r15
            g3.l1 r2 = (g3.l1) r2
            int r3 = r2.f18997m
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f18997m = r3
        L16:
            r8 = r2
            goto L20
        L18:
            g3.l1 r2 = new g3.l1
            z70.c r15 = (z70.c) r15
            r2.<init>(r10, r15)
            goto L16
        L20:
            java.lang.Object r15 = r8.f18996k
            y70.a r2 = y70.a.COROUTINE_SUSPENDED
            int r3 = r8.f18997m
            r9 = 2
            r4 = 1
            if (r3 == 0) goto L41
            if (r3 == r4) goto L3b
            if (r3 != r9) goto L34
            long r11 = r8.f18995j
            ba0.g.M(r15)
            goto L8f
        L34:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r11)
            r11 = 0
            return r11
        L3b:
            long r13 = r8.f18995j
            ba0.g.M(r15)
            goto L78
        L41:
            ba0.g.M(r15)
            float r15 = z5.q.c(r13)
            r3 = 0
            int r15 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r15 <= 0) goto L69
            m3.g1 r15 = r1.f18985c
            float r15 = r15.h()
            int r15 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r15 != 0) goto L58
            goto L64
        L58:
            m3.g1 r15 = r1.f18985c
            float r15 = r15.h()
            float r5 = r1.f18983a
            int r15 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r15 != 0) goto L69
        L64:
            m3.g1 r15 = r1.f18984b
            r15.i(r3)
        L69:
            r8.f18995j = r13
            r8.f18997m = r4
            r3 = r10
            r4 = r11
            r6 = r13
            java.lang.Object r15 = super.V(r4, r6, r8)
            if (r15 != r2) goto L77
            goto L8e
        L77:
            r13 = r6
        L78:
            z5.q r15 = (z5.q) r15
            long r11 = r15.f47292a
            float r13 = z5.q.c(r13)
            t1.s r14 = r0.f19134c
            t1.b1 r15 = r0.f19133b
            r8.f18995j = r11
            r8.f18997m = r9
            java.lang.Object r15 = g3.i.e(r1, r13, r14, r15, r8)
            if (r15 != r2) goto L8f
        L8e:
            return r2
        L8f:
            z5.q r15 = (z5.q) r15
            long r13 = r15.f47292a
            long r11 = z5.q.e(r11, r13)
            z5.q r13 = new z5.q
            r13.<init>(r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.m1.V(long, long, x70.c):java.lang.Object");
    }

    @Override // v4.a
    public final long o0(int i11, long j9, long j11) {
        n1 n1Var = this.f19074a;
        ka kaVar = n1Var.f19132a;
        if (!((Boolean) n1Var.f19135d.invoke()).booleanValue()) {
            return 0L;
        }
        int i12 = (int) (j9 & 4294967295L);
        kaVar.f18984b.i(Float.intBitsToFloat(i12) + kaVar.f18984b.h());
        kaVar.b(Float.intBitsToFloat(i12) + kaVar.f18985c.h());
        return 0L;
    }
}
