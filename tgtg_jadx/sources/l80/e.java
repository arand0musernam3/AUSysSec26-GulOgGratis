package l80;

import lx.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f27503a = new d(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f27504b;

    static {
        Integer num = d80.a.f14752b;
        f27504b = (num == null || num.intValue() >= 34) ? new m80.a() : new b();
    }

    public abstract int a(int i11);

    public int b() {
        return a(32);
    }

    public int c(int i11) {
        return d(i11);
    }

    public int d(int i11) {
        int iB;
        int i12;
        if (i11 <= 0) {
            i4.a.i(u.v(0, Integer.valueOf(i11)));
            return 0;
        }
        if (i11 > 0 || i11 == Integer.MIN_VALUE) {
            if (((-i11) & i11) == i11) {
                return a(31 - Integer.numberOfLeadingZeros(i11));
            }
            do {
                iB = b() >>> 1;
                i12 = iB % i11;
            } while ((i11 - 1) + (iB - i12) < 0);
            return i12;
        }
        while (true) {
            int iB2 = b();
            if (iB2 >= 0 && iB2 < i11) {
                return iB2;
            }
        }
    }

    public long e() {
        return (((long) b()) << 32) + ((long) b());
    }

    public long f(long j9, long j11) {
        long jE;
        long j12;
        long jA;
        int iB;
        if (j11 <= j9) {
            i4.a.i(u.v(Long.valueOf(j9), Long.valueOf(j11)));
            return 0L;
        }
        long j13 = j11 - j9;
        if (j13 > 0) {
            if (((-j13) & j13) == j13) {
                int i11 = (int) j13;
                int i12 = (int) (j13 >>> 32);
                if (i11 != 0) {
                    iB = a(31 - Integer.numberOfLeadingZeros(i11));
                } else if (i12 == 1) {
                    iB = b();
                } else {
                    jA = (((long) a(31 - Integer.numberOfLeadingZeros(i12))) << 32) + (((long) b()) & 4294967295L);
                }
                jA = ((long) iB) & 4294967295L;
            } else {
                do {
                    jE = e() >>> 1;
                    j12 = jE % j13;
                } while ((j13 - 1) + (jE - j12) < 0);
                jA = j12;
            }
            return j9 + jA;
        }
        while (true) {
            long jE2 = e();
            if (j9 <= jE2 && jE2 < j11) {
                return jE2;
            }
        }
    }
}
