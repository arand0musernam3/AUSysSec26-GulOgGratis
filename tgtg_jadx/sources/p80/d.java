package p80;

import com.braze.Constants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final c f34559b = new c(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f34560c = g.b(4611686018427387903L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f34561d = g.b(-4611686018427387903L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f34562e = 9223372036854759646L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34563a;

    public static final long a(long j9, long j11) {
        long j12 = 1000000;
        long j13 = j11 / j12;
        long jA = g.a(j9, j13);
        if (-4611686018426L > jA || jA >= 4611686018427L) {
            return g.b(jA);
        }
        return g.d((jA * j12) + (j11 - (j13 * j12)));
    }

    public static final void c(StringBuilder sb2, int i11, int i12, int i13, String str, boolean z11) {
        sb2.append(i11);
        if (i12 != 0) {
            sb2.append('.');
            String strM = StringsKt.M(i13, String.valueOf(i12));
            int i14 = -1;
            int length = strM.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i15 = length - 1;
                    if (strM.charAt(length) != '0') {
                        i14 = length;
                        break;
                    } else if (i15 < 0) {
                        break;
                    } else {
                        length = i15;
                    }
                }
            }
            int i16 = i14 + 1;
            if (z11 || i16 >= 3) {
                sb2.append((CharSequence) strM, 0, ((i14 + 3) / 3) * 3);
            } else {
                sb2.append((CharSequence) strM, 0, i16);
            }
        }
        sb2.append(str);
    }

    public static int d(long j9, long j11) {
        long j12 = j9 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return Intrinsics.compare(j9, j11);
        }
        int i11 = (((int) j9) & 1) - (((int) j11) & 1);
        return j9 < 0 ? -i11 : i11;
    }

    public static final boolean e(long j9, long j11) {
        return j9 == j11;
    }

    public static final long f(long j9) {
        return ((((int) j9) & 1) != 1 || h(j9)) ? j(j9, h.MILLISECONDS) : j9 >> 1;
    }

    public static final int g(long j9) {
        if (h(j9)) {
            return 0;
        }
        return (int) ((((int) j9) & 1) == 1 ? ((j9 >> 1) % ((long) 1000)) * ((long) 1000000) : (j9 >> 1) % ((long) 1000000000));
    }

    public static final boolean h(long j9) {
        return j9 == f34560c || j9 == f34561d;
    }

    public static final long i(long j9, long j11) {
        int i11 = ((int) j9) & 1;
        if (i11 != (((int) j11) & 1)) {
            return i11 == 1 ? a(j9 >> 1, j11 >> 1) : a(j11 >> 1, j9 >> 1);
        }
        if (i11 == 0) {
            long j12 = (j9 >> 1) + (j11 >> 1);
            return (-4611686018426999999L > j12 || j12 >= 4611686018427000000L) ? g.b(j12 / ((long) 1000000)) : g.d(j12);
        }
        long jA = g.a(j9 >> 1, j11 >> 1);
        if (jA != 9223372036854759646L) {
            return (jA == 4611686018427387903L || jA == -4611686018427387903L) ? g.b(jA) : g.c(jA);
        }
        i4.a.f("Summing infinite durations of different signs yields an undefined result.");
        return 0L;
    }

    public static final long j(long j9, h hVar) {
        hVar.getClass();
        if (j9 == f34560c) {
            return LongCompanionObject.MAX_VALUE;
        }
        if (j9 == f34561d) {
            return Long.MIN_VALUE;
        }
        long j11 = j9 >> 1;
        h hVar2 = (((int) j9) & 1) == 0 ? h.NANOSECONDS : h.MILLISECONDS;
        hVar2.getClass();
        return hVar.a().convert(j11, hVar2.a());
    }

    public static String k(long j9) {
        long j11;
        int iJ;
        if (j9 == 0) {
            return "0s";
        }
        if (j9 == f34560c) {
            return "Infinity";
        }
        if (j9 == f34561d) {
            return "-Infinity";
        }
        int i11 = 0;
        boolean z11 = j9 < 0;
        StringBuilder sb2 = new StringBuilder();
        if (z11) {
            sb2.append('-');
        }
        long jL = j9 < 0 ? l(j9) : j9;
        long j12 = j(jL, h.DAYS);
        int iJ2 = h(jL) ? 0 : (int) (j(jL, h.HOURS) % ((long) 24));
        if (h(jL)) {
            j11 = 0;
            iJ = 0;
        } else {
            j11 = 0;
            iJ = (int) (j(jL, h.MINUTES) % ((long) 60));
        }
        int iJ3 = h(jL) ? 0 : (int) (j(jL, h.SECONDS) % ((long) 60));
        int iG = g(jL);
        boolean z12 = j12 != j11;
        boolean z13 = iJ2 != 0;
        boolean z14 = iJ != 0;
        boolean z15 = (iJ3 == 0 && iG == 0) ? false : true;
        if (z12) {
            sb2.append(j12);
            sb2.append('d');
            i11 = 1;
        }
        if (z13 || (z12 && (z14 || z15))) {
            int i12 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(iJ2);
            sb2.append('h');
            i11 = i12;
        }
        if (z14 || (z15 && (z13 || z12))) {
            int i13 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(iJ);
            sb2.append('m');
            i11 = i13;
        }
        if (z15) {
            int i14 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            if (iJ3 != 0 || z12 || z13 || z14) {
                c(sb2, iJ3, iG, 9, Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, false);
            } else if (iG >= 1000000) {
                c(sb2, iG / 1000000, iG % 1000000, 6, "ms", false);
            } else if (iG >= 1000) {
                c(sb2, iG / 1000, iG % 1000, 3, "us", false);
            } else {
                sb2.append(iG);
                sb2.append("ns");
            }
            i11 = i14;
        }
        if (z11 && i11 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }

    public static final long l(long j9) {
        long j11 = ((-(j9 >> 1)) << 1) + ((long) (((int) j9) & 1));
        f34559b.getClass();
        int i11 = e.f34564a;
        return j11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return d(this.f34563a, ((d) obj).f34563a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f34563a == ((d) obj).f34563a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f34563a);
    }

    public final String toString() {
        return k(this.f34563a);
    }
}
