package fi;

import android.content.res.Resources;
import androidx.lifecycle.c1;
import b0.a0;
import b4.k;
import b4.q;
import b4.t;
import b5.j;
import c5.x1;
import cg.h0;
import cn.u;
import com.app.tgtg.R;
import com.app.tgtg.feature.charity.ui.model.CharityIdError;
import d2.g0;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.p;
import d2.w;
import d2.y;
import g3.r9;
import g3.s0;
import g3.v3;
import g3.w6;
import g4.l;
import g4.v;
import i4.r0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.o0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import m2.d1;
import m3.b1;
import m3.c3;
import m3.g1;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import m5.l0;
import m5.u0;
import o00.x0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import q5.o;
import v80.b0;
import xh.i0;
import z3.r;
import z4.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f17758a = new u3.d(new u(24, (byte) 0), false, -1929446202);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f17759b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f17760c = 0;

    public static final void a(w6 w6Var, Function0 function0, Function0 function02, n nVar, int i11) {
        s sVar;
        w6Var.getClass();
        function0.getClass();
        function02.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(1262230107);
        int i12 = i11 | (sVar2.f(w6Var) ? 4 : 2) | (sVar2.h(function0) ? 32 : 16) | (sVar2.h(function02) ? 256 : 128);
        if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
            boolean z11 = (i12 & 896) == 256;
            Object objM = sVar2.M();
            if (z11 || objM == m.f29332a) {
                objM = new ar.d(27, function02);
                sVar2.k0(objM);
            }
            sVar = sVar2;
            v3.a((Function0) objM, null, w6Var, 0.0f, false, null, 0L, 0L, 0.0f, 0L, f17758a, null, null, u3.e.e(-1557700167, sVar2, new h0(function0, function02, 2)), sVar, (i12 << 6) & 896, 3078, 7162);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new an.d(w6Var, function0, function02, i11, 10);
        }
    }

    public static final void b(t tVar, v vVar, final String str, final boolean z11, boolean z12, Function0 function0, Function0 function02, Function1 function1, n nVar, int i11) {
        int i12;
        boolean z13;
        Function0 function03;
        s sVar;
        final b1 b1Var;
        vVar.getClass();
        function02.getClass();
        function1.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(1720735654);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.f(vVar) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar2.f(str) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.g(z11) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            z13 = z12;
            i12 |= sVar2.g(z13) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        } else {
            z13 = z12;
        }
        if ((196608 & i11) == 0) {
            function03 = function0;
            i12 |= sVar2.h(function03) ? 131072 : 65536;
        } else {
            function03 = function0;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar2.h(function02) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar2.h(function1) ? 8388608 : 4194304;
        }
        if (sVar2.R(i12 & 1, (i12 & 4793491) != 4793490)) {
            Object objM = sVar2.M();
            m3.f fVar = m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w("");
                sVar2.k0(objM);
            }
            b1 b1Var2 = (b1) objM;
            Object objM2 = sVar2.M();
            if (objM2 == fVar) {
                objM2 = m3.i.o(kotlin.coroutines.g.f26549a, sVar2);
                sVar2.k0(objM2);
            }
            b0 b0Var = (b0) objM2;
            Object objM3 = sVar2.M();
            if (objM3 == fVar) {
                objM3 = m3.i.w(null);
                sVar2.k0(objM3);
            }
            b1 b1Var3 = (b1) objM3;
            Object objM4 = sVar2.M();
            if (objM4 == fVar) {
                objM4 = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM4);
            }
            final b1 b1Var4 = (b1) objM4;
            final c3 c3VarB = t1.d.b(((Boolean) b1Var4.getValue()).booleanValue() ? 50.0f : 1.0f, t1.c.k(500, 500, null, 4), "textfieldScale", null, sVar2, 3120, 20);
            Object objM5 = sVar2.M();
            if (objM5 == fVar) {
                objM5 = new r();
                sVar2.k0(objM5);
            }
            final r rVar = (r) objM5;
            final float fD = (Resources.getSystem().getDisplayMetrics().widthPixels - d70.b.d(lv.t.f28255i)) / 9;
            String str2 = str == null ? (String) b1Var2.getValue() : str;
            boolean zH = sVar2.h(b0Var) | ((i12 & 458752) == 131072) | ((29360128 & i12) == 8388608);
            Object objM6 = sVar2.M();
            if (zH || objM6 == fVar) {
                objM6 = new d2.r(b1Var3, b0Var, b1Var2, function03, function1, b1Var4, 1);
                b1Var = b1Var2;
                sVar2.k0(objM6);
            } else {
                b1Var = b1Var2;
            }
            Function1 function12 = (Function1) objM6;
            t tVarD = g4.d.d(tVar, vVar);
            boolean z14 = ((i12 & 7168) == 2048) | ((i12 & 3670016) == 1048576);
            Object objM7 = sVar2.M();
            if (z14 || objM7 == fVar) {
                objM7 = new c(z11, function02, 0);
                sVar2.k0(objM7);
            }
            t tVarI = g4.d.i(tVarD, (Function1) objM7);
            u0 u0Var = new u0(i4.v.f23309b, a0.C(24), q5.r.f36046k, null, 0L, 3, 0, 0L, 16744440);
            d1 d1Var = d1.f28804g;
            final boolean z15 = z13;
            sVar = sVar2;
            m2.t.a(str2, function12, tVarI, false, false, u0Var, new d1(d1Var.f28805a, d1Var.f28806b, 3, d1Var.f28808d, null, null), null, false, 0, 0, null, null, null, null, u3.e.e(-651922077, sVar2, new i80.n() { // from class: fi.d
                @Override // i80.n
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    float fD2;
                    String str3;
                    n nVar2 = (n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((Function2) obj).getClass();
                    boolean z16 = true;
                    s sVar3 = (s) nVar2;
                    if (sVar3.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        Object objM8 = sVar3.M();
                        m3.f fVar2 = m.f29332a;
                        if (objM8 == fVar2) {
                            objM8 = new g1(0.0f);
                            sVar3.k0(objM8);
                        }
                        g1 g1Var = (g1) objM8;
                        q qVar = q.f5711a;
                        float f11 = 1.0f;
                        t tVarD2 = m2.d(qVar, 1.0f);
                        Object objM9 = sVar3.M();
                        if (objM9 == fVar2) {
                            objM9 = new a(g1Var, 0);
                            sVar3.k0(objM9);
                        }
                        t tVarO = c0.o(tVarD2, (Function1) objM9);
                        int i13 = 6;
                        i2 i2VarA = h2.a(d2.i.f13806f, b4.d.f5692j, sVar3, 6);
                        int iHashCode = Long.hashCode(sVar3.T);
                        u3.i iVarL = sVar3.l();
                        t tVarC = b4.a.c(tVarO, sVar3);
                        j.R.getClass();
                        b5.h hVar = b5.i.f5839b;
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(hVar);
                        } else {
                            sVar3.n0();
                        }
                        m3.i.C(i2VarA, b5.i.f5843f, sVar3);
                        m3.i.C(iVarL, b5.i.f5842e, sVar3);
                        m3.i.v(sVar3, Integer.valueOf(iHashCode), b5.i.f5844g);
                        m3.i.z(sVar3, b5.i.f5845h);
                        m3.i.C(tVarC, b5.i.f5841d, sVar3);
                        sVar3.a0(277200573);
                        int i14 = 0;
                        while (i14 < 8) {
                            b1 b1Var5 = b1Var4;
                            boolean zBooleanValue = ((Boolean) b1Var5.getValue()).booleanValue();
                            r rVar2 = rVar;
                            if (zBooleanValue) {
                                sVar3.a0(3351156);
                                fD2 = (d70.a.d(g1Var.h(), sVar3) - d70.a.d(((Number) rVar2.get(i14)).floatValue(), sVar3)) - 25;
                                sVar3.q(false);
                            } else {
                                sVar3.a0(3488703);
                                sVar3.q(false);
                                fD2 = 0;
                            }
                            int i15 = i14;
                            s sVar4 = sVar3;
                            t tVarV = d2.c.v(m2.m(qVar, d70.a.d(fD, sVar4)), ((z5.f) t1.d.a(fD2, t1.c.k(500, 0, null, i13), null, sVar4, 48, 12).getValue()).f47277a, 0);
                            float fFloatValue = ((Number) c3VarB.getValue()).floatValue();
                            t tVarJ = f4.g.j(tVarV, fFloatValue, fFloatValue);
                            Object objM10 = sVar4.M();
                            if (objM10 == fVar2) {
                                objM10 = new b(rVar2, 0);
                                sVar4.k0(objM10);
                            }
                            t tVarO2 = c0.o(tVarJ, (Function1) objM10);
                            z4.u0 u0VarD = p.d(b4.d.f5687e, false);
                            int iHashCode2 = Long.hashCode(sVar4.T);
                            u3.i iVarL2 = sVar4.l();
                            t tVarC2 = b4.a.c(tVarO2, sVar4);
                            j.R.getClass();
                            b5.h hVar2 = b5.i.f5839b;
                            sVar4.e0();
                            if (sVar4.S) {
                                sVar4.k(hVar2);
                            } else {
                                sVar4.n0();
                            }
                            m3.i.C(u0VarD, b5.i.f5843f, sVar4);
                            m3.i.C(iVarL2, b5.i.f5842e, sVar4);
                            m3.i.v(sVar4, Integer.valueOf(iHashCode2), b5.i.f5844g);
                            m3.i.z(sVar4, b5.i.f5845h);
                            m3.i.C(tVarC2, b5.i.f5841d, sVar4);
                            n4.b bVarZ = x0.z(R.drawable.charity_id_blob, sVar4, 0);
                            g0 g0Var = m2.f13850c;
                            boolean z17 = z15;
                            b1 b1Var6 = b1Var;
                            float f12 = (z17 && ((String) b1Var6.getValue()).length() == 0) ? 0.3f : f11;
                            int i16 = i13;
                            float f13 = f11;
                            v1.n.d(bVarZ, null, g0Var, null, null, f12, null, sVar4, 440, 88);
                            s sVar5 = sVar4;
                            if (z11) {
                                str3 = str;
                                if (str3 == null) {
                                    str3 = "";
                                }
                            } else {
                                str3 = (String) b1Var6.getValue();
                            }
                            if (((Boolean) b1Var5.getValue()).booleanValue()) {
                                sVar5.a0(-1484104621);
                                sVar5.q(false);
                            } else {
                                sVar5.a0(-1484984897);
                                str3.getClass();
                                if (((i15 < 0 || i15 >= str3.length()) ? null : Character.valueOf(str3.charAt(i15))) == null) {
                                    sVar5.a0(-1484911706);
                                    s0.g(m2.q(qVar, 16), 2, lv.s.f28217b, sVar5, 438, 0);
                                    sVar5 = sVar5;
                                    sVar5.q(false);
                                } else {
                                    sVar5.a0(-1484632055);
                                    r9.d(String.valueOf(str3.charAt(i15)), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, new u0(lv.s.f28217b, a0.C(18), q5.r.f36046k, null, 0L, 3, 0, 0L, 16744440), sVar5, 0, 0, 131070);
                                    sVar5 = sVar5;
                                    sVar5.q(false);
                                }
                                sVar5.q(false);
                            }
                            sVar5.q(true);
                            i14 = i15 + 1;
                            z16 = true;
                            sVar3 = sVar5;
                            f11 = f13;
                            i13 = i16;
                        }
                        s sVar6 = sVar3;
                        sVar6.q(false);
                        sVar6.q(z16);
                    } else {
                        sVar3.U();
                    }
                    return Unit.f26487a;
                }
            }), sVar, 0, 196608, 32664);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new com.tgtg.componentlibrary.component.p000switch.g(tVar, vVar, str, z11, z12, function0, function02, function1, i11);
        }
    }

    public static final void c(v vVar, String str, CharityIdError charityIdError, Function1 function1, Function0 function0, Function0 function02, n nVar, int i11) {
        int i12;
        Function1 function12;
        boolean z11;
        String str2 = str;
        vVar.getClass();
        function1.getClass();
        s sVar = (s) nVar;
        sVar.c0(1951849436);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(vVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(str2) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.d(charityIdError == null ? -1 : charityIdError.ordinal()) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(function1) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(function0) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.h(function02) ? 131072 : 65536;
        }
        if (sVar.R(i12 & 1, (74899 & i12) != 74898)) {
            l lVar = (l) sVar.j(x1.f7417i);
            long j9 = lv.s.I;
            r0 r0Var = i4.g0.f23254b;
            q qVar = q.f5711a;
            t tVarF = d2.c.F(d2.c.r(v1.n.j(qVar, j9, r0Var).then(m2.f13850c)));
            z4.u0 u0VarD = p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarF, sVar);
            j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(u0VarD, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            t tVarU = m2.u(m2.d(qVar, 1.0f), null, 3);
            k kVar = b4.d.f5687e;
            d2.u uVar = d2.u.f13938a;
            t tVarA = uVar.a(tVarU, kVar);
            float f11 = lv.t.f28253g;
            t tVarB = d2.c.B(tVarA, f11, 0.0f, 2);
            y yVarA = w.a(d2.i.f13805e, b4.d.f5695n, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarB, sVar);
            sVar.e0();
            int i13 = i12;
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            r9.d(f0.U(sVar, R.string.charity_id_title), d2.c.z(qVar, f11), lv.s.f28215a, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0.a(lv.v.f28264c, 0L, 0L, null, null, 0L, null, 3, 0L, null, null, 16744447), sVar, 432, 0, 130040);
            d2.c.f(m2.e(qVar, lv.t.f28254h), sVar);
            t tVarD = b4.a.d(qVar, 2.0f);
            boolean z12 = str != null;
            boolean z13 = charityIdError == CharityIdError.CHARITY_NOT_FOUND;
            boolean zH = sVar.h(lVar);
            Object objM = sVar.M();
            m3.f fVar = m.f29332a;
            if (zH || objM == fVar) {
                objM = new cw.b(lVar, 15);
                sVar.k0(objM);
            }
            Function0 function03 = (Function0) objM;
            boolean z14 = (i13 & 7168) == 2048;
            Object objM2 = sVar.M();
            if (z14 || objM2 == fVar) {
                objM2 = new defpackage.d(function1, 10);
                sVar.k0(objM2);
            }
            Function1 function13 = (Function1) objM2;
            int i14 = i13 << 3;
            str2 = str;
            b(tVarD, vVar, str2, z12, z13, function03, function0, function13, sVar, (i14 & 112) | 6 | (i14 & 896) | ((i13 << 6) & 3670016));
            d2.c.f(m2.e(qVar, f11), sVar);
            String strU = f0.U(sVar, R.string.charity_id_description);
            u0 u0Var = lv.v.f28274n;
            long j11 = lv.s.C;
            char c3 = 15;
            function12 = function1;
            r9.d(strU, null, j11, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130042);
            if (charityIdError == null || str2 == null) {
                sVar.a0(-894627638);
                sVar.q(false);
            } else {
                sVar.a0(-897033455);
                int i15 = f.$EnumSwitchMapping$0[charityIdError.ordinal()];
                if (i15 == 1) {
                    sVar.a0(-896993279);
                    r9.d(f0.U(sVar, R.string.charity_id_provided_error), d2.c.z(v1.n.j(d2.c.A(qVar, f11, lv.t.f28256j), j11, l2.g.b(12)), lv.t.f28252f), j9, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
                    z11 = false;
                    sVar.q(false);
                } else if (i15 == 2) {
                    sVar.a0(-896212296);
                    r9.d(f0.U(sVar, R.string.charity_id_provided_error_attempts), d2.c.z(v1.n.j(d2.c.A(qVar, f11, lv.t.f28256j), j11, l2.g.b(12)), lv.t.f28252f), j9, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0Var, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
                    z11 = false;
                    sVar.q(false);
                } else {
                    if (i15 != 3) {
                        throw e0.f.v(sVar, 109610769, false);
                    }
                    sVar.a0(-895431065);
                    t tVarA2 = b4.a.a(d2.c.z(v1.n.j(d2.c.A(qVar, f11, lv.t.f28256j), j11, l2.g.b(12)), lv.t.f28252f), c5.m2.f7291a, new bn.c0(3, function12, str2));
                    String strU2 = f0.U(sVar, R.string.charity_id_provided_error_general);
                    String strU3 = f0.U(sVar, R.string.charity_id_provided_error_general_highlight);
                    StringBuilder sb2 = new StringBuilder(16);
                    new ArrayList();
                    ArrayList arrayList = new ArrayList();
                    new ArrayList();
                    sb2.append(strU2);
                    int iG = StringsKt.G(strU2, strU3, 0, false, 6);
                    if (iG >= 0) {
                        arrayList.add(new m5.d(new l0(lv.s.f28228h, 0L, (q5.r) null, (q5.n) null, (o) null, (q5.i) null, (String) null, 0L, (x5.a) null, (x5.p) null, (t5.c) null, 0L, x5.l.f43854c, (i4.u0) null, 61438), iG, strU3.length() + iG, 8));
                    }
                    String string = sb2.toString();
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size = arrayList.size();
                    int i16 = 0;
                    while (i16 < size) {
                        arrayList2.add(((m5.d) arrayList.get(i16)).a(sb2.length()));
                        i16++;
                        c3 = c3;
                    }
                    r9.e(new m5.h(string, arrayList2), tVarA2, j9, 0L, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, null, lv.v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 100663296, 261112);
                    z11 = false;
                    sVar.q(false);
                }
                sVar.q(z11);
            }
            sVar.q(true);
            t tVarD2 = b4.a.d(qVar, 0.0f);
            float f12 = lv.t.f28253g;
            v0.n.o(uVar.a(d2.c.A(tVarD2, f12, f12), b4.d.f5690h), f0.U(sVar, R.string.charity_id_cta), null, null, null, false, function02, sVar, 0, (i13 >> 15) & 14, 1020);
            sVar.q(true);
        } else {
            function12 = function1;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.a0(vVar, str2, charityIdError, function12, function0, function02, i11, 3);
        }
    }

    public static final void d(final i iVar, Function1 function1, Function0 function0, n nVar, int i11) {
        Object obj;
        final w6 w6Var;
        m3.f fVar;
        final b0 b0Var;
        iVar.getClass();
        function1.getClass();
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1958534614);
        int i12 = i11 | (sVar.h(iVar) ? 4 : 2) | (sVar.h(function1) ? 32 : 16) | (sVar.h(function0) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            CharityIdError charityIdErrorA = iVar.a();
            Object objM = sVar.M();
            m3.f fVar2 = m.f29332a;
            if (objM == fVar2) {
                c1 c1Var = iVar.f17769a;
                o0 o0Var = o0.f26530a;
                objM = m3.i.w(((i0) e0.f.f(o0Var, i0.class, c1Var, o0Var)).f44330b);
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            w6 w6VarF = v3.f(6, 2, null, sVar);
            Object objM2 = sVar.M();
            if (objM2 == fVar2) {
                objM2 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM2);
            }
            final b1 b1Var2 = (b1) objM2;
            Object objM3 = sVar.M();
            if (objM3 == fVar2) {
                objM3 = m3.i.o(kotlin.coroutines.g.f26549a, sVar);
                sVar.k0(objM3);
            }
            b0 b0Var2 = (b0) objM3;
            Object objM4 = sVar.M();
            if (objM4 == fVar2) {
                objM4 = new v();
                sVar.k0(objM4);
            }
            v vVar = (v) objM4;
            Unit unit = Unit.f26487a;
            boolean zD = sVar.d(charityIdErrorA == null ? -1 : charityIdErrorA.ordinal());
            Object objM5 = sVar.M();
            if (zD || objM5 == fVar2) {
                objM5 = new aa.l0(charityIdErrorA, vVar, (x70.c) null, 20);
                sVar.k0(objM5);
            }
            m3.i.h(unit, (Function2) objM5, sVar);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(q.f5711a, sVar);
            j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            long j9 = lv.s.I;
            boolean zH = sVar.h(iVar) | ((i12 & 896) == 256);
            Object objM6 = sVar.M();
            if (zH || objM6 == fVar2) {
                objM6 = new ep.l(7, iVar, function0);
                sVar.k0(objM6);
            }
            cg.j.s("", null, 0L, j9, (Function0) objM6, null, null, null, sVar, 3078, 230);
            sVar = sVar;
            String str = (String) b1Var.getValue();
            Object objM7 = sVar.M();
            if (objM7 == fVar2) {
                objM7 = new bm.j(b1Var, 17);
                sVar.k0(objM7);
            }
            Function0 function02 = (Function0) objM7;
            boolean zH2 = sVar.h(iVar);
            Object objM8 = sVar.M();
            if (zH2 || objM8 == fVar2) {
                objM8 = new ep.l(8, iVar, b1Var2);
                sVar.k0(objM8);
            }
            c(vVar, str, charityIdErrorA, function1, function02, (Function0) objM8, sVar, ((i12 << 6) & 7168) | 24582);
            sVar.q(true);
            if (((Boolean) b1Var2.getValue()).booleanValue()) {
                sVar.a0(427640132);
                boolean zH3 = sVar.h(iVar) | sVar.h(b0Var2) | sVar.f(w6VarF);
                Object objM9 = sVar.M();
                if (zH3 || objM9 == fVar2) {
                    final int i13 = 0;
                    w6Var = w6VarF;
                    fVar = fVar2;
                    b0Var = b0Var2;
                    obj = new Function0() { // from class: fi.g
                        /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
                        @Override // kotlin.jvm.functions.Function0
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke() {
                            /*
                                Method dump skipped, instruction units count: 202
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: fi.g.invoke():java.lang.Object");
                        }
                    };
                    sVar.k0(obj);
                } else {
                    fVar = fVar2;
                    obj = objM9;
                    w6Var = w6VarF;
                    b0Var = b0Var2;
                }
                Function0 function03 = (Function0) obj;
                boolean zH4 = sVar.h(iVar) | sVar.h(b0Var) | sVar.f(w6Var);
                Object objM10 = sVar.M();
                if (zH4 || objM10 == fVar) {
                    final int i14 = 1;
                    Function0 function04 = new Function0() { // from class: fi.g
                        /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
                        @Override // kotlin.jvm.functions.Function0
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke() {
                            /*
                                Method dump skipped, instruction units count: 202
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: fi.g.invoke():java.lang.Object");
                        }
                    };
                    sVar.k0(function04);
                    objM10 = function04;
                }
                a(w6Var, function03, (Function0) objM10, sVar, 0);
                sVar.q(false);
            } else {
                sVar.a0(428950936);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new an.d(iVar, function1, function0, i11, 11);
        }
    }
}
