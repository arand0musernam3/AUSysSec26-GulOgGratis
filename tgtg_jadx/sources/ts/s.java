package ts;

import com.app.tgtg.model.remote.VoucherId;
import com.app.tgtg.model.remote.voucher.response.VoucherType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VoucherType f40463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f40464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f40465c;

    public s(VoucherType voucherType, String str, boolean z11) {
        str.getClass();
        this.f40463a = voucherType;
        this.f40464b = str;
        this.f40465c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f40463a == sVar.f40463a && VoucherId.m302equalsimpl0(this.f40464b, sVar.f40464b) && this.f40465c == sVar.f40465c;
    }

    public final int hashCode() {
        VoucherType voucherType = this.f40463a;
        return Boolean.hashCode(this.f40465c) + ((VoucherId.m303hashCodeimpl(this.f40464b) + ((voucherType == null ? 0 : voucherType.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        String strM304toStringimpl = VoucherId.m304toStringimpl(this.f40464b);
        StringBuilder sb2 = new StringBuilder("LoadVoucherDetails(voucherType=");
        sb2.append(this.f40463a);
        sb2.append(", voucherId=");
        sb2.append(strM304toStringimpl);
        sb2.append(", isFromUsedAndExpired=");
        return j4.s.o(sb2, this.f40465c, ")");
    }

    public /* synthetic */ s(VoucherType voucherType, String str, int i11) {
        this((i11 & 1) != 0 ? null : voucherType, str, false);
    }
}
