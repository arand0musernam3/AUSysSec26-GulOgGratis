package pp;

import m90.c1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35597b;

    public /* synthetic */ f(int i11, int i12, int i13) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, d.f35595a.getDescriptor());
            throw null;
        }
        this.f35596a = i12;
        this.f35597b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f35596a == fVar.f35596a && this.f35597b == fVar.f35597b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35597b) + (Integer.hashCode(this.f35596a) * 31);
    }

    public final String toString() {
        return r8.k.g(this.f35596a, this.f35597b, "Paging(page=", ", size=", ")");
    }

    public f(int i11) {
        this.f35596a = i11;
        this.f35597b = 50;
    }
}
