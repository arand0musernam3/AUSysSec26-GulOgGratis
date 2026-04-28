package atd.ah;

import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.onCompletion;
import atd.e.ChallengeResult;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKTransactionID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int ChallengeResultCancelled;
    public static final getDeviceData getDeviceData;
    private static int getMessageVersion;
    private static char getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static long getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, int r7, int r8) {
        /*
            byte[] r0 = atd.ah.getSDKTransactionID.$$a
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r6 = r6 * 3
            int r6 = 4 - r6
            int r7 = 119 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r5 = r2
            goto L28
        L15:
            r3 = r7
            r7 = r6
            r6 = r3
            r3 = r2
        L19:
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r3 = r0[r7]
        L28:
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ah.getSDKTransactionID.$$c(short, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        getMessageVersion = 1;
        AuthenticationRequestParameters = 0;
        ChallengeResultCancelled = 1;
        AuthenticationRequestParameters();
        getDeviceData = new getSDKReferenceNumber();
        getMessageVersion = (getSDKEphemeralPublicKey + 59) % 128;
    }

    public static void AuthenticationRequestParameters() {
        getSDKReferenceNumber = 1905653906042338631L;
        getSDKTransactionID = -2038612665;
        getSDKAppID = (char) 15933;
    }

    private static void a(String str, String str2, String str3, int i11, char c3, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        char c7;
        int i13;
        long j9;
        int i14 = $10 + 31;
        $11 = i14 % 128;
        int i15 = 2;
        Object obj = null;
        if (i14 % 2 == 0) {
            throw null;
        }
        char[] charArray2 = str3 != null ? str3.toCharArray() : str3;
        char[] charArray3 = str2 != null ? str2.toCharArray() : str2;
        int i16 = 0;
        if (str != null) {
            int i17 = $11 + 57;
            $10 = i17 % 128;
            if (i17 % 2 != 0) {
                charArray = str.toCharArray();
                int i18 = 43 / 0;
            } else {
                charArray = str.toCharArray();
            }
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        onCompletion oncompletion = new onCompletion();
        int length = charArray3.length;
        char[] cArr2 = new char[length];
        int length2 = cArr.length;
        char[] cArr3 = new char[length2];
        System.arraycopy(charArray3, 0, cArr2, 0, length);
        System.arraycopy(cArr, 0, cArr3, 0, length2);
        cArr2[0] = (char) (cArr2[0] ^ c3);
        cArr3[2] = (char) (cArr3[2] + ((char) i11));
        int length3 = charArray2.length;
        char[] cArr4 = new char[length3];
        oncompletion.getDeviceData = 0;
        while (oncompletion.getDeviceData < length3) {
            $10 = ($11 + 117) % 128;
            try {
                Object[] objArr2 = {oncompletion};
                Object sDKTransactionID = ChallengeResult.getSDKTransactionID(874886523);
                if (sDKTransactionID == null) {
                    int deadChar = 2069 - KeyEvent.getDeadChar(i16, i16);
                    char mirror = (char) (AndroidCharacter.getMirror('0') + 44609);
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 32;
                    byte b8 = (byte) ($$a[1] + 1);
                    c7 = 1;
                    byte b11 = (byte) (b8 + 2);
                    i12 = i15;
                    sDKTransactionID = ChallengeResult.getDeviceData(deadChar, mirror, pressedStateDuration, -397560981, false, $$c(b8, b11, (byte) (b11 - 2)), new Class[]{Object.class});
                } else {
                    i12 = i15;
                    c7 = 1;
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {oncompletion};
                Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(1806403515);
                if (sDKTransactionID2 == null) {
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 3096;
                    char packedPositionType = (char) (ExpandableListView.getPackedPositionType(0L) + 14367);
                    int i19 = (CdmaCellLocation.convertQuartSecToDecDegrees(i16) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i16) == 0.0d ? 0 : -1)) + 18;
                    j9 = 0;
                    byte b12 = $$a[c7];
                    byte b13 = (byte) (b12 + 1);
                    byte b14 = (byte) (-b12);
                    i13 = i16;
                    sDKTransactionID2 = ChallengeResult.getDeviceData(packedPositionChild, packedPositionType, i19, -1211924053, false, $$c(b13, b14, (byte) (b14 - 1)), new Class[]{Object.class});
                } else {
                    i13 = i16;
                    j9 = 0;
                }
                int iIntValue2 = ((Integer) ((Method) sDKTransactionID2).invoke(obj, objArr3)).intValue();
                int i21 = cArr2[oncompletion.getDeviceData % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i12] = Integer.valueOf(cArr3[iIntValue]);
                objArr4[c7] = Integer.valueOf(i21);
                objArr4[i13] = oncompletion;
                Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(1695612280);
                Class cls = Integer.TYPE;
                if (sDKTransactionID3 == null) {
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', i13) + 1429;
                    char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                    int i22 = (ViewConfiguration.getZoomControlsTimeout() > j9 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j9 ? 0 : -1)) + 29;
                    byte b15 = (byte) ($$a[c7] + 1);
                    byte b16 = b15;
                    sDKTransactionID3 = ChallengeResult.getDeviceData(iLastIndexOf, touchSlop, i22, -1183253656, false, $$c(b15, b16, b16), new Class[]{Object.class, cls, cls});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                int i23 = cArr2[iIntValue2] * 32718;
                int i24 = i12;
                Object[] objArr5 = new Object[i24];
                objArr5[c7] = Integer.valueOf(cArr3[iIntValue]);
                objArr5[0] = Integer.valueOf(i23);
                Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(814479823);
                if (sDKTransactionID4 == null) {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 2774;
                    char scrollBarFadeDuration = (char) (13060 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    int i25 = 26 - (SystemClock.uptimeMillis() > j9 ? 1 : (SystemClock.uptimeMillis() == j9 ? 0 : -1));
                    byte b17 = $$a[c7];
                    byte b18 = (byte) (b17 + 1);
                    sDKTransactionID4 = ChallengeResult.getDeviceData(iMakeMeasureSpec, scrollBarFadeDuration, i25, -320602145, false, $$c(b18, (byte) (b18 | 51), (byte) (b17 + 1)), new Class[]{cls, cls});
                }
                cArr3[iIntValue2] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                cArr2[iIntValue2] = oncompletion.AuthenticationRequestParameters;
                int i26 = oncompletion.getDeviceData;
                cArr4[i26] = (char) (((((long) (r1 ^ charArray2[i26])) ^ (getSDKReferenceNumber ^ 1905653906042338631L)) ^ ((long) ((int) (((long) getSDKTransactionID) ^ 1905653906042338631L)))) ^ ((long) ((char) (((long) getSDKAppID) ^ 1905653906042338631L))));
                oncompletion.getDeviceData = i26 + 1;
                i15 = i24;
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
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r7 = new java.lang.Object[1];
        a("\u0000\u0000\u0000\u0000", "Ⅎ㤥꒕骙", "韡썯뺫喚餶鱘ℭ裼忎갺㳟⊹\ueb00奸䥟버霥ꃛꉕ﹋㉧ᩖ흅쎋頚鞕펴淾꒩甐횒慎換ࡇ充䊅켖癓", android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), r7);
        i4.a.f(((java.lang.String) r7[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (atd.ah.getSDKTransactionID.getDeviceData.AuthenticationRequestParameters().equals(r8) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (atd.ah.getSDKTransactionID.getDeviceData.AuthenticationRequestParameters().equals(r8) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r8 = atd.ah.getSDKTransactionID.getDeviceData;
        atd.ah.getSDKTransactionID.AuthenticationRequestParameters = (atd.ah.getSDKTransactionID.ChallengeResultCancelled + com.app.tgtg.model.local.AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static atd.ah.getDeviceData getDeviceData(java.lang.String r8) throws java.lang.Throwable {
        /*
            int r0 = atd.ah.getSDKTransactionID.ChallengeResultCancelled
            int r0 = r0 + 123
            int r1 = r0 % 128
            atd.ah.getSDKTransactionID.AuthenticationRequestParameters = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L1d
            atd.ah.getDeviceData r0 = atd.ah.getSDKTransactionID.getDeviceData
            java.lang.String r0 = r0.AuthenticationRequestParameters()
            boolean r8 = r0.equals(r8)
            r0 = 19
            int r0 = r0 / r1
            if (r8 == 0) goto L34
            goto L29
        L1d:
            atd.ah.getDeviceData r0 = atd.ah.getSDKTransactionID.getDeviceData
            java.lang.String r0 = r0.AuthenticationRequestParameters()
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L34
        L29:
            atd.ah.getDeviceData r8 = atd.ah.getSDKTransactionID.getDeviceData
            int r0 = atd.ah.getSDKTransactionID.ChallengeResultCancelled
            int r0 = r0 + 123
            int r0 = r0 % 128
            atd.ah.getSDKTransactionID.AuthenticationRequestParameters = r0
            return r8
        L34:
            int r8 = android.view.ViewConfiguration.getMaximumFlingVelocity()
            int r5 = r8 >> 16
            double r2 = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(r1)
            r6 = 0
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            char r6 = (char) r8
            r8 = 1
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.String r2 = "\u0000\u0000\u0000\u0000"
            java.lang.String r3 = "Ⅎ㤥꒕骙"
            java.lang.String r4 = "韡썯뺫喚餶鱘ℭ裼忎갺㳟⊹\ueb00奸䥟버霥ꃛꉕ﹋㉧ᩖ흅쎋頚鞕펴淾꒩甐횒慎換ࡇ充䊅켖癓"
            a(r2, r3, r4, r5, r6, r7)
            r8 = r7[r1]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = r8.intern()
            i4.a.f(r8)
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ah.getSDKTransactionID.getDeviceData(java.lang.String):atd.ah.getDeviceData");
    }

    public static void init$0() {
        $$a = new byte[]{38, -1, 125, -96};
        $$b = 69;
    }
}
