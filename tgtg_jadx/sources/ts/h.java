package ts;

import com.app.tgtg.model.remote.voucher.VoucherMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VoucherMode f40449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f40450c;

    public h(String str, VoucherMode voucherMode, boolean z11) {
        voucherMode.getClass();
        this.f40448a = str;
        this.f40449b = voucherMode;
        this.f40450c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f40448a, hVar.f40448a) && this.f40449b == hVar.f40449b && this.f40450c == hVar.f40450c;
    }

    public final int hashCode() {
        String str = this.f40448a;
        return Boolean.hashCode(this.f40450c) + ((this.f40449b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LoadVoucherList(code=");
        sb2.append(this.f40448a);
        sb2.append(", voucherMode=");
        sb2.append(this.f40449b);
        sb2.append(", forceRefresh=");
        return j4.s.o(sb2, this.f40450c, ")");
    }
}
