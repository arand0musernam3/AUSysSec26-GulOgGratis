package ts;

import com.app.tgtg.model.remote.voucher.BasicVoucher;
import com.app.tgtg.model.remote.voucher.VoucherMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VoucherMode f40454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasicVoucher f40455b;

    public l(VoucherMode voucherMode, BasicVoucher basicVoucher) {
        voucherMode.getClass();
        basicVoucher.getClass();
        this.f40454a = voucherMode;
        this.f40455b = basicVoucher;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f40454a == lVar.f40454a && Intrinsics.areEqual(this.f40455b, lVar.f40455b);
    }

    public final int hashCode() {
        return this.f40455b.hashCode() + (this.f40454a.hashCode() * 31);
    }

    public final String toString() {
        return "OnVoucherClaimed(mode=" + this.f40454a + ", voucher=" + this.f40455b + ")";
    }
}
