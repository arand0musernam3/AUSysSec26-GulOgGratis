package atd.c;

import a40.d0;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.z.ErrorMessage;
import atd.z.getErrorDetails;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.app.tgtg.model.local.AppConstants;
import java.lang.reflect.Method;
import n90.b0;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class getTransactionStatus extends getSDKTransactionID {
    private static final byte[] $$h = null;
    private static final int $$i = 0;
    private static int $10;
    private static int $11;
    public static final Parcelable.Creator<getTransactionStatus> CREATOR;
    private static int[] ChallengeResultError;
    private static int ChallengeResultTimeout;
    private static int ChallengeStatusReceiver;
    private static int completed;
    private static int getAdditionalDetails;
    private String AuthenticationRequestParameters;
    private String BuildConfig;
    private String ChallengeResult;
    private String ChallengeResultCancelled;
    private getMessageVersion ChallengeResultCompleted;
    private String getDeviceData;
    private String getMessageVersion;
    private atd.h.getDeviceData getSDKAppID;
    private getMessageVersion getSDKEphemeralPublicKey;
    private String getSDKReferenceNumber;
    private String getSDKTransactionID;
    private String getTransactionStatus;

    private static String $$j(byte b8, short s7, int i11) {
        int i12 = 3 - (s7 * 2);
        int i13 = 114 - i11;
        byte[] bArr = $$h;
        int i14 = b8 * 2;
        byte[] bArr2 = new byte[1 - i14];
        int i15 = 0 - i14;
        int i16 = -1;
        if (bArr == null) {
            i13 = (-i12) + i15;
            i12 = i12;
            bArr = bArr;
            i16 = -1;
        }
        while (true) {
            int i17 = i16 + 1;
            bArr2[i17] = (byte) i13;
            int i18 = i12 + 1;
            if (i17 == i15) {
                return new String(bArr2, 0);
            }
            byte[] bArr3 = bArr;
            i13 = (-bArr[i18]) + i13;
            i12 = i18;
            bArr = bArr3;
            i16 = i17;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeStatusReceiver = 0;
        completed = 1;
        getAdditionalDetails = 0;
        ChallengeResultTimeout = 1;
        onCompletion();
        CREATOR = new AnonymousClass1();
        int i11 = completed + 125;
        ChallengeStatusReceiver = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public getTransactionStatus(b0 b0Var) throws Throwable {
        String sDKAppID;
        super(b0Var);
        this.getSDKReferenceNumber = atd.d.getSDKEphemeralPublicKey.getSDKTransactionID(b0Var, atd.am.getSDKReferenceNumber.CHALLENGE_INFO_HEADER).getSDKAppID();
        this.getDeviceData = atd.d.getSDKEphemeralPublicKey.getSDKTransactionID(b0Var, atd.am.getSDKReferenceNumber.CHALLENGE_INFO_TEXT).getSDKAppID();
        if (getSDKTransactionID() == atd.h.getSDKTransactionID.OUT_OF_BAND) {
            Object[] objArr = {b0Var, atd.am.getSDKReferenceNumber.CHALLENGE_INFO_LABEL};
            int sDKAppID2 = atd.a.getSDKReferenceNumber.getSDKAppID();
            int sDKAppID3 = atd.a.getSDKReferenceNumber.getSDKAppID();
            sDKAppID = (String) ((atd.am.getSDKTransactionID) atd.d.getSDKEphemeralPublicKey.getSDKAppID(atd.a.getSDKReferenceNumber.getSDKAppID(), atd.a.getSDKReferenceNumber.getSDKAppID(), objArr, sDKAppID3, sDKAppID2, 1505785998, -1505785998)).getSDKAppID();
        } else {
            sDKAppID = atd.d.getSDKEphemeralPublicKey.getSDKTransactionID(b0Var, atd.am.getSDKReferenceNumber.CHALLENGE_INFO_LABEL).getSDKAppID();
        }
        this.getSDKTransactionID = sDKAppID;
        atd.am.getSDKReferenceNumber getsdkreferencenumber = atd.am.getSDKReferenceNumber.CHALLENGE_INFO_TEXT_INDICATOR;
        int sDKAppID4 = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID5 = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID6 = atd.a.getSDKReferenceNumber.getSDKAppID();
        this.getSDKAppID = atd.h.getDeviceData.getSDKReferenceNumber((String) ((atd.am.getSDKTransactionID) atd.d.getSDKEphemeralPublicKey.getSDKAppID(atd.a.getSDKReferenceNumber.getSDKAppID(), sDKAppID6, new Object[]{b0Var, getsdkreferencenumber}, sDKAppID5, sDKAppID4, 1505785998, -1505785998)).getSDKAppID(), getsdkreferencenumber);
        Object[] objArr2 = {b0Var, atd.am.getSDKReferenceNumber.RESEND_INFO_LABEL};
        int sDKAppID7 = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID8 = atd.a.getSDKReferenceNumber.getSDKAppID();
        this.AuthenticationRequestParameters = (String) ((atd.am.getSDKTransactionID) atd.d.getSDKEphemeralPublicKey.getSDKAppID(atd.a.getSDKReferenceNumber.getSDKAppID(), atd.a.getSDKReferenceNumber.getSDKAppID(), objArr2, sDKAppID8, sDKAppID7, 1505785998, -1505785998)).getSDKAppID();
        Object[] objArr3 = {b0Var, atd.am.getSDKReferenceNumber.WHY_INFO_LABEL};
        int sDKAppID9 = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID10 = atd.a.getSDKReferenceNumber.getSDKAppID();
        this.ChallengeResultCancelled = (String) ((atd.am.getSDKTransactionID) atd.d.getSDKEphemeralPublicKey.getSDKAppID(atd.a.getSDKReferenceNumber.getSDKAppID(), atd.a.getSDKReferenceNumber.getSDKAppID(), objArr3, sDKAppID10, sDKAppID9, 1505785998, -1505785998)).getSDKAppID();
        Object[] objArr4 = {b0Var, atd.am.getSDKReferenceNumber.WHY_INFO_TEXT};
        int sDKAppID11 = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID12 = atd.a.getSDKReferenceNumber.getSDKAppID();
        this.ChallengeResult = (String) ((atd.am.getSDKTransactionID) atd.d.getSDKEphemeralPublicKey.getSDKAppID(atd.a.getSDKReferenceNumber.getSDKAppID(), atd.a.getSDKReferenceNumber.getSDKAppID(), objArr4, sDKAppID12, sDKAppID11, 1505785998, -1505785998)).getSDKAppID();
        Object[] objArr5 = {b0Var, atd.am.getSDKReferenceNumber.EXPAND_INFO_LABEL};
        int sDKAppID13 = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID14 = atd.a.getSDKReferenceNumber.getSDKAppID();
        this.getMessageVersion = (String) ((atd.am.getSDKTransactionID) atd.d.getSDKEphemeralPublicKey.getSDKAppID(atd.a.getSDKReferenceNumber.getSDKAppID(), atd.a.getSDKReferenceNumber.getSDKAppID(), objArr5, sDKAppID14, sDKAppID13, 1505785998, -1505785998)).getSDKAppID();
        Object[] objArr6 = {b0Var, atd.am.getSDKReferenceNumber.EXPAND_INFO_TEXT};
        int sDKAppID15 = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID16 = atd.a.getSDKReferenceNumber.getSDKAppID();
        this.BuildConfig = (String) ((atd.am.getSDKTransactionID) atd.d.getSDKEphemeralPublicKey.getSDKAppID(atd.a.getSDKReferenceNumber.getSDKAppID(), atd.a.getSDKReferenceNumber.getSDKAppID(), objArr6, sDKAppID16, sDKAppID15, 1505785998, -1505785998)).getSDKAppID();
        Object[] objArr7 = {b0Var, atd.am.getSDKReferenceNumber.ISSUER_IMAGE};
        int iAuthenticationRequestParameters = getErrorDetails.getSDKAppID.AuthenticationRequestParameters();
        this.getSDKEphemeralPublicKey = (getMessageVersion) getMessageVersion.getSDKReferenceNumber(getErrorDetails.getSDKAppID.AuthenticationRequestParameters(), objArr7, -155256688, getErrorDetails.getSDKAppID.AuthenticationRequestParameters(), iAuthenticationRequestParameters, 155256689, getErrorDetails.getSDKAppID.AuthenticationRequestParameters());
        Object[] objArr8 = {b0Var, atd.am.getSDKReferenceNumber.PS_IMAGE};
        int iAuthenticationRequestParameters2 = getErrorDetails.getSDKAppID.AuthenticationRequestParameters();
        this.ChallengeResultCompleted = (getMessageVersion) getMessageVersion.getSDKReferenceNumber(getErrorDetails.getSDKAppID.AuthenticationRequestParameters(), objArr8, -155256688, getErrorDetails.getSDKAppID.AuthenticationRequestParameters(), iAuthenticationRequestParameters2, 155256689, getErrorDetails.getSDKAppID.AuthenticationRequestParameters());
        atd.am.getSDKReferenceNumber getsdkreferencenumber2 = atd.am.getSDKReferenceNumber.WHITELISTING_INFO_TEXT;
        int sDKAppID17 = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID18 = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID19 = atd.a.getSDKReferenceNumber.getSDKAppID();
        String str = (String) ((atd.am.getSDKTransactionID) atd.d.getSDKEphemeralPublicKey.getSDKAppID(atd.a.getSDKReferenceNumber.getSDKAppID(), sDKAppID19, new Object[]{b0Var, getsdkreferencenumber2}, sDKAppID18, sDKAppID17, 1505785998, -1505785998)).getSDKAppID();
        this.getTransactionStatus = str;
        if (str == null || str.length() <= 64) {
            return;
        }
        Object[] objArr9 = new Object[1];
        b(new int[]{1330061085, -1070481011, -1063560864, 562411420, 1030456059, 1424465036, 1143159875, -298511864, -706372065, 759076652, 983860778, 1782934811, -640175203, 37415697, 1176119523, -2119731486, -271433313, 370589993, 460860750, 653294000, 801464757, 1726276413, 1097928039, -579189740}, 46 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr9);
        throw new atd.ac.getSDKAppID(((String) objArr9[0]).intern(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_INVALID_FORMAT, atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_TOO_LONG, getsdkreferencenumber2);
    }

    private static void b(int[] iArr, int i11, Object[] objArr) throws Throwable {
        int i12;
        char[] cArr;
        int i13;
        char[] cArr2;
        int length;
        int[] iArr2;
        int i14;
        int i15;
        int i16;
        atd.bb.getMessageVersion getmessageversion = new atd.bb.getMessageVersion();
        char[] cArr3 = new char[4];
        int i17 = 2;
        char[] cArr4 = new char[iArr.length * 2];
        int[] iArr3 = ChallengeResultError;
        Class cls = Integer.TYPE;
        int i18 = 0;
        if (iArr3 != null) {
            int i19 = $10 + 43;
            $11 = i19 % 128;
            if (i19 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i14 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i14 = 0;
            }
            int i21 = i14;
            i12 = 53070;
            while (i21 < length) {
                int i22 = $11 + 121;
                $10 = i22 % 128;
                if (i22 % i17 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i21])};
                        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(-1667528016);
                        if (sDKTransactionID == null) {
                            i15 = i17;
                            byte b8 = (byte) ($$h[i18] - 1);
                            byte b11 = b8;
                            i16 = i18;
                            sDKTransactionID = atd.e.ChallengeResult.getDeviceData(Color.alpha(i18) + 2223, (char) (Drawable.resolveOpacity(i18, i18) + 53070), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 21, 1089703072, false, $$j(b8, b11, b11), new Class[]{cls});
                        } else {
                            i15 = i17;
                            i16 = i18;
                        }
                        iArr2[i21] = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    i15 = i17;
                    i16 = i18;
                    Object[] objArr3 = {Integer.valueOf(iArr3[i21])};
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-1667528016);
                    if (sDKTransactionID2 == null) {
                        byte b12 = (byte) ($$h[i16] - 1);
                        byte b13 = b12;
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(2223 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 53070), 22 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1089703072, false, $$j(b12, b13, b13), new Class[]{cls});
                    }
                    iArr2[i21] = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                    i21++;
                }
                i17 = i15;
                i18 = i16;
            }
            iArr3 = iArr2;
        } else {
            i12 = 53070;
        }
        int i23 = i17;
        int i24 = i18;
        int i25 = 16;
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = ChallengeResultError;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i26 = i24;
            while (i26 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr5[i26])};
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-1667528016);
                if (sDKTransactionID3 == null) {
                    int iMyPid = (Process.myPid() >> 22) + 2223;
                    int i27 = i24;
                    char c3 = (char) ((TypedValue.complexToFraction(i27, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i27, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + i12);
                    int iResolveSize = View.resolveSize(i27, i27) + 21;
                    byte b14 = (byte) ($$h[i27] - 1);
                    byte b15 = b14;
                    cArr2 = cArr3;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(iMyPid, c3, iResolveSize, 1089703072, false, $$j(b14, b15, b15), new Class[]{cls});
                } else {
                    cArr2 = cArr3;
                }
                iArr6[i26] = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                i26++;
                cArr3 = cArr2;
                i24 = 0;
            }
            cArr = cArr3;
            $10 = ($11 + 111) % 128;
            iArr5 = iArr6;
        } else {
            cArr = cArr3;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        getmessageversion.getSDKAppID = 0;
        while (true) {
            int i28 = getmessageversion.getSDKAppID;
            if (i28 >= iArr.length) {
                objArr[0] = new String(cArr4, 0, i11);
                return;
            }
            $10 = ($11 + 61) % 128;
            int i29 = iArr[i28];
            char c7 = (char) (i29 >> 16);
            cArr[0] = c7;
            char c8 = (char) i29;
            cArr[1] = c8;
            char c11 = (char) (iArr[i28 + 1] >> 16);
            cArr[i23] = c11;
            char c12 = (char) iArr[i28 + 1];
            cArr[3] = c12;
            getmessageversion.getDeviceData = (c7 << 16) + c8;
            getmessageversion.AuthenticationRequestParameters = (c11 << 16) + c12;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr4);
            int i31 = 0;
            while (true) {
                i13 = getmessageversion.getDeviceData;
                if (i31 >= i25) {
                    break;
                }
                int i32 = i13 ^ iArr4[i31];
                getmessageversion.getDeviceData = i32;
                int sDKReferenceNumber = atd.bb.getMessageVersion.getSDKReferenceNumber(i32);
                Object[] objArr5 = new Object[4];
                objArr5[3] = getmessageversion;
                objArr5[i23] = getmessageversion;
                objArr5[1] = Integer.valueOf(sDKReferenceNumber);
                objArr5[0] = getmessageversion;
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(1513246698);
                if (sDKTransactionID4 == null) {
                    int modifierMetaStateMask = 2385 - ((byte) KeyEvent.getModifierMetaStateMask());
                    char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                    int iKeyCodeFromString = 19 - KeyEvent.keyCodeFromString("");
                    byte[] bArr = $$h;
                    byte b16 = (byte) (bArr[0] - 1);
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(modifierMetaStateMask, cResolveSizeAndState, iKeyCodeFromString, -2040903174, false, $$j(b16, b16, bArr[1]), new Class[]{Object.class, cls, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                getmessageversion.AuthenticationRequestParameters = iIntValue;
                i31++;
                i25 = 16;
            }
            int i33 = getmessageversion.AuthenticationRequestParameters;
            getmessageversion.getDeviceData = i33;
            getmessageversion.AuthenticationRequestParameters = i13;
            int i34 = i13 ^ iArr4[16];
            getmessageversion.AuthenticationRequestParameters = i34;
            int i35 = i33 ^ iArr4[17];
            getmessageversion.getDeviceData = i35;
            cArr[0] = (char) (i35 >>> 16);
            cArr[1] = (char) i35;
            cArr[i23] = (char) (i34 >>> 16);
            cArr[3] = (char) i34;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr4);
            int i36 = getmessageversion.getSDKAppID;
            cArr4[i36 * 2] = cArr[0];
            cArr4[(i36 * 2) + 1] = cArr[1];
            cArr4[(i36 * 2) + 2] = cArr[i23];
            cArr4[(i36 * 2) + 3] = cArr[3];
            int i37 = i23;
            Object[] objArr6 = new Object[i37];
            objArr6[1] = getmessageversion;
            objArr6[0] = getmessageversion;
            Object sDKTransactionID5 = atd.e.ChallengeResult.getSDKTransactionID(35442447);
            if (sDKTransactionID5 == null) {
                i25 = 16;
                int jumpTapTimeout = 1861 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 40;
                byte b17 = $$h[0];
                byte b18 = (byte) (b17 - 1);
                sDKTransactionID5 = atd.e.ChallengeResult.getDeviceData(jumpTapTimeout, cLastIndexOf, tapTimeout, -562771681, false, $$j(b18, b18, b17), new Class[]{Object.class, Object.class});
            } else {
                i25 = 16;
            }
            ((Method) sDKTransactionID5).invoke(null, objArr6);
            i23 = i37;
        }
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        getTransactionStatus gettransactionstatus = (getTransactionStatus) objArr[0];
        int i11 = getAdditionalDetails + 63;
        int i12 = i11 % 128;
        ChallengeResultTimeout = i12;
        int i13 = i11 % 2;
        String str = gettransactionstatus.getTransactionStatus;
        if (i13 == 0) {
            throw null;
        }
        getAdditionalDetails = (i12 + 91) % 128;
        return str;
    }

    public static /* synthetic */ Object getSDKTransactionID(int i11, int i12, int i13, int i14, int i15, int i16, Object[] objArr) {
        int i17 = i16 | i11;
        int i18 = ~i11;
        int i19 = ~i12;
        int i21 = ~(i18 | i19);
        int i22 = ~i16;
        int i23 = i21 | (~(i22 | i12));
        int i24 = ~(i19 | i16);
        int i25 = i23 | i24;
        int i26 = (~(i12 | i22 | i11)) | i24;
        int i27 = ((-182452224) * i15) + (1612709888 * i13) + (1696595968 * i14) + (674303503 * i26) + ((-674303503) * i25) + (i17 * (-674303503)) + ((-1924067824) * i11) + ((i16 * (-1924067824)) - 304087040);
        int iC = a0.c(i15, -1035018111, (1881146393 * i13) + i16 + i11 + i14);
        if (a0.e(iC, 1550319616, (i15 * 1329932787) + (i13 * (-1331189957)) + (i14 * (-928100237)) + (i26 * 189) + (i25 * (-189)) + (i17 * (-189)) + (i11 * (-928100048)) + (i16 * (-928100048)) + 945860906, 1690828800, ((-1611137024) * iC) + i27) != 1) {
            return getSDKReferenceNumber(objArr);
        }
        getTransactionStatus gettransactionstatus = (getTransactionStatus) objArr[0];
        int i28 = (ChallengeResultTimeout + 77) % 128;
        getAdditionalDetails = i28;
        String str = gettransactionstatus.ChallengeResultCancelled;
        ChallengeResultTimeout = (i28 + 51) % 128;
        return str;
    }

    public static void init$0() {
        $$h = new byte[]{1, 2, 88, 62};
        $$i = 79;
    }

    public static void onCompletion() {
        ChallengeResultError = new int[]{-1934528588, 1124637718, -1946365073, 1736643219, -1911595688, 666737822, -982976941, 1289727047, 338383112, 358484635, 815341926, -96547471, -106820167, 881549447, 912505098, 1002546279, 933031787, 1621168068};
    }

    public final String BuildConfig() {
        int i11 = getAdditionalDetails + 37;
        int i12 = i11 % 128;
        ChallengeResultTimeout = i12;
        int i13 = i11 % 2;
        String str = this.getMessageVersion;
        if (i13 == 0) {
            int i14 = 58 / 0;
        }
        getAdditionalDetails = (i12 + 33) % 128;
        return str;
    }

    public final String ChallengeResult() {
        int i11 = ChallengeResultTimeout;
        String str = this.getSDKTransactionID;
        getAdditionalDetails = (i11 + 97) % 128;
        return str;
    }

    public final String ChallengeResultCancelled() {
        int sDKReferenceNumber = DeviceParameterResult.Success.IntValue.getSDKReferenceNumber();
        int sDKReferenceNumber2 = DeviceParameterResult.Success.IntValue.getSDKReferenceNumber();
        return (String) getSDKTransactionID(1879579140, sDKReferenceNumber, DeviceParameterResult.Success.IntValue.getSDKReferenceNumber(), sDKReferenceNumber2, DeviceParameterResult.Success.IntValue.getSDKReferenceNumber(), -1879579139, new Object[]{this});
    }

    public final String ChallengeResultCompleted() {
        int i11 = ChallengeResultTimeout + 113;
        getAdditionalDetails = i11 % 128;
        int i12 = i11 % 2;
        String str = this.BuildConfig;
        if (i12 == 0) {
            return str;
        }
        throw null;
    }

    public final String ChallengeResultError() {
        int sDKReferenceNumber = DeviceParameterResult.Success.IntValue.getSDKReferenceNumber();
        int sDKReferenceNumber2 = DeviceParameterResult.Success.IntValue.getSDKReferenceNumber();
        return (String) getSDKTransactionID(-516478175, sDKReferenceNumber, DeviceParameterResult.Success.IntValue.getSDKReferenceNumber(), sDKReferenceNumber2, DeviceParameterResult.Success.IntValue.getSDKReferenceNumber(), 516478175, new Object[]{this});
    }

    public final getMessageVersion ChallengeResultTimeout() {
        int i11 = (ChallengeResultTimeout + 91) % 128;
        getAdditionalDetails = i11;
        getMessageVersion getmessageversion = this.getSDKEphemeralPublicKey;
        ChallengeResultTimeout = (i11 + 117) % 128;
        return getmessageversion;
    }

    @Override // atd.c.getSDKTransactionID, android.os.Parcelable
    public int describeContents() {
        int i11 = getAdditionalDetails + 71;
        ChallengeResultTimeout = i11 % 128;
        if (i11 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    @Override // atd.c.getSDKTransactionID
    public boolean equals(Object obj) {
        int i11 = getAdditionalDetails + 69;
        int i12 = i11 % 128;
        ChallengeResultTimeout = i12;
        if (i11 % 2 == 0) {
            int i13 = 85 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (obj != null) {
            getAdditionalDetails = (i12 + 39) % 128;
            if (getClass() == obj.getClass()) {
                if (!super.equals(obj)) {
                    int i14 = (ChallengeResultTimeout + 91) % 128;
                    getAdditionalDetails = i14;
                    ChallengeResultTimeout = (i14 + 47) % 128;
                    return false;
                }
                getTransactionStatus gettransactionstatus = (getTransactionStatus) obj;
                if (!atd.bc.ChallengeResult.AuthenticationRequestParameters(this.getSDKReferenceNumber, gettransactionstatus.getSDKReferenceNumber) || !atd.bc.ChallengeResult.AuthenticationRequestParameters(this.getDeviceData, gettransactionstatus.getDeviceData) || !atd.bc.ChallengeResult.AuthenticationRequestParameters(this.getSDKTransactionID, gettransactionstatus.getSDKTransactionID)) {
                    return false;
                }
                if (this.getSDKAppID == gettransactionstatus.getSDKAppID) {
                    return atd.bc.ChallengeResult.AuthenticationRequestParameters(this.AuthenticationRequestParameters, gettransactionstatus.AuthenticationRequestParameters);
                }
                ChallengeResultTimeout = (getAdditionalDetails + 87) % 128;
                return false;
            }
        }
        return false;
    }

    public final getMessageVersion getAdditionalDetails() {
        int i11 = getAdditionalDetails + 81;
        int i12 = i11 % 128;
        ChallengeResultTimeout = i12;
        int i13 = i11 % 2;
        getMessageVersion getmessageversion = this.ChallengeResultCompleted;
        if (i13 == 0) {
            int i14 = 8 / 0;
        }
        getAdditionalDetails = (i12 + 41) % 128;
        return getmessageversion;
    }

    @Override // atd.c.getSDKTransactionID
    public void getDeviceData() {
        getAdditionalDetails = (ChallengeResultTimeout + 27) % 128;
        super.getDeviceData();
        this.getSDKReferenceNumber = null;
        this.getDeviceData = null;
        this.getSDKTransactionID = null;
        this.getSDKAppID = null;
        this.AuthenticationRequestParameters = null;
        this.ChallengeResultCancelled = null;
        this.ChallengeResult = null;
        this.getMessageVersion = null;
        this.BuildConfig = null;
        getMessageVersion getmessageversion = this.getSDKEphemeralPublicKey;
        if (getmessageversion != null) {
            int i11 = ChallengeResultTimeout + 79;
            getAdditionalDetails = i11 % 128;
            if (i11 % 2 != 0) {
                getmessageversion.getSDKReferenceNumber();
                this.getSDKEphemeralPublicKey = null;
                throw null;
            }
            getmessageversion.getSDKReferenceNumber();
            this.getSDKEphemeralPublicKey = null;
        }
        getMessageVersion getmessageversion2 = this.ChallengeResultCompleted;
        if (getmessageversion2 != null) {
            int i12 = ChallengeResultTimeout + 101;
            getAdditionalDetails = i12 % 128;
            if (i12 % 2 != 0) {
                getmessageversion2.getSDKReferenceNumber();
                this.ChallengeResultCompleted = null;
                throw null;
            }
            getmessageversion2.getSDKReferenceNumber();
            this.ChallengeResultCompleted = null;
        }
        this.getTransactionStatus = null;
    }

    public final String getMessageVersion() {
        int i11 = getAdditionalDetails + 49;
        int i12 = i11 % 128;
        ChallengeResultTimeout = i12;
        int i13 = i11 % 2;
        String str = this.ChallengeResult;
        if (i13 == 0) {
            throw null;
        }
        getAdditionalDetails = (i12 + 95) % 128;
        return str;
    }

    public final String getSDKAppID() {
        int i11 = getAdditionalDetails + 1;
        int i12 = i11 % 128;
        ChallengeResultTimeout = i12;
        int i13 = i11 % 2;
        String str = this.getSDKReferenceNumber;
        if (i13 == 0) {
            throw null;
        }
        getAdditionalDetails = (i12 + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
        return str;
    }

    public final String getSDKEphemeralPublicKey() {
        int i11 = ChallengeResultTimeout + 39;
        getAdditionalDetails = i11 % 128;
        int i12 = i11 % 2;
        String str = this.AuthenticationRequestParameters;
        if (i12 != 0) {
            int i13 = 25 / 0;
        }
        return str;
    }

    public final boolean getTransactionStatus() throws Throwable {
        int i11 = getAdditionalDetails + 105;
        ChallengeResultTimeout = i11 % 128;
        int i12 = i11 % 2;
        atd.h.getDeviceData getdevicedata = this.getSDKAppID;
        if (i12 != 0) {
            return getdevicedata.getSDKAppID();
        }
        getdevicedata.getSDKAppID();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029 A[PHI: r0
      0x0029: PHI (r0v17 int) = (r0v4 int), (r0v19 int) binds: [B:8:0x0020, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r0
      0x0022: PHI (r0v5 int) = (r0v4 int), (r0v19 int) binds: [B:8:0x0020, B:5:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // atd.c.getSDKTransactionID
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r4 = this;
            int r0 = atd.c.getTransactionStatus.getAdditionalDetails
            int r0 = r0 + 53
            int r1 = r0 % 128
            atd.c.getTransactionStatus.ChallengeResultTimeout = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L18
            int r0 = super.hashCode()
            int r0 = r0 % 106
            java.lang.String r2 = r4.getSDKReferenceNumber
            if (r2 == 0) goto L29
            goto L22
        L18:
            int r0 = super.hashCode()
            int r0 = r0 * 31
            java.lang.String r2 = r4.getSDKReferenceNumber
            if (r2 == 0) goto L29
        L22:
            java.lang.String r2 = r4.getSDKReferenceNumber
            int r2 = r2.hashCode()
            goto L2a
        L29:
            r2 = r1
        L2a:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r4.getDeviceData
            if (r2 == 0) goto L3e
            int r3 = atd.c.getTransactionStatus.getAdditionalDetails
            int r3 = r3 + 39
            int r3 = r3 % 128
            atd.c.getTransactionStatus.ChallengeResultTimeout = r3
            int r2 = r2.hashCode()
            goto L3f
        L3e:
            r2 = r1
        L3f:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r4.getSDKTransactionID
            if (r2 == 0) goto L4b
            int r2 = r2.hashCode()
            goto L4c
        L4b:
            r2 = r1
        L4c:
            int r0 = r0 + r2
            int r0 = r0 * 31
            atd.h.getDeviceData r2 = r4.getSDKAppID
            if (r2 == 0) goto L60
            int r3 = atd.c.getTransactionStatus.ChallengeResultTimeout
            int r3 = r3 + 119
            int r3 = r3 % 128
            atd.c.getTransactionStatus.getAdditionalDetails = r3
            int r2 = r2.hashCode()
            goto L61
        L60:
            r2 = r1
        L61:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r4.AuthenticationRequestParameters
            if (r2 == 0) goto L6c
            int r1 = r2.hashCode()
        L6c:
            int r0 = r0 + r1
            int r1 = atd.c.getTransactionStatus.getAdditionalDetails
            int r1 = r1 + 123
            int r2 = r1 % 128
            atd.c.getTransactionStatus.ChallengeResultTimeout = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L7a
            return r0
        L7a:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.c.getTransactionStatus.hashCode():int");
    }

    @Override // atd.c.getSDKTransactionID, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        getAdditionalDetails = (ChallengeResultTimeout + 91) % 128;
        super.writeToParcel(parcel, i11);
        parcel.writeString(this.getSDKReferenceNumber);
        parcel.writeString(this.getDeviceData);
        parcel.writeString(this.getSDKTransactionID);
        parcel.writeString(this.getSDKAppID.name());
        parcel.writeString(this.AuthenticationRequestParameters);
        parcel.writeString(this.ChallengeResultCancelled);
        parcel.writeString(this.ChallengeResult);
        parcel.writeString(this.getMessageVersion);
        parcel.writeString(this.BuildConfig);
        parcel.writeParcelable(this.getSDKEphemeralPublicKey, i11);
        parcel.writeParcelable(this.ChallengeResultCompleted, i11);
        parcel.writeString(this.getTransactionStatus);
        int i12 = ChallengeResultTimeout + 43;
        getAdditionalDetails = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public final String getSDKReferenceNumber() {
        int i11 = ChallengeResultTimeout + 69;
        getAdditionalDetails = i11 % 128;
        int i12 = i11 % 2;
        String str = this.getDeviceData;
        if (i12 != 0) {
            int i13 = 51 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: atd.c.getTransactionStatus$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public class AnonymousClass1 implements Parcelable.Creator<getTransactionStatus> {
        public static int getDeviceData = 0;
        private static int getSDKAppID = 0;
        public static int getSDKReferenceNumber = 0;
        private static int getSDKTransactionID = 1;

        private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
            int iIntValue = ((Number) objArr[1]).intValue();
            int i11 = getSDKTransactionID;
            int i12 = i11 & 51;
            int i13 = (((i11 | 51) & (~i12)) - (~(i12 << 1))) - 1;
            getSDKAppID = i13 % 128;
            int i14 = i13 % 2;
            Integer numValueOf = Integer.valueOf(iIntValue);
            if (i14 == 0) {
                int iAuthenticationRequestParameters = ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters();
                return (getTransactionStatus[]) getSDKReferenceNumber(new Object[]{numValueOf}, ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters(), ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters(), -2005600202, ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters(), 2005600205, iAuthenticationRequestParameters);
            }
            int iAuthenticationRequestParameters2 = ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters();
            int i15 = 4 / 0;
            return (getTransactionStatus[]) getSDKReferenceNumber(new Object[]{numValueOf}, ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters(), ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters(), -2005600202, ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters(), 2005600205, iAuthenticationRequestParameters2);
        }

        private static /* synthetic */ Object getDeviceData(Object[] objArr) {
            getTransactionStatus gettransactionstatus = new getTransactionStatus((Parcel) objArr[0]);
            int iAuthenticationRequestParameters = ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters();
            int i11 = ~iAuthenticationRequestParameters;
            int i12 = ~iAuthenticationRequestParameters;
            int i13 = i11 & (i12 | iAuthenticationRequestParameters);
            int i14 = 2096317524 & i13;
            int i15 = (i13 | 2096317524) & (~i14);
            int i16 = ~((i15 & i14) | (i15 ^ i14));
            int i17 = 1874359085 | iAuthenticationRequestParameters;
            int i18 = (i17 | (~i17)) & (~i17);
            int i19 = i16 ^ i18;
            int i21 = i16 & i18;
            int i22 = -(-(((i21 & i19) | (i19 ^ i21)) * (-370)));
            int i23 = 52759847 & i22;
            int i24 = (i22 | 52759847) & (~i23);
            int i25 = -(-(i23 << 1));
            int i26 = (i24 & i25) + (i24 | i25);
            int i27 = ((~i12) & 1874359085) | ((-1874359086) & i12) | (i12 & 1874359085);
            int i28 = (i27 | (~i27)) & (~i27);
            int i29 = 2096317524 ^ iAuthenticationRequestParameters;
            int i31 = iAuthenticationRequestParameters & 2096317524;
            int i32 = ~((i31 & i29) | (i29 ^ i31));
            int i33 = i28 ^ i32;
            int i34 = i32 & i28;
            int i35 = (i34 & i33) | (i33 ^ i34);
            int i36 = -(-(((i35 & 1823490052) | (i35 ^ 1823490052)) * (-370)));
            int i37 = ((((~i36) & i26) | ((~i26) & i36)) - (~(-(-((i36 & i26) << 1))))) - 1;
            int i38 = i37 & 381453768;
            int i39 = i38 + ((381453768 ^ i37) | i38);
            int iAuthenticationRequestParameters2 = ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters();
            int i41 = ~iAuthenticationRequestParameters2;
            int i42 = i41 & (-1562652181);
            int i43 = (i41 | (-1562652181)) & (~i42);
            int i44 = (i43 & i42) | (i43 ^ i42);
            int i45 = i44 & 131878616;
            int i46 = ~(((i44 | 131878616) & (~i45)) | i45);
            int i47 = 47726792 & i46;
            int i48 = (-2) - (((-565394153) - (~((((i46 | 47726792) & (~i47)) | i47) * 220))) ^ (-1));
            int i49 = (~iAuthenticationRequestParameters2) & ((~iAuthenticationRequestParameters2) | iAuthenticationRequestParameters2);
            int i51 = ((-131878617) & i49) | ((~i49) & 131878616);
            int i52 = 131878616 & i49;
            int i53 = ~((i52 & i51) | (i51 ^ i52));
            int i54 = ((~i53) & (-1562652181)) | (1562652180 & i53);
            int i55 = (-1562652181) & i53;
            int i56 = -(~(((i55 & i54) | (i54 ^ i55)) * (-440)));
            int i57 = ((i48 & i56) + (i48 | i56)) - 1;
            int i58 = -(-(((iAuthenticationRequestParameters2 & (-1478500357)) | ((-1478500357) ^ iAuthenticationRequestParameters2)) * 220));
            int i59 = i57 & i58;
            int i61 = (i58 | i57) & (~i59);
            int i62 = -(-(i59 << 1));
            if (i39 > ((i61 | i62) << 1) - (i61 ^ i62)) {
                return gettransactionstatus;
            }
            throw null;
        }

        private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
            Parcel parcel = (Parcel) objArr[1];
            int i11 = getSDKTransactionID;
            int i12 = i11 & 3;
            int i13 = ((i11 ^ 3) | i12) << 1;
            int i14 = -((i11 | 3) & (~i12));
            getSDKAppID = ((i13 ^ i14) + ((i14 & i13) << 1)) % 128;
            int iAuthenticationRequestParameters = ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters();
            getTransactionStatus gettransactionstatus = (getTransactionStatus) getSDKReferenceNumber(new Object[]{parcel}, ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters(), ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters(), 1175523354, ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters(), -1175523354, iAuthenticationRequestParameters);
            int i15 = getSDKAppID;
            int i16 = i15 ^ 57;
            int i17 = (((i15 & 57) | i16) << 1) - i16;
            getSDKTransactionID = i17 % 128;
            if (i17 % 2 == 0) {
                int i18 = 52 / 0;
            }
            return gettransactionstatus;
        }

        public static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr, int i11, int i12, int i13, int i14, int i15, int i16) {
            int i17 = ~i16;
            int i18 = (~(i17 | i15)) | (~(i13 | i15));
            int i19 = i13 | i16;
            int i21 = (i19 * 826660534) + ((-826660534) * i18) + ((-560584373) * i15) + ((i13 * (-560584373)) - 948043776);
            int i22 = (~(i16 | (~i15))) | (~(i17 | (~i13))) | (~i19);
            int i23 = ((-766246912) * i14) + ((-71041024) * i11) + (266076160 * i12) + (826660534 * i22) + i21;
            int iC = a0.c(i14, -44904237, (1350191703 * i11) + i13 + i15 + i12);
            int i24 = i19 * 918;
            int i25 = i22 * 918;
            int i26 = i12 * 1657716305;
            int i27 = i11 * 1507858311;
            int i28 = i14 * 1845144771;
            int iE = a0.e(iC, 155058176, i28 + i27 + i26 + i25 + i24 + (i18 * (-918)) + (i15 * 1657715387) + (i13 * 1657715387) + 2046152777, 417464320, (1339949056 * iC) + i23);
            if (iE == 1) {
                return AuthenticationRequestParameters(objArr);
            }
            if (iE == 2) {
                return getSDKAppID(objArr);
            }
            if (iE != 3) {
                return getDeviceData(objArr);
            }
            int iIntValue = ((Number) objArr[0]).intValue();
            int i29 = getSDKAppID;
            int i31 = i29 & 27;
            int i32 = i29 | 27;
            int i33 = ((i31 & i32) + (i32 | i31)) % 128;
            getSDKTransactionID = i33;
            getTransactionStatus[] gettransactionstatusArr = new getTransactionStatus[iIntValue];
            getSDKAppID = ((((i33 ^ 119) | (i33 & 119)) << 1) - ((i33 & (-120)) | ((~i33) & 119))) % 128;
            return gettransactionstatusArr;
        }

        private static getTransactionStatus[] getSDKTransactionID(int i11) {
            Object[] objArr = {Integer.valueOf(i11)};
            int iAuthenticationRequestParameters = ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters();
            return (getTransactionStatus[]) getSDKReferenceNumber(objArr, ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters(), ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters(), -2005600202, ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters(), 2005600205, iAuthenticationRequestParameters);
        }

        /* JADX WARN: Type inference failed for: r8v1, types: [atd.c.getTransactionStatus, java.lang.Object] */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ getTransactionStatus createFromParcel(Parcel parcel) {
            int iAuthenticationRequestParameters = ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters();
            return getSDKReferenceNumber(new Object[]{this, parcel}, ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters(), ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters(), -467980642, ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters(), 467980644, iAuthenticationRequestParameters);
        }

        /* JADX WARN: Type inference failed for: r8v3, types: [atd.c.getTransactionStatus[], java.lang.Object[]] */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ getTransactionStatus[] newArray(int i11) {
            Object[] objArr = {this, Integer.valueOf(i11)};
            int iAuthenticationRequestParameters = ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters();
            return (Object[]) getSDKReferenceNumber(objArr, ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters(), ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters(), 1751753674, ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters(), -1751753673, iAuthenticationRequestParameters);
        }

        public static int getSDKTransactionID() {
            int i11 = getDeviceData;
            int i12 = i11 % 9566403;
            getDeviceData = i11 + 1;
            if (i12 != 0) {
                return getSDKReferenceNumber;
            }
            int i13 = (int) Runtime.getRuntime().totalMemory();
            getSDKReferenceNumber = i13;
            return i13;
        }

        private static getTransactionStatus getSDKTransactionID(Parcel parcel) {
            int iAuthenticationRequestParameters = ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters();
            return (getTransactionStatus) getSDKReferenceNumber(new Object[]{parcel}, ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters(), ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters(), 1175523354, ErrorMessage.getSDKReferenceNumber.AuthenticationRequestParameters(), -1175523354, iAuthenticationRequestParameters);
        }
    }

    public getTransactionStatus(Parcel parcel) throws Throwable {
        super(parcel);
        this.getSDKReferenceNumber = parcel.readString();
        this.getDeviceData = parcel.readString();
        this.getSDKTransactionID = parcel.readString();
        atd.h.getDeviceData sDKReferenceNumber = atd.h.getDeviceData.getSDKReferenceNumber(parcel.readString());
        this.getSDKAppID = sDKReferenceNumber;
        if (sDKReferenceNumber != null) {
            this.AuthenticationRequestParameters = parcel.readString();
            this.ChallengeResultCancelled = parcel.readString();
            this.ChallengeResult = parcel.readString();
            this.getMessageVersion = parcel.readString();
            this.BuildConfig = parcel.readString();
            this.getSDKEphemeralPublicKey = (getMessageVersion) parcel.readParcelable(getMessageVersion.class.getClassLoader());
            this.ChallengeResultCompleted = (getMessageVersion) parcel.readParcelable(getMessageVersion.class.getClassLoader());
            this.getTransactionStatus = parcel.readString();
            return;
        }
        Object[] objArr = new Object[1];
        b(new int[]{585475456, 1750590456, -1568477221, -441234434, 445960460, -598049381, -1363489578, 569464737, -877754264, 234092534, -1244437239, 1666104749}, ExpandableListView.getPackedPositionGroup(0L) + 21, objArr);
        d0.k(((String) objArr[0]).intern());
        throw null;
    }
}
