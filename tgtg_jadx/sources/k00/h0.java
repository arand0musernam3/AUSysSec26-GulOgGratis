package k00;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f25647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f25651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f25652g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f25653h;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[LOOP:0: B:16:0x005d->B:18:0x0061, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h0(java.lang.String r4, char[] r5, byte[] r6, boolean r7) {
        /*
            r3 = this;
            r3.<init>()
            r3.f25646a = r4
            r5.getClass()
            r3.f25647b = r5
            int r4 = r5.length     // Catch: java.lang.ArithmeticException -> L73
            java.math.RoundingMode r0 = java.math.RoundingMode.UNNECESSARY     // Catch: java.lang.ArithmeticException -> L73
            if (r4 <= 0) goto L7d
            int[] r1 = k00.l0.f25667a     // Catch: java.lang.ArithmeticException -> L73
            int r0 = r0.ordinal()     // Catch: java.lang.ArithmeticException -> L73
            r0 = r1[r0]     // Catch: java.lang.ArithmeticException -> L73
            switch(r0) {
                case 1: goto L38;
                case 2: goto L3d;
                case 3: goto L3d;
                case 4: goto L2f;
                case 5: goto L2f;
                case 6: goto L20;
                case 7: goto L20;
                case 8: goto L20;
                default: goto L1a;
            }     // Catch: java.lang.ArithmeticException -> L73
        L1a:
            java.lang.AssertionError r4 = new java.lang.AssertionError     // Catch: java.lang.ArithmeticException -> L73
            r4.<init>()     // Catch: java.lang.ArithmeticException -> L73
            throw r4     // Catch: java.lang.ArithmeticException -> L73
        L20:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r4)     // Catch: java.lang.ArithmeticException -> L73
            r1 = -1257966797(0xffffffffb504f333, float:-4.9527733E-7)
            int r1 = r1 >>> r0
            int r0 = 31 - r0
            int r1 = r1 - r4
            int r1 = r1 >>> 31
            int r0 = r0 + r1
            goto L43
        L2f:
            int r0 = r4 + (-1)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)     // Catch: java.lang.ArithmeticException -> L73
            int r0 = 32 - r0
            goto L43
        L38:
            int r0 = r4 + (-1)
            r0 = r0 & r4
            if (r0 != 0) goto L75
        L3d:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r4)     // Catch: java.lang.ArithmeticException -> L73
            int r0 = 31 - r0
        L43:
            r3.f25649d = r0     // Catch: java.lang.ArithmeticException -> L73
            int r5 = java.lang.Integer.numberOfTrailingZeros(r0)
            int r1 = 3 - r5
            r2 = 1
            int r1 = r2 << r1
            r3.f25650e = r1
            int r5 = r0 >> r5
            r3.f25651f = r5
            int r4 = r4 + (-1)
            r3.f25648c = r4
            r3.f25652g = r6
            boolean[] r4 = new boolean[r1]
            r5 = 0
        L5d:
            int r6 = r3.f25651f
            if (r5 >= r6) goto L70
            int r6 = r5 * 8
            int r0 = r3.f25649d
            java.math.RoundingMode r1 = java.math.RoundingMode.CEILING
            int r6 = k00.a.a(r6, r0)
            r4[r6] = r2
            int r5 = r5 + 1
            goto L5d
        L70:
            r3.f25653h = r7
            return
        L73:
            r4 = move-exception
            goto L85
        L75:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException     // Catch: java.lang.ArithmeticException -> L73
            java.lang.String r6 = "mode was UNNECESSARY, but rounding was necessary"
            r4.<init>(r6)     // Catch: java.lang.ArithmeticException -> L73
            throw r4     // Catch: java.lang.ArithmeticException -> L73
        L7d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.ArithmeticException -> L73
            java.lang.String r6 = "x (0) must be > 0"
            r4.<init>(r6)     // Catch: java.lang.ArithmeticException -> L73
            throw r4     // Catch: java.lang.ArithmeticException -> L73
        L85:
            int r5 = r5.length
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Illegal alphabet length "
            java.lang.String r5 = j4.s.f(r5, r7)
            r6.<init>(r5, r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k00.h0.<init>(java.lang.String, char[], byte[], boolean):void");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f25653h == h0Var.f25653h && Arrays.equals(this.f25647b, h0Var.f25647b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f25647b) + (true != this.f25653h ? 1237 : 1231);
    }

    public final String toString() {
        return this.f25646a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h0(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i11 = 0; i11 < cArr.length; i11++) {
            char c3 = cArr[i11];
            if (c3 < 128) {
                if (bArr[c3] == -1) {
                    bArr[c3] = (byte) i11;
                } else {
                    i4.a.f(a.c("Duplicate character: %s", Character.valueOf(c3)));
                    throw null;
                }
            } else {
                i4.a.f(a.c("Non-ASCII character: %s", Character.valueOf(c3)));
                throw null;
            }
        }
        this(str, cArr, bArr, false);
    }
}
