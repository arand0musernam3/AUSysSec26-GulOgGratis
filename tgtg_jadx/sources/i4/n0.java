package i4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends g0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h4.c f23271f;

    public n0(h4.c cVar) {
        this.f23271f = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n0) {
            return Intrinsics.areEqual(this.f23271f, ((n0) obj).f23271f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23271f.hashCode();
    }

    @Override // i4.g0
    public final h4.c o() {
        return this.f23271f;
    }
}
