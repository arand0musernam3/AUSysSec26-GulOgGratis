package q1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends d1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f35805h;

    public p0(int i11) {
        this.f35737a = g1.f35760a;
        this.f35738b = r1.a.f37529c;
        this.f35739c = a0.f35711b;
        this.f35740d = Integer.MAX_VALUE;
        this.f35741e = Integer.MAX_VALUE;
        if (i11 >= 0) {
            f(g1.d(i11));
        } else {
            i4.a.f("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean b(Object obj) {
        int i11 = this.f35743g;
        int iD = d(obj);
        this.f35738b[iD] = obj;
        long[] jArr = this.f35739c;
        int i12 = this.f35740d;
        jArr[iD] = (((long) i12) & 2147483647L) | 4611686016279904256L;
        if (i12 != Integer.MAX_VALUE) {
            jArr[i12] = ((((long) iD) & 2147483647L) << 31) | (jArr[i12] & (-4611686016279904257L));
        }
        this.f35740d = iD;
        if (this.f35741e == Integer.MAX_VALUE) {
            this.f35741e = iD;
        }
        return this.f35743g != i11;
    }

    public final void c() {
        this.f35743g = 0;
        long[] jArr = this.f35737a;
        if (jArr != g1.f35760a) {
            kotlin.collections.x.n(jArr, -9187201950435737472L);
            long[] jArr2 = this.f35737a;
            int i11 = this.f35742f;
            int i12 = i11 >> 3;
            long j9 = 255 << ((i11 & 7) << 3);
            jArr2[i12] = (jArr2[i12] & (~j9)) | j9;
        }
        kotlin.collections.x.m(this.f35738b, 0, this.f35742f, null);
        kotlin.collections.x.n(this.f35739c, 4611686018427387903L);
        this.f35740d = Integer.MAX_VALUE;
        this.f35741e = Integer.MAX_VALUE;
        this.f35805h = g1.a(this.f35742f) - this.f35743g;
    }

    public final int d(Object obj) {
        int i11;
        long j9;
        long j11;
        long j12;
        char c3;
        long[] jArr;
        long[] jArr2;
        long j13;
        int i12 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f35742f;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr3 = this.f35737a;
            int i19 = i17 >> 3;
            int i21 = (i17 & 7) << 3;
            long j14 = ((jArr3[i19 + 1] << (64 - i21)) & ((-i21) >> 63)) | (jArr3[i19] >>> i21);
            long j15 = i15;
            long j16 = j14 ^ (j15 * 72340172838076673L);
            long j17 = (j16 - 72340172838076673L) & (~j16) & (-9187201950435737472L);
            while (j17 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j17) >> 3) + i17) & i16;
                int i22 = i12;
                if (Intrinsics.areEqual(this.f35738b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j17 &= j17 - 1;
                i12 = i22;
            }
            int i23 = i12;
            if ((j14 & ((~j14) << 6) & (-9187201950435737472L)) != 0) {
                int iE = e(i14);
                long j18 = 255;
                if (this.f35805h != 0 || ((this.f35737a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    i11 = 0;
                    j9 = j15;
                    j11 = 255;
                    j12 = 128;
                } else {
                    int i24 = this.f35742f;
                    if (i24 > 8) {
                        c3 = 31;
                        long j19 = this.f35743g;
                        u70.b0 b0Var = u70.c0.f40833b;
                        j12 = 128;
                        if (Long.compareUnsigned(j19 * 32, ((long) i24) * 25) <= 0) {
                            long[] jArr4 = this.f35737a;
                            if (jArr4 == null) {
                                i11 = 0;
                                j9 = j15;
                                j11 = 255;
                            } else {
                                int i25 = this.f35742f;
                                Object[] objArr = this.f35738b;
                                long[] jArr5 = this.f35739c;
                                long[] jArr6 = new long[i25];
                                Arrays.fill(jArr6, 0, i25, 9223372034707292159L);
                                i11 = 0;
                                int i26 = (i25 + 7) >> 3;
                                int i27 = 0;
                                while (i27 < i26) {
                                    long j21 = j18;
                                    long j22 = jArr4[i27] & (-9187201950435737472L);
                                    int i28 = i27;
                                    jArr4[i28] = ((~j22) + (j22 >>> 7)) & (-72340172838076674L);
                                    i27 = i28 + 1;
                                    j18 = j21;
                                }
                                j11 = j18;
                                int length = jArr4.length;
                                int i29 = length - 1;
                                int i31 = length - 2;
                                jArr4[i31] = (jArr4[i31] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i29] = jArr4[0];
                                int i32 = 0;
                                while (i32 != i25) {
                                    int i33 = i32 >> 3;
                                    int i34 = (i32 & 7) << 3;
                                    long j23 = (jArr4[i33] >> i34) & j11;
                                    if (j23 != 128 && j23 == 254) {
                                        Object obj2 = objArr[i32];
                                        int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i23;
                                        int i35 = iHashCode2 ^ (iHashCode2 << 16);
                                        int i36 = i35 >>> 7;
                                        int iE2 = e(i36);
                                        int i37 = i36 & i25;
                                        if (((iE2 - i37) & i25) / 8 == ((i32 - i37) & i25) / 8) {
                                            int i38 = i25;
                                            Object[] objArr2 = objArr;
                                            jArr4[i33] = (jArr4[i33] & (~(j11 << i34))) | (((long) (i35 & 127)) << i34);
                                            if (jArr6[i32] == 9223372034707292159L) {
                                                long j24 = i32;
                                                jArr6[i32] = j24 | (j24 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i32++;
                                            i25 = i38;
                                            objArr = objArr2;
                                        } else {
                                            int i39 = i25;
                                            Object[] objArr3 = objArr;
                                            int i41 = iE2 >> 3;
                                            long j25 = jArr4[i41];
                                            int i42 = (iE2 & 7) << 3;
                                            if (((j25 >> i42) & j11) == 128) {
                                                jArr4[i41] = (j25 & (~(j11 << i42))) | (((long) (i35 & 127)) << i42);
                                                jArr4[i33] = (jArr4[i33] & (~(j11 << i34))) | (128 << i34);
                                                objArr3[iE2] = objArr3[i32];
                                                objArr3[i32] = null;
                                                jArr5[iE2] = jArr5[i32];
                                                jArr5[i32] = 4611686018427387903L;
                                                int i43 = (int) ((jArr6[i32] >> 32) & 4294967295L);
                                                int i44 = Integer.MAX_VALUE;
                                                if (i43 != Integer.MAX_VALUE) {
                                                    j13 = j15;
                                                    jArr6[i43] = ((long) iE2) | (jArr6[i43] & (-4294967296L));
                                                    jArr6[i32] = (jArr6[i32] & 4294967295L) | (-4294967296L);
                                                    i44 = Integer.MAX_VALUE;
                                                } else {
                                                    j13 = j15;
                                                    jArr6[i32] = (((long) Integer.MAX_VALUE) << 32) | ((long) iE2);
                                                }
                                                jArr6[iE2] = (((long) i32) << 32) | ((long) i44);
                                            } else {
                                                j13 = j15;
                                                jArr4[i41] = (((long) (i35 & 127)) << i42) | (j25 & (~(j11 << i42)));
                                                Object obj3 = objArr3[iE2];
                                                objArr3[iE2] = objArr3[i32];
                                                objArr3[i32] = obj3;
                                                long j26 = jArr5[iE2];
                                                jArr5[iE2] = jArr5[i32];
                                                jArr5[i32] = j26;
                                                int i45 = (int) ((jArr6[i32] >> 32) & 4294967295L);
                                                if (i45 != Integer.MAX_VALUE) {
                                                    long j27 = iE2;
                                                    jArr6[i45] = (jArr6[i45] & (-4294967296L)) | j27;
                                                    jArr6[i32] = (jArr6[i32] & 4294967295L) | (j27 << 32);
                                                } else {
                                                    long j28 = iE2;
                                                    jArr6[i32] = j28 | (j28 << 32);
                                                    i45 = i32;
                                                }
                                                jArr6[iE2] = (((long) i45) << 32) | ((long) i32);
                                                i32--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i32++;
                                            i25 = i39;
                                            objArr = objArr3;
                                            j15 = j13;
                                        }
                                    } else {
                                        i32++;
                                    }
                                }
                                j9 = j15;
                                this.f35805h = g1.a(this.f35742f) - this.f35743g;
                                long[] jArr7 = this.f35739c;
                                int length2 = jArr7.length;
                                for (int i46 = 0; i46 < length2; i46++) {
                                    long j29 = jArr7[i46];
                                    int i47 = (int) ((j29 >> 31) & 2147483647L);
                                    int i48 = (int) (j29 & 2147483647L);
                                    jArr7[i46] = (((j29 & (-4611686018427387904L)) | ((long) (i47 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[i47] & 4294967295L)))) << 31) | ((long) (i48 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[i48] & 4294967295L)));
                                }
                                int i49 = this.f35740d;
                                if (i49 != Integer.MAX_VALUE) {
                                    this.f35740d = (int) (jArr6[i49] & 4294967295L);
                                }
                                int i51 = this.f35741e;
                                if (i51 != Integer.MAX_VALUE) {
                                    this.f35741e = (int) (jArr6[i51] & 4294967295L);
                                }
                            }
                        }
                        iE = e(i14);
                    } else {
                        c3 = 31;
                        j12 = 128;
                    }
                    i11 = 0;
                    j9 = j15;
                    j11 = 255;
                    int iB = g1.b(this.f35742f);
                    long[] jArr8 = this.f35737a;
                    Object[] objArr4 = this.f35738b;
                    long[] jArr9 = this.f35739c;
                    int i52 = this.f35742f;
                    int[] iArr = new int[i52];
                    f(iB);
                    long[] jArr10 = this.f35737a;
                    Object[] objArr5 = this.f35738b;
                    long[] jArr11 = this.f35739c;
                    int i53 = this.f35742f;
                    int i54 = 0;
                    while (i54 < i52) {
                        if (((jArr8[i54 >> 3] >> ((i54 & 7) << 3)) & 255) < j12) {
                            Object obj4 = objArr4[i54];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i23;
                            int i55 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i55 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j31 = i55 & 127;
                            int i56 = iE3 >> 3;
                            int i57 = (iE3 & 7) << 3;
                            long j32 = (jArr[i56] & (~(255 << i57))) | (j31 << i57);
                            jArr[i56] = j32;
                            jArr[(((iE3 - 7) & i53) + (i53 & 7)) >> 3] = j32;
                            objArr5[iE3] = obj4;
                            jArr11[iE3] = jArr9[i54];
                            iArr[i54] = iE3;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i54++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.f35739c;
                    int length3 = jArr12.length;
                    for (int i58 = 0; i58 < length3; i58++) {
                        long j33 = jArr12[i58];
                        int i59 = (int) ((j33 >> c3) & 2147483647L);
                        int i61 = (int) (j33 & 2147483647L);
                        jArr12[i58] = (((j33 & (-4611686018427387904L)) | ((long) (i59 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i59]))) << c3) | ((long) (i61 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i61]));
                    }
                    int i62 = this.f35740d;
                    if (i62 != Integer.MAX_VALUE) {
                        this.f35740d = iArr[i62];
                    }
                    int i63 = this.f35741e;
                    if (i63 != Integer.MAX_VALUE) {
                        this.f35741e = iArr[i63];
                    }
                    iE = e(i14);
                }
                this.f35743g++;
                int i64 = this.f35805h;
                long[] jArr13 = this.f35737a;
                int i65 = iE >> 3;
                long j34 = jArr13[i65];
                int i66 = (iE & 7) << 3;
                if (((j34 >> i66) & j11) == j12) {
                    i11 = 1;
                }
                this.f35805h = i64 - i11;
                int i67 = this.f35742f;
                long j35 = (j34 & (~(j11 << i66))) | (j9 << i66);
                jArr13[i65] = j35;
                jArr13[(((iE - 7) & i67) + (i67 & 7)) >> 3] = j35;
                return iE;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
            i12 = i23;
        }
    }

    public final int e(int i11) {
        int i12 = this.f35742f;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f35737a;
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
        long[] jArr2;
        int iMax = i11 > 0 ? Math.max(7, g1.c(i11)) : 0;
        this.f35742f = iMax;
        if (iMax == 0) {
            jArr = g1.f35760a;
        } else {
            int i12 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr3 = new long[i12];
            Arrays.fill(jArr3, 0, i12, -9187201950435737472L);
            jArr = jArr3;
        }
        this.f35737a = jArr;
        int i13 = iMax >> 3;
        long j9 = 255 << ((iMax & 7) << 3);
        jArr[i13] = (jArr[i13] & (~j9)) | j9;
        this.f35805h = g1.a(this.f35742f) - this.f35743g;
        this.f35738b = iMax == 0 ? r1.a.f37529c : new Object[iMax];
        if (iMax == 0) {
            jArr2 = a0.f35711b;
        } else {
            long[] jArr4 = new long[iMax];
            Arrays.fill(jArr4, 0, iMax, 4611686018427387903L);
            jArr2 = jArr4;
        }
        this.f35739c = jArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f35742f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f35737a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f35738b
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.h(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.p0.g(java.lang.Object):boolean");
    }

    public final void h(int i11) {
        this.f35743g--;
        long[] jArr = this.f35737a;
        int i12 = this.f35742f;
        int i13 = i11 >> 3;
        int i14 = (i11 & 7) << 3;
        long j9 = (jArr[i13] & (~(255 << i14))) | (254 << i14);
        jArr[i13] = j9;
        jArr[(((i11 - 7) & i12) + (i12 & 7)) >> 3] = j9;
        this.f35738b[i11] = null;
        long[] jArr2 = this.f35739c;
        long j11 = jArr2[i11];
        int i15 = (int) ((j11 >> 31) & 2147483647L);
        int i16 = (int) (j11 & 2147483647L);
        if (i15 != Integer.MAX_VALUE) {
            jArr2[i15] = (jArr2[i15] & (-2147483648L)) | (((long) i16) & 2147483647L);
        } else {
            this.f35740d = i16;
        }
        if (i16 != Integer.MAX_VALUE) {
            jArr2[i16] = ((((long) i15) & 2147483647L) << 31) | (jArr2[i16] & (-4611686016279904257L));
        } else {
            this.f35741e = i15;
        }
        jArr2[i11] = 4611686018427387903L;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(java.util.Collection r17) {
        /*
            r16 = this;
            r0 = r16
            r17.getClass()
            java.lang.Object[] r1 = r0.f35738b
            int r2 = r0.f35743g
            long[] r3 = r0.f35737a
            int r4 = r3.length
            int r4 = r4 + (-2)
            r5 = 0
            if (r4 < 0) goto L54
            r6 = r5
        L12:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L4f
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r5
        L2c:
            if (r11 >= r9) goto L4d
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L49
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r17
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            r14 = r1[r12]
            boolean r13 = kotlin.collections.CollectionsKt.I(r13, r14)
            if (r13 != 0) goto L49
            r0.h(r12)
        L49:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L2c
        L4d:
            if (r9 != r10) goto L54
        L4f:
            if (r6 == r4) goto L54
            int r6 = r6 + 1
            goto L12
        L54:
            int r1 = r0.f35743g
            if (r2 == r1) goto L5a
            r1 = 1
            return r1
        L5a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.p0.i(java.util.Collection):boolean");
    }
}
