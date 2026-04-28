package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f18977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f18978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f18979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f18980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f18981e;

    static {
        l3.r rVar = l3.n0.f27057a;
        f18977a = l3.n0.f27061e;
        f18978b = 16;
        f18979c = 14;
        f18980d = 6;
        f18981e = b0.a0.C(20);
    }

    public static final void a(final boolean z11, final Function0 function0, final b4.t tVar, final boolean z12, final long j9, final long j11, final u3.d dVar, m3.n nVar, final int i11) {
        int i12;
        Function0 function02;
        m3.s sVar;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1573136853);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.g(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            function02 = function0;
            i12 |= sVar2.h(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar2.f(tVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.g(z12) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.e(j9) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.e(j11) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar2.f(null) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar2.h(dVar) ? 8388608 : 4194304;
        }
        if (sVar2.R(i12 & 1, (4793491 & i12) != 4793490)) {
            sVar2.W();
            if ((i11 & 1) != 0 && !sVar2.z()) {
                sVar2.U();
            }
            sVar2.r();
            u3.d dVarE = u3.e.e(1128552423, sVar2, new f8(tVar, z11, s5.a(0.0f, 2, j9, true), z12, function02, dVar));
            int i13 = i12 >> 12;
            sVar = sVar2;
            d(j9, j11, z11, dVarE, sVar, ((i12 << 6) & 896) | (i13 & 112) | (i13 & 14) | 3072);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: g3.g8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k8.a(z11, function0, tVar, z12, j9, j11, dVar, (m3.n) obj, m3.i.F(i11 | 1));
                    return Unit.f26487a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final boolean r23, final kotlin.jvm.functions.Function0 r24, b4.t r25, boolean r26, final kotlin.jvm.functions.Function2 r27, long r28, long r30, m3.n r32, final int r33, final int r34) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.k8.b(boolean, kotlin.jvm.functions.Function0, b4.t, boolean, kotlin.jvm.functions.Function2, long, long, m3.n, int, int):void");
    }

    public static final void c(Function2 function2, m3.n nVar, int i11) {
        boolean z11;
        boolean z12;
        int i12;
        b4.k kVar = b4.d.f5683a;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1349901398);
        int i13 = (sVar.h(function2) ? 4 : 2) | i11 | (sVar.h(null) ? 32 : 16);
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            int i14 = i13 & 14;
            boolean z13 = ((i13 & 112) == 32) | (i14 == 4);
            Object objM = sVar.M();
            if (z13 || objM == m3.m.f29332a) {
                objM = new j8(function2, 0);
                sVar.k0(objM);
            }
            z4.u0 u0Var = (z4.u0) objM;
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC = b4.a.c(qVar, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(u0Var, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            b5.g gVar3 = b5.i.f5844g;
            if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode))) {
                e0.f.y(iHashCode, sVar, iHashCode, gVar3);
            }
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            if (function2 != null) {
                sVar.a0(870361332);
                b4.t tVarB = d2.c.B(z4.c0.m(qVar, TextBundle.TEXT_ENTRY), f18978b, 0.0f, 2);
                z4.u0 u0VarD = d2.p.d(kVar, false);
                int iHashCode2 = Long.hashCode(sVar.T);
                u3.i iVarL2 = sVar.l();
                b4.t tVarC2 = b4.a.c(tVarB, sVar);
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar);
                } else {
                    sVar.n0();
                }
                m3.i.C(u0VarD, gVar, sVar);
                m3.i.C(iVarL2, gVar2, sVar);
                if (sVar.S || !Intrinsics.areEqual(sVar.M(), Integer.valueOf(iHashCode2))) {
                    e0.f.y(iHashCode2, sVar, iHashCode2, gVar3);
                }
                m3.i.C(tVarC2, gVar4, sVar);
                z12 = true;
                z11 = false;
                w.a0.x(i14, function2, sVar, true, false);
                i12 = 857591905;
            } else {
                z11 = false;
                z12 = true;
                i12 = 857591905;
                sVar.a0(857591905);
                sVar.q(false);
            }
            sVar.a0(i12);
            sVar.q(z11);
            sVar.q(z12);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new b3.n(i11, 12, function2);
        }
    }

    public static final void d(final long j9, long j11, final boolean z11, final u3.d dVar, m3.n nVar, final int i11) {
        int i12;
        long j12;
        t1.v1 v1Var;
        long j13;
        boolean z12;
        t1.b1 b1VarD;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-833145221);
        if ((i11 & 6) == 0) {
            i12 = (sVar.e(j9) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            j12 = j11;
            i12 |= sVar.e(j12) ? 32 : 16;
        } else {
            j12 = j11;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.g(z11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(dVar) ? NewHope.SENDB_BYTES : 1024;
        }
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            int i13 = i12 >> 6;
            t1.q1 q1VarE = t1.t1.e(Boolean.valueOf(z11), null, sVar, i13 & 14, 2);
            m3.k1 k1Var = q1VarE.f39540d;
            boolean zBooleanValue = ((Boolean) k1Var.getValue()).booleanValue();
            sVar.a0(-1069234984);
            long j14 = zBooleanValue ? j9 : j12;
            sVar.q(false);
            j4.c cVarF = i4.v.f(j14);
            boolean zF = sVar.f(cVarF);
            Object objM = sVar.M();
            if (zF || objM == m3.m.f29332a) {
                objM = (t1.v1) s1.d0.f38568a.invoke(cVarF);
                sVar.k0(objM);
            }
            t1.v1 v1Var2 = (t1.v1) objM;
            boolean zBooleanValue2 = ((Boolean) q1VarE.f39537a.j()).booleanValue();
            sVar.a0(-1069234984);
            if (zBooleanValue2) {
                v1Var = v1Var2;
                j13 = j9;
            } else {
                v1Var = v1Var2;
                j13 = j12;
            }
            sVar.q(false);
            t1.v1 v1Var3 = v1Var;
            i4.v vVar = new i4.v(j13);
            boolean zBooleanValue3 = ((Boolean) k1Var.getValue()).booleanValue();
            sVar.a0(-1069234984);
            long j15 = zBooleanValue3 ? j9 : j12;
            sVar.q(false);
            i4.v vVar2 = new i4.v(j15);
            t1.n1 n1VarF = q1VarE.f();
            sVar.a0(1058649156);
            if (n1VarF.b(Boolean.FALSE, Boolean.TRUE)) {
                sVar.a0(272207019);
                b1VarD = s0.D(l3.f0.DefaultEffects, sVar);
                z12 = false;
                sVar.q(false);
            } else {
                z12 = false;
                sVar.a0(272326989);
                b1VarD = s0.D(l3.f0.FastEffects, sVar);
                sVar.q(false);
            }
            sVar.q(z12);
            m3.i.a(b3.i.u(((i4.v) t1.t1.c(q1VarE, vVar, vVar2, b1VarD, v1Var3, sVar, 0).f39513j.getValue()).f23317a, v0.f19606a), dVar, sVar, (i13 & 112) | 8);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            final long j16 = j12;
            w1VarS.f29476d = new Function2() { // from class: g3.h8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k8.d(j9, j16, z11, dVar, (m3.n) obj, m3.i.F(i11 | 1));
                    return Unit.f26487a;
                }
            };
        }
    }
}
