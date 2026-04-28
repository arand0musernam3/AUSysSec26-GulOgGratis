package ss;

import com.app.tgtg.model.remote.specialrewards.SpecialReward;
import com.app.tgtg.model.remote.voucher.BasicVoucher;
import com.app.tgtg.model.remote.voucher.response.AddNewVoucherResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d1 extends e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f39154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f39155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AddNewVoucherResponse f39157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BasicVoucher f39158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f39159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f39160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SpecialReward f39161h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SpecialReward f39162i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f39163j;

    public d1(List list, ArrayList arrayList, int i11, AddNewVoucherResponse addNewVoucherResponse, BasicVoucher basicVoucher, String str, int i12, int i13) {
        this(list, arrayList, i11, (i13 & 8) != 0 ? null : addNewVoucherResponse, (i13 & 16) != 0 ? null : basicVoucher, (i13 & 32) != 0 ? null : str, false, null, null, i12);
    }

    public static d1 a(d1 d1Var, boolean z11, SpecialReward specialReward, SpecialReward specialReward2, int i11, int i12) {
        AddNewVoucherResponse addNewVoucherResponse;
        String str;
        List list = d1Var.f39154a;
        List list2 = d1Var.f39155b;
        int i13 = d1Var.f39156c;
        if ((i12 & 8) != 0) {
            addNewVoucherResponse = d1Var.f39157d;
            str = null;
        } else {
            addNewVoucherResponse = null;
            str = null;
        }
        BasicVoucher basicVoucher = d1Var.f39158e;
        if ((i12 & 32) != 0) {
            str = d1Var.f39159f;
        }
        if ((i12 & 64) != 0) {
            z11 = d1Var.f39160g;
        }
        boolean z12 = z11;
        if ((i12 & 128) != 0) {
            specialReward = d1Var.f39161h;
        }
        SpecialReward specialReward3 = specialReward;
        if ((i12 & 256) != 0) {
            specialReward2 = d1Var.f39162i;
        }
        SpecialReward specialReward4 = specialReward2;
        int i14 = (i12 & 512) != 0 ? d1Var.f39163j : i11;
        d1Var.getClass();
        list.getClass();
        list2.getClass();
        return new d1(list, list2, i13, addNewVoucherResponse, basicVoucher, str, z12, specialReward3, specialReward4, i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return Intrinsics.areEqual(this.f39154a, d1Var.f39154a) && Intrinsics.areEqual(this.f39155b, d1Var.f39155b) && this.f39156c == d1Var.f39156c && Intrinsics.areEqual(this.f39157d, d1Var.f39157d) && Intrinsics.areEqual(this.f39158e, d1Var.f39158e) && Intrinsics.areEqual(this.f39159f, d1Var.f39159f) && this.f39160g == d1Var.f39160g && Intrinsics.areEqual(this.f39161h, d1Var.f39161h) && Intrinsics.areEqual(this.f39162i, d1Var.f39162i) && this.f39163j == d1Var.f39163j;
    }

    public final int hashCode() {
        int iB = r8.k.b(this.f39156c, e0.f.c(this.f39155b, this.f39154a.hashCode() * 31, 31), 31);
        AddNewVoucherResponse addNewVoucherResponse = this.f39157d;
        int iHashCode = (iB + (addNewVoucherResponse == null ? 0 : addNewVoucherResponse.hashCode())) * 31;
        BasicVoucher basicVoucher = this.f39158e;
        int iHashCode2 = (iHashCode + (basicVoucher == null ? 0 : basicVoucher.hashCode())) * 31;
        String str = this.f39159f;
        int iE = r8.k.e((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f39160g);
        SpecialReward specialReward = this.f39161h;
        int iHashCode3 = (iE + (specialReward == null ? 0 : specialReward.hashCode())) * 31;
        SpecialReward specialReward2 = this.f39162i;
        return Integer.hashCode(this.f39163j) + ((iHashCode3 + (specialReward2 != null ? specialReward2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "VoucherListLoaded(vouchers=" + this.f39154a + ", specialRewards=" + this.f39155b + ", regularCount=" + this.f39156c + ", addVoucherResponse=" + this.f39157d + ", claimedVoucher=" + this.f39158e + ", prefilledVoucherCode=" + this.f39159f + ", isAddingVoucher=" + this.f39160g + ", selectedSpecialReward=" + this.f39161h + ", redeemedSpecialReward=" + this.f39162i + ", currentPage=" + this.f39163j + ")";
    }

    public d1(List list, List list2, int i11, AddNewVoucherResponse addNewVoucherResponse, BasicVoucher basicVoucher, String str, boolean z11, SpecialReward specialReward, SpecialReward specialReward2, int i12) {
        list.getClass();
        this.f39154a = list;
        this.f39155b = list2;
        this.f39156c = i11;
        this.f39157d = addNewVoucherResponse;
        this.f39158e = basicVoucher;
        this.f39159f = str;
        this.f39160g = z11;
        this.f39161h = specialReward;
        this.f39162i = specialReward2;
        this.f39163j = i12;
    }
}
