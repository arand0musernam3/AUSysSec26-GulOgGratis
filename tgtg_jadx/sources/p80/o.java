package p80;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f34570a = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f34571b = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f34572c = {3, 6};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f34573d = {1, 2, 4, 5, 7, 8};

    public static int a(b bVar, b bVar2) {
        bVar2.getClass();
        long jB = bVar.b(bVar2);
        d.f34559b.getClass();
        return d.d(jB, 0L);
    }

    public static final void b(StringBuilder sb2, StringBuilder sb3, int i11) {
        if (i11 < 10) {
            sb2.append('0');
        }
        sb3.append(i11);
    }

    public static l c(int i11, long j9) {
        long j11 = i11;
        long j12 = j11 / 1000000000;
        if ((j11 ^ 1000000000) < 0 && j12 * 1000000000 != j11) {
            j12--;
        }
        long j13 = j9 + j12;
        if ((j9 ^ j13) < 0 && (j12 ^ j9) >= 0) {
            return j9 > 0 ? l.f34566d : l.f34565c;
        }
        if (j13 < -31557014167219200L) {
            return l.f34565c;
        }
        if (j13 > 31556889864403199L) {
            return l.f34566d;
        }
        long j14 = j11 % 1000000000;
        return new l(j13, (int) (j14 + ((((j14 ^ 1000000000) & ((-j14) | j14)) >> 63) & 1000000000)));
    }

    public static final long d(long j9) {
        if (j9 < 0) {
            d.f34559b.getClass();
            return d.f34561d;
        }
        d.f34559b.getClass();
        return d.f34560c;
    }

    public static final f6.p e(String str, String str2, int i11, Function1 function1) {
        char cCharAt = str.charAt(i11);
        if (((Boolean) function1.invoke(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return f(str, "Expected " + str2 + ", but got '" + cCharAt + "' at position " + i11);
    }

    public static final f6.p f(String str, String str2) {
        StringBuilder sbR = e0.f.r(str2, " when parsing an Instant from \"");
        sbR.append(i(64, str));
        sbR.append('\"');
        return new f6.p(sbR.toString(), str, 2);
    }

    public static final int g(int i11, String str) {
        return (str.charAt(i11 + 1) - '0') + ((str.charAt(i11) - '0') * 10);
    }

    public static final long h(long j9, long j11, h hVar) {
        long j12 = j9 - j11;
        if (((j12 ^ j9) & (~(j12 ^ j11))) >= 0) {
            return g.h(j12, hVar);
        }
        h hVar2 = h.MILLISECONDS;
        if (hVar.compareTo(hVar2) >= 0) {
            return d.l(d(j12));
        }
        hVar2.getClass();
        long jConvert = hVar.a().convert(1L, hVar2.a());
        long j13 = (j9 / jConvert) - (j11 / jConvert);
        long j14 = (j9 % jConvert) - (j11 % jConvert);
        c cVar = d.f34559b;
        return d.i(g.h(j13, hVar2), g.h(j14, hVar));
    }

    public static final String i(int i11, String str) {
        if (str.length() <= i11) {
            return str.toString();
        }
        return str.subSequence(0, i11).toString() + "...";
    }
}
