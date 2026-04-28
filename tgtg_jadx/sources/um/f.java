package um;

import kotlin.jvm.internal.Intrinsics;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41395a = "BASKET_STATUS_ID";

    @Override // um.d
    public final String a() {
        return this.f41395a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.areEqual(this.f41395a, ((f) obj).f41395a);
    }

    public final int hashCode() {
        return this.f41395a.hashCode();
    }

    public final String toString() {
        return a0.p("BasketStatusElement(elementId=", this.f41395a, ")");
    }
}
