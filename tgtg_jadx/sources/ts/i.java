package ts;

import com.app.tgtg.model.remote.voucher.BasicVoucher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicVoucher f40451a;

    public i(BasicVoucher basicVoucher) {
        basicVoucher.getClass();
        this.f40451a = basicVoucher;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.areEqual(this.f40451a, ((i) obj).f40451a);
    }

    public final int hashCode() {
        return this.f40451a.hashCode();
    }

    public final String toString() {
        return "NavigateToReferralVoucherClaimed(voucher=" + this.f40451a + ")";
    }
}
