package p80;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public static final long a(long j9, long j11) {
        if (j9 != 4611686018427387903L && j9 != -4611686018427387903L) {
            return (j11 == 4611686018427387903L || j11 == -4611686018427387903L) ? j11 : n80.p.d(j9 + j11, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j11 || j11 >= 4611686018427387903L) && (j11 ^ j9) < 0) {
            return 9223372036854759646L;
        }
        return j9;
    }

    public static final long b(long j9) {
        long j11 = (j9 << 1) + 1;
        d.f34559b.getClass();
        int i11 = e.f34564a;
        return j11;
    }

    public static final long c(long j9) {
        return (-4611686018426L > j9 || j9 >= 4611686018427L) ? b(n80.p.d(j9, -4611686018427387903L, 4611686018427387903L)) : d(j9 * ((long) 1000000));
    }

    public static final long d(long j9) {
        long j11 = j9 << 1;
        d.f34559b.getClass();
        int i11 = e.f34564a;
        return j11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0106, code lost:
    
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x010b, code lost:
    
        if (r8 == r24.length()) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0111, code lost:
    
        if (r3 == '+') goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0113, code lost:
    
        if (r3 == '-') goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0115, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0117, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x011b, code lost:
    
        if (r8 == (r21 + r3)) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x011d, code lost:
    
        r6 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0193 A[LOOP:7: B:108:0x0191->B:109:0x0193, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x018c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0156 A[LOOP:5: B:97:0x0154->B:98:0x0156, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long e(java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p80.g.e(java.lang.String):long");
    }

    public static final long f(double d3, h hVar) {
        hVar.getClass();
        double dA = i.a(d3, hVar, h.NANOSECONDS);
        if (Double.isNaN(dA)) {
            i4.a.f("Duration value cannot be NaN.");
            return 0L;
        }
        long jC = j80.c.c(dA);
        return (-4611686018426999999L > jC || jC >= 4611686018427000000L) ? c(j80.c.c(i.a(d3, hVar, h.MILLISECONDS))) : d(jC);
    }

    public static final long g(int i11, h hVar) {
        hVar.getClass();
        if (hVar.compareTo(h.SECONDS) > 0) {
            return h(i11, hVar);
        }
        long j9 = i11;
        h hVar2 = h.NANOSECONDS;
        hVar2.getClass();
        return d(hVar2.a().convert(j9, hVar.a()));
    }

    public static final long h(long j9, h hVar) {
        hVar.getClass();
        h hVar2 = h.NANOSECONDS;
        hVar2.getClass();
        long jConvert = hVar.a().convert(4611686018426999999L, hVar2.a());
        if ((-jConvert) <= j9 && j9 <= jConvert) {
            return d(hVar2.a().convert(j9, hVar.a()));
        }
        h hVar3 = h.MILLISECONDS;
        if (hVar.compareTo(hVar3) < 0) {
            hVar3.getClass();
            return b(n80.p.d(hVar3.a().convert(j9, hVar.a()), -4611686018427387903L, 4611686018427387903L));
        }
        long jSignum = Long.signum(j9);
        if (j9 < -9223372036854775807L) {
            j9 = -9223372036854775807L;
        }
        return b(k.b(Math.abs(j9), hVar) * jSignum);
    }
}
