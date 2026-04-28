package atd.h;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import atd.am.getSDKEphemeralPublicKey;
import atd.bb.onCompletion;
import atd.e.ChallengeResult;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKAppID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ getSDKAppID[] $VALUES;
    private static long AuthenticationRequestParameters;
    private static int BuildConfig;
    public static final getSDKAppID CHALLENGE_REQUEST;
    public static final getSDKAppID CHALLENGE_RESPONSE;
    private static int ChallengeResultCancelled;
    public static final getSDKAppID ERROR;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static char getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final String mValue;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r7, byte r8, short r9) {
        /*
            int r9 = r9 * 2
            int r9 = 4 - r9
            byte[] r0 = atd.h.getSDKAppID.$$a
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r8 = 119 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r0
            r5 = r2
            r0 = r9
            r9 = r7
            goto L2b
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r0
            r0 = r6
        L2b:
            int r8 = -r8
            int r8 = r8 + r9
            int r9 = r0 + 1
            r0 = r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.h.getSDKAppID.$$c(byte, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = 0;
        ChallengeResultCancelled = 1;
        getSDKAppID = 0;
        getSDKTransactionID = 1;
        getSDKTransactionID();
        Object[] objArr = new Object[1];
        a("\u0000\u0000\u0000\u0000", "䥔\udcef胚탸", "癷픦鑔䅕耟ᰏ⼖芛쀆鵌䡙\uf219쳌濷\uf8b8ዓ剚", (ViewConfiguration.getLongPressTimeout() >> 16) - 623055031, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 63616), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("\u0000\u0000\u0000\u0000", "扂胊\uf85c䎽", "䞃쁦鍏\ud840", TextUtils.getCapsMode("", 0, 0), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 48631), objArr2);
        CHALLENGE_REQUEST = new getSDKAppID(strIntern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a("\u0000\u0000\u0000\u0000", "\u1cfe拃꾩驹", "ሜ亃䆙핏舿䓠\ude21ƻ딕\ued4f륊\udee7镹损獞ﵮ髱旀", Color.alpha(0), (char) (31151 - (ViewConfiguration.getLongPressTimeout() >> 16)), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a("\u0000\u0000\u0000\u0000", "뷌泄ᱢ儸", "\udaf0\uda5e㼭ޏ", ViewConfiguration.getScrollDefaultDelay() >> 16, (char) (14364 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr4);
        CHALLENGE_RESPONSE = new getSDKAppID(strIntern2, 1, ((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        a("\u0000\u0000\u0000\u0000", "\uf81f籁䚃ᣗ", "惡罳ྏᄶ붏", View.resolveSizeAndState(0, 0, 0) - 2089008648, (char) (TextUtils.getTrimmedLength("") + 55110), objArr5);
        String strIntern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a("\u0000\u0000\u0000\u0000", "飭⏘ꈲ쳍", "ﯱ贜㜣ꊅ", ViewConfiguration.getScrollBarSize() >> 8, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 52643), objArr6);
        ERROR = new getSDKAppID(strIntern3, 2, ((String) objArr6[0]).intern());
        $VALUES = getSDKReferenceNumber();
        ChallengeResultCancelled = (BuildConfig + 65) % 128;
    }

    private getSDKAppID(String str, int i11, String str2) {
        this.mValue = str2;
    }

    private static void a(String str, String str2, String str3, int i11, char c3, Object[] objArr) throws Throwable {
        char[] charArray;
        char[] charArray2;
        int i12;
        long j9;
        int i13;
        char[] cArr;
        char c7;
        int i14 = $10 + 87;
        $11 = i14 % 128;
        int i15 = 2;
        Object obj = null;
        if (i14 % 2 == 0) {
            throw null;
        }
        if (str3 != null) {
            charArray = str3.toCharArray();
            $10 = ($11 + 39) % 128;
        } else {
            charArray = str3;
        }
        char[] cArr2 = charArray;
        char[] charArray3 = str2 != null ? str2.toCharArray() : str2;
        if (str != null) {
            $11 = ($10 + 65) % 128;
            charArray2 = str.toCharArray();
        } else {
            charArray2 = str;
        }
        char[] cArr3 = charArray2;
        onCompletion oncompletion = new onCompletion();
        int length = charArray3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i16 = 0;
        System.arraycopy(charArray3, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c3);
        cArr5[2] = (char) (cArr5[2] + ((char) i11));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        oncompletion.getDeviceData = 0;
        while (oncompletion.getDeviceData < length3) {
            try {
                Object[] objArr2 = {oncompletion};
                Object sDKTransactionID = ChallengeResult.getSDKTransactionID(874886523);
                if (sDKTransactionID == null) {
                    j9 = 0;
                    byte b8 = (byte) i16;
                    byte b11 = (byte) (b8 + 2);
                    i12 = i15;
                    sDKTransactionID = ChallengeResult.getDeviceData(2070 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (TextUtils.getTrimmedLength("") + 44657), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 32, -397560981, false, $$c(b8, b11, (byte) (b11 - 2)), new Class[]{Object.class});
                } else {
                    i12 = i15;
                    j9 = 0;
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {oncompletion};
                Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(1806403515);
                if (sDKTransactionID2 == null) {
                    byte b12 = (byte) i16;
                    i13 = i16;
                    byte b13 = (byte) (b12 + 1);
                    sDKTransactionID2 = ChallengeResult.getDeviceData(3096 - (ViewConfiguration.getZoomControlsTimeout() > j9 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j9 ? 0 : -1)), (char) (14367 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 18 - (ViewConfiguration.getScrollBarSize() >> 8), -1211924053, false, $$c(b12, b13, (byte) (b13 - 1)), new Class[]{Object.class});
                } else {
                    i13 = i16;
                }
                int iIntValue2 = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                int i17 = cArr4[oncompletion.getDeviceData % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i12] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i17);
                objArr4[i13] = oncompletion;
                Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(1695612280);
                Class cls = Integer.TYPE;
                if (sDKTransactionID3 == null) {
                    c7 = 1;
                    byte b14 = (byte) i13;
                    byte b15 = b14;
                    cArr = cArr2;
                    sDKTransactionID3 = ChallengeResult.getDeviceData((ViewConfiguration.getDoubleTapTimeout() >> 16) + 1428, (char) (ViewConfiguration.getLongPressTimeout() >> 16), 30 - View.MeasureSpec.getMode(i13), -1183253656, false, $$c(b14, b15, b15), new Class[]{Object.class, cls, cls});
                } else {
                    cArr = cArr2;
                    c7 = 1;
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                int i18 = cArr4[iIntValue2] * 32718;
                int i19 = i12;
                Object[] objArr5 = new Object[i19];
                objArr5[c7] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[0] = Integer.valueOf(i18);
                Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(814479823);
                if (sDKTransactionID4 == null) {
                    byte b16 = (byte) 0;
                    sDKTransactionID4 = ChallengeResult.getDeviceData(2774 - TextUtils.getCapsMode("", 0, 0), (char) (13059 - TextUtils.lastIndexOf("", '0')), 26 - (Process.getElapsedCpuTime() > j9 ? 1 : (Process.getElapsedCpuTime() == j9 ? 0 : -1)), -320602145, false, $$c(b16, (byte) (b16 | 51), b16), new Class[]{cls, cls});
                }
                cArr5[iIntValue2] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = oncompletion.AuthenticationRequestParameters;
                int i21 = oncompletion.getDeviceData;
                cArr6[i21] = (char) (((((long) (r0 ^ cArr[i21])) ^ (AuthenticationRequestParameters ^ 1905653906042338631L)) ^ ((long) ((int) (((long) getDeviceData) ^ 1905653906042338631L)))) ^ ((long) ((char) (((long) getSDKReferenceNumber) ^ 1905653906042338631L))));
                oncompletion.getDeviceData = i21 + 1;
                i15 = i19;
                cArr2 = cArr;
                obj = null;
                i16 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    public static getSDKAppID getDeviceData(String str) throws Throwable {
        getSDKTransactionID = (getSDKAppID + 77) % 128;
        getSDKAppID[] getsdkappidArr = (getSDKAppID[]) getSDKAppID.class.getEnumConstants();
        int length = getsdkappidArr.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = getSDKTransactionID + 31;
            getSDKAppID = i12 % 128;
            if (i12 % 2 != 0) {
                getsdkappidArr[i11].AuthenticationRequestParameters().equals(str);
                throw null;
            }
            getSDKAppID getsdkappid = getsdkappidArr[i11];
            if (getsdkappid.AuthenticationRequestParameters().equals(str)) {
                return getsdkappid;
            }
            i11++;
            getSDKTransactionID = (getSDKAppID + 15) % 128;
        }
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[1];
        a("\u0000\u0000\u0000\u0000", "增䶷缕ᗓ", "湮礀\ue37e鹄섭ⴟ㋁茒ࣆ鰛麬\ueafbⷹ橥测\ue5b2ﳉ\uec0c잺\ue198횲\ud9e8㫂瀬봂\u10cb쏤迹Ｘ\ue4c3⯣իꃹ", 357414744 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr);
        throw new atd.ac.getSDKAppID(String.format(locale, ((String) objArr[0]).intern(), str), getSDKReferenceNumber.MESSAGE_RECEIVED_INVALID, getSDKEphemeralPublicKey.INVALID_MESSAGE_TYPE);
    }

    private static /* synthetic */ getSDKAppID[] getSDKReferenceNumber() {
        int i11 = getSDKAppID;
        getSDKAppID[] getsdkappidArr = {CHALLENGE_REQUEST, CHALLENGE_RESPONSE, ERROR};
        getSDKTransactionID = (i11 + 23) % 128;
        return getsdkappidArr;
    }

    public static void getSDKTransactionID() {
        AuthenticationRequestParameters = 1905653906042338631L;
        getDeviceData = -531511334;
        getSDKReferenceNumber = (char) 15687;
    }

    public static void init$0() {
        $$a = new byte[]{49, -90, -82, 29};
        $$b = 161;
    }

    public static getSDKAppID valueOf(String str) {
        int i11 = getSDKTransactionID + 125;
        getSDKAppID = i11 % 128;
        int i12 = i11 % 2;
        getSDKAppID getsdkappid = (getSDKAppID) Enum.valueOf(getSDKAppID.class, str);
        if (i12 != 0) {
            int i13 = 1 / 0;
        }
        return getsdkappid;
    }

    public static getSDKAppID[] values() {
        int i11 = getSDKAppID + 117;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            return (getSDKAppID[]) $VALUES.clone();
        }
        int i12 = 33 / 0;
        return (getSDKAppID[]) $VALUES.clone();
    }

    public final String AuthenticationRequestParameters() {
        int i11 = getSDKTransactionID + 89;
        getSDKAppID = i11 % 128;
        int i12 = i11 % 2;
        String str = this.mValue;
        if (i12 != 0) {
            int i13 = 33 / 0;
        }
        return str;
    }
}
