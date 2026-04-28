package atd.bb;

import com.braze.h2;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getDeviceData extends FilterInputStream {
    private final int[] BuildConfig;
    private final byte[] ChallengeResult;
    private final byte[][] ChallengeResultCancelled;
    private final int ChallengeResultCompleted;
    private int ChallengeResultError;
    private int ChallengeResultKt;
    private int ChallengeResultTimeout;
    private final byte[] getAdditionalDetails;
    private final int getMessageVersion;
    private final int[] getSDKEphemeralPublicKey;
    private final int getTransactionStatus;
    private int onCompletion;
    private static final byte[] getDeviceData = getSDKTransactionID.getDeviceData;
    private static final int[] getSDKAppID = getSDKTransactionID.getSDKReferenceNumber;
    private static final int[] getSDKTransactionID = getSDKTransactionID.AuthenticationRequestParameters;
    private static final int[] AuthenticationRequestParameters = getSDKTransactionID.getSDKTransactionID;
    private static final int[] getSDKReferenceNumber = getSDKTransactionID.getSDKAppID;

    private getDeviceData(InputStream inputStream, int i11, byte[] bArr, byte[][] bArr2, byte b8) {
        super(new BufferedInputStream(inputStream, 4096));
        this.BuildConfig = new int[4];
        this.ChallengeResult = new byte[16];
        this.getAdditionalDetails = new byte[16];
        this.ChallengeResultError = 1;
        this.ChallengeResultTimeout = Integer.MAX_VALUE;
        this.ChallengeResultKt = 16;
        this.onCompletion = 16;
        this.getMessageVersion = i11;
        this.getSDKEphemeralPublicKey = getSDKTransactionID.getDeviceData(bArr, i11);
        byte[][] bArr3 = new byte[bArr2.length][];
        for (int i12 = 0; i12 < bArr2.length; i12++) {
            bArr3[i12] = new byte[bArr2[i12].length];
            int i13 = 0;
            while (true) {
                byte[] bArr4 = bArr2[i12];
                if (i13 < bArr4.length) {
                    bArr3[i12][bArr4[i13]] = (byte) i13;
                    i13++;
                }
            }
        }
        this.ChallengeResultCancelled = bArr3;
        this.getTransactionStatus = 100;
        this.ChallengeResultCompleted = 100;
    }

    private void getSDKAppID(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.BuildConfig;
        char c3 = 1;
        char c7 = 2;
        char c8 = '\b';
        char c11 = 3;
        int i11 = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.getSDKEphemeralPublicKey;
        iArr[0] = i11 ^ iArr2[0];
        char c12 = 5;
        char c13 = 6;
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((bArr[11] & 255) | (((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8))) ^ iArr2[2];
        char c14 = 14;
        iArr[3] = (((((bArr[13] & 255) << 16) | (bArr[12] << 24)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255)) ^ iArr2[3];
        int i12 = 1;
        int i13 = 4;
        while (i12 < this.getMessageVersion) {
            int[] iArr3 = getSDKAppID;
            int[] iArr4 = this.BuildConfig;
            char c15 = c3;
            byte[][] bArr3 = this.ChallengeResultCancelled;
            byte[] bArr4 = bArr3[0];
            int i14 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = getSDKTransactionID;
            byte[] bArr5 = bArr3[c15];
            char c16 = c7;
            int i15 = i14 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = AuthenticationRequestParameters;
            byte[] bArr6 = bArr3[c16];
            char c17 = c11;
            int i16 = i15 ^ iArr6[(iArr4[bArr6[0]] >>> 8) & 255];
            int[] iArr7 = getSDKReferenceNumber;
            byte[] bArr7 = bArr3[c17];
            char c18 = c8;
            int i17 = i16 ^ iArr7[iArr4[bArr7[0]] & 255];
            int[] iArr8 = this.getSDKEphemeralPublicKey;
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
        int[] iArr9 = this.getSDKEphemeralPublicKey;
        int i23 = iArr9[i13];
        byte[] bArr8 = getDeviceData;
        int[] iArr10 = this.BuildConfig;
        byte[][] bArr9 = this.ChallengeResultCancelled;
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

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getSDKAppID();
        return this.onCompletion - this.ChallengeResultKt;
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
            getSDKAppID();
            int i15 = this.ChallengeResultKt;
            if (i15 >= this.onCompletion) {
                if (i14 == i11) {
                    return -1;
                }
                return i12 - (i13 - i14);
            }
            byte[] bArr2 = this.getAdditionalDetails;
            this.ChallengeResultKt = i15 + 1;
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
        getSDKAppID();
        int i11 = this.ChallengeResultKt;
        if (i11 >= this.onCompletion) {
            return -1;
        }
        byte[] bArr = this.getAdditionalDetails;
        this.ChallengeResultKt = i11 + 1;
        return bArr[i11] & 255;
    }

    public getDeviceData(InputStream inputStream, int i11, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i11, bArr, bArr2, (byte) 0);
    }

    private int getSDKAppID() throws IOException {
        if (this.ChallengeResultTimeout == Integer.MAX_VALUE) {
            this.ChallengeResultTimeout = ((FilterInputStream) this).in.read();
        }
        if (this.ChallengeResultKt == 16) {
            byte[] bArr = this.ChallengeResult;
            int i11 = this.ChallengeResultTimeout;
            bArr[0] = (byte) i11;
            if (i11 < 0) {
                h2.b("unexpected block size");
                return 0;
            }
            int i12 = 1;
            do {
                int i13 = ((FilterInputStream) this).in.read(this.ChallengeResult, i12, 16 - i12);
                if (i13 <= 0) {
                    break;
                }
                i12 += i13;
            } while (i12 < 16);
            if (i12 >= 16) {
                int i14 = this.getTransactionStatus;
                if (i14 == this.ChallengeResultCompleted) {
                    getSDKAppID(this.ChallengeResult, this.getAdditionalDetails);
                } else {
                    int i15 = this.ChallengeResultError;
                    byte[] bArr2 = this.ChallengeResult;
                    if (i15 <= i14) {
                        getSDKAppID(bArr2, this.getAdditionalDetails);
                    } else {
                        System.arraycopy(bArr2, 0, this.getAdditionalDetails, 0, bArr2.length);
                    }
                    int i16 = this.ChallengeResultError;
                    if (i16 < this.ChallengeResultCompleted) {
                        this.ChallengeResultError = i16 + 1;
                    } else {
                        this.ChallengeResultError = 1;
                    }
                }
                int i17 = ((FilterInputStream) this).in.read();
                this.ChallengeResultTimeout = i17;
                this.ChallengeResultKt = 0;
                this.onCompletion = i17 < 0 ? 16 - (this.getAdditionalDetails[15] & 255) : 16;
            } else {
                h2.b("unexpected block size");
                return 0;
            }
        }
        return this.onCompletion;
    }
}
