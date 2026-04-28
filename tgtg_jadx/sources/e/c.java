package e;

import kotlin.jvm.internal.Intrinsics;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends q9.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15277b;

    public c(long j9, Object obj) {
        this.f15276a = obj;
        this.f15277b = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f15276a, cVar.f15276a) && this.f15277b == cVar.f15277b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15277b) + (this.f15276a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackHandlerInfo(owner=");
        sb2.append(this.f15276a);
        sb2.append(", compositeKey=");
        return a0.r(sb2, this.f15277b, ')');
    }
}
