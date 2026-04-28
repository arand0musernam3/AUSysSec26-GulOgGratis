package f0;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f16577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f16578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f16579d;

    public b3(ArrayList arrayList, LinkedHashMap linkedHashMap, r rVar, LinkedHashMap linkedHashMap2) {
        this.f16576a = arrayList;
        this.f16577b = linkedHashMap;
        this.f16578c = rVar;
        this.f16579d = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) obj;
        return Intrinsics.areEqual(this.f16576a, b3Var.f16576a) && Intrinsics.areEqual(this.f16577b, b3Var.f16577b) && Intrinsics.areEqual(this.f16578c, b3Var.f16578c) && Intrinsics.areEqual(this.f16579d, b3Var.f16579d);
    }

    public final int hashCode() {
        int iHashCode = (this.f16577b.hashCode() + (this.f16576a.hashCode() * 31)) * 31;
        r rVar = this.f16578c;
        return this.f16579d.hashCode() + ((iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31);
    }

    public final String toString() {
        return "OutputConfigurations(all=" + this.f16576a + ", deferred=" + this.f16577b + ", postviewOutput=" + this.f16578c + ", outputSurfaceMap=" + this.f16579d + ')';
    }
}
