package mv;

import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30193c;

    public i0(String str, String str2, int i11) {
        str2.getClass();
        this.f30191a = str;
        this.f30192b = str2;
        this.f30193c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Intrinsics.areEqual(this.f30191a, i0Var.f30191a) && Intrinsics.areEqual(this.f30192b, i0Var.f30192b) && this.f30193c == i0Var.f30193c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30193c) + l1.b(this.f30191a.hashCode() * 31, 31, this.f30192b);
    }

    public final String toString() {
        return r8.k.i(this.f30193c, ")", e0.f.t("PriceFormatterKey(language=", this.f30191a, ", currency=", this.f30192b, ", decimals="));
    }
}
