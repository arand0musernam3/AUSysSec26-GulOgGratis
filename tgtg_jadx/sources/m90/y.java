package m90;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends e1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k90.i f29885m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u70.t f29886n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(String str, int i11) {
        super(str, null, i11);
        str.getClass();
        this.f29885m = k90.i.f26239j;
        this.f29886n = u70.l.b(new cp.j(i11, str, this));
    }

    @Override // m90.e1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        return serialDescriptor.getKind() == k90.i.f26239j && Intrinsics.areEqual(this.f29779a, serialDescriptor.a()) && Intrinsics.areEqual(c1.b(this), c1.b(serialDescriptor));
    }

    @Override // m90.e1, kotlinx.serialization.descriptors.SerialDescriptor
    public final p30.b getKind() {
        return this.f29885m;
    }

    @Override // m90.e1, kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i11) {
        return ((SerialDescriptor[]) this.f29886n.getValue())[i11];
    }

    @Override // m90.e1
    public final int hashCode() {
        int iHashCode = this.f29779a.hashCode();
        k90.f fVar = new k90.f(this);
        int iHashCode2 = 1;
        while (fVar.hasNext()) {
            int i11 = iHashCode2 * 31;
            String str = (String) fVar.next();
            iHashCode2 = i11 + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // m90.e1
    public final String toString() {
        return CollectionsKt.U(new k90.g(this, 0), ", ", w2.l1.f(new StringBuilder(), this.f29779a, '('), ")", null, 56);
    }
}
