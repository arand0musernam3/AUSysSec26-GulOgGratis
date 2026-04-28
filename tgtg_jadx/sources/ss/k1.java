package ss;

import com.app.tgtg.model.remote.voucher.BasicVoucher;
import com.app.tgtg.model.remote.voucher.VoucherMode;
import com.app.tgtg.model.remote.voucher.response.AddNewVoucherResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k1 extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f39200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AddNewVoucherResponse f39203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final VoucherMode f39204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BasicVoucher f39205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f39206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f39207h;

    public /* synthetic */ k1(List list, int i11, int i12, AddNewVoucherResponse addNewVoucherResponse, VoucherMode voucherMode, BasicVoucher basicVoucher, String str, int i13) {
        this(list, i11, i12, (i13 & 8) != 0 ? null : addNewVoucherResponse, voucherMode, (i13 & 32) != 0 ? null : basicVoucher, (i13 & 64) != 0 ? null : str, false);
    }

    public static k1 a(k1 k1Var, boolean z11, int i11) {
        List list = k1Var.f39200a;
        int i12 = k1Var.f39201b;
        int i13 = k1Var.f39202c;
        AddNewVoucherResponse addNewVoucherResponse = (i11 & 8) != 0 ? k1Var.f39203d : null;
        VoucherMode voucherMode = k1Var.f39204e;
        BasicVoucher basicVoucher = k1Var.f39205f;
        String str = (i11 & 64) != 0 ? k1Var.f39206g : null;
        if ((i11 & 128) != 0) {
            z11 = k1Var.f39207h;
        }
        list.getClass();
        voucherMode.getClass();
        return new k1(list, i12, i13, addNewVoucherResponse, voucherMode, basicVoucher, str, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return Intrinsics.areEqual(this.f39200a, k1Var.f39200a) && this.f39201b == k1Var.f39201b && this.f39202c == k1Var.f39202c && Intrinsics.areEqual(this.f39203d, k1Var.f39203d) && this.f39204e == k1Var.f39204e && Intrinsics.areEqual(this.f39205f, k1Var.f39205f) && Intrinsics.areEqual(this.f39206g, k1Var.f39206g) && this.f39207h == k1Var.f39207h;
    }

    public final int hashCode() {
        int iB = r8.k.b(this.f39202c, r8.k.b(this.f39201b, this.f39200a.hashCode() * 31, 31), 31);
        AddNewVoucherResponse addNewVoucherResponse = this.f39203d;
        int iHashCode = (this.f39204e.hashCode() + ((iB + (addNewVoucherResponse == null ? 0 : addNewVoucherResponse.hashCode())) * 31)) * 31;
        BasicVoucher basicVoucher = this.f39205f;
        int iHashCode2 = (iHashCode + (basicVoucher == null ? 0 : basicVoucher.hashCode())) * 31;
        String str = this.f39206g;
        return Boolean.hashCode(this.f39207h) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "VoucherListLoaded(vouchers=" + this.f39200a + ", regularCount=" + this.f39201b + ", discountCount=" + this.f39202c + ", addVoucherResponse=" + this.f39203d + ", mode=" + this.f39204e + ", claimedVoucher=" + this.f39205f + ", prefilledVoucherCode=" + this.f39206g + ", isAddingVoucher=" + this.f39207h + ")";
    }

    public k1(List list, int i11, int i12, AddNewVoucherResponse addNewVoucherResponse, VoucherMode voucherMode, BasicVoucher basicVoucher, String str, boolean z11) {
        list.getClass();
        voucherMode.getClass();
        this.f39200a = list;
        this.f39201b = i11;
        this.f39202c = i12;
        this.f39203d = addNewVoucherResponse;
        this.f39204e = voucherMode;
        this.f39205f = basicVoucher;
        this.f39206g = str;
        this.f39207h = z11;
    }
}
