package nj;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f30903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f30904c;

    public a(boolean z11, boolean z12, boolean z13) {
        this.f30902a = z11;
        this.f30903b = z12;
        this.f30904c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f30902a == aVar.f30902a && this.f30903b == aVar.f30903b && this.f30904c == aVar.f30904c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30904c) + r8.k.e(Boolean.hashCode(this.f30902a) * 31, 31, this.f30903b);
    }

    public final String toString() {
        return j4.s.o(b3.i.p("Load(isFromAppStart=", this.f30902a, ", isLoggedIn=", this.f30903b, ", isFromDeepLink="), this.f30904c, ")");
    }
}
