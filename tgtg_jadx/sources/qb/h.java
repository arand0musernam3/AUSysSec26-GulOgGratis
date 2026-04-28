package qb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36800b;

    public h(String str, int i11) {
        str.getClass();
        this.f36799a = str;
        this.f36800b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f36799a, hVar.f36799a) && this.f36800b == hVar.f36800b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36800b) + (this.f36799a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb2.append(this.f36799a);
        sb2.append(", generation=");
        return r8.k.o(sb2, this.f36800b, ')');
    }
}
