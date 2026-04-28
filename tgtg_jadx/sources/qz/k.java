package qz;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f37363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37364b;

    public k(Object obj, String str) {
        this.f37363a = obj;
        this.f37364b = str;
    }

    public final String a() {
        int iIdentityHashCode = System.identityHashCode(this.f37363a);
        String str = this.f37364b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(iIdentityHashCode).length());
        sb2.append(str);
        sb2.append("@");
        sb2.append(iIdentityHashCode);
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f37363a == kVar.f37363a && this.f37364b.equals(kVar.f37364b);
    }

    public final int hashCode() {
        return this.f37364b.hashCode() + (System.identityHashCode(this.f37363a) * 31);
    }
}
