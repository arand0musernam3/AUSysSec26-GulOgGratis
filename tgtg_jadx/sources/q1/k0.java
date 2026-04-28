package q1;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35779f;

    public k0(int i11) {
        this.f35834a = g1.f35760a;
        this.f35835b = y.f35862a;
        this.f35836c = r1.a.f37529c;
        if (i11 >= 0) {
            f(g1.d(i11));
        } else {
            i4.a.f("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.f35838e = 0;
        long[] jArr = this.f35834a;
        if (jArr != g1.f35760a) {
            kotlin.collections.x.n(jArr, -9187201950435737472L);
            long[] jArr2 = this.f35834a;
            int i11 = this.f35837d;
            int i12 = i11 >> 3;
            long j9 = 255 << ((i11 & 7) << 3);
            jArr2[i12] = (jArr2[i12] & (~j9)) | j9;
        }
        kotlin.collections.x.m(this.f35836c, 0, this.f35837d, null);
        this.f35779f = g1.a(this.f35837d) - this.f35838e;
    }

    public final int d(long j9) {
        long j11;
        long j12;
        int i11;
        int i12;
        long j13;
        long[] jArr;
        long[] jArr2;
        long j14;
        Object[] objArr;
        int i13;
        long[] jArr3;
        int i14 = -862048943;
        int iHashCode = Long.hashCode(j9) * (-862048943);
        int i15 = iHashCode ^ (iHashCode << 16);
        int i16 = i15 >>> 7;
        int i17 = i15 & 127;
        int i18 = this.f35837d;
        int i19 = i16 & i18;
        int i21 = 0;
        while (true) {
            long[] jArr4 = this.f35834a;
            int i22 = i19 >> 3;
            int i23 = (i19 & 7) << 3;
            int i24 = 1;
            long j15 = ((jArr4[i22 + 1] << (64 - i23)) & ((-i23) >> 63)) | (jArr4[i22] >>> i23);
            long j16 = i17;
            int i25 = i21;
            int i26 = 0;
            long j17 = j15 ^ (j16 * 72340172838076673L);
            long j18 = (~j17) & (j17 - 72340172838076673L) & (-9187201950435737472L);
            while (j18 != 0) {
                int iNumberOfTrailingZeros = (i19 + (Long.numberOfTrailingZeros(j18) >> 3)) & i18;
                int i27 = i14;
                if (this.f35835b[iNumberOfTrailingZeros] == j9) {
                    return iNumberOfTrailingZeros;
                }
                j18 &= j18 - 1;
                i14 = i27;
            }
            int i28 = i14;
            if ((((~j15) << 6) & j15 & (-9187201950435737472L)) != 0) {
                int iE = e(i16);
                if (this.f35779f != 0 || ((this.f35834a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j11 = 255;
                    j12 = j16;
                    i11 = 0;
                    i12 = 1;
                    j13 = 128;
                } else {
                    int i29 = this.f35837d;
                    if (i29 > 8) {
                        j13 = 128;
                        long j19 = this.f35838e;
                        u70.b0 b0Var = u70.c0.f40833b;
                        if (Long.compareUnsigned(j19 * 32, ((long) i29) * 25) <= 0) {
                            long[] jArr5 = this.f35834a;
                            int i31 = this.f35837d;
                            long[] jArr6 = this.f35835b;
                            Object[] objArr2 = this.f35836c;
                            int i32 = (i31 + 7) >> 3;
                            j11 = 255;
                            int i33 = 0;
                            while (i33 < i32) {
                                long j21 = jArr5[i33] & (-9187201950435737472L);
                                jArr5[i33] = (-72340172838076674L) & ((~j21) + (j21 >>> 7));
                                i33++;
                                i24 = i24;
                                i26 = i26;
                                j16 = j16;
                            }
                            j12 = j16;
                            i11 = i26;
                            int i34 = i24;
                            char c3 = 7;
                            int iA = kotlin.collections.y.A(jArr5);
                            int i35 = iA - 1;
                            long j22 = 72057594037927935L;
                            jArr5[i35] = (jArr5[i35] & 72057594037927935L) | (-72057594037927936L);
                            jArr5[iA] = jArr5[i11];
                            int i36 = i11;
                            while (i36 != i31) {
                                int i37 = i36 >> 3;
                                int i38 = (i36 & 7) << 3;
                                long j23 = (jArr5[i37] >> i38) & 255;
                                if (j23 != 128 && j23 == 254) {
                                    int iHashCode2 = Long.hashCode(jArr6[i36]) * i28;
                                    int i39 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i41 = i39 >>> 7;
                                    int iE2 = e(i41);
                                    int i42 = i41 & i31;
                                    char c7 = c3;
                                    if (((iE2 - i42) & i31) / 8 == ((i36 - i42) & i31) / 8) {
                                        int i43 = i34;
                                        j14 = j22;
                                        jArr5[i37] = (((long) (i39 & 127)) << i38) | (jArr5[i37] & (~(255 << i38)));
                                        jArr5[jArr5.length - i43] = (jArr5[i11] & j14) | Long.MIN_VALUE;
                                        i36++;
                                        i34 = i43;
                                        c3 = c7;
                                    } else {
                                        int i44 = i34;
                                        j14 = j22;
                                        int i45 = iE2 >> 3;
                                        long j24 = jArr5[i45];
                                        int i46 = (iE2 & 7) << 3;
                                        if (((j24 >> i46) & 255) == 128) {
                                            i13 = i44;
                                            jArr3 = jArr6;
                                            objArr = objArr2;
                                            jArr5[i45] = (j24 & (~(255 << i46))) | (((long) (i39 & 127)) << i46);
                                            jArr5[i37] = (jArr5[i37] & (~(255 << i38))) | (128 << i38);
                                            jArr3[iE2] = jArr3[i36];
                                            jArr3[i36] = 0;
                                            objArr[iE2] = objArr[i36];
                                            objArr[i36] = null;
                                        } else {
                                            objArr = objArr2;
                                            i13 = i44;
                                            jArr3 = jArr6;
                                            jArr5[i45] = (((long) (i39 & 127)) << i46) | (j24 & (~(255 << i46)));
                                            long j25 = jArr3[iE2];
                                            jArr3[iE2] = jArr3[i36];
                                            jArr3[i36] = j25;
                                            Object obj = objArr[iE2];
                                            objArr[iE2] = objArr[i36];
                                            objArr[i36] = obj;
                                            i36--;
                                        }
                                        jArr5[jArr5.length - 1] = (jArr5[i11] & j14) | Long.MIN_VALUE;
                                        i36++;
                                        jArr6 = jArr3;
                                        i34 = i13;
                                        c3 = c7;
                                        objArr2 = objArr;
                                    }
                                    j22 = j14;
                                } else {
                                    i36++;
                                }
                            }
                            i12 = i34;
                            this.f35779f = g1.a(this.f35837d) - this.f35838e;
                        }
                        iE = e(i16);
                    } else {
                        j13 = 128;
                    }
                    j11 = 255;
                    j12 = j16;
                    i11 = 0;
                    i12 = 1;
                    int iB = g1.b(this.f35837d);
                    long[] jArr7 = this.f35834a;
                    long[] jArr8 = this.f35835b;
                    Object[] objArr3 = this.f35836c;
                    int i47 = this.f35837d;
                    f(iB);
                    long[] jArr9 = this.f35834a;
                    long[] jArr10 = this.f35835b;
                    Object[] objArr4 = this.f35836c;
                    int i48 = this.f35837d;
                    int i49 = 0;
                    while (i49 < i47) {
                        if (((jArr7[i49 >> 3] >> ((i49 & 7) << 3)) & 255) < j13) {
                            long j26 = jArr8[i49];
                            int iHashCode3 = Long.hashCode(j26) * i28;
                            int i51 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i51 >>> 7);
                            jArr = jArr9;
                            jArr2 = jArr7;
                            long j27 = i51 & 127;
                            int i52 = iE3 >> 3;
                            int i53 = (iE3 & 7) << 3;
                            long j28 = (jArr[i52] & (~(255 << i53))) | (j27 << i53);
                            jArr[i52] = j28;
                            jArr[(((iE3 - 7) & i48) + (i48 & 7)) >> 3] = j28;
                            jArr10[iE3] = j26;
                            objArr4[iE3] = objArr3[i49];
                        } else {
                            jArr = jArr9;
                            jArr2 = jArr7;
                        }
                        i49++;
                        jArr7 = jArr2;
                        jArr9 = jArr;
                    }
                    iE = e(i16);
                }
                this.f35838e++;
                int i54 = this.f35779f;
                long[] jArr11 = this.f35834a;
                int i55 = iE >> 3;
                long j29 = jArr11[i55];
                int i56 = (iE & 7) << 3;
                if (((j29 >> i56) & j11) != j13) {
                    i12 = i11;
                }
                this.f35779f = i54 - i12;
                int i57 = this.f35837d;
                long j31 = (j29 & (~(j11 << i56))) | (j12 << i56);
                jArr11[i55] = j31;
                jArr11[(((iE - 7) & i57) + (i57 & 7)) >> 3] = j31;
                return iE;
            }
            i21 = i25 + 8;
            i19 = (i19 + i21) & i18;
            i14 = i28;
        }
    }

    public final int e(int i11) {
        int i12 = this.f35837d;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f35834a;
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
        this.f35837d = iMax;
        if (iMax == 0) {
            jArr = g1.f35760a;
        } else {
            int i12 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i12];
            Arrays.fill(jArr2, 0, i12, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f35834a = jArr;
        int i13 = iMax >> 3;
        long j9 = 255 << ((iMax & 7) << 3);
        jArr[i13] = (jArr[i13] & (~j9)) | j9;
        this.f35779f = g1.a(this.f35837d) - this.f35838e;
        this.f35835b = new long[iMax];
        this.f35836c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(long r15) {
        /*
            r14 = this;
            int r0 = java.lang.Long.hashCode(r15)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r14.f35837d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r14.f35834a
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
            if (r12 == 0) goto L5c
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            long[] r11 = r14.f35835b
            r12 = r11[r10]
            int r11 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r11 != 0) goto L56
            goto L66
        L56:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5c:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L99
            r10 = -1
        L66:
            r0 = 0
            if (r10 < 0) goto L98
            int r1 = r14.f35838e
            int r1 = r1 + (-1)
            r14.f35838e = r1
            long[] r1 = r14.f35834a
            int r2 = r14.f35837d
            int r3 = r10 >> 3
            r4 = r10 & 7
            int r4 = r4 << 3
            r5 = r1[r3]
            r7 = 255(0xff, double:1.26E-321)
            long r7 = r7 << r4
            long r7 = ~r7
            long r5 = r5 & r7
            r7 = 254(0xfe, double:1.255E-321)
            long r7 = r7 << r4
            long r4 = r5 | r7
            r1[r3] = r4
            int r3 = r10 + (-7)
            r3 = r3 & r2
            r2 = r2 & 7
            int r3 = r3 + r2
            int r2 = r3 >> 3
            r1[r2] = r4
            java.lang.Object[] r1 = r14.f35836c
            r2 = r1[r10]
            r1[r10] = r0
            return r2
        L98:
            return r0
        L99:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.k0.g(long):java.lang.Object");
    }

    public final void h(long j9, Object obj) {
        int iD = d(j9);
        this.f35835b[iD] = j9;
        this.f35836c[iD] = obj;
    }

    public /* synthetic */ k0() {
        this(6);
    }
}
