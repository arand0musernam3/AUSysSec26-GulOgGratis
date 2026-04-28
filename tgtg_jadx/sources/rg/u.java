package rg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f38019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f38020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f38021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f38022g;

    public u(int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f38016a = i11;
        this.f38017b = i12;
        this.f38018c = i13;
        this.f38019d = i14;
        this.f38020e = i15;
        this.f38021f = i16;
        this.f38022g = i17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f38016a == uVar.f38016a && this.f38017b == uVar.f38017b && this.f38018c == uVar.f38018c && this.f38019d == uVar.f38019d && this.f38020e == uVar.f38020e && this.f38021f == uVar.f38021f && this.f38022g == uVar.f38022g && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        return r8.k.b(this.f38022g, r8.k.b(this.f38021f, r8.k.b(this.f38020e, r8.k.b(this.f38019d, r8.k.b(this.f38018c, r8.k.b(this.f38017b, Integer.hashCode(this.f38016a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbR = r8.k.r(this.f38016a, this.f38017b, "LargeWidgetViews(storeImage=", ", storeLogo=", ", storeName=");
        e0.f.C(sbR, this.f38018c, ", itemName=", this.f38019d, ", pickupTime=");
        e0.f.C(sbR, this.f38020e, ", pickupDay=", this.f38021f, ", itemView=");
        return r8.k.i(this.f38022g, ", emptyView=null)", sbR);
    }
}
