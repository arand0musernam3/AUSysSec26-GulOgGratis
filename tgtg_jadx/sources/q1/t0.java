package q1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends f1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35830f;

    public t0(int i11) {
        this.f35752a = g1.f35760a;
        Object[] objArr = r1.a.f37529c;
        this.f35753b = objArr;
        this.f35754c = objArr;
        if (i11 >= 0) {
            j(g1.d(i11));
        } else {
            i4.a.f("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void g() {
        this.f35756e = 0;
        long[] jArr = this.f35752a;
        if (jArr != g1.f35760a) {
            kotlin.collections.x.n(jArr, -9187201950435737472L);
            long[] jArr2 = this.f35752a;
            int i11 = this.f35755d;
            int i12 = i11 >> 3;
            long j9 = 255 << ((i11 & 7) << 3);
            jArr2[i12] = (jArr2[i12] & (~j9)) | j9;
        }
        kotlin.collections.x.m(this.f35754c, 0, this.f35755d, null);
        kotlin.collections.x.m(this.f35753b, 0, this.f35755d, null);
        this.f35830f = g1.a(this.f35755d) - this.f35756e;
    }

    public final int h(int i11) {
        int i12 = this.f35755d;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f35752a;
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

    public final int i(Object obj) {
        long j9;
        long j11;
        long j12;
        long[] jArr;
        long[] jArr2;
        int i11;
        Object[] objArr;
        int i12 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f35755d;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr3 = this.f35752a;
            int i19 = i17 >> 3;
            int i21 = (i17 & 7) << 3;
            long j13 = ((jArr3[i19 + 1] << (64 - i21)) & ((-i21) >> 63)) | (jArr3[i19] >>> i21);
            long j14 = i15;
            int i22 = i15;
            long j15 = j13 ^ (j14 * 72340172838076673L);
            long j16 = (~j15) & (j15 - 72340172838076673L) & (-9187201950435737472L);
            while (j16 != 0) {
                int iNumberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j16) >> 3)) & i16;
                int i23 = i12;
                if (Intrinsics.areEqual(this.f35753b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j16 &= j16 - 1;
                i12 = i23;
            }
            int i24 = i12;
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int iH = h(i14);
                long j17 = 255;
                if (this.f35830f != 0 || ((this.f35752a[iH >> 3] >> ((iH & 7) << 3)) & 255) == 254) {
                    j9 = 255;
                    j11 = j14;
                    j12 = 128;
                } else {
                    int i25 = this.f35755d;
                    if (i25 > 8) {
                        int i26 = 8;
                        long j18 = this.f35756e;
                        u70.b0 b0Var = u70.c0.f40833b;
                        if (Long.compareUnsigned(j18 * 32, ((long) i25) * 25) <= 0) {
                            long[] jArr4 = this.f35752a;
                            int i27 = this.f35755d;
                            Object[] objArr2 = this.f35753b;
                            Object[] objArr3 = this.f35754c;
                            j12 = 128;
                            int i28 = (i27 + 7) >> 3;
                            int i29 = 0;
                            while (i29 < i28) {
                                long j19 = j17;
                                long j21 = jArr4[i29] & (-9187201950435737472L);
                                jArr4[i29] = (-72340172838076674L) & ((~j21) + (j21 >>> 7));
                                i29++;
                                i26 = i26;
                                j14 = j14;
                                j17 = j19;
                            }
                            j9 = j17;
                            j11 = j14;
                            int i31 = i26;
                            int iA = kotlin.collections.y.A(jArr4);
                            int i32 = iA - 1;
                            jArr4[i32] = (jArr4[i32] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iA] = jArr4[0];
                            int i33 = 0;
                            while (i33 != i27) {
                                int i34 = i33 >> 3;
                                int i35 = (i33 & 7) << 3;
                                long j22 = (jArr4[i34] >> i35) & j9;
                                if (j22 != 128 && j22 == 254) {
                                    Object obj2 = objArr2[i33];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i24;
                                    int i36 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i37 = i36 >>> 7;
                                    int iH2 = h(i37);
                                    int i38 = i37 & i27;
                                    if (((iH2 - i38) & i27) / i31 == ((i33 - i38) & i27) / i31) {
                                        jArr4[i34] = (((long) (i36 & 127)) << i35) | (jArr4[i34] & (~(j9 << i35)));
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i33++;
                                        i31 = i31;
                                    } else {
                                        int i39 = i31;
                                        int i41 = iH2 >> 3;
                                        long j23 = jArr4[i41];
                                        int i42 = (iH2 & 7) << 3;
                                        if (((j23 >> i42) & j9) == 128) {
                                            i11 = i27;
                                            objArr = objArr2;
                                            jArr4[i41] = ((~(j9 << i42)) & j23) | (((long) (i36 & 127)) << i42);
                                            jArr4[i34] = (jArr4[i34] & (~(j9 << i35))) | (128 << i35);
                                            objArr[iH2] = objArr[i33];
                                            objArr[i33] = null;
                                            objArr3[iH2] = objArr3[i33];
                                            objArr3[i33] = null;
                                        } else {
                                            i11 = i27;
                                            objArr = objArr2;
                                            jArr4[i41] = (((long) (i36 & 127)) << i42) | ((~(j9 << i42)) & j23);
                                            Object obj3 = objArr[iH2];
                                            objArr[iH2] = objArr[i33];
                                            objArr[i33] = obj3;
                                            Object obj4 = objArr3[iH2];
                                            objArr3[iH2] = objArr3[i33];
                                            objArr3[i33] = obj4;
                                            i33--;
                                        }
                                        jArr4[jArr4.length - 1] = jArr4[0];
                                        i33++;
                                        i31 = i39;
                                        i27 = i11;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i33++;
                                }
                            }
                            this.f35830f = g1.a(this.f35755d) - this.f35756e;
                        }
                        iH = h(i14);
                    }
                    j9 = 255;
                    j11 = j14;
                    j12 = 128;
                    int iB = g1.b(this.f35755d);
                    long[] jArr5 = this.f35752a;
                    Object[] objArr4 = this.f35753b;
                    Object[] objArr5 = this.f35754c;
                    int i43 = this.f35755d;
                    j(iB);
                    long[] jArr6 = this.f35752a;
                    Object[] objArr6 = this.f35753b;
                    Object[] objArr7 = this.f35754c;
                    int i44 = this.f35755d;
                    int i45 = 0;
                    while (i45 < i43) {
                        if (((jArr5[i45 >> 3] >> ((i45 & 7) << 3)) & 255) < 128) {
                            Object obj5 = objArr4[i45];
                            int iHashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i24;
                            int i46 = iHashCode3 ^ (iHashCode3 << 16);
                            int iH3 = h(i46 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j24 = i46 & 127;
                            int i47 = iH3 >> 3;
                            int i48 = (iH3 & 7) << 3;
                            long j25 = (jArr[i47] & (~(255 << i48))) | (j24 << i48);
                            jArr[i47] = j25;
                            jArr[(((iH3 - 7) & i44) + (i44 & 7)) >> 3] = j25;
                            objArr6[iH3] = obj5;
                            objArr7[iH3] = objArr5[i45];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i45++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iH = h(i14);
                }
                this.f35756e++;
                int i49 = this.f35830f;
                long[] jArr7 = this.f35752a;
                int i51 = iH >> 3;
                long j26 = jArr7[i51];
                int i52 = (iH & 7) << 3;
                this.f35830f = i49 - (((j26 >> i52) & j9) == j12 ? 1 : 0);
                int i53 = this.f35755d;
                long j27 = (j26 & (~(j9 << i52))) | (j11 << i52);
                jArr7[i51] = j27;
                jArr7[(((iH - 7) & i53) + (i53 & 7)) >> 3] = j27;
                return ~iH;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
            i15 = i22;
            i12 = i24;
        }
    }

    public final void j(int i11) {
        long[] jArr;
        int iMax = i11 > 0 ? Math.max(7, g1.c(i11)) : 0;
        this.f35755d = iMax;
        if (iMax == 0) {
            jArr = g1.f35760a;
        } else {
            int i12 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i12];
            Arrays.fill(jArr2, 0, i12, -9187201950435737472L);
            int i13 = iMax >> 3;
            long j9 = 255 << ((iMax & 7) << 3);
            jArr2[i13] = (jArr2[i13] & (~j9)) | j9;
            jArr = jArr2;
        }
        this.f35752a = jArr;
        this.f35830f = g1.a(this.f35755d) - this.f35756e;
        Object[] objArr = r1.a.f37529c;
        this.f35753b = iMax == 0 ? objArr : new Object[iMax];
        if (iMax != 0) {
            objArr = new Object[iMax];
        }
        this.f35754c = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.Object r14) {
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
            int r3 = r13.f35755d
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f35752a
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
            java.lang.Object[] r11 = r13.f35753b
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
            if (r4 == 0) goto L75
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object r14 = r13.l(r10)
            return r14
        L73:
            r14 = 0
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.t0.k(java.lang.Object):java.lang.Object");
    }

    public final Object l(int i11) {
        this.f35756e--;
        long[] jArr = this.f35752a;
        int i12 = this.f35755d;
        int i13 = i11 >> 3;
        int i14 = (i11 & 7) << 3;
        long j9 = (jArr[i13] & (~(255 << i14))) | (254 << i14);
        jArr[i13] = j9;
        jArr[(((i11 - 7) & i12) + (i12 & 7)) >> 3] = j9;
        this.f35753b[i11] = null;
        Object[] objArr = this.f35754c;
        Object obj = objArr[i11];
        objArr[i11] = null;
        return obj;
    }

    public final void m(Object obj, Object obj2) {
        int i11 = i(obj);
        if (i11 < 0) {
            i11 = ~i11;
        }
        this.f35753b[i11] = obj;
        this.f35754c[i11] = obj2;
    }

    public /* synthetic */ t0() {
        this(6);
    }
}
