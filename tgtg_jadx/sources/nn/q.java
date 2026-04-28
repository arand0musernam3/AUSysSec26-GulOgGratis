package nn;

import a3.t0;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.m1;
import androidx.lifecycle.s1;
import c5.v0;
import com.app.tgtg.R;
import com.app.tgtg.model.local.GenericErrors;
import com.app.tgtg.model.remote.profile.response.ProfileFeature;
import com.app.tgtg.model.remote.profile.response.ProfileScreenResponse;
import com.app.tgtg.model.remote.profile.response.ProfileVoucherTooltip;
import com.braze.h2;
import d2.m2;
import d2.w;
import d2.y;
import d2.z1;
import d40.t1;
import g3.a2;
import g3.r9;
import g3.v3;
import g3.w6;
import g3.x5;
import i4.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import lp.v;
import m2.c2;
import m2.h0;
import m3.b1;
import m3.h1;
import m3.w1;
import m90.z;
import o30.e0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import v80.b0;
import v80.f0;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class q {
    /* JADX WARN: Removed duplicated region for block: B:59:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(mn.l r9, android.app.Activity r10, m3.n r11, int r12) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nn.q.a(mn.l, android.app.Activity, m3.n, int):void");
    }

    public static final void b(ProfileFeature profileFeature, mn.l lVar, Activity activity, b1 b1Var, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1806224332);
        int i12 = (sVar.h(profileFeature) ? 4 : 2) | i11 | (sVar.h(lVar) ? 32 : 16) | (sVar.h(activity) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            sVar.W();
            if ((i11 & 1) != 0 && !sVar.z()) {
                sVar.U();
            }
            sVar.r();
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(profileFeature);
                sVar.k0(objM);
            }
            b1 b1Var2 = (b1) objM;
            ProfileFeature profileFeature2 = (ProfileFeature) m3.i.n(lVar.f30040w, sVar, 0).getValue();
            if (profileFeature2 == null) {
                profileFeature2 = profileFeature;
            }
            b1Var2.setValue(profileFeature2);
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = m3.i.o(kotlin.coroutines.g.f26549a, sVar);
                sVar.k0(objM2);
            }
            b0 b0Var = (b0) objM2;
            if (((ProfileFeature) b1Var2.getValue()).getC2cReferralDetails() == null) {
                sVar.a0(-1878268779);
                sVar.q(false);
            } else {
                sVar.a0(-1878268778);
                ProfileFeature profileFeature3 = (ProfileFeature) b1Var2.getValue();
                boolean showManufacturerItems = lVar.f30019a.n().getShowManufacturerItems();
                boolean zH = sVar.h(activity) | sVar.h(lVar);
                Object objM3 = sVar.M();
                if (zH || objM3 == fVar) {
                    objM3 = new l(activity, lVar, 0);
                    sVar.k0(objM3);
                }
                Function0 function0 = (Function0) objM3;
                boolean zH2 = sVar.h(lVar) | sVar.h(profileFeature);
                Object objM4 = sVar.M();
                if (zH2 || objM4 == fVar) {
                    objM4 = new h0(lVar, profileFeature, b1Var2, 5);
                    sVar.k0(objM4);
                }
                Function1 function1 = (Function1) objM4;
                boolean zH3 = sVar.h(b0Var);
                Object objM5 = sVar.M();
                if (zH3 || objM5 == fVar) {
                    objM5 = new z(13, b0Var, b1Var);
                    sVar.k0(objM5);
                }
                rn.a.c(profileFeature3, showManufacturerItems, function0, function1, (Function0) objM5, sVar, 0);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new v(profileFeature, lVar, i11, activity, b1Var, 3);
        }
    }

    public static final void c(boolean z11, z1 z1Var, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1468685277);
        if ((i11 & 6) == 0) {
            i12 = (sVar.g(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(z1Var) ? 32 : 16;
        }
        if (!sVar.R(i12 & 1, (i12 & 19) != 18)) {
            sVar.U();
        } else if (z11) {
            sVar.a0(-771138035);
            b4.t tVarThen = d2.c.y(v1.n.j(b4.q.f5711a, lv.s.J, g0.f23254b), z1Var).then(m2.f13850c);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarThen, sVar);
            b5.j.R.getClass();
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
            cg.o.a(GenericErrors.Generic.INSTANCE, null, null, sVar, 6, 6);
            sVar.q(true);
            sVar.q(false);
        } else {
            sVar.a0(-770905473);
            sVar.q(false);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new e.p(z11, z1Var, i11, 2);
        }
    }

    public static final void d(ProfileScreenResponse profileScreenResponse, Activity activity, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-611288836);
        int i12 = (sVar.h(profileScreenResponse) ? 4 : 2) | i11 | (sVar.h(activity) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            boolean zH = sVar.h(activity);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (zH || objM == fVar) {
                objM = new ap.f(activity, 9);
                sVar.k0(objM);
            }
            Function0 function0 = (Function0) objM;
            boolean zH2 = sVar.h(activity);
            Object objM2 = sVar.M();
            if (zH2 || objM2 == fVar) {
                objM2 = new ap.f(activity, 10);
                sVar.k0(objM2);
            }
            bx.k.g(profileScreenResponse, function0, (Function0) objM2, sVar, i12 & 14);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new kq.c(profileScreenResponse, activity, i11, 13);
        }
    }

    public static final void e(ProfileFeature profileFeature, final mn.l lVar, m3.n nVar, int i11) {
        boolean z11;
        cv.b bVar = lVar.f30024f;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1764609373);
        int i12 = (sVar.h(profileFeature) ? 4 : 2) | i11 | (sVar.h(lVar) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(profileFeature);
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            ProfileFeature profileFeature2 = (ProfileFeature) m3.i.n(lVar.f30042y, sVar, 0).getValue();
            if (profileFeature2 == null) {
                profileFeature2 = profileFeature;
            }
            b1Var.setValue(profileFeature2);
            w6 w6VarF = v3.f(6, 2, null, sVar);
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM2);
            }
            final b1 b1Var2 = (b1) objM2;
            if (((ProfileFeature) b1Var.getValue()).getLoyaltyCardDetails() == null) {
                sVar.a0(-921279431);
                sVar.q(false);
            } else {
                sVar.a0(-921279430);
                ProfileFeature profileFeature3 = (ProfileFeature) b1Var.getValue();
                boolean zH = sVar.h(lVar) | sVar.h(profileFeature);
                Object objM3 = sVar.M();
                if (zH || objM3 == fVar) {
                    objM3 = new c2(10, lVar, profileFeature);
                    sVar.k0(objM3);
                }
                Function1 function1 = (Function1) objM3;
                boolean zH2 = sVar.h(lVar);
                Object objM4 = sVar.M();
                if (zH2 || objM4 == fVar) {
                    objM4 = new j(lVar, b1Var, 0);
                    sVar.k0(objM4);
                }
                Function0 function0 = (Function0) objM4;
                boolean zH3 = sVar.h(lVar) | sVar.h(profileFeature);
                Object objM5 = sVar.M();
                if (zH3 || objM5 == fVar) {
                    objM5 = new z(12, lVar, profileFeature);
                    sVar.k0(objM5);
                }
                Function0 function02 = (Function0) objM5;
                boolean zH4 = sVar.h(lVar);
                Object objM6 = sVar.M();
                if (zH4 || objM6 == fVar) {
                    final int i13 = 0;
                    objM6 = new Function1() { // from class: nn.k
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i13) {
                                case 0:
                                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                    b1Var2.setValue(Boolean.TRUE);
                                    cv.i iVar = cv.i.ACTION_OPEN_LOYALTY_CARD_PAGE;
                                    dv.a aVar = dv.a.CLICK_FROM;
                                    dv.d dVar = zBooleanValue ? dv.d.LEARN_MORE_BUTTON : dv.d.INFO_BUTTON;
                                    lVar.d(iVar, aVar, dVar != null ? dVar.a() : null);
                                    break;
                                case 1:
                                    dv.d dVar2 = (dv.d) obj;
                                    dVar2.getClass();
                                    b1Var2.setValue(Boolean.FALSE);
                                    lVar.d(cv.i.ACTION_CLOSE_LOYALTY_CARD_PAGE, dv.a.CLICK_FROM, dVar2.a());
                                    break;
                                default:
                                    dv.d dVar3 = (dv.d) obj;
                                    dVar3.getClass();
                                    b1Var2.setValue(Boolean.FALSE);
                                    lVar.d(cv.i.ACTION_CLOSE_LOYALTY_CARD_PAGE, dv.a.CLICK_FROM, dVar3.a());
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    };
                    sVar.k0(objM6);
                }
                sn.a.c(profileFeature3, function1, function0, function02, (Function1) objM6, sVar, 0);
                ProfileFeature profileFeature4 = (ProfileFeature) b1Var.getValue();
                profileFeature4.getClass();
                if (!lVar.G) {
                    cv.i iVar = cv.i.SCREEN_LOYALTY_CARD_IN_PROFILE;
                    dv.b bVarA = mn.l.a(profileFeature4);
                    iVar.getClass();
                    bVar.c(iVar, bVarA);
                    lVar.G = true;
                }
                if (((Boolean) b1Var2.getValue()).booleanValue()) {
                    sVar.a0(498009100);
                    ProfileFeature profileFeature5 = (ProfileFeature) b1Var.getValue();
                    boolean showManufacturerItems = lVar.f30019a.n().getShowManufacturerItems();
                    f70.i iVar2 = f70.i.PROFILE;
                    boolean zH5 = sVar.h(lVar);
                    Object objM7 = sVar.M();
                    if (zH5 || objM7 == fVar) {
                        objM7 = new h(lVar, 4);
                        sVar.k0(objM7);
                    }
                    Function0 function03 = (Function0) objM7;
                    boolean zH6 = sVar.h(lVar);
                    Object objM8 = sVar.M();
                    if (zH6 || objM8 == fVar) {
                        final int i14 = 1;
                        objM8 = new Function1() { // from class: nn.k
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i14) {
                                    case 0:
                                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                        b1Var2.setValue(Boolean.TRUE);
                                        cv.i iVar3 = cv.i.ACTION_OPEN_LOYALTY_CARD_PAGE;
                                        dv.a aVar = dv.a.CLICK_FROM;
                                        dv.d dVar = zBooleanValue ? dv.d.LEARN_MORE_BUTTON : dv.d.INFO_BUTTON;
                                        lVar.d(iVar3, aVar, dVar != null ? dVar.a() : null);
                                        break;
                                    case 1:
                                        dv.d dVar2 = (dv.d) obj;
                                        dVar2.getClass();
                                        b1Var2.setValue(Boolean.FALSE);
                                        lVar.d(cv.i.ACTION_CLOSE_LOYALTY_CARD_PAGE, dv.a.CLICK_FROM, dVar2.a());
                                        break;
                                    default:
                                        dv.d dVar3 = (dv.d) obj;
                                        dVar3.getClass();
                                        b1Var2.setValue(Boolean.FALSE);
                                        lVar.d(cv.i.ACTION_CLOSE_LOYALTY_CARD_PAGE, dv.a.CLICK_FROM, dVar3.a());
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        };
                        sVar.k0(objM8);
                    }
                    Function1 function12 = (Function1) objM8;
                    boolean zH7 = sVar.h(lVar);
                    Object objM9 = sVar.M();
                    if (zH7 || objM9 == fVar) {
                        final int i15 = 2;
                        objM9 = new Function1() { // from class: nn.k
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i15) {
                                    case 0:
                                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                        b1Var2.setValue(Boolean.TRUE);
                                        cv.i iVar3 = cv.i.ACTION_OPEN_LOYALTY_CARD_PAGE;
                                        dv.a aVar = dv.a.CLICK_FROM;
                                        dv.d dVar = zBooleanValue ? dv.d.LEARN_MORE_BUTTON : dv.d.INFO_BUTTON;
                                        lVar.d(iVar3, aVar, dVar != null ? dVar.a() : null);
                                        break;
                                    case 1:
                                        dv.d dVar2 = (dv.d) obj;
                                        dVar2.getClass();
                                        b1Var2.setValue(Boolean.FALSE);
                                        lVar.d(cv.i.ACTION_CLOSE_LOYALTY_CARD_PAGE, dv.a.CLICK_FROM, dVar2.a());
                                        break;
                                    default:
                                        dv.d dVar3 = (dv.d) obj;
                                        dVar3.getClass();
                                        b1Var2.setValue(Boolean.FALSE);
                                        lVar.d(cv.i.ACTION_CLOSE_LOYALTY_CARD_PAGE, dv.a.CLICK_FROM, dVar3.a());
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        };
                        sVar.k0(objM9);
                    }
                    sn.a.a(w6VarF, profileFeature5, showManufacturerItems, iVar2, function03, function12, (Function1) objM9, sVar, 3072);
                    sVar = sVar;
                    cv.i iVar3 = cv.i.SCREEN_LOYALTY_CARD_PAGE;
                    dv.b bVarA2 = mn.l.a((ProfileFeature) b1Var.getValue());
                    iVar3.getClass();
                    bVar.c(iVar3, bVarA2);
                    z11 = false;
                    sVar.q(false);
                } else {
                    z11 = false;
                    sVar.a0(499537090);
                    sVar.q(false);
                }
                sVar.q(z11);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new kq.c(profileFeature, lVar, i11, 14);
        }
    }

    public static final void f(boolean z11, Function1 function1, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-2055623289);
        int i12 = (sVar.g(z11) ? 4 : 2) | i11 | (sVar.h(function1) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            int i13 = i12 & 112;
            boolean z12 = i13 == 32;
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (z12 || objM == fVar) {
                objM = new defpackage.c(function1, 26);
                sVar.k0(objM);
            }
            lp.d.j(z11, (Function0) objM, sVar, i12 & 14);
            boolean z13 = i13 == 32;
            Object objM2 = sVar.M();
            if (z13 || objM2 == fVar) {
                objM2 = new defpackage.c(function1, 27);
                sVar.k0(objM2);
            }
            lp.d.k((Function0) objM2, sVar, 0);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new an.b(z11, function1, i11, 9);
        }
    }

    public static final void g(Function0 function0, Function0 function02, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1061975039);
        int i12 = (sVar.h(function0) ? 4 : 2) | i11 | (sVar.h(function02) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            float f11 = lv.t.f28253g;
            b4.t tVarC = d2.c.C(b4.q.f5711a, f11, f11, f11, lv.t.f28251e);
            boolean z11 = ((i12 & 14) == 4) | ((i12 & 112) == 32);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (z11 || objM == fVar) {
                objM = new cp.m(function0, function02, 2);
                sVar.k0(objM);
            }
            Function0 function03 = (Function0) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new n90.p(5);
                sVar.k0(objM2);
            }
            lp.d.s(tVarC, null, function03, (Function0) objM2, false, sVar, 27654, 2);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.g0(function0, function02, i11, 10);
        }
    }

    public static final void h(ProfileFeature profileFeature, mn.l lVar, Function1 function1, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(319881415);
        int i12 = (sVar.h(profileFeature) ? 4 : 2) | i11 | (sVar.h(lVar) ? 32 : 16) | (sVar.h(function1) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            boolean zH = sVar.h(lVar);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (zH || objM == fVar) {
                objM = new i(lVar, 1);
                sVar.k0(objM);
            }
            Function1 function12 = (Function1) objM;
            boolean zH2 = sVar.h(lVar);
            Object objM2 = sVar.M();
            if (zH2 || objM2 == fVar) {
                objM2 = new h(lVar, 2);
                sVar.k0(objM2);
            }
            vn.b.a(profileFeature, function1, function12, (Function0) objM2, sVar, (i12 & 14) | ((i12 >> 3) & 112));
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ki.h(profileFeature, lVar, function1, false, i11, 9);
        }
    }

    public static final void i(ProfileFeature profileFeature, Function0 function0, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(938871109);
        int i12 = (sVar.h(profileFeature) ? 4 : 2) | i11 | (sVar.h(function0) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            boolean z11 = (i12 & 112) == 32;
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new m(3, function0);
                sVar.k0(objM);
            }
            bx.o.y(null, profileFeature, (Function0) objM, sVar, (i12 << 3) & 112);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new n(profileFeature, function0, i11);
        }
    }

    public static final void j(int i11, Function0 function0, m3.n nVar, int i12) {
        m3.s sVar;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1813046567);
        int i13 = (sVar2.d(i11) ? 4 : 2) | i12 | (sVar2.f("26.4.1 (21117)") ? 32 : 16) | (sVar2.h(function0) ? 256 : 128);
        if (sVar2.R(i13 & 1, (i13 & 147) != 146)) {
            float f11 = lv.t.f28253g;
            b4.t tVarD = m2.d(d2.c.C(b4.q.f5711a, f11, lv.t.f28257k, f11, e0.s(sVar2, i11)), 1.0f);
            boolean z11 = (i13 & 896) == 256;
            Object objM = sVar2.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new m(0, function0);
                sVar2.k0(objM);
            }
            sVar = sVar2;
            r9.d("26.4.1 (21117)", androidx.compose.foundation.b.c(tVarD, false, null, null, (Function0) objM, 15), lv.s.D, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar, ((i13 >> 3) & 14) | MLKEMEngine.KyberPolyBytes, 12582912, 130040);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a2(i11, function0, i12, 4);
        }
    }

    public static final void k(mn.l lVar, m3.n nVar, int i11) {
        mn.l lVar2;
        mn.l lVar3;
        float fD;
        float fD2;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1139094043);
        int i12 = i11 | 2;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                s1 s1VarA = z8.a.a(sVar);
                if (s1VarA == null) {
                    h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                lVar3 = (mn.l) t1.K(Reflection.getOrCreateKotlinClass(mn.l.class), s1VarA, e0.r(s1VarA, sVar), s1VarA instanceof androidx.lifecycle.p ? ((androidx.lifecycle.p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar);
            } else {
                sVar.U();
                lVar3 = lVar;
            }
            sVar.r();
            Context context = (Context) sVar.j(v0.f7390b);
            Activity activity = (Activity) sVar.j(e.k.f15295a);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = a0.s(R.dimen.profile_page_bottom_padding, sVar);
            }
            h1 h1Var = (h1) objM;
            ProfileScreenResponse profileScreenResponse = (ProfileScreenResponse) m3.i.n(lVar3.f30038u, sVar, 0).getValue();
            String str = (String) m3.i.n(lVar3.f30036s, sVar, 0).getValue();
            kn.c cVar = (kn.c) m3.i.n(lVar3.f30034q, sVar, 0).getValue();
            b1 b1VarN = m3.i.n(lVar3.f30030m, sVar, 0);
            b1 b1VarN2 = m3.i.n(lVar3.f30032o, sVar, 0);
            b1 b1VarN3 = m3.i.n(lVar3.A, sVar, 0);
            b1 b1VarN4 = m3.i.n(lVar3.C, sVar, 0);
            b1 b1VarN5 = m3.i.n(lVar3.E, sVar, 0);
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM2);
            }
            b1 b1Var = (b1) objM2;
            d2.g0 g0Var = m2.f13850c;
            float f11 = 0;
            if (((Number) b1VarN.getValue()).intValue() > 0) {
                sVar.a0(-213049126);
                fD = d70.a.e(sVar, ((Number) b1VarN.getValue()).intValue());
                sVar.q(false);
            } else {
                sVar.a0(-212973641);
                fD = d70.a.d(context.getResources().getDimension(R.dimen.status_bar_height), sVar);
                sVar.q(false);
            }
            if (((Number) b1VarN2.getValue()).intValue() > 0) {
                sVar.a0(-212736553);
                fD2 = d70.a.e(sVar, ((Number) b1VarN2.getValue()).intValue());
                sVar.q(false);
            } else {
                sVar.a0(-212658030);
                fD2 = d70.a.d(context.getResources().getDimension(R.dimen.bottom_nav_view_height), sVar);
                sVar.q(false);
            }
            mn.l lVar4 = lVar3;
            x5.a(d2.c.C(g0Var, f11, fD, f11, fD2), u3.e.e(237538721, sVar, new ap.b(profileScreenResponse, lVar4, str, cVar, activity)), null, null, null, 0, 0L, 0L, null, u3.e.e(-453776074, sVar, new lo.d(context, profileScreenResponse, lVar4, activity, b1Var, h1Var, b1VarN5, b1VarN4, 1)), sVar, 805306416, 508);
            if (((Boolean) b1VarN3.getValue()).booleanValue()) {
                j4.s.y(-207141983, 0, sVar, sVar, false);
            } else {
                sVar.a0(-207115075);
                sVar.q(false);
            }
            boolean zH = sVar.h(lVar4);
            Object objM3 = sVar.M();
            if (zH || objM3 == fVar) {
                objM3 = new h(lVar4, 3);
                sVar.k0(objM3);
            }
            l(profileScreenResponse, b1Var, lVar4, (Function0) objM3, sVar, 48);
            lVar2 = lVar4;
        } else {
            sVar.U();
            lVar2 = lVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lk.a(lVar2, i11, 20);
        }
    }

    public static final void l(ProfileScreenResponse profileScreenResponse, b1 b1Var, mn.l lVar, Function0 function0, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-397152021);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(profileScreenResponse) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(b1Var) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(lVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(function0) ? 2048 : 1024;
        }
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            x70.c cVar = null;
            ProfileVoucherTooltip voucherTooltip = profileScreenResponse != null ? profileScreenResponse.getVoucherTooltip() : null;
            m3.f fVar = m3.m.f29332a;
            if (voucherTooltip == null) {
                sVar.a0(1079278377);
                sVar.q(false);
            } else {
                sVar.a0(1079278378);
                Object objM = sVar.M();
                if (objM == fVar) {
                    objM = m3.i.w(Boolean.valueOf(voucherTooltip.getShowNewVoucherTooltip()));
                    sVar.k0(objM);
                }
                b1 b1Var2 = (b1) objM;
                if (((Boolean) b1Var2.getValue()).booleanValue()) {
                    sVar.a0(-2111355072);
                    ft.c.S(true);
                    long j9 = lv.s.f28223e;
                    Integer numValueOf = Integer.valueOf(R.drawable.system_icon_new_voucher_neutral_10);
                    long j11 = lv.s.J;
                    boolean z11 = (i12 & 7168) == 2048;
                    Object objM2 = sVar.M();
                    if (z11 || objM2 == fVar) {
                        objM2 = new m(4, function0);
                        sVar.k0(objM2);
                    }
                    Function0 function02 = (Function0) objM2;
                    boolean zH = sVar.h(voucherTooltip);
                    Object objM3 = sVar.M();
                    if (zH || objM3 == fVar) {
                        objM3 = new z(14, voucherTooltip, b1Var2);
                        sVar.k0(objM3);
                    }
                    android.support.v4.media.session.a.g(new kn.d(j9, numValueOf, null, R.string.profile_setting_tool_tip_new_voucher_earned, j11, function02, (Function0) objM3, 9), sVar, 0);
                    f0.B(m1.d(lVar), null, null, new mn.f(lVar, cVar, i), 3);
                    sVar.q(false);
                } else {
                    sVar.a0(-2110649698);
                    sVar.q(false);
                }
                sVar.q(false);
            }
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.a0(1080168450);
                Integer numValueOf2 = Integer.valueOf(R.string.c2c_v3_profile_card_active_header);
                i = (i12 & 112) != 32 ? 0 : 1;
                Object objM4 = sVar.M();
                if (i != 0 || objM4 == fVar) {
                    objM4 = new ms.a(b1Var, 3);
                    sVar.k0(objM4);
                }
                android.support.v4.media.session.a.g(new kn.d(0L, null, numValueOf2, R.string.c2c_p_a_i_a_o_profile_setting_tool_tip_description, 0L, null, (Function0) objM4, 102), sVar, 0);
                sVar.q(false);
            } else {
                sVar.a0(1080526903);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new t0(profileScreenResponse, b1Var, i11, lVar, function0, 15);
        }
    }
}
