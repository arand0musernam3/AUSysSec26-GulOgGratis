package qb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36796c;

    public f(String str, int i11, int i12) {
        str.getClass();
        this.f36794a = str;
        this.f36795b = i11;
        this.f36796c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f36794a, fVar.f36794a) && this.f36795b == fVar.f36795b && this.f36796c == fVar.f36796c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36796c) + r8.k.b(this.f36795b, this.f36794a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SystemIdInfo(workSpecId=");
        sb2.append(this.f36794a);
        sb2.append(", generation=");
        sb2.append(this.f36795b);
        sb2.append(", systemId=");
        return r8.k.o(sb2, this.f36796c, ')');
    }
}
