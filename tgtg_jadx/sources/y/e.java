package y;

import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44526b;

    public e(String str, String str2) {
        this.f44525a = str;
        this.f44526b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f44525a, eVar.f44525a) && Intrinsics.areEqual(this.f44526b, eVar.f44526b);
    }

    public final int hashCode() {
        return this.f44526b.hashCode() + (this.f44525a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceInfo(manufacturer=");
        sb2.append(this.f44525a);
        sb2.append(", model=");
        return l1.f(sb2, this.f44526b, ')');
    }
}
