package bg;

import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f6149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6150g;

    public f(int i11, int i12, String str, boolean z11, boolean z12, g gVar, boolean z13) {
        str.getClass();
        gVar.getClass();
        this.f6144a = i11;
        this.f6145b = i12;
        this.f6146c = str;
        this.f6147d = z11;
        this.f6148e = z12;
        this.f6149f = gVar;
        this.f6150g = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f6144a == fVar.f6144a && this.f6145b == fVar.f6145b && Intrinsics.areEqual(this.f6146c, fVar.f6146c) && this.f6147d == fVar.f6147d && this.f6148e == fVar.f6148e && this.f6149f == fVar.f6149f && this.f6150g == fVar.f6150g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6150g) + ((this.f6149f.hashCode() + r8.k.e(r8.k.e(l1.b(r8.k.b(this.f6145b, Integer.hashCode(this.f6144a) * 31, 31), 31, this.f6146c), 31, this.f6147d), 31, this.f6148e)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = r8.k.r(this.f6144a, this.f6145b, "BasketDataHolder(quantity=", ", stock=", ", buttonText=");
        r8.k.z(sbR, this.f6146c, ", isAtMaxLimit=", this.f6147d, ", isReserveBtnVisible=");
        sbR.append(this.f6148e);
        sbR.append(", buttonType=");
        sbR.append(this.f6149f);
        sbR.append(", loading=");
        return j4.s.o(sbR, this.f6150g, ")");
    }
}
