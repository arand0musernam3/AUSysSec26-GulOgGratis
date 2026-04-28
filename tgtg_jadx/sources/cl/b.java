package cl;

import al.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f8443a;

    public b(h hVar) {
        hVar.getClass();
        this.f8443a = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f8443a == ((b) obj).f8443a;
    }

    public final int hashCode() {
        return this.f8443a.hashCode();
    }

    public final String toString() {
        return "Continue(provider=" + this.f8443a + ")";
    }
}
