package q1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends i1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35833e;

    public u0(int i11) {
        this.f35768a = g1.f35760a;
        this.f35769b = r1.a.f37529c;
        if (i11 >= 0) {
            h(g1.d(i11));
        } else {
            i4.a.f("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean d(Object obj) {
        int i11 = this.f35771d;
        this.f35769b[f(obj)] = obj;
        return this.f35771d != i11;
    }

    public final void e() {
        this.f35771d = 0;
        long[] jArr = this.f35768a;
        if (jArr != g1.f35760a) {
            kotlin.collections.x.n(jArr, -9187201950435737472L);
            long[] jArr2 = this.f35768a;
            int i11 = this.f35770c;
            int i12 = i11 >> 3;
            long j9 = 255 << ((i11 & 7) << 3);
            jArr2[i12] = (jArr2[i12] & (~j9)) | j9;
        }
        kotlin.collections.x.m(this.f35769b, 0, this.f35770c, null);
        this.f35833e = g1.a(this.f35770c) - this.f35771d;
    }

    public final int f(Object obj) {
        long j9;
        long j11;
        long j12;
        long[] jArr;
        long[] jArr2;
        int i11;
        Object[] objArr;
        int i12;
        int i13 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = this.f35770c;
        int i18 = i15 & i17;
        int i19 = 0;
        while (true) {
            long[] jArr3 = this.f35768a;
            int i21 = i18 >> 3;
            int i22 = (i18 & 7) << 3;
            long j13 = ((jArr3[i21 + 1] << (64 - i22)) & ((-i22) >> 63)) | (jArr3[i21] >>> i22);
            long j14 = i16;
            int i23 = i16;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L);
            while (j16 != 0) {
                int iNumberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j16) >> 3)) & i17;
                int i24 = i13;
                if (Intrinsics.areEqual(this.f35769b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j16 &= j16 - 1;
                i13 = i24;
            }
            int i25 = i13;
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int iG = g(i15);
                long j17 = 255;
                if (this.f35833e != 0 || ((this.f35768a[iG >> 3] >> ((iG & 7) << 3)) & 255) == 254) {
                    j9 = 255;
                    j11 = j14;
                    j12 = 128;
                } else {
                    int i26 = this.f35770c;
                    if (i26 > 8) {
                        int i27 = 8;
                        long j18 = this.f35771d;
                        u70.b0 b0Var = u70.c0.f40833b;
                        if (Long.compareUnsigned(j18 * 32, ((long) i26) * 25) <= 0) {
                            long[] jArr4 = this.f35768a;
                            int i28 = this.f35770c;
                            Object[] objArr2 = this.f35769b;
                            int i29 = (i28 + 7) >> 3;
                            int i31 = 0;
                            j12 = 128;
                            while (i31 < i29) {
                                long j19 = j17;
                                long j21 = jArr4[i31] & (-9187201950435737472L);
                                jArr4[i31] = (-72340172838076674L) & ((~j21) + (j21 >>> 7));
                                i31++;
                                i27 = i27;
                                j14 = j14;
                                j17 = j19;
                            }
                            j9 = j17;
                            j11 = j14;
                            int i32 = i27;
                            int iA = kotlin.collections.y.A(jArr4);
                            int i33 = iA - 1;
                            long j22 = 72057594037927935L;
                            jArr4[i33] = (jArr4[i33] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iA] = jArr4[0];
                            int i34 = 0;
                            while (i34 != i28) {
                                int i35 = i34 >> 3;
                                int i36 = (i34 & 7) << 3;
                                long j23 = (jArr4[i35] >> i36) & j9;
                                if (j23 != 128 && j23 == 254) {
                                    Object obj2 = objArr2[i34];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i25;
                                    int i37 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i38 = i37 >>> 7;
                                    int iG2 = g(i38);
                                    int i39 = i38 & i28;
                                    if (((iG2 - i39) & i28) / i32 == ((i34 - i39) & i28) / i32) {
                                        long j24 = j22;
                                        jArr4[i35] = (((long) (i37 & 127)) << i36) | ((~(j9 << i36)) & jArr4[i35]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j24) | Long.MIN_VALUE;
                                        i34++;
                                        j22 = j24;
                                    } else {
                                        long j25 = j22;
                                        int i41 = iG2 >> 3;
                                        long j26 = jArr4[i41];
                                        int i42 = (iG2 & 7) << 3;
                                        if (((j26 >> i42) & j9) == 128) {
                                            i12 = i32;
                                            i11 = i28;
                                            objArr = objArr2;
                                            jArr4[i41] = ((~(j9 << i42)) & j26) | (((long) (i37 & 127)) << i42);
                                            jArr4[i35] = (jArr4[i35] & (~(j9 << i36))) | (128 << i36);
                                            objArr[iG2] = objArr[i34];
                                            objArr[i34] = null;
                                        } else {
                                            i11 = i28;
                                            objArr = objArr2;
                                            i12 = i32;
                                            jArr4[i41] = (((long) (i37 & 127)) << i42) | ((~(j9 << i42)) & j26);
                                            Object obj3 = objArr[iG2];
                                            objArr[iG2] = objArr[i34];
                                            objArr[i34] = obj3;
                                            i34--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j25) | Long.MIN_VALUE;
                                        i34++;
                                        j22 = j25;
                                        i32 = i12;
                                        i28 = i11;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i34++;
                                }
                            }
                            this.f35833e = g1.a(this.f35770c) - this.f35771d;
                        }
                        iG = g(i15);
                    }
                    j9 = 255;
                    j11 = j14;
                    j12 = 128;
                    int iB = g1.b(this.f35770c);
                    long[] jArr5 = this.f35768a;
                    Object[] objArr3 = this.f35769b;
                    int i43 = this.f35770c;
                    h(iB);
                    long[] jArr6 = this.f35768a;
                    Object[] objArr4 = this.f35769b;
                    int i44 = this.f35770c;
                    int i45 = 0;
                    while (i45 < i43) {
                        if (((jArr5[i45 >> 3] >> ((i45 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i45];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i25;
                            int i46 = iHashCode3 ^ (iHashCode3 << 16);
                            int iG3 = g(i46 >>> 7);
                            long j27 = i46 & 127;
                            int i47 = iG3 >> 3;
                            int i48 = (iG3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j28 = (jArr6[i47] & (~(255 << i48))) | (j27 << i48);
                            jArr[i47] = j28;
                            jArr[(((iG3 - 7) & i44) + (i44 & 7)) >> 3] = j28;
                            objArr4[iG3] = obj4;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i45++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iG = g(i15);
                }
                this.f35771d++;
                int i49 = this.f35833e;
                long[] jArr7 = this.f35768a;
                int i51 = iG >> 3;
                long j29 = jArr7[i51];
                int i52 = (iG & 7) << 3;
                this.f35833e = i49 - (((j29 >> i52) & j9) == j12 ? 1 : 0);
                int i53 = this.f35770c;
                long j31 = (j29 & (~(j9 << i52))) | (j11 << i52);
                jArr7[i51] = j31;
                jArr7[(((iG - 7) & i53) + (i53 & 7)) >> 3] = j31;
                return iG;
            }
            i19 += 8;
            i18 = (i18 + i19) & i17;
            i16 = i23;
            i13 = i25;
        }
    }

    public final int g(int i11) {
        int i12 = this.f35770c;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f35768a;
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

    public final void h(int i11) {
        long[] jArr;
        int iMax = i11 > 0 ? Math.max(7, g1.c(i11)) : 0;
        this.f35770c = iMax;
        if (iMax == 0) {
            jArr = g1.f35760a;
        } else {
            int i12 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i12];
            Arrays.fill(jArr2, 0, i12, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f35768a = jArr;
        int i13 = iMax >> 3;
        long j9 = 255 << ((iMax & 7) << 3);
        jArr[i13] = (jArr[i13] & (~j9)) | j9;
        this.f35833e = g1.a(this.f35770c) - this.f35771d;
        this.f35769b = iMax == 0 ? r1.a.f37529c : new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f35770c
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f35768a
            int r5 = r1 >> 3
            r6 = r1 & 7
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
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f35769b
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L72
            r10 = -1
        L6c:
            if (r10 < 0) goto L71
            r13.m(r10)
        L71:
            return
        L72:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.u0.i(java.lang.Object):void");
    }

    public final void j(Object obj) {
        this.f35769b[f(obj)] = obj;
    }

    public final void k(i1 i1Var) {
        i1Var.getClass();
        Object[] objArr = i1Var.f35769b;
        long[] jArr = i1Var.f35768a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j9 = jArr[i11];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j9) < 128) {
                        j(objArr[(i11 << 3) + i13]);
                    }
                    j9 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
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
    public final boolean l(java.lang.Object r18) {
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
            int r5 = r0.f35770c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f35768a
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
            java.lang.Object[] r15 = r0.f35769b
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
            r0.m(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.u0.l(java.lang.Object):boolean");
    }

    public final void m(int i11) {
        this.f35771d--;
        long[] jArr = this.f35768a;
        int i12 = this.f35770c;
        int i13 = i11 >> 3;
        int i14 = (i11 & 7) << 3;
        long j9 = (jArr[i13] & (~(255 << i14))) | (254 << i14);
        jArr[i13] = j9;
        jArr[(((i11 - 7) & i12) + (i12 & 7)) >> 3] = j9;
        this.f35769b[i11] = null;
    }

    public /* synthetic */ u0() {
        this(6);
    }
}
