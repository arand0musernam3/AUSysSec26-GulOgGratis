package td;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fd.l f40040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f40041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final id.h f40042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final od.a f40043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f40044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f40045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f40046g;

    public q(fd.l lVar, i iVar, id.h hVar, od.a aVar, String str, boolean z11, boolean z12) {
        this.f40040a = lVar;
        this.f40041b = iVar;
        this.f40042c = hVar;
        this.f40043d = aVar;
        this.f40044e = str;
        this.f40045f = z11;
        this.f40046g = z12;
    }

    @Override // td.l
    public final i e() {
        return this.f40041b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.areEqual(this.f40040a, qVar.f40040a) && Intrinsics.areEqual(this.f40041b, qVar.f40041b) && this.f40042c == qVar.f40042c && Intrinsics.areEqual(this.f40043d, qVar.f40043d) && Intrinsics.areEqual(this.f40044e, qVar.f40044e) && this.f40045f == qVar.f40045f && this.f40046g == qVar.f40046g;
    }

    public final int hashCode() {
        int iHashCode = (this.f40042c.hashCode() + ((this.f40041b.hashCode() + (this.f40040a.hashCode() * 31)) * 31)) * 31;
        od.a aVar = this.f40043d;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f40044e;
        return Boolean.hashCode(this.f40046g) + r8.k.e((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f40045f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuccessResult(image=");
        sb2.append(this.f40040a);
        sb2.append(", request=");
        sb2.append(this.f40041b);
        sb2.append(", dataSource=");
        sb2.append(this.f40042c);
        sb2.append(", memoryCacheKey=");
        sb2.append(this.f40043d);
        sb2.append(", diskCacheKey=");
        r8.k.z(sb2, this.f40044e, ", isSampled=", this.f40045f, ", isPlaceholderCached=");
        return j4.s.o(sb2, this.f40046g, ")");
    }
}
