package d40;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f14378c;

    public v0(String str, List list, int i11) {
        this.f14376a = str;
        this.f14377b = i11;
        this.f14378c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a2) {
            v0 v0Var = (v0) ((a2) obj);
            if (this.f14376a.equals(v0Var.f14376a) && this.f14377b == v0Var.f14377b && this.f14378c.equals(v0Var.f14378c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f14376a.hashCode() ^ 1000003) * 1000003) ^ this.f14377b) * 1000003) ^ this.f14378c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Thread{name=");
        sb2.append(this.f14376a);
        sb2.append(", importance=");
        sb2.append(this.f14377b);
        sb2.append(", frames=");
        return e0.f.p(sb2, this.f14378c, "}");
    }
}
