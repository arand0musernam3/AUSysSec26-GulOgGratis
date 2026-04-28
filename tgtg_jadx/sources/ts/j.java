package ts;

import com.app.tgtg.model.remote.voucher.VoucherMode;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VoucherMode f40452a;

    public j(VoucherMode voucherMode) {
        voucherMode.getClass();
        this.f40452a = voucherMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f40452a == ((j) obj).f40452a;
    }

    public final int hashCode() {
        return this.f40452a.hashCode();
    }

    public final String toString() {
        return "NavigateToUsedAndExpired(mode=" + this.f40452a + ")";
    }
}
