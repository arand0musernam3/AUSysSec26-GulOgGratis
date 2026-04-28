package q1;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35767f;

    public i0(int i11) {
        this.f35822a = g1.f35760a;
        this.f35823b = y.f35862a;
        this.f35824c = r.f35817a;
        if (i11 >= 0) {
            d(g1.d(i11));
        } else {
            i4.a.f("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int c(int i11) {
        int i12 = this.f35825d;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f35822a;
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

    public final void d(int i11) {
        long[] jArr;
        int iMax = i11 > 0 ? Math.max(7, g1.c(i11)) : 0;
        this.f35825d = iMax;
        if (iMax == 0) {
            jArr = g1.f35760a;
        } else {
            int i12 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i12];
            Arrays.fill(jArr2, 0, i12, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f35822a = jArr;
        int i13 = iMax >> 3;
        long j9 = 255 << ((iMax & 7) << 3);
        jArr[i13] = (jArr[i13] & (~j9)) | j9;
        this.f35767f = g1.a(this.f35825d) - this.f35826e;
        this.f35823b = new long[iMax];
        this.f35824c = new int[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006e, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0079, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007b, code lost:
    
        r1 = c(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0083, code lost:
    
        if (r38.f35767f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0097, code lost:
    
        if (((r38.f35822a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0099, code lost:
    
        r25 = 255;
        r29 = r10;
        r27 = 0;
        r18 = 1;
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a7, code lost:
    
        r1 = r38.f35825d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a9, code lost:
    
        if (r1 <= 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ab, code lost:
    
        r20 = 128;
        r4 = r38.f35826e;
        r2 = u70.c0.f40833b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bf, code lost:
    
        if (java.lang.Long.compareUnsigned(r4 * 32, ((long) r1) * 25) > 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c1, code lost:
    
        r1 = r38.f35822a;
        r2 = r38.f35825d;
        r4 = r38.f35823b;
        r5 = r38.f35824c;
        r6 = (r2 + 7) >> 3;
        r25 = 255;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d2, code lost:
    
        if (r7 >= r6) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d4, code lost:
    
        r9 = r1[r7] & (-9187201950435737472L);
        r1[r7] = (-72340172838076674L) & ((~r9) + (r9 >>> 7));
        r7 = r7 + 1;
        r13 = r13;
        r12 = r12;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f1, code lost:
    
        r29 = r10;
        r27 = r12;
        r11 = r13;
        r8 = 7;
        r6 = kotlin.collections.y.A(r1);
        r7 = r6 - 1;
        r12 = 72057594037927935L;
        r1[r7] = (r1[r7] & 72057594037927935L) | (-72057594037927936L);
        r1[r6] = r1[r27];
        r6 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0110, code lost:
    
        if (r6 == r2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0112, code lost:
    
        r7 = r6 >> 3;
        r14 = (r6 & 7) << 3;
        r9 = (r1[r7] >> r14) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x011f, code lost:
    
        if (r9 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0121, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0126, code lost:
    
        if (r9 == 254) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0129, code lost:
    
        r9 = java.lang.Long.hashCode(r4[r6]) * r19;
        r9 = r9 ^ (r9 << 16);
        r10 = r9 >>> 7;
        r15 = c(r10);
        r10 = r10 & r2;
        r28 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x014a, code lost:
    
        if ((((r15 - r10) & r2) / 8) != (((r6 - r10) & r2) / 8)) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x014c, code lost:
    
        r10 = r11;
        r35 = r12;
        r1[r7] = (((long) (r9 & 127)) << r14) | (r1[r7] & (~(255 << r14)));
        r1[r1.length - r10] = (r1[r27] & r35) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r11 = r10;
        r8 = r28;
        r12 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016f, code lost:
    
        r10 = r11;
        r35 = r12;
        r8 = r15 >> 3;
        r11 = r1[r8];
        r13 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0180, code lost:
    
        if (((r11 >> r13) & 255) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0182, code lost:
    
        r18 = r10;
        r12 = r4;
        r37 = r5;
        r1[r8] = (r11 & (~(255 << r13))) | (((long) (r9 & 127)) << r13);
        r1[r7] = (r1[r7] & (~(255 << r14))) | (128 << r14);
        r12[r15] = r12[r6];
        r12[r6] = 0;
        r37[r15] = r37[r6];
        r37[r6] = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01ae, code lost:
    
        r37 = r5;
        r18 = r10;
        r12 = r4;
        r1[r8] = (((long) (r9 & 127)) << r13) | (r11 & (~(255 << r13)));
        r4 = r12[r15];
        r12[r15] = r12[r6];
        r12[r6] = r4;
        r4 = r37[r15];
        r37[r15] = r37[r6];
        r37[r6] = r4;
        r6 = r6 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d3, code lost:
    
        r1[r1.length - 1] = (r1[r27] & r35) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r4 = r12;
        r11 = r18;
        r8 = r28;
        r12 = r35;
        r5 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01eb, code lost:
    
        r18 = r11;
        r38.f35767f = q1.g1.a(r38.f35825d) - r38.f35826e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01fc, code lost:
    
        r25 = 255;
        r29 = r10;
        r27 = 0;
        r18 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0207, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x020a, code lost:
    
        r1 = q1.g1.b(r38.f35825d);
        r2 = r38.f35822a;
        r4 = r38.f35823b;
        r5 = r38.f35824c;
        r6 = r38.f35825d;
        d(r1);
        r1 = r38.f35822a;
        r7 = r38.f35823b;
        r8 = r38.f35824c;
        r9 = r38.f35825d;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0225, code lost:
    
        if (r10 >= r6) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0234, code lost:
    
        if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r20) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0236, code lost:
    
        r11 = r4[r10];
        r13 = java.lang.Long.hashCode(r11) * r19;
        r13 = r13 ^ (r13 << 16);
        r14 = c(r13 >>> 7);
        r16 = r1;
        r15 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r17 = (r14 & 7) << 3;
        r1 = (r16[r13] & (~(255 << r17))) | (r1 << r17);
        r16[r13] = r1;
        r16[(((r14 - 7) & r9) + (r9 & 7)) >> 3] = r1;
        r7[r14] = r11;
        r8[r14] = r5[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0274, code lost:
    
        r16 = r1;
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0277, code lost:
    
        r10 = r10 + 1;
        r2 = r15;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x027d, code lost:
    
        r1 = c(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0281, code lost:
    
        r38.f35826e++;
        r2 = r38.f35767f;
        r3 = r38.f35822a;
        r4 = r1 >> 3;
        r5 = r3[r4];
        r7 = (r1 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0299, code lost:
    
        if (((r5 >> r7) & r25) != r20) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x029c, code lost:
    
        r18 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x029e, code lost:
    
        r38.f35767f = r2 - r18;
        r2 = r38.f35825d;
        r5 = (r5 & (~(r25 << r7))) | (r29 << r7);
        r3[r4] = r5;
        r3[(((r1 - 7) & r2) + (r2 & 7)) >> 3] = r5;
        r1 = ~r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r39, long r40) {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.i0.e(int, long):void");
    }
}
