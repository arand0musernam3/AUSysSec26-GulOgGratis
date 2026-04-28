package com.appsflyer.internal;

import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import com.braze.h2;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFk1tSDK extends FilterInputStream {
    private int AFAdRevenueData;
    private int[] areAllFieldsValid;
    private byte[] component1;
    private byte[] component2;
    private byte[] component3;
    private int component4;
    private int equals;
    private final int getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private final int getMonetizationNetwork;
    private AFk1xSDK getRevenue;
    private int hashCode;
    private int toString;

    private AFk1tSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i11, boolean z11, int i12, byte b8) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.AFAdRevenueData = 1;
        this.hashCode = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max(i11, 3), 16);
        this.getCurrencyIso4217Code = iMin;
        this.component1 = new byte[8];
        byte[] bArr2 = new byte[8];
        this.component2 = bArr2;
        this.component3 = new byte[8];
        this.areAllFieldsValid = new int[2];
        this.component4 = 8;
        this.equals = 8;
        this.toString = i12;
        if (i12 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.getRevenue = new AFk1xSDK(iArr, iMin, true, false);
        this.getMonetizationNetwork = 100;
        this.getMediationNetwork = 100;
    }

    private int AFAdRevenueData() throws IOException {
        if (this.hashCode == Integer.MAX_VALUE) {
            this.hashCode = ((FilterInputStream) this).in.read();
        }
        if (this.component4 == 8) {
            byte[] bArr = this.component1;
            int i11 = this.hashCode;
            bArr[0] = (byte) i11;
            if (i11 < 0) {
                h2.b("unexpected block size");
                return 0;
            }
            int i12 = 1;
            do {
                int i13 = ((FilterInputStream) this).in.read(this.component1, i12, 8 - i12);
                if (i13 <= 0) {
                    break;
                }
                i12 += i13;
            } while (i12 < 8);
            if (i12 < 8) {
                h2.b("unexpected block size");
                return 0;
            }
            int i14 = this.getMonetizationNetwork;
            if (i14 == this.getMediationNetwork) {
                getMediationNetwork();
            } else {
                if (this.AFAdRevenueData <= i14) {
                    getMediationNetwork();
                }
                int i15 = this.AFAdRevenueData;
                if (i15 < this.getMediationNetwork) {
                    this.AFAdRevenueData = i15 + 1;
                } else {
                    this.AFAdRevenueData = 1;
                }
            }
            int i16 = ((FilterInputStream) this).in.read();
            this.hashCode = i16;
            this.component4 = 0;
            this.equals = i16 < 0 ? 8 - (this.component1[7] & 255) : 8;
        }
        return this.equals;
    }

    private void getMediationNetwork() {
        if (this.toString == 2) {
            byte[] bArr = this.component1;
            System.arraycopy(bArr, 0, this.component3, 0, bArr.length);
        }
        byte[] bArr2 = this.component1;
        int i11 = ((bArr2[0] << 24) & RoundCornerImageView.DEFAULT_STROKE_COLOR) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i12 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i13 = this.getCurrencyIso4217Code;
        AFk1xSDK aFk1xSDK = this.getRevenue;
        AFk1rSDK.getRevenue(i11, i12, false, i13, aFk1xSDK.getCurrencyIso4217Code, aFk1xSDK.AFAdRevenueData, this.areAllFieldsValid);
        int[] iArr = this.areAllFieldsValid;
        int i14 = iArr[0];
        int i15 = iArr[1];
        byte[] bArr3 = this.component1;
        bArr3[0] = (byte) (i14 >> 24);
        bArr3[1] = (byte) (i14 >> 16);
        bArr3[2] = (byte) (i14 >> 8);
        bArr3[3] = (byte) i14;
        bArr3[4] = (byte) (i15 >> 24);
        bArr3[5] = (byte) (i15 >> 16);
        bArr3[6] = (byte) (i15 >> 8);
        bArr3[7] = (byte) i15;
        if (this.toString == 2) {
            for (int i16 = 0; i16 < 8; i16++) {
                byte[] bArr4 = this.component1;
                bArr4[i16] = (byte) (bArr4[i16] ^ this.component2[i16]);
            }
            byte[] bArr5 = this.component3;
            System.arraycopy(bArr5, 0, this.component2, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFAdRevenueData();
        return this.equals - this.component4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = i11 + i12;
        for (int i14 = i11; i14 < i13; i14++) {
            AFAdRevenueData();
            int i15 = this.component4;
            if (i15 >= this.equals) {
                if (i14 == i11) {
                    return -1;
                }
                return i12 - (i13 - i14);
            }
            byte[] bArr2 = this.component1;
            this.component4 = i15 + 1;
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
        AFAdRevenueData();
        int i11 = this.component4;
        if (i11 >= this.equals) {
            return -1;
        }
        byte[] bArr = this.component1;
        this.component4 = i11 + 1;
        return bArr[i11] & 255;
    }

    public AFk1tSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i11, boolean z11, int i12) throws IOException {
        this(inputStream, iArr, bArr, i11, false, i12, (byte) 0);
    }
}
