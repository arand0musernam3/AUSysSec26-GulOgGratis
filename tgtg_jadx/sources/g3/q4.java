package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q4 f19349a = new q4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f19350b = 56;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f19351c = 280;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f19352d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f19353e = 2;

    public static d9 d(long j9, long j11, long j12, long j13, long j14, long j15, long j16, m3.n nVar, int i11) {
        long j17 = i4.v.f23315h;
        long j18 = (i11 & 256) != 0 ? j17 : j9;
        long j19 = (i11 & 8192) != 0 ? j17 : j13;
        long j21 = (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? j17 : j14;
        long j22 = (8388608 & i11) != 0 ? j17 : j15;
        long j23 = (i11 & 16777216) != 0 ? j17 : j16;
        p0 p0Var = (p0) ((m3.s) nVar).j(r0.f19375a);
        d9 d9VarA = p0Var.f19273h0;
        if (d9VarA == null) {
            m3.s sVar = (m3.s) nVar;
            sVar.a0(390452338);
            sVar.q(false);
            d9VarA = null;
        } else {
            m3.s sVar2 = (m3.s) nVar;
            sVar2.a0(390452339);
            a3.t3 t3Var = (a3.t3) sVar2.j(a3.u3.f588a);
            if (!Intrinsics.areEqual(d9VarA.f18473k, t3Var)) {
                d9VarA = d9VarA.a(d9VarA.f18463a, d9VarA.f18464b, d9VarA.f18465c, d9VarA.f18466d, d9VarA.f18467e, d9VarA.f18468f, d9VarA.f18469g, d9VarA.f18470h, d9VarA.f18471i, d9VarA.f18472j, t3Var, d9VarA.l, d9VarA.f18474m, d9VarA.f18475n, d9VarA.f18476o, d9VarA.f18477p, d9VarA.f18478q, d9VarA.f18479r, d9VarA.f18480s, d9VarA.f18481t, d9VarA.f18482u, d9VarA.f18483v, d9VarA.f18484w, d9VarA.f18485x, d9VarA.f18486y, d9VarA.f18487z, d9VarA.A, d9VarA.B, d9VarA.C, d9VarA.D, d9VarA.E, d9VarA.F, d9VarA.G, d9VarA.H, d9VarA.I, d9VarA.J, d9VarA.K, d9VarA.L, d9VarA.M, d9VarA.N, d9VarA.O, d9VarA.P, d9VarA.Q);
                p0Var.f19273h0 = d9VarA;
            }
            sVar2.q(false);
        }
        if (d9VarA == null) {
            m3.s sVar3 = (m3.s) nVar;
            sVar3.a0(-1788321191);
            long jD = r0.d(p0Var, l3.k0.f27006p);
            long jD2 = r0.d(p0Var, l3.k0.f27012v);
            l3.r rVar = l3.k0.f26994c;
            long jB = i4.v.b(0.38f, r0.d(p0Var, rVar));
            long jD3 = r0.d(p0Var, l3.k0.f27001j);
            long j24 = i4.v.f23314g;
            long jD4 = r0.d(p0Var, l3.k0.f26992a);
            long jD5 = r0.d(p0Var, l3.k0.f27000i);
            a3.t3 t3Var2 = (a3.t3) sVar3.j(a3.u3.f588a);
            long jD6 = r0.d(p0Var, l3.k0.f27009s);
            long jD7 = r0.d(p0Var, l3.k0.B);
            long jB2 = i4.v.b(0.12f, r0.d(p0Var, l3.k0.f26997f));
            long jD8 = r0.d(p0Var, l3.k0.f27003m);
            long jD9 = r0.d(p0Var, l3.k0.f27008r);
            long jD10 = r0.d(p0Var, l3.k0.A);
            long jB3 = i4.v.b(0.38f, r0.d(p0Var, l3.k0.f26996e));
            long jD11 = r0.d(p0Var, l3.k0.l);
            long jD12 = r0.d(p0Var, l3.k0.f27011u);
            long jD13 = r0.d(p0Var, l3.k0.D);
            long jB4 = i4.v.b(0.38f, r0.d(p0Var, l3.k0.f26999h));
            long jD14 = r0.d(p0Var, l3.k0.f27005o);
            long jD15 = r0.d(p0Var, l3.k0.f27007q);
            long jD16 = r0.d(p0Var, l3.k0.f27016z);
            long jB5 = i4.v.b(0.38f, r0.d(p0Var, l3.k0.f26995d));
            long jD17 = r0.d(p0Var, l3.k0.f27002k);
            l3.r rVar2 = l3.k0.f27013w;
            long jD18 = r0.d(p0Var, rVar2);
            long jD19 = r0.d(p0Var, rVar2);
            long jB6 = i4.v.b(0.38f, r0.d(p0Var, rVar));
            long jD20 = r0.d(p0Var, rVar2);
            long jD21 = r0.d(p0Var, l3.k0.f27010t);
            long jD22 = r0.d(p0Var, l3.k0.C);
            long jB7 = i4.v.b(0.38f, r0.d(p0Var, l3.k0.f26998g));
            long jD23 = r0.d(p0Var, l3.k0.f27004n);
            l3.r rVar3 = l3.k0.f27014x;
            long jD24 = r0.d(p0Var, rVar3);
            long jD25 = r0.d(p0Var, rVar3);
            long jB8 = i4.v.b(0.38f, r0.d(p0Var, rVar3));
            long jD26 = r0.d(p0Var, rVar3);
            l3.r rVar4 = l3.k0.f27015y;
            d9 d9Var = new d9(jD, jD2, jB, jD3, j24, j24, j24, j24, jD4, jD5, t3Var2, jD6, jD7, jB2, jD8, jD9, jD10, jB3, jD11, jD12, jD13, jB4, jD14, jD15, jD16, jB5, jD17, jD18, jD19, jB6, jD20, jD21, jD22, jB7, jD23, jD24, jD25, jB8, jD26, r0.d(p0Var, rVar4), r0.d(p0Var, rVar4), i4.v.b(0.38f, r0.d(p0Var, rVar4)), r0.d(p0Var, rVar4));
            p0Var.f19273h0 = d9Var;
            sVar3.q(false);
            d9VarA = d9Var;
        } else {
            m3.s sVar4 = (m3.s) nVar;
            sVar4.a0(-1788515437);
            sVar4.q(false);
        }
        return d9VarA.a(j17, j17, j17, j17, j17, j17, j17, j17, j18, j17, null, j11, j12, j19, j21, j17, j17, j17, j17, j17, j17, j17, j17, j22, j23, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17, j17);
    }

    public static d2.b2 e(q4 q4Var) {
        float f11 = i3.q0.f23171a;
        return new d2.b2(f11, f11, f11, f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(final boolean r27, final boolean r28, final b2.k r29, b4.t r30, final g3.d9 r31, final i4.v0 r32, float r33, float r34, m3.n r35, final int r36, final int r37) {
        /*
            Method dump skipped, instruction units count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.q4.a(boolean, boolean, b2.k, b4.t, g3.d9, i4.v0, float, float, m3.n, int, int):void");
    }

    public final void b(final boolean z11, final b2.k kVar, final d9 d9Var, final i4.v0 v0Var, final float f11, final float f12, m3.n nVar, final int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1461761386);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar.g(z11) ? 4 : 2);
        } else {
            i12 = i11;
        }
        int i13 = i12 | (sVar.f(d9Var) ? NewHope.SENDB_BYTES : 1024) | (sVar.f(v0Var) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar.R(i13 & 1, (4793491 & i13) != 4793490)) {
            sVar.W();
            if ((i11 & 1) != 0 && !sVar.z()) {
                sVar.U();
            }
            sVar.r();
            int i14 = (i13 & 14) | 3504;
            int i15 = i13 << 3;
            a(z11, false, kVar, b4.q.f5711a, d9Var, v0Var, f11, f12, sVar, (i15 & 458752) | i14 | (57344 & i15) | 114819072, 0);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: g3.o4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.f19204a.b(z11, kVar, d9Var, v0Var, f11, f12, (m3.n) obj, m3.i.F(i11 | 1));
                    return Unit.f26487a;
                }
            };
        }
    }

    public final void c(final String str, final Function2 function2, final boolean z11, final boolean z12, final r5.g0 g0Var, final b2.k kVar, final boolean z13, final Function2 function22, final Function2 function23, final Function2 function24, final Function2 function25, final d9 d9Var, d2.z1 z1Var, final u3.d dVar, m3.n nVar, final int i11) {
        int i12;
        boolean z14;
        boolean z15;
        m3.s sVar;
        final d2.z1 z1Var2;
        d2.z1 z1VarE;
        int i13;
        u3.d dVarE;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1732281618);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.f(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(function2) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            z14 = z11;
            i12 |= sVar2.g(z14) ? 256 : 128;
        } else {
            z14 = z11;
        }
        int i14 = i11 & 3072;
        int i15 = NewHope.SENDB_BYTES;
        if (i14 == 0) {
            z15 = z12;
            i12 |= sVar2.g(z15) ? 2048 : 1024;
        } else {
            z15 = z12;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.f(g0Var) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.f(kVar) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i12 |= sVar2.g(z13) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i12 |= sVar2.h(function22) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i12 |= sVar2.h(function23) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i12 |= sVar2.h(null) ? 536870912 : 268435456;
        }
        int i16 = 14155776 | (sVar2.h(function24) ? 4 : 2) | (sVar2.h(null) ? 32 : 16) | (sVar2.h(null) ? 256 : 128);
        if (!sVar2.h(function25)) {
            i15 = 1024;
        }
        int i17 = i16 | i15 | (sVar2.f(d9Var) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | 65536;
        if (sVar2.R(i12 & 1, ((i12 & 306783379) == 306783378 && (i17 & 4793491) == 4793490) ? false : true)) {
            sVar2.W();
            if ((i11 & 1) == 0 || sVar2.z()) {
                z1VarE = e(this);
                i13 = i17 & (-458753);
            } else {
                sVar2.U();
                i13 = i17 & (-458753);
                z1VarE = z1Var;
            }
            sVar2.r();
            int i18 = i13;
            boolean z16 = ((i12 & 14) == 4) | ((i12 & 57344) == 16384);
            Object objM = sVar2.M();
            if (z16 || objM == m3.m.f29332a) {
                objM = g0Var.c(new m5.h(str));
                sVar2.k0(objM);
            }
            String str2 = ((r5.e0) objM).f37669a.f29538b;
            i3.r0 r0Var = i3.r0.Outlined;
            l9 l9Var = new l9();
            if (function22 == null) {
                sVar2.a0(1927042940);
                sVar2.q(false);
                dVarE = null;
            } else {
                sVar2.a0(1927042941);
                dVarE = u3.e.e(-1459717586, sVar2, new m4(0, function22));
                sVar2.q(false);
            }
            int i19 = i12 >> 9;
            int i21 = i18 << 21;
            sVar = sVar2;
            i3.q0.a(r0Var, str2, function2, l9Var, dVarE, function23, null, function24, function25, z15, z14, z13, kVar, z1VarE, d9Var, dVar, sVar, ((i12 << 3) & 896) | 6 | (i19 & 458752) | (i19 & 3670016) | (i21 & 29360128) | (i21 & 234881024) | (i21 & 1879048192), (i19 & 7168) | (i12 & 896) | ((i18 >> 9) & 14) | ((i12 >> 6) & 112) | ((i12 >> 3) & 57344) | ((i18 << 6) & 3670016) | 12582912);
            z1Var2 = z1VarE;
        } else {
            sVar = sVar2;
            sVar.U();
            z1Var2 = z1Var;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: g3.n4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(i11 | 1);
                    this.f19154a.c(str, function2, z11, z12, g0Var, kVar, z13, function22, function23, function24, function25, d9Var, z1Var2, dVar, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }
}
