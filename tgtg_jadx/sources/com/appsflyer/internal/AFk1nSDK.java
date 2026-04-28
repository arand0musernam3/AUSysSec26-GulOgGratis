package com.appsflyer.internal;

import com.braze.h2;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFk1nSDK extends FilterInputStream {
    private int AFKeystoreWrapper;
    private final int[] areAllFieldsValid;
    private final int[] component1;
    private final int component2;
    private final byte[][] component3;
    private final byte[] component4;
    private final int copy;
    private final int copydefault;
    private int equals;
    private int hashCode;
    private int registerClient;
    private final byte[] toString;
    private static final byte[] getMediationNetwork = AFk1sSDK.getCurrencyIso4217Code;
    private static final int[] getCurrencyIso4217Code = AFk1sSDK.AFAdRevenueData;
    private static final int[] AFAdRevenueData = AFk1sSDK.getMediationNetwork;
    private static final int[] getMonetizationNetwork = AFk1sSDK.getRevenue;
    private static final int[] getRevenue = AFk1sSDK.getMonetizationNetwork;

    private AFk1nSDK(InputStream inputStream, int i11, byte[] bArr, byte[][] bArr2, byte b8) {
        super(new BufferedInputStream(inputStream, 4096));
        this.areAllFieldsValid = new int[4];
        this.component4 = new byte[16];
        this.toString = new byte[16];
        this.equals = 1;
        this.hashCode = Integer.MAX_VALUE;
        this.AFKeystoreWrapper = 16;
        this.registerClient = 16;
        this.component2 = i11;
        this.component1 = AFk1sSDK.getCurrencyIso4217Code(bArr, i11);
        this.component3 = getMonetizationNetwork(bArr2);
        this.copydefault = 100;
        this.copy = 100;
    }

    private void AFAdRevenueData(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.areAllFieldsValid;
        char c3 = 1;
        char c7 = 2;
        char c8 = '\b';
        char c11 = 3;
        int i11 = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.component1;
        iArr[0] = i11 ^ iArr2[0];
        char c12 = 5;
        char c13 = 6;
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((bArr[11] & 255) | (((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8))) ^ iArr2[2];
        char c14 = 14;
        iArr[3] = (((((bArr[13] & 255) << 16) | (bArr[12] << 24)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255)) ^ iArr2[3];
        int i12 = 1;
        int i13 = 4;
        while (i12 < this.component2) {
            int[] iArr3 = getCurrencyIso4217Code;
            int[] iArr4 = this.areAllFieldsValid;
            char c15 = c3;
            byte[][] bArr3 = this.component3;
            byte[] bArr4 = bArr3[0];
            int i14 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = AFAdRevenueData;
            byte[] bArr5 = bArr3[c15];
            char c16 = c7;
            int i15 = i14 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = getMonetizationNetwork;
            byte[] bArr6 = bArr3[c16];
            char c17 = c11;
            int i16 = i15 ^ iArr6[(iArr4[bArr6[0]] >>> 8) & 255];
            int[] iArr7 = getRevenue;
            byte[] bArr7 = bArr3[c17];
            char c18 = c8;
            int i17 = i16 ^ iArr7[iArr4[bArr7[0]] & 255];
            int[] iArr8 = this.component1;
            int i18 = i17 ^ iArr8[i13];
            char c19 = c14;
            char c21 = c12;
            int i19 = (((iArr3[iArr4[bArr4[c15]] >>> 24] ^ iArr5[(iArr4[bArr5[c15]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c15]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c15]] & 255]) ^ iArr8[i13 + 1];
            int i21 = (((iArr3[iArr4[bArr4[c16]] >>> 24] ^ iArr5[(iArr4[bArr5[c16]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c16]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c16]] & 255]) ^ iArr8[i13 + 2];
            int i22 = (((iArr3[iArr4[bArr4[c17]] >>> 24] ^ iArr5[(iArr4[bArr5[c17]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c17]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c17]] & 255]) ^ iArr8[i13 + 3];
            iArr4[0] = i18;
            iArr4[c15] = i19;
            iArr4[c16] = i21;
            iArr4[c17] = i22;
            i12++;
            i13 += 4;
            c3 = c15;
            c7 = c16;
            c11 = c17;
            c8 = c18;
            c12 = c21;
            c14 = c19;
            c13 = c13;
        }
        char c22 = c3;
        char c23 = c7;
        char c24 = c11;
        char c25 = c8;
        char c26 = c14;
        int[] iArr9 = this.component1;
        int i23 = iArr9[i13];
        byte[] bArr8 = getMediationNetwork;
        int[] iArr10 = this.areAllFieldsValid;
        byte[][] bArr9 = this.component3;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i23 >>> 24));
        byte[] bArr11 = bArr9[c22];
        bArr2[c22] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i23 >>> 16));
        byte[] bArr12 = bArr9[c23];
        bArr2[c23] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i23 >>> 8));
        byte[] bArr13 = bArr9[c24];
        bArr2[c24] = (byte) (i23 ^ bArr8[iArr10[bArr13[0]] & 255]);
        int i24 = iArr9[i13 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[c22]] >>> 24] ^ (i24 >>> 24));
        bArr2[c12] = (byte) (bArr8[(iArr10[bArr11[c22]] >>> 16) & 255] ^ (i24 >>> 16));
        bArr2[c13] = (byte) (bArr8[(iArr10[bArr12[c22]] >>> 8) & 255] ^ (i24 >>> 8));
        bArr2[7] = (byte) (i24 ^ bArr8[iArr10[bArr13[c22]] & 255]);
        int i25 = iArr9[i13 + 2];
        bArr2[c25] = (byte) (bArr8[iArr10[bArr10[c23]] >>> 24] ^ (i25 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[c23]] >>> 16) & 255] ^ (i25 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[c23]] >>> 8) & 255] ^ (i25 >>> 8));
        bArr2[11] = (byte) (i25 ^ bArr8[iArr10[bArr13[c23]] & 255]);
        int i26 = iArr9[i13 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[c24]] >>> 24] ^ (i26 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[c24]] >>> 16) & 255] ^ (i26 >>> 16));
        bArr2[c26] = (byte) (bArr8[(iArr10[bArr12[c24]] >>> 8) & 255] ^ (i26 >>> 8));
        bArr2[15] = (byte) (i26 ^ bArr8[iArr10[bArr13[c24]] & 255]);
    }

    private int getMonetizationNetwork() throws IOException {
        if (this.hashCode == Integer.MAX_VALUE) {
            this.hashCode = ((FilterInputStream) this).in.read();
        }
        if (this.AFKeystoreWrapper == 16) {
            byte[] bArr = this.component4;
            int i11 = this.hashCode;
            bArr[0] = (byte) i11;
            if (i11 < 0) {
                h2.b("unexpected block size");
                return 0;
            }
            int i12 = 1;
            do {
                int i13 = ((FilterInputStream) this).in.read(this.component4, i12, 16 - i12);
                if (i13 <= 0) {
                    break;
                }
                i12 += i13;
            } while (i12 < 16);
            if (i12 < 16) {
                h2.b("unexpected block size");
                return 0;
            }
            int i14 = this.copydefault;
            if (i14 == this.copy) {
                AFAdRevenueData(this.component4, this.toString);
            } else {
                int i15 = this.equals;
                byte[] bArr2 = this.component4;
                if (i15 <= i14) {
                    AFAdRevenueData(bArr2, this.toString);
                } else {
                    System.arraycopy(bArr2, 0, this.toString, 0, bArr2.length);
                }
                int i16 = this.equals;
                if (i16 < this.copy) {
                    this.equals = i16 + 1;
                } else {
                    this.equals = 1;
                }
            }
            int i17 = ((FilterInputStream) this).in.read();
            this.hashCode = i17;
            this.AFKeystoreWrapper = 0;
            this.registerClient = i17 < 0 ? 16 - (this.toString[15] & 255) : 16;
        }
        return this.registerClient;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getMonetizationNetwork();
        return this.registerClient - this.AFKeystoreWrapper;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i11) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = i11 + i12;
        for (int i14 = i11; i14 < i13; i14++) {
            getMonetizationNetwork();
            int i15 = this.AFKeystoreWrapper;
            if (i15 >= this.registerClient) {
                if (i14 == i11) {
                    return -1;
                }
                return i12 - (i13 - i14);
            }
            byte[] bArr2 = this.toString;
            this.AFKeystoreWrapper = i15 + 1;
            bArr[i14] = bArr2[i15];
        }
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j9) throws IOException {
        long j11 = 0;
        while (j11 < j9 && read() != -1) {
            j11++;
        }
        return j11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        getMonetizationNetwork();
        int i11 = this.AFKeystoreWrapper;
        if (i11 >= this.registerClient) {
            return -1;
        }
        byte[] bArr = this.toString;
        this.AFKeystoreWrapper = i11 + 1;
        return bArr[i11] & 255;
    }

    public AFk1nSDK(InputStream inputStream, int i11, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i11, bArr, bArr2, (byte) 0);
    }

    private static byte[][] getMonetizationNetwork(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr2[i11] = new byte[bArr[i11].length];
            int i12 = 0;
            while (true) {
                byte[] bArr3 = bArr[i11];
                if (i12 < bArr3.length) {
                    bArr2[i11][bArr3[i12]] = (byte) i12;
                    i12++;
                }
            }
        }
        return bArr2;
    }
}
