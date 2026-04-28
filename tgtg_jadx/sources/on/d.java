package on;

import b4.q;
import b4.t;
import com.app.tgtg.R;
import com.braze.g2;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n1;
import g3.r9;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import lp.v;
import m3.h1;
import m3.n;
import m3.s;
import m3.w1;
import m5.u0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u3.d f32694a = new u3.d(new o9.a(3), false, 1261190070);

    public static final void a(int i11, e eVar, Function2 function2, n nVar, int i12) {
        int iA;
        int iA2;
        int i13;
        s sVar = (s) nVar;
        sVar.c0(-1615988947);
        int i14 = (sVar.d(i11) ? 4 : 2) | i12;
        if ((i12 & MLKEMEngine.KyberPolyBytes) == 0) {
            i14 |= sVar.h(function2) ? 256 : 128;
        }
        if (sVar.R(i14 & 1, (i14 & 147) != 146)) {
            int iA3 = eVar.a();
            int[] iArr = m.$EnumSwitchMapping$1;
            int i15 = iArr[eVar.ordinal()];
            if (i15 == 1) {
                iA = c.BLUE.a();
            } else if (i15 == 2) {
                iA = c.GREEN.a();
            } else {
                if (i15 != 3) {
                    e40.a.f();
                    return;
                }
                iA = c.BEIGE.a();
            }
            int i16 = iArr[eVar.ordinal()];
            if (i16 == 1) {
                iA2 = a.BLUE.a();
            } else if (i16 == 2) {
                iA2 = a.GREEN.a();
            } else {
                if (i16 != 3) {
                    e40.a.f();
                    return;
                }
                iA2 = a.BEIGE.a();
            }
            boolean z11 = i11 == iA2;
            int i17 = iArr[eVar.ordinal()];
            if (i17 == 1) {
                i13 = z11 ? R.string.profile_avatar_picker_voice_over_background_blue_selected : R.string.profile_avatar_picker_voice_over_background_blue;
            } else if (i17 == 2) {
                i13 = z11 ? R.string.profile_avatar_picker_voice_over_background_green_selected : R.string.profile_avatar_picker_voice_over_background_green;
            } else {
                if (i17 != 3) {
                    e40.a.f();
                    return;
                }
                i13 = z11 ? R.string.profile_avatar_picker_voice_over_background_beige_selected : R.string.profile_avatar_picker_voice_over_background_beige;
            }
            kn.c cVar = new kn.c(iA3, 0, iA3);
            String strU = f0.U(sVar, i13);
            boolean zD = sVar.d(iA2) | ((i14 & 896) == 256) | sVar.d(iA);
            Object objM = sVar.M();
            if (zD || objM == m3.m.f29332a) {
                objM = new g2(function2, iA2, iA, 4);
                sVar.k0(objM);
            }
            g.a(null, cVar, z11, strU, 0.0f, (Function0) objM, sVar, 0, 17);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new defpackage.h(i11, eVar, function2, i12);
        }
    }

    public static final void b(int i11, Function2 function2, n nVar, int i12) {
        s sVar = (s) nVar;
        sVar.c0(-233695080);
        int i13 = (sVar.d(i11) ? 4 : 2) | i12;
        if (sVar.R(i13 & 1, (i13 & 19) != 18)) {
            t tVarD = m2.d(q.f5711a, 1.0f);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarD, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            int i14 = (i13 & 14) | 432;
            a(i11, e.BLUE, function2, sVar, i14);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            d2.c.f(new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), sVar);
            a(i11, e.GREEN, function2, sVar, i14);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            d2.c.f(new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), sVar);
            a(i11, e.BEIGE, function2, sVar, i14);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c60.c(function2, i11, i12, 16);
        }
    }

    public static final void c(final int i11, final int i12, final int i13, final b bVar, final Function1 function1, n nVar, final int i14) {
        int i15;
        s sVar = (s) nVar;
        sVar.c0(-1205402502);
        int i16 = (sVar.d(i11) ? 4 : 2) | i14 | (sVar.d(i12) ? 32 : 16) | (sVar.d(i13) ? 256 : 128);
        if ((i14 & 24576) == 0) {
            i16 |= sVar.h(function1) ? 16384 : 8192;
        }
        if (sVar.R(i16 & 1, (i16 & 9363) != 9362)) {
            int iA = bVar.a();
            boolean z11 = i13 == iA;
            int i17 = m.$EnumSwitchMapping$0[bVar.ordinal()];
            if (i17 == 1) {
                i15 = z11 ? R.string.profile_avatar_picker_voice_over_style_glasses_selected : R.string.profile_avatar_picker_voice_over_style_glasses;
            } else if (i17 == 2) {
                i15 = z11 ? R.string.profile_avatar_picker_voice_over_style_hearts_selected : R.string.profile_avatar_picker_voice_over_style_hearts;
            } else {
                if (i17 != 3) {
                    e40.a.f();
                    return;
                }
                i15 = z11 ? R.string.profile_avatar_picker_voice_over_style_stars_selected : R.string.profile_avatar_picker_voice_over_style_stars;
            }
            kn.c cVar = new kn.c(i11, iA, i12);
            String strU = f0.U(sVar, i15);
            boolean zD = sVar.d(iA) | ((i16 & 57344) == 16384);
            Object objM = sVar.M();
            if (zD || objM == m3.m.f29332a) {
                objM = new lp.s(iA, 1, function1);
                sVar.k0(objM);
            }
            g.a(null, cVar, z11, strU, 0.0f, (Function0) objM, sVar, 0, 17);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: on.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d.c(i11, i12, i13, bVar, function1, (n) obj, m3.i.F(i14 | 1));
                    return Unit.f26487a;
                }
            };
        }
    }

    public static final void d(int i11, int i12, int i13, Function1 function1, n nVar, int i14) {
        s sVar = (s) nVar;
        sVar.c0(-626876607);
        int i15 = i14 | (sVar.d(i11) ? 4 : 2) | (sVar.d(i12) ? 32 : 16) | (sVar.d(i13) ? 256 : 128);
        if (sVar.R(i15 & 1, (i15 & 1171) != 1170)) {
            t tVarD = m2.d(q.f5711a, 1.0f);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarD, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            int i16 = (i15 & 896) | (i15 & 14) | 3072 | (i15 & 112) | 24576;
            c(i11, i12, i13, b.ROUND, function1, sVar, i16);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            d2.c.f(new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), sVar);
            c(i11, i12, i13, b.HEART, function1, sVar, i16);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            d2.c.f(new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), sVar);
            c(i11, i12, i13, b.STAR, function1, sVar, i16);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new i(i11, i12, i13, function1, i14, 0);
        }
    }

    public static final void e(t tVar, kn.c cVar, Function0 function0, Function1 function1, n nVar, int i11) {
        function0.getClass();
        function1.getClass();
        s sVar = (s) nVar;
        sVar.c0(887610305);
        int i12 = i11 | 6 | (sVar.h(cVar) ? 32 : 16) | (sVar.h(function1) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = a0.s(cVar != null ? cVar.f26470a : a.BLUE.a(), sVar);
            }
            h1 h1Var = (h1) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = a0.s(cVar != null ? cVar.f26471b : b.ROUND.a(), sVar);
            }
            h1 h1Var2 = (h1) objM2;
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = a0.s(cVar != null ? cVar.f26472c : c.BLUE.a(), sVar);
            }
            h1 h1Var3 = (h1) objM3;
            Object objM4 = sVar.M();
            if (objM4 == fVar) {
                objM4 = new nn.m(11, function0);
                sVar.k0(objM4);
            }
            ex.i.b((Function0) objM4, new d6.a0(1), u3.e.e(-826193832, sVar, new ap.b(function0, function1, h1Var, h1Var2, h1Var3)), sVar, 432, 0);
            tVar = q.f5711a;
        } else {
            sVar.U();
        }
        t tVar2 = tVar;
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new v(tVar2, cVar, function0, function1, i11, 4);
        }
    }

    public static final void f(int i11, n nVar, int i12) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.c0(868260128);
        int i13 = (sVar2.d(i11) ? 4 : 2) | i12;
        if (sVar2.R(i13 & 1, (i13 & 3) != 2)) {
            sVar = sVar2;
            r9.d(f0.U(sVar2, i11), m2.d(q.f5711a, 1.0f), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0.a(lv.v.f28279s, lv.s.J, 0L, null, null, 0L, null, 5, 0L, null, null, 16744446), sVar, 48, 0, 131068);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new j(i11, i12, 0);
        }
    }
}
