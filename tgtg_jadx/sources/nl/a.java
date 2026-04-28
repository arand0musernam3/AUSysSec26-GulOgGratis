package nl;

import e0.f;
import j4.s;
import kotlin.jvm.internal.Intrinsics;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f31084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f31085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f31086e;

    public a(String str, String str2, String str3, String str4, String str5) {
        this.f31082a = str;
        this.f31083b = str2;
        this.f31084c = str3;
        this.f31085d = str4;
        this.f31086e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f31082a, aVar.f31082a) && Intrinsics.areEqual(this.f31083b, aVar.f31083b) && Intrinsics.areEqual(this.f31084c, aVar.f31084c) && Intrinsics.areEqual(this.f31085d, aVar.f31085d) && Intrinsics.areEqual(this.f31086e, aVar.f31086e);
    }

    public final int hashCode() {
        String str = this.f31082a;
        int iB = l1.b((str == null ? 0 : str.hashCode()) * 31, 31, this.f31083b);
        String str2 = this.f31084c;
        int iHashCode = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f31085d;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f31086e;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = f.t("OptInData(title=", this.f31082a, ", animationFile=", this.f31083b, ", body=");
        s.A(sbT, this.f31084c, ", privacyPolicy=", this.f31085d, ", description=");
        return k.p(sbT, this.f31086e, ")");
    }
}
