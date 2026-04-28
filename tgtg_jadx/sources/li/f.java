package li;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mi.a f27859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f27860b;

    public f(mi.a aVar, boolean z11) {
        this.f27859a = aVar;
        this.f27860b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f27859a, fVar.f27859a) && this.f27860b == fVar.f27860b;
    }

    public final int hashCode() {
        mi.a aVar = this.f27859a;
        return Boolean.hashCode(this.f27860b) + ((aVar == null ? 0 : aVar.hashCode()) * 31);
    }

    public final String toString() {
        return "NotificationsSettingsState(settings=" + this.f27859a + ", isLoading=" + this.f27860b + ")";
    }
}
