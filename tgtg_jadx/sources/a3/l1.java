package a3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2.t0 f443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f446d;

    public l1(m2.t0 t0Var, long j9, k1 k1Var, boolean z11) {
        this.f443a = t0Var;
        this.f444b = j9;
        this.f445c = k1Var;
        this.f446d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return this.f443a == l1Var.f443a && h4.b.b(this.f444b, l1Var.f444b) && this.f445c == l1Var.f445c && this.f446d == l1Var.f446d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f446d) + ((this.f445c.hashCode() + e0.f.b(this.f443a.hashCode() * 31, 31, this.f444b)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionHandleInfo(handle=");
        sb2.append(this.f443a);
        sb2.append(", position=");
        sb2.append((Object) h4.b.h(this.f444b));
        sb2.append(", anchor=");
        sb2.append(this.f445c);
        sb2.append(", visible=");
        return r8.k.q(sb2, this.f446d, ')');
    }
}
