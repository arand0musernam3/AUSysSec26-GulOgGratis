package xl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44456b;

    public i(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f44455a = str;
        this.f44456b = str2;
    }

    @Override // xl.j
    public final String a() {
        return this.f44455a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f44455a, iVar.f44455a) && Intrinsics.areEqual(this.f44456b, iVar.f44456b);
    }

    public final int hashCode() {
        return this.f44456b.hashCode() + (this.f44455a.hashCode() * 31);
    }

    public final String toString() {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("VerifyEmail(email=", this.f44455a, ", pollingId=", this.f44456b, ")");
    }
}
