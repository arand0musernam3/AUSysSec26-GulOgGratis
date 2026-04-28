package atd.bc;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.bb.ChallengeResultKt;
import com.adyen.threeds2.exception.InvalidInputException;
import java.lang.reflect.Method;
import java.util.Locale;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKAppID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static char getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, int r7, short r8) {
        /*
            int r7 = 122 - r7
            byte[] r0 = atd.bc.getSDKAppID.$$a
            int r6 = r6 * 3
            int r6 = 4 - r6
            int r8 = r8 * 4
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r4 = r8
            r3 = r2
            goto L28
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L28:
            int r4 = -r4
            int r6 = r6 + r4
            int r7 = r7 + 1
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.bc.getSDKAppID.$$c(short, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        BuildConfig = 1;
        getDeviceData = 0;
        getSDKTransactionID = 1;
        getSDKTransactionID();
        TextUtils.getOffsetAfter("", 0);
        AudioTrack.getMaxVolume();
        int i11 = getSDKAppID + 103;
        BuildConfig = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private static void a(String str, int i11, byte b8, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        char c3;
        int i13;
        char c7;
        int i14;
        int i15;
        char c8;
        char c11;
        char c12 = 3;
        char c13 = 2;
        if (str != null) {
            int i16 = $11 + 3;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        ChallengeResultKt challengeResultKt = new ChallengeResultKt();
        char[] cArr2 = AuthenticationRequestParameters;
        Class cls = Integer.TYPE;
        int i17 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i18 = 0;
            while (i18 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i18])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(-317146529);
                    if (sDKTransactionID == null) {
                        c8 = c12;
                        byte b11 = (byte) 0;
                        c11 = c13;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(2158 - Color.red(0), (char) View.MeasureSpec.makeMeasureSpec(0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 36, 829471823, false, $$c(b11, (byte) (b11 | 57), b11), new Class[]{cls});
                    } else {
                        c8 = c12;
                        c11 = c13;
                    }
                    cArr3[i18] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i18++;
                    c12 = c8;
                    c13 = c11;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char c14 = c12;
        char c15 = c13;
        Object[] objArr3 = {Integer.valueOf(getSDKReferenceNumber)};
        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-317146529);
        char c16 = '0';
        char c17 = 6;
        if (sDKTransactionID2 == null) {
            byte b12 = (byte) 0;
            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2158, (char) ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.lastIndexOf("", '0', 0, 0) + 37, 829471823, false, $$c(b12, (byte) (b12 | 57), b12), new Class[]{cls});
        }
        char cCharValue = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i11];
        if (i11 % 2 != 0) {
            i12 = i11 - 1;
            cArr4[i12] = (char) (cArr[i12] - b8);
            $10 = ($11 + 47) % 128;
        } else {
            i12 = i11;
        }
        int i19 = 1;
        if (i12 > 1) {
            challengeResultKt.getSDKReferenceNumber = 0;
            while (true) {
                int i21 = challengeResultKt.getSDKReferenceNumber;
                if (i21 >= i12) {
                    break;
                }
                char c18 = cArr[i21];
                challengeResultKt.getDeviceData = c18;
                char c19 = cArr[i21 + 1];
                challengeResultKt.getSDKAppID = c19;
                if (c18 == c19) {
                    cArr4[i21] = (char) (c18 - b8);
                    cArr4[i21 + 1] = (char) (c19 - b8);
                    i14 = i17;
                    c3 = c17;
                    i15 = i19;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = challengeResultKt;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = challengeResultKt;
                    objArr4[9] = challengeResultKt;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = challengeResultKt;
                    objArr4[c17] = challengeResultKt;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = challengeResultKt;
                    objArr4[c14] = challengeResultKt;
                    objArr4[c15] = Integer.valueOf(cCharValue);
                    objArr4[i19] = challengeResultKt;
                    objArr4[i17] = challengeResultKt;
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(835518319);
                    if (sDKTransactionID3 == null) {
                        c3 = c17;
                        int iMyPid = (Process.myPid() >> 22) + 1258;
                        c7 = '\n';
                        char cResolveSize = (char) (34414 - View.resolveSize(i17, i17));
                        int iIndexOf = 40 - TextUtils.indexOf("", c16);
                        byte b13 = (byte) i17;
                        i13 = i19;
                        String str$$c = $$c(b13, (byte) (b13 | 55), b13);
                        Class cls2 = Integer.TYPE;
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(iMyPid, cResolveSize, iIndexOf, -307955329, false, str$$c, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                    } else {
                        c3 = c17;
                        i13 = i19;
                        c7 = '\n';
                    }
                    int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                    int i22 = challengeResultKt.ChallengeResultCancelled;
                    if (iIntValue == i22) {
                        Object[] objArr5 = new Object[11];
                        objArr5[c7] = challengeResultKt;
                        objArr5[9] = Integer.valueOf(cCharValue);
                        objArr5[8] = challengeResultKt;
                        objArr5[7] = Integer.valueOf(cCharValue);
                        objArr5[c3] = Integer.valueOf(cCharValue);
                        objArr5[5] = challengeResultKt;
                        objArr5[4] = challengeResultKt;
                        objArr5[c14] = Integer.valueOf(cCharValue);
                        objArr5[c15] = Integer.valueOf(cCharValue);
                        objArr5[i13] = challengeResultKt;
                        objArr5[i17] = challengeResultKt;
                        Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(-758961112);
                        if (sDKTransactionID4 == null) {
                            int doubleTapTimeout = 2223 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            char offsetBefore = (char) (TextUtils.getOffsetBefore("", i17) + 53070);
                            int size = 21 - View.MeasureSpec.getSize(i17);
                            byte b14 = (byte) i17;
                            byte b15 = b14;
                            i14 = i17;
                            String str$$c2 = $$c(b14, b15, b15);
                            Class cls3 = Integer.TYPE;
                            sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(doubleTapTimeout, offsetBefore, size, 246098488, false, str$$c2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                        } else {
                            i14 = i17;
                        }
                        int iIntValue2 = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                        int i23 = (challengeResultKt.getSDKTransactionID * cCharValue) + challengeResultKt.ChallengeResultCancelled;
                        int i24 = challengeResultKt.getSDKReferenceNumber;
                        cArr4[i24] = cArr2[iIntValue2];
                        cArr4[i24 + 1] = cArr2[i23];
                        i15 = i13;
                    } else {
                        i14 = i17;
                        int i25 = challengeResultKt.AuthenticationRequestParameters;
                        int i26 = challengeResultKt.getSDKTransactionID;
                        int i27 = challengeResultKt.getMessageVersion;
                        if (i25 == i26) {
                            i15 = i13;
                            int iC = k.c(i27, cCharValue, i15, cCharValue);
                            challengeResultKt.getMessageVersion = iC;
                            int iC2 = k.c(i22, cCharValue, i15, cCharValue);
                            challengeResultKt.ChallengeResultCancelled = iC2;
                            int i28 = (i26 * cCharValue) + iC2;
                            int i29 = challengeResultKt.getSDKReferenceNumber;
                            cArr4[i29] = cArr2[(i25 * cCharValue) + iC];
                            cArr4[i29 + i15] = cArr2[i28];
                        } else {
                            i15 = i13;
                            int i31 = (i25 * cCharValue) + i22;
                            int i32 = challengeResultKt.getSDKReferenceNumber;
                            cArr4[i32] = cArr2[i31];
                            cArr4[i32 + i15] = cArr2[(i26 * cCharValue) + i27];
                        }
                    }
                }
                challengeResultKt.getSDKReferenceNumber += 2;
                c17 = c3;
                i19 = i15;
                i17 = i14;
                c16 = '0';
            }
        }
        int i33 = i17;
        $10 = ($11 + 31) % 128;
        for (int i34 = i33; i34 < i11; i34++) {
            cArr4[i34] = (char) (cArr4[i34] ^ 13722);
        }
        String str2 = new String(cArr4);
        $11 = ($10 + 77) % 128;
        objArr[i33] = str2;
    }

    private static boolean getDeviceData(Locale locale) {
        if (locale == null || locale.getLanguage() == null) {
            return false;
        }
        int i11 = getSDKTransactionID + 17;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            locale.getCountry();
            throw null;
        }
        if (locale.getCountry() == null) {
            return false;
        }
        int i12 = getSDKTransactionID + 93;
        getDeviceData = i12 % 128;
        if (i12 % 2 == 0) {
            return true;
        }
        throw null;
    }

    private static Locale getSDKAppID(String str) throws Throwable {
        if (str == null) {
            int i11 = getDeviceData + 9;
            getSDKTransactionID = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 76 / 0;
            }
            return null;
        }
        Object[] objArr = new Object[1];
        a("㗣", View.getDefaultSize(0, 0) + 1, (byte) ((KeyEvent.getMaxKeyCode() >> 16) + 30), objArr);
        String[] strArrSplit = str.split(((String) objArr[0]).intern());
        int length = strArrSplit.length;
        if (length == 1) {
            return new Locale(strArrSplit[0]);
        }
        if (length == 2) {
            return new Locale(strArrSplit[0], strArrSplit[1]);
        }
        if (length == 3) {
            return new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
        }
        getDeviceData = (getSDKTransactionID + 99) % 128;
        return null;
    }

    public static void getSDKTransactionID(String str) throws InvalidInputException {
        int i11 = getSDKTransactionID;
        getDeviceData = (i11 + 63) % 128;
        if (str != null) {
            if (!getDeviceData(getSDKAppID(str))) {
                throw atd.aa.getDeviceData.LOCALE.getSDKAppID();
            }
        } else {
            int i12 = i11 + 67;
            getDeviceData = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{4, -104, 34, -4};
        $$b = 41;
    }

    public static void getSDKTransactionID() {
        AuthenticationRequestParameters = new char[]{30873};
        getSDKReferenceNumber = (char) 19805;
    }
}
