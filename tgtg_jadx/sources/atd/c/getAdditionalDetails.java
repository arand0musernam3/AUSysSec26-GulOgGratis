package atd.c;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import atd.x.getTransactionStatus;
import atd.y.BuildConfig;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import n90.b0;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getAdditionalDetails extends ChallengeResultError {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int[] AuthenticationRequestParameters;
    public static final Parcelable.Creator<getAdditionalDetails> CREATOR;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private List<ChallengeResultTimeout> getDeviceData;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(byte r6, byte r7, byte r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r8 = r8 * 2
            int r0 = r8 + 1
            int r7 = 114 - r7
            byte[] r1 = atd.c.getAdditionalDetails.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r7 = r6
            r3 = r1
            r4 = r2
            r1 = r8
            goto L2c
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L2c:
            int r6 = r6 + r1
            int r7 = r7 + 1
            r1 = r7
            r7 = r6
            r6 = r1
            r1 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.c.getAdditionalDetails.$$d(byte, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        getMessageVersion = 1;
        getSDKReferenceNumber = 0;
        getSDKAppID = 1;
        ChallengeStatusHandler();
        CREATOR = new Parcelable.Creator<getAdditionalDetails>() { // from class: atd.c.getAdditionalDetails.2
            private static int AuthenticationRequestParameters = 1;
            private static int getSDKAppID;

            private static getAdditionalDetails getDeviceData(Parcel parcel) {
                int sDKTransactionID = getTransactionStatus.getSDKTransactionID.getSDKTransactionID();
                int sDKTransactionID2 = getTransactionStatus.getSDKTransactionID.getSDKTransactionID();
                int sDKTransactionID3 = getTransactionStatus.getSDKTransactionID.getSDKTransactionID();
                return (getAdditionalDetails) getSDKReferenceNumber(-302097691, getTransactionStatus.getSDKTransactionID.getSDKTransactionID(), 302097693, sDKTransactionID, sDKTransactionID3, new Object[]{parcel}, sDKTransactionID2);
            }

            public static /* synthetic */ Object getSDKReferenceNumber(int i11, int i12, int i13, int i14, int i15, Object[] objArr, int i16) {
                int i17 = i11 | i13 | (~i14);
                int i18 = (~((~i11) | i13)) | (~(i11 | i14));
                int i19 = (~(i14 | (~i13))) | i11;
                int i21 = (448004096 * i12) + ((-1977090048) * i15) + (1154744320 * i16) + ((-929364622) * i19) + (929364622 * i18) + (i17 * (-929364622)) + (2084108943 * i13) + ((i11 * 2084108943) - 1824784384);
                int iC = a0.c(i12, 1645725337, ((-1069702238) * i15) + i11 + i13 + i16);
                int i22 = i18 * (-830);
                int i23 = i19 * 830;
                int i24 = i16 * (-999695593);
                int i25 = i15 * 636963214;
                int i26 = i12 * (-1077364033);
                int iE = a0.e(iC, 980484096, i26 + i25 + i24 + i23 + i22 + (i17 * 830) + (i13 * (-999696423)) + (i11 * (-999696423)) + 1136243370, 1287192576, (1807155200 * iC) + i21);
                if (iE == 1) {
                    int iIntValue = ((Number) objArr[0]).intValue();
                    int i27 = AuthenticationRequestParameters;
                    int i28 = i27 & 99;
                    int i29 = (i27 ^ 99) | i28;
                    int i31 = ((i28 & i29) + (i29 | i28)) % 128;
                    getSDKAppID = i31;
                    getAdditionalDetails[] getadditionaldetailsArr = new getAdditionalDetails[iIntValue];
                    int i32 = i31 & 119;
                    AuthenticationRequestParameters = a0.d((~i32) & (i31 | 119), ~(-(-(i32 << 1))), 1, 128);
                    return getadditionaldetailsArr;
                }
                if (iE == 2) {
                    getAdditionalDetails getadditionaldetails = new getAdditionalDetails((Parcel) objArr[0]);
                    int i33 = getSDKAppID;
                    AuthenticationRequestParameters = ((i33 ^ 63) + ((i33 & 63) << 1)) % 128;
                    return getadditionaldetails;
                }
                if (iE == 3) {
                    return getSDKReferenceNumber(objArr);
                }
                Parcel parcel = (Parcel) objArr[1];
                AuthenticationRequestParameters = (getSDKAppID + 33) % 128;
                int sDKTransactionID = getTransactionStatus.getSDKTransactionID.getSDKTransactionID();
                int sDKTransactionID2 = getTransactionStatus.getSDKTransactionID.getSDKTransactionID();
                getAdditionalDetails getadditionaldetails2 = (getAdditionalDetails) getSDKReferenceNumber(-302097691, getTransactionStatus.getSDKTransactionID.getSDKTransactionID(), 302097693, sDKTransactionID, getTransactionStatus.getSDKTransactionID.getSDKTransactionID(), new Object[]{parcel}, sDKTransactionID2);
                int i34 = AuthenticationRequestParameters;
                getSDKAppID = (((i34 | 95) << 1) - (i34 ^ 95)) % 128;
                return getadditionaldetails2;
            }

            private static getAdditionalDetails[] getSDKTransactionID(int i11) {
                Object[] objArr = {Integer.valueOf(i11)};
                int sDKTransactionID = getTransactionStatus.getSDKTransactionID.getSDKTransactionID();
                int sDKTransactionID2 = getTransactionStatus.getSDKTransactionID.getSDKTransactionID();
                return (getAdditionalDetails[]) getSDKReferenceNumber(1121197381, getTransactionStatus.getSDKTransactionID.getSDKTransactionID(), -1121197380, sDKTransactionID, getTransactionStatus.getSDKTransactionID.getSDKTransactionID(), objArr, sDKTransactionID2);
            }

            /* JADX WARN: Type inference failed for: r8v1, types: [atd.c.getAdditionalDetails, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ getAdditionalDetails createFromParcel(Parcel parcel) {
                int sDKTransactionID = getTransactionStatus.getSDKTransactionID.getSDKTransactionID();
                int sDKTransactionID2 = getTransactionStatus.getSDKTransactionID.getSDKTransactionID();
                int sDKTransactionID3 = getTransactionStatus.getSDKTransactionID.getSDKTransactionID();
                return getSDKReferenceNumber(-1522515025, getTransactionStatus.getSDKTransactionID.getSDKTransactionID(), 1522515025, sDKTransactionID, sDKTransactionID3, new Object[]{this, parcel}, sDKTransactionID2);
            }

            /* JADX WARN: Type inference failed for: r8v3, types: [atd.c.getAdditionalDetails[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ getAdditionalDetails[] newArray(int i11) {
                Object[] objArr = {this, Integer.valueOf(i11)};
                int sDKTransactionID = getTransactionStatus.getSDKTransactionID.getSDKTransactionID();
                int sDKTransactionID2 = getTransactionStatus.getSDKTransactionID.getSDKTransactionID();
                return (Object[]) getSDKReferenceNumber(-586287672, getTransactionStatus.getSDKTransactionID.getSDKTransactionID(), 586287675, sDKTransactionID, getTransactionStatus.getSDKTransactionID.getSDKTransactionID(), objArr, sDKTransactionID2);
            }

            private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
                int iIntValue = ((Number) objArr[1]).intValue();
                int i11 = getSDKAppID;
                int i12 = i11 & 59;
                int i13 = (((i11 ^ 59) | i12) << 1) - ((i11 | 59) & (~i12));
                AuthenticationRequestParameters = i13 % 128;
                int i14 = i13 % 2;
                Object[] objArr2 = {Integer.valueOf(iIntValue)};
                int sDKTransactionID = getTransactionStatus.getSDKTransactionID.getSDKTransactionID();
                int sDKTransactionID2 = getTransactionStatus.getSDKTransactionID.getSDKTransactionID();
                int sDKTransactionID3 = getTransactionStatus.getSDKTransactionID.getSDKTransactionID();
                int sDKTransactionID4 = getTransactionStatus.getSDKTransactionID.getSDKTransactionID();
                if (i14 != 0) {
                    return (getAdditionalDetails[]) getSDKReferenceNumber(1121197381, sDKTransactionID4, -1121197380, sDKTransactionID, sDKTransactionID3, objArr2, sDKTransactionID2);
                }
                throw null;
            }
        };
        int i11 = getMessageVersion + 53;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public getAdditionalDetails(b0 b0Var) throws Throwable {
        super(b0Var);
        int sDKReferenceNumber = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        int sDKReferenceNumber2 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        int sDKReferenceNumber3 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
        List<ChallengeResultTimeout> list = (List) ChallengeResultTimeout.getSDKAppID(sDKReferenceNumber2, sDKReferenceNumber, -596518101, BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), new Object[]{b0Var}, 596518107, sDKReferenceNumber3);
        this.getDeviceData = list;
        if (list.isEmpty()) {
            Object[] objArr = new Object[1];
            c(new int[]{-1562790246, -1580200447, -691486174, 383528913, -816197183, 1391770018, -412884226, 347669002, -1539079823, -1124831572}, 20 - Color.red(0), objArr);
            throw new atd.ac.getSDKAppID(((String) objArr[0]).intern(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_MISSING, atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_EMPTY, atd.am.getSDKReferenceNumber.CHALLENGE_SELECT_INFO);
        }
    }

    public static void ChallengeStatusHandler() {
        AuthenticationRequestParameters = new int[]{-631375984, -1302684389, 2081272666, -919271301, -1055608505, 190149720, -2125761110, 455240832, -1751748076, 1947161671, -2136705780, -650510512, 2079089228, -1445632032, -213856995, 1932499972, -865868700, -2053537114};
    }

    private static void c(int[] iArr, int i11, Object[] objArr) throws Throwable {
        char[] cArr;
        int i12;
        long j9;
        int i13;
        char c3;
        char[] cArr2;
        int[] iArr2;
        int i14;
        int i15;
        int i16;
        int i17;
        atd.bb.getMessageVersion getmessageversion = new atd.bb.getMessageVersion();
        char[] cArr3 = new char[4];
        int i18 = 2;
        char[] cArr4 = new char[iArr.length * 2];
        int[] iArr3 = AuthenticationRequestParameters;
        int i19 = -1667528016;
        Class cls = Integer.TYPE;
        int i21 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i22 = 0;
            while (i22 < length) {
                $11 = ($10 + 79) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i22])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(i19);
                    if (sDKTransactionID == null) {
                        i16 = i19;
                        int maximumDrawingCacheSize = 2223 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        i15 = i18;
                        char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 53070);
                        int capsMode = 21 - TextUtils.getCapsMode("", i21, i21);
                        byte b8 = (byte) i21;
                        i17 = i21;
                        byte b11 = b8;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(maximumDrawingCacheSize, touchSlop, capsMode, 1089703072, false, $$d(b8, b11, b11), new Class[]{cls});
                    } else {
                        i15 = i18;
                        i16 = i19;
                        i17 = i21;
                    }
                    iArr4[i22] = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                    i22++;
                    i19 = i16;
                    i18 = i15;
                    i21 = i17;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int i23 = i18;
        int i24 = i19;
        int i25 = i21;
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = AuthenticationRequestParameters;
        int i26 = 16;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i27 = i25;
            while (i27 < length3) {
                int i28 = $11 + 77;
                $10 = i28 % 128;
                if (i28 % 2 != 0) {
                    Object[] objArr3 = {Integer.valueOf(iArr6[i27])};
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i24);
                    if (sDKTransactionID2 == null) {
                        cArr2 = cArr3;
                        i14 = i26;
                        byte b12 = (byte) i25;
                        byte b13 = b12;
                        iArr2 = iArr6;
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2223, (char) (53070 - (CdmaCellLocation.convertQuartSecToDecDegrees(i25) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i25) == 0.0d ? 0 : -1))), 21 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1089703072, false, $$d(b12, b13, b13), new Class[]{cls});
                    } else {
                        cArr2 = cArr3;
                        iArr2 = iArr6;
                        i14 = i26;
                    }
                    iArr7[i27] = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                    i27 >>>= 1;
                } else {
                    cArr2 = cArr3;
                    iArr2 = iArr6;
                    i14 = i26;
                    Object[] objArr4 = {Integer.valueOf(iArr2[i27])};
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(i24);
                    if (sDKTransactionID3 == null) {
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(2223 - Color.red(0), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 53069), 21 - View.resolveSize(0, 0), 1089703072, false, $$d(b14, b15, b15), new Class[]{cls});
                    }
                    iArr7[i27] = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                    i27++;
                }
                i26 = i14;
                cArr3 = cArr2;
                iArr6 = iArr2;
                i25 = 0;
            }
            cArr = cArr3;
            i12 = i26;
            j9 = 0;
            $10 = ($11 + 21) % 128;
            iArr6 = iArr7;
        } else {
            cArr = cArr3;
            i12 = 16;
            j9 = 0;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        getmessageversion.getSDKAppID = 0;
        while (true) {
            int i29 = getmessageversion.getSDKAppID;
            if (i29 >= iArr.length) {
                objArr[0] = new String(cArr4, 0, i11);
                return;
            }
            $10 = ($11 + 71) % 128;
            int i31 = iArr[i29];
            char c7 = (char) (i31 >> 16);
            cArr[0] = c7;
            char c8 = (char) i31;
            char c11 = 1;
            cArr[1] = c8;
            char c12 = (char) (iArr[i29 + 1] >> 16);
            cArr[i23] = c12;
            char c13 = (char) iArr[i29 + 1];
            cArr[3] = c13;
            getmessageversion.getDeviceData = (c7 << 16) + c8;
            getmessageversion.AuthenticationRequestParameters = (c12 << 16) + c13;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr5);
            int i32 = 0;
            while (true) {
                i13 = getmessageversion.getDeviceData;
                if (i32 >= i12) {
                    break;
                }
                int i33 = i13 ^ iArr5[i32];
                getmessageversion.getDeviceData = i33;
                int sDKReferenceNumber = atd.bb.getMessageVersion.getSDKReferenceNumber(i33);
                Object[] objArr5 = new Object[4];
                objArr5[3] = getmessageversion;
                objArr5[i23] = getmessageversion;
                objArr5[c11] = Integer.valueOf(sDKReferenceNumber);
                objArr5[0] = getmessageversion;
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(1513246698);
                if (sDKTransactionID4 == null) {
                    byte b16 = (byte) 0;
                    byte b17 = (byte) (b16 + 2);
                    c3 = c11;
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(2387 - (ViewConfiguration.getGlobalActionKeyTimeout() > j9 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j9 ? 0 : -1)), (char) TextUtils.getTrimmedLength(""), 19 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -2040903174, false, $$d(b16, b17, (byte) (b17 - 2)), new Class[]{Object.class, cls, Object.class, Object.class});
                } else {
                    c3 = c11;
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                getmessageversion.AuthenticationRequestParameters = iIntValue;
                i32++;
                c11 = c3;
                i12 = 16;
            }
            char c14 = c11;
            int i34 = getmessageversion.AuthenticationRequestParameters;
            getmessageversion.getDeviceData = i34;
            getmessageversion.AuthenticationRequestParameters = i13;
            i12 = 16;
            int i35 = i13 ^ iArr5[16];
            getmessageversion.AuthenticationRequestParameters = i35;
            int i36 = i34 ^ iArr5[17];
            getmessageversion.getDeviceData = i36;
            cArr[0] = (char) (i36 >>> 16);
            cArr[c14] = (char) i36;
            cArr[i23] = (char) (i35 >>> 16);
            cArr[3] = (char) i35;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr5);
            int i37 = getmessageversion.getSDKAppID;
            cArr4[i37 * 2] = cArr[0];
            cArr4[(i37 * 2) + 1] = cArr[c14];
            cArr4[(i37 * 2) + 2] = cArr[i23];
            cArr4[(i37 * 2) + 3] = cArr[3];
            int i38 = i23;
            Object[] objArr6 = new Object[i38];
            objArr6[c14] = getmessageversion;
            objArr6[0] = getmessageversion;
            Object sDKTransactionID5 = atd.e.ChallengeResult.getSDKTransactionID(35442447);
            if (sDKTransactionID5 == null) {
                byte b18 = (byte) 0;
                byte b19 = (byte) (b18 + 1);
                sDKTransactionID5 = atd.e.ChallengeResult.getDeviceData(1861 - View.resolveSizeAndState(0, 0, 0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 39 - ImageFormat.getBitsPerPixel(0), -562771681, false, $$d(b18, b19, (byte) (b19 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID5).invoke(null, objArr6);
            i23 = i38;
        }
    }

    public static void init$0() {
        $$a = new byte[]{116, -8, -122, 111};
        $$b = 183;
    }

    public final List<ChallengeResultTimeout> completed() {
        int i11 = getSDKAppID + 103;
        getSDKReferenceNumber = i11 % 128;
        int i12 = i11 % 2;
        List<ChallengeResultTimeout> list = this.getDeviceData;
        if (i12 != 0) {
            int i13 = 66 / 0;
        }
        return list;
    }

    @Override // atd.c.ChallengeResultError, atd.c.getTransactionStatus, atd.c.getSDKTransactionID, android.os.Parcelable
    public final int describeContents() {
        int i11 = getSDKAppID + 85;
        int i12 = i11 % 128;
        getSDKReferenceNumber = i12;
        int i13 = i11 % 2 != 0 ? 1 : 0;
        getSDKAppID = (i12 + 47) % 128;
        return i13;
    }

    @Override // atd.c.ChallengeResultError, atd.c.getTransactionStatus, atd.c.getSDKTransactionID
    public final boolean equals(Object obj) {
        boolean zEquals;
        int i11;
        int i12 = getSDKAppID + 101;
        int i13 = i12 % 128;
        getSDKReferenceNumber = i13;
        if (i12 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i14 = i13 + 105;
            getSDKAppID = i14 % 128;
            zEquals = true;
            i11 = i14 % 2 == 0 ? 85 : 63;
            return zEquals;
        }
        if (obj != null) {
            getSDKAppID = (i13 + 95) % 128;
            if (getAdditionalDetails.class != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            zEquals = Objects.equals(this.getDeviceData, ((getAdditionalDetails) obj).getDeviceData);
            int i15 = getSDKReferenceNumber + 59;
            getSDKAppID = i15 % 128;
            if (i15 % 2 != 0) {
                return zEquals;
            }
        }
        return false;
        int i16 = i11 / 0;
        return zEquals;
    }

    @Override // atd.c.ChallengeResultError, atd.c.getTransactionStatus, atd.c.getSDKTransactionID
    public final void getDeviceData() {
        super.getDeviceData();
        List<ChallengeResultTimeout> list = this.getDeviceData;
        if (list != null) {
            for (ChallengeResultTimeout challengeResultTimeout : list) {
                getSDKAppID = (getSDKReferenceNumber + 11) % 128;
                if (challengeResultTimeout != null) {
                    getSDKReferenceNumber = (getSDKAppID + 49) % 128;
                    int sDKReferenceNumber = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
                    int sDKReferenceNumber2 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
                    int sDKReferenceNumber3 = BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber();
                    ChallengeResultTimeout.getSDKAppID(sDKReferenceNumber2, sDKReferenceNumber, 1767082952, BuildConfig.AuthenticationRequestParameters.getSDKReferenceNumber(), new Object[]{challengeResultTimeout}, -1767082949, sDKReferenceNumber3);
                }
                getSDKAppID = (getSDKReferenceNumber + 115) % 128;
            }
            this.getDeviceData.clear();
            this.getDeviceData = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030 A[PHI: r0
      0x0030: PHI (r0v8 int) = (r0v4 int), (r0v10 int) binds: [B:8:0x001f, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r0
      0x0021: PHI (r0v5 int) = (r0v4 int), (r0v10 int) binds: [B:8:0x001f, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // atd.c.ChallengeResultError, atd.c.getTransactionStatus, atd.c.getSDKTransactionID
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r2 = this;
            int r0 = atd.c.getAdditionalDetails.getSDKAppID
            int r0 = r0 + 79
            int r1 = r0 % 128
            atd.c.getAdditionalDetails.getSDKReferenceNumber = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L17
            int r0 = super.hashCode()
            int r0 = r0 / 33
            java.util.List<atd.c.ChallengeResultTimeout> r1 = r2.getDeviceData
            if (r1 == 0) goto L30
            goto L21
        L17:
            int r0 = super.hashCode()
            int r0 = r0 * 31
            java.util.List<atd.c.ChallengeResultTimeout> r1 = r2.getDeviceData
            if (r1 == 0) goto L30
        L21:
            int r1 = atd.c.getAdditionalDetails.getSDKReferenceNumber
            int r1 = r1 + 57
            int r1 = r1 % 128
            atd.c.getAdditionalDetails.getSDKAppID = r1
            java.util.List<atd.c.ChallengeResultTimeout> r1 = r2.getDeviceData
            int r1 = r1.hashCode()
            goto L31
        L30:
            r1 = 0
        L31:
            int r0 = r0 + r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.c.getAdditionalDetails.hashCode():int");
    }

    @Override // atd.c.ChallengeResultError, atd.c.getTransactionStatus, atd.c.getSDKTransactionID, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        getSDKReferenceNumber = (getSDKAppID + 33) % 128;
        super.writeToParcel(parcel, i11);
        parcel.writeTypedList(this.getDeviceData);
        int i12 = getSDKReferenceNumber + 49;
        getSDKAppID = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public getAdditionalDetails(Parcel parcel) {
        super(parcel);
        this.getDeviceData = parcel.createTypedArrayList(ChallengeResultTimeout.CREATOR);
    }
}
