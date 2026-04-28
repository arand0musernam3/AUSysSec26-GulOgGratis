package ss;

import com.app.tgtg.model.remote.voucher.BasicVoucher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h1 extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicVoucher f39185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39186b;

    public h1(String str, BasicVoucher basicVoucher) {
        basicVoucher.getClass();
        this.f39185a = basicVoucher;
        this.f39186b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return Intrinsics.areEqual(this.f39185a, h1Var.f39185a) && Intrinsics.areEqual(this.f39186b, h1Var.f39186b);
    }

    public final int hashCode() {
        int iHashCode = this.f39185a.hashCode() * 31;
        String str = this.f39186b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ReferralVoucherClaimed(voucher=" + this.f39185a + ", termsUrl=" + this.f39186b + ")";
    }
}
