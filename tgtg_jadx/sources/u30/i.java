package u30;

import j4.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f40692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40694c;

    public i(o oVar, int i11, int i12) {
        android.support.v4.media.session.a.k(oVar, "Null dependency anInterface.");
        this.f40692a = oVar;
        this.f40693b = i11;
        this.f40694c = i12;
    }

    public static i a(Class cls) {
        return new i(1, 0, cls);
    }

    public static i b(o oVar) {
        return new i(oVar, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f40692a.equals(iVar.f40692a) && this.f40693b == iVar.f40693b && this.f40694c == iVar.f40694c;
    }

    public final int hashCode() {
        return ((((this.f40692a.hashCode() ^ 1000003) * 1000003) ^ this.f40693b) * 1000003) ^ this.f40694c;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f40692a);
        sb2.append(", type=");
        int i11 = this.f40693b;
        sb2.append(i11 == 1 ? "required" : i11 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        int i12 = this.f40694c;
        if (i12 == 0) {
            str = "direct";
        } else if (i12 == 1) {
            str = "provider";
        } else {
            if (i12 != 2) {
                i4.a.d(s.f(i12, "Unsupported injection: "));
                return null;
            }
            str = "deferred";
        }
        return r8.k.p(sb2, str, "}");
    }

    public i(int i11, int i12, Class cls) {
        this(o.a(cls), i11, i12);
    }
}
