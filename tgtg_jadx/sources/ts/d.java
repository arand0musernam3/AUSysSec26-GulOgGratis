package ts;

import com.app.tgtg.model.remote.voucher.BasicVoucher;
import com.app.tgtg.model.remote.voucher.VoucherMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VoucherMode f40441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BasicVoucher f40442b;

    public d(VoucherMode voucherMode, BasicVoucher basicVoucher) {
        voucherMode.getClass();
        basicVoucher.getClass();
        this.f40441a = voucherMode;
        this.f40442b = basicVoucher;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f40441a == dVar.f40441a && Intrinsics.areEqual(this.f40442b, dVar.f40442b);
    }

    public final int hashCode() {
        return this.f40442b.hashCode() + (this.f40441a.hashCode() * 31);
    }

    public final String toString() {
        return "FetchStoreFilter(mode=" + this.f40441a + ", voucher=" + this.f40442b + ")";
    }
}
