package zi;

import com.app.tgtg.model.remote.voucher.DiscountVoucher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DiscountVoucher f47928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47929b;

    public b(DiscountVoucher discountVoucher, int i11) {
        discountVoucher.getClass();
        this.f47928a = discountVoucher;
        this.f47929b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f47928a, bVar.f47928a) && this.f47929b == bVar.f47929b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f47929b) + (this.f47928a.hashCode() * 31);
    }

    public final String toString() {
        return "VoucherRemoved(previousVoucher=" + this.f47928a + ", previousQuantity=" + this.f47929b + ")";
    }
}
