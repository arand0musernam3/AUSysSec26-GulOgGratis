package com.google.android.gms.internal.measurement;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class v0 extends x0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f11950d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11952f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11955i = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11951e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11953g = 0;

    public /* synthetic */ v0(byte[] bArr) {
        this.f11950d = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final int A() {
        return M();
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final int B() {
        return M();
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final int C() {
        return J();
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final long D() {
        return K();
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final int E() {
        return x0.j(M());
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final long F() {
        return x0.k(H());
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final int G() {
        return M();
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final long H() {
        long j9;
        long j11;
        long j12;
        int i11 = this.f11953g;
        int i12 = this.f11951e;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f11950d;
            byte b8 = bArr[i11];
            if (b8 >= 0) {
                this.f11953g = i13;
                return b8;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b8;
                if (i15 < 0) {
                    j9 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        j9 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            long j13 = (-2080896) ^ i19;
                            i14 = i18;
                            j9 = j13;
                        } else {
                            i16 = i11 + 5;
                            long j14 = ((long) i19) ^ (((long) bArr[i18]) << 28);
                            if (j14 >= 0) {
                                j11 = 266354560;
                            } else {
                                int i21 = i11 + 6;
                                long j15 = j14 ^ (((long) bArr[i16]) << 35);
                                if (j15 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    i16 = i11 + 7;
                                    j14 = j15 ^ (((long) bArr[i21]) << 42);
                                    if (j14 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        i21 = i11 + 8;
                                        j15 = j14 ^ (((long) bArr[i16]) << 49);
                                        if (j15 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i16 = i11 + 9;
                                            j14 = j15 ^ (((long) bArr[i21]) << 56);
                                            if (j14 >= 0) {
                                                j11 = 71499008037633920L;
                                            } else {
                                                int i22 = i11 + 10;
                                                long j16 = j14 ^ (((long) bArr[i16]) << 63);
                                                if (j16 >= 0) {
                                                    j9 = j16 ^ (-9151873028817141888L);
                                                    i14 = i22;
                                                }
                                            }
                                        }
                                    }
                                }
                                j9 = j15 ^ j12;
                                i14 = i21;
                            }
                            j9 = j14 ^ j11;
                        }
                    }
                    i14 = i16;
                }
                this.f11953g = i14;
                return j9;
            }
        }
        return I();
    }

    public final long I() throws zzaeh {
        long j9 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            int i12 = this.f11953g;
            if (i12 == this.f11951e) {
                c50.w.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0L;
            }
            this.f11953g = i12 + 1;
            byte b8 = this.f11950d[i12];
            j9 |= ((long) (b8 & ByteCompanionObject.MAX_VALUE)) << i11;
            if ((b8 & ByteCompanionObject.MIN_VALUE) == 0) {
                return j9;
            }
        }
        c50.w.o("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    public final int J() throws zzaeh {
        int i11 = this.f11953g;
        if (this.f11951e - i11 < 4) {
            c50.w.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.f11953g = i11 + 4;
        byte[] bArr = this.f11950d;
        int i12 = bArr[i11] & 255;
        int i13 = bArr[i11 + 1] & 255;
        int i14 = bArr[i11 + 2] & 255;
        return ((bArr[i11 + 3] & 255) << 24) | (i13 << 8) | i12 | (i14 << 16);
    }

    public final long K() throws zzaeh {
        int i11 = this.f11953g;
        if (this.f11951e - i11 < 8) {
            c50.w.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0L;
        }
        this.f11953g = i11 + 8;
        byte[] bArr = this.f11950d;
        long j9 = bArr[i11];
        long j11 = (((long) bArr[i11 + 1]) & 255) << 8;
        long j12 = bArr[i11 + 2];
        long j13 = bArr[i11 + 3];
        return ((((long) bArr[i11 + 6]) & 255) << 48) | (j9 & 255) | j11 | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((((long) bArr[i11 + 7]) & 255) << 56);
    }

    public final byte[] L(int i11) throws zzaeh {
        if (i11 > 0) {
            int i12 = this.f11951e;
            int i13 = this.f11953g;
            if (i11 <= i12 - i13) {
                int i14 = i11 + i13;
                this.f11953g = i14;
                return Arrays.copyOfRange(this.f11950d, i13, i14);
            }
        }
        if (i11 > 0) {
            c50.w.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        if (i11 == 0) {
            return r1.f11808a;
        }
        c50.w.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return null;
    }

    public final int M() {
        int i11;
        int i12 = this.f11953g;
        int i13 = this.f11951e;
        if (i13 != i12) {
            int i14 = i12 + 1;
            byte[] bArr = this.f11950d;
            byte b8 = bArr[i12];
            if (b8 >= 0) {
                this.f11953g = i14;
                return b8;
            }
            if (i13 - i14 >= 9) {
                int i15 = i12 + 2;
                int i16 = (bArr[i14] << 7) ^ b8;
                if (i16 < 0) {
                    i11 = i16 ^ (-128);
                } else {
                    int i17 = i12 + 3;
                    int i18 = (bArr[i15] << 14) ^ i16;
                    if (i18 >= 0) {
                        i11 = i18 ^ 16256;
                    } else {
                        int i19 = i12 + 4;
                        int i21 = i18 ^ (bArr[i17] << 21);
                        if (i21 < 0) {
                            i11 = (-2080896) ^ i21;
                        } else {
                            i17 = i12 + 5;
                            byte b11 = bArr[i19];
                            int i22 = (i21 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i19 = i12 + 6;
                                if (bArr[i17] < 0) {
                                    i17 = i12 + 7;
                                    if (bArr[i19] < 0) {
                                        i19 = i12 + 8;
                                        if (bArr[i17] < 0) {
                                            i17 = i12 + 9;
                                            if (bArr[i19] < 0) {
                                                int i23 = i12 + 10;
                                                if (bArr[i17] >= 0) {
                                                    i15 = i23;
                                                    i11 = i22;
                                                }
                                            }
                                        }
                                    }
                                }
                                i11 = i22;
                            }
                            i11 = i22;
                        }
                        i15 = i19;
                    }
                    i15 = i17;
                }
                this.f11953g = i15;
                return i11;
            }
        }
        return (int) I();
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final int a(int i11) throws zzaeh {
        if (i11 < 0) {
            c50.w.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i12 = i11 + this.f11953g;
        if (i12 < 0) {
            c50.w.o("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        int i13 = this.f11955i;
        if (i12 > i13) {
            c50.w.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.f11955i = i12;
        int i14 = this.f11951e + this.f11952f;
        this.f11951e = i14;
        if (i14 <= i12) {
            this.f11952f = 0;
            return i13;
        }
        int i15 = i14 - i12;
        this.f11952f = i15;
        this.f11951e = i14 - i15;
        return i13;
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void b(int i11) {
        this.f11955i = i11;
        int i12 = this.f11951e + this.f11952f;
        this.f11951e = i12;
        if (i12 <= i11) {
            this.f11952f = 0;
            return;
        }
        int i13 = i12 - i11;
        this.f11952f = i13;
        this.f11951e = i12 - i13;
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final int c() {
        int i11 = this.f11955i;
        if (i11 == Integer.MAX_VALUE) {
            return -1;
        }
        return i11 - this.f11953g;
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final boolean d() {
        return this.f11953g == this.f11951e;
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final int e() {
        return this.f11953g;
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final int f(int i11, int i12, byte[] bArr) {
        if ((bArr.length - i11) - i12 < 0 || (i11 | i12) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i12 == 0) {
            return 0;
        }
        int iMin = Math.min(i12, this.f11951e - this.f11953g);
        if (iMin == 0) {
            return -1;
        }
        System.arraycopy(this.f11950d, this.f11953g, bArr, i11, iMin);
        this.f11953g += iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void g(int i11) throws zzaeh {
        if (i11 >= 0) {
            int i12 = this.f11951e;
            int i13 = this.f11953g;
            if (i11 <= i12 - i13) {
                this.f11953g = i13 + i11;
                return;
            }
        }
        if (i11 < 0) {
            c50.w.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            c50.w.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final int l() throws zzaeh {
        if (d()) {
            this.f11954h = 0;
            return 0;
        }
        int iM = M();
        this.f11954h = iM;
        if ((iM >>> 3) != 0) {
            return iM;
        }
        c50.w.o("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void m(int i11) throws zzaeh {
        if (this.f11954h == i11) {
            return;
        }
        c50.w.o("Protocol message end-group tag did not match expected tag.");
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final boolean n(int i11) throws zzaeh {
        int i12 = i11 & 7;
        int i13 = 0;
        if (i12 != 0) {
            if (i12 == 1) {
                g(8);
                return true;
            }
            if (i12 == 2) {
                g(M());
                return true;
            }
            if (i12 == 3) {
                i();
                m(((i11 >>> 3) << 3) | 4);
                return true;
            }
            if (i12 == 4) {
                if (this.f12022b == 0) {
                    m(0);
                }
                return false;
            }
            if (i12 == 5) {
                g(4);
                return true;
            }
            c50.w.n();
            return false;
        }
        int i14 = this.f11951e - this.f11953g;
        byte[] bArr = this.f11950d;
        if (i14 >= 10) {
            while (i13 < 10) {
                int i15 = this.f11953g;
                this.f11953g = i15 + 1;
                if (bArr[i15] < 0) {
                    i13++;
                }
            }
            c50.w.o("CodedInputStream encountered a malformed varint.");
            return false;
        }
        while (i13 < 10) {
            int i16 = this.f11953g;
            if (i16 == this.f11951e) {
                c50.w.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return false;
            }
            this.f11953g = i16 + 1;
            if (bArr[i16] < 0) {
                i13++;
            }
        }
        c50.w.o("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final double o() {
        return Double.longBitsToDouble(K());
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final float p() {
        return Float.intBitsToFloat(J());
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final long q() {
        return H();
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final long r() {
        return H();
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final int s() {
        return M();
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final long t() {
        return K();
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final int u() {
        return J();
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final boolean v() {
        return H() != 0;
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final String w() throws zzaeh {
        int iM = M();
        if (iM > 0) {
            int i11 = this.f11951e;
            int i12 = this.f11953g;
            if (iM <= i11 - i12) {
                String str = new String(this.f11950d, i12, iM, StandardCharsets.UTF_8);
                this.f11953g += iM;
                return str;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM < 0) {
            c50.w.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        c50.w.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final String x() throws zzaeh {
        int iM = M();
        if (iM > 0) {
            int i11 = this.f11951e;
            int i12 = this.f11953g;
            if (iM <= i11 - i12) {
                String strD = y2.d(i12, iM, this.f11950d);
                this.f11953g += iM;
                return strD;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM <= 0) {
            c50.w.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        c50.w.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final t0 y() throws zzaeh {
        int iM = M();
        if (iM > 0) {
            int i11 = this.f11951e;
            int i12 = this.f11953g;
            if (iM <= i11 - i12) {
                t0 t0VarL = u0.l(i12, iM, this.f11950d);
                this.f11953g += iM;
                return t0VarL;
            }
        }
        if (iM == 0) {
            return u0.f11915b;
        }
        byte[] bArrL = L(iM);
        t0 t0Var = u0.f11915b;
        return bArrL.length == 0 ? u0.f11915b : new t0(bArrL);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final byte[] z() {
        return L(M());
    }
}
