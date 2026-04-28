package q1;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35759f;

    public g0(int i11) {
        this.f35798a = g1.f35760a;
        this.f35799b = r.f35817a;
        this.f35800c = r1.a.f37529c;
        if (i11 >= 0) {
            f(g1.d(i11));
        } else {
            i4.a.f("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.f35802e = 0;
        long[] jArr = this.f35798a;
        if (jArr != g1.f35760a) {
            kotlin.collections.x.n(jArr, -9187201950435737472L);
            long[] jArr2 = this.f35798a;
            int i11 = this.f35801d;
            int i12 = i11 >> 3;
            long j9 = 255 << ((i11 & 7) << 3);
            jArr2[i12] = (jArr2[i12] & (~j9)) | j9;
        }
        kotlin.collections.x.m(this.f35800c, 0, this.f35801d, null);
        this.f35759f = g1.a(this.f35801d) - this.f35802e;
    }

    public final int d(int i11) {
        long j9;
        long j11;
        int i12;
        long j12;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        Object[] objArr;
        int i13;
        int i14 = -862048943;
        int iHashCode = Integer.hashCode(i11) * (-862048943);
        int i15 = iHashCode ^ (iHashCode << 16);
        int i16 = i15 >>> 7;
        int i17 = i15 & 127;
        int i18 = this.f35801d;
        int i19 = i16 & i18;
        int i21 = 0;
        while (true) {
            long[] jArr3 = this.f35798a;
            int i22 = i19 >> 3;
            int i23 = (i19 & 7) << 3;
            int i24 = 1;
            long j13 = ((jArr3[i22 + 1] << (64 - i23)) & ((-i23) >> 63)) | (jArr3[i22] >>> i23);
            long j14 = i17;
            int i25 = i21;
            int i26 = 0;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L);
            while (j16 != 0) {
                int iNumberOfTrailingZeros = (i19 + (Long.numberOfTrailingZeros(j16) >> 3)) & i18;
                int i27 = i14;
                int i28 = i26;
                if (this.f35799b[iNumberOfTrailingZeros] == i11) {
                    return iNumberOfTrailingZeros;
                }
                j16 &= j16 - 1;
                i14 = i27;
                i26 = i28;
            }
            int i29 = i14;
            int i31 = i26;
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int iE = e(i16);
                long j17 = 255;
                if (this.f35759f != 0 || ((this.f35798a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j9 = 255;
                    j11 = j14;
                    i12 = 1;
                    j12 = 128;
                } else {
                    int i32 = this.f35801d;
                    if (i32 > 8) {
                        j12 = 128;
                        long j18 = this.f35802e;
                        u70.b0 b0Var = u70.c0.f40833b;
                        if (Long.compareUnsigned(j18 * 32, ((long) i32) * 25) <= 0) {
                            long[] jArr4 = this.f35798a;
                            int i33 = this.f35801d;
                            int[] iArr2 = this.f35799b;
                            Object[] objArr2 = this.f35800c;
                            int i34 = (i33 + 7) >> 3;
                            int i35 = i31;
                            while (i35 < i34) {
                                long j19 = j17;
                                long j21 = jArr4[i35] & (-9187201950435737472L);
                                jArr4[i35] = (-72340172838076674L) & ((~j21) + (j21 >>> 7));
                                i35++;
                                j14 = j14;
                                j17 = j19;
                            }
                            j9 = j17;
                            j11 = j14;
                            int iA = kotlin.collections.y.A(jArr4);
                            int i36 = iA - 1;
                            long j22 = 72057594037927935L;
                            jArr4[i36] = (jArr4[i36] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iA] = jArr4[i31];
                            int i37 = i31;
                            while (i37 != i33) {
                                int i38 = i37 >> 3;
                                int i39 = (i37 & 7) << 3;
                                long j23 = (jArr4[i38] >> i39) & j9;
                                if (j23 != 128 && j23 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i37]) * i29;
                                    int i41 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i42 = i41 >>> 7;
                                    int iE2 = e(i42);
                                    int i43 = i42 & i33;
                                    if (((iE2 - i43) & i33) / 8 == ((i37 - i43) & i33) / 8) {
                                        long j24 = j22;
                                        jArr4[i38] = (((long) (i41 & 127)) << i39) | ((~(j9 << i39)) & jArr4[i38]);
                                        jArr4[jArr4.length - i24] = (jArr4[i31] & j24) | Long.MIN_VALUE;
                                        i37++;
                                        j22 = j24;
                                    } else {
                                        long j25 = j22;
                                        int i44 = iE2 >> 3;
                                        long j26 = jArr4[i44];
                                        int i45 = (iE2 & 7) << 3;
                                        if (((j26 >> i45) & j9) == 128) {
                                            i13 = i24;
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr4[i44] = ((~(j9 << i45)) & j26) | (((long) (i41 & 127)) << i45);
                                            jArr4[i38] = (jArr4[i38] & (~(j9 << i39))) | (128 << i39);
                                            iArr[iE2] = iArr[i37];
                                            iArr[i37] = i31;
                                            objArr[iE2] = objArr[i37];
                                            objArr[i37] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            i13 = i24;
                                            jArr4[i44] = (((long) (i41 & 127)) << i45) | ((~(j9 << i45)) & j26);
                                            int i46 = iArr[iE2];
                                            iArr[iE2] = iArr[i37];
                                            iArr[i37] = i46;
                                            Object obj = objArr[iE2];
                                            objArr[iE2] = objArr[i37];
                                            objArr[i37] = obj;
                                            i37--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i31] & j25) | Long.MIN_VALUE;
                                        i37++;
                                        j22 = j25;
                                        i24 = i13;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i37++;
                                }
                            }
                            i12 = i24;
                            this.f35759f = g1.a(this.f35801d) - this.f35802e;
                        }
                        iE = e(i16);
                    } else {
                        j12 = 128;
                    }
                    j9 = 255;
                    j11 = j14;
                    i12 = 1;
                    int iB = g1.b(this.f35801d);
                    long[] jArr5 = this.f35798a;
                    int[] iArr3 = this.f35799b;
                    Object[] objArr3 = this.f35800c;
                    int i47 = this.f35801d;
                    f(iB);
                    long[] jArr6 = this.f35798a;
                    int[] iArr4 = this.f35799b;
                    Object[] objArr4 = this.f35800c;
                    int i48 = this.f35801d;
                    int i49 = i31;
                    while (i49 < i47) {
                        if (((jArr5[i49 >> 3] >> ((i49 & 7) << 3)) & 255) < j12) {
                            int i51 = iArr3[i49];
                            int iHashCode3 = Integer.hashCode(i51) * i29;
                            int i52 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i52 >>> 7);
                            long j27 = i52 & 127;
                            int i53 = iE3 >> 3;
                            int i54 = (iE3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j28 = (jArr6[i53] & (~(255 << i54))) | (j27 << i54);
                            jArr[i53] = j28;
                            jArr[(((iE3 - 7) & i48) + (i48 & 7)) >> 3] = j28;
                            iArr4[iE3] = i51;
                            objArr4[iE3] = objArr3[i49];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i49++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iE = e(i16);
                }
                this.f35802e++;
                int i55 = this.f35759f;
                long[] jArr7 = this.f35798a;
                int i56 = iE >> 3;
                long j29 = jArr7[i56];
                int i57 = (iE & 7) << 3;
                if (((j29 >> i57) & j9) != j12) {
                    i12 = i31;
                }
                this.f35759f = i55 - i12;
                int i58 = this.f35801d;
                long j31 = (j29 & (~(j9 << i57))) | (j11 << i57);
                jArr7[i56] = j31;
                jArr7[(((iE - 7) & i58) + (i58 & 7)) >> 3] = j31;
                return iE;
            }
            i21 = i25 + 8;
            i19 = (i19 + i21) & i18;
            i14 = i29;
        }
    }

    public final int e(int i11) {
        int i12 = this.f35801d;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f35798a;
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

    public final void f(int i11) {
        long[] jArr;
        int iMax = i11 > 0 ? Math.max(7, g1.c(i11)) : 0;
        this.f35801d = iMax;
        if (iMax == 0) {
            jArr = g1.f35760a;
        } else {
            int i12 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i12];
            Arrays.fill(jArr2, 0, i12, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f35798a = jArr;
        int i13 = iMax >> 3;
        long j9 = 255 << ((iMax & 7) << 3);
        jArr[i13] = (jArr[i13] & (~j9)) | j9;
        this.f35759f = g1.a(this.f35801d) - this.f35802e;
        this.f35799b = new int[iMax];
        this.f35800c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f35801d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.f35798a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f35799b
            r11 = r11[r10]
            if (r11 != r14) goto L54
            goto L64
        L54:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6d
            r10 = -1
        L64:
            if (r10 < 0) goto L6b
            java.lang.Object r14 = r13.h(r10)
            return r14
        L6b:
            r14 = 0
            return r14
        L6d:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.g0.g(int):java.lang.Object");
    }

    public final Object h(int i11) {
        this.f35802e--;
        long[] jArr = this.f35798a;
        int i12 = this.f35801d;
        int i13 = i11 >> 3;
        int i14 = (i11 & 7) << 3;
        long j9 = (jArr[i13] & (~(255 << i14))) | (254 << i14);
        jArr[i13] = j9;
        jArr[(((i11 - 7) & i12) + (i12 & 7)) >> 3] = j9;
        Object[] objArr = this.f35800c;
        Object obj = objArr[i11];
        objArr[i11] = null;
        return obj;
    }

    public final void i(int i11, Object obj) {
        int iD = d(i11);
        this.f35799b[iD] = i11;
        this.f35800c[iD] = obj;
    }

    public /* synthetic */ g0() {
        this(6);
    }
}
