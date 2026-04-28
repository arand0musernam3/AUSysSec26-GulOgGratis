package atd.d;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.braze.Constants;
import java.lang.reflect.Method;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getMessageVersion {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ getMessageVersion[] $VALUES;
    private static int AuthenticationRequestParameters;
    private static int ChallengeResult;
    public static final getMessageVersion GET;
    public static final getMessageVersion POST;
    private static boolean getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static boolean getSDKReferenceNumber;
    private static char[] getSDKTransactionID;
    private boolean mDoOutput;
    private String mValue;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, byte r7, int r8) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 111
            int r7 = r7 * 4
            int r0 = r7 + 1
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r1 = atd.d.getMessageVersion.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r3 = -r3
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r8
            r8 = r6
            r6 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.d.getMessageVersion.$$c(byte, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        ChallengeResult = 1;
        getSDKAppID = 0;
        getMessageVersion = 1;
        getSDKTransactionID();
        Object[] objArr = new Object[1];
        a(TextUtils.getOffsetAfter("", 0) + 127, null, null, "\u0083\u0082\u0081", objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(View.resolveSizeAndState(0, 0, 0) + 127, null, null, "\u0083\u0082\u0081", objArr2);
        GET = new getMessageVersion(strIntern, 0, ((String) objArr2[0]).intern(), false);
        Object[] objArr3 = new Object[1];
        a(126 - ExpandableListView.getPackedPositionChild(0L), null, null, "\u0083\u0086\u0085\u0084", objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(127 - View.MeasureSpec.makeMeasureSpec(0, 0), null, null, "\u0083\u0086\u0085\u0084", objArr4);
        POST = new getMessageVersion(strIntern2, 1, ((String) objArr4[0]).intern(), true);
        $VALUES = AuthenticationRequestParameters();
        int i11 = ChallengeResult + 115;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private getMessageVersion(String str, int i11, String str2, boolean z11) {
        this.mValue = str2;
        this.mDoOutput = z11;
    }

    private static /* synthetic */ getMessageVersion[] AuthenticationRequestParameters() {
        int i11 = getSDKAppID;
        getMessageVersion[] getmessageversionArr = {GET, POST};
        getMessageVersion = (i11 + 55) % 128;
        return getmessageversionArr;
    }

    private static void a(int i11, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        String str3 = str2;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
        }
        byte[] bArr = (byte[]) bytes;
        if (str != null) {
            int i13 = $11 + 95;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        atd.bb.ChallengeResultTimeout challengeResultTimeout = new atd.bb.ChallengeResultTimeout();
        char[] cArr2 = getSDKTransactionID;
        Class cls = Integer.TYPE;
        char c3 = '0';
        int i14 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            $10 = ($11 + 121) % 128;
            int i15 = 0;
            while (i15 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i15])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(887083134);
                    if (sDKTransactionID == null) {
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 2556;
                        char cNormalizeMetaState = (char) (48598 - KeyEvent.normalizeMetaState(i14));
                        int iLastIndexOf = TextUtils.lastIndexOf("", c3, i14) + 32;
                        byte b8 = (byte) i14;
                        i12 = i14;
                        byte b11 = b8;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(packedPositionChild, cNormalizeMetaState, iLastIndexOf, -390605202, false, $$c(b8, b11, b11), new Class[]{cls});
                    } else {
                        i12 = i14;
                    }
                    cArr3[i15] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i15++;
                    i14 = i12;
                    c3 = '0';
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
        int i16 = i14;
        Object[] objArr3 = {Integer.valueOf(AuthenticationRequestParameters)};
        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-1144184369);
        if (sDKTransactionID2 == null) {
            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(148 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(i16) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i16) == 0.0d ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', i16) + 33, 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
        }
        int iIntValue = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
        if (getDeviceData) {
            $11 = ($10 + 49) % 128;
            int length2 = bArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length2;
            char[] cArr4 = new char[length2];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i17 = challengeResultTimeout.getSDKAppID;
                int i18 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i17 >= i18) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                cArr4[i17] = (char) (cArr2[bArr[(i18 - 1) - i17] + i11] - iIntValue);
                Object[] objArr4 = {challengeResultTimeout, challengeResultTimeout};
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                if (sDKTransactionID3 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(Process.getGidForName("") + 1698, (char) Color.alpha(0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29, -1620360563, false, $$c(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
            }
        } else {
            if (!getSDKReferenceNumber) {
                int length3 = iArr.length;
                challengeResultTimeout.AuthenticationRequestParameters = length3;
                char[] cArr5 = new char[length3];
                challengeResultTimeout.getSDKAppID = 0;
                while (true) {
                    int i19 = challengeResultTimeout.getSDKAppID;
                    int i21 = challengeResultTimeout.AuthenticationRequestParameters;
                    if (i19 >= i21) {
                        break;
                    }
                    cArr5[i19] = (char) (cArr2[iArr[(i21 - 1) - i19] - i11] - iIntValue);
                    challengeResultTimeout.getSDKAppID = i19 + 1;
                }
                String str4 = new String(cArr5);
                int i22 = $11 + 67;
                $10 = i22 % 128;
                if (i22 % 2 != 0) {
                    throw null;
                }
                objArr[0] = str4;
                return;
            }
            int length4 = cArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length4;
            char[] cArr6 = new char[length4];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i23 = challengeResultTimeout.getSDKAppID;
                int i24 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i23 >= i24) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                cArr6[i23] = (char) (cArr2[cArr[(i24 - 1) - i23] - i11] - iIntValue);
                Object[] objArr5 = {challengeResultTimeout, challengeResultTimeout};
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                if (sDKTransactionID4 == null) {
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(1697 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.indexOf("", "") + 29, -1620360563, false, $$c(b14, b15, (byte) (b15 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID4).invoke(null, objArr5);
            }
        }
    }

    public static boolean getDeviceData(getMessageVersion getmessageversion) {
        if (getmessageversion.equals(GET)) {
            getSDKAppID = (getMessageVersion + 81) % 128;
            return false;
        }
        getSDKAppID = (getMessageVersion + 99) % 128;
        return true;
    }

    public static boolean getSDKAppID(getMessageVersion getmessageversion) {
        boolean zEquals;
        int i11 = getSDKAppID + 15;
        getMessageVersion = i11 % 128;
        if (i11 % 2 == 0) {
            zEquals = getmessageversion.equals(POST);
            int i12 = 18 / 0;
        } else {
            zEquals = getmessageversion.equals(POST);
        }
        getMessageVersion = (getSDKAppID + 11) % 128;
        return zEquals;
    }

    public static void getSDKTransactionID() {
        getSDKTransactionID = new char[]{21880, 21882, 21861, 21857, 21856, 21860};
        AuthenticationRequestParameters = 1286296881;
        getSDKReferenceNumber = true;
        getDeviceData = true;
    }

    public static void init$0() {
        $$a = new byte[]{4, -104, 18, -33};
        $$b = 193;
    }

    public static getMessageVersion valueOf(String str) {
        int i11 = getSDKAppID + 87;
        getMessageVersion = i11 % 128;
        if (i11 % 2 == 0) {
            Enum.valueOf(getMessageVersion.class, str);
            throw null;
        }
        getMessageVersion getmessageversion = (getMessageVersion) Enum.valueOf(getMessageVersion.class, str);
        getMessageVersion = (getSDKAppID + 5) % 128;
        return getmessageversion;
    }

    public static getMessageVersion[] values() {
        getSDKAppID = (getMessageVersion + 87) % 128;
        getMessageVersion[] getmessageversionArr = (getMessageVersion[]) $VALUES.clone();
        int i11 = getSDKAppID + 97;
        getMessageVersion = i11 % 128;
        if (i11 % 2 != 0) {
            return getmessageversionArr;
        }
        throw null;
    }

    public final String getDeviceData() {
        int i11 = getSDKAppID;
        int i12 = i11 + 47;
        getMessageVersion = i12 % 128;
        int i13 = i12 % 2;
        String str = this.mValue;
        if (i13 == 0) {
            int i14 = 58 / 0;
        }
        getMessageVersion = (i11 + 39) % 128;
        return str;
    }

    public final boolean getSDKAppID() {
        int i11 = getSDKAppID + 33;
        int i12 = i11 % 128;
        getMessageVersion = i12;
        int i13 = i11 % 2;
        boolean z11 = this.mDoOutput;
        if (i13 == 0) {
            throw null;
        }
        int i14 = i12 + 37;
        getSDKAppID = i14 % 128;
        if (i14 % 2 == 0) {
            return z11;
        }
        throw null;
    }
}
