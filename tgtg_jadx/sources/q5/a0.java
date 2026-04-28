package q5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f35992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f35993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f35994d;

    public a0(int i11, r rVar, int i12, q qVar) {
        this.f35991a = i11;
        this.f35992b = rVar;
        this.f35993c = i12;
        this.f35994d = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f35991a == a0Var.f35991a && Intrinsics.areEqual(this.f35992b, a0Var.f35992b) && this.f35993c == a0Var.f35993c && Intrinsics.areEqual(this.f35994d, a0Var.f35994d);
    }

    public final int hashCode() {
        return this.f35994d.f36036a.hashCode() + r8.k.b(0, r8.k.b(this.f35993c, ((this.f35991a * 31) + this.f35992b.f36049a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResourceFont(resId=");
        sb2.append(this.f35991a);
        sb2.append(", weight=");
        sb2.append(this.f35992b);
        sb2.append(", style=");
        int i11 = this.f35993c;
        sb2.append((Object) (i11 == 0 ? "Normal" : i11 == 1 ? "Italic" : "Invalid"));
        sb2.append(", loadingStrategy=Blocking)");
        return sb2.toString();
    }
}
