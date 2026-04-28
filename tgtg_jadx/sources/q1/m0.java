package q1;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends x0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35791f;

    public m0(int i11) {
        this.f35857a = g1.f35760a;
        this.f35858b = r1.a.f37529c;
        this.f35859c = i.f35766a;
        if (i11 >= 0) {
            d(g1.d(i11));
        } else {
            i4.a.f("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int c(int i11) {
        int i12 = this.f35860d;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f35857a;
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
        this.f35860d = iMax;
        if (iMax == 0) {
            jArr = g1.f35760a;
        } else {
            int i12 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i12];
            Arrays.fill(jArr2, 0, i12, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f35857a = jArr;
        int i13 = iMax >> 3;
        long j9 = 255 << ((iMax & 7) << 3);
        jArr[i13] = (jArr[i13] & (~j9)) | j9;
        this.f35791f = g1.a(this.f35860d) - this.f35861e;
        this.f35858b = new Object[iMax];
        this.f35859c = new float[iMax];
    }

    public final void e(int i11) {
        this.f35861e--;
        long[] jArr = this.f35857a;
        int i12 = this.f35860d;
        int i13 = i11 >> 3;
        int i14 = (i11 & 7) << 3;
        long j9 = (jArr[i13] & (~(255 << i14))) | (254 << i14);
        jArr[i13] = j9;
        jArr[(((i11 - 7) & i12) + (i12 & 7)) >> 3] = j9;
        this.f35858b[i11] = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0078, code lost:
    
        r20 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0083, code lost:
    
        if (((((~r9) << 6) & r9) & (-9187201950435737472L)) == 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0085, code lost:
    
        r2 = c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008d, code lost:
    
        if (r37.f35791f != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a1, code lost:
    
        if (((r37.f35857a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
    
        r23 = 255;
        r27 = r11;
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ad, code lost:
    
        r2 = r37.f35860d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00af, code lost:
    
        if (r2 <= 8) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b1, code lost:
    
        r3 = r37.f35861e;
        r18 = u70.c0.f40833b;
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c7, code lost:
    
        if (java.lang.Long.compareUnsigned(r3 * 32, ((long) r2) * 25) > 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c9, code lost:
    
        r2 = r37.f35857a;
        r3 = r37.f35860d;
        r4 = r37.f35858b;
        r6 = r37.f35859c;
        r7 = (r3 + 7) >> 3;
        r23 = 255;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d8, code lost:
    
        if (r8 >= r7) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00da, code lost:
    
        r10 = r2[r8] & r13;
        r2[r8] = (-72340172838076674L) & ((~r10) + (r10 >>> 7));
        r8 = r8 + 1;
        r11 = r11;
        r13 = -9187201950435737472L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f6, code lost:
    
        r27 = r11;
        r9 = 7;
        r7 = kotlin.collections.y.A(r2);
        r8 = r7 - 1;
        r12 = 72057594037927935L;
        r2[r8] = (r2[r8] & 72057594037927935L) | (-72057594037927936L);
        r2[r7] = r2[0];
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0112, code lost:
    
        if (r7 == r3) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0114, code lost:
    
        r8 = r7 >> 3;
        r14 = (r7 & 7) << 3;
        r10 = (r2[r8] >> r14) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0121, code lost:
    
        if (r10 != 128) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0123, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0128, code lost:
    
        if (r10 == 254) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012b, code lost:
    
        r10 = r4[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012d, code lost:
    
        if (r10 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012f, code lost:
    
        r10 = r10.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0134, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0135, code lost:
    
        r10 = r10 * r20;
        r10 = r10 ^ (r10 << 16);
        r11 = r10 >>> 7;
        r25 = c(r11);
        r11 = r11 & r3;
        r29 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0150, code lost:
    
        if ((((r25 - r11) & r3) / 8) != (((r7 - r11) & r3) / 8)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0152, code lost:
    
        r32 = r12;
        r2[r8] = (((long) (r10 & 127)) << r14) | (r2[r8] & (~(255 << r14)));
        r2[r2.length - 1] = (r2[0] & r32) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r9 = r29;
        r12 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0174, code lost:
    
        r32 = r12;
        r9 = r25 >> 3;
        r11 = r2[r9];
        r13 = (r25 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0184, code lost:
    
        if (((r11 >> r13) & 255) != 128) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0186, code lost:
    
        r26 = r3;
        r34 = r4;
        r2[r9] = ((~(255 << r13)) & r11) | (((long) (r10 & 127)) << r13);
        r2[r8] = (r2[r8] & (~(255 << r14))) | (128 << r14);
        r34[r25] = r34[r7];
        r34[r7] = null;
        r6[r25] = r6[r7];
        r6[r7] = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01b2, code lost:
    
        r26 = r3;
        r34 = r4;
        r2[r9] = ((~(255 << r13)) & r11) | (((long) (r10 & 127)) << r13);
        r3 = r34[r25];
        r34[r25] = r34[r7];
        r34[r7] = r3;
        r3 = r6[r25];
        r6[r25] = r6[r7];
        r6[r7] = r3;
        r7 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d6, code lost:
    
        r2[r2.length - 1] = (r2[0] & r32) | Long.MIN_VALUE;
        r7 = r7 + 1;
        r3 = r26;
        r9 = r29;
        r12 = r32;
        r4 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ed, code lost:
    
        r37.f35791f = q1.g1.a(r37.f35860d) - r37.f35861e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01fc, code lost:
    
        r23 = 255;
        r27 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0203, code lost:
    
        r18 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0206, code lost:
    
        r2 = q1.g1.b(r37.f35860d);
        r3 = r37.f35857a;
        r4 = r37.f35858b;
        r6 = r37.f35859c;
        r7 = r37.f35860d;
        d(r2);
        r2 = r37.f35857a;
        r8 = r37.f35858b;
        r9 = r37.f35859c;
        r10 = r37.f35860d;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0220, code lost:
    
        if (r11 >= r7) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x022f, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r18) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0231, code lost:
    
        r12 = r4[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0233, code lost:
    
        if (r12 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0235, code lost:
    
        r13 = r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x023a, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x023b, code lost:
    
        r13 = r13 * r20;
        r13 = r13 ^ (r13 << 16);
        r14 = c(r13 >>> 7);
        r17 = r2;
        r1 = r13 & 127;
        r13 = r14 >> 3;
        r21 = (r14 & 7) << 3;
        r1 = (r17[r13] & (~(255 << r21))) | (r1 << r21);
        r17[r13] = r1;
        r17[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r1;
        r8[r14] = r12;
        r9[r14] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0272, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0274, code lost:
    
        r11 = r11 + 1;
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x027b, code lost:
    
        r2 = c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x027f, code lost:
    
        r37.f35861e++;
        r1 = r37.f35791f;
        r3 = r37.f35857a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0297, code lost:
    
        if (((r5 >> r7) & r23) != r18) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0299, code lost:
    
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x029b, code lost:
    
        r37.f35791f = r1 - r15;
        r1 = r37.f35860d;
        r5 = (r5 & (~(r23 << r7))) | (r27 << r7);
        r3[r4] = r5;
        r3[(((r2 - 7) & r1) + (r1 & 7)) >> 3] = r5;
        r1 = ~r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.io.Serializable r38, float r39) {
        /*
            Method dump skipped, instruction units count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.m0.f(java.io.Serializable, float):void");
    }
}
