package um;

import kotlin.jvm.internal.Intrinsics;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41394a = "BASKET_STATE_ID";

    @Override // um.d
    public final String a() {
        return this.f41394a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.areEqual(this.f41394a, ((e) obj).f41394a);
    }

    public final int hashCode() {
        return this.f41394a.hashCode();
    }

    public final String toString() {
        return a0.p("BasketStateElement(elementId=", this.f41394a, ")");
    }
}
