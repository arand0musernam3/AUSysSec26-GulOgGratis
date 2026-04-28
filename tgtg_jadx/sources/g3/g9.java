package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g9 f18691a = new g9();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f18692b = 56;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f18693c = 280;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f18694d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f18695e = 2;

    public static d9 c(long j9, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, m3.n nVar, int i11) {
        long j21 = (i11 & 1) != 0 ? i4.v.f23315h : j9;
        long j22 = (i11 & 2) != 0 ? i4.v.f23315h : j11;
        long j23 = (i11 & 4) != 0 ? i4.v.f23315h : j12;
        long j24 = i4.v.f23315h;
        m3.s sVar = (m3.s) nVar;
        return d((p0) sVar.j(r0.f19375a), (a3.t3) sVar.j(a3.u3.f588a)).a(j21, j22, j23, j24, (i11 & 16) != 0 ? j24 : j13, j14, (i11 & 64) != 0 ? j24 : j15, j24, (i11 & 256) != 0 ? j24 : j16, j24, null, (i11 & NewHope.SENDB_BYTES) != 0 ? j24 : j17, (i11 & 4096) != 0 ? j24 : j18, (i11 & 8192) != 0 ? j24 : j19, j24, j24, j24, j24, j24, j24, j24, j24, j24, j24, j24, j24, j24, j24, j24, j24, j24, j24, j24, j24, j24, j24, j24, j24, j24, j24, j24, j24, j24);
    }

    public static d9 d(p0 p0Var, a3.t3 t3Var) {
        d9 d9Var = p0Var.f19275i0;
        if (d9Var != null) {
            if (Intrinsics.areEqual(d9Var.f18473k, t3Var)) {
                return d9Var;
            }
            d9 d9VarA = d9Var.a(d9Var.f18463a, d9Var.f18464b, d9Var.f18465c, d9Var.f18466d, d9Var.f18467e, d9Var.f18468f, d9Var.f18469g, d9Var.f18470h, d9Var.f18471i, d9Var.f18472j, t3Var, d9Var.l, d9Var.f18474m, d9Var.f18475n, d9Var.f18476o, d9Var.f18477p, d9Var.f18478q, d9Var.f18479r, d9Var.f18480s, d9Var.f18481t, d9Var.f18482u, d9Var.f18483v, d9Var.f18484w, d9Var.f18485x, d9Var.f18486y, d9Var.f18487z, d9Var.A, d9Var.B, d9Var.C, d9Var.D, d9Var.E, d9Var.F, d9Var.G, d9Var.H, d9Var.I, d9Var.J, d9Var.K, d9Var.L, d9Var.M, d9Var.N, d9Var.O, d9Var.P, d9Var.Q);
            p0Var.f19275i0 = d9VarA;
            return d9VarA;
        }
        long jD = r0.d(p0Var, l3.x.f27211y);
        long jD2 = r0.d(p0Var, l3.x.D);
        l3.r rVar = l3.x.f27194g;
        long jD3 = r0.d(p0Var, rVar);
        float f11 = l3.x.f27195h;
        long jB = i4.v.b(f11, jD3);
        long jD4 = r0.d(p0Var, l3.x.f27205s);
        l3.r rVar2 = l3.x.f27190c;
        long jD5 = r0.d(p0Var, rVar2);
        long jD6 = r0.d(p0Var, rVar2);
        long jD7 = r0.d(p0Var, rVar2);
        long jD8 = r0.d(p0Var, rVar2);
        long jD9 = r0.d(p0Var, l3.x.f27189b);
        long jD10 = r0.d(p0Var, l3.x.f27204r);
        long jD11 = r0.d(p0Var, l3.x.f27210x);
        long jD12 = r0.d(p0Var, l3.x.f27188a);
        long jB2 = i4.v.b(l3.x.f27193f, r0.d(p0Var, l3.x.f27192e));
        long jD13 = r0.d(p0Var, l3.x.f27203q);
        long jD14 = r0.d(p0Var, l3.x.A);
        long jD15 = r0.d(p0Var, l3.x.I);
        long jB3 = i4.v.b(l3.x.l, r0.d(p0Var, l3.x.f27198k));
        long jD16 = r0.d(p0Var, l3.x.f27207u);
        long jD17 = r0.d(p0Var, l3.x.C);
        long jD18 = r0.d(p0Var, l3.x.K);
        long jB4 = i4.v.b(l3.x.f27202p, r0.d(p0Var, l3.x.f27201o));
        long jD19 = r0.d(p0Var, l3.x.f27209w);
        long jD20 = r0.d(p0Var, l3.x.f27212z);
        long jD21 = r0.d(p0Var, l3.x.H);
        long jB5 = i4.v.b(l3.x.f27197j, r0.d(p0Var, l3.x.f27196i));
        long jD22 = r0.d(p0Var, l3.x.f27206t);
        l3.r rVar3 = l3.x.E;
        long jD23 = r0.d(p0Var, rVar3);
        long jD24 = r0.d(p0Var, rVar3);
        long jB6 = i4.v.b(f11, r0.d(p0Var, rVar));
        long jD25 = r0.d(p0Var, rVar3);
        long jD26 = r0.d(p0Var, l3.x.B);
        long jD27 = r0.d(p0Var, l3.x.J);
        long jB7 = i4.v.b(l3.x.f27200n, r0.d(p0Var, l3.x.f27199m));
        long jD28 = r0.d(p0Var, l3.x.f27208v);
        l3.r rVar4 = l3.x.F;
        long jD29 = r0.d(p0Var, rVar4);
        long jD30 = r0.d(p0Var, rVar4);
        long jB8 = i4.v.b(f11, r0.d(p0Var, rVar4));
        long jD31 = r0.d(p0Var, rVar4);
        l3.r rVar5 = l3.x.G;
        d9 d9Var2 = new d9(jD, jD2, jB, jD4, jD5, jD6, jD7, jD8, jD9, jD10, t3Var, jD11, jD12, jB2, jD13, jD14, jD15, jB3, jD16, jD17, jD18, jB4, jD19, jD20, jD21, jB5, jD22, jD23, jD24, jB6, jD25, jD26, jD27, jB7, jD28, jD29, jD30, jB8, jD31, r0.d(p0Var, rVar5), r0.d(p0Var, rVar5), i4.v.b(f11, r0.d(p0Var, rVar5)), r0.d(p0Var, rVar5));
        p0Var.f19275i0 = d9Var2;
        return d9Var2;
    }

    public static d2.b2 e() {
        float f11 = i3.q0.f23171a;
        return new d2.b2(f11, i3.q0.f23172b, f11, 0);
    }

    public final void a(boolean z11, boolean z12, b2.k kVar, d9 d9Var, i4.v0 v0Var, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-818661242);
        int i12 = i11 | (sVar.g(z11) ? 4 : 2) | (sVar.g(z12) ? 32 : 16) | (sVar.f(kVar) ? 256 : 128) | (sVar.f(d9Var) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar.f(v0Var) ? 131072 : 65536);
        if (sVar.R(i12 & 1, (38347923 & i12) != 38347922)) {
            sVar.W();
            if ((i11 & 1) != 0 && !sVar.z()) {
                sVar.U();
            }
            sVar.r();
            int i13 = 6;
            f9 f9Var = new f9(new a90.k(0, s1.d1.a(!z11 ? d9Var.f18469g : z12 ? d9Var.f18470h : ((Boolean) a.a.v(kVar, sVar, (i12 >> 6) & 14).getValue()).booleanValue() ? d9Var.f18467e : d9Var.f18468f, s0.D(l3.f0.FastEffects, sVar), null, sVar, 0, 12), m3.c3.class, "value", "getValue()Ljava/lang/Object;", 4));
            float f11 = i3.q0.f23171a;
            d2.p.a(f4.g.e(b4.q.f5711a, new hb0.o(i13, v0Var, f9Var)).then(new j2(z11, z12, kVar, d9Var, v0Var)), sVar, 0);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new f8(this, z11, z12, kVar, d9Var, v0Var, i11);
        }
    }

    public final void b(final String str, final Function2 function2, final boolean z11, final boolean z12, final r5.g0 g0Var, final b2.k kVar, Function2 function22, Function2 function23, Function2 function24, Function2 function25, i4.v0 v0Var, d9 d9Var, d2.z1 z1Var, Function2 function26, m3.n nVar, final int i11, final int i12, final int i13) {
        int i14;
        Function2 function27;
        Function2 function28;
        final Function2 function29;
        Function2 function210;
        int i15;
        int i16;
        int i17;
        int i18;
        m3.s sVar;
        final Function2 function211;
        final i4.v0 v0Var2;
        final d2.z1 z1Var2;
        final Function2 function212;
        final Function2 function213;
        final d9 d9Var2;
        final Function2 function214;
        i4.v0 v0VarB;
        d9 d9VarD;
        d2.z1 b2Var;
        Function2 function2E;
        d2.z1 z1Var3;
        Function2 function215;
        Function2 function216;
        boolean z13;
        Function2 function217;
        i4.v0 v0Var3;
        Function2 function218;
        d9 d9Var3;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(1806980801);
        if ((i11 & 6) == 0) {
            i14 = (sVar2.f(str) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            function27 = function2;
            i14 |= sVar2.h(function27) ? 32 : 16;
        } else {
            function27 = function2;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i14 |= sVar2.g(z11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i14 |= sVar2.g(z12) ? 2048 : 1024;
        }
        int i19 = 8192;
        if ((i11 & 24576) == 0) {
            i14 |= sVar2.f(g0Var) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i14 |= sVar2.f(kVar) ? 131072 : 65536;
        }
        int i21 = 524288;
        if ((i13 & 64) != 0) {
            i14 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            i14 |= sVar2.g(false) ? 1048576 : 524288;
        }
        if ((i13 & 128) != 0) {
            i14 |= 12582912;
        } else if ((i11 & 12582912) == 0) {
            i14 |= sVar2.h(null) ? 8388608 : 4194304;
        }
        int i22 = i13 & 256;
        if (i22 != 0) {
            i14 |= 100663296;
            function28 = function22;
        } else {
            function28 = function22;
            if ((i11 & 100663296) == 0) {
                i14 |= sVar2.h(function28) ? 67108864 : 33554432;
            }
        }
        int i23 = i13 & 512;
        if (i23 != 0) {
            i14 |= 805306368;
            function29 = function23;
        } else {
            function29 = function23;
            if ((i11 & 805306368) == 0) {
                i14 |= sVar2.h(function29) ? 536870912 : 268435456;
            }
        }
        int i24 = i13 & 1024;
        if (i24 != 0) {
            i15 = i12 | 6;
            function210 = function24;
        } else {
            function210 = function24;
            i15 = i12 | (sVar2.h(function210) ? 4 : 2);
        }
        if ((i13 & NewHope.SENDB_BYTES) != 0) {
            i16 = i15 | 48;
        } else {
            i16 = i15 | (sVar2.h(null) ? 32 : 16);
        }
        if ((i13 & 4096) != 0) {
            i17 = i16 | MLKEMEngine.KyberPolyBytes;
        } else {
            i17 = i16 | (sVar2.h(null) ? 256 : 128);
        }
        int i25 = i13 & 8192;
        if (i25 != 0) {
            i18 = i17 | 3072;
        } else {
            i18 = i17 | (sVar2.h(function25) ? 2048 : 1024);
        }
        if ((i13 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) == 0 && sVar2.f(v0Var)) {
            i19 = BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
        }
        int i26 = i18 | i19 | (((i13 & 32768) == 0 && sVar2.f(d9Var)) ? 131072 : 65536);
        if ((i12 & 1572864) == 0) {
            if ((i13 & 65536) == 0 && sVar2.f(z1Var)) {
                i21 = 1048576;
            }
            i26 |= i21;
        }
        int i27 = i13 & 131072;
        if (i27 != 0) {
            i26 |= 12582912;
        } else if ((i12 & 12582912) == 0) {
            i26 |= sVar2.h(function26) ? 8388608 : 4194304;
        }
        if (sVar2.R(i14 & 1, ((i14 & 306783379) == 306783378 && (i26 & 38347923) == 38347922) ? false : true)) {
            sVar2.W();
            if ((i11 & 1) == 0 || sVar2.z()) {
                if (i22 != 0) {
                    function28 = null;
                }
                if (i23 != 0) {
                    function29 = null;
                }
                if (i24 != 0) {
                    function210 = null;
                }
                Function2 function219 = i25 != 0 ? null : function25;
                if ((i13 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0) {
                    v0VarB = m6.b(l3.x.f27191d, sVar2);
                    i26 &= -57345;
                } else {
                    v0VarB = v0Var;
                }
                if ((i13 & 32768) != 0) {
                    d9VarD = d((p0) sVar2.j(r0.f19375a), (a3.t3) sVar2.j(a3.u3.f588a));
                    i26 &= -458753;
                } else {
                    d9VarD = d9Var;
                }
                if ((i13 & 65536) != 0) {
                    float f11 = i3.q0.f23171a;
                    b2Var = new d2.b2(f11, f11, f11, f11);
                    i26 &= -3670017;
                } else {
                    b2Var = z1Var;
                }
                if (i27 != 0) {
                    z1Var3 = b2Var;
                    function2E = u3.e.e(417908150, sVar2, new ar.c(z11, false, kVar, d9VarD, v0VarB));
                } else {
                    function2E = function26;
                    z1Var3 = b2Var;
                }
                function215 = function210;
                function216 = function28;
                z13 = true;
                function217 = function219;
                v0Var3 = v0VarB;
                function218 = function29;
                d9Var3 = d9VarD;
            } else {
                sVar2.U();
                if ((i13 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0) {
                    i26 &= -57345;
                }
                if ((i13 & 32768) != 0) {
                    i26 &= -458753;
                }
                if ((i13 & 65536) != 0) {
                    i26 &= -3670017;
                }
                v0Var3 = v0Var;
                z1Var3 = z1Var;
                function2E = function26;
                function215 = function210;
                function216 = function28;
                z13 = true;
                function217 = function25;
                d9Var3 = d9Var;
                function218 = function29;
            }
            sVar2.r();
            boolean z14 = (i14 & 14) == 4 ? z13 : false;
            if ((i14 & 57344) != 16384) {
                z13 = false;
            }
            boolean z15 = z13 | z14;
            Object objM = sVar2.M();
            if (z15 || objM == m3.m.f29332a) {
                objM = g0Var.c(new m5.h(str));
                sVar2.k0(objM);
            }
            String str2 = ((r5.e0) objM).f37669a.f29538b;
            i3.r0 r0Var = i3.r0.Filled;
            l9 l9Var = new l9();
            sVar2.a0(-1353147063);
            sVar2.q(false);
            int i28 = i14 >> 9;
            int i29 = i26 << 21;
            sVar = sVar2;
            i3.q0.a(r0Var, str2, function27, l9Var, null, function216, function218, function215, function217, z12, z11, false, kVar, z1Var3, d9Var3, function2E, sVar, ((i14 << 3) & 896) | 6 | (i28 & 458752) | (i28 & 3670016) | (i29 & 29360128) | (i29 & 234881024) | (i29 & 1879048192), (i14 & 896) | ((i26 >> 9) & 14) | ((i14 >> 6) & 112) | (i28 & 7168) | ((i14 >> 3) & 57344) | ((i26 >> 3) & 458752) | ((i26 << 3) & 3670016) | (i26 & 29360128));
            function213 = function216;
            function29 = function218;
            function212 = function215;
            function211 = function217;
            z1Var2 = z1Var3;
            d9Var2 = d9Var3;
            function214 = function2E;
            v0Var2 = v0Var3;
        } else {
            sVar = sVar2;
            sVar.U();
            function211 = function25;
            v0Var2 = v0Var;
            z1Var2 = z1Var;
            function212 = function210;
            function213 = function28;
            d9Var2 = d9Var;
            function214 = function26;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: g3.e9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(i11 | 1);
                    int iF2 = m3.i.F(i12);
                    this.f18550a.b(str, function2, z11, z12, g0Var, kVar, function213, function29, function212, function211, v0Var2, d9Var2, z1Var2, function214, (m3.n) obj, iF, iF2, i13);
                    return Unit.f26487a;
                }
            };
        }
    }
}
