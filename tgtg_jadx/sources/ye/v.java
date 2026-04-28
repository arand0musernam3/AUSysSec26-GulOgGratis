package ye;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f45940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f45941b;

    public v() {
        w wVar = new w();
        h hVar = new h();
        this.f45940a = wVar;
        this.f45941b = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.areEqual(this.f45940a, vVar.f45940a) && Intrinsics.areEqual(this.f45941b, vVar.f45941b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Boolean.hashCode(true) * 31);
    }

    public final String toString() {
        return "InteractionsOptions(rageClick=" + this.f45940a + ", deadClick=" + this.f45941b + ')';
    }
}
