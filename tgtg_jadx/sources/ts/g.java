package ts;

import com.app.tgtg.model.remote.VoucherId;
import com.app.tgtg.model.remote.voucher.VoucherMode;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VoucherMode f40446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40447b;

    public g(VoucherMode voucherMode, String str) {
        voucherMode.getClass();
        str.getClass();
        this.f40446a = voucherMode;
        this.f40447b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f40446a == gVar.f40446a && VoucherId.m302equalsimpl0(this.f40447b, gVar.f40447b);
    }

    public final int hashCode() {
        return VoucherId.m303hashCodeimpl(this.f40447b) + (this.f40446a.hashCode() * 31);
    }

    public final String toString() {
        return "LoadVoucherDetails(mode=" + this.f40446a + ", voucherId=" + VoucherId.m304toStringimpl(this.f40447b) + ")";
    }
}
