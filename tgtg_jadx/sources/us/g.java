package us;

import com.app.tgtg.model.remote.voucher.CurrencyBasedVoucher;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CurrencyBasedVoucher f41525b;

    public /* synthetic */ g(CurrencyBasedVoucher currencyBasedVoucher, int i11, int i12) {
        this.f41524a = i12;
        this.f41525b = currencyBasedVoucher;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f41524a;
        m3.n nVar = (m3.n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                a.d(this.f41525b, nVar, m3.i.F(1));
                break;
            default:
                a.c(this.f41525b, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }
}
