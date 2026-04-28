package r0;

import c50.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1.b f37440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37441b;

    public b(c1.b bVar, int i11) {
        if (bVar == null) {
            w.l("Null packet");
            throw null;
        }
        this.f37440a = bVar;
        this.f37441b = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f37440a.equals(bVar.f37440a) && this.f37441b == bVar.f37441b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f37440a.hashCode() ^ 1000003) * 1000003) ^ this.f37441b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("In{packet=");
        sb2.append(this.f37440a);
        sb2.append(", jpegQuality=");
        return r8.k.i(this.f37441b, "}", sb2);
    }
}
