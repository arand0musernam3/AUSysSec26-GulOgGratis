package kh;

import android.content.Context;
import androidx.lifecycle.p;
import androidx.lifecycle.s1;
import b4.q;
import b4.t;
import b5.g;
import b5.h;
import b5.j;
import bg.a1;
import c5.v0;
import cg.b0;
import cg.o;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabprofile.impact.moneysaved.MoneySavedActivity;
import com.app.tgtg.model.local.GenericErrors;
import com.app.tgtg.model.remote.profile.ProfileCO2Saved;
import com.app.tgtg.model.remote.profile.ProfilePageCO2SavedCupsOfCoffee;
import com.app.tgtg.model.remote.profile.ProfilePageCO2SavedElectricity;
import com.app.tgtg.model.remote.profile.ProfilePageCO2SavedHotShower;
import com.app.tgtg.model.remote.profile.ProfilePageCO2SavedSmartPhoneCharges;
import com.app.tgtg.model.remote.user.response.MoneySavedResponse;
import com.braze.h2;
import d2.c;
import d2.d;
import d2.m2;
import d2.u;
import d2.w;
import d2.y;
import d2.z;
import d2.z1;
import d40.t1;
import f2.c0;
import g3.r9;
import gh.l;
import h2.n0;
import i4.g0;
import i4.r0;
import i80.n;
import ih.i;
import java.text.NumberFormat;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import lv.v;
import m3.b1;
import m3.c3;
import m3.f;
import m3.h1;
import m3.m;
import m3.s;
import m5.u0;
import mn.e;
import o30.e0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import w.a0;
import x5.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26366a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f26367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f26370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f26371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f26372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f26373h;

    public /* synthetic */ a(ProfileCO2Saved profileCO2Saved, String str, String str2, String str3, String str4, b1 b1Var, b1 b1Var2) {
        this.f26369d = profileCO2Saved;
        this.f26370e = str;
        this.f26371f = str2;
        this.f26372g = str3;
        this.f26373h = str4;
        this.f26367b = b1Var;
        this.f26368c = b1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v30 */
    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z11;
        final ProfileCO2Saved profileCO2Saved;
        b0 b0Var;
        b0 b0Var2;
        b0 b0Var3;
        MoneySavedResponse moneySavedResponse;
        ?? r82;
        int i11 = this.f26366a;
        r0 r0Var = g0.f23254b;
        q qVar = q.f5711a;
        f fVar = m.f29332a;
        Object obj4 = this.f26373h;
        Object obj5 = this.f26372g;
        Object obj6 = this.f26368c;
        Object obj7 = this.f26371f;
        Object obj8 = this.f26370e;
        Object obj9 = this.f26369d;
        switch (i11) {
            case 0:
                i iVar = (i) obj9;
                l lVar = (l) obj8;
                h1 h1Var = (h1) obj7;
                Function1 function1 = (Function1) obj5;
                Function1 function12 = (Function1) obj4;
                b1 b1Var = (b1) obj6;
                z1 z1Var = (z1) obj;
                m3.n nVar = (m3.n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                z1Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((s) nVar).f(z1Var) ? 4 : 2;
                }
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    t tVarR = c.r(m2.c(m2.d(c.y(v1.n.j(qVar, lv.s.J, r0Var), z1Var), 1.0f), 1.0f));
                    d dVar = d2.i.f13803c;
                    b4.i iVar2 = b4.d.f5694m;
                    y yVarA = w.a(dVar, iVar2, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    t tVarC = b4.a.c(tVarR, sVar);
                    j.R.getClass();
                    h hVar = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    g gVar = b5.i.f5843f;
                    m3.i.C(yVarA, gVar, sVar);
                    g gVar2 = b5.i.f5842e;
                    m3.i.C(iVarL, gVar2, sVar);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    g gVar3 = b5.i.f5844g;
                    m3.i.v(sVar, numValueOf, gVar3);
                    b5.d dVar2 = b5.i.f5845h;
                    m3.i.z(sVar, dVar2);
                    g gVar4 = b5.i.f5841d;
                    m3.i.C(tVarC, gVar4, sVar);
                    y yVarA2 = w.a(dVar, iVar2, sVar, 0);
                    int iHashCode2 = Long.hashCode(sVar.T);
                    u3.i iVarL2 = sVar.l();
                    t tVarC2 = b4.a.c(qVar, sVar);
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(yVarA2, gVar, sVar);
                    m3.i.C(iVarL2, gVar2, sVar);
                    a0.y(iHashCode2, sVar, gVar3, sVar, dVar2);
                    m3.i.C(tVarC2, gVar4, sVar);
                    sVar.a0(1761508821);
                    s1 s1VarA = z8.a.a(sVar);
                    if (s1VarA == null) {
                        h2.b("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    } else {
                        i iVar3 = (i) t1.K(Reflection.getOrCreateKotlinClass(i.class), s1VarA, e0.r(s1VarA, sVar), s1VarA instanceof p ? ((p) s1VarA).getDefaultViewModelCreationExtras() : y8.a.f45423b, sVar);
                        Object objM = sVar.M();
                        if (objM == fVar) {
                            objM = new co.t(h1Var, 5);
                            sVar.k0(objM);
                        }
                        Function1 function13 = (Function1) objM;
                        Object objM2 = sVar.M();
                        b1 b1Var2 = this.f26367b;
                        if (objM2 == fVar) {
                            objM2 = new n0(b1Var2, 10);
                            sVar.k0(objM2);
                        }
                        jh.f.d(null, lVar, iVar3, function13, (Function0) objM2, sVar, 27648);
                        sVar.q(false);
                        int i12 = 1;
                        sVar.q(true);
                        Integer numValueOf2 = Integer.valueOf(h1Var.h());
                        boolean zH = sVar.h(iVar);
                        Object objM3 = sVar.M();
                        if (zH || objM3 == fVar) {
                            objM3 = new is.h(iVar, h1Var, null, i12);
                            sVar.k0(objM3);
                        }
                        m3.i.h(numValueOf2, (Function2) objM3, sVar);
                        gh.i iVar4 = (gh.i) m3.i.n(iVar.l, sVar, 0).getValue();
                        int i13 = 7;
                        int i14 = 6;
                        if (iVar4 == null) {
                            sVar.a0(283769607);
                            sVar.q(false);
                        } else {
                            sVar.a0(283769608);
                            if (iVar4.f20449a == h1Var.h()) {
                                sVar.a0(1514589461);
                                Object objM4 = sVar.M();
                                if (objM4 == fVar) {
                                    objM4 = new jt.g(h1Var, i13);
                                    sVar.k0(objM4);
                                }
                                Function0 function0 = (Function0) objM4;
                                boolean zF = sVar.f(function1);
                                Object objM5 = sVar.M();
                                if (zF || objM5 == fVar) {
                                    objM5 = new defpackage.d(function1, 22);
                                    sVar.k0(objM5);
                                }
                                Function1 function14 = (Function1) objM5;
                                boolean zF2 = sVar.f(function12);
                                Object objM6 = sVar.M();
                                if (zF2 || objM6 == fVar) {
                                    objM6 = new defpackage.d(function12, 23);
                                    sVar.k0(objM6);
                                }
                                Function1 function15 = (Function1) objM6;
                                boolean zH2 = sVar.h(iVar);
                                Object objM7 = sVar.M();
                                if (zH2 || objM7 == fVar) {
                                    objM7 = new jd.a(iVar, 9);
                                    sVar.k0(objM7);
                                }
                                Function1 function16 = (Function1) objM7;
                                boolean zH3 = sVar.h(iVar);
                                Object objM8 = sVar.M();
                                if (zH3 || objM8 == fVar) {
                                    objM8 = new jt.g(iVar, i14);
                                    sVar.k0(objM8);
                                }
                                jh.f.a(null, iVar4, function0, function14, function15, function16, (Function0) objM8, sVar, MLKEMEngine.KyberPolyBytes);
                                z11 = false;
                                sVar.q(false);
                            } else {
                                z11 = false;
                                sVar.a0(1515313094);
                                sVar.q(false);
                            }
                            sVar.q(z11);
                        }
                        if (((Boolean) b1Var2.getValue()).booleanValue()) {
                            sVar.a0(284611599);
                            jh.c cVar = jh.c.BADGES;
                            String strA = iVar.a((Context) sVar.j(v0.f7390b));
                            Object objM9 = sVar.M();
                            if (objM9 == fVar) {
                                objM9 = new n0(b1Var2, 6);
                                sVar.k0(objM9);
                            }
                            Function0 function02 = (Function0) objM9;
                            Object objM10 = sVar.M();
                            if (objM10 == fVar) {
                                objM10 = new n0(b1Var2, 7);
                                sVar.k0(objM10);
                            }
                            jh.f.b(null, cVar, strA, function02, (Function0) objM10, sVar, 27696);
                            sVar.q(false);
                        } else {
                            sVar.a0(285029634);
                            sVar.q(false);
                        }
                        if (((Boolean) b1Var.getValue()).booleanValue()) {
                            sVar.a0(285068756);
                            String strA2 = iVar.a((Context) sVar.j(v0.f7390b));
                            String userBadgesUrl = iVar.f23857e.n().getUserBadgesUrl();
                            if (userBadgesUrl == null) {
                                userBadgesUrl = "";
                            }
                            String str = userBadgesUrl;
                            Object objM11 = sVar.M();
                            if (objM11 == fVar) {
                                objM11 = new n0(b1Var, 8);
                                sVar.k0(objM11);
                            }
                            jh.f.c(null, strA2, str, (Function0) objM11, sVar, 3072);
                            sVar.q(false);
                        } else {
                            sVar.a0(285358978);
                            sVar.q(false);
                        }
                        sVar.q(true);
                    }
                } else {
                    sVar.U();
                }
                break;
            case 1:
                ProfileCO2Saved profileCO2Saved2 = (ProfileCO2Saved) obj9;
                final String str2 = (String) obj8;
                final String str3 = (String) obj7;
                final String str4 = (String) obj5;
                final String str5 = (String) obj4;
                final b1 b1Var3 = (b1) obj6;
                m3.n nVar2 = (m3.n) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((z) obj).getClass();
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    q qVar2 = q.f5711a;
                    t tVarD = m2.d(qVar2, 1.0f);
                    y yVarA3 = w.a(d2.i.f13803c, b4.d.f5695n, sVar2, 48);
                    int iHashCode3 = Long.hashCode(sVar2.T);
                    u3.i iVarL3 = sVar2.l();
                    t tVarC3 = b4.a.c(tVarD, sVar2);
                    j.R.getClass();
                    h hVar2 = b5.i.f5839b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar2);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(yVarA3, b5.i.f5843f, sVar2);
                    m3.i.C(iVarL3, b5.i.f5842e, sVar2);
                    m3.i.v(sVar2, Integer.valueOf(iHashCode3), b5.i.f5844g);
                    m3.i.z(sVar2, b5.i.f5845h);
                    m3.i.C(tVarC3, b5.i.f5841d, sVar2);
                    r9.d(f0.U(sVar2, R.string.profile_page_impact_co2e_card_header), m2.d(c.z(qVar2, e0.s(sVar2, R.dimen.spacing_2)), 1.0f), lv.s.f28217b, 0L, null, 0L, null, new k(3), 0L, 0, false, 0, 0, null, v.f28272k, sVar2, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
                    if (profileCO2Saved2 == null) {
                        sVar2.a0(-1063335561);
                        sVar2.q(false);
                    } else {
                        sVar2.a0(-1063335560);
                        String strA3 = e.ELECTRICITY.a();
                        boolean zF3 = sVar2.f(profileCO2Saved2) | sVar2.f(str2);
                        Object objM12 = sVar2.M();
                        final b1 b1Var4 = this.f26367b;
                        if (zF3 || objM12 == fVar) {
                            profileCO2Saved = profileCO2Saved2;
                            final int i15 = 0;
                            Function0 function03 = new Function0() { // from class: qn.a
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i15) {
                                        case 0:
                                            ProfilePageCO2SavedElectricity savedElectricity = profileCO2Saved.getSavedElectricity();
                                            b1Var4.setValue(String.valueOf(savedElectricity != null ? savedElectricity.getValue() : null));
                                            b1Var3.setValue(str2);
                                            break;
                                        case 1:
                                            NumberFormat numberFormat = NumberFormat.getInstance();
                                            ProfilePageCO2SavedSmartPhoneCharges savedSmartPhoneCharges = profileCO2Saved.getSavedSmartPhoneCharges();
                                            String str6 = numberFormat.format(savedSmartPhoneCharges != null ? savedSmartPhoneCharges.getValue() : null);
                                            str6.getClass();
                                            b1Var4.setValue(str6);
                                            b1Var3.setValue(str2);
                                            break;
                                        case 2:
                                            NumberFormat numberFormat2 = NumberFormat.getInstance();
                                            ProfilePageCO2SavedCupsOfCoffee savedCupsOfCoffee = profileCO2Saved.getSavedCupsOfCoffee();
                                            String str7 = numberFormat2.format(savedCupsOfCoffee != null ? savedCupsOfCoffee.getValue() : null);
                                            str7.getClass();
                                            b1Var4.setValue(str7);
                                            b1Var3.setValue(str2);
                                            break;
                                        default:
                                            ProfilePageCO2SavedHotShower savedHotShower = profileCO2Saved.getSavedHotShower();
                                            b1Var4.setValue(String.valueOf(savedHotShower != null ? savedHotShower.getInMinutes() : null));
                                            b1Var3.setValue(str2);
                                            break;
                                    }
                                    return Unit.f26487a;
                                }
                            };
                            sVar2.k0(function03);
                            objM12 = function03;
                        } else {
                            profileCO2Saved = profileCO2Saved2;
                        }
                        b0 b0Var4 = new b0(strA3, (Function0) objM12, null);
                        String strA4 = e.CHARGES.a();
                        boolean zF4 = sVar2.f(profileCO2Saved) | sVar2.f(str3);
                        Object objM13 = sVar2.M();
                        if (zF4 || objM13 == fVar) {
                            final int i16 = 1;
                            b0Var = b0Var4;
                            Function0 function04 = new Function0() { // from class: qn.a
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i16) {
                                        case 0:
                                            ProfilePageCO2SavedElectricity savedElectricity = profileCO2Saved.getSavedElectricity();
                                            b1Var4.setValue(String.valueOf(savedElectricity != null ? savedElectricity.getValue() : null));
                                            b1Var3.setValue(str3);
                                            break;
                                        case 1:
                                            NumberFormat numberFormat = NumberFormat.getInstance();
                                            ProfilePageCO2SavedSmartPhoneCharges savedSmartPhoneCharges = profileCO2Saved.getSavedSmartPhoneCharges();
                                            String str6 = numberFormat.format(savedSmartPhoneCharges != null ? savedSmartPhoneCharges.getValue() : null);
                                            str6.getClass();
                                            b1Var4.setValue(str6);
                                            b1Var3.setValue(str3);
                                            break;
                                        case 2:
                                            NumberFormat numberFormat2 = NumberFormat.getInstance();
                                            ProfilePageCO2SavedCupsOfCoffee savedCupsOfCoffee = profileCO2Saved.getSavedCupsOfCoffee();
                                            String str7 = numberFormat2.format(savedCupsOfCoffee != null ? savedCupsOfCoffee.getValue() : null);
                                            str7.getClass();
                                            b1Var4.setValue(str7);
                                            b1Var3.setValue(str3);
                                            break;
                                        default:
                                            ProfilePageCO2SavedHotShower savedHotShower = profileCO2Saved.getSavedHotShower();
                                            b1Var4.setValue(String.valueOf(savedHotShower != null ? savedHotShower.getInMinutes() : null));
                                            b1Var3.setValue(str3);
                                            break;
                                    }
                                    return Unit.f26487a;
                                }
                            };
                            sVar2.k0(function04);
                            objM13 = function04;
                        } else {
                            b0Var = b0Var4;
                        }
                        b0 b0Var5 = new b0(strA4, (Function0) objM13, null);
                        String strA5 = e.COFFEE.a();
                        boolean zF5 = sVar2.f(profileCO2Saved) | sVar2.f(str4);
                        Object objM14 = sVar2.M();
                        if (zF5 || objM14 == fVar) {
                            final int i17 = 2;
                            b0Var2 = b0Var5;
                            Function0 function05 = new Function0() { // from class: qn.a
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i17) {
                                        case 0:
                                            ProfilePageCO2SavedElectricity savedElectricity = profileCO2Saved.getSavedElectricity();
                                            b1Var4.setValue(String.valueOf(savedElectricity != null ? savedElectricity.getValue() : null));
                                            b1Var3.setValue(str4);
                                            break;
                                        case 1:
                                            NumberFormat numberFormat = NumberFormat.getInstance();
                                            ProfilePageCO2SavedSmartPhoneCharges savedSmartPhoneCharges = profileCO2Saved.getSavedSmartPhoneCharges();
                                            String str6 = numberFormat.format(savedSmartPhoneCharges != null ? savedSmartPhoneCharges.getValue() : null);
                                            str6.getClass();
                                            b1Var4.setValue(str6);
                                            b1Var3.setValue(str4);
                                            break;
                                        case 2:
                                            NumberFormat numberFormat2 = NumberFormat.getInstance();
                                            ProfilePageCO2SavedCupsOfCoffee savedCupsOfCoffee = profileCO2Saved.getSavedCupsOfCoffee();
                                            String str7 = numberFormat2.format(savedCupsOfCoffee != null ? savedCupsOfCoffee.getValue() : null);
                                            str7.getClass();
                                            b1Var4.setValue(str7);
                                            b1Var3.setValue(str4);
                                            break;
                                        default:
                                            ProfilePageCO2SavedHotShower savedHotShower = profileCO2Saved.getSavedHotShower();
                                            b1Var4.setValue(String.valueOf(savedHotShower != null ? savedHotShower.getInMinutes() : null));
                                            b1Var3.setValue(str4);
                                            break;
                                    }
                                    return Unit.f26487a;
                                }
                            };
                            sVar2.k0(function05);
                            objM14 = function05;
                        } else {
                            b0Var2 = b0Var5;
                        }
                        b0 b0Var6 = new b0(strA5, (Function0) objM14, null);
                        String strA6 = e.SHOWER.a();
                        boolean zF6 = sVar2.f(profileCO2Saved) | sVar2.f(str5);
                        Object objM15 = sVar2.M();
                        if (zF6 || objM15 == fVar) {
                            final int i18 = 3;
                            final ProfileCO2Saved profileCO2Saved3 = profileCO2Saved;
                            b0Var3 = b0Var6;
                            Function0 function06 = new Function0() { // from class: qn.a
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i18) {
                                        case 0:
                                            ProfilePageCO2SavedElectricity savedElectricity = profileCO2Saved3.getSavedElectricity();
                                            b1Var4.setValue(String.valueOf(savedElectricity != null ? savedElectricity.getValue() : null));
                                            b1Var3.setValue(str5);
                                            break;
                                        case 1:
                                            NumberFormat numberFormat = NumberFormat.getInstance();
                                            ProfilePageCO2SavedSmartPhoneCharges savedSmartPhoneCharges = profileCO2Saved3.getSavedSmartPhoneCharges();
                                            String str6 = numberFormat.format(savedSmartPhoneCharges != null ? savedSmartPhoneCharges.getValue() : null);
                                            str6.getClass();
                                            b1Var4.setValue(str6);
                                            b1Var3.setValue(str5);
                                            break;
                                        case 2:
                                            NumberFormat numberFormat2 = NumberFormat.getInstance();
                                            ProfilePageCO2SavedCupsOfCoffee savedCupsOfCoffee = profileCO2Saved3.getSavedCupsOfCoffee();
                                            String str7 = numberFormat2.format(savedCupsOfCoffee != null ? savedCupsOfCoffee.getValue() : null);
                                            str7.getClass();
                                            b1Var4.setValue(str7);
                                            b1Var3.setValue(str5);
                                            break;
                                        default:
                                            ProfilePageCO2SavedHotShower savedHotShower = profileCO2Saved3.getSavedHotShower();
                                            b1Var4.setValue(String.valueOf(savedHotShower != null ? savedHotShower.getInMinutes() : null));
                                            b1Var3.setValue(str5);
                                            break;
                                    }
                                    return Unit.f26487a;
                                }
                            };
                            b1Var3 = b1Var3;
                            b1Var4 = b1Var4;
                            sVar2.k0(function06);
                            objM15 = function06;
                        } else {
                            b0Var3 = b0Var6;
                        }
                        cg.i.a(null, "profilepage_co2e.json", d0.d(b0Var, b0Var2, b0Var3, new b0(strA6, (Function0) objM15, null)), 0, sVar2, 3120, 1);
                        t tVarD2 = m2.d(c.D(qVar2, e0.s(sVar2, R.dimen.spacing_2), e0.s(sVar2, R.dimen.spacing_2), e0.s(sVar2, R.dimen.spacing_2), 0.0f, 8), 1.0f);
                        String str6 = (String) b1Var4.getValue();
                        u0 u0Var = v.l;
                        long j9 = lv.s.C;
                        r9.d(str6, tVarD2, j9, 0L, null, 0L, null, new k(3), 0L, 0, false, 0, 0, null, u0Var, sVar2, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
                        r9.d((String) b1Var3.getValue(), m2.d(c.D(qVar2, e0.s(sVar2, R.dimen.spacing_2), 0.0f, e0.s(sVar2, R.dimen.spacing_2), e0.s(sVar2, R.dimen.spacing_2), 2), 1.0f), j9, 0L, null, 0L, null, new k(3), 0L, 0, false, 0, 0, null, v.f28276p, sVar2, MLKEMEngine.KyberPolyBytes, 12582912, 130040);
                        sVar2.q(false);
                    }
                    sVar2.q(true);
                } else {
                    sVar2.U();
                }
                break;
            default:
                MoneySavedResponse moneySavedResponse2 = (MoneySavedResponse) obj9;
                c0 c0Var = (c0) obj8;
                v80.b0 b0Var7 = (v80.b0) obj7;
                MoneySavedActivity moneySavedActivity = (MoneySavedActivity) obj6;
                GenericErrors genericErrors = (GenericErrors) obj5;
                c3 c3Var = (c3) obj4;
                z1 z1Var2 = (z1) obj;
                m3.n nVar3 = (m3.n) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i19 = MoneySavedActivity.f9312g;
                z1Var2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((s) nVar3).f(z1Var2) ? 4 : 2;
                }
                s sVar3 = (s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    t tVarR2 = c.r(m2.c(m2.d(c.y(v1.n.j(qVar, lv.s.B, r0Var), z1Var2), 1.0f), 1.0f));
                    boolean zH4 = sVar3.h(moneySavedResponse2) | sVar3.f(c0Var) | sVar3.h(b0Var7) | sVar3.h(moneySavedActivity);
                    Object objM16 = sVar3.M();
                    if (zH4 || objM16 == fVar) {
                        moneySavedResponse = moneySavedResponse2;
                        objM16 = new a1(moneySavedResponse, c0Var, b0Var7, moneySavedActivity, this.f26367b, 13);
                        sVar3.k0(objM16);
                    } else {
                        moneySavedResponse = moneySavedResponse2;
                    }
                    ox.h.c(tVarR2, null, null, null, null, null, false, null, (Function1) objM16, sVar3, 0, 510);
                    if (moneySavedResponse == null) {
                        sVar3.a0(-1015840837);
                        r82 = 0;
                        sVar3.q(false);
                    } else {
                        sVar3.a0(-1015840836);
                        d2.g0 g0Var = m2.f13850c;
                        z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
                        int iHashCode4 = Long.hashCode(sVar3.T);
                        u3.i iVarL4 = sVar3.l();
                        t tVarC4 = b4.a.c(g0Var, sVar3);
                        j.R.getClass();
                        h hVar3 = b5.i.f5839b;
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(hVar3);
                        } else {
                            sVar3.n0();
                        }
                        g gVar5 = b5.i.f5843f;
                        m3.i.C(u0VarD, gVar5, sVar3);
                        g gVar6 = b5.i.f5842e;
                        m3.i.C(iVarL4, gVar6, sVar3);
                        Integer numValueOf3 = Integer.valueOf(iHashCode4);
                        g gVar7 = b5.i.f5844g;
                        m3.i.v(sVar3, numValueOf3, gVar7);
                        b5.d dVar3 = b5.i.f5845h;
                        m3.i.z(sVar3, dVar3);
                        g gVar8 = b5.i.f5841d;
                        m3.i.C(tVarC4, gVar8, sVar3);
                        t tVarT = c.t(u.f13938a.a(m2.t(m2.d(qVar, 1.0f), 3), b4.d.f5690h));
                        y yVarA4 = w.a(d2.i.f13803c, b4.d.f5694m, sVar3, 0);
                        int iHashCode5 = Long.hashCode(sVar3.T);
                        u3.i iVarL5 = sVar3.l();
                        t tVarC5 = b4.a.c(tVarT, sVar3);
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(hVar3);
                        } else {
                            sVar3.n0();
                        }
                        m3.i.C(yVarA4, gVar5, sVar3);
                        m3.i.C(iVarL5, gVar6, sVar3);
                        a0.y(iHashCode5, sVar3, gVar7, sVar3, dVar3);
                        m3.i.C(tVarC5, gVar8, sVar3);
                        r82 = 0;
                        pd.g.d(R.drawable.gfx_dollar_bill_icon_small, f0.U(sVar3, R.string.money_saved_total_savings), mv.d.i(moneySavedResponse.getMoneySavedTotal(), 1), sVar3, 0);
                        e0.f.D(sVar3, true, true, false);
                    }
                    if (((Boolean) c3Var.getValue()).booleanValue()) {
                        j4.s.y(-1015062054, r82, sVar3, sVar3, r82);
                    } else {
                        sVar3.a0(-1015019770);
                        sVar3.q(r82);
                    }
                    if (genericErrors == null) {
                        sVar3.a0(-1014997110);
                        sVar3.q(r82);
                    } else {
                        sVar3.a0(-1014997109);
                        o.a(genericErrors, null, null, sVar3, 0, 6);
                        sVar3.q(r82);
                    }
                } else {
                    sVar3.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ a(MoneySavedResponse moneySavedResponse, c0 c0Var, v80.b0 b0Var, MoneySavedActivity moneySavedActivity, GenericErrors genericErrors, b1 b1Var, b1 b1Var2) {
        this.f26369d = moneySavedResponse;
        this.f26370e = c0Var;
        this.f26371f = b0Var;
        this.f26368c = moneySavedActivity;
        this.f26372g = genericErrors;
        this.f26367b = b1Var;
        this.f26373h = b1Var2;
    }

    public /* synthetic */ a(i iVar, l lVar, h1 h1Var, b1 b1Var, Function1 function1, Function1 function12, b1 b1Var2) {
        this.f26369d = iVar;
        this.f26370e = lVar;
        this.f26371f = h1Var;
        this.f26367b = b1Var;
        this.f26372g = function1;
        this.f26373h = function12;
        this.f26368c = b1Var2;
    }
}
