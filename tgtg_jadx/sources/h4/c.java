package h4;

import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f21379e = new c(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f21380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f21381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f21382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f21383d;

    public c(float f11, float f12, float f13, float f14) {
        this.f21380a = f11;
        this.f21381b = f12;
        this.f21382c = f13;
        this.f21383d = f14;
    }

    public static c b(c cVar, float f11, float f12, float f13, int i11) {
        if ((i11 & 1) != 0) {
            f11 = cVar.f21380a;
        }
        float f14 = cVar.f21381b;
        if ((i11 & 4) != 0) {
            f12 = cVar.f21382c;
        }
        if ((i11 & 8) != 0) {
            f13 = cVar.f21383d;
        }
        return new c(f11, f14, f12, f13);
    }

    public final boolean a(long j9) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
        return (fIntBitsToFloat >= this.f21380a) & (fIntBitsToFloat < this.f21382c) & (fIntBitsToFloat2 >= this.f21381b) & (fIntBitsToFloat2 < this.f21383d);
    }

    public final long c() {
        float f11 = this.f21382c;
        float f12 = this.f21380a;
        return (((long) Float.floatToRawIntBits(((f11 - f12) / 2.0f) + f12)) << 32) | (((long) Float.floatToRawIntBits(this.f21383d)) & 4294967295L);
    }

    public final long d() {
        float f11 = this.f21382c;
        float f12 = this.f21380a;
        float f13 = ((f11 - f12) / 2.0f) + f12;
        float f14 = this.f21383d;
        float f15 = this.f21381b;
        return (((long) Float.floatToRawIntBits(((f14 - f15) / 2.0f) + f15)) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    public final long e() {
        float f11 = this.f21382c - this.f21380a;
        return (((long) Float.floatToRawIntBits(this.f21383d - this.f21381b)) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f21380a, cVar.f21380a) == 0 && Float.compare(this.f21381b, cVar.f21381b) == 0 && Float.compare(this.f21382c, cVar.f21382c) == 0 && Float.compare(this.f21383d, cVar.f21383d) == 0;
    }

    public final long f() {
        return (((long) Float.floatToRawIntBits(this.f21380a)) << 32) | (((long) Float.floatToRawIntBits(this.f21381b)) & 4294967295L);
    }

    public final c g(c cVar) {
        return new c(Math.max(this.f21380a, cVar.f21380a), Math.max(this.f21381b, cVar.f21381b), Math.min(this.f21382c, cVar.f21382c), Math.min(this.f21383d, cVar.f21383d));
    }

    public final boolean h() {
        return (this.f21380a >= this.f21382c) | (this.f21381b >= this.f21383d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f21383d) + k.a(k.a(Float.hashCode(this.f21380a) * 31, this.f21381b, 31), this.f21382c, 31);
    }

    public final boolean i(c cVar) {
        return (this.f21380a < cVar.f21382c) & (cVar.f21380a < this.f21382c) & (this.f21381b < cVar.f21383d) & (cVar.f21381b < this.f21383d);
    }

    public final c j(float f11, float f12) {
        return new c(this.f21380a + f11, this.f21381b + f12, this.f21382c + f11, this.f21383d + f12);
    }

    public final c k(long j9) {
        int i11 = (int) (j9 >> 32);
        int i12 = (int) (j9 & 4294967295L);
        return new c(Float.intBitsToFloat(i11) + this.f21380a, Float.intBitsToFloat(i12) + this.f21381b, Float.intBitsToFloat(i11) + this.f21382c, Float.intBitsToFloat(i12) + this.f21383d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + m0.c.q0(this.f21380a) + ", " + m0.c.q0(this.f21381b) + ", " + m0.c.q0(this.f21382c) + ", " + m0.c.q0(this.f21383d) + ')';
    }
}
