package ye;

import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f45928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f45929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f45930f;

    public p(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f45925a = str;
        this.f45926b = str2;
        this.f45927c = str3;
        this.f45928d = str4;
        this.f45929e = str5;
        this.f45930f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.areEqual(this.f45925a, pVar.f45925a) && Intrinsics.areEqual(this.f45926b, pVar.f45926b) && Intrinsics.areEqual(this.f45927c, pVar.f45927c) && Intrinsics.areEqual(this.f45928d, pVar.f45928d) && Intrinsics.areEqual(this.f45929e, pVar.f45929e) && Intrinsics.areEqual(this.f45930f, pVar.f45930f);
    }

    public final int hashCode() {
        String str = this.f45925a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f45926b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f45927c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f45928d;
        int iB = l1.b((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f45929e);
        String str5 = this.f45930f;
        return iB + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TargetInfo(className=");
        sb2.append(this.f45925a);
        sb2.append(", resourceName=");
        sb2.append(this.f45926b);
        sb2.append(", tag=");
        sb2.append(this.f45927c);
        sb2.append(", text=");
        sb2.append(this.f45928d);
        sb2.append(", source=");
        sb2.append(this.f45929e);
        sb2.append(", hierarchy=");
        return l1.f(sb2, this.f45930f, ')');
    }
}
