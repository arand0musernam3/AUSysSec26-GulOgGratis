package i4;

import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f23309b = g0.d(4278190080L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f23310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f23311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f23312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f23313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f23314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f23315h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f23316i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23317a;

    static {
        g0.d(4282664004L);
        g0.d(4287137928L);
        g0.d(4291611852L);
        f23310c = g0.d(4294967295L);
        f23311d = g0.d(4294901760L);
        f23312e = g0.d(4278255360L);
        f23313f = g0.d(4278190335L);
        g0.d(4294967040L);
        g0.d(4278255615L);
        g0.d(4294902015L);
        f23314g = g0.c(0);
        f23315h = g0.b(0.0f, 0.0f, 0.0f, 0.0f, j4.e.f24555u);
    }

    public /* synthetic */ v(long j9) {
        this.f23317a = j9;
    }

    public static final long a(long j9, j4.c cVar) {
        j4.h hVarE;
        j4.c cVarF = f(j9);
        int i11 = cVarF.f24534c;
        int i12 = cVar.f24534c;
        if ((i11 | i12) < 0) {
            hVarE = j4.k.e(cVarF, cVar);
        } else {
            q1.g0 g0Var = j4.i.f24567a;
            int i13 = i11 | (i12 << 6);
            Object objB = g0Var.b(i13);
            if (objB == null) {
                objB = j4.k.e(cVarF, cVar);
                g0Var.i(i13, objB);
            }
            hVarE = (j4.h) objB;
        }
        return hVarE.a(j9);
    }

    public static long b(float f11, long j9) {
        return g0.b(h(j9), g(j9), e(j9), f11, f(j9));
    }

    public static final boolean c(long j9, long j11) {
        u70.b0 b0Var = u70.c0.f40833b;
        return j9 == j11;
    }

    public static final float d(long j9) {
        float fR;
        float f11;
        long j11 = 63 & j9;
        u70.b0 b0Var = u70.c0.f40833b;
        if (j11 == 0) {
            fR = (float) bx.o.R((j9 >>> 56) & 255);
            f11 = 255.0f;
        } else {
            fR = (float) bx.o.R((j9 >>> 6) & 1023);
            f11 = 1023.0f;
        }
        return fR / f11;
    }

    public static final float e(long j9) {
        int i11;
        int i12;
        int i13;
        long j11 = 63 & j9;
        u70.b0 b0Var = u70.c0.f40833b;
        if (j11 == 0) {
            return ((float) bx.o.R((j9 >>> 32) & 255)) / 255.0f;
        }
        short s7 = (short) ((j9 >>> 16) & 65535);
        int i14 = Short.MIN_VALUE & s7;
        int i15 = ((65535 & s7) >>> 10) & 31;
        int i16 = s7 & 1023;
        if (i15 != 0) {
            int i17 = i16 << 13;
            if (i15 == 31) {
                i11 = 255;
                if (i17 != 0) {
                    i17 |= 4194304;
                }
            } else {
                i11 = i15 + 112;
            }
            int i18 = i11;
            i12 = i17;
            i13 = i18;
        } else {
            if (i16 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i16 + 1056964608) - d0.f23234a;
                return i14 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i13 = 0;
            i12 = 0;
        }
        return Float.intBitsToFloat((i13 << 23) | (i14 << 16) | i12);
    }

    public static final j4.c f(long j9) {
        float[] fArr = j4.e.f24536a;
        u70.b0 b0Var = u70.c0.f40833b;
        return j4.e.f24559y[(int) (j9 & 63)];
    }

    public static final float g(long j9) {
        int i11;
        int i12;
        int i13;
        long j11 = 63 & j9;
        u70.b0 b0Var = u70.c0.f40833b;
        if (j11 == 0) {
            return ((float) bx.o.R((j9 >>> 40) & 255)) / 255.0f;
        }
        short s7 = (short) ((j9 >>> 32) & 65535);
        int i14 = Short.MIN_VALUE & s7;
        int i15 = ((65535 & s7) >>> 10) & 31;
        int i16 = s7 & 1023;
        if (i15 != 0) {
            int i17 = i16 << 13;
            if (i15 == 31) {
                i11 = 255;
                if (i17 != 0) {
                    i17 |= 4194304;
                }
            } else {
                i11 = i15 + 112;
            }
            int i18 = i11;
            i12 = i17;
            i13 = i18;
        } else {
            if (i16 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i16 + 1056964608) - d0.f23234a;
                return i14 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i13 = 0;
            i12 = 0;
        }
        return Float.intBitsToFloat((i13 << 23) | (i14 << 16) | i12);
    }

    public static final float h(long j9) {
        int i11;
        int i12;
        int i13;
        long j11 = 63 & j9;
        u70.b0 b0Var = u70.c0.f40833b;
        if (j11 == 0) {
            return ((float) bx.o.R((j9 >>> 48) & 255)) / 255.0f;
        }
        short s7 = (short) ((j9 >>> 48) & 65535);
        int i14 = Short.MIN_VALUE & s7;
        int i15 = ((65535 & s7) >>> 10) & 31;
        int i16 = s7 & 1023;
        if (i15 != 0) {
            int i17 = i16 << 13;
            if (i15 == 31) {
                i11 = 255;
                if (i17 != 0) {
                    i17 |= 4194304;
                }
            } else {
                i11 = i15 + 112;
            }
            int i18 = i11;
            i12 = i17;
            i13 = i18;
        } else {
            if (i16 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i16 + 1056964608) - d0.f23234a;
                return i14 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i13 = 0;
            i12 = 0;
        }
        return Float.intBitsToFloat((i13 << 23) | (i14 << 16) | i12);
    }

    public static String i(long j9) {
        StringBuilder sb2 = new StringBuilder("Color(");
        sb2.append(h(j9));
        sb2.append(", ");
        sb2.append(g(j9));
        sb2.append(", ");
        sb2.append(e(j9));
        sb2.append(", ");
        sb2.append(d(j9));
        sb2.append(", ");
        return l1.f(sb2, f(j9).f24532a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return this.f23317a == ((v) obj).f23317a;
        }
        return false;
    }

    public final int hashCode() {
        u70.b0 b0Var = u70.c0.f40833b;
        return Long.hashCode(this.f23317a);
    }

    public final String toString() {
        return i(this.f23317a);
    }
}
