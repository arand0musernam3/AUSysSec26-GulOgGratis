package z5;

import b0.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface c {
    default long I(float f11) {
        return l(R(f11));
    }

    default float O(int i11) {
        return i11 / a();
    }

    default float R(float f11) {
        return f11 / a();
    }

    float X();

    float a();

    default float c0(float f11) {
        return a() * f11;
    }

    default int j0(long j9) {
        return Math.round(z0(j9));
    }

    default long l(float f11) {
        float[] fArr = a6.b.f826a;
        if (X() < 1.03f) {
            return a0.F(f11 / X(), 4294967296L);
        }
        a6.a aVarA = a6.b.a(X());
        return a0.F(aVarA != null ? aVarA.a(f11) : f11 / X(), 4294967296L);
    }

    default long m(long j9) {
        if (j9 != 9205357640488583168L) {
            return zz.f.e(R(Float.intBitsToFloat((int) (j9 >> 32))), R(Float.intBitsToFloat((int) (j9 & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default int q0(float f11) {
        float fC0 = c0(f11);
        if (Float.isInfinite(fC0)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fC0);
    }

    default float t(long j9) {
        float fC;
        float fX;
        if (!p.a(o.b(j9), 4294967296L)) {
            i.b("Only Sp can convert to Px");
        }
        float[] fArr = a6.b.f826a;
        if (X() >= 1.03f) {
            a6.a aVarA = a6.b.a(X());
            fC = o.c(j9);
            if (aVarA != null) {
                return aVarA.b(fC);
            }
            fX = X();
        } else {
            fC = o.c(j9);
            fX = X();
        }
        return fX * fC;
    }

    default long x0(long j9) {
        if (j9 == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fC0 = c0(h.b(j9));
        return (((long) Float.floatToRawIntBits(c0(h.a(j9)))) & 4294967295L) | (Float.floatToRawIntBits(fC0) << 32);
    }

    default float z0(long j9) {
        if (!p.a(o.b(j9), 4294967296L)) {
            i.b("Only Sp can convert to Px");
        }
        return c0(t(j9));
    }
}
