package q5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f36008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f36009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f36011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f36012e;

    public d0(i iVar, r rVar, int i11, int i12, Object obj) {
        this.f36008a = iVar;
        this.f36009b = rVar;
        this.f36010c = i11;
        this.f36011d = i12;
        this.f36012e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.areEqual(this.f36008a, d0Var.f36008a) && Intrinsics.areEqual(this.f36009b, d0Var.f36009b) && this.f36010c == d0Var.f36010c && this.f36011d == d0Var.f36011d && Intrinsics.areEqual(this.f36012e, d0Var.f36012e);
    }

    public final int hashCode() {
        i iVar = this.f36008a;
        int iB = r8.k.b(this.f36011d, r8.k.b(this.f36010c, (((iVar == null ? 0 : iVar.hashCode()) * 31) + this.f36009b.f36049a) * 31, 31), 31);
        Object obj = this.f36012e;
        return iB + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TypefaceRequest(fontFamily=");
        sb2.append(this.f36008a);
        sb2.append(", fontWeight=");
        sb2.append(this.f36009b);
        sb2.append(", fontStyle=");
        String str = "Invalid";
        int i11 = this.f36010c;
        sb2.append((Object) (i11 == 0 ? "Normal" : i11 == 1 ? "Italic" : "Invalid"));
        sb2.append(", fontSynthesis=");
        int i12 = this.f36011d;
        if (i12 == 0) {
            str = "None";
        } else if (i12 == 1) {
            str = "Weight";
        } else if (i12 == 2) {
            str = "Style";
        } else if (i12 == 65535) {
            str = "All";
        }
        sb2.append((Object) str);
        sb2.append(", resourceLoaderCacheKey=");
        sb2.append(this.f36012e);
        sb2.append(')');
        return sb2.toString();
    }
}
