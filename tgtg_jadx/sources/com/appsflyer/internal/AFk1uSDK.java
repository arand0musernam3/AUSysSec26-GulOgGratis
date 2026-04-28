package com.appsflyer.internal;

import com.braze.h2;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFk1uSDK extends FilterInputStream {
    private long[] AFAdRevenueData;
    private int areAllFieldsValid;
    private byte[] component1;
    private int component2;
    private long[] component3;
    private short component4;
    private int copydefault;
    private final int getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private int getMonetizationNetwork;
    private final int getRevenue;

    private AFk1uSDK(InputStream inputStream, int i11, int i12, short s7, int i13, int i14, byte b8) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.getMonetizationNetwork = 1;
        this.areAllFieldsValid = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max((int) s7, 4), 8);
        this.getMediationNetwork = iMin;
        this.component1 = new byte[iMin];
        this.AFAdRevenueData = new long[4];
        this.component3 = new long[4];
        this.component2 = iMin;
        this.copydefault = iMin;
        this.AFAdRevenueData = AFk1vSDK.getMediationNetwork(i11 ^ i14, iMin ^ i14);
        this.component3 = AFk1vSDK.getMediationNetwork(i12 ^ i14, i13 ^ i14);
        this.getCurrencyIso4217Code = 100;
        this.getRevenue = 100;
    }

    private int getCurrencyIso4217Code() throws IOException {
        if (this.areAllFieldsValid == Integer.MAX_VALUE) {
            this.areAllFieldsValid = ((FilterInputStream) this).in.read();
        }
        if (this.component2 == this.getMediationNetwork) {
            byte[] bArr = this.component1;
            int i11 = this.areAllFieldsValid;
            bArr[0] = (byte) i11;
            if (i11 < 0) {
                h2.b("unexpected block size");
                return 0;
            }
            int i12 = 1;
            do {
                int i13 = ((FilterInputStream) this).in.read(this.component1, i12, this.getMediationNetwork - i12);
                if (i13 <= 0) {
                    break;
                }
                i12 += i13;
            } while (i12 < this.getMediationNetwork);
            if (i12 < this.getMediationNetwork) {
                h2.b("unexpected block size");
                return 0;
            }
            int i14 = this.getCurrencyIso4217Code;
            if (i14 == this.getRevenue) {
                getMediationNetwork();
            } else {
                if (this.getMonetizationNetwork <= i14) {
                    getMediationNetwork();
                }
                int i15 = this.getMonetizationNetwork;
                if (i15 < this.getRevenue) {
                    this.getMonetizationNetwork = i15 + 1;
                } else {
                    this.getMonetizationNetwork = 1;
                }
            }
            int i16 = ((FilterInputStream) this).in.read();
            this.areAllFieldsValid = i16;
            this.component2 = 0;
            int i17 = this.getMediationNetwork;
            if (i16 < 0) {
                i17 -= this.component1[i17 - 1] & 255;
            }
            this.copydefault = i17;
        }
        return this.copydefault;
    }

    private void getMediationNetwork() {
        long[] jArr = this.AFAdRevenueData;
        long[] jArr2 = this.component3;
        short s7 = this.component4;
        long j9 = jArr[s7 % 4] * 2147483085;
        long j11 = jArr2[(s7 + 2) % 4];
        int i11 = (s7 + 3) % 4;
        jArr2[i11] = ((jArr[i11] * 2147483085) + j11) / 2147483647L;
        jArr[i11] = (j9 + j11) % 2147483647L;
        for (int i12 = 0; i12 < this.getMediationNetwork; i12++) {
            this.component1[i12] = (byte) (((long) r1[i12]) ^ ((this.AFAdRevenueData[this.component4] >> (i12 << 3)) & 255));
        }
        this.component4 = (short) ((this.component4 + 1) % 4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getCurrencyIso4217Code();
        return this.copydefault - this.component2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = i11 + i12;
        for (int i14 = i11; i14 < i13; i14++) {
            getCurrencyIso4217Code();
            int i15 = this.component2;
            if (i15 >= this.copydefault) {
                if (i14 == i11) {
                    return -1;
                }
                return i12 - (i13 - i14);
            }
            byte[] bArr2 = this.component1;
            this.component2 = i15 + 1;
            bArr[i14] = bArr2[i15];
        }
        return i12;
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
    public final int read() throws IOException {
        getCurrencyIso4217Code();
        int i11 = this.component2;
        if (i11 >= this.copydefault) {
            return -1;
        }
        byte[] bArr = this.component1;
        this.component2 = i11 + 1;
        return bArr[i11] & 255;
    }

    public AFk1uSDK(InputStream inputStream, int i11, int i12, short s7, int i13, int i14) throws IOException {
        this(inputStream, i11, i12, s7, i13, i14, (byte) 0);
    }
}
