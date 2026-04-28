package d40;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14166b;

    public g0(List list, String str) {
        this.f14165a = list;
        this.f14166b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        g0 g0Var = (g0) ((s1) obj);
        if (!this.f14165a.equals(g0Var.f14165a)) {
            return false;
        }
        String str = g0Var.f14166b;
        String str2 = this.f14166b;
        return str2 == null ? str == null : str2.equals(str);
    }

    public final int hashCode() {
        int iHashCode = (this.f14165a.hashCode() ^ 1000003) * 1000003;
        String str = this.f14166b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f14165a);
        sb2.append(", orgId=");
        return r8.k.p(sb2, this.f14166b, "}");
    }
}
