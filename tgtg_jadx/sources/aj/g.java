package aj;

import d40.t1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends t1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f1499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f1500h;

    public g(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f1499g = str;
        this.f1500h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f1499g, gVar.f1499g) && Intrinsics.areEqual(this.f1500h, gVar.f1500h);
    }

    public final int hashCode() {
        return this.f1500h.hashCode() + (this.f1499g.hashCode() * 31);
    }

    public final String toString() {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("LegacyMigrate(alias=", this.f1499g, ", legacyCiphertextBase64=", this.f1500h, ")");
    }
}
