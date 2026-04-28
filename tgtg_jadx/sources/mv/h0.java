package mv;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30190b;

    public h0(String str, int i11) {
        str.getClass();
        this.f30189a = str;
        this.f30190b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return Intrinsics.areEqual(this.f30189a, h0Var.f30189a) && this.f30190b == h0Var.f30190b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30190b) + (this.f30189a.hashCode() * 31);
    }

    public final String toString() {
        return "DecimalFormatterKey(language=" + this.f30189a + ", numberOfDecimals=" + this.f30190b + ")";
    }
}
