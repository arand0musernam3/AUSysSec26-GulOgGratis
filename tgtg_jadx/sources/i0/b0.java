package i0;

import e0.j0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0.a f22592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0.b f22593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0.d f22594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j0 f22595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f22596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f22597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f22598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f22599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Boolean f22600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f22601j;

    public b0(e0.a aVar, e0.b bVar, e0.d dVar, j0 j0Var, List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3) {
        this.f22592a = aVar;
        this.f22593b = bVar;
        this.f22594c = dVar;
        this.f22595d = j0Var;
        this.f22596e = list;
        this.f22597f = list2;
        this.f22598g = list3;
        this.f22599h = bool;
        this.f22600i = bool2;
        this.f22601j = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.areEqual(this.f22592a, b0Var.f22592a) && Intrinsics.areEqual(this.f22593b, b0Var.f22593b) && Intrinsics.areEqual(this.f22594c, b0Var.f22594c) && Intrinsics.areEqual(this.f22595d, b0Var.f22595d) && Intrinsics.areEqual(this.f22596e, b0Var.f22596e) && Intrinsics.areEqual(this.f22597f, b0Var.f22597f) && Intrinsics.areEqual(this.f22598g, b0Var.f22598g) && Intrinsics.areEqual(this.f22599h, b0Var.f22599h) && Intrinsics.areEqual(this.f22600i, b0Var.f22600i) && Intrinsics.areEqual(this.f22601j, b0Var.f22601j);
    }

    public final int hashCode() {
        e0.a aVar = this.f22592a;
        int iHashCode = (aVar == null ? 0 : Integer.hashCode(aVar.f15306a)) * 31;
        e0.b bVar = this.f22593b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : Integer.hashCode(bVar.f15309a))) * 31;
        e0.d dVar = this.f22594c;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : Integer.hashCode(dVar.f15326a))) * 31;
        j0 j0Var = this.f22595d;
        int iHashCode4 = (iHashCode3 + (j0Var == null ? 0 : Integer.hashCode(j0Var.f15362a))) * 31;
        List list = this.f22596e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f22597f;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f22598g;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool = this.f22599h;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f22600i;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f22601j;
        return iHashCode9 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        return "State3A(aeMode=" + this.f22592a + ", afMode=" + this.f22593b + ", awbMode=" + this.f22594c + ", flashMode=" + this.f22595d + ", aeRegions=" + this.f22596e + ", afRegions=" + this.f22597f + ", awbRegions=" + this.f22598g + ", aeLock=" + this.f22599h + ", afLock=" + this.f22600i + ", awbLock=" + this.f22601j + ')';
    }
}
