package ux;

import kotlin.jvm.internal.Intrinsics;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f41567b;

    public a(String str, boolean z11) {
        str.getClass();
        this.f41566a = str;
        this.f41567b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f41566a, aVar.f41566a) && this.f41567b == aVar.f41567b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.f41566a.hashCode() * 31;
        boolean z11 = this.f41567b;
        ?? r12 = z11;
        if (z11) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GateKeeper(name=");
        sb2.append(this.f41566a);
        sb2.append(", value=");
        return k.q(sb2, this.f41567b, ')');
    }
}
