package androidx.activity;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends q9.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f1763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LifecycleOwner f1764b;

    public z(y yVar, LifecycleOwner lifecycleOwner) {
        yVar.getClass();
        this.f1763a = yVar;
        this.f1764b = lifecycleOwner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.areEqual(this.f1763a, zVar.f1763a) && Intrinsics.areEqual(this.f1764b, zVar.f1764b);
    }

    public final int hashCode() {
        int iHashCode = this.f1763a.hashCode() * 31;
        LifecycleOwner lifecycleOwner = this.f1764b;
        return iHashCode + (lifecycleOwner == null ? 0 : lifecycleOwner.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f1763a + ", owner=" + this.f1764b + ')';
    }
}
