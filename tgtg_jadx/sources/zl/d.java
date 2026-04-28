package zl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f47969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f47970b;

    public d(boolean z11, int i11, Integer num) {
        num = (i11 & 1) != 0 ? null : num;
        z11 = (i11 & 2) != 0 ? false : z11;
        this.f47969a = num;
        this.f47970b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f47969a, dVar.f47969a) && this.f47970b == dVar.f47970b;
    }

    public final int hashCode() {
        Integer num = this.f47969a;
        return Boolean.hashCode(this.f47970b) + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "LoginCharityEnterEmailState(errorMessage=" + this.f47969a + ", isLoading=" + this.f47970b + ")";
    }
}
