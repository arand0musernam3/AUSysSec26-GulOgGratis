package ts;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f40467b;

    public /* synthetic */ t(int i11) {
        this(null, (i11 & 2) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.areEqual(this.f40466a, tVar.f40466a) && this.f40467b == tVar.f40467b;
    }

    public final int hashCode() {
        String str = this.f40466a;
        return Boolean.hashCode(this.f40467b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "LoadVoucherList(code=" + this.f40466a + ", forceRefresh=" + this.f40467b + ")";
    }

    public t(String str, boolean z11) {
        this.f40466a = str;
        this.f40467b = z11;
    }
}
