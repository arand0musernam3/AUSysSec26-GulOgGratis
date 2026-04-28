package q1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f35822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f35823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f35824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35826e;

    public final int a(long j9) {
        int iHashCode = Long.hashCode(j9) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f35825d;
        int i14 = (i11 >>> 7) & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f35822a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j11 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j12 = (((long) i12) * 72340172838076673L) ^ j11;
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (this.f35823b[iNumberOfTrailingZeros] == j9) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
        }
    }

    public final int b(long j9) {
        int iA = a(j9);
        if (iA >= 0) {
            return this.f35824c[iA];
        }
        qc.y.h(e0.f.i(j9, "Cannot find value for key "));
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof q1.s
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            q1.s r1 = (q1.s) r1
            int r3 = r1.f35826e
            int r5 = r0.f35826e
            if (r3 == r5) goto L17
            return r4
        L17:
            long[] r3 = r0.f35823b
            int[] r5 = r0.f35824c
            long[] r6 = r0.f35822a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7a
            r8 = r4
        L23:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L6f
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L3d:
            if (r13 >= r11) goto L69
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L5f
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r2
            r16 = r3
            r2 = r16[r14]
            r14 = r5[r14]
            int r2 = r1.a(r2)
            if (r2 < 0) goto L5e
            int[] r3 = r1.f35824c
            r2 = r3[r2]
            if (r14 == r2) goto L62
        L5e:
            return r4
        L5f:
            r15 = r2
            r16 = r3
        L62:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            r2 = r15
            r3 = r16
            goto L3d
        L69:
            r15 = r2
            r16 = r3
            if (r11 != r12) goto L7b
            goto L72
        L6f:
            r15 = r2
            r16 = r3
        L72:
            if (r8 == r7) goto L7b
            int r8 = r8 + 1
            r2 = r15
            r3 = r16
            goto L23
        L7a:
            r15 = r2
        L7b:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.s.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long[] jArr = this.f35823b;
        int[] iArr = this.f35824c;
        long[] jArr2 = this.f35822a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i11 = 0;
        int iHashCode = 0;
        while (true) {
            long j9 = jArr2[i11];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j9) < 128) {
                        int i14 = (i11 << 3) + i13;
                        long j11 = jArr[i14];
                        iHashCode += Integer.hashCode(iArr[i14]) ^ Long.hashCode(j11);
                    }
                    j9 >>= 8;
                }
                if (i12 != 8) {
                    return iHashCode;
                }
            }
            if (i11 == length) {
                return iHashCode;
            }
            i11++;
        }
    }

    public final String toString() {
        int i11;
        int i12;
        if (this.f35826e == 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        long[] jArr = this.f35823b;
        int[] iArr = this.f35824c;
        long[] jArr2 = this.f35822a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((255 & j9) < 128) {
                            int i17 = (i13 << 3) + i16;
                            i12 = i13;
                            long j11 = jArr[i17];
                            int i18 = iArr[i17];
                            sb2.append(j11);
                            sb2.append("=");
                            sb2.append(i18);
                            i14++;
                            if (i14 < this.f35826e) {
                                sb2.append(", ");
                            }
                        } else {
                            i12 = i13;
                        }
                        j9 >>= 8;
                        i16++;
                        i13 = i12;
                    }
                    int i19 = i13;
                    if (i15 != 8) {
                        break;
                    }
                    i11 = i19;
                } else {
                    i11 = i13;
                }
                if (i11 == length) {
                    break;
                }
                i13 = i11 + 1;
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
