package id;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fd.l f23792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23793b;

    public i(fd.l lVar, boolean z11) {
        this.f23792a = lVar;
        this.f23793b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f23792a, iVar.f23792a) && this.f23793b == iVar.f23793b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23793b) + (this.f23792a.hashCode() * 31);
    }

    public final String toString() {
        return "DecodeResult(image=" + this.f23792a + ", isSampled=" + this.f23793b + ")";
    }
}
