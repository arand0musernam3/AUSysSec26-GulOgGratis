package l2;

import c5.l2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b, l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f26787a;

    public c(float f11) {
        this.f26787a = f11;
    }

    @Override // l2.b
    public final float a(long j9, z5.c cVar) {
        return cVar.c0(this.f26787a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && z5.f.c(this.f26787a, ((c) obj).f26787a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f26787a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f26787a + ".dp)";
    }
}
