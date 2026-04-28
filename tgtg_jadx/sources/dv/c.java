package dv;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15175a;

    public /* synthetic */ c(Object obj) {
        this.f15175a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return Intrinsics.areEqual(this.f15175a, ((c) obj).f15175a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f15175a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return org.bouncycastle.jcajce.provider.asymmetric.a.c(this.f15175a, "TrackingValue(rawValue=", ")");
    }
}
