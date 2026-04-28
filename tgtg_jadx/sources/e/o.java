package e;

import kotlin.jvm.internal.Intrinsics;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends q9.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15300b;

    public o(long j9, Object obj) {
        this.f15299a = obj;
        this.f15300b = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f15299a, oVar.f15299a) && this.f15300b == oVar.f15300b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15300b) + (this.f15299a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PredictiveBackHandlerInfo(owner=");
        sb2.append(this.f15299a);
        sb2.append(", compositeKey=");
        return a0.r(sb2, this.f15300b, ')');
    }
}
