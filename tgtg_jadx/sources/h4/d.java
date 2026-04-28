package h4;

import e0.f;
import lx.u;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f21384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f21385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f21386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f21387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f21388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f21389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f21390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f21391h;

    static {
        nx.d.k(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public d(float f11, float f12, float f13, float f14, long j9, long j11, long j12, long j13) {
        this.f21384a = f11;
        this.f21385b = f12;
        this.f21386c = f13;
        this.f21387d = f14;
        this.f21388e = j9;
        this.f21389f = j11;
        this.f21390g = j12;
        this.f21391h = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f21384a, dVar.f21384a) == 0 && Float.compare(this.f21385b, dVar.f21385b) == 0 && Float.compare(this.f21386c, dVar.f21386c) == 0 && Float.compare(this.f21387d, dVar.f21387d) == 0 && u.C(this.f21388e, dVar.f21388e) && u.C(this.f21389f, dVar.f21389f) && u.C(this.f21390g, dVar.f21390g) && u.C(this.f21391h, dVar.f21391h);
    }

    public final int hashCode() {
        return Long.hashCode(this.f21391h) + f.b(f.b(f.b(k.a(k.a(k.a(Float.hashCode(this.f21384a) * 31, this.f21385b, 31), this.f21386c, 31), this.f21387d, 31), 31, this.f21388e), 31, this.f21389f), 31, this.f21390g);
    }

    public final String toString() {
        String str = m0.c.q0(this.f21384a) + ", " + m0.c.q0(this.f21385b) + ", " + m0.c.q0(this.f21386c) + ", " + m0.c.q0(this.f21387d);
        long j9 = this.f21388e;
        long j11 = this.f21389f;
        boolean zC = u.C(j9, j11);
        long j12 = this.f21390g;
        long j13 = this.f21391h;
        if (!zC || !u.C(j11, j12) || !u.C(j12, j13)) {
            StringBuilder sbS = f.s("RoundRect(rect=", str, ", topLeft=");
            sbS.append((Object) u.R(j9));
            sbS.append(", topRight=");
            sbS.append((Object) u.R(j11));
            sbS.append(", bottomRight=");
            sbS.append((Object) u.R(j12));
            sbS.append(", bottomLeft=");
            sbS.append((Object) u.R(j13));
            sbS.append(')');
            return sbS.toString();
        }
        int i11 = (int) (j9 >> 32);
        int i12 = (int) (j9 & 4294967295L);
        if (Float.intBitsToFloat(i11) == Float.intBitsToFloat(i12)) {
            StringBuilder sbS2 = f.s("RoundRect(rect=", str, ", radius=");
            sbS2.append(m0.c.q0(Float.intBitsToFloat(i11)));
            sbS2.append(')');
            return sbS2.toString();
        }
        StringBuilder sbS3 = f.s("RoundRect(rect=", str, ", x=");
        sbS3.append(m0.c.q0(Float.intBitsToFloat(i11)));
        sbS3.append(", y=");
        sbS3.append(m0.c.q0(Float.intBitsToFloat(i12)));
        sbS3.append(')');
        return sbS3.toString();
    }
}
