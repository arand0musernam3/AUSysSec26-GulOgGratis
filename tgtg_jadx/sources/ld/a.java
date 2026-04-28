package ld;

import fd.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f27590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f27591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final id.h f27592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f27593d;

    public a(l lVar, boolean z11, id.h hVar, String str) {
        this.f27590a = lVar;
        this.f27591b = z11;
        this.f27592c = hVar;
        this.f27593d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f27590a, aVar.f27590a) && this.f27591b == aVar.f27591b && this.f27592c == aVar.f27592c && Intrinsics.areEqual(this.f27593d, aVar.f27593d);
    }

    public final int hashCode() {
        int iHashCode = (this.f27592c.hashCode() + r8.k.e(this.f27590a.hashCode() * 31, 31, this.f27591b)) * 31;
        String str = this.f27593d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ExecuteResult(image=" + this.f27590a + ", isSampled=" + this.f27591b + ", dataSource=" + this.f27592c + ", diskCacheKey=" + this.f27593d + ")";
    }
}
