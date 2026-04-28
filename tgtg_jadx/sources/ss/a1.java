package ss;

import com.app.tgtg.model.remote.voucher.BasicVoucher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a1 extends e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicVoucher f39129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39130b;

    public a1(String str, BasicVoucher basicVoucher) {
        basicVoucher.getClass();
        this.f39129a = basicVoucher;
        this.f39130b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return Intrinsics.areEqual(this.f39129a, a1Var.f39129a) && Intrinsics.areEqual(this.f39130b, a1Var.f39130b);
    }

    public final int hashCode() {
        int iHashCode = this.f39129a.hashCode() * 31;
        String str = this.f39130b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ReferralVoucherClaimed(voucher=" + this.f39129a + ", termsUrl=" + this.f39130b + ")";
    }
}
