package ts;

import com.app.tgtg.model.remote.voucher.VoucherMode;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VoucherMode f40440a;

    public c(VoucherMode voucherMode) {
        voucherMode.getClass();
        this.f40440a = voucherMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f40440a == ((c) obj).f40440a;
    }

    public final int hashCode() {
        return this.f40440a.hashCode();
    }

    public final String toString() {
        return "ChangeMode(mode=" + this.f40440a + ")";
    }
}
