package i3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4.j f23186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23187b;

    public t0(b4.j jVar, int i11) {
        this.f23186a = jVar;
        this.f23187b = i11;
    }

    @Override // i3.c0
    public final int a(z5.k kVar, long j9, int i11) {
        int i12 = (int) (j9 & 4294967295L);
        int i13 = this.f23187b;
        if (i11 < i12 - (i13 * 2)) {
            return n80.p.c(this.f23186a.a(i11, i12), i13, (i12 - i13) - i11);
        }
        return e0.f.a(1, 0.0f, (i12 - i11) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Intrinsics.areEqual(this.f23186a, t0Var.f23186a) && this.f23187b == t0Var.f23187b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23187b) + (Float.hashCode(this.f23186a.f5701a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Vertical(alignment=");
        sb2.append(this.f23186a);
        sb2.append(", margin=");
        return r8.k.o(sb2, this.f23187b, ')');
    }
}
