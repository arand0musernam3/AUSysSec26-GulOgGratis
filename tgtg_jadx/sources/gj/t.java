package gj;

import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f20512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f20513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f20516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Pair f20517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f20518g;

    public t(Set set, Set set2, String str, boolean z11, boolean z12, Pair pair, a aVar) {
        set.getClass();
        set2.getClass();
        this.f20512a = set;
        this.f20513b = set2;
        this.f20514c = str;
        this.f20515d = z11;
        this.f20516e = z12;
        this.f20517f = pair;
        this.f20518g = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.areEqual(this.f20512a, tVar.f20512a) && Intrinsics.areEqual(this.f20513b, tVar.f20513b) && Intrinsics.areEqual(this.f20514c, tVar.f20514c) && this.f20515d == tVar.f20515d && this.f20516e == tVar.f20516e && Intrinsics.areEqual(this.f20517f, tVar.f20517f) && this.f20518g == tVar.f20518g;
    }

    public final int hashCode() {
        int iE = r8.k.e(r8.k.e(l1.b((this.f20513b.hashCode() + (this.f20512a.hashCode() * 31)) * 31, 31, this.f20514c), 31, this.f20515d), 31, this.f20516e);
        Pair pair = this.f20517f;
        int iHashCode = (iE + (pair == null ? 0 : pair.hashCode())) * 31;
        a aVar = this.f20518g;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MapReloadFilterSnapshot(categoryIds=");
        sb2.append(this.f20512a);
        sb2.append(", dietIds=");
        sb2.append(this.f20513b);
        sb2.append(", effectiveSortOption=");
        r8.k.z(sb2, this.f20514c, ", showSoldOutFilter=", this.f20515d, ", collectNowSelected=");
        sb2.append(this.f20516e);
        sb2.append(", collectionHours=");
        sb2.append(this.f20517f);
        sb2.append(", collectionDay=");
        sb2.append(this.f20518g);
        sb2.append(")");
        return sb2.toString();
    }
}
