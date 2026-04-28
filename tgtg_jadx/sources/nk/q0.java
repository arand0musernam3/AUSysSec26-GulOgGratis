package nk;

import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.payment.Price;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q0 extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicItem f31035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f31036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jl.b f31037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rk.e0 f31038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f31039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v0 f31040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f31041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f31042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f31043i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final aj.n f31044j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f31045k;
    public final Price l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f31046m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f31047n;

    public q0(BasicItem basicItem, List list, jl.b bVar, rk.e0 e0Var, a aVar, v0 v0Var, boolean z11, boolean z12, List list2, aj.n nVar, boolean z13, Price price, List list3, long j9) {
        list.getClass();
        bVar.getClass();
        e0Var.getClass();
        list2.getClass();
        nVar.getClass();
        list3.getClass();
        this.f31035a = basicItem;
        this.f31036b = list;
        this.f31037c = bVar;
        this.f31038d = e0Var;
        this.f31039e = aVar;
        this.f31040f = v0Var;
        this.f31041g = z11;
        this.f31042h = z12;
        this.f31043i = list2;
        this.f31044j = nVar;
        this.f31045k = z13;
        this.l = price;
        this.f31046m = list3;
        this.f31047n = j9;
    }

    public static q0 a(q0 q0Var, BasicItem basicItem, rk.e0 e0Var, a aVar, aj.n nVar, boolean z11, long j9, int i11) {
        BasicItem basicItem2 = (i11 & 1) != 0 ? q0Var.f31035a : basicItem;
        List list = q0Var.f31036b;
        jl.b bVar = q0Var.f31037c;
        rk.e0 e0Var2 = (i11 & 8) != 0 ? q0Var.f31038d : e0Var;
        a aVar2 = (i11 & 16) != 0 ? q0Var.f31039e : aVar;
        v0 v0Var = q0Var.f31040f;
        boolean z12 = q0Var.f31041g;
        boolean z13 = q0Var.f31042h;
        List list2 = q0Var.f31043i;
        aj.n nVar2 = (i11 & 512) != 0 ? q0Var.f31044j : nVar;
        boolean z14 = (i11 & 1024) != 0 ? q0Var.f31045k : z11;
        Price price = q0Var.l;
        List list3 = q0Var.f31046m;
        long j11 = (i11 & 8192) != 0 ? q0Var.f31047n : j9;
        q0Var.getClass();
        list.getClass();
        bVar.getClass();
        e0Var2.getClass();
        list2.getClass();
        nVar2.getClass();
        list3.getClass();
        return new q0(basicItem2, list, bVar, e0Var2, aVar2, v0Var, z12, z13, list2, nVar2, z14, price, list3, j11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Intrinsics.areEqual(this.f31035a, q0Var.f31035a) && Intrinsics.areEqual(this.f31036b, q0Var.f31036b) && this.f31037c == q0Var.f31037c && this.f31038d == q0Var.f31038d && Intrinsics.areEqual(this.f31039e, q0Var.f31039e) && Intrinsics.areEqual(this.f31040f, q0Var.f31040f) && this.f31041g == q0Var.f31041g && this.f31042h == q0Var.f31042h && Intrinsics.areEqual(this.f31043i, q0Var.f31043i) && Intrinsics.areEqual(this.f31044j, q0Var.f31044j) && this.f31045k == q0Var.f31045k && Intrinsics.areEqual(this.l, q0Var.l) && Intrinsics.areEqual(this.f31046m, q0Var.f31046m) && this.f31047n == q0Var.f31047n;
    }

    public final int hashCode() {
        int iE = r8.k.e((this.f31044j.hashCode() + e0.f.c(this.f31043i, r8.k.e(r8.k.e((this.f31040f.hashCode() + ((this.f31039e.hashCode() + ((this.f31038d.hashCode() + ((this.f31037c.hashCode() + e0.f.c(this.f31036b, this.f31035a.hashCode() * 31, 31)) * 31)) * 31)) * 31)) * 31, 31, this.f31041g), 31, this.f31042h), 31)) * 31, 31, this.f31045k);
        Price price = this.l;
        return Long.hashCode(this.f31047n) + e0.f.c(this.f31046m, (iE + (price == null ? 0 : price.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemLoaded(item=");
        sb2.append(this.f31035a);
        sb2.append(", recommendedItems=");
        sb2.append(this.f31036b);
        sb2.append(", locationId=");
        sb2.append(this.f31037c);
        sb2.append(", translationMode=");
        sb2.append(this.f31038d);
        sb2.append(", constraints=");
        sb2.append(this.f31039e);
        sb2.append(", trackingParams=");
        sb2.append(this.f31040f);
        sb2.append(", shouldShowVoucherExperience=");
        b3.i.C(sb2, this.f31041g, ", hasAvailableVouchers=", this.f31042h, ", voucherItems=");
        sb2.append(this.f31043i);
        sb2.append(", voucherSelection=");
        sb2.append(this.f31044j);
        sb2.append(", showVouchersBottomSheet=");
        sb2.append(this.f31045k);
        sb2.append(", discountedItemPriceUsingVouchers=");
        sb2.append(this.l);
        sb2.append(", discountedItemPriceUsingDiscounts=");
        sb2.append(this.f31046m);
        sb2.append(", timestamp=");
        sb2.append(this.f31047n);
        sb2.append(")");
        return sb2.toString();
    }
}
