package ss;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b1 extends e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f39139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f39140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f39141c;

    public b1(List list, ArrayList arrayList, boolean z11, int i11) {
        list = (i11 & 1) != 0 ? kotlin.collections.n0.f26529a : list;
        List list2 = (i11 & 2) != 0 ? kotlin.collections.n0.f26529a : arrayList;
        list.getClass();
        list2.getClass();
        this.f39139a = list;
        this.f39140b = list2;
        this.f39141c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return Intrinsics.areEqual(this.f39139a, b1Var.f39139a) && Intrinsics.areEqual(this.f39140b, b1Var.f39140b) && this.f39141c == b1Var.f39141c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f39141c) + e0.f.c(this.f39140b, this.f39139a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UsedAndExpiredVouchersLoaded(usedAndExpiredVouchers=");
        sb2.append(this.f39139a);
        sb2.append(", usedAndExpiredSpecialRewards=");
        sb2.append(this.f39140b);
        sb2.append(", isFromSpecialRewards=");
        return j4.s.o(sb2, this.f39141c, ")");
    }
}
