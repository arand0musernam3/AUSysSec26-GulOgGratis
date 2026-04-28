package i3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4.i f23105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b4.i f23106b;

    public d(b4.i iVar, b4.i iVar2) {
        this.f23105a = iVar;
        this.f23106b = iVar2;
    }

    @Override // i3.b0
    public final int a(z5.k kVar, long j9, int i11, z5.m mVar) {
        int iA = this.f23106b.a(0, kVar.d(), mVar);
        int i12 = -this.f23105a.a(0, i11, mVar);
        z5.m mVar2 = z5.m.Ltr;
        return kVar.f47282a + iA + i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f23105a, dVar.f23105a) && Intrinsics.areEqual(this.f23106b, dVar.f23106b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + r8.k.a(Float.hashCode(this.f23105a.f5700a) * 31, this.f23106b.f5700a, 31);
    }

    public final String toString() {
        return "Horizontal(menuAlignment=" + this.f23105a + ", anchorAlignment=" + this.f23106b + ", offset=0)";
    }
}
