package hg;

import b4.q;
import b4.t;
import b5.j;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.payment.VoucherPaymentInformation;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.p;
import g3.s0;
import i4.g0;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.m;
import m3.n;
import m3.s;
import o30.f0;
import w.a0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22051a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f22052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f22054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f22055e;

    public /* synthetic */ g(t tVar, Date date, boolean z11, boolean z12, int i11) {
        this.f22055e = tVar;
        this.f22053c = date;
        this.f22052b = z11;
        this.f22054d = z12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f22051a;
        m3.f fVar = m.f29332a;
        boolean z11 = this.f22054d;
        Object obj3 = this.f22053c;
        Object obj4 = this.f22055e;
        switch (i11) {
            case 0:
                VoucherPaymentInformation voucherPaymentInformation = (VoucherPaymentInformation) obj4;
                Function0 function0 = (Function0) obj3;
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String strT = f0.T(R.string.voucher_stacked_name, new Object[]{voucherPaymentInformation.getTotalVoucherAmount().getCurrency()}, sVar);
                    u3.d dVarE = u3.e.e(-124842676, sVar, new e(voucherPaymentInformation, 0, (byte) 0));
                    u3.d dVarE2 = u3.e.e(-2024759155, sVar, new e(voucherPaymentInformation, 1, (byte) 0));
                    String expiryOfSoonestExpiryVoucher = voucherPaymentInformation.getExpiryOfSoonestExpiryVoucher();
                    if (z11) {
                        sVar.a0(-1293308568);
                        sVar.q(false);
                    } else {
                        sVar.a0(-1293247591);
                        Object objM = sVar.M();
                        if (objM == fVar) {
                            objM = new h60.b(15);
                            sVar.k0(objM);
                        }
                        function0 = (Function0) objM;
                        sVar.q(false);
                    }
                    i.d(strT, dVarE, dVarE2, expiryOfSoonestExpiryVoucher, this.f22052b, function0, sVar, 432);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                Function0 function02 = (Function0) obj3;
                Function0 function03 = (Function0) obj4;
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    q qVar = q.f5711a;
                    t tVarJ = v1.n.j(m2.d(qVar, 1.0f), lv.s.J, g0.f23254b);
                    u0 u0VarD = p.d(b4.d.f5683a, false);
                    int iHashCode = Long.hashCode(sVar2.T);
                    u3.i iVarL = sVar2.l();
                    t tVarC = b4.a.c(tVarJ, sVar2);
                    j.R.getClass();
                    b5.h hVar = b5.i.f5839b;
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar);
                    } else {
                        sVar2.n0();
                    }
                    b5.g gVar = b5.i.f5843f;
                    m3.i.C(u0VarD, gVar, sVar2);
                    b5.g gVar2 = b5.i.f5842e;
                    m3.i.C(iVarL, gVar2, sVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b5.g gVar3 = b5.i.f5844g;
                    m3.i.v(sVar2, numValueOf, gVar3);
                    b5.d dVar = b5.i.f5845h;
                    m3.i.z(sVar2, dVar);
                    b5.g gVar4 = b5.i.f5841d;
                    m3.i.C(tVarC, gVar4, sVar2);
                    t tVarD = m2.d(qVar, 1.0f);
                    float f11 = lv.t.f28254h;
                    t tVarT = d2.c.t(d2.c.A(tVarD, f11, f11));
                    i2 i2VarA = h2.a(d2.i.f13807g, b4.d.f5693k, sVar2, 54);
                    int iHashCode2 = Long.hashCode(sVar2.T);
                    u3.i iVarL2 = sVar2.l();
                    t tVarC2 = b4.a.c(tVarT, sVar2);
                    sVar2.e0();
                    if (sVar2.S) {
                        sVar2.k(hVar);
                    } else {
                        sVar2.n0();
                    }
                    m3.i.C(i2VarA, gVar, sVar2);
                    m3.i.C(iVarL2, gVar2, sVar2);
                    a0.y(iHashCode2, sVar2, gVar3, sVar2, dVar);
                    m3.i.C(tVarC2, gVar4, sVar2);
                    boolean z12 = this.f22052b;
                    if (z12) {
                        sVar2.a0(-603103209);
                        boolean zF = sVar2.f(function02);
                        Object objM2 = sVar2.M();
                        if (zF || objM2 == fVar) {
                            objM2 = new ki.a(14, function02);
                            sVar2.k0(objM2);
                        }
                        s0.h((Function0) objM2, null, false, null, null, null, lp.d.f28022f, sVar2, 1572864, 62);
                        sVar2.q(false);
                    } else {
                        sVar2.a0(-602627514);
                        sVar2.q(false);
                    }
                    v0.n.n(z12 ? qVar : m2.d(qVar, 1.0f), f0.U(sVar2, z11 ? R.string.fridge_recipe_details_recipe_saved : R.string.fridge_recipe_details_save_recipe), null, null, lv.e.MEDIUM, false, false, null, Integer.valueOf(z11 ? R.drawable.recipe_generator_bookmark_saved : R.drawable.recipe_generator_bookmark), function03, sVar2, 24576, 236);
                    sVar2.q(true);
                    sVar2.q(true);
                } else {
                    sVar2.U();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                oo.a.l(this.f22052b, this.f22054d, (Function1) obj4, (Function1) obj3, (n) obj, m3.i.F(1));
                break;
            default:
                ((Integer) obj2).getClass();
                w.b.c((t) obj4, (Date) obj3, this.f22052b, this.f22054d, (n) obj, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ g(VoucherPaymentInformation voucherPaymentInformation, boolean z11, boolean z12, Function0 function0) {
        this.f22055e = voucherPaymentInformation;
        this.f22052b = z11;
        this.f22054d = z12;
        this.f22053c = function0;
    }

    public /* synthetic */ g(boolean z11, Function0 function0, boolean z12, Function0 function02) {
        this.f22052b = z11;
        this.f22053c = function0;
        this.f22054d = z12;
        this.f22055e = function02;
    }

    public /* synthetic */ g(boolean z11, boolean z12, Function1 function1, Function1 function12, int i11) {
        this.f22052b = z11;
        this.f22054d = z12;
        this.f22055e = function1;
        this.f22053c = function12;
    }
}
