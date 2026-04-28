package hg;

import com.app.tgtg.model.remote.voucher.BasicVoucher;
import com.app.tgtg.model.remote.voucher.DiscountVoucher;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.n;
import m3.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BasicVoucher f22033b;

    public /* synthetic */ a(BasicVoucher basicVoucher, int i11) {
        this.f22032a = i11;
        this.f22033b = basicVoucher;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        n nVar = (n) obj;
        Integer num = (Integer) obj2;
        switch (this.f22032a) {
            case 0:
                num.getClass();
                a.a.a(this.f22033b, nVar, m3.i.F(1));
                break;
            case 1:
                num.getClass();
                a.a.a(this.f22033b, nVar, m3.i.F(1));
                break;
            case 2:
                num.getClass();
                a.a.a(this.f22033b, nVar, m3.i.F(1));
                break;
            case 3:
                int iIntValue = num.intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    BasicVoucher basicVoucher = this.f22033b;
                    if (!(basicVoucher instanceof DiscountVoucher) || ((DiscountVoucher) basicVoucher).getNumberOfInitialOrders() <= 1) {
                        sVar.a0(-1472924341);
                        sVar.q(false);
                    } else {
                        sVar.a0(-1472992572);
                        ig.b.i(basicVoucher, sVar, 0);
                        sVar.q(false);
                    }
                } else {
                    sVar.U();
                }
                break;
            case 4:
                int iIntValue2 = num.intValue();
                s sVar2 = (s) nVar;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ig.b.g(this.f22033b, sVar2, 0);
                } else {
                    sVar2.U();
                }
                break;
            case 5:
                num.getClass();
                ig.b.a(this.f22033b, nVar, m3.i.F(1));
                break;
            case 6:
                num.getClass();
                ig.b.a(this.f22033b, nVar, m3.i.F(1));
                break;
            case 7:
                num.getClass();
                ig.b.e(this.f22033b, nVar, m3.i.F(1));
                break;
            case 8:
                num.getClass();
                ig.b.g(this.f22033b, nVar, m3.i.F(1));
                break;
            case 9:
                num.getClass();
                ig.b.f(this.f22033b, nVar, m3.i.F(1));
                break;
            case 10:
                num.getClass();
                ig.b.i(this.f22033b, nVar, m3.i.F(1));
                break;
            case 11:
                num.getClass();
                us.a.j(this.f22033b, nVar, m3.i.F(1));
                break;
            case 12:
                num.getClass();
                us.a.E(this.f22033b, nVar, m3.i.F(1));
                break;
            default:
                num.getClass();
                us.a.C(this.f22033b, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ a(BasicVoucher basicVoucher, int i11, int i12) {
        this.f22032a = i12;
        this.f22033b = basicVoucher;
    }
}
