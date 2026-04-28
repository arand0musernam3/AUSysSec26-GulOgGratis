package qs;

import a3.z1;
import co.k;
import com.app.tgtg.feature.tabprofile.manageaccount.vouchers.VoucherExperienceActivity;
import com.app.tgtg.model.remote.specialrewards.SpecialReward;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.b1;
import m3.k1;
import m3.m;
import m3.n;
import m3.s;
import m90.z;
import qb.r;
import ss.d1;
import ss.e1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VoucherExperienceActivity f37255b;

    public /* synthetic */ e(VoucherExperienceActivity voucherExperienceActivity, int i11) {
        this.f37254a = i11;
        this.f37255b = voucherExperienceActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f37254a;
        VoucherExperienceActivity voucherExperienceActivity = this.f37255b;
        int i12 = 2;
        boolean z11 = true;
        switch (i11) {
            case 0:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i13 = VoucherExperienceActivity.f9443h;
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    PantryThemeKt.PantryTheme(false, null, u3.e.e(-1432077771, sVar, new e(voucherExperienceActivity, z11 ? 1 : 0)), sVar, 390, 2);
                } else {
                    sVar.U();
                }
                break;
            default:
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i14 = VoucherExperienceActivity.f9443h;
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    b1 b1VarN = m3.i.n(voucherExperienceActivity.D().f37262e, sVar2, 0);
                    Object objM = sVar2.M();
                    x70.c cVar = null;
                    m3.f fVar = m.f29332a;
                    Object obj3 = objM;
                    if (objM == fVar) {
                        k1 k1VarW = m3.i.w(null);
                        sVar2.k0(k1VarW);
                        obj3 = k1VarW;
                    }
                    b1 b1Var = (b1) obj3;
                    e1 e1Var = (e1) b1VarN.getValue();
                    boolean zF = sVar2.f(b1VarN);
                    Object objM2 = sVar2.M();
                    Object obj4 = objM2;
                    if (zF || objM2 == fVar) {
                        k kVar = new k(b1VarN, b1Var, cVar, i12);
                        sVar2.k0(kVar);
                        obj4 = kVar;
                    }
                    m3.i.h(e1Var, (Function2) obj4, sVar2);
                    boolean zF2 = sVar2.f(b1VarN) | sVar2.h(voucherExperienceActivity);
                    Object objM3 = sVar2.M();
                    Object obj5 = objM3;
                    if (zF2 || objM3 == fVar) {
                        z zVar = new z(27, voucherExperienceActivity, b1VarN);
                        sVar2.k0(zVar);
                        obj5 = zVar;
                    }
                    jf.e.a(false, (Function0) obj5, sVar2, 0, 1);
                    e1 e1Var2 = (e1) b1VarN.getValue();
                    b4.k kVar2 = b4.d.f5683a;
                    boolean zH = sVar2.h(voucherExperienceActivity);
                    Object objM4 = sVar2.M();
                    Object obj6 = objM4;
                    if (zH || objM4 == fVar) {
                        li.c cVar2 = new li.c(voucherExperienceActivity, b1Var, 23);
                        sVar2.k0(cVar2);
                        obj6 = cVar2;
                    }
                    Function1 function1 = (Function1) obj6;
                    boolean zH2 = sVar2.h(voucherExperienceActivity);
                    Object objM5 = sVar2.M();
                    Object obj7 = objM5;
                    if (zH2 || objM5 == fVar) {
                        r rVar = new r(voucherExperienceActivity, 15);
                        sVar2.k0(rVar);
                        obj7 = rVar;
                    }
                    s1.i.a(e1Var2, null, function1, kVar2, "VoucherStateTransition", (Function1) obj7, u3.e.e(-1508410184, sVar2, new z1(voucherExperienceActivity, 9)), sVar2, 1600512, 2);
                    if (((e1) b1VarN.getValue()) instanceof d1) {
                        sVar2.a0(-1114337509);
                        e1 e1Var3 = (e1) b1VarN.getValue();
                        e1Var3.getClass();
                        d1 d1Var = (d1) e1Var3;
                        SpecialReward specialReward = d1Var.f39161h;
                        if (specialReward == null) {
                            sVar2.a0(-1114201606);
                            sVar2.q(false);
                        } else {
                            sVar2.a0(-1114201605);
                            rs.k.k(specialReward, d1Var.f39162i != null, voucherExperienceActivity.D().f37260c, sVar2, 0);
                            sVar2.q(false);
                        }
                        sVar2.q(false);
                    } else {
                        sVar2.a0(-1113889683);
                        sVar2.q(false);
                    }
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
