package j4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24534c;

    public c(int i11, long j9, String str) {
        this.f24532a = str;
        this.f24533b = j9;
        this.f24534c = i11;
        if (str.length() == 0) {
            i4.a.f("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (i11 < -1 || i11 > 63) {
            i4.a.f("The id must be between -1 and 63");
            throw null;
        }
    }

    public abstract float a(int i11);

    public abstract float b(int i11);

    public boolean c() {
        return false;
    }

    public abstract long d(float f11, float f12, float f13);

    public abstract float e(float f11, float f12, float f13);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f24534c == cVar.f24534c && Intrinsics.areEqual(this.f24532a, cVar.f24532a)) {
            return b.a(this.f24533b, cVar.f24533b);
        }
        return false;
    }

    public abstract long f(float f11, float f12, float f13, float f14, c cVar);

    public int hashCode() {
        int iHashCode = this.f24532a.hashCode() * 31;
        int i11 = b.f24531e;
        return e0.f.b(iHashCode, 31, this.f24533b) + this.f24534c;
    }

    public final String toString() {
        return this.f24532a + " (id=" + this.f24534c + ", model=" + ((Object) b.b(this.f24533b)) + ')';
    }
}
