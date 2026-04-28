package ss;

import com.app.tgtg.model.remote.voucher.VoucherMode;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i1 extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f39189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VoucherMode f39190b;

    public i1(List list, VoucherMode voucherMode) {
        list.getClass();
        voucherMode.getClass();
        this.f39189a = list;
        this.f39190b = voucherMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return Intrinsics.areEqual(this.f39189a, i1Var.f39189a) && this.f39190b == i1Var.f39190b;
    }

    public final int hashCode() {
        return this.f39190b.hashCode() + (this.f39189a.hashCode() * 31);
    }

    public final String toString() {
        return "UsedAndExpiredVouchersLoaded(usedAndExpiredVouchers=" + this.f39189a + ", mode=" + this.f39190b + ")";
    }
}
