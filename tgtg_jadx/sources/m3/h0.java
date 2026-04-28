package m3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends z3.f0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f29285h = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f29286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q1.z0 f29288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f29289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29290g;

    public h0(long j9) {
        super(j9);
        q1.n0 n0Var = q1.a1.f35713a;
        n0Var.getClass();
        this.f29288e = n0Var;
        this.f29289f = f29285h;
    }

    @Override // z3.f0
    public final void a(z3.f0 f0Var) {
        f0Var.getClass();
        h0 h0Var = (h0) f0Var;
        this.f29288e = h0Var.f29288e;
        this.f29289f = h0Var.f29289f;
        this.f29290g = h0Var.f29290g;
    }

    @Override // z3.f0
    public final z3.f0 b() {
        return new h0(z3.l.j().g());
    }

    @Override // z3.f0
    public final z3.f0 c(long j9) {
        return new h0(j9);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(m3.i0 r7, z3.g r8) {
        /*
            r6 = this;
            java.lang.Object r0 = z3.l.f47038c
            monitor-enter(r0)
            long r1 = r6.f29286c     // Catch: java.lang.Throwable -> L1a
            long r3 = r8.g()     // Catch: java.lang.Throwable -> L1a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L1c
            int r1 = r6.f29287d     // Catch: java.lang.Throwable -> L1a
            int r4 = r8.h()     // Catch: java.lang.Throwable -> L1a
            if (r1 == r4) goto L18
            goto L1c
        L18:
            r1 = r3
            goto L1d
        L1a:
            r7 = move-exception
            goto L47
        L1c:
            r1 = r2
        L1d:
            monitor-exit(r0)
            java.lang.Object r4 = r6.f29289f
            java.lang.Object r5 = m3.h0.f29285h
            if (r4 == r5) goto L2f
            if (r1 == 0) goto L30
            int r4 = r6.f29290g
            int r7 = r6.e(r7, r8)
            if (r4 != r7) goto L2f
            goto L30
        L2f:
            r2 = r3
        L30:
            if (r2 == 0) goto L46
            if (r1 == 0) goto L46
            monitor-enter(r0)
            long r3 = r8.g()     // Catch: java.lang.Throwable -> L43
            r6.f29286c = r3     // Catch: java.lang.Throwable -> L43
            int r7 = r8.h()     // Catch: java.lang.Throwable -> L43
            r6.f29287d = r7     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)
            return r2
        L43:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L46:
            return r2
        L47:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.h0.d(m3.i0, z3.g):boolean");
    }

    public final int e(i0 i0Var, z3.g gVar) throws Throwable {
        q1.z0 z0Var;
        int iIdentityHashCode;
        long[] jArr;
        int i11;
        long[] jArr2;
        int i12;
        int i13;
        z3.f0 f0VarH;
        synchronized (z3.l.f47038c) {
            z0Var = this.f29288e;
        }
        int i14 = 7;
        if (z0Var.f35872e == 0) {
            return 7;
        }
        o3.e eVarP = i.p();
        Object[] objArr = eVarP.f31830a;
        int i15 = eVarP.f31832c;
        for (int i16 = 0; i16 < i15; i16++) {
            ((r) objArr[i16]).b();
        }
        try {
            Object[] objArr2 = z0Var.f35869b;
            int[] iArr = z0Var.f35870c;
            long[] jArr3 = z0Var.f35868a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                iIdentityHashCode = 7;
                int i17 = 0;
                while (true) {
                    long j9 = jArr3[i17];
                    if ((((~j9) << i14) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i18 = 8;
                        int i19 = 8 - ((~(i17 - length)) >>> 31);
                        int i21 = 0;
                        while (i21 < i19) {
                            if ((j9 & 255) < 128) {
                                int i22 = (i17 << 3) + i21;
                                Object obj = objArr2[i22];
                                i12 = i14;
                                int i23 = iArr[i22];
                                i13 = i18;
                                z3.d0 d0Var = (z3.d0) obj;
                                if (i23 != 1) {
                                    jArr2 = jArr3;
                                } else {
                                    if (d0Var instanceof i0) {
                                        try {
                                            i0 i0Var2 = (i0) d0Var;
                                            f0VarH = i0Var2.h((h0) z3.l.i(i0Var2.f29303d, gVar), gVar, false, i0Var2.f29301b);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            Object[] objArr3 = eVarP.f31830a;
                                            int i24 = eVarP.f31832c;
                                            for (int i25 = 0; i25 < i24; i25++) {
                                                ((r) objArr3[i25]).a();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        f0VarH = z3.l.i(d0Var.b(), gVar);
                                    }
                                    jArr2 = jArr3;
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(f0VarH)) * 31) + Long.hashCode(f0VarH.f46999a);
                                }
                            } else {
                                jArr2 = jArr3;
                                i12 = i14;
                                i13 = i18;
                            }
                            j9 >>= i13;
                            i21++;
                            i14 = i12;
                            jArr3 = jArr2;
                            i18 = i13;
                        }
                        jArr = jArr3;
                        i11 = i14;
                        if (i19 != i18) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i11 = i14;
                    }
                    if (i17 == length) {
                        i14 = iIdentityHashCode;
                        break;
                    }
                    i17++;
                    i14 = i11;
                    jArr3 = jArr;
                }
            }
            iIdentityHashCode = i14;
            Object[] objArr4 = eVarP.f31830a;
            int i26 = eVarP.f31832c;
            for (int i27 = 0; i27 < i26; i27++) {
                ((r) objArr4[i27]).a();
            }
            return iIdentityHashCode;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
