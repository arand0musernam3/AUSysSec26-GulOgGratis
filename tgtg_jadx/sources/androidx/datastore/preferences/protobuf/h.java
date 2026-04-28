package androidx.datastore.preferences.protobuf;

import com.braze.h2;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FileInputStream f2972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f2973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2978i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2979j = Integer.MAX_VALUE;

    public h(FileInputStream fileInputStream) {
        Charset charset = b0.f2930a;
        this.f2972c = fileInputStream;
        this.f2973d = new byte[4096];
        this.f2974e = 0;
        this.f2976g = 0;
        this.f2978i = 0;
    }

    public final byte[] A(int i11) throws IOException {
        byte[] bArrB = B(i11);
        if (bArrB != null) {
            return bArrB;
        }
        int i12 = this.f2976g;
        int i13 = this.f2974e;
        int length = i13 - i12;
        this.f2978i += i13;
        this.f2976g = 0;
        this.f2974e = 0;
        ArrayList<byte[]> arrayListC = C(i11 - length);
        byte[] bArr = new byte[i11];
        System.arraycopy(this.f2973d, i12, bArr, 0, length);
        for (byte[] bArr2 : arrayListC) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] B(int i11) throws IOException {
        if (i11 == 0) {
            return b0.f2931b;
        }
        if (i11 < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int i12 = this.f2978i;
        int i13 = this.f2976g;
        int i14 = i12 + i13 + i11;
        if (i14 - Integer.MAX_VALUE > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i15 = this.f2979j;
        if (i14 > i15) {
            K((i15 - i12) - i13);
            throw InvalidProtocolBufferException.e();
        }
        int i16 = this.f2974e - i13;
        int i17 = i11 - i16;
        FileInputStream fileInputStream = this.f2972c;
        if (i17 >= 4096) {
            try {
                if (i17 > fileInputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e5) {
                e5.f2927a = true;
                throw e5;
            }
        }
        byte[] bArr = new byte[i11];
        System.arraycopy(this.f2973d, this.f2976g, bArr, 0, i16);
        this.f2978i += this.f2974e;
        this.f2976g = 0;
        this.f2974e = 0;
        while (i16 < i11) {
            try {
                int i18 = fileInputStream.read(bArr, i16, i11 - i16);
                if (i18 == -1) {
                    throw InvalidProtocolBufferException.e();
                }
                this.f2978i += i18;
                i16 += i18;
            } catch (InvalidProtocolBufferException e11) {
                e11.f2927a = true;
                throw e11;
            }
        }
        return bArr;
    }

    public final ArrayList C(int i11) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i11 > 0) {
            int iMin = Math.min(i11, 4096);
            byte[] bArr = new byte[iMin];
            int i12 = 0;
            while (i12 < iMin) {
                int i13 = this.f2972c.read(bArr, i12, iMin - i12);
                if (i13 == -1) {
                    throw InvalidProtocolBufferException.e();
                }
                this.f2978i += i13;
                i12 += i13;
            }
            i11 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int D() throws InvalidProtocolBufferException {
        int i11 = this.f2976g;
        if (this.f2974e - i11 < 4) {
            J(4);
            i11 = this.f2976g;
        }
        this.f2976g = i11 + 4;
        byte[] bArr = this.f2973d;
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    public final long E() throws InvalidProtocolBufferException {
        int i11 = this.f2976g;
        if (this.f2974e - i11 < 8) {
            J(8);
            i11 = this.f2976g;
        }
        this.f2976g = i11 + 8;
        byte[] bArr = this.f2973d;
        return ((((long) bArr[i11 + 7]) & 255) << 56) | (((long) bArr[i11]) & 255) | ((((long) bArr[i11 + 1]) & 255) << 8) | ((((long) bArr[i11 + 2]) & 255) << 16) | ((((long) bArr[i11 + 3]) & 255) << 24) | ((((long) bArr[i11 + 4]) & 255) << 32) | ((((long) bArr[i11 + 5]) & 255) << 40) | ((((long) bArr[i11 + 6]) & 255) << 48);
    }

    public final int F() {
        int i11;
        int i12 = this.f2976g;
        int i13 = this.f2974e;
        if (i13 != i12) {
            int i14 = i12 + 1;
            byte[] bArr = this.f2973d;
            byte b8 = bArr[i12];
            if (b8 >= 0) {
                this.f2976g = i14;
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
                this.f2976g = i15;
                return i11;
            }
        }
        return (int) H();
    }

    public final long G() {
        long j9;
        long j11;
        long j12;
        long j13;
        int i11 = this.f2976g;
        int i12 = this.f2974e;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f2973d;
            byte b8 = bArr[i11];
            if (b8 >= 0) {
                this.f2976g = i13;
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
                        i14 = i16;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            j13 = (-2080896) ^ i19;
                        } else {
                            long j14 = i19;
                            i14 = i11 + 5;
                            long j15 = j14 ^ (((long) bArr[i18]) << 28);
                            if (j15 >= 0) {
                                j12 = 266354560;
                            } else {
                                i18 = i11 + 6;
                                long j16 = j15 ^ (((long) bArr[i14]) << 35);
                                if (j16 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i14 = i11 + 7;
                                    j15 = j16 ^ (((long) bArr[i18]) << 42);
                                    if (j15 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i18 = i11 + 8;
                                        j16 = j15 ^ (((long) bArr[i14]) << 49);
                                        if (j16 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i14 = i11 + 9;
                                            long j17 = (j16 ^ (((long) bArr[i18]) << 56)) ^ 71499008037633920L;
                                            if (j17 < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i14] >= 0) {
                                                    i14 = i21;
                                                }
                                            }
                                            j9 = j17;
                                        }
                                    }
                                }
                                j13 = j11 ^ j16;
                            }
                            j9 = j12 ^ j15;
                        }
                        i14 = i18;
                        j9 = j13;
                    }
                }
                this.f2976g = i14;
                return j9;
            }
        }
        return H();
    }

    public final long H() throws InvalidProtocolBufferException {
        long j9 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            if (this.f2976g == this.f2974e) {
                J(1);
            }
            int i12 = this.f2976g;
            this.f2976g = i12 + 1;
            byte b8 = this.f2973d[i12];
            j9 |= ((long) (b8 & ByteCompanionObject.MAX_VALUE)) << i11;
            if ((b8 & ByteCompanionObject.MIN_VALUE) == 0) {
                return j9;
            }
        }
        throw InvalidProtocolBufferException.c();
    }

    public final void I() {
        int i11 = this.f2974e + this.f2975f;
        this.f2974e = i11;
        int i12 = this.f2978i + i11;
        int i13 = this.f2979j;
        if (i12 <= i13) {
            this.f2975f = 0;
            return;
        }
        int i14 = i12 - i13;
        this.f2975f = i14;
        this.f2974e = i11 - i14;
    }

    public final void J(int i11) throws InvalidProtocolBufferException {
        if (L(i11)) {
            return;
        }
        if (i11 <= (Integer.MAX_VALUE - this.f2978i) - this.f2976g) {
            throw InvalidProtocolBufferException.e();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void K(int i11) throws InvalidProtocolBufferException {
        int i12 = this.f2974e;
        int i13 = this.f2976g;
        int i14 = i12 - i13;
        if (i11 <= i14 && i11 >= 0) {
            this.f2976g = i13 + i11;
            return;
        }
        FileInputStream fileInputStream = this.f2972c;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int i15 = this.f2978i;
        int i16 = i15 + i13;
        int i17 = i16 + i11;
        int i18 = this.f2979j;
        if (i17 > i18) {
            K((i18 - i15) - i13);
            throw InvalidProtocolBufferException.e();
        }
        this.f2978i = i16;
        this.f2974e = 0;
        this.f2976g = 0;
        while (i14 < i11) {
            long j9 = i11 - i14;
            try {
                try {
                    long jSkip = fileInputStream.skip(j9);
                    if (jSkip < 0 || jSkip > j9) {
                        throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i14 += (int) jSkip;
                    }
                } catch (InvalidProtocolBufferException e5) {
                    e5.f2927a = true;
                    throw e5;
                }
            } catch (Throwable th2) {
                this.f2978i += i14;
                I();
                throw th2;
            }
        }
        this.f2978i += i14;
        I();
        if (i14 >= i11) {
            return;
        }
        int i19 = this.f2974e;
        int i21 = i19 - this.f2976g;
        this.f2976g = i19;
        J(1);
        while (true) {
            int i22 = i11 - i21;
            int i23 = this.f2974e;
            if (i22 <= i23) {
                this.f2976g = i22;
                return;
            } else {
                i21 += i23;
                this.f2976g = i23;
                J(1);
            }
        }
    }

    public final boolean L(int i11) throws IOException {
        FileInputStream fileInputStream = this.f2972c;
        int i12 = this.f2976g;
        int i13 = i12 + i11;
        int i14 = this.f2974e;
        if (i13 <= i14) {
            h2.b(r8.k.h(i11, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i15 = this.f2978i;
        if (i11 <= (Integer.MAX_VALUE - i15) - i12 && i15 + i12 + i11 <= this.f2979j) {
            byte[] bArr = this.f2973d;
            if (i12 > 0) {
                if (i14 > i12) {
                    System.arraycopy(bArr, i12, bArr, 0, i14 - i12);
                }
                this.f2978i += i12;
                this.f2974e -= i12;
                this.f2976g = 0;
            }
            int i16 = this.f2974e;
            try {
                int i17 = fileInputStream.read(bArr, i16, Math.min(bArr.length - i16, (Integer.MAX_VALUE - this.f2978i) - i16));
                if (i17 == 0 || i17 < -1 || i17 > bArr.length) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i17 + "\nThe InputStream implementation is buggy.");
                }
                if (i17 > 0) {
                    this.f2974e += i17;
                    I();
                    if (this.f2974e >= i11) {
                        return true;
                    }
                    return L(i11);
                }
            } catch (InvalidProtocolBufferException e5) {
                e5.f2927a = true;
                throw e5;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void a(int i11) throws InvalidProtocolBufferException {
        if (this.f2977h != i11) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int b() {
        return this.f2978i + this.f2976g;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final boolean c() {
        return this.f2976g == this.f2974e && !L(1);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final void d(int i11) {
        this.f2979j = i11;
        I();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int e(int i11) throws InvalidProtocolBufferException {
        if (i11 < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int i12 = this.f2978i + this.f2976g + i11;
        if (i12 < 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int i13 = this.f2979j;
        if (i12 > i13) {
            throw InvalidProtocolBufferException.e();
        }
        this.f2979j = i12;
        I();
        return i13;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final boolean f() {
        return G() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final f g() throws IOException {
        int iF = F();
        int i11 = this.f2974e;
        int i12 = this.f2976g;
        int i13 = i11 - i12;
        byte[] bArr = this.f2973d;
        if (iF <= i13 && iF > 0) {
            f fVarD = f.d(i12, iF, bArr);
            this.f2976g += iF;
            return fVarD;
        }
        if (iF == 0) {
            return f.f2956c;
        }
        if (iF < 0) {
            throw InvalidProtocolBufferException.d();
        }
        byte[] bArrB = B(iF);
        if (bArrB != null) {
            return f.d(0, bArrB.length, bArrB);
        }
        int i14 = this.f2976g;
        int i15 = this.f2974e;
        int length = i15 - i14;
        this.f2978i += i15;
        this.f2976g = 0;
        this.f2974e = 0;
        ArrayList<byte[]> arrayListC = C(iF - length);
        byte[] bArr2 = new byte[iF];
        System.arraycopy(bArr, i14, bArr2, 0, length);
        for (byte[] bArr3 : arrayListC) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        f fVar = f.f2956c;
        return new f(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final double h() {
        return Double.longBitsToDouble(E());
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int i() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int j() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final long k() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final float l() {
        return Float.intBitsToFloat(D());
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int m() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final long n() {
        return G();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int o() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final long p() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int q() {
        int iF = F();
        return (-(iF & 1)) ^ (iF >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final long r() {
        long jG = G();
        return (-(jG & 1)) ^ (jG >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final String s() throws InvalidProtocolBufferException {
        int iF = F();
        byte[] bArr = this.f2973d;
        if (iF > 0) {
            int i11 = this.f2974e;
            int i12 = this.f2976g;
            if (iF <= i11 - i12) {
                String str = new String(bArr, i12, iF, b0.f2930a);
                this.f2976g += iF;
                return str;
            }
        }
        if (iF == 0) {
            return "";
        }
        if (iF < 0) {
            throw InvalidProtocolBufferException.d();
        }
        if (iF > this.f2974e) {
            return new String(A(iF), b0.f2930a);
        }
        J(iF);
        String str2 = new String(bArr, this.f2976g, iF, b0.f2930a);
        this.f2976g += iF;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final String t() throws IOException {
        int iF = F();
        int i11 = this.f2976g;
        int i12 = this.f2974e;
        int i13 = i12 - i11;
        byte[] bArrA = this.f2973d;
        if (iF <= i13 && iF > 0) {
            this.f2976g = i11 + iF;
        } else {
            if (iF == 0) {
                return "";
            }
            if (iF < 0) {
                throw InvalidProtocolBufferException.d();
            }
            i11 = 0;
            if (iF <= i12) {
                J(iF);
                this.f2976g = iF;
            } else {
                bArrA = A(iF);
            }
        }
        return q1.f3043a.q(i11, iF, bArrA);
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int u() throws InvalidProtocolBufferException {
        if (c()) {
            this.f2977h = 0;
            return 0;
        }
        int iF = F();
        this.f2977h = iF;
        if ((iF >>> 3) != 0) {
            return iF;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final int v() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final long w() {
        return G();
    }

    @Override // androidx.datastore.preferences.protobuf.i
    public final boolean x(int i11) throws InvalidProtocolBufferException {
        int i12 = i11 & 7;
        int i13 = 0;
        if (i12 != 0) {
            if (i12 == 1) {
                K(8);
                return true;
            }
            if (i12 == 2) {
                K(F());
                return true;
            }
            if (i12 == 3) {
                y();
                a(((i11 >>> 3) << 3) | 4);
                return true;
            }
            if (i12 == 4) {
                return false;
            }
            if (i12 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            K(4);
            return true;
        }
        int i14 = this.f2974e - this.f2976g;
        byte[] bArr = this.f2973d;
        if (i14 >= 10) {
            while (i13 < 10) {
                int i15 = this.f2976g;
                this.f2976g = i15 + 1;
                if (bArr[i15] < 0) {
                    i13++;
                }
            }
            throw InvalidProtocolBufferException.c();
        }
        while (i13 < 10) {
            if (this.f2976g == this.f2974e) {
                J(1);
            }
            int i16 = this.f2976g;
            this.f2976g = i16 + 1;
            if (bArr[i16] < 0) {
                i13++;
            }
        }
        throw InvalidProtocolBufferException.c();
        return true;
    }
}
