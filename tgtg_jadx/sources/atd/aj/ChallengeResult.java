package atd.aj;

import com.appsflyer.attribution.RequestError;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: loaded from: classes.dex */
public class ChallengeResult {
    public int AuthenticationRequestParameters;
    public Object BuildConfig;
    public Object ChallengeResult;
    public double ChallengeResultCancelled;
    private final float[] ChallengeResultCompleted;
    private final int[] ChallengeResultError;
    private int ChallengeResultTimeout;
    private final double[] ChallengeStatusReceiver;
    private final Object[] completed;
    private final long[] getAdditionalDetails;
    public long getDeviceData;
    public float getMessageVersion;
    public int getSDKAppID;
    public double getSDKEphemeralPublicKey;
    public float getSDKReferenceNumber;
    public long getSDKTransactionID;
    private int getTransactionStatus;

    public ChallengeResult(Object obj, Object obj2) {
        this.ChallengeResultError = new int[14];
        this.getAdditionalDetails = new long[14];
        this.ChallengeResultCompleted = new float[14];
        this.ChallengeStatusReceiver = new double[14];
        Object[] objArr = new Object[14];
        this.completed = objArr;
        objArr[11] = obj;
        objArr[12] = obj2;
        this.ChallengeResultTimeout = 0;
        this.getTransactionStatus = -1;
    }

