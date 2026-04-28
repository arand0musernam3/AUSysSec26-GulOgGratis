package cg;

import a3.f1;
import a3.r2;
import c5.d2;
import c5.f3;
import c5.x1;
import com.app.tgtg.R;
import com.app.tgtg.model.local.SnackBarInfo;
import com.google.android.gms.internal.measurement.cg;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.w2;
import g3.r5;
import g3.r9;
import g3.v3;
import g3.w3;
import g3.w6;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.b1;
import m3.g1;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import s1.y0;
import t1.u1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f7993a = new u3.d(new r2(23), false, 1028905847);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u3.d f7994b = new u3.d(new c60.a(11), false, 1851043769);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u3.d f7995c = new u3.d(new c60.a(12), false, 839278364);

    public static final void a(w6 w6Var, boolean z11, Function1 function1, Function0 function0, m3.n nVar, int i11) {
        m3.s sVar;
        w6Var.getClass();
        function1.getClass();
        function0.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1060631348);
        int i12 = i11 | (sVar2.f(w6Var) ? 4 : 2) | (sVar2.g(z11) ? 32 : 16) | (sVar2.h(function1) ? 256 : 128) | (sVar2.h(function0) ? NewHope.SENDB_BYTES : 1024);
        if (sVar2.R(i12 & 1, (i12 & 1171) != 1170)) {
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.o(kotlin.coroutines.g.f26549a, sVar2);
                sVar2.k0(objM);
            }
            v80.b0 b0Var = (v80.b0) objM;
            f3 f3Var = (f3) sVar2.j(x1.f7423p);
            g4.l lVar = (g4.l) sVar2.j(x1.f7417i);
            v2.h hVarF = v2.k.f(sVar2);
            boolean zF = sVar2.f(hVarF.b().f41928c);
            Object objM2 = sVar2.M();
            if (zF || objM2 == fVar) {
                objM2 = Boolean.valueOf(!mv.r0.s(hVarF.b().f41928c.toString()));
                sVar2.k0(objM2);
            }
            boolean zBooleanValue = ((Boolean) objM2).booleanValue();
            float f11 = 12;
            sVar = sVar2;
            v3.a(function0, d2.c.D(b4.q.f5711a, 0.0f, lv.t.f28255i, 0.0f, 0.0f, 13), w6Var, 0.0f, false, l2.g.c(f11, f11, 0.0f, 0.0f, 12), lv.s.J, 0L, 0.0f, 0L, f7993a, null, new w3(true, 2), u3.e.e(521908906, sVar2, new b(hVarF, z11, zBooleanValue, f3Var, lVar, b0Var, function1, function0, 0)), sVar, ((i12 >> 9) & 14) | 1572912 | ((i12 << 6) & 896), 3462, 2968);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c(w6Var, z11, function1, function0, i11, 0);
        }
    }

    public static final void b(long j9, int i11, m3.n nVar, int i12) {
        long j11;
        int i13;
        long j12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-473202407);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            j11 = j9;
        } else if ((i11 & 6) == 0) {
            j11 = j9;
            i13 = (sVar.e(j11) ? 4 : 2) | i11;
        } else {
            j11 = j9;
            i13 = i11;
        }
        if (sVar.R(i13 & 1, (i13 & 3) != 2)) {
            j12 = i14 != 0 ? lv.s.f28245z : j11;
            float f11 = 16;
            b4.t tVarD = d2.c.D(m2.d(m2.t(b4.q.f5711a, 3), 1.0f), f11, f11, f11, 0.0f, 8);
            boolean z11 = (i13 & 14) == 4;
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new k(j12, 0);
                sVar.k0(objM);
            }
            d2.c.f(f4.g.d(tVarD, (Function1) objM), sVar);
        } else {
            sVar.U();
            j12 = j11;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new l(i11, i12, j12);
        }
    }

    public static final void c(final float f11, final long j9, float f12, final boolean z11, final u3.d dVar, m3.n nVar, final int i11) {
        final float f13;
        float f14;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1412340938);
        int i12 = (sVar.c(f11) ? 4 : 2) | i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar.e(j9) ? 32 : 16;
        }
        int i13 = i12 | MLKEMEngine.KyberPolyBytes;
        if ((i11 & 3072) == 0) {
            i13 |= sVar.g(z11) ? NewHope.SENDB_BYTES : 1024;
        }
        if (sVar.R(i13 & 1, (i13 & 9363) != 9362)) {
            float f15 = 0;
            final float fS = o30.e0.s(sVar, R.dimen.profile_card_corner_radius);
            float f16 = f11 - (2 * fS);
            if (z5.f.a(f16, 0) > 0) {
                sVar.a0(-1548839513);
                b4.t tVarK = f4.g.k(d2.c.D(m2.t(m2.d(b4.q.f5711a, 1.0f), 3), 0.0f, f16, 0.0f, 0.0f, 13), f15, l2.g.b(fS), true, 0L, 0L, 24);
                f14 = f15;
                g3.s0.b(tVarK, l2.g.b(fS), g3.s0.p(cg.l(sVar, R.color.neutral_10), sVar, 0), g3.s0.q(f14, 0.0f, 0.0f, 0.0f, 62), null, u3.e.e(-1128739255, sVar, new i80.n() { // from class: cg.m
                    @Override // i80.n
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        boolean z12;
                        m3.n nVar2 = (m3.n) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((d2.z) obj).getClass();
                        m3.s sVar2 = (m3.s) nVar2;
                        if (sVar2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                            b4.q qVar = b4.q.f5711a;
                            b4.t tVarA = s1.b0.a(m2.t(m2.d(qVar, 1.0f), 3), t1.c.j(1.0f, 400.0f, null, 4), 2);
                            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar2, 0);
                            int iHashCode = Long.hashCode(sVar2.T);
                            u3.i iVarL = sVar2.l();
                            b4.t tVarC = b4.a.c(tVarA, sVar2);
                            b5.j.R.getClass();
                            b5.h hVar = b5.i.f5839b;
                            sVar2.e0();
                            if (sVar2.S) {
                                sVar2.k(hVar);
                            } else {
                                sVar2.n0();
                            }
                            b5.g gVar = b5.i.f5843f;
                            m3.i.C(yVarA, gVar, sVar2);
                            b5.g gVar2 = b5.i.f5842e;
                            m3.i.C(iVarL, gVar2, sVar2);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            b5.g gVar3 = b5.i.f5844g;
                            m3.i.v(sVar2, numValueOf, gVar3);
                            b5.d dVar2 = b5.i.f5845h;
                            m3.i.z(sVar2, dVar2);
                            b5.g gVar4 = b5.i.f5841d;
                            m3.i.C(tVarC, gVar4, sVar2);
                            if (z11) {
                                sVar2.a0(1531764420);
                                float f17 = fS;
                                b4.t tVarD = m2.d(m2.e(qVar, 2 * f17), 1.0f);
                                i4.r0 r0Var = i4.g0.f23254b;
                                long j11 = j9;
                                d2.c.f(v1.n.j(tVarD, j11, r0Var), sVar2);
                                b4.t tVarJ = v1.n.j(m2.t(m2.d(qVar, 1.0f), 3), j11, l2.g.c(0.0f, 0.0f, f17, f17, 3));
                                z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                                int iHashCode2 = Long.hashCode(sVar2.T);
                                u3.i iVarL2 = sVar2.l();
                                b4.t tVarC2 = b4.a.c(tVarJ, sVar2);
                                sVar2.e0();
                                if (sVar2.S) {
                                    sVar2.k(hVar);
                                } else {
                                    sVar2.n0();
                                }
                                m3.i.C(u0VarD, gVar, sVar2);
                                m3.i.C(iVarL2, gVar2, sVar2);
                                w.a0.y(iHashCode2, sVar2, gVar3, sVar2, dVar2);
                                m3.i.C(tVarC2, gVar4, sVar2);
                                dVar.invoke(sVar2, 0);
                                z12 = true;
                                sVar2.q(true);
                                sVar2.q(false);
                            } else {
                                z12 = true;
                                sVar2.a0(1532666799);
                                sVar2.q(false);
                            }
                            sVar2.q(z12);
                        } else {
                            sVar2.U();
                        }
                        return Unit.f26487a;
                    }
                }), sVar, 196608, 16);
                sVar.q(false);
            } else {
                f14 = f15;
                sVar.a0(-1546922132);
                sVar.q(false);
            }
            f13 = f14;
        } else {
            sVar.U();
            f13 = f12;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: cg.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j.c(f11, j9, f13, z11, dVar, (m3.n) obj, m3.i.F(i11 | 1));
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void d(u uVar, m3.n nVar, int i11) {
        u uVar2;
        b4.q qVar;
        boolean z11;
        uVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1383518689);
        int i12 = i11 | (sVar.h(uVar) ? 4 : 2);
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            float f11 = lv.t.f28252f;
            b4.q qVar2 = b4.q.f5711a;
            b4.t tVarD = d2.c.D(qVar2, 0.0f, f11, 0.0f, 0.0f, 13);
            d2.b bVar = d2.i.f13801a;
            b4.j jVar = b4.d.f5692j;
            i2 i2VarA = h2.a(bVar, jVar, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarD, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(i2VarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            v1.n.d(o00.x0.z(uVar.f8126a, sVar, 0), null, new w2(jVar), null, null, 0.0f, null, sVar, 56, 120);
            b4.t tVarD2 = d2.c.D(qVar2, f11, 0.0f, 0.0f, 0.0f, 14);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarD2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            b4.t tVarD3 = d2.c.D(m2.d(qVar2, 1.0f), 0.0f, lv.t.f28249c, 0.0f, 0.0f, 13);
            String str = uVar.f8127b;
            m5.u0 u0Var = lv.v.l;
            long j9 = lv.s.C;
            r9.d(str, tVarD3, j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, 432, 12582912, 131064);
            b4.t tVarD4 = m2.d(qVar2, 1.0f);
            float f12 = lv.t.f28251e;
            b4.t tVarD5 = d2.c.D(tVarD4, 0.0f, f12, 0.0f, 0.0f, 13);
            boolean zH = sVar.h(uVar);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new c50.p(uVar, 2);
                sVar.k0(objM);
            }
            uVar2 = uVar;
            r9.d(uVar.f8128c, j5.r.c(tVarD5, false, (Function1) objM), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            sVar = sVar;
            String str2 = uVar2.f8130e;
            if (str2 == null) {
                sVar.a0(-465902675);
                sVar.q(false);
                qVar = qVar2;
            } else {
                sVar.a0(-465902674);
                qVar = qVar2;
                r9.d(str2, b4.a.a(d2.c.D(m2.d(qVar2, 1.0f), 0.0f, f12, 0.0f, 0.0f, 13), c5.m2.f7291a, new x(uVar2, 0)), lv.s.f28217b, 0L, null, 0L, x5.l.f43854c, null, 0L, 0, false, 0, 0, null, lv.v.f28283w, sVar, 805306752, 12582912, 130552);
                sVar = sVar;
                sVar.q(false);
            }
            if (uVar2.f8132g) {
                sVar.a0(-465373907);
                z11 = true;
                g3.s0.g(d2.c.D(m2.d(qVar, 1.0f), 0.0f, f11, 0.0f, 0.0f, 13), 1, lv.s.I, sVar, 438, 0);
                sVar.q(false);
            } else {
                z11 = true;
                sVar.a0(-465030768);
                d2.c.f(m2.e(qVar, f11), sVar);
                sVar.q(false);
            }
            sVar.q(z11);
            sVar.q(z11);
        } else {
            uVar2 = uVar;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new v(uVar2, i11, 0);
        }
    }

    public static final void e(Function0 function0, m3.n nVar, int i11) {
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-808177664);
        int i12 = (sVar.h(function0) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            float f11 = 275;
            b4.t tVarE = m2.e(b4.q.f5711a, f11);
            float f12 = lv.t.f28251e;
            float f13 = lv.t.f28249c;
            g3.s0.b(b4.a.a(d2.c.C(tVarE, f12, f13, f12, f13), c5.m2.f7291a, new bm.f(1, function0)), l2.g.b(12), g3.s0.p(lv.s.J, sVar, 6), g3.s0.q(2, 0.0f, 0.0f, 0.0f, 62), null, u3.e.e(1051127502, sVar, new y(f11, 0)), sVar, 196608, 16);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new z(i11, 0, function0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(b4.t r18, final boolean r19, final int r20, final int r21, long r22, int r24, final kotlin.jvm.functions.Function0 r25, m3.n r26, final int r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cg.j.f(b4.t, boolean, int, int, long, int, kotlin.jvm.functions.Function0, m3.n, int, int):void");
    }

    public static final void g(Function0 function0, Function0 function02, m3.n nVar, int i11) {
        function0.getClass();
        function02.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1542778406);
        int i12 = 4;
        int i13 = (sVar.h(function0) ? 4 : 2) | i11;
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = new e(2);
                sVar.k0(objM);
            }
            g3.a.a((Function0) objM, null, new d6.a0(i12), u3.e.e(-1641560556, sVar, new g0(function0, function02, 0)), sVar, 3462);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new g0(function0, function02, i11, 1);
        }
    }

    public static final void h(Function0 function0, Function0 function02, m3.n nVar, int i11) {
        function0.getClass();
        function02.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1193598438);
        int i12 = 4;
        int i13 = (sVar.h(function0) ? 4 : 2) | i11;
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            Object objM = sVar.M();
            if (objM == m3.m.f29332a) {
                objM = new e(3);
                sVar.k0(objM);
            }
            g3.a.a((Function0) objM, null, new d6.a0(i12), u3.e.e(816785748, sVar, new g0(function0, function02, 2)), sVar, 3462);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new g0(function0, function02, i11, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(java.lang.Integer r41, java.lang.Integer r42, m5.h r43, java.lang.Integer r44, final int r45, long r46, final kotlin.jvm.functions.Function0 r48, java.lang.Integer r49, kotlin.jvm.functions.Function0 r50, long r51, long r53, kotlin.jvm.functions.Function0 r55, d6.a0 r56, java.lang.Integer r57, m3.n r58, final int r59, final int r60, final int r61) {
        /*
            Method dump skipped, instruction units count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cg.j.i(java.lang.Integer, java.lang.Integer, m5.h, java.lang.Integer, int, long, kotlin.jvm.functions.Function0, java.lang.Integer, kotlin.jvm.functions.Function0, long, long, kotlin.jvm.functions.Function0, d6.a0, java.lang.Integer, m3.n, int, int, int):void");
    }

    public static final void j(b4.t tVar, String str, int i11, m5.u0 u0Var, m5.u0 u0Var2, String str2, String str3, m3.n nVar, int i12) {
        m3.s sVar;
        String str4;
        String str5;
        int i13;
        String strU;
        String strU2;
        str.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-384881169);
        int i14 = i12 | (sVar2.f(tVar) ? 4 : 2) | (sVar2.f(str) ? 32 : 16) | (sVar2.f(u0Var) ? NewHope.SENDB_BYTES : 1024) | (sVar2.f(u0Var2) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | 589824;
        int i15 = 0;
        if (sVar2.R(i14 & 1, (599187 & i14) != 599186)) {
            sVar2.W();
            if ((i12 & 1) == 0 || sVar2.z()) {
                i13 = i14 & (-4128769);
                strU = o30.f0.U(sVar2, R.string.charity_read_more);
                strU2 = o30.f0.U(sVar2, R.string.charity_read_less);
            } else {
                sVar2.U();
                i13 = i14 & (-4128769);
                strU = str2;
                strU2 = str3;
            }
            int i16 = i13;
            sVar2.r();
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM);
            }
            b1 b1Var = (b1) objM;
            Object objM2 = sVar2.M();
            if (objM2 == fVar) {
                objM2 = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM2);
            }
            b1 b1Var2 = (b1) objM2;
            Object objM3 = sVar2.M();
            if (objM3 == fVar) {
                objM3 = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM3);
            }
            b1 b1Var3 = (b1) objM3;
            b4.t tVarA = b4.a.a(s1.b0.a(m2.t(tVar, 3), null, 3), c5.m2.f7291a, new k0(b1Var3, i15));
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            b4.t tVarC = b4.a.c(tVarA, sVar2);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar2, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar2);
            int i17 = (!((Boolean) b1Var2.getValue()).booleanValue() || ((Boolean) b1Var3.getValue()).booleanValue()) ? Integer.MAX_VALUE : i11;
            Object objM4 = sVar2.M();
            if (objM4 == fVar) {
                objM4 = new i0(i11, b1Var, b1Var2, i15);
                sVar2.k0(objM4);
            }
            r9.d(str, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, i17, 0, (Function1) objM4, u0Var, sVar2, (i16 >> 3) & 14, ((i16 << 12) & 29360128) | MLKEMEngine.KyberPolyBytes, 45054);
            sVar = sVar2;
            if (((Boolean) b1Var2.getValue()).booleanValue()) {
                sVar.a0(309111612);
                r9.d(((Boolean) b1Var3.getValue()).booleanValue() ? strU2 : strU, d2.c.D(b4.q.f5711a, 0.0f, 12, 0.0f, 0.0f, 13), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, 48, (i16 << 9) & 29360128, 131068);
                sVar = sVar;
                sVar.q(false);
            } else {
                sVar.a0(309318537);
                sVar.q(false);
            }
            sVar.q(true);
            str4 = strU;
            str5 = strU2;
        } else {
            sVar = sVar2;
            sVar.U();
            str4 = str2;
            str5 = str3;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.a0(tVar, str, i11, u0Var, u0Var2, str4, str5, i12);
        }
    }

    public static final void k(List list, Function1 function1, b4.t tVar, Map map, m3.n nVar, int i11) {
        m3.s sVar;
        List list2 = list;
        final Function1 function12 = function1;
        list2.getClass();
        function12.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(1149071832);
        int i12 = (sVar2.h(list2) ? 4 : 2) | i11 | (sVar2.h(function12) ? 32 : 16);
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar2.f(tVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(map) ? NewHope.SENDB_BYTES : 1024;
        }
        if (sVar2.R(i12 & 1, (i12 & 1171) != 1170)) {
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            Object obj = objM;
            if (objM == fVar) {
                z3.u uVar = new z3.u();
                uVar.putAll(map);
                sVar2.k0(uVar);
                obj = uVar;
            }
            final z3.u uVar2 = (z3.u) obj;
            float f11 = 1.0f;
            b4.t tVarR = v1.n.r(m2.d(tVar, 1.0f), v1.n.q(sVar2), true);
            d2.b bVar = d2.i.f13801a;
            d2.y yVarA = d2.w.a(d2.i.g(lv.t.f28251e), b4.d.f5694m, sVar2, 6);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            b4.t tVarC = b4.a.c(tVarR, sVar2);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar2, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar2);
            sVar2.a0(-325157041);
            int size = list2.size();
            final int i13 = 0;
            m3.s sVar3 = sVar2;
            while (i13 < size) {
                Boolean bool = (Boolean) uVar2.get(Integer.valueOf(i13));
                final boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                b4.q qVar = b4.q.f5711a;
                b4.t tVarD = m2.d(qVar, f11);
                Object objM2 = sVar3.M();
                if (objM2 == fVar) {
                    objM2 = w.a0.g(sVar3);
                }
                b2.l lVar = (b2.l) objM2;
                boolean zG = sVar3.g(zBooleanValue) | sVar3.d(i13) | ((i12 & 112) == 32);
                Object objM3 = sVar3.M();
                if (zG || objM3 == fVar) {
                    objM3 = new Function0() { // from class: cg.l0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            boolean z11 = !zBooleanValue;
                            int i14 = i13;
                            uVar2.put(Integer.valueOf(i14), Boolean.valueOf(z11));
                            function12.invoke(Integer.valueOf(i14));
                            return Unit.f26487a;
                        }
                    };
                    sVar3.k0(objM3);
                }
                b4.t tVarB = androidx.compose.foundation.b.b(tVarD, lVar, null, false, null, null, (Function0) objM3, 28);
                int i14 = i12;
                i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar3, 48);
                int iHashCode2 = Long.hashCode(sVar3.T);
                u3.i iVarL2 = sVar3.l();
                b4.t tVarC2 = b4.a.c(tVarB, sVar3);
                b5.j.R.getClass();
                b5.h hVar2 = b5.i.f5839b;
                sVar3.e0();
                if (sVar3.S) {
                    sVar3.k(hVar2);
                } else {
                    sVar3.n0();
                }
                m3.i.C(i2VarA, b5.i.f5843f, sVar3);
                m3.i.C(iVarL2, b5.i.f5842e, sVar3);
                m3.i.v(sVar3, Integer.valueOf(iHashCode2), b5.i.f5844g);
                m3.i.z(sVar3, b5.i.f5845h);
                m3.i.C(tVarC2, b5.i.f5841d, sVar3);
                String str = (String) list2.get(i13);
                m5.u0 u0Var = lv.v.f28274n;
                long j9 = lv.s.C;
                b4.t tVarJ = d2.j(qVar, "SelectionOptionText_" + i13);
                if (1.0f <= 0.0d) {
                    e2.a.a("invalid weight; must be greater than zero");
                }
                m3.s sVar4 = sVar3;
                z3.u uVar3 = uVar2;
                int i15 = size;
                int i16 = i13;
                m3.f fVar2 = fVar;
                r9.d(str, d2.c.D(b3.i.e(1.0f, tVarJ, true), 0.0f, 0.0f, lv.t.f28252f, 0.0f, 11), j9, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, u0Var, sVar4, MLKEMEngine.KyberPolyBytes, 12607872, 110584);
                m3.s sVar5 = sVar4;
                o00.x0.a(zBooleanValue, d2.j(qVar, "SelectionCheckbox_" + i16), 0.0f, sVar5, 0);
                sVar5.q(true);
                if (i16 != list.size() - 1) {
                    sVar5.a0(193032851);
                    g3.s0.g(d2.j(qVar, "SelectionDivider_" + i16), 0.0f, lv.s.I, sVar5, MLKEMEngine.KyberPolyBytes, 2);
                    sVar5.q(false);
                } else {
                    sVar5.a0(193214480);
                    sVar5.q(false);
                }
                i13 = i16 + 1;
                list2 = list;
                function12 = function1;
                size = i15;
                fVar = fVar2;
                i12 = i14;
                uVar2 = uVar3;
                f11 = 1.0f;
                sVar3 = sVar5;
            }
            sVar3.q(false);
            sVar3.q(true);
            sVar = sVar3;
        } else {
            sVar2.U();
            sVar = sVar2;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.t0(list, function1, tVar, map, i11, 3);
        }
    }

    public static final void l(b4.t tVar, SnackBarInfo snackBarInfo, m3.n nVar, int i11, int i12) {
        b4.t tVar2;
        int i13;
        b4.t tVar3;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-707094053);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            tVar2 = tVar;
        } else if ((i11 & 6) == 0) {
            tVar2 = tVar;
            i13 = (sVar.f(tVar2) ? 4 : 2) | i11;
        } else {
            tVar2 = tVar;
            i13 = i11;
        }
        int i15 = i13 | (sVar.h(snackBarInfo) ? 32 : 16);
        if (sVar.R(i15 & 1, (i15 & 19) != 18)) {
            tVar3 = i14 != 0 ? b4.q.f5711a : tVar2;
            if (snackBarInfo == null) {
                sVar.a0(1775806106);
                sVar.q(false);
            } else {
                sVar.a0(1775806107);
                Integer voiceOverText = snackBarInfo.getVoiceOverText();
                String strU = o30.f0.U(sVar, voiceOverText != null ? voiceOverText.intValue() : snackBarInfo.getText());
                float f11 = lv.t.f28253g;
                b4.t tVarD = m2.d(d2.c.D(tVar3, f11, 0.0f, f11, f11, 2), 1.0f);
                Object objM = sVar.M();
                if (objM == m3.m.f29332a) {
                    objM = new defpackage.g(20);
                    sVar.k0(objM);
                }
                g3.s0.b(j5.r.c(tVarD, false, (Function1) objM), l2.g.b(12), g3.s0.p(snackBarInfo.getBackground(), sVar, 0), g3.s0.q(4, 0.0f, 0.0f, 0.0f, 62), null, u3.e.e(-1531021207, sVar, new ap.e(snackBarInfo, strU, snackBarInfo, 2)), sVar, 196608, 16);
                sVar.q(false);
            }
        } else {
            sVar.U();
            tVar3 = tVar2;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new defpackage.h(tVar3, snackBarInfo, i11, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final b4.t r35, final java.lang.String r36, final boolean r37, boolean r38, int r39, final kotlin.jvm.functions.Function2 r40, kotlin.jvm.functions.Function2 r41, kotlin.jvm.functions.Function2 r42, m2.c1 r43, m2.d1 r44, m5.u0 r45, final kotlin.jvm.functions.Function1 r46, m3.n r47, final int r48, final int r49) {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cg.j.m(b4.t, java.lang.String, boolean, boolean, int, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, m2.c1, m2.d1, m5.u0, kotlin.jvm.functions.Function1, m3.n, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(b4.t r32, java.lang.String r33, java.lang.String r34, long r35, long r37, m3.n r39, int r40, int r41) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cg.j.n(b4.t, java.lang.String, java.lang.String, long, long, m3.n, int, int):void");
    }

    public static final void o(m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-302087304);
        if (sVar.R(i11 & 1, i11 != 0)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            le.p pVarD = o30.e0.D(new le.q("logo_animation.json"), sVar, 6);
            Boolean bool = Boolean.FALSE;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new q0(b1Var, null, 0);
                sVar.k0(objM2);
            }
            m3.i.h(bool, (Function2) objM2, sVar);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.a0(-1526066965);
                Object objM3 = sVar.M();
                if (objM3 == fVar) {
                    objM3 = new e(4);
                    sVar.k0(objM3);
                }
                ex.i.b((Function0) objM3, null, u3.e.e(355086122, sVar, new f1(pVarD, 13)), sVar, 390, 2);
                sVar.q(false);
            } else {
                sVar.a0(-1525575894);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new r2(i11, 24);
        }
    }

    public static final void p(m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1435345737);
        if (sVar.R(i11 & 1, (i11 & 3) != 2)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            le.p pVarD = o30.e0.D(new le.q("tgtg_logo_loader_green.json"), sVar, 6);
            Boolean bool = Boolean.FALSE;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new q0(b1Var, null, 1);
                sVar.k0(objM2);
            }
            m3.i.h(bool, (Function2) objM2, sVar);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.a0(-309192561);
                o00.x0.f((he.k) pVarD.getValue(), d2.j(m2.m(b4.q.f5711a, 120), "TGTGLoaderNoBackground"), false, 0.0f, Integer.MAX_VALUE, false, null, sVar, 1572864, 0, 4194236);
                sVar.q(false);
            } else {
                sVar.a0(-308992487);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new r2(i11, 25);
        }
    }

    public static final void q(int i11, int i12, b4.t tVar, m3.n nVar) {
        int i13;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1979041018);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else {
            i13 = (sVar.f(tVar) ? 4 : 2) | i11;
        }
        if (sVar.R(i13 & 1, (i13 & 3) != 2)) {
            if (i14 != 0) {
                tVar = b4.q.f5711a;
            }
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            le.p pVarD = o30.e0.D(new le.q("logo_animation.json"), sVar, 6);
            Boolean bool = Boolean.FALSE;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new q0(b1Var, null, 2);
                sVar.k0(objM2);
            }
            m3.i.h(bool, (Function2) objM2, sVar);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.a0(-594529151);
                g3.s0.b(d2.j(m2.m(tVar, 70), "TGTGLoaderNoDialog"), l2.g.b(12), g3.s0.p(lv.s.f28215a, sVar, 6), null, null, u3.e.e(-134361197, sVar, new o0(pVarD, 1)), sVar, 196608, 24);
                sVar.q(false);
            } else {
                sVar.a0(-594097476);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new p0(tVar, i11, i12, 0);
        }
    }

    public static final void r(final Integer num, m5.u0 u0Var, final Integer num2, m5.u0 u0Var2, final b1 b1Var, z4.z zVar, final float f11, final Function0 function0, boolean z11, m3.n nVar, int i11) {
        int i12;
        m5.u0 u0Var3;
        m5.u0 u0Var4;
        b1Var.getClass();
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1898671882);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(num) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i13 = i12 | 48;
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i13 |= sVar.f(num2) ? 256 : 128;
        }
        int i14 = i13 | 3072;
        if ((i11 & 24576) == 0) {
            i14 |= sVar.f(b1Var) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i14 |= sVar.h(zVar) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i14 |= sVar.c(f11) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i14 |= sVar.h(function0) ? 8388608 : 4194304;
        }
        int i15 = i14 | 100663296;
        boolean z12 = true;
        if (sVar.R(i15 & 1, (38347923 & i15) != 38347922)) {
            final m5.u0 u0Var5 = lv.v.f28271j;
            final m5.u0 u0Var6 = lv.v.f28274n;
            final z5.c cVar = (z5.c) sVar.j(x1.f7416h);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = new g1(0.0f);
                sVar.k0(objM);
            }
            final g1 g1Var = (g1) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new g1(0.0f);
                sVar.k0(objM2);
            }
            final g1 g1Var2 = (g1) objM2;
            d6.r.a(new u0(zVar, 0), function0, null, u3.e.e(828464532, sVar, new Function2() { // from class: cg.r0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    m3.n nVar2 = (m3.n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    m3.s sVar2 = (m3.s) nVar2;
                    if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
                        s1.x0 x0VarD = s1.r0.d(new u1(1000, 1500, null, 4), 2);
                        y0 y0VarE = s1.r0.e(new u1(1500, 0, null, 4), 2);
                        final z5.c cVar2 = cVar;
                        final g1 g1Var3 = g1Var;
                        final float f12 = f11;
                        final g1 g1Var4 = g1Var2;
                        final Integer num3 = num2;
                        final Integer num4 = num;
                        final Function0 function02 = function0;
                        final m5.u0 u0Var7 = u0Var5;
                        final m5.u0 u0Var8 = u0Var6;
                        s1.y.d(zBooleanValue, null, x0VarD, y0VarE, null, u3.e.e(1113909180, sVar2, new i80.n() { // from class: cg.t0
                            @Override // i80.n
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                ((Integer) obj5).getClass();
                                ((s1.z) obj3).getClass();
                                float f13 = 24;
                                b4.t tVarD = d2.c.D(m2.d(b4.q.f5711a, 1.0f), f13, 0.0f, f13, 0.0f, 10);
                                m3.s sVar3 = (m3.s) ((m3.n) obj4);
                                Object objM3 = sVar3.M();
                                m3.f fVar2 = m3.m.f29332a;
                                g1 g1Var5 = g1Var3;
                                if (objM3 == fVar2) {
                                    objM3 = new a3.p(16, g1Var5, g1Var4);
                                    sVar3.k0(objM3);
                                }
                                g3.s0.b(z4.c0.o(tVarD, (Function1) objM3), oo.e.b(cVar2, g1Var5.h() * f12), g3.s0.p(lv.s.J, sVar3, 6), g3.s0.q(5, 0.0f, 0.0f, 0.0f, 62), null, u3.e.e(-945942902, sVar3, new bn.v(num3, num4, function02, u0Var7, u0Var8, 1)), sVar3, 196614, 16);
                                return Unit.f26487a;
                            }
                        }), sVar2, 200064, 18);
                    } else {
                        sVar2.U();
                    }
                    return Unit.f26487a;
                }
            }), sVar, ((i15 >> 18) & 112) | 3072, 4);
            u0Var3 = u0Var5;
            u0Var4 = u0Var6;
        } else {
            sVar.U();
            u0Var3 = u0Var;
            u0Var4 = u0Var2;
            z12 = z11;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new s0(num, u0Var3, num2, u0Var4, b1Var, zVar, f11, function0, z12, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(final java.lang.String r27, java.lang.String r28, long r29, long r31, kotlin.jvm.functions.Function0 r33, java.lang.Integer r34, java.util.List r35, g3.ja r36, m3.n r37, final int r38, final int r39) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cg.j.s(java.lang.String, java.lang.String, long, long, kotlin.jvm.functions.Function0, java.lang.Integer, java.util.List, g3.ja, m3.n, int, int):void");
    }

    public static final r5 t() {
        return new r5(lv.s.G, new f3.b(0.2f, 0.2f, 0.2f, 0.2f));
    }
}
