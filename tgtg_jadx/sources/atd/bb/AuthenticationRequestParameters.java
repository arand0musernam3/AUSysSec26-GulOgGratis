package atd.bb;

import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import com.braze.h2;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class AuthenticationRequestParameters extends FilterInputStream {
    private int AuthenticationRequestParameters;
    private byte[] BuildConfig;
    private int ChallengeResult;
    private int[] ChallengeResultCancelled;
    private int ChallengeResultCompleted;
    private int ChallengeResultTimeout;
    private final int getDeviceData;
    private byte[] getMessageVersion;
    private final int getSDKAppID;
    private byte[] getSDKEphemeralPublicKey;
    private getSDKReferenceNumber getSDKReferenceNumber;
    private final int getSDKTransactionID;
    private int getTransactionStatus;

    private AuthenticationRequestParameters(InputStream inputStream, int[] iArr, byte[] bArr, int i11, boolean z11, int i12, byte b8) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.AuthenticationRequestParameters = 1;
        this.ChallengeResultCompleted = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max(i11, 3), 16);
        this.getSDKTransactionID = iMin;
        this.BuildConfig = new byte[8];
        byte[] bArr2 = new byte[8];
        this.getSDKEphemeralPublicKey = bArr2;
        this.getMessageVersion = new byte[8];
        this.ChallengeResultCancelled = new int[2];
        this.ChallengeResult = 8;
        this.getTransactionStatus = 8;
        this.ChallengeResultTimeout = i12;
        if (i12 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.getSDKReferenceNumber = new getSDKReferenceNumber(iArr, iMin, true, z11);
        this.getDeviceData = 100;
        this.getSDKAppID = 100;
    }

    private void getSDKAppID() {
        if (this.ChallengeResultTimeout == 2) {
            byte[] bArr = this.BuildConfig;
            System.arraycopy(bArr, 0, this.getMessageVersion, 0, bArr.length);
        }
        byte[] bArr2 = this.BuildConfig;
        int i11 = ((bArr2[0] << 24) & RoundCornerImageView.DEFAULT_STROKE_COLOR) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i12 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i13 = this.getSDKTransactionID;
        getSDKReferenceNumber getsdkreferencenumber = this.getSDKReferenceNumber;
        getSDKAppID.AuthenticationRequestParameters(i11, i12, false, i13, getsdkreferencenumber.getDeviceData, getsdkreferencenumber.getSDKReferenceNumber, this.ChallengeResultCancelled);
        int[] iArr = this.ChallengeResultCancelled;
        int i14 = iArr[0];
        int i15 = iArr[1];
        byte[] bArr3 = this.BuildConfig;
        bArr3[0] = (byte) (i14 >> 24);
        bArr3[1] = (byte) (i14 >> 16);
        bArr3[2] = (byte) (i14 >> 8);
        bArr3[3] = (byte) i14;
        bArr3[4] = (byte) (i15 >> 24);
        bArr3[5] = (byte) (i15 >> 16);
        bArr3[6] = (byte) (i15 >> 8);
        bArr3[7] = (byte) i15;
        if (this.ChallengeResultTimeout == 2) {
            for (int i16 = 0; i16 < 8; i16++) {
                byte[] bArr4 = this.BuildConfig;
                bArr4[i16] = (byte) (bArr4[i16] ^ this.getSDKEphemeralPublicKey[i16]);
            }
            byte[] bArr5 = this.getMessageVersion;
            System.arraycopy(bArr5, 0, this.getSDKEphemeralPublicKey, 0, bArr5.length);
        }
    }

    private int getSDKTransactionID() throws IOException {
        if (this.ChallengeResultCompleted == Integer.MAX_VALUE) {
            this.ChallengeResultCompleted = ((FilterInputStream) this).in.read();
        }
        if (this.ChallengeResult == 8) {
            byte[] bArr = this.BuildConfig;
            int i11 = this.ChallengeResultCompleted;
            bArr[0] = (byte) i11;
            if (i11 < 0) {
                h2.b("unexpected block size");
                return 0;
            }
            int i12 = 1;
            do {
                int i13 = ((FilterInputStream) this).in.read(this.BuildConfig, i12, 8 - i12);
                if (i13 <= 0) {
                    break;
                }
                i12 += i13;
            } while (i12 < 8);
            if (i12 < 8) {
                h2.b("unexpected block size");
                return 0;
            }
            int i14 = this.getDeviceData;
            if (i14 == this.getSDKAppID) {
                getSDKAppID();
            } else {
                if (this.AuthenticationRequestParameters <= i14) {
                    getSDKAppID();
                }
                int i15 = this.AuthenticationRequestParameters;
                if (i15 < this.getSDKAppID) {
                    this.AuthenticationRequestParameters = i15 + 1;
                } else {
                    this.AuthenticationRequestParameters = 1;
                }
            }
            int i16 = ((FilterInputStream) this).in.read();
            this.ChallengeResultCompleted = i16;
            this.ChallengeResult = 0;
            this.getTransactionStatus = i16 < 0 ? 8 - (this.BuildConfig[7] & 255) : 8;
        }
        return this.getTransactionStatus;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getSDKTransactionID();
        return this.getTransactionStatus - this.ChallengeResult;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = i11 + i12;
        for (int i14 = i11; i14 < i13; i14++) {
            getSDKTransactionID();
            int i15 = this.ChallengeResult;
            if (i15 >= this.getTransactionStatus) {
                if (i14 == i11) {
                    return -1;
                }
                return i12 - (i13 - i14);
            }
            byte[] bArr2 = this.BuildConfig;
            this.ChallengeResult = i15 + 1;
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
        getSDKTransactionID();
        int i11 = this.ChallengeResult;
        if (i11 >= this.getTransactionStatus) {
            return -1;
        }
        byte[] bArr = this.BuildConfig;
        this.ChallengeResult = i11 + 1;
        return bArr[i11] & 255;
    }

    public AuthenticationRequestParameters(InputStream inputStream, int[] iArr, byte[] bArr, int i11, boolean z11, int i12) throws IOException {
        this(inputStream, iArr, bArr, i11, z11, i12, (byte) 0);
    }
}
