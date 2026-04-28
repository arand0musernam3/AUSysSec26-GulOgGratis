package ss;

import com.app.tgtg.model.remote.voucher.BasicVoucher;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j1 extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicVoucher f39193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f39194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f39195c;

    public j1(BasicVoucher basicVoucher, List list, List list2) {
        basicVoucher.getClass();
        list.getClass();
        list2.getClass();
        this.f39193a = basicVoucher;
        this.f39194b = list;
        this.f39195c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return Intrinsics.areEqual(this.f39193a, j1Var.f39193a) && Intrinsics.areEqual(this.f39194b, j1Var.f39194b) && Intrinsics.areEqual(this.f39195c, j1Var.f39195c);
    }

    public final int hashCode() {
        return this.f39195c.hashCode() + e0.f.c(this.f39194b, this.f39193a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VoucherDetailsLoaded(voucher=");
        sb2.append(this.f39193a);
        sb2.append(", details=");
        sb2.append(this.f39194b);
        sb2.append(", filters=");
        return e0.f.p(sb2, this.f39195c, ")");
    }
}
