package gi;

import kotlin.jvm.internal.Intrinsics;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20476a;

    public g(String str) {
        str.getClass();
        this.f20476a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.areEqual(this.f20476a, ((g) obj).f20476a);
    }

    public final int hashCode() {
        return this.f20476a.hashCode();
    }

    public final String toString() {
        return a0.p("Success(charityName=", this.f20476a, ")");
    }
}
