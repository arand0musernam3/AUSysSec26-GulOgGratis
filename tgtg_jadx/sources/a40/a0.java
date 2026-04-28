package a40;

import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f699b;

    public a0(String str, String str2) {
        this.f698a = str;
        this.f699b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.areEqual(this.f698a, a0Var.f698a) && Intrinsics.areEqual(this.f699b, a0Var.f699b);
    }

    public final int hashCode() {
        String str = this.f698a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f699b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FirebaseInstallationId(fid=");
        sb2.append(this.f698a);
        sb2.append(", authToken=");
        return l1.f(sb2, this.f699b, ')');
    }
}
