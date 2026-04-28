package n80;

import c50.w;
import kotlin.ranges.IntRange;
import m0.i1;
import w.a0;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class p extends o {
    public static double a(double d3, double d11, double d12) {
        if (d11 <= d12) {
            return d3 < d11 ? d11 : d3 > d12 ? d12 : d3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static float b(float f11, float f12, float f13) {
        if (f12 <= f13) {
            return f11 < f12 ? f12 : f11 > f13 ? f13 : f11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f13 + " is less than minimum " + f12 + '.');
    }

    public static int c(int i11, int i12, int i13) {
        if (i12 <= i13) {
            return i11 < i12 ? i12 : i11 > i13 ? i13 : i11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i13 + " is less than minimum " + i12 + '.');
    }

    public static long d(long j9, long j11, long j12) {
        if (j11 <= j12) {
            return j9 < j11 ? j11 : j9 > j12 ? j12 : j9;
        }
        i4.a.f(a0.r(l1.g("Cannot coerce value to an empty range: maximum ", j12, " is less than minimum "), j11, '.'));
        return 0L;
    }

    public static long e(long j9, n nVar) {
        long j11 = nVar.f30719b;
        long j12 = nVar.f30718a;
        if (!nVar.isEmpty()) {
            return j9 < Long.valueOf(j12).longValue() ? Long.valueOf(j12).longValue() : j9 > Long.valueOf(j11).longValue() ? Long.valueOf(j11).longValue() : j9;
        }
        i1.f(nVar, 46, "Cannot coerce value to an empty range: ");
        return 0L;
    }

    public static final Comparable f(Comparable comparable, f fVar) {
        boolean zA = fVar.a();
        float f11 = fVar.f30712a;
        Float fValueOf = Float.valueOf(0.0f);
        if (!zA) {
            return (!f.b(comparable, fValueOf) || f.b(fValueOf, comparable)) ? (!f.b(Float.valueOf(f11), comparable) || f.b(comparable, Float.valueOf(f11))) ? comparable : Float.valueOf(f11) : fValueOf;
        }
        i1.f(fVar, 46, "Cannot coerce value to an empty range: ");
        return null;
    }

    public static Comparable g(Integer num, Integer num2, Integer num3) {
        if (num2 == null || num3 == null) {
            if (num2 != null && num.compareTo(num2) < 0) {
                return num2;
            }
            if (num3 != null && num.compareTo(num3) > 0) {
                return num3;
            }
        } else {
            if (num2.compareTo(num3) > 0) {
                w.m("Cannot coerce value to an empty range: maximum ", num3, " is less than minimum ", num2, 46);
                return null;
            }
            if (num.compareTo(num2) < 0) {
                return num2;
            }
            if (num.compareTo(num3) > 0) {
                return num3;
            }
        }
        return num;
    }

    public static kotlin.ranges.a h(int i11, IntRange intRange) {
        intRange.getClass();
        boolean z11 = i11 > 0;
        Integer numValueOf = Integer.valueOf(i11);
        if (!z11) {
            i1.f(numValueOf, 46, "Step must be positive, was: ");
        }
        g gVar = kotlin.ranges.a.f26552d;
        int i12 = intRange.f26553a;
        int i13 = intRange.f26554b;
        if (intRange.f26555c <= 0) {
            i11 = -i11;
        }
        gVar.getClass();
        return new kotlin.ranges.a(i12, i13, i11);
    }

    public static k i(k kVar) {
        j jVar = k.f30717d;
        long j9 = kVar.f30718a;
        long j11 = kVar.f30719b;
        long j12 = kVar.f30720c > 0 ? 1000L : -1000L;
        jVar.getClass();
        return new k(j9, j11, j12);
    }

    public static IntRange j(int i11, int i12) {
        if (i12 > Integer.MIN_VALUE) {
            return new IntRange(i11, i12 - 1, 1);
        }
        IntRange.f26550e.getClass();
        return IntRange.f26551f;
    }
}
