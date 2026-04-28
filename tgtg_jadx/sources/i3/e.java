package i3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4.j f23108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b4.j f23109b;

    public e(b4.j jVar, b4.j jVar2) {
        this.f23108a = jVar;
        this.f23109b = jVar2;
    }

    @Override // i3.c0
    public final int a(z5.k kVar, long j9, int i11) {
        int iA = this.f23109b.a(0, kVar.b());
        return kVar.f47283b + iA + (-this.f23108a.a(0, i11));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f23108a, eVar.f23108a) && Intrinsics.areEqual(this.f23109b, eVar.f23109b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + r8.k.a(Float.hashCode(this.f23108a.f5701a) * 31, this.f23109b.f5701a, 31);
    }

    public final String toString() {
        return "Vertical(menuAlignment=" + this.f23108a + ", anchorAlignment=" + this.f23109b + ", offset=0)";
    }
}
