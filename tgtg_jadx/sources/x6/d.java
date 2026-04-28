package x6;

import android.graphics.Insets;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f43872e = new d(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43876d;

    public d(int i11, int i12, int i13, int i14) {
        this.f43873a = i11;
        this.f43874b = i12;
        this.f43875c = i13;
        this.f43876d = i14;
    }

    public static d a(d dVar, d dVar2) {
        return b(Math.max(dVar.f43873a, dVar2.f43873a), Math.max(dVar.f43874b, dVar2.f43874b), Math.max(dVar.f43875c, dVar2.f43875c), Math.max(dVar.f43876d, dVar2.f43876d));
    }

    public static d b(int i11, int i12, int i13, int i14) {
        return (i11 == 0 && i12 == 0 && i13 == 0 && i14 == 0) ? f43872e : new d(i11, i12, i13, i14);
    }

    public static d c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return b6.a.s(this.f43873a, this.f43874b, this.f43875c, this.f43876d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f43876d == dVar.f43876d && this.f43873a == dVar.f43873a && this.f43875c == dVar.f43875c && this.f43874b == dVar.f43874b;
    }

    public final int hashCode() {
        return (((((this.f43873a * 31) + this.f43874b) * 31) + this.f43875c) * 31) + this.f43876d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f43873a);
        sb2.append(", top=");
        sb2.append(this.f43874b);
        sb2.append(", right=");
        sb2.append(this.f43875c);
        sb2.append(", bottom=");
        return k.o(sb2, this.f43876d, '}');
    }
}
