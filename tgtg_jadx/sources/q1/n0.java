package q1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends z0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35795f;

    public n0(int i11) {
        this.f35868a = g1.f35760a;
        this.f35869b = r1.a.f37529c;
        this.f35870c = r.f35817a;
        if (i11 >= 0) {
            e(g1.d(i11));
        } else {
            i4.a.f("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void b() {
        this.f35872e = 0;
        long[] jArr = this.f35868a;
        if (jArr != g1.f35760a) {
            kotlin.collections.x.n(jArr, -9187201950435737472L);
            long[] jArr2 = this.f35868a;
            int i11 = this.f35871d;
            int i12 = i11 >> 3;
            long j9 = 255 << ((i11 & 7) << 3);
            jArr2[i12] = (jArr2[i12] & (~j9)) | j9;
        }
        kotlin.collections.x.m(this.f35869b, 0, this.f35871d, null);
        this.f35795f = g1.a(this.f35871d) - this.f35872e;
    }

    public final int c(int i11) {
        int i12 = this.f35871d;
        int i13 = i11 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f35868a;
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

    public final int d(Object obj) {
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
        int i16 = this.f35871d;
        int i17 = i14 & i16;
        int i18 = 0;
        while (true) {
            long[] jArr3 = this.f35868a;
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
                if (Intrinsics.areEqual(this.f35869b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j16 &= j16 - 1;
                i12 = i23;
            }
            int i24 = i12;
            if ((((~j13) << 6) & j13 & (-9187201950435737472L)) != 0) {
                int iC = c(i14);
                long j17 = 255;
                if (this.f35795f != 0 || ((this.f35868a[iC >> 3] >> ((iC & 7) << 3)) & 255) == 254) {
                    j9 = 255;
                    j11 = j14;
                    j12 = 128;
                } else {
                    int i25 = this.f35871d;
                    if (i25 > 8) {
                        int i26 = 8;
                        long j18 = this.f35872e;
                        u70.b0 b0Var = u70.c0.f40833b;
                        if (Long.compareUnsigned(j18 * 32, ((long) i25) * 25) <= 0) {
                            long[] jArr4 = this.f35868a;
                            int i27 = this.f35871d;
                            Object[] objArr2 = this.f35869b;
                            int[] iArr = this.f35870c;
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
                            long j22 = 72057594037927935L;
                            jArr4[i32] = (jArr4[i32] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iA] = jArr4[0];
                            int i33 = 0;
                            while (i33 != i27) {
                                int i34 = i33 >> 3;
                                int i35 = (i33 & 7) << 3;
                                long j23 = (jArr4[i34] >> i35) & j9;
                                if (j23 != 128 && j23 == 254) {
                                    Object obj2 = objArr2[i33];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i24;
                                    int i36 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i37 = i36 >>> 7;
                                    int iC2 = c(i37);
                                    int i38 = i37 & i27;
                                    long j24 = j22;
                                    if (((iC2 - i38) & i27) / 8 == ((i33 - i38) & i27) / i31) {
                                        jArr4[i34] = (((long) (i36 & 127)) << i35) | (jArr4[i34] & (~(j9 << i35)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j24) | Long.MIN_VALUE;
                                        i33++;
                                        i31 = i31;
                                        j22 = j24;
                                    } else {
                                        int i39 = i31;
                                        int i41 = iC2 >> 3;
                                        long j25 = jArr4[i41];
                                        int i42 = (iC2 & 7) << 3;
                                        if (((j25 >> i42) & j9) == 128) {
                                            i11 = i27;
                                            objArr = objArr2;
                                            jArr4[i41] = ((~(j9 << i42)) & j25) | (((long) (i36 & 127)) << i42);
                                            jArr4[i34] = (jArr4[i34] & (~(j9 << i35))) | (128 << i35);
                                            objArr[iC2] = objArr[i33];
                                            objArr[i33] = null;
                                            iArr[iC2] = iArr[i33];
                                            iArr[i33] = 0;
                                        } else {
                                            i11 = i27;
                                            objArr = objArr2;
                                            jArr4[i41] = (((long) (i36 & 127)) << i42) | ((~(j9 << i42)) & j25);
                                            Object obj3 = objArr[iC2];
                                            objArr[iC2] = objArr[i33];
                                            objArr[i33] = obj3;
                                            int i43 = iArr[iC2];
                                            iArr[iC2] = iArr[i33];
                                            iArr[i33] = i43;
                                            i33--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j24) | Long.MIN_VALUE;
                                        i33++;
                                        i27 = i11;
                                        i31 = i39;
                                        j22 = j24;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i33++;
                                }
                            }
                            this.f35795f = g1.a(this.f35871d) - this.f35872e;
                        }
                        iC = c(i14);
                    }
                    j9 = 255;
                    j11 = j14;
                    j12 = 128;
                    int iB = g1.b(this.f35871d);
                    long[] jArr5 = this.f35868a;
                    Object[] objArr3 = this.f35869b;
                    int[] iArr2 = this.f35870c;
                    int i44 = this.f35871d;
                    e(iB);
                    long[] jArr6 = this.f35868a;
                    Object[] objArr4 = this.f35869b;
                    int[] iArr3 = this.f35870c;
                    int i45 = this.f35871d;
                    int i46 = 0;
                    while (i46 < i44) {
                        if (((jArr5[i46 >> 3] >> ((i46 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i46];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i24;
                            int i47 = iHashCode3 ^ (iHashCode3 << 16);
                            int iC3 = c(i47 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j26 = i47 & 127;
                            int i48 = iC3 >> 3;
                            int i49 = (iC3 & 7) << 3;
                            long j27 = (jArr[i48] & (~(255 << i49))) | (j26 << i49);
                            jArr[i48] = j27;
                            jArr[(((iC3 - 7) & i45) + (i45 & 7)) >> 3] = j27;
                            objArr4[iC3] = obj4;
                            iArr3[iC3] = iArr2[i46];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i46++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iC = c(i14);
                }
                this.f35872e++;
                int i51 = this.f35795f;
                long[] jArr7 = this.f35868a;
                int i52 = iC >> 3;
                long j28 = jArr7[i52];
                int i53 = (iC & 7) << 3;
                this.f35795f = i51 - (((j28 >> i53) & j9) == j12 ? 1 : 0);
                int i54 = this.f35871d;
                long j29 = (j28 & (~(j9 << i53))) | (j11 << i53);
                jArr7[i52] = j29;
                jArr7[(((iC - 7) & i54) + (i54 & 7)) >> 3] = j29;
                return ~iC;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
            i15 = i22;
            i12 = i24;
        }
    }

    public final void e(int i11) {
        long[] jArr;
        int iMax = i11 > 0 ? Math.max(7, g1.c(i11)) : 0;
        this.f35871d = iMax;
        if (iMax == 0) {
            jArr = g1.f35760a;
        } else {
            int i12 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i12];
            Arrays.fill(jArr2, 0, i12, -9187201950435737472L);
            jArr = jArr2;
        }
        this.f35868a = jArr;
        int i13 = iMax >> 3;
        long j9 = 255 << ((iMax & 7) << 3);
        jArr[i13] = (jArr[i13] & (~j9)) | j9;
        this.f35795f = g1.a(this.f35871d) - this.f35872e;
        this.f35869b = new Object[iMax];
        this.f35870c = new int[iMax];
    }

    public final void f(int i11) {
        this.f35872e--;
        long[] jArr = this.f35868a;
        int i12 = this.f35871d;
        int i13 = i11 >> 3;
        int i14 = (i11 & 7) << 3;
        long j9 = (jArr[i13] & (~(255 << i14))) | (254 << i14);
        jArr[i13] = j9;
        jArr[(((i11 - 7) & i12) + (i12 & 7)) >> 3] = j9;
        this.f35869b[i11] = null;
    }

    public final void g(int i11, Object obj) {
        int iD = d(obj);
        if (iD < 0) {
            iD = ~iD;
        }
        this.f35869b[iD] = obj;
        this.f35870c[iD] = i11;
    }

    public /* synthetic */ n0() {
        this(6);
    }
}
