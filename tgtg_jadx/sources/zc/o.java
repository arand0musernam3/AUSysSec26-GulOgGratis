package zc;

import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f47504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47505b;

    public o(Integer num, String str) {
        this.f47504a = num;
        this.f47505b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f47504a, oVar.f47504a) && Intrinsics.areEqual(this.f47505b, oVar.f47505b);
    }

    public final int hashCode() {
        int iHashCode = this.f47504a.hashCode() * 31;
        String str = this.f47505b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Entry(value=");
        sb2.append(this.f47504a);
        sb2.append(", memoryCacheKey=");
        return l1.f(sb2, this.f47505b, ')');
    }
}
