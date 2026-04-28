package atd.bb;

import com.adyen.checkout.ui.core.internal.ui.view.RoundCornerImageView;
import com.braze.h2;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKEphemeralPublicKey extends FilterInputStream {
    private static final short getDeviceData = (short) (Math.pow(2.0d, 15.0d) * (Math.sqrt(5.0d) - 1.0d));
    private int AuthenticationRequestParameters;
    private int BuildConfig;
    private int ChallengeResult;
    private int ChallengeResultCancelled;
    private final int ChallengeResultCompleted;
    private int ChallengeResultError;
    private final int ChallengeResultTimeout;
    private int getAdditionalDetails;
    private int getMessageVersion;
    private byte[] getSDKAppID;
    private int getSDKEphemeralPublicKey;
    private byte[] getSDKReferenceNumber;
    private byte[] getSDKTransactionID;
    private int getTransactionStatus;
    private int onCompletion;

    private getSDKEphemeralPublicKey(InputStream inputStream, int[] iArr, int i11, byte[] bArr, int i12, int i13, byte b8) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.getMessageVersion = Integer.MAX_VALUE;
        this.onCompletion = 1;
        this.getSDKReferenceNumber = new byte[8];
        this.getSDKAppID = new byte[8];
        this.getSDKTransactionID = new byte[8];
        this.AuthenticationRequestParameters = 8;
        this.getSDKEphemeralPublicKey = 8;
        this.ChallengeResult = Math.min(Math.max(i12, 5), 16);
        this.ChallengeResultCancelled = i13;
        if (i13 == 3) {
            System.arraycopy(bArr, 0, this.getSDKAppID, 0, 8);
        }
        long j9 = (((long) iArr[1]) & 4294967295L) | ((((long) iArr[0]) & 4294967295L) << 32);
        if (i11 == 0) {
            this.BuildConfig = (int) j9;
            long j11 = j9 >> 3;
            short s7 = getDeviceData;
            this.getTransactionStatus = (int) ((((long) s7) * j11) >> 32);
            this.ChallengeResultError = (int) (j9 >> 32);
            this.getAdditionalDetails = (int) (j11 + ((long) s7));
        } else {
            int i14 = (int) j9;
            this.BuildConfig = i14;
            this.getTransactionStatus = i14 * i11;
            this.ChallengeResultError = i11 ^ i14;
            this.getAdditionalDetails = (int) (j9 >> 32);
        }
        this.ChallengeResultCompleted = 100;
        this.ChallengeResultTimeout = 100;
    }

    private void getSDKAppID() {
        if (this.ChallengeResultCancelled == 3) {
            byte[] bArr = this.getSDKReferenceNumber;
            System.arraycopy(bArr, 0, this.getSDKTransactionID, 0, bArr.length);
        }
        byte[] bArr2 = this.getSDKReferenceNumber;
        boolean z11 = true;
        char c3 = 2;
        int i11 = ((bArr2[0] << 24) & RoundCornerImageView.DEFAULT_STROKE_COLOR) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i12 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i13 = 0;
        while (true) {
            int i14 = this.ChallengeResult;
            if (i13 >= i14) {
                break;
            }
            short s7 = getDeviceData;
            i12 -= ((((i14 - i13) * s7) + i11) ^ ((i11 << 4) + this.ChallengeResultError)) ^ ((i11 >>> 5) + this.getAdditionalDetails);
            i11 -= (((i12 << 4) + this.BuildConfig) ^ (((i14 - i13) * s7) + i12)) ^ ((i12 >>> 5) + this.getTransactionStatus);
            i13++;
            c3 = c3;
            z11 = z11;
        }
        byte[] bArr3 = this.getSDKReferenceNumber;
        bArr3[0] = (byte) (i11 >> 24);
        bArr3[z11 ? 1 : 0] = (byte) (i11 >> 16);
        bArr3[c3] = (byte) (i11 >> 8);
        bArr3[3] = (byte) i11;
        bArr3[4] = (byte) (i12 >> 24);
        bArr3[5] = (byte) (i12 >> 16);
        bArr3[6] = (byte) (i12 >> 8);
        bArr3[7] = (byte) i12;
        if (this.ChallengeResultCancelled == 3) {
            for (int i15 = 0; i15 < 8; i15++) {
                byte[] bArr4 = this.getSDKReferenceNumber;
                bArr4[i15] = (byte) (bArr4[i15] ^ this.getSDKAppID[i15]);
            }
            byte[] bArr5 = this.getSDKTransactionID;
            System.arraycopy(bArr5, 0, this.getSDKAppID, 0, bArr5.length);
        }
    }

    private int getSDKTransactionID() throws IOException {
        if (this.getMessageVersion == Integer.MAX_VALUE) {
            this.getMessageVersion = ((FilterInputStream) this).in.read();
        }
        if (this.AuthenticationRequestParameters == 8) {
            byte[] bArr = this.getSDKReferenceNumber;
            int i11 = this.getMessageVersion;
            bArr[0] = (byte) i11;
            if (i11 < 0) {
                h2.b("unexpected block size");
                return 0;
            }
            int i12 = 1;
            do {
                int i13 = ((FilterInputStream) this).in.read(this.getSDKReferenceNumber, i12, 8 - i12);
                if (i13 <= 0) {
                    break;
                }
                i12 += i13;
            } while (i12 < 8);
            if (i12 < 8) {
                h2.b("unexpected block size");
                return 0;
            }
            int i14 = this.ChallengeResultCompleted;
            if (i14 == this.ChallengeResultTimeout) {
                getSDKAppID();
            } else {
                if (this.onCompletion <= i14) {
                    getSDKAppID();
                }
                int i15 = this.onCompletion;
                if (i15 < this.ChallengeResultTimeout) {
                    this.onCompletion = i15 + 1;
                } else {
                    this.onCompletion = 1;
                }
            }
            int i16 = ((FilterInputStream) this).in.read();
            this.getMessageVersion = i16;
            this.AuthenticationRequestParameters = 0;
            this.getSDKEphemeralPublicKey = i16 < 0 ? 8 - (this.getSDKReferenceNumber[7] & 255) : 8;
        }
        return this.getSDKEphemeralPublicKey;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getSDKTransactionID();
        return this.getSDKEphemeralPublicKey - this.AuthenticationRequestParameters;
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
            int i15 = this.AuthenticationRequestParameters;
            if (i15 >= this.getSDKEphemeralPublicKey) {
                if (i14 == i11) {
                    return -1;
                }
                return i12 - (i13 - i14);
            }
            byte[] bArr2 = this.getSDKReferenceNumber;
            this.AuthenticationRequestParameters = i15 + 1;
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
        int i11 = this.AuthenticationRequestParameters;
        if (i11 >= this.getSDKEphemeralPublicKey) {
            return -1;
        }
        byte[] bArr = this.getSDKReferenceNumber;
        this.AuthenticationRequestParameters = i11 + 1;
        return bArr[i11] & 255;
    }

    public getSDKEphemeralPublicKey(InputStream inputStream, int[] iArr, int i11, byte[] bArr, int i12, int i13) throws IOException {
        this(inputStream, iArr, i11, bArr, i12, i13, (byte) 0);
    }
}
