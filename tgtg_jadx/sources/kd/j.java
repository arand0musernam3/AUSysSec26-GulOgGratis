package kd;

import fd.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f26289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f26290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final id.h f26291c;

    public j(l lVar, boolean z11, id.h hVar) {
        this.f26289a = lVar;
        this.f26290b = z11;
        this.f26291c = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f26289a, jVar.f26289a) && this.f26290b == jVar.f26290b && this.f26291c == jVar.f26291c;
    }

    public final int hashCode() {
        return this.f26291c.hashCode() + r8.k.e(this.f26289a.hashCode() * 31, 31, this.f26290b);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.f26289a + ", isSampled=" + this.f26290b + ", dataSource=" + this.f26291c + ")";
    }
}
