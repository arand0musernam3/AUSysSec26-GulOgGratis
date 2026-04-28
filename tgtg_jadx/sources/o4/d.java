package o4;

import i4.n;
import i4.v;
import kotlin.jvm.internal.Intrinsics;
import n80.p;
import r8.k;
import u70.b0;
import u70.c0;
import z5.f;
import z5.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f31965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f31966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f31967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f31969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f31970f;

    public d(float f11, float f12, long j9, long j11, float f13, int i11) {
        this.f31965a = f11;
        this.f31966b = f12;
        this.f31967c = j9;
        this.f31968d = i11;
        this.f31969e = j11;
        this.f31970f = p.b(f13, 0.0f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return f.c(this.f31965a, dVar.f31965a) && f.c(this.f31966b, dVar.f31966b) && this.f31967c == dVar.f31967c && this.f31970f == dVar.f31970f && this.f31968d == dVar.f31968d && v.c(this.f31969e, dVar.f31969e) && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        int iB = k.b(this.f31968d, k.a(e0.f.b(k.a(Float.hashCode(this.f31965a) * 31, this.f31966b, 31), 31, this.f31967c), this.f31970f, 31), 31);
        int i11 = v.f23316i;
        b0 b0Var = c0.f40833b;
        return e0.f.b(iB, 31, this.f31969e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Shadow(radius=");
        k.u(this.f31965a, ", spread=", sb2);
        k.u(this.f31966b, ", offset=", sb2);
        sb2.append((Object) g.a(this.f31967c));
        sb2.append(", alpha=");
        sb2.append(this.f31970f);
        sb2.append(", blendMode=");
        sb2.append((Object) n.a(this.f31968d));
        sb2.append(", color=");
        sb2.append((Object) v.i(this.f31969e));
        sb2.append(", brush=null)");
        return sb2.toString();
    }

    public d(float f11, long j9, float f12, long j11) {
        this(f11, f12, j11, j9 == 16 ? v.f23309b : j9, 1.0f, 3);
    }
}
