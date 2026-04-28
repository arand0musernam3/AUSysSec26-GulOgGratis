package q9;

import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f36361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f36362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f36363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f36364e;

    public b(float f11, float f12, float f13, int i11, long j9) {
        this.f36360a = i11;
        this.f36361b = f11;
        this.f36362c = f12;
        this.f36363d = f13;
        this.f36364e = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            return this.f36362c == bVar.f36362c && this.f36363d == bVar.f36363d && this.f36361b == bVar.f36361b && this.f36360a == bVar.f36360a && this.f36364e == bVar.f36364e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f36364e) + r8.k.b(this.f36360a, r8.k.a(r8.k.a(Float.hashCode(this.f36362c) * 31, this.f36363d, 31), this.f36361b, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavigationEvent(touchX=");
        sb2.append(this.f36362c);
        sb2.append(", touchY=");
        sb2.append(this.f36363d);
        sb2.append(", progress=");
        sb2.append(this.f36361b);
        sb2.append(", swipeEdge=");
        sb2.append(this.f36360a);
        sb2.append(", frameTimeMillis=");
        return a0.r(sb2, this.f36364e, ')');
    }
}
