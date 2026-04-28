package kd;

import id.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f26292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final id.h f26294c;

    public k(r rVar, String str, id.h hVar) {
        this.f26292a = rVar;
        this.f26293b = str;
        this.f26294c = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.areEqual(this.f26292a, kVar.f26292a) && Intrinsics.areEqual(this.f26293b, kVar.f26293b) && this.f26294c == kVar.f26294c;
    }

    public final int hashCode() {
        int iHashCode = this.f26292a.hashCode() * 31;
        String str = this.f26293b;
        return this.f26294c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.f26292a + ", mimeType=" + this.f26293b + ", dataSource=" + this.f26294c + ")";
    }
}
