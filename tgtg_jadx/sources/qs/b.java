package qs;

import a3.z1;
import co.k;
import com.app.tgtg.feature.tabprofile.manageaccount.vouchers.VoucherActivity;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.b1;
import m3.m;
import m3.n;
import m3.s;
import m90.z;
import qb.r;
import ss.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VoucherActivity f37251b;

    public /* synthetic */ b(VoucherActivity voucherActivity, int i11) {
        this.f37250a = i11;
        this.f37251b = voucherActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f37250a;
        VoucherActivity voucherActivity = this.f37251b;
        int i12 = 1;
        switch (i11) {
            case 0:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i13 = VoucherActivity.f9440h;
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    PantryThemeKt.PantryTheme(false, null, u3.e.e(1801298633, sVar, new b(voucherActivity, i12)), sVar, 390, 2);
                } else {
                    sVar.U();
                }
                break;
            default:
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i14 = VoucherActivity.f9440h;
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    b1 b1VarN = m3.i.n(voucherActivity.b0().f37267e, sVar2, 0);
                    Object objM = sVar2.M();
                    x70.c cVar = null;
                    m3.f fVar = m.f29332a;
                    if (objM == fVar) {
                        objM = m3.i.w(null);
                        sVar2.k0(objM);
                    }
                    b1 b1Var = (b1) objM;
                    l1 l1Var = (l1) b1VarN.getValue();
                    boolean zF = sVar2.f(b1VarN);
                    Object objM2 = sVar2.M();
                    if (zF || objM2 == fVar) {
                        objM2 = new k(b1VarN, b1Var, cVar, i12);
                        sVar2.k0(objM2);
                    }
                    m3.i.h(l1Var, (Function2) objM2, sVar2);
                    boolean zF2 = sVar2.f(b1VarN) | sVar2.h(voucherActivity);
                    Object objM3 = sVar2.M();
                    if (zF2 || objM3 == fVar) {
                        objM3 = new z(26, voucherActivity, b1VarN);
                        sVar2.k0(objM3);
                    }
                    jf.e.a(false, (Function0) objM3, sVar2, 0, 1);
                    l1 l1Var2 = (l1) b1VarN.getValue();
                    b4.k kVar = b4.d.f5683a;
                    boolean zH = sVar2.h(voucherActivity);
                    Object objM4 = sVar2.M();
                    if (zH || objM4 == fVar) {
                        objM4 = new li.c(voucherActivity, b1Var, 22);
                        sVar2.k0(objM4);
                    }
                    Function1 function1 = (Function1) objM4;
                    boolean zH2 = sVar2.h(voucherActivity);
                    Object objM5 = sVar2.M();
                    if (zH2 || objM5 == fVar) {
                        objM5 = new r(voucherActivity, 12);
                        sVar2.k0(objM5);
                    }
                    s1.i.a(l1Var2, null, function1, kVar, "VoucherStateTransition", (Function1) objM5, u3.e.e(285153346, sVar2, new z1(voucherActivity, 8)), sVar2, 1600512, 2);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
