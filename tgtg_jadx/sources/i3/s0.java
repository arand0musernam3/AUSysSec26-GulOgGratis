package i3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4.g f23182a;

    public s0(b4.g gVar) {
        this.f23182a = gVar;
    }

    @Override // i3.b0
    public final int a(z5.k kVar, long j9, int i11, z5.m mVar) {
        int i12 = (int) (j9 >> 32);
        if (i11 < i12) {
            return n80.p.c(this.f23182a.a(i11, i12, mVar), 0, i12 - i11);
        }
        return e0.f.a(1, mVar != z5.m.Ltr ? 0.0f * (-1) : 0.0f, (i12 - i11) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && Intrinsics.areEqual(this.f23182a, ((s0) obj).f23182a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.f23182a.f5698a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.f23182a + ", margin=0)";
    }
}
