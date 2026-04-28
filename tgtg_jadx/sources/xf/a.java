package xf;

import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44244b;

    public a(String str, String str2) {
        this.f44243a = str;
        this.f44244b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f44243a, aVar.f44243a) && Intrinsics.areEqual(this.f44244b, aVar.f44244b);
    }

    public final int hashCode() {
        String str = this.f44243a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f44244b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Identity(userId=");
        sb2.append(this.f44243a);
        sb2.append(", deviceId=");
        return l1.f(sb2, this.f44244b, ')');
    }
}
