package dx;

import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15208c;

    public o(String str, String str2, String str3) {
        this.f15206a = str;
        this.f15207b = str2;
        this.f15208c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f15206a, oVar.f15206a) && Intrinsics.areEqual(this.f15207b, oVar.f15207b) && Intrinsics.areEqual(this.f15208c, oVar.f15208c);
    }

    public final int hashCode() {
        return this.f15208c.hashCode() + l1.b(this.f15206a.hashCode() * 31, 31, this.f15207b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CloudBridgeCredentials(datasetID=");
        sb2.append(this.f15206a);
        sb2.append(", cloudBridgeURL=");
        sb2.append(this.f15207b);
        sb2.append(", accessKey=");
        return l1.f(sb2, this.f15208c, ')');
    }
}
