package w;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f42723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f42724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f42726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f42727e;

    public m0(List list, List list2, int i11, int i12, int i13) {
        this.f42723a = list;
        this.f42724b = list2;
        this.f42725c = i11;
        this.f42726d = i12;
        this.f42727e = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Intrinsics.areEqual(this.f42723a, m0Var.f42723a) && Intrinsics.areEqual(this.f42724b, m0Var.f42724b) && this.f42725c == m0Var.f42725c && this.f42726d == m0Var.f42726d && this.f42727e == m0Var.f42727e;
    }

    public final int hashCode() {
        int iHashCode = this.f42723a.hashCode() * 31;
        List list = this.f42724b;
        return Integer.hashCode(this.f42727e) + r8.k.b(this.f42726d, r8.k.b(this.f42725c, (iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BestSizesAndMaxFpsForConfigs(bestSizes=");
        sb2.append(this.f42723a);
        sb2.append(", bestSizesForStreamUseCase=");
        sb2.append(this.f42724b);
        sb2.append(", maxFpsForBestSizes=");
        sb2.append(this.f42725c);
        sb2.append(", maxFpsForStreamUseCase=");
        sb2.append(this.f42726d);
        sb2.append(", maxFpsForAllSizes=");
        return r8.k.o(sb2, this.f42727e, ')');
    }
}
