package ss;

import com.app.tgtg.model.remote.voucher.BasicVoucher;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c1 extends e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicVoucher f39144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f39145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f39146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f39147d;

    public c1(BasicVoucher basicVoucher, List list, List list2, boolean z11) {
        basicVoucher.getClass();
        list.getClass();
        list2.getClass();
        this.f39144a = basicVoucher;
        this.f39145b = list;
        this.f39146c = list2;
        this.f39147d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return Intrinsics.areEqual(this.f39144a, c1Var.f39144a) && Intrinsics.areEqual(this.f39145b, c1Var.f39145b) && Intrinsics.areEqual(this.f39146c, c1Var.f39146c) && this.f39147d == c1Var.f39147d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f39147d) + e0.f.c(this.f39146c, e0.f.c(this.f39145b, this.f39144a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "VoucherDetailsLoaded(voucher=" + this.f39144a + ", details=" + this.f39145b + ", filters=" + this.f39146c + ", isFromUsedAndExpired=" + this.f39147d + ")";
    }
}
