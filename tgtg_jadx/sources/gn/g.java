package gn;

import z1.h2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements v4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1.r f20605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h2 f20606c;

    public /* synthetic */ g(z1.r rVar, h2 h2Var, int i11) {
        this.f20604a = i11;
        this.f20605b = rVar;
        this.f20606c = h2Var;
    }

    @Override // v4.a
    public final long J(int i11, long j9) {
        switch (this.f20604a) {
            case 0:
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f20606c == h2.Horizontal ? j9 >> 32 : j9 & 4294967295L));
                if (fIntBitsToFloat >= 0.0f || i11 != 1) {
                    return 0L;
                }
                return b(this.f20605b.c(fIntBitsToFloat));
            default:
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f20606c == h2.Horizontal ? j9 >> 32 : j9 & 4294967295L));
                if (fIntBitsToFloat2 >= 0.0f || i11 != 1) {
                    return 0L;
                }
                return a(this.f20605b.c(fIntBitsToFloat2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // v4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(long r3, long r5, x70.c r7) {
        /*
            r2 = this;
            int r3 = r2.f20604a
            switch(r3) {
                case 0: goto L5c;
                default: goto L5;
            }
        L5:
            boolean r3 = r7 instanceof pm.f
            if (r3 == 0) goto L18
            r3 = r7
            pm.f r3 = (pm.f) r3
            int r4 = r3.f35507m
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L18
            int r4 = r4 - r0
            r3.f35507m = r4
            goto L1f
        L18:
            pm.f r3 = new pm.f
            z70.c r7 = (z70.c) r7
            r3.<init>(r2, r7)
        L1f:
            java.lang.Object r4 = r3.f35506k
            y70.a r7 = y70.a.COROUTINE_SUSPENDED
            int r0 = r3.f35507m
            r1 = 1
            if (r0 == 0) goto L37
            if (r0 != r1) goto L30
            long r5 = r3.f35505j
            ba0.g.M(r4)
            goto L56
        L30:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r3)
            r7 = 0
            goto L5b
        L37:
            ba0.g.M(r4)
            z1.h2 r4 = r2.f20606c
            z1.h2 r0 = z1.h2.Horizontal
            if (r4 != r0) goto L45
            float r4 = z5.q.b(r5)
            goto L49
        L45:
            float r4 = z5.q.c(r5)
        L49:
            r3.f35505j = r5
            r3.f35507m = r1
            z1.r r0 = r2.f20605b
            java.lang.Object r3 = r0.i(r4, r3)
            if (r3 != r7) goto L56
            goto L5b
        L56:
            z5.q r7 = new z5.q
            r7.<init>(r5)
        L5b:
            return r7
        L5c:
            boolean r3 = r7 instanceof gn.e
            if (r3 == 0) goto L6f
            r3 = r7
            gn.e r3 = (gn.e) r3
            int r4 = r3.f20600m
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L6f
            int r4 = r4 - r0
            r3.f20600m = r4
            goto L76
        L6f:
            gn.e r3 = new gn.e
            z70.c r7 = (z70.c) r7
            r3.<init>(r2, r7)
        L76:
            java.lang.Object r4 = r3.f20599k
            y70.a r7 = y70.a.COROUTINE_SUSPENDED
            int r0 = r3.f20600m
            r1 = 1
            if (r0 == 0) goto L8e
            if (r0 != r1) goto L87
            long r5 = r3.f20598j
            ba0.g.M(r4)
            goto Lad
        L87:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r3)
            r7 = 0
            goto Lb2
        L8e:
            ba0.g.M(r4)
            z1.h2 r4 = r2.f20606c
            z1.h2 r0 = z1.h2.Horizontal
            if (r4 != r0) goto L9c
            float r4 = z5.q.b(r5)
            goto La0
        L9c:
            float r4 = z5.q.c(r5)
        La0:
            r3.f20598j = r5
            r3.f20600m = r1
            z1.r r0 = r2.f20605b
            java.lang.Object r3 = r0.i(r4, r3)
            if (r3 != r7) goto Lad
            goto Lb2
        Lad:
            z5.q r7 = new z5.q
            r7.<init>(r5)
        Lb2:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: gn.g.V(long, long, x70.c):java.lang.Object");
    }

    public long a(float f11) {
        h2 h2Var = h2.Horizontal;
        h2 h2Var2 = this.f20606c;
        float f12 = h2Var2 == h2Var ? f11 : 0.0f;
        if (h2Var2 != h2.Vertical) {
            f11 = 0.0f;
        }
        return (((long) Float.floatToRawIntBits(f12)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L);
    }

    public long b(float f11) {
        h2 h2Var = h2.Horizontal;
        h2 h2Var2 = this.f20606c;
        float f12 = h2Var2 == h2Var ? f11 : 0.0f;
        if (h2Var2 != h2.Vertical) {
            f11 = 0.0f;
        }
        return (((long) Float.floatToRawIntBits(f12)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L);
    }

    @Override // v4.a
    public final long o0(int i11, long j9, long j11) {
        switch (this.f20604a) {
            case 0:
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f20606c == h2.Horizontal ? j11 >> 32 : 4294967295L & j11));
                if (i11 == 1) {
                    return b(this.f20605b.c(fIntBitsToFloat));
                }
                return 0L;
            default:
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f20606c == h2.Horizontal ? j11 >> 32 : 4294967295L & j11));
                if (i11 == 1) {
                    return a(this.f20605b.c(fIntBitsToFloat2));
                }
                return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // v4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(long r9, x70.c r11) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gn.g.q(long, x70.c):java.lang.Object");
    }
}
