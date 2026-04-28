package ts;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40436a;

    public a(String str) {
        this.f40436a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.f40436a, ((a) obj).f40436a);
    }

    public final int hashCode() {
        return this.f40436a.hashCode();
    }

    public final String toString() {
        return w.a0.p("AddVoucher(code=", this.f40436a, ")");
    }
}
