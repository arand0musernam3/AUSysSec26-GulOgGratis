package x5;

import i4.t0;
import i4.v;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f43836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f43837b;

    public b(t0 t0Var, float f11) {
        this.f43836a = t0Var;
        this.f43837b = f11;
    }

    @Override // x5.o
    public final float a() {
        return this.f43837b;
    }

    @Override // x5.o
    public final long b() {
        int i11 = v.f23316i;
        return v.f23315h;
    }

    @Override // x5.o
    public final i4.r c() {
        return this.f43836a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f43836a, bVar.f43836a) && Float.compare(this.f43837b, bVar.f43837b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f43837b) + (this.f43836a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrushStyle(value=");
        sb2.append(this.f43836a);
        sb2.append(", alpha=");
        return r8.k.n(sb2, this.f43837b, ')');
    }
}
