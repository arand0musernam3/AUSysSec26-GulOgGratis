package em;

import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16095b;

    public i(List list, int i11) {
        this((i11 & 1) != 0 ? n0.f26529a : list, (i11 & 2) == 0);
    }

    public static i a(i iVar, boolean z11) {
        List list = iVar.f16094a;
        iVar.getClass();
        list.getClass();
        return new i(list, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f16094a, iVar.f16094a) && this.f16095b == iVar.f16095b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16095b) + (this.f16094a.hashCode() * 31);
    }

    public final String toString() {
        return "LoginCharityContactState(countries=" + this.f16094a + ", isLoading=" + this.f16095b + ")";
    }

    public i(List list, boolean z11) {
        list.getClass();
        this.f16094a = list;
        this.f16095b = z11;
    }
}
