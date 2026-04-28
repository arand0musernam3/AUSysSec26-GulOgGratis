package at;

import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f4783g;

    public g0(String str, String str2, int i11, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f4777a = str;
        this.f4778b = str2;
        this.f4779c = i11;
        this.f4780d = z11;
        this.f4781e = z12;
        this.f4782f = z13;
        this.f4783g = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.areEqual(this.f4777a, g0Var.f4777a) && Intrinsics.areEqual(this.f4778b, g0Var.f4778b) && this.f4779c == g0Var.f4779c && this.f4780d == g0Var.f4780d && this.f4781e == g0Var.f4781e && this.f4782f == g0Var.f4782f && this.f4783g == g0Var.f4783g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4783g) + r8.k.e(r8.k.e(r8.k.e(r8.k.b(this.f4779c, l1.b(this.f4777a.hashCode() * 31, 31, this.f4778b), 31), 31, this.f4780d), 31, this.f4781e), 31, this.f4782f);
    }

    public final String toString() {
        StringBuilder sbT = e0.f.t("Update(url=", this.f4777a, ", title=", this.f4778b, ", titleRes=");
        sbT.append(this.f4779c);
        sbT.append(", isPageFinished=");
        sbT.append(this.f4780d);
        sbT.append(", allowZoom=");
        b3.i.C(sbT, this.f4781e, ", clearCookies=", this.f4782f, ", isStoreReferral=");
        return j4.s.o(sbT, this.f4783g, ")");
    }
}
