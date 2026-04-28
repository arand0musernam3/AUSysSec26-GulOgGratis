package aj;

import com.app.tgtg.model.remote.payment.VoucherPaymentInformation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VoucherPaymentInformation f1501a;

    public h(VoucherPaymentInformation voucherPaymentInformation) {
        voucherPaymentInformation.getClass();
        this.f1501a = voucherPaymentInformation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.areEqual(this.f1501a, ((h) obj).f1501a);
    }

    public final int hashCode() {
        return this.f1501a.hashCode();
    }

    public final String toString() {
        return "Currency(info=" + this.f1501a + ")";
    }
}
