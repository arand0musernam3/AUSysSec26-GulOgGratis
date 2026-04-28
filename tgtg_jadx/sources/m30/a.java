package m30;

import java.math.RoundingMode;
import java.util.Arrays;
import o00.h0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f29497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f29500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f29501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f29502g;

    public a(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        int i11 = 0;
        while (true) {
            if (i11 >= cArr.length) {
                this.f29496a = str;
                this.f29497b = cArr;
                try {
                    int length = cArr.length;
                    RoundingMode roundingMode = RoundingMode.UNNECESSARY;
                    int iB = h0.B(length);
                    this.f29499d = iB;
                    int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iB);
                    int i12 = 1 << (3 - iNumberOfTrailingZeros);
                    this.f29500e = i12;
                    this.f29501f = iB >> iNumberOfTrailingZeros;
                    this.f29498c = cArr.length - 1;
                    this.f29502g = bArr;
                    boolean[] zArr = new boolean[i12];
                    for (int i13 = 0; i13 < this.f29501f; i13++) {
                        int i14 = this.f29499d;
                        RoundingMode roundingMode2 = RoundingMode.CEILING;
                        zArr[h0.s(i13 * 8, i14)] = true;
                    }
                    return;
                } catch (ArithmeticException e5) {
                    throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e5);
                }
            }
            char c3 = cArr[i11];
            if (!(c3 < 128)) {
                i4.a.f(nx.d.A("Non-ASCII character: %s", Character.valueOf(c3)));
                throw null;
            }
            if (!(bArr[c3] == -1)) {
                i4.a.f(nx.d.A("Duplicate character: %s", Character.valueOf(c3)));
                throw null;
            }
            bArr[c3] = (byte) i11;
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && Arrays.equals(this.f29497b, ((a) obj).f29497b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f29497b) + 1237;
    }

    public final String toString() {
        return this.f29496a;
    }
}