    public int getDeviceData(int i11) {
        switch (i11) {
            case 1:
                Object[] objArr = this.completed;
                int i12 = this.ChallengeResultTimeout;
                this.ChallengeResultTimeout = i12 + 1;
                objArr[i12] = this.BuildConfig;
                return 0;
            case 2:
                int[] iArr = this.ChallengeResultError;
                int i13 = this.ChallengeResultTimeout;
                this.ChallengeResultTimeout = i13 + 1;
                iArr[i13] = 2;
                return 0;
            case 3:
                int i14 = this.ChallengeResultTimeout - this.AuthenticationRequestParameters;
                this.ChallengeResultTimeout = i14;
                this.getTransactionStatus = i14;
                return 0;
            case 4:
                Object[] objArr2 = this.completed;
                int i15 = this.getTransactionStatus;
                this.getTransactionStatus = i15 + 1;
                Object obj = objArr2[i15];
                objArr2[i15] = null;
                this.ChallengeResult = obj;
                return 0;
            case 5:
                int[] iArr2 = this.ChallengeResultError;
                int i16 = this.getTransactionStatus;
                this.getTransactionStatus = i16 + 1;
                this.getSDKAppID = iArr2[i16];
                return 0;
            case 6:
                int[] iArr3 = this.ChallengeResultError;
                int i17 = this.ChallengeResultTimeout;
                this.ChallengeResultTimeout = i17 + 1;
                iArr3[i17] = this.AuthenticationRequestParameters;
                return 0;
            case 7:
                int[] iArr4 = this.ChallengeResultError;
                int i18 = this.ChallengeResultTimeout;
                this.ChallengeResultTimeout = i18 + 1;
                iArr4[i18] = 0;
                return 0;
            case 8:
                int i19 = this.ChallengeResultTimeout;
                int i21 = i19 - 1;
                this.ChallengeResultTimeout = i21;
                int[] iArr5 = this.ChallengeResultError;
                iArr5[i19 - 2] = iArr5[i19 - 2] - iArr5[i21];
                return 0;
            case 9:
                Object[] objArr3 = this.completed;
                int i22 = this.ChallengeResultTimeout;
                this.ChallengeResultTimeout = i22 + 1;
                objArr3[i22] = objArr3[i22 - 1];
                this.ChallengeResultTimeout = i22;
                Object obj2 = objArr3[i22];
                objArr3[i22] = null;
                objArr3[12] = obj2;
                return 0;
            case 10:
                Object[] objArr4 = this.completed;
                int i23 = this.ChallengeResultTimeout;
                this.ChallengeResultTimeout = i23 + 1;
                objArr4[i23] = objArr4[11];
                return 0;
            case 11:
                Object[] objArr5 = this.completed;
                int i24 = this.ChallengeResultTimeout;
                int i25 = i24 + 1;
                this.ChallengeResultTimeout = i25;
                objArr5[i24] = null;
                this.ChallengeResultTimeout = i24 + 2;
                objArr5[i25] = objArr5[i24];
                return 0;
            case 12:
                Object[] objArr6 = this.completed;
                int i26 = this.ChallengeResultTimeout;
                this.ChallengeResultTimeout = i26 + 1;
                objArr6[i26] = objArr6[i26 - 1];
                return 0;
            case 13:
                int i27 = this.ChallengeResultTimeout - 1;
                this.ChallengeResultTimeout = i27;
                Object[] objArr7 = this.completed;
                Object obj3 = objArr7[i27];
                objArr7[i27] = null;
                this.getSDKAppID = obj3 == null ? 0 : 1;
                return 0;
            case 14:
                Object[] objArr8 = this.completed;
                int i28 = this.ChallengeResultTimeout;
                Object obj4 = objArr8[i28 - 1];
                objArr8[i28 - 1] = null;
                Object obj5 = objArr8[i28 - 2];
                objArr8[i28 - 2] = null;
                objArr8[i28 - 1] = obj5;
                objArr8[i28 - 2] = obj4;
                return 0;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                int i29 = this.ChallengeResultTimeout - 1;
                this.ChallengeResultTimeout = i29;
                this.completed[i29] = null;
                return 0;
            case 16:
                Object[] objArr9 = this.completed;
                int i31 = this.ChallengeResultTimeout;
                Object obj6 = objArr9[i31 - 1];
                objArr9[i31 - 1] = null;
                this.ChallengeResult = obj6;
                return 0;
            case 17:
                int[] iArr6 = this.ChallengeResultError;
                int i32 = this.ChallengeResultTimeout;
                this.ChallengeResultTimeout = i32 + 1;
                iArr6[i32] = 26;
                return 0;
            case 18:
                int i33 = this.ChallengeResultTimeout;
                int i34 = i33 - 1;
                this.ChallengeResultTimeout = i34;
                int[] iArr7 = this.ChallengeResultError;
                iArr7[i33 - 2] = iArr7[i33 - 2] + iArr7[i34];
                return 0;
            case 19:
                int[] iArr8 = this.ChallengeResultError;
                int i35 = this.ChallengeResultTimeout;
                int i36 = i35 + 1;
                this.ChallengeResultTimeout = i36;
                iArr8[i35] = 64;
                this.ChallengeResultTimeout = i35 + 2;
                iArr8[i36] = 0;
                return 0;
            case 20:
                int[] iArr9 = this.ChallengeResultError;
                int i37 = this.ChallengeResultTimeout;
                int i38 = i37 + 1;
                this.ChallengeResultTimeout = i38;
                iArr9[i37] = 0;
                this.ChallengeResultTimeout = i37 + 2;
                iArr9[i38] = 0;
                return 0;
            case 21:
                int i39 = this.ChallengeResultTimeout;
                int i41 = i39 - 1;
                this.ChallengeResultTimeout = i41;
                int[] iArr10 = this.ChallengeResultError;
                iArr10[i39 - 2] = iArr10[i39 - 2] - iArr10[i41];
                iArr10[i39 - 2] = (byte) iArr10[i39 - 2];
                return 0;
            case 22:
                Object[] objArr10 = this.completed;
                int i42 = this.ChallengeResultTimeout;
                this.ChallengeResultTimeout = i42 + 1;
                objArr10[i42] = null;
                return 0;
            case 23:
                int i43 = this.ChallengeResultTimeout - 1;
                this.ChallengeResultTimeout = i43;
                Object[] objArr11 = this.completed;
                Object obj7 = objArr11[i43];
                objArr11[i43] = null;
                objArr11[13] = obj7;
                return 0;
            case 24:
                int i44 = this.ChallengeResultTimeout;
                int i45 = i44 - 1;
                this.ChallengeResultTimeout = i45;
                Object[] objArr12 = this.completed;
                objArr12[i45] = null;
                this.ChallengeResultTimeout = i44;
                objArr12[i45] = objArr12[13];
                return 0;
            case 25:
                Object[] objArr13 = this.completed;
                int i46 = this.ChallengeResultTimeout;
                this.ChallengeResultTimeout = i46 + 1;
                objArr13[i46] = objArr13[12];
                return 0;
            case 26:
                int i47 = this.ChallengeResultTimeout;
                int i48 = i47 - 1;
                this.ChallengeResultTimeout = i48;
                int[] iArr11 = this.ChallengeResultError;
                iArr11[i47 - 2] = iArr11[i47 - 2] % iArr11[i48];
                int i49 = i47 - 2;
                this.ChallengeResultTimeout = i49;
                this.completed[i49] = null;
                return 0;
            case 28:
                int[] iArr12 = this.ChallengeResultError;
                int i51 = this.ChallengeResultTimeout;
                this.ChallengeResultTimeout = i51 + 1;
                iArr12[i51] = 111;
            case 27:
                return 0;
            case 29:
                int[] iArr13 = this.ChallengeResultError;
                int i52 = this.ChallengeResultTimeout;
                this.ChallengeResultTimeout = i52 + 1;
                iArr13[i52] = iArr13[i52 - 1];
                return 0;
            case 30:
                int[] iArr14 = this.ChallengeResultError;
                int i53 = this.ChallengeResultTimeout;
                this.ChallengeResultTimeout = i53 + 1;
                iArr14[i53] = 128;
                return 0;
            case BERTags.DATE /* 31 */:
                int i54 = this.ChallengeResultTimeout;
                int i55 = i54 - 1;
                this.ChallengeResultTimeout = i55;
                int[] iArr15 = this.ChallengeResultError;
                iArr15[i54 - 2] = iArr15[i54 - 2] % iArr15[i55];
                return 0;
            case 32:
                int i56 = this.ChallengeResultTimeout - 1;
                this.ChallengeResultTimeout = i56;
                this.getSDKAppID = this.ChallengeResultError[i56] == 0 ? 0 : 1;
                return 0;
            case 33:
                int[] iArr16 = this.ChallengeResultError;
                int i57 = this.ChallengeResultTimeout;
                this.ChallengeResultTimeout = i57 + 1;
                iArr16[i57] = 2;
                this.ChallengeResultTimeout = i57;
                iArr16[i57 - 1] = iArr16[i57 - 1] % iArr16[i57];
                return 0;
            case BERTags.DURATION /* 34 */:
                int i58 = this.ChallengeResultTimeout - 1;
                while (true) {
                    Object[] objArr14 = this.completed;
                    if (i58 < 0) {
                        this.ChallengeResultTimeout = 1;
                        objArr14[0] = this.BuildConfig;
                        return 0;
                    }
                    objArr14[i58] = null;
                    i58--;
                }
                break;
            case BERTags.OBJECT_IDENTIFIER_IRI /* 35 */:
                long[] jArr = this.getAdditionalDetails;
                int i59 = this.ChallengeResultTimeout;
                this.ChallengeResultTimeout = i59 + 1;
                jArr[i59] = this.getDeviceData;
                return 0;
            case 36:
                int[] iArr17 = this.ChallengeResultError;
                int i61 = this.ChallengeResultTimeout;
                this.ChallengeResultTimeout = i61 + 1;
                iArr17[i61] = 5;
                return 0;
            case 37:
                long[] jArr2 = this.getAdditionalDetails;
                int i62 = this.ChallengeResultTimeout;
                this.ChallengeResultTimeout = i62 + 1;
                jArr2[i62] = 0;
                return 0;
            case 38:
                int i63 = this.ChallengeResultTimeout;
                int i64 = i63 - 1;
                this.ChallengeResultTimeout = i64;
                long[] jArr3 = this.getAdditionalDetails;
                this.ChallengeResultError[i63 - 2] = (jArr3[i63 - 2] > jArr3[i64] ? 1 : (jArr3[i63 - 2] == jArr3[i64] ? 0 : -1));
                return 0;
            case 39:
                Object[] objArr15 = this.completed;
                int i65 = this.ChallengeResultTimeout;
                this.ChallengeResultTimeout = i65 + 1;
                objArr15[i65] = objArr15[i65 - 1];
                this.ChallengeResultTimeout = i65;
                Object obj8 = objArr15[i65];
                objArr15[i65] = null;
                objArr15[13] = obj8;
                this.ChallengeResultTimeout = i65 + 1;
                objArr15[i65] = objArr15[12];
                return 0;
            case 40:
                Object[] objArr16 = this.completed;
                int i66 = this.ChallengeResultTimeout;
                this.ChallengeResultTimeout = i66 + 1;
                objArr16[i66] = objArr16[13];
                return 0;
            case RequestError.NO_DEV_KEY /* 41 */:
                Object[] objArr17 = this.completed;
                int i67 = this.ChallengeResultTimeout;
                int i68 = i67 + 1;
                this.ChallengeResultTimeout = i68;
                objArr17[i67] = objArr17[11];
                int[] iArr18 = this.ChallengeResultError;
                this.ChallengeResultTimeout = i67 + 2;
                iArr18[i68] = 1;
                return 0;
            case 42:
                int[] iArr19 = this.ChallengeResultError;
                int i69 = this.ChallengeResultTimeout;
                this.ChallengeResultTimeout = i69 + 1;
                iArr19[i69] = 2;
                this.ChallengeResultTimeout = i69;
                iArr19[i69 - 1] = iArr19[i69 - 1] % iArr19[i69];
                int i71 = i69 - 1;
                this.ChallengeResultTimeout = i71;
                this.completed[i71] = null;
                return 0;
            case 43:
                int[] iArr20 = this.ChallengeResultError;
                int i72 = this.ChallengeResultTimeout;
                this.ChallengeResultTimeout = i72 + 1;
                iArr20[i72] = 69;
                return 0;
            case 44:
                int i73 = this.ChallengeResultTimeout;
                int i74 = i73 - 1;
                this.ChallengeResultTimeout = i74;
                int[] iArr21 = this.ChallengeResultError;
                iArr21[i73 - 2] = iArr21[i73 - 2] + iArr21[i74];
                this.ChallengeResultTimeout = i73;
                iArr21[i74] = iArr21[i73 - 2];
                return 0;
            case 45:
                int i75 = this.ChallengeResultTimeout - 1;
                this.ChallengeResultTimeout = i75;
                this.getSDKAppID = this.ChallengeResultError[i75] != 0 ? 0 : 1;
                return 0;
            case 46:
                int[] iArr22 = this.ChallengeResultError;
                int i76 = this.ChallengeResultTimeout;
                this.ChallengeResultTimeout = i76 + 1;
                iArr22[i76] = 91;
                return 0;
            case 47:
                int[] iArr23 = this.ChallengeResultError;
                int i77 = this.ChallengeResultTimeout;
                int i78 = i77 + 1;
                this.ChallengeResultTimeout = i78;
                iArr23[i77] = iArr23[i77 - 1];
                this.ChallengeResultTimeout = i77 + 2;
                iArr23[i78] = 128;
                return 0;
            case 48:
                int[] iArr24 = this.ChallengeResultError;
                int i79 = this.ChallengeResultTimeout;
                this.ChallengeResultTimeout = i79 + 1;
                iArr24[i79] = 4;
                return 0;
            case 49:
                long[] jArr4 = this.getAdditionalDetails;
                int i81 = this.ChallengeResultTimeout;
                this.ChallengeResultTimeout = i81 + 1;
                jArr4[i81] = 1;
                this.ChallengeResultTimeout = i81;
                this.ChallengeResultError[i81 - 1] = (jArr4[i81 - 1] > jArr4[i81] ? 1 : (jArr4[i81 - 1] == jArr4[i81] ? 0 : -1));
                return 0;
            case 50:
                int i82 = this.ChallengeResultTimeout;
                int i83 = i82 - 1;
                this.ChallengeResultTimeout = i83;
                int[] iArr25 = this.ChallengeResultError;
                iArr25[i82 - 2] = iArr25[i82 - 2] << iArr25[i83];
                return 0;
            case 51:
                Object[] objArr18 = this.completed;
                int i84 = this.ChallengeResultTimeout;
                this.ChallengeResultTimeout = i84 + 1;
                objArr18[i84] = objArr18[i84 - 1];
                this.ChallengeResultTimeout = i84;
                Object obj9 = objArr18[i84];
                objArr18[i84] = null;
                objArr18[13] = obj9;
                return 0;
            case 52:
                int[] iArr26 = this.ChallengeResultError;
                int i85 = this.ChallengeResultTimeout;
                this.ChallengeResultTimeout = i85 + 1;
                iArr26[i85] = 1;
                return 0;
            case 53:
                int[] iArr27 = this.ChallengeResultError;
                int i86 = this.ChallengeResultTimeout - 1;
                this.ChallengeResultTimeout = i86;
                this.getSDKAppID = iArr27[i86];
                return 0;
            case 54:
                int[] iArr28 = this.ChallengeResultError;
                int i87 = this.ChallengeResultTimeout;
                this.ChallengeResultTimeout = i87 + 1;
                iArr28[i87] = 17;
                return 0;
            default:
                return i11;
        }
    }

    public ChallengeResult(Object obj) {
        this.ChallengeResultError = new int[14];
        this.getAdditionalDetails = new long[14];
        this.ChallengeResultCompleted = new float[14];
        this.ChallengeStatusReceiver = new double[14];
        Object[] objArr = new Object[14];
        this.completed = objArr;
        objArr[11] = obj;
        this.ChallengeResultTimeout = 0;
        this.getTransactionStatus = -1;
    }
}
