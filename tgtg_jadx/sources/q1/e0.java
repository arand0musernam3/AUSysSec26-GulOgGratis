package q1;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35747f;

    public e0(int i11) {
        this.f35772a = g1.f35760a;
        int[] iArr = r.f35817a;
        this.f35773b = iArr;
        this.f35774c = iArr;
        if (i11 >= 0) {
            e(g1.d(i11));
        } else {
            i4.a.f("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.f35776e = 0;
        long[] jArr = this.f35772a;
        if (jArr != g1.f35760a) {
            kotlin.collections.x.n(jArr, -9187201950435737472L);
            long[] jArr2 = this.f35772a;
            int i11 = this.f35775d;
            int i12 = i11 >> 3;
            long j9 = 255 << ((i11 & 7) << 3);
            jArr2[i12] = (jArr2[i12] & (~j9)) | j9;
        }
        this.f35747f = g1.a(this.f35775d) - this.f35776e;
    }

    public final int d(int i11) {
        int i12 = this.f35775d;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f35772a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j9 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = j9 & ((~j9) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i13 + (Long.numberOfTrailingZeros(j11) >> 3)) & i12;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    public final void e(int i11) {
        long[] jArr;
        int iMax = i11 > 0 ? Math.max(7, g1.c(i11)) : 0;
        this.f35775d = iMax;
        if (iMax == 0) {
            jArr = g1.f35760a;
        } else {
            int i12 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i12];
            Arrays.fill(jArr2, 0, i12, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f35772a = jArr;
        int i13 = iMax >> 3;
        long j9 = 255 << ((iMax & 7) << 3);
        jArr[i13] = (jArr[i13] & (~j9)) | j9;
        this.f35747f = g1.a(this.f35775d) - this.f35776e;
        this.f35773b = new int[iMax];
        this.f35774c = new int[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006e, code lost:
    
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007a, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
    
        r2 = d(r4);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0084, code lost:
    
        if (r37.f35747f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0098, code lost:
    
        if (((r37.f35772a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
    
        r27 = r9;
        r25 = 255;
        r18 = 1;
        r32 = 0;
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a8, code lost:
    
        r2 = r37.f35775d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00aa, code lost:
    
        if (r2 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:
    
        r19 = 128;
        r5 = r37.f35776e;
        r3 = u70.c0.f40833b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c0, code lost:
    
        if (java.lang.Long.compareUnsigned(r5 * 32, ((long) r2) * 25) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c2, code lost:
    
        r2 = r37.f35772a;
        r3 = r37.f35775d;
        r5 = r37.f35773b;
        r6 = r37.f35774c;
        r13 = (r3 + 7) >> 3;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d1, code lost:
    
        if (r7 >= r13) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d3, code lost:
    
        r8 = r2[r7] & (-9187201950435737472L);
        r2[r7] = (-72340172838076674L) & ((~r8) + (r8 >>> 7));
        r7 = r7 + 1;
        r11 = r11;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ef, code lost:
    
        r27 = r9;
        r25 = r11;
        r12 = 7;
        r7 = kotlin.collections.y.A(r2);
        r8 = r7 - 1;
        r2[r8] = (r2[r8] & 72057594037927935L) | (-72057594037927936L);
        r2[r7] = r2[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x010e, code lost:
    
        if (r7 == r3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0110, code lost:
    
        r8 = r7 >> 3;
        r11 = (r7 & 7) << 3;
        r9 = (r2[r8] >> r11) & r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x011d, code lost:
    
        if (r9 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x011f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0124, code lost:
    
        if (r9 == 254) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0127, code lost:
    
        r9 = java.lang.Integer.hashCode(r5[r7]) * r21;
        r9 = r9 ^ (r9 << 16);
        r10 = r9 >>> 7;
        r13 = d(r10);
        r10 = r10 & r3;
        r29 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0148, code lost:
    
        if ((((r13 - r10) & r3) / 8) != (((r7 - r10) & r3) / 8)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x014a, code lost:
    
        r32 = r15;
        r2[r8] = (((long) (r9 & 127)) << r11) | (r2[r8] & (~(r25 << r11)));
        r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r14;
        r12 = r29;
        r15 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016f, code lost:
    
        r18 = r14;
        r32 = r15;
        r10 = r13 >> 3;
        r14 = r2[r10];
        r12 = (r13 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0181, code lost:
    
        if (((r14 >> r12) & r25) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0183, code lost:
    
        r33 = r5;
        r34 = r6;
        r2[r10] = ((~(r25 << r12)) & r14) | (((long) (r9 & 127)) << r12);
        r2[r8] = (r2[r8] & (~(r25 << r11))) | (128 << r11);
        r33[r13] = r33[r7];
        r33[r7] = r32;
        r34[r13] = r34[r7];
        r34[r7] = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01ad, code lost:
    
        r33 = r5;
        r34 = r6;
        r2[r10] = (((long) (r9 & 127)) << r12) | ((~(r25 << r12)) & r14);
        r5 = r33[r13];
        r33[r13] = r33[r7];
        r33[r7] = r5;
        r5 = r34[r13];
        r34[r13] = r34[r7];
        r34[r7] = r5;
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01ce, code lost:
    
        r2[r2.length - 1] = (r2[r32] & 72057594037927935L) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r14 = r18;
        r12 = r29;
        r15 = r32;
        r5 = r33;
        r6 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01e7, code lost:
    
        r18 = r14;
        r32 = r15;
        r37.f35747f = q1.g1.a(r37.f35775d) - r37.f35776e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01fa, code lost:
    
        r27 = r9;
        r25 = 255;
        r18 = 1;
        r32 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0205, code lost:
    
        r19 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0208, code lost:
    
        r2 = q1.g1.b(r37.f35775d);
        r3 = r37.f35772a;
        r5 = r37.f35773b;
        r6 = r37.f35774c;
        r7 = r37.f35775d;
        e(r2);
        r2 = r37.f35772a;
        r8 = r37.f35773b;
        r9 = r37.f35774c;
        r10 = r37.f35775d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0223, code lost:
    
        if (r11 >= r7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0232, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r19) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0234, code lost:
    
        r12 = r5[r11];
        r13 = java.lang.Integer.hashCode(r12) * r21;
        r13 = r13 ^ (r13 << 16);
        r14 = d(r13 >>> 7);
        r15 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r16 = (r14 & 7) << 3;
        r1 = (r15[r13] & (~(255 << r16))) | (r1 << r16);
        r15[r13] = r1;
        r15[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r14] = r12;
        r9[r14] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0270, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0271, code lost:
    
        r11 = r11 + 1;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0277, code lost:
    
        r2 = d(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x027b, code lost:
    
        r37.f35776e++;
        r1 = r37.f35747f;
        r3 = r37.f35772a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0293, code lost:
    
        if (((r5 >> r7) & r25) != r19) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0295, code lost:
    
        r32 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0297, code lost:
    
        r37.f35747f = r1 - r32;
        r1 = r37.f35775d;
        r5 = (r5 & (~(r25 << r7))) | (r27 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r13 = ~r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r38, int r39) {
        /*
            Method dump skipped, instruction units count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.e0.f(int, int):void");
    }

    public /* synthetic */ e0() {
        this(6);
    }
}
