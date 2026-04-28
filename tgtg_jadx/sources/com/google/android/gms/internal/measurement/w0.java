package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w0 extends x0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InputStream f11979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f11980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11983h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11984i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11985j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11986k = Integer.MAX_VALUE;

    public /* synthetic */ w0(InputStream inputStream, int i11) {
        this.f11979d = inputStream;
        this.f11980e = new byte[i11 < 8 ? 8 : i11];
        this.f11981f = 0;
        this.f11983h = 0;
        this.f11985j = 0;
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final int A() {
        return G();
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final int B() {
        return G();
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final int C() {
        return P();
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final long D() {
        return Q();
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final int E() {
        return x0.j(G());
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final long F() {
        return x0.k(H());
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final int G() {
        int i11;
        int i12 = this.f11983h;
        int i13 = this.f11981f;
        if (i13 != i12) {
            int i14 = i12 + 1;
            byte[] bArr = this.f11980e;
            byte b8 = bArr[i12];
            if (b8 >= 0) {
                this.f11983h = i14;
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
                this.f11983h = i15;
                return i11;
            }
        }
        return (int) O();
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final long H() {
        long j9;
        long j11;
        long j12;
        int i11 = this.f11983h;
        int i12 = this.f11981f;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f11980e;
            byte b8 = bArr[i11];
            if (b8 >= 0) {
                this.f11983h = i13;
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
                this.f11983h = i14;
                return j9;
            }
        }
        return O();
    }

    public final void I() {
        int i11 = this.f11981f + this.f11982g;
        this.f11981f = i11;
        int i12 = this.f11985j + i11;
        int i13 = this.f11986k;
        if (i12 <= i13) {
            this.f11982g = 0;
            return;
        }
        int i14 = i12 - i13;
        this.f11982g = i14;
        this.f11981f = i11 - i14;
    }

    public final void J(int i11) throws zzaeh {
        if (K(i11)) {
            return;
        }
        if (i11 > (Integer.MAX_VALUE - this.f11985j) - this.f11983h) {
            c50.w.o("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        } else {
            c50.w.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final boolean K(int i11) throws IOException {
        InputStream inputStream = this.f11979d;
        int i12 = this.f11983h;
        int i13 = i12 + i11;
        int i14 = this.f11981f;
        if (i13 <= i14) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 66);
            sb2.append("refillBuffer() called when ");
            sb2.append(i11);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        int i15 = this.f11985j;
        if (i11 <= (Integer.MAX_VALUE - i15) - i12 && i15 + i12 + i11 <= this.f11986k) {
            byte[] bArr = this.f11980e;
            if (i12 > 0) {
                if (i14 > i12) {
                    System.arraycopy(bArr, i12, bArr, 0, i14 - i12);
                }
                i15 = this.f11985j + i12;
                this.f11985j = i15;
                i14 = this.f11981f - i12;
                this.f11981f = i14;
                this.f11983h = 0;
            }
            try {
                int i16 = inputStream.read(bArr, i14, Math.min(bArr.length - i14, (Integer.MAX_VALUE - i15) - i14));
                if (i16 == 0 || i16 < -1 || i16 > bArr.length) {
                    String strValueOf = String.valueOf(inputStream.getClass());
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i16).length() + strValueOf.length() + 39 + 41);
                    sb3.append(strValueOf);
                    sb3.append("#read(byte[]) returned invalid result: ");
                    sb3.append(i16);
                    sb3.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb3.toString());
                }
                if (i16 > 0) {
                    this.f11981f += i16;
                    I();
                    if (this.f11981f >= i11 || K(i11)) {
                        return true;
                    }
                }
            } catch (zzaeh e5) {
                e5.f12098a = true;
                throw e5;
            }
        }
        return false;
    }

    public final byte[] L(int i11) throws IOException {
        byte[] bArrM = M(i11);
        if (bArrM != null) {
            return bArrM;
        }
        int i12 = this.f11983h;
        int i13 = this.f11981f;
        int i14 = i13 - i12;
        this.f11985j += i13;
        this.f11983h = 0;
        this.f11981f = 0;
        ArrayList<byte[]> arrayListN = N(i11 - i14);
        byte[] bArr = new byte[i11];
        System.arraycopy(this.f11980e, i12, bArr, 0, i14);
        for (byte[] bArr2 : arrayListN) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i14, length);
            i14 += length;
        }
        return bArr;
    }

    public final byte[] M(int i11) throws IOException {
        if (i11 == 0) {
            return r1.f11808a;
        }
        int i12 = this.f11985j;
        int i13 = this.f11983h;
        int i14 = i12 + i13 + i11;
        if ((-2147483647) + i14 > 0) {
            c50.w.o("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return null;
        }
        int i15 = this.f11986k;
        if (i14 > i15) {
            g((i15 - i12) - i13);
            c50.w.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        int i16 = this.f11981f - i13;
        int i17 = i11 - i16;
        InputStream inputStream = this.f11979d;
        if (i17 >= 4096) {
            try {
                if (i17 > inputStream.available()) {
                    return null;
                }
            } catch (zzaeh e5) {
                e5.f12098a = true;
                throw e5;
            }
        }
        byte[] bArr = new byte[i11];
        System.arraycopy(this.f11980e, this.f11983h, bArr, 0, i16);
        this.f11985j += this.f11981f;
        this.f11983h = 0;
        this.f11981f = 0;
        while (i16 < i11) {
            try {
                int i18 = inputStream.read(bArr, i16, i11 - i16);
                if (i18 == -1) {
                    c50.w.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return null;
                }
                this.f11985j += i18;
                i16 += i18;
            } catch (zzaeh e11) {
                e11.f12098a = true;
                throw e11;
            }
        }
        return bArr;
    }

    public final ArrayList N(int i11) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i11 > 0) {
            int iMin = Math.min(i11, 4096);
            byte[] bArr = new byte[iMin];
            int i12 = 0;
            while (i12 < iMin) {
                try {
                    int i13 = this.f11979d.read(bArr, i12, iMin - i12);
                    if (i13 == -1) {
                        c50.w.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        return null;
                    }
                    this.f11985j += i13;
                    i12 += i13;
                } catch (zzaeh e5) {
                    e5.f12098a = true;
                    throw e5;
                }
            }
            i11 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final long O() throws zzaeh {
        long j9 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            if (this.f11983h == this.f11981f) {
                J(1);
            }
            int i12 = this.f11983h;
            this.f11983h = i12 + 1;
            byte b8 = this.f11980e[i12];
            j9 |= ((long) (b8 & ByteCompanionObject.MAX_VALUE)) << i11;
            if ((b8 & ByteCompanionObject.MIN_VALUE) == 0) {
                return j9;
            }
        }
        c50.w.o("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    public final int P() throws zzaeh {
        int i11 = this.f11983h;
        if (this.f11981f - i11 < 4) {
            J(4);
            i11 = this.f11983h;
        }
        this.f11983h = i11 + 4;
        byte[] bArr = this.f11980e;
        int i12 = bArr[i11] & 255;
        int i13 = bArr[i11 + 1] & 255;
        int i14 = bArr[i11 + 2] & 255;
        return ((bArr[i11 + 3] & 255) << 24) | (i13 << 8) | i12 | (i14 << 16);
    }

    public final long Q() throws zzaeh {
        int i11 = this.f11983h;
        if (this.f11981f - i11 < 8) {
            J(8);
            i11 = this.f11983h;
        }
        this.f11983h = i11 + 8;
        byte[] bArr = this.f11980e;
        long j9 = bArr[i11];
        long j11 = (((long) bArr[i11 + 1]) & 255) << 8;
        long j12 = bArr[i11 + 2];
        long j13 = bArr[i11 + 3];
        return ((((long) bArr[i11 + 6]) & 255) << 48) | (j9 & 255) | j11 | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((((long) bArr[i11 + 7]) & 255) << 56);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final int a(int i11) throws zzaeh {
        if (i11 < 0) {
            c50.w.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i12 = this.f11985j + this.f11983h + i11;
        if (i12 < 0) {
            c50.w.o("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        int i13 = this.f11986k;
        if (i12 > i13) {
            c50.w.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.f11986k = i12;
        I();
        return i13;
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void b(int i11) {
        this.f11986k = i11;
        I();
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final int c() {
        int i11 = this.f11986k;
        if (i11 == Integer.MAX_VALUE) {
            return -1;
        }
        return i11 - (this.f11985j + this.f11983h);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final boolean d() {
        return this.f11983h == this.f11981f && !K(1);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final int e() {
        return this.f11985j + this.f11983h;
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final int f(int i11, int i12, byte[] bArr) throws IOException {
        if ((bArr.length - i11) - i12 < 0 || (i11 | i12) < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i12 == 0) {
            return 0;
        }
        int i13 = this.f11981f;
        int i14 = this.f11983h;
        int i15 = i13 - i14;
        if (i15 > 0) {
            int iMin = Math.min(i12, i15);
            System.arraycopy(this.f11980e, this.f11983h, bArr, i11, iMin);
            this.f11983h += iMin;
            return iMin;
        }
        int iMin2 = Math.min(i12, (this.f11986k - this.f11985j) - i14);
        if (iMin2 <= 0) {
            return -1;
        }
        try {
            int i16 = this.f11979d.read(bArr, i11, iMin2);
            if (i16 != -1) {
                this.f11985j += i16;
            }
            return i16;
        } catch (zzaeh e5) {
            e5.f12098a = true;
            throw e5;
        }
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void g(int i11) throws zzaeh {
        InputStream inputStream = this.f11979d;
        int i12 = this.f11981f;
        int i13 = this.f11983h;
        int i14 = i12 - i13;
        if (i11 <= i14 && i11 >= 0) {
            this.f11983h = i13 + i11;
            return;
        }
        if (i11 < 0) {
            c50.w.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return;
        }
        int i15 = this.f11985j;
        int i16 = i15 + i13;
        int i17 = this.f11986k;
        if (i16 + i11 > i17) {
            g((i17 - i15) - i13);
            c50.w.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return;
        }
        this.f11985j = i16;
        this.f11981f = 0;
        this.f11983h = 0;
        while (i14 < i11) {
            long j9 = i11 - i14;
            try {
                try {
                    long jSkip = inputStream.skip(j9);
                    if (jSkip < 0 || jSkip > j9) {
                        String strValueOf = String.valueOf(inputStream.getClass());
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 31 + String.valueOf(jSkip).length() + 41);
                        sb2.append(strValueOf);
                        sb2.append("#skip returned invalid result: ");
                        sb2.append(jSkip);
                        sb2.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb2.toString());
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i14 += (int) jSkip;
                    }
                } catch (zzaeh e5) {
                    e5.f12098a = true;
                    throw e5;
                }
            } catch (Throwable th2) {
                this.f11985j += i14;
                I();
                throw th2;
            }
        }
        this.f11985j += i14;
        I();
        if (i14 >= i11) {
            return;
        }
        int i18 = this.f11981f;
        int i19 = i18 - this.f11983h;
        this.f11983h = i18;
        J(1);
        while (true) {
            int i21 = i11 - i19;
            int i22 = this.f11981f;
            if (i21 <= i22) {
                this.f11983h = i21;
                return;
            } else {
                i19 += i22;
                this.f11983h = i22;
                J(1);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final int l() throws zzaeh {
        if (d()) {
            this.f11984i = 0;
            return 0;
        }
        int iG = G();
        this.f11984i = iG;
        if ((iG >>> 3) != 0) {
            return iG;
        }
        c50.w.o("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final void m(int i11) throws zzaeh {
        if (this.f11984i == i11) {
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
                g(G());
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
        int i14 = this.f11981f - this.f11983h;
        byte[] bArr = this.f11980e;
        if (i14 >= 10) {
            while (i13 < 10) {
                int i15 = this.f11983h;
                this.f11983h = i15 + 1;
                if (bArr[i15] < 0) {
                    i13++;
                }
            }
            c50.w.o("CodedInputStream encountered a malformed varint.");
            return false;
        }
        while (i13 < 10) {
            if (this.f11983h == this.f11981f) {
                J(1);
            }
            int i16 = this.f11983h;
            this.f11983h = i16 + 1;
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
        return Double.longBitsToDouble(Q());
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final float p() {
        return Float.intBitsToFloat(P());
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
        return G();
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final long t() {
        return Q();
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final int u() {
        return P();
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final boolean v() {
        return H() != 0;
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final String w() throws zzaeh {
        int iG = G();
        byte[] bArr = this.f11980e;
        if (iG > 0) {
            int i11 = this.f11981f;
            int i12 = this.f11983h;
            if (iG <= i11 - i12) {
                String str = new String(bArr, i12, iG, StandardCharsets.UTF_8);
                this.f11983h += iG;
                return str;
            }
        }
        if (iG == 0) {
            return "";
        }
        if (iG < 0) {
            c50.w.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        if (iG > this.f11981f) {
            return new String(L(iG), StandardCharsets.UTF_8);
        }
        J(iG);
        String str2 = new String(bArr, this.f11983h, iG, StandardCharsets.UTF_8);
        this.f11983h += iG;
        return str2;
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final String x() throws IOException {
        int iG = G();
        int i11 = this.f11983h;
        int i12 = this.f11981f;
        int i13 = i12 - i11;
        byte[] bArrL = this.f11980e;
        if (iG <= i13 && iG > 0) {
            this.f11983h = i11 + iG;
        } else {
            if (iG == 0) {
                return "";
            }
            if (iG < 0) {
                c50.w.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return null;
            }
            i11 = 0;
            if (iG <= i12) {
                J(iG);
                this.f11983h = iG;
            } else {
                bArrL = L(iG);
            }
        }
        return y2.d(i11, iG, bArrL);
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final t0 y() throws IOException {
        int iG = G();
        int i11 = this.f11981f;
        int i12 = this.f11983h;
        int i13 = i11 - i12;
        byte[] bArr = this.f11980e;
        if (iG <= i13 && iG > 0) {
            t0 t0VarL = u0.l(i12, iG, bArr);
            this.f11983h += iG;
            return t0VarL;
        }
        if (iG == 0) {
            return u0.f11915b;
        }
        if (iG < 0) {
            c50.w.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        byte[] bArrM = M(iG);
        if (bArrM != null) {
            return u0.l(0, bArrM.length, bArrM);
        }
        int i14 = this.f11983h;
        int i15 = this.f11981f;
        int i16 = i15 - i14;
        this.f11985j += i15;
        this.f11983h = 0;
        this.f11981f = 0;
        ArrayList<byte[]> arrayListN = N(iG - i16);
        byte[] bArr2 = new byte[iG];
        System.arraycopy(bArr, i14, bArr2, 0, i16);
        for (byte[] bArr3 : arrayListN) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i16, length);
            i16 += length;
        }
        try {
            t0 t0Var = u0.f11915b;
            return iG == 0 ? u0.f11915b : new t0(bArr2);
        } catch (zzaeh e5) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.x0
    public final byte[] z() throws zzaeh {
        int iG = G();
        int i11 = this.f11981f;
        int i12 = this.f11983h;
        if (iG <= i11 - i12 && iG > 0) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(this.f11980e, i12, i12 + iG);
            this.f11983h += iG;
            return bArrCopyOfRange;
        }
        if (iG >= 0) {
            return L(iG);
        }
        c50.w.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return null;
    }
}
