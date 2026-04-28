package u90;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f40976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f40977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f40978c;

    public /* synthetic */ s(t tVar, c cVar, Throwable th2, int i11) {
        this(tVar, (i11 & 2) != 0 ? null : cVar, (i11 & 4) != 0 ? null : th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.areEqual(this.f40976a, sVar.f40976a) && Intrinsics.areEqual(this.f40977b, sVar.f40977b) && Intrinsics.areEqual(this.f40978c, sVar.f40978c);
    }

    public final int hashCode() {
        int iHashCode = this.f40976a.hashCode() * 31;
        t tVar = this.f40977b;
        int iHashCode2 = (iHashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        Throwable th2 = this.f40978c;
        return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.f40976a + ", nextPlan=" + this.f40977b + ", throwable=" + this.f40978c + ')';
    }

    public s(t tVar, t tVar2, Throwable th2) {
        this.f40976a = tVar;
        this.f40977b = tVar2;
        this.f40978c = th2;
    }
}
