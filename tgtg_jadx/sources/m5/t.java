package m5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f29641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f29645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f29646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f29647g;

    public t(b bVar, int i11, int i12, int i13, int i14, float f11, float f12) {
        this.f29641a = bVar;
        this.f29642b = i11;
        this.f29643c = i12;
        this.f29644d = i13;
        this.f29645e = i14;
        this.f29646f = f11;
        this.f29647g = f12;
    }

    public final h4.c a(h4.c cVar) {
        return cVar.k((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(this.f29646f)) & 4294967295L));
    }

    public final long b(long j9, boolean z11) {
        if (z11) {
            long j11 = t0.f29648b;
            if (t0.c(j9, j11)) {
                return j11;
            }
        }
        int i11 = t0.f29649c;
        int i12 = (int) (j9 >> 32);
        int i13 = this.f29642b;
        return k0.b(i12 + i13, ((int) (j9 & 4294967295L)) + i13);
    }

    public final h4.c c(h4.c cVar) {
        float f11 = -this.f29646f;
        return cVar.k((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L));
    }

    public final int d(int i11) {
        int i12 = this.f29643c;
        int i13 = this.f29642b;
        return n80.p.c(i11, i13, i12) - i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.areEqual(this.f29641a, tVar.f29641a) && this.f29642b == tVar.f29642b && this.f29643c == tVar.f29643c && this.f29644d == tVar.f29644d && this.f29645e == tVar.f29645e && Float.compare(this.f29646f, tVar.f29646f) == 0 && Float.compare(this.f29647g, tVar.f29647g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f29647g) + r8.k.a(r8.k.b(this.f29645e, r8.k.b(this.f29644d, r8.k.b(this.f29643c, r8.k.b(this.f29642b, this.f29641a.hashCode() * 31, 31), 31), 31), 31), this.f29646f, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphInfo(paragraph=");
        sb2.append(this.f29641a);
        sb2.append(", startIndex=");
        sb2.append(this.f29642b);
        sb2.append(", endIndex=");
        sb2.append(this.f29643c);
        sb2.append(", startLineIndex=");
        sb2.append(this.f29644d);
        sb2.append(", endLineIndex=");
        sb2.append(this.f29645e);
        sb2.append(", top=");
        sb2.append(this.f29646f);
        sb2.append(", bottom=");
        return r8.k.n(sb2, this.f29647g, ')');
    }
}
