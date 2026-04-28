package ty;

import c50.w;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40612a;

    public c(String str) {
        if (str != null) {
            this.f40612a = str;
        } else {
            w.l("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f40612a.equals(((c) obj).f40612a);
    }

    public final int hashCode() {
        return this.f40612a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return k.p(new StringBuilder("Encoding{name=\""), this.f40612a, "\"}");
    }
}
