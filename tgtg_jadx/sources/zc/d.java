package zc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ad.i f47433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dd.d f47434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f47435c;

    public d(ad.i iVar, dd.d dVar, Boolean bool) {
        this.f47433a = iVar;
        this.f47434b = dVar;
        this.f47435c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f47433a, dVar.f47433a) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f47434b, dVar.f47434b) && Intrinsics.areEqual(this.f47435c, dVar.f47435c) && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        ad.i iVar = this.f47433a;
        int iHashCode = (iVar != null ? iVar.hashCode() : 0) * 887503681;
        dd.d dVar = this.f47434b;
        int iHashCode2 = (iHashCode + (dVar != null ? dVar.hashCode() : 0)) * 29791;
        Boolean bool = this.f47435c;
        return (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 923521;
    }
}
