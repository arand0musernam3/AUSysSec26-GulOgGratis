package aj;

import com.app.tgtg.model.remote.voucher.DiscountVoucher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DiscountVoucher f1504a;

    public l(DiscountVoucher discountVoucher) {
        discountVoucher.getClass();
        this.f1504a = discountVoucher;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.areEqual(this.f1504a, ((l) obj).f1504a);
    }

    public final int hashCode() {
        return this.f1504a.hashCode();
    }

    public final String toString() {
        return "Discount(voucher=" + this.f1504a + ")";
    }
}
