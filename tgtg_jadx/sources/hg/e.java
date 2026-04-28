package hg;

import com.app.tgtg.model.remote.payment.VoucherPaymentInformation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.n;
import m3.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VoucherPaymentInformation f22046b;

    public /* synthetic */ e(VoucherPaymentInformation voucherPaymentInformation, int i11) {
        this.f22045a = 2;
        this.f22046b = voucherPaymentInformation;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) obj;
        Integer num = (Integer) obj2;
        switch (this.f22045a) {
            case 0:
                int iIntValue = num.intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    VoucherPaymentInformation voucherPaymentInformation = this.f22046b;
                    if (voucherPaymentInformation.getNumberOfVouchers() > 1) {
                        sVar.a0(253591092);
                        ig.b.h(voucherPaymentInformation, sVar, 0);
                        sVar.q(false);
                    } else {
                        sVar.a0(253685270);
                        sVar.q(false);
                    }
                } else {
                    sVar.U();
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                s sVar2 = (s) nVar;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ig.b.b(this.f22046b.getTotalVoucherAmount(), ig.d.SMALL, sVar2, 48);
                } else {
                    sVar2.U();
                }
                break;
            default:
                num.getClass();
                ig.b.h(this.f22046b, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ e(VoucherPaymentInformation voucherPaymentInformation, int i11, byte b8) {
        this.f22045a = i11;
        this.f22046b = voucherPaymentInformation;
    }
}
