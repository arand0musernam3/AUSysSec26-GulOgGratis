package b5;

import androidx.compose.ui.node.Owner;
import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u0 extends z4.m1 implements i1, z4.w0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f5991o = d.f5774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r0 f5992f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Function1 f5993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h2 f5994h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5995i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5996j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5997k;
    public final z4.r0 l = new z4.r0(this, 0);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.recyclerview.widget.b f5998m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public q1.t0 f5999n;

    public static void P0(s1 s1Var) {
        n0 n0Var;
        s1 s1Var2 = s1Var.f5967q;
        m0 m0Var = s1Var.f5966p;
        if (!Intrinsics.areEqual(s1Var2 != null ? s1Var2.f5966p : null, m0Var)) {
            m0Var.H.f5942p.f5817y.f();
            return;
        }
        b bVarK = m0Var.H.f5942p.k();
        if (bVarK == null || (n0Var = ((f1) bVarK).f5817y) == null) {
            return;
        }
        n0Var.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C0(z4.v0 r15) {
        /*
            r14 = this;
            q1.t0 r0 = r14.f5999n
            boolean r1 = r14.f5997k
            if (r1 == 0) goto L9
        L6:
            r1 = r14
            goto Lbe
        L9:
            kotlin.jvm.functions.Function1 r1 = r15.d()
            r2 = 0
            if (r1 != 0) goto L5a
            if (r0 == 0) goto L6
            java.lang.Object[] r15 = r0.f35754c
            long[] r1 = r0.f35752a
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L56
            r4 = r2
        L1c:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L51
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L36:
            if (r9 >= r7) goto L4f
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4b
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r15[r10]
            q1.u0 r10 = (q1.u0) r10
            r14.Q0(r10)
        L4b:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L36
        L4f:
            if (r7 != r8) goto L56
        L51:
            if (r4 == r3) goto L56
            int r4 = r4 + 1
            goto L1c
        L56:
            r0.g()
            return
        L5a:
            kotlin.jvm.functions.Function1 r0 = r14.f5993g
            r3 = 1
            if (r0 == r1) goto L61
            r0 = r3
            goto L62
        L61:
            r0 = r2
        L62:
            r4 = 0
            if (r0 != 0) goto L9b
            b5.r0 r1 = r14.O0()
            boolean r1 = r1.f5952a
            if (r1 == 0) goto L9b
            z4.z r0 = r14.F0()
            long r4 = r0.z(r4)
            long r4 = a.a.J(r4)
            long r0 = r0.u()
            b5.r0 r6 = r14.O0()
            long r6 = r6.f5953b
            boolean r6 = z5.j.b(r4, r6)
            if (r6 == 0) goto L96
            b5.r0 r6 = r14.O0()
            long r6 = r6.f5954c
            boolean r6 = z5.l.a(r0, r6)
            if (r6 != 0) goto L97
        L96:
            r2 = r3
        L97:
            r3 = r4
            r5 = r0
            r0 = r2
            goto La2
        L9b:
            r1 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r5 = r4
            r3 = r1
        La2:
            if (r0 == 0) goto L6
            b5.h2 r0 = r14.f5994h
            if (r0 == 0) goto Lad
            r0.f5836a = r15
        Laa:
            r1 = r14
            r2 = r0
            goto Lb5
        Lad:
            b5.h2 r0 = new b5.h2
            r0.<init>(r15, r14)
            r14.f5994h = r0
            goto Laa
        Lb5:
            r1.y0(r2, r3, r5)
            kotlin.jvm.functions.Function1 r15 = r15.d()
            r1.f5993g = r15
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.u0.C0(z4.v0):void");
    }

    public abstract u0 E0();

    public abstract z4.z F0();

    public abstract boolean H0();

    public abstract m0 I0();

    @Override // b5.i1
    public final void L(boolean z11) {
        u0 u0VarM0 = M0();
        m0 m0VarI0 = u0VarM0 != null ? u0VarM0.I0() : null;
        if (Intrinsics.areEqual(m0VarI0, I0())) {
            this.f5995i = z11;
            return;
        }
        if ((m0VarI0 != null ? m0VarI0.H.f5931d : null) != h0.LayingOut) {
            if ((m0VarI0 != null ? m0VarI0.H.f5931d : null) != h0.LookaheadLayingOut) {
                return;
            }
        }
        this.f5995i = z11;
    }

    public abstract z4.v0 L0();

    public abstract u0 M0();

    public abstract long N0();

    public final r0 O0() {
        r0 r0Var = this.f5992f;
        if (r0Var != null) {
            return r0Var;
        }
        r0 r0Var2 = new r0(this);
        this.f5992f = r0Var2;
        return r0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q0(q1.u0 u0Var) {
        m0 m0Var;
        Object[] objArr = u0Var.f35769b;
        long[] jArr = u0Var.f35768a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j9 = jArr[i11];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j9) < 128 && (m0Var = (m0) ((s2) objArr[(i11 << 3) + i13]).get()) != null) {
                        if (Z()) {
                            m0Var.V(false);
                        } else {
                            m0Var.X(false);
                        }
                    }
                    j9 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    public abstract void R0();

    @Override // z4.u
    public boolean Z() {
        return false;
    }

    @Override // z4.m1
    public final int b0(z4.a aVar) {
        int iV0;
        if (!H0() || (iV0 = v0(aVar)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z11 = aVar instanceof z4.b2;
        long j9 = this.f47187e;
        return iV0 + ((int) (z11 ? j9 >> 32 : j9 & 4294967295L));
    }

    @Override // z4.w0
    public final z4.v0 m0(int i11, int i12, Map map, Function1 function1, Function1 function12) {
        if ((i11 & RoundCornerImageView.DEFAULT_STROKE_COLOR) != 0 || ((-16777216) & i12) != 0) {
            y4.a.b("Size(" + i11 + " x " + i12 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new t0(i11, i12, map, function1, function12, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u0(b5.m0 r32, z4.q r33) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.u0.u0(b5.m0, z4.q):void");
    }

    public abstract int v0(z4.a aVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final void y0(h2 h2Var, long j9, long j11) {
        boolean z11;
        char c3;
        long j12;
        long j13;
        long j14;
        m0 m0Var;
        boolean z12;
        int i11;
        char c7;
        long j15;
        f2 snapshotObserver;
        q1.t0 t0Var = this.f5999n;
        androidx.recyclerview.widget.b bVar = this.f5998m;
        if (bVar == null) {
            bVar = new androidx.recyclerview.widget.b();
            this.f5998m = bVar;
        }
        androidx.recyclerview.widget.b bVar2 = bVar;
        Owner owner = I0().f5878o;
        if (owner != null && (snapshotObserver = ((c5.y) owner).getSnapshotObserver()) != null) {
            snapshotObserver.f5819a.d(h2Var, f5991o, new s0(this, j9, j11, h2Var));
        }
        boolean Z = Z();
        q1.u0 u0Var = (q1.u0) bVar2.f3667e;
        q1.u0 u0Var2 = (q1.u0) bVar2.f3668f;
        int i12 = bVar2.f3663a;
        for (int i13 = 0; i13 < i12; i13++) {
            byte b8 = ((byte[]) bVar2.f3666d)[i13];
            if (b8 == 3) {
                z4.q qVar = ((z4.q[]) bVar2.f3664b)[i13];
                qVar.getClass();
                u0Var2.j(qVar);
            } else if (b8 != 0 && t0Var != null) {
                z4.q qVar2 = ((z4.q[]) bVar2.f3664b)[i13];
                qVar2.getClass();
                q1.u0 u0Var3 = (q1.u0) t0Var.k(qVar2);
                if (u0Var3 != null) {
                    u0Var.k(u0Var3);
                }
            }
        }
        int i14 = bVar2.f3663a;
        int i15 = 0;
        for (int i16 = 0; i16 < i14; i16++) {
            byte[] bArr = (byte[]) bVar2.f3666d;
            if (bArr[i16] == 2) {
                i15++;
            } else if (i15 > 0) {
                z4.q[] qVarArr = (z4.q[]) bVar2.f3664b;
                qVarArr[i16 - i15] = qVarArr[i16];
            }
            bArr[i16] = 2;
        }
        int i17 = bVar2.f3663a;
        for (int i18 = i17 - i15; i18 < i17; i18++) {
            ((z4.q[]) bVar2.f3664b)[i18] = null;
        }
        bVar2.f3663a -= i15;
        u0 u0VarM0 = M0();
        Object[] objArr = u0Var2.f35769b;
        long[] jArr = u0Var2.f35768a;
        int length = jArr.length - 2;
        char c8 = 7;
        long j16 = -9187201950435737472L;
        int i19 = 8;
        if (length >= 0) {
            j13 = 128;
            int i21 = 0;
            while (true) {
                long j17 = jArr[i21];
                j14 = 255;
                if ((((~j17) << c8) & j17 & j16) != j16) {
                    int i22 = 8 - ((~(i21 - length)) >>> 31);
                    int i23 = 0;
                    while (i23 < i22) {
                        if ((j17 & 255) < 128) {
                            c7 = c8;
                            z4.q qVar3 = (z4.q) objArr[(i21 << 3) + i23];
                            j15 = j16;
                            u0 u0Var4 = u0VarM0 == null ? this : u0VarM0;
                            i11 = i19;
                            u0 u0Var5 = u0Var4;
                            while (true) {
                                androidx.recyclerview.widget.b bVar3 = u0Var5.f5998m;
                                if (bVar3 != null) {
                                    z12 = Z;
                                    if (!kotlin.collections.y.v((z4.q[]) bVar3.f3664b, qVar3)) {
                                        break;
                                        break;
                                    }
                                    break;
                                }
                                z12 = Z;
                                u0 u0VarM02 = u0Var5.M0();
                                if (u0VarM02 == null) {
                                    break;
                                }
                                u0Var5 = u0VarM02;
                                Z = z12;
                            }
                            q1.t0 t0Var2 = u0Var5.f5999n;
                            q1.u0 u0Var6 = t0Var2 != null ? (q1.u0) t0Var2.k(qVar3) : null;
                            if (u0Var6 != null) {
                                u0Var4.Q0(u0Var6);
                            }
                        } else {
                            z12 = Z;
                            i11 = i19;
                            c7 = c8;
                            j15 = j16;
                        }
                        j17 >>= i11;
                        i23++;
                        c8 = c7;
                        j16 = j15;
                        i19 = i11;
                        Z = z12;
                    }
                    z11 = Z;
                    c3 = c8;
                    j12 = j16;
                    if (i22 != i19) {
                        break;
                    }
                } else {
                    z11 = Z;
                    c3 = c8;
                    j12 = j16;
                }
                if (i21 == length) {
                    break;
                }
                i21++;
                c8 = c3;
                j16 = j12;
                Z = z11;
                i19 = 8;
            }
        } else {
            z11 = Z;
            c3 = 7;
            j12 = -9187201950435737472L;
            j13 = 128;
            j14 = 255;
        }
        u0Var2.e();
        Object[] objArr2 = u0Var.f35769b;
        long[] jArr2 = u0Var.f35768a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i24 = 0;
            while (true) {
                long j18 = jArr2[i24];
                if ((((~j18) << c3) & j18 & j12) != j12) {
                    int i25 = 8 - ((~(i24 - length2)) >>> 31);
                    for (int i26 = 0; i26 < i25; i26++) {
                        if ((j18 & j14) < j13 && (m0Var = (m0) ((s2) objArr2[(i24 << 3) + i26]).get()) != null) {
                            if (z11) {
                                m0Var.V(false);
                            } else {
                                m0Var.X(false);
                            }
                        }
                        j18 >>= 8;
                    }
                    if (i25 != 8) {
                        break;
                    }
                }
                if (i24 == length2) {
                    break;
                } else {
                    i24++;
                }
            }
        }
        u0Var.e();
    }
}
