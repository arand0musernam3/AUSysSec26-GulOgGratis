package s0;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f38364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f38365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38366c;

    public j2(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, int i11) {
        this.f38364a = linkedHashMap;
        this.f38365b = linkedHashMap2;
        this.f38366c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        return Intrinsics.areEqual(this.f38364a, j2Var.f38364a) && Intrinsics.areEqual(this.f38365b, j2Var.f38365b) && this.f38366c == j2Var.f38366c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38366c) + ((this.f38365b.hashCode() + (this.f38364a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SurfaceStreamSpecQueryResult(useCaseStreamSpecs=");
        sb2.append(this.f38364a);
        sb2.append(", attachedSurfaceStreamSpecs=");
        sb2.append(this.f38365b);
        sb2.append(", maxSupportedFrameRate=");
        return r8.k.o(sb2, this.f38366c, ')');
    }
}
