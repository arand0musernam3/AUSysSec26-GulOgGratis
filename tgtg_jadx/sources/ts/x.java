package ts;

import com.app.tgtg.model.remote.voucher.BasicVoucher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicVoucher f40471a;

    public x(BasicVoucher basicVoucher) {
        basicVoucher.getClass();
        this.f40471a = basicVoucher;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.areEqual(this.f40471a, ((x) obj).f40471a);
    }

    public final int hashCode() {
        return this.f40471a.hashCode();
    }

    public final String toString() {
        return "OnVoucherClaimed(voucher=" + this.f40471a + ")";
    }
}
