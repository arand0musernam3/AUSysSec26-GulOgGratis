package atd.bb;

import i4.a;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKTransactionID {
    private static byte[] BuildConfig = new byte[256];
    static final byte[] getDeviceData = new byte[256];
    static final int[] getSDKReferenceNumber = new int[256];
    static final int[] AuthenticationRequestParameters = new int[256];
    static final int[] getSDKTransactionID = new int[256];
    static final int[] getSDKAppID = new int[256];
    private static int[] getMessageVersion = new int[10];

    static {
        byte[] bArr;
        int i11;
        byte b8 = 1;
        byte b11 = 1;
        do {
            b8 = (byte) (((b8 & ByteCompanionObject.MIN_VALUE) != 0 ? 27 : 0) ^ ((b8 << 1) ^ b8));
            byte b12 = (byte) (b11 ^ (b11 << 1));
            byte b13 = (byte) (b12 ^ (b12 << 2));
            byte b14 = (byte) (b13 ^ (b13 << 4));
            b11 = (byte) (b14 ^ ((b14 & ByteCompanionObject.MIN_VALUE) != 0 ? (byte) 9 : (byte) 0));
            bArr = BuildConfig;
            i11 = b8 & 255;
            int i12 = b11 & 255;
            bArr[i11] = (byte) (((((b11 ^ 99) ^ ((i12 << 1) | (i12 >> 7))) ^ ((i12 << 2) | (i12 >> 6))) ^ ((i12 << 3) | (i12 >> 5))) ^ ((i12 >> 4) | (i12 << 4)));
        } while (i11 != 1);
        bArr[0] = 99;
        for (int i13 = 0; i13 < 256; i13++) {
            int i14 = BuildConfig[i13] & 255;
            getDeviceData[i14] = (byte) i13;
            int i15 = i13 << 1;
            if (i15 >= 256) {
                i15 ^= 283;
            }
            int i16 = i15 << 1;
            if (i16 >= 256) {
                i16 ^= 283;
            }
            int i17 = i16 << 1;
            if (i17 >= 256) {
                i17 ^= 283;
            }
            int i18 = i17 ^ i13;
            int i19 = ((i15 ^ (i16 ^ i17)) << 24) | (i18 << 16) | ((i18 ^ i16) << 8) | (i18 ^ i15);
            getSDKReferenceNumber[i14] = i19;
            AuthenticationRequestParameters[i14] = (i19 >>> 8) | (i19 << 24);
            getSDKTransactionID[i14] = (i19 >>> 16) | (i19 << 16);
            getSDKAppID[i14] = (i19 << 8) | (i19 >>> 24);
        }
        getMessageVersion[0] = 16777216;
        int i21 = 1;
        for (int i22 = 1; i22 < 10; i22++) {
            i21 <<= 1;
            if (i21 >= 256) {
                i21 ^= 283;
            }
            getMessageVersion[i22] = i21 << 24;
        }
    }

    public static int[] getDeviceData(byte[] bArr, int i11) throws IllegalArgumentException {
        if (bArr.length != 16) {
            a.h();
            return null;
        }
        int i12 = 4;
        int i13 = (i11 + 1) * 4;
        int[] iArr = new int[i13];
        int i14 = 0;
        for (int i15 = 0; i15 < 4; i15++) {
            int i16 = i14 + 3;
            int i17 = ((bArr[i14 + 1] & 255) << 16) | (bArr[i14] << 24) | ((bArr[i14 + 2] & 255) << 8);
            i14 += 4;
            iArr[i15] = i17 | (bArr[i16] & 255);
        }
        int i18 = 4;
        int i19 = 0;
        int i21 = 0;
        while (i18 < i13) {
            int i22 = iArr[i18 - 1];
            if (i19 == 0) {
                byte[] bArr2 = BuildConfig;
                i22 = ((bArr2[i22 >>> 24] & 255) | (((bArr2[(i22 >>> 16) & 255] << 24) | ((bArr2[(i22 >>> 8) & 255] & 255) << 16)) | ((bArr2[i22 & 255] & 255) << 8))) ^ getMessageVersion[i21];
                i19 = 4;
                i21++;
            }
            iArr[i18] = i22 ^ iArr[i18 - 4];
            i18++;
            i19--;
        }
        if (bArr.length != 16) {
            a.h();
            return null;
        }
        int[] iArr2 = new int[i13];
        int i23 = i11 * 4;
        iArr2[0] = iArr[i23];
        int i24 = 1;
        iArr2[1] = iArr[i23 + 1];
        iArr2[2] = iArr[i23 + 2];
        char c3 = 3;
        iArr2[3] = iArr[i23 + 3];
        int i25 = i23 - 4;
        while (i24 < i11) {
            int i26 = iArr[i25];
            int[] iArr3 = getSDKReferenceNumber;
            byte[] bArr3 = BuildConfig;
            int i27 = iArr3[bArr3[i26 >>> 24] & 255];
            int[] iArr4 = AuthenticationRequestParameters;
            int i28 = i27 ^ iArr4[bArr3[(i26 >>> 16) & 255] & 255];
            int[] iArr5 = getSDKTransactionID;
            int i29 = i28 ^ iArr5[bArr3[(i26 >>> 8) & 255] & 255];
            int[] iArr6 = getSDKAppID;
            iArr2[i12] = iArr6[bArr3[i26 & 255] & 255] ^ i29;
            int i31 = iArr[i25 + 1];
            char c7 = c3;
            int[] iArr7 = iArr2;
            iArr7[i12 + 1] = ((iArr4[bArr3[(i31 >>> 16) & 255] & 255] ^ iArr3[bArr3[i31 >>> 24] & 255]) ^ iArr5[bArr3[(i31 >>> 8) & 255] & 255]) ^ iArr6[bArr3[i31 & 255] & 255];
            int i32 = iArr[i25 + 2];
            int i33 = i12 + 3;
            iArr7[i12 + 2] = iArr6[bArr3[i32 & 255] & 255] ^ ((iArr3[bArr3[i32 >>> 24] & 255] ^ iArr4[bArr3[(i32 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i32 >>> 8) & 255] & 255]);
            int i34 = iArr[i25 + 3];
            i12 += 4;
            iArr7[i33] = iArr6[bArr3[i34 & 255] & 255] ^ ((iArr3[bArr3[i34 >>> 24] & 255] ^ iArr4[bArr3[(i34 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i34 >>> 8) & 255] & 255]);
            i25 -= 4;
            i24++;
            c3 = c7;
            iArr2 = iArr7;
        }
        int[] iArr8 = iArr2;
        iArr8[i12] = iArr[i25];
        iArr8[i12 + 1] = iArr[i25 + 1];
        iArr8[i12 + 2] = iArr[i25 + 2];
        iArr8[i12 + 3] = iArr[i25 + 3];
        return iArr8;
    }

    public static byte[][] getSDKReferenceNumber(int i11) {
        byte[][] bArr = new byte[4][];
        for (int i12 = 0; i12 < 4; i12++) {
            int i13 = i11 >>> (i12 << 3);
            bArr[i12] = new byte[]{(byte) (i13 & 3), (byte) ((i13 >> 2) & 3), (byte) ((i13 >> 4) & 3), (byte) ((i13 >> 6) & 3)};
        }
        return bArr;
    }
}
