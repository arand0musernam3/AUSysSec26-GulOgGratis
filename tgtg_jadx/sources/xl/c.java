package xl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44445b;

    public c(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f44444a = str;
        this.f44445b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f44444a, cVar.f44444a) && Intrinsics.areEqual(this.f44445b, cVar.f44445b);
    }

    public final int hashCode() {
        return this.f44445b.hashCode() + (this.f44444a.hashCode() * 31);
    }

    public final String toString() {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("Partner(partnerUrl=", this.f44444a, ", email=", this.f44445b, ")");
    }
}
