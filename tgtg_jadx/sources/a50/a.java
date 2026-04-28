package a50;

import c50.w;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f817b;

    public a(String str, String str2) {
        this.f816a = str;
        if (str2 != null) {
            this.f817b = str2;
        } else {
            w.l("Null version");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f816a.equals(aVar.f816a) && this.f817b.equals(aVar.f817b);
    }

    public final int hashCode() {
        return ((this.f816a.hashCode() ^ 1000003) * 1000003) ^ this.f817b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f816a);
        sb2.append(", version=");
        return k.p(sb2, this.f817b, "}");
    }
}
