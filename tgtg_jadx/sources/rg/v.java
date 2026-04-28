package rg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f38026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f38027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f38028f;

    public v(int i11, int i12, int i13, int i14, int i15, Integer num) {
        this.f38023a = i11;
        this.f38024b = i12;
        this.f38025c = i13;
        this.f38026d = i14;
        this.f38027e = i15;
        this.f38028f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f38023a == vVar.f38023a && this.f38024b == vVar.f38024b && this.f38025c == vVar.f38025c && this.f38026d == vVar.f38026d && this.f38027e == vVar.f38027e && Intrinsics.areEqual(this.f38028f, vVar.f38028f);
    }

    public final int hashCode() {
        int iB = r8.k.b(this.f38027e, r8.k.b(this.f38026d, r8.k.b(this.f38025c, r8.k.b(this.f38024b, Integer.hashCode(this.f38023a) * 31, 31), 31), 31), 31);
        Integer num = this.f38028f;
        return iB + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbR = r8.k.r(this.f38023a, this.f38024b, "SmallWidgetViews(storeImage=", ", storeLogo=", ", pickupTime=");
        e0.f.C(sbR, this.f38025c, ", pickupDay=", this.f38026d, ", itemView=");
        sbR.append(this.f38027e);
        sbR.append(", emptyView=");
        sbR.append(this.f38028f);
        sbR.append(")");
        return sbR.toString();
    }
}
