package ok;

import com.app.tgtg.model.remote.voucher.DiscountVoucher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DiscountVoucher f32625a;

    public u(DiscountVoucher discountVoucher) {
        discountVoucher.getClass();
        this.f32625a = discountVoucher;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.areEqual(this.f32625a, ((u) obj).f32625a);
    }

    public final int hashCode() {
        return this.f32625a.hashCode();
    }

    public final String toString() {
        return "VoucherDiscountSelected(voucher=" + this.f32625a + ")";
    }
}
