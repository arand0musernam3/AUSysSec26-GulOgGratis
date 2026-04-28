package oo;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.lifecycle.s1;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.user.response.Co2eSavedHotShower;
import com.app.tgtg.model.remote.user.response.Co2eSavedResponse;
import com.app.tgtg.model.remote.user.response.Co2eSavedValue;
import com.app.tgtg.model.remote.voucher.DiscountVoucher;
import com.braze.h2;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.m2;
import d2.n1;
import d2.z1;
import d40.t1;
import g3.g9;
import g3.r9;
import i4.g0;
import ii.j0;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import m3.b1;
import m5.l0;
import o30.e0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import q5.f0;
import ss.j1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32862c;

    public /* synthetic */ s(int i11, Object obj, Object obj2) {
        this.f32860a = i11;
        this.f32861b = obj;
        this.f32862c = obj2;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        j1 j1Var = (j1) this.f32861b;
        t5.a aVar = (t5.a) this.f32862c;
        z1 z1Var = (z1) obj;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        z1Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((m3.s) nVar).f(z1Var) ? 4 : 2;
        }
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 19) != 18)) {
            b4.t tVarR = d2.c.r(m2.c(m2.d(d2.c.y(v1.n.j(b4.q.f5711a, ((x60.h) sVar.j(PantryThemeKt.getLocalPantryColor())).G, g0.f23254b), z1Var), 1.0f), 1.0f));
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarR, sVar);
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
            if (j1Var.f39193a instanceof DiscountVoucher) {
                sVar.a0(-1105751926);
                if (1.0f <= 0.0d) {
                    e2.a.a("invalid weight; must be greater than zero");
                }
                us.a.e(j1Var, aVar, new n1(1.0f, false), sVar, 0);
                sVar.q(false);
            } else {
                sVar.a0(-1105745463);
                if (1.0f <= 0.0d) {
                    e2.a.a("invalid weight; must be greater than zero");
                }
                us.a.o(j1Var, aVar, new n1(1.0f, false), sVar, 0);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        Spannable spannable = (Spannable) this.f32861b;
        a3.z1 z1Var = (a3.z1) this.f32862c;
        l0 l0Var = (l0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int iIntValue2 = ((Integer) obj3).intValue();
        q5.i iVar = l0Var.f29580f;
        q5.r rVar = l0Var.f29577c;
        if (rVar == null) {
            rVar = q5.r.f36043h;
        }
        q5.n nVar = l0Var.f29578d;
        int i11 = nVar != null ? nVar.f36034a : 0;
        q5.o oVar = l0Var.f29579e;
        int i12 = oVar != null ? oVar.f36035a : Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
        u5.d dVar = (u5.d) z1Var.f647b;
        q5.g0 g0VarB = ((q5.j) dVar.f40771e).b(iVar, rVar, i11, i12);
        if (g0VarB instanceof f0) {
            Object obj4 = ((f0) g0VarB).f36015a;
            obj4.getClass();
            typeface = (Typeface) obj4;
        } else {
            t5.a aVar = new t5.a(g0VarB, dVar.f40776j);
            dVar.f40776j = aVar;
            Object obj5 = aVar.f39793d;
            obj5.getClass();
            typeface = (Typeface) obj5;
        }
        spannable.setSpan(new p5.b(typeface, 1), iIntValue, iIntValue2, 33);
        return Unit.f26487a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        x60.m mVar = (x60.m) this.f32861b;
        x60.h hVar = (x60.h) this.f32862c;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((d2.z) obj).getClass();
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            String strU = o30.f0.U(sVar, R.string.checkout_payment_method_tooltip);
            float f11 = mVar.f44014j;
            float f12 = mVar.f44015k;
            b4.q qVar = b4.q.f5711a;
            r9.d(strU, d2.c.C(qVar, f11, f12, f11, f12), hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography())).f43958g, sVar, 0, 0, 131064);
            d2.c.f(m2.m(qVar, f12), sVar);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        b2.l lVar = (b2.l) this.f32861b;
        b1 b1Var = (b1) this.f32862c;
        Function2 function2 = (Function2) obj;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        function2.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((m3.s) nVar).h(function2) ? 4 : 2;
        }
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 19) != 18)) {
            g9.f18691a.b(((r5.y) b1Var.getValue()).f37714a.f29538b, function2, true, true, r5.f0.f37673a, lVar, null, null, null, null, null, null, d2.c.c(10, 0.0f, 2), u3.e.e(-1475442393, sVar, new pm.m(lVar, 24)), sVar, ((iIntValue << 3) & 112) | 224640, 114819072, 65472);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        pi.m mVar = (pi.m) this.f32861b;
        b1 b1Var = (b1) this.f32862c;
        ((Integer) obj3).getClass();
        ((s1.z) obj).getClass();
        mVar.getClass();
        boolean z11 = !((Boolean) v80.f0.E(kotlin.coroutines.g.f26549a, new pi.j(mVar, null, 3))).booleanValue();
        m3.s sVar = (m3.s) ((m3.n) obj2);
        boolean zF = sVar.f(b1Var) | sVar.h(mVar);
        Object objM = sVar.M();
        if (zF || objM == m3.m.f29332a) {
            objM = new us.j(18, b1Var, mVar);
            sVar.k0(objM);
        }
        a.a.d(0, null, (Function0) objM, sVar, z11);
        return Unit.f26487a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        j0 j0Var = (j0) this.f32861b;
        g9.f0 f0Var = (g9.f0) this.f32862c;
        z1 z1Var = (z1) obj;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        z1Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((m3.s) nVar).f(z1Var) ? 4 : 2;
        }
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 19) != 18)) {
            b4.t tVarY = d2.c.y(v1.n.j(b4.q.f5711a, lv.s.J, g0.f23254b), z1Var);
            s1 s1VarA = z8.a.a(sVar);
            if (s1VarA == null) {
                h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return null;
            }
            b0.z.i(tVarY, (hr.i) t1.K(Reflection.getOrCreateKotlinClass(hr.i.class), s1VarA, e0.r(s1VarA, sVar), s1VarA instanceof androidx.lifecycle.p ? ((androidx.lifecycle.p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar), new ub.a(20, j0Var, f0Var), sVar, 0);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v15 */
    private final Object g(Object obj, Object obj2, Object obj3) {
        boolean z11;
        String upperCase;
        boolean z12;
        int i11;
        int i12;
        ?? r14;
        int i13;
        int i14;
        int i15;
        int i16;
        Co2eSavedResponse co2eSavedResponse = (Co2eSavedResponse) this.f32861b;
        uq.e eVar = (uq.e) this.f32862c;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((f2.d) obj).getClass();
        m3.s sVar = (m3.s) nVar;
        if (!sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            sVar.U();
        } else if (co2eSavedResponse == null) {
            sVar.a0(-258193137);
            sVar.q(false);
        } else {
            sVar.a0(-258193136);
            b4.q qVar = b4.q.f5711a;
            b4.t tVarZ = d2.c.z(m2.t(m2.d(qVar, 1.0f), 3), lv.t.f28253g);
            d2.d dVar = d2.i.f13803c;
            b4.i iVar = b4.d.f5694m;
            d2.y yVarA = d2.w.a(dVar, iVar, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarZ, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar2 = b5.i.f5845h;
            m3.i.z(sVar, dVar2);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            String strU = o30.f0.U(sVar, R.string.voice_over_co2e_saved_sub_title);
            b4.t tVarD = m2.d(qVar, 1.0f);
            boolean zF = sVar.f(strU);
            Object objM = sVar.M();
            if (zF || objM == m3.m.f29332a) {
                z11 = false;
                objM = new xq.c(strU, 0);
                sVar.k0(objM);
            } else {
                z11 = false;
            }
            r9.d(o30.f0.U(sVar, R.string.co2e_saved_sub_title), j5.r.c(tVarD, z11, (Function1) objM), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String strU2 = o30.f0.U(sVar, R.string.co2e_saved_electricity_value);
            Co2eSavedValue savedElectricity = co2eSavedResponse.getSavedElectricity();
            String str = String.format(strU2, Arrays.copyOf(new Object[]{savedElectricity != null ? Integer.valueOf(savedElectricity.getValue()) : null}, 1));
            String strU3 = o30.f0.U(sVar, R.string.voice_over_co2e_saved_electricity_value);
            Co2eSavedValue savedElectricity2 = co2eSavedResponse.getSavedElectricity();
            String str2 = String.format(strU3, Arrays.copyOf(new Object[]{savedElectricity2 != null ? Integer.valueOf(savedElectricity2.getValue()) : null}, 1));
            String strH = eVar.f41500a.h();
            if (strH != null) {
                upperCase = strH.toUpperCase(Locale.ROOT);
                upperCase.getClass();
            } else {
                upperCase = null;
            }
            if (Intrinsics.areEqual(upperCase, "US")) {
                i11 = -209289036;
                i12 = R.string.co2e_saved_electricity_usa_message;
                z12 = false;
            } else {
                z12 = false;
                if (Intrinsics.areEqual(upperCase, "CA")) {
                    i11 = -209282919;
                    i12 = R.string.co2e_saved_electricity_canadian_message;
                } else {
                    i11 = -209277013;
                    i12 = R.string.co2e_saved_electricity_european_message;
                }
            }
            wq.a aVar = new wq.a(R.drawable.gfx_electricity, str, str2, b3.i.j(i11, i12, sVar, sVar, z12), 16, null);
            NumberFormat numberFormat = NumberFormat.getInstance();
            Co2eSavedValue savedSmartPhoneCharges = co2eSavedResponse.getSavedSmartPhoneCharges();
            String str3 = numberFormat.format(savedSmartPhoneCharges != null ? Integer.valueOf(savedSmartPhoneCharges.getValue()) : null);
            str3.getClass();
            wq.a aVar2 = new wq.a(R.drawable.gfx_smartphone, str3, null, o30.f0.U(sVar, R.string.co2e_saved_phone_charges_message), 20, null);
            NumberFormat numberFormat2 = NumberFormat.getInstance();
            Co2eSavedValue savedCupsOfCoffee = co2eSavedResponse.getSavedCupsOfCoffee();
            String str4 = numberFormat2.format(savedCupsOfCoffee != null ? Integer.valueOf(savedCupsOfCoffee.getValue()) : null);
            str4.getClass();
            wq.a aVar3 = new wq.a(R.drawable.gfx_hot_coffee, str4, null, o30.f0.U(sVar, R.string.co2e_saved_hot_coffee_message), 20, null);
            Co2eSavedHotShower savedHotShower = co2eSavedResponse.getSavedHotShower();
            Integer numValueOf2 = savedHotShower != null ? Integer.valueOf(savedHotShower.getInMinutes()) : null;
            numValueOf2.getClass();
            int iIntValue2 = numValueOf2.intValue();
            Co2eSavedHotShower savedHotShower2 = co2eSavedResponse.getSavedHotShower();
            Integer numValueOf3 = savedHotShower2 != null ? Integer.valueOf(savedHotShower2.getInMinutes()) : null;
            numValueOf3.getClass();
            String strG = o30.f0.G(R.plurals.voice_over_minute, iIntValue2, new Object[]{numValueOf3}, sVar);
            if (mv.d.A()) {
                i13 = 2103671666;
                i14 = R.string.co2e_saved_hot_showering_usa_message;
                r14 = 0;
            } else {
                r14 = 0;
                i13 = 2103809430;
                i14 = R.string.co2e_saved_hot_showering_message;
            }
            String strJ = b3.i.j(i13, i14, sVar, sVar, r14);
            if (mv.d.A()) {
                i15 = 2104015239;
                i16 = R.string.voice_over_co2e_saved_hot_showering_usa_message;
            } else {
                i15 = 2104163915;
                i16 = R.string.voice_over_co2e_saved_hot_showering_message;
            }
            List listH = d0.h(aVar, aVar2, aVar3, new wq.a(R.drawable.gfx_showers, strG, null, strJ, 4, b3.i.j(i15, i16, sVar, sVar, r14)));
            b4.t tVarT = m2.t(m2.d(qVar, 1.0f), 3);
            d2.y yVarA2 = d2.w.a(dVar, iVar, sVar, r14);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarT, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA2, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar2);
            m3.i.C(tVarC2, gVar4, sVar);
            sVar.a0(-2035952712);
            Iterator it = listH.iterator();
            while (it.hasNext()) {
                e0.a((wq.a) it.next(), sVar, 0);
            }
            sVar.q(false);
            sVar.q(true);
            sVar.q(true);
            sVar.q(false);
        }
        return Unit.f26487a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        xj.k kVar = (xj.k) this.f32861b;
        b1 b1Var = (b1) this.f32862c;
        m3.n nVar = (m3.n) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((f2.d) obj).getClass();
        m3.s sVar = (m3.s) nVar;
        if (sVar.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            boolean zH = sVar.h(kVar);
            Object objM = sVar.M();
            if (zH || objM == m3.m.f29332a) {
                objM = new lq.b(kVar, b1Var, 1);
                sVar.k0(objM);
            }
            yj.a.j((Function0) objM, sVar, 0);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        yk.h hVar = (yk.h) this.f32861b;
        i80.n nVar = (i80.n) this.f32862c;
        jl.c cVar = (jl.c) obj;
        jl.a aVar = (jl.a) obj2;
        op.l lVar = (op.l) obj3;
        cVar.getClass();
        aVar.getClass();
        hVar.f(cVar, aVar, lVar);
        if (nVar != null) {
            nVar.invoke(cVar, aVar, lVar);
        }
        return Unit.f26487a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0d58  */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r9v50 */
    /* JADX WARN: Type inference failed for: r9v51, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v52 */
    @Override // i80.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r50, java.lang.Object r51, java.lang.Object r52) {
        /*
            Method dump skipped, instruction units count: 3802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oo.s.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ s(int i11, Object obj, Function1 function1) {
        this.f32860a = i11;
        this.f32862c = function1;
        this.f32861b = obj;
    }
}
