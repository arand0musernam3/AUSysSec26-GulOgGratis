package aj;

import com.app.tgtg.model.remote.voucher.DiscountVoucher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DiscountVoucher f1502a;

    public i(DiscountVoucher discountVoucher) {
        discountVoucher.getClass();
        this.f1502a = discountVoucher;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.areEqual(this.f1502a, ((i) obj).f1502a);
    }

    public final int hashCode() {
        return this.f1502a.hashCode();
    }

    public final String toString() {
        return "Discount(voucher=" + this.f1502a + ")";
    }
}
