package atd.bc;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.getTransactionStatus;
import atd.n.getSDKAppID;
import b3.i;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ChallengeResultCancelled {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static byte[] AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResultCancelled;
    private static short[] getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, byte r8, int r9) {
        /*
            int r9 = r9 * 4
            int r9 = 105 - r9
            int r8 = r8 * 4
            int r8 = 3 - r8
            byte[] r0 = atd.bc.ChallengeResultCancelled.$$a
            int r7 = r7 * 3
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2c
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L27:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L2c:
            int r8 = r8 + r3
            r3 = r9
            r9 = r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.bc.ChallengeResultCancelled.$$c(int, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        BuildConfig = 1;
        ChallengeResultCancelled = 0;
        getMessageVersion = 1;
        getSDKReferenceNumber();
        ViewConfiguration.getMinimumFlingVelocity();
        Color.red(0);
        Process.getThreadPriority(0);
        Process.myPid();
        ViewConfiguration.getDoubleTapTimeout();
        BuildConfig = (getSDKEphemeralPublicKey + 79) % 128;
    }

    public static String AuthenticationRequestParameters(String str) throws Throwable {
        getSDKReferenceNumber sDKTransactionID = getSDKReferenceNumber.getSDKTransactionID();
        byte[] bytes = str.getBytes(sDKTransactionID.getSDKAppID());
        byte[] bArrAuthenticationRequestParameters = AuthenticationRequestParameters(bytes.length);
        byte[] deviceData = getDeviceData(bytes, bArrAuthenticationRequestParameters);
        String sDKAppID = sDKTransactionID.getSDKAppID(bArrAuthenticationRequestParameters);
        String sDKAppID2 = sDKTransactionID.getSDKAppID(deviceData);
        StringBuilder sbO = i.o(sDKAppID);
        Object[] objArr = new Object[1];
        a(TextUtils.lastIndexOf("", '0') + 1017447677, (-99) - (ViewConfiguration.getPressedStateDuration() >> 16), (-691179603) - TextUtils.getTrimmedLength(""), (byte) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (short) (127 - View.combineMeasuredStates(0, 0)), objArr);
        sbO.append(((String) objArr[0]).intern());
        sbO.append(sDKAppID2);
        String sDKTransactionID2 = sDKTransactionID.getSDKTransactionID(sbO.toString());
        ChallengeResultCancelled = (getMessageVersion + 87) % 128;
        return sDKTransactionID2;
    }

    private static void a(int i11, int i12, int i13, byte b8, short s7, Object[] objArr) throws Throwable {
        int i14;
        long j9;
        int i15;
        int i16;
        int i17;
        int i18;
        getTransactionStatus gettransactionstatus = new getTransactionStatus();
        StringBuilder sb2 = new StringBuilder();
        try {
            int i19 = 1;
            Object[] objArr2 = {Integer.valueOf(i12), Integer.valueOf(getSDKReferenceNumber)};
            Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(-217286249);
            Class cls = Integer.TYPE;
            if (sDKTransactionID == null) {
                byte b11 = (byte) 0;
                byte b12 = b11;
                sDKTransactionID = atd.e.ChallengeResult.getDeviceData(1225 - (Process.myPid() >> 22), (char) Color.red(0), 33 - TextUtils.indexOf("", ""), 795115399, false, $$c(b11, b12, (byte) (b12 + 1)), new Class[]{cls, cls});
            }
            int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
            int i21 = iIntValue == -1 ? 1 : 0;
            if (i21 != 0) {
                byte[] bArr = AuthenticationRequestParameters;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    i17 = -217286249;
                    int i22 = 0;
                    while (i22 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i22])};
                        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(1659653064);
                        if (sDKTransactionID2 == null) {
                            i18 = i19;
                            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(3317 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 33 - Color.alpha(0), -1098625576, false, "f", new Class[]{cls});
                        } else {
                            i18 = i19;
                        }
                        bArr2[i22] = ((Byte) ((Method) sDKTransactionID2).invoke(null, objArr3)).byteValue();
                        i22++;
                        i19 = i18;
                    }
                    bArr = bArr2;
                } else {
                    i17 = -217286249;
                }
                i14 = i19;
                j9 = 20070962823959587L;
                if (bArr != null) {
                    byte[] bArr3 = AuthenticationRequestParameters;
                    Object[] objArr4 = new Object[2];
                    objArr4[i14] = Integer.valueOf(getSDKAppID);
                    objArr4[0] = Integer.valueOf(i13);
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(i17);
                    if (sDKTransactionID3 == null) {
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(1225 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) Color.argb(0, 0, 0, 0), Gravity.getAbsoluteGravity(0, 0) + 33, 795115399, false, $$c(b13, b14, (byte) (b14 + 1)), new Class[]{cls, cls});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue()]) ^ 20070962823959587L)) + ((int) (((long) getSDKReferenceNumber) ^ 20070962823959587L)));
                } else {
                    iIntValue = (short) (((short) (((long) getDeviceData[i13 + ((int) (((long) getSDKAppID) ^ 20070962823959587L))]) ^ 20070962823959587L)) + ((int) (((long) getSDKReferenceNumber) ^ 20070962823959587L)));
                }
            } else {
                i14 = 1;
                j9 = 20070962823959587L;
            }
            if (iIntValue > 0) {
                gettransactionstatus.getDeviceData = ((i13 + iIntValue) - 2) + ((int) (((long) getSDKAppID) ^ j9)) + i21;
                int i23 = getSDKTransactionID;
                Object[] objArr5 = new Object[4];
                objArr5[3] = sb2;
                objArr5[2] = Integer.valueOf(i23);
                objArr5[i14] = Integer.valueOf(i11);
                objArr5[0] = gettransactionstatus;
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(-488867474);
                if (sDKTransactionID4 == null) {
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(TextUtils.indexOf("", "") + 2158, (char) TextUtils.indexOf("", "", 0), 36 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1052016510, false, $$c(b15, b16, b16), new Class[]{Object.class, cls, cls, Object.class});
                }
                ((StringBuilder) ((Method) sDKTransactionID4).invoke(null, objArr5)).append(gettransactionstatus.getSDKAppID);
                gettransactionstatus.getSDKReferenceNumber = gettransactionstatus.getSDKAppID;
                byte[] bArr4 = AuthenticationRequestParameters;
                if (bArr4 != null) {
                    $10 = ($11 + 41) % 128;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i24 = 0; i24 < length2; i24++) {
                        $11 = ($10 + 107) % 128;
                        bArr5[i24] = (byte) (((long) bArr4[i24]) ^ j9);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    $11 = ($10 + 125) % 128;
                    i15 = i14;
                    i16 = i15;
                } else {
                    i15 = 0;
                    i16 = i14;
                }
                while (true) {
                    gettransactionstatus.AuthenticationRequestParameters = i16;
                    if (gettransactionstatus.AuthenticationRequestParameters >= iIntValue) {
                        break;
                    }
                    int i25 = $10 + 35;
                    $11 = i25 % 128;
                    if (i25 % 2 == 0) {
                        throw null;
                    }
                    int i26 = gettransactionstatus.getDeviceData;
                    if (i15 != 0) {
                        byte[] bArr6 = AuthenticationRequestParameters;
                        gettransactionstatus.getDeviceData = i26 - 1;
                        gettransactionstatus.getSDKAppID = (char) (gettransactionstatus.getSDKReferenceNumber + (((byte) (((byte) (((long) bArr6[i26]) ^ j9)) + s7)) ^ b8));
                    } else {
                        short[] sArr = getDeviceData;
                        gettransactionstatus.getDeviceData = i26 - 1;
                        gettransactionstatus.getSDKAppID = (char) (gettransactionstatus.getSDKReferenceNumber + (((short) (((short) (((long) sArr[i26]) ^ j9)) + s7)) ^ b8));
                    }
                    sb2.append(gettransactionstatus.getSDKAppID);
                    gettransactionstatus.getSDKReferenceNumber = gettransactionstatus.getSDKAppID;
                    i16 = gettransactionstatus.AuthenticationRequestParameters + 1;
                }
            }
            objArr[0] = sb2.toString();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    private static byte[] getDeviceData(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            ChallengeResultCancelled = (getMessageVersion + 109) % 128;
            bArr3[i11] = (byte) (bArr[i11] ^ bArr2[i11 % bArr2.length]);
        }
        ChallengeResultCancelled = (getMessageVersion + 15) % 128;
        return bArr3;
    }

    public static String getSDKAppID(String str) throws Throwable {
        getSDKReferenceNumber sDKTransactionID = getSDKReferenceNumber.getSDKTransactionID();
        Charset sDKAppID = sDKTransactionID.getSDKAppID();
        String str2 = (String) getSDKReferenceNumber.getSDKReferenceNumber(106455532, new Object[]{sDKTransactionID, str}, getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData(), -106455530);
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1017447676, (ViewConfiguration.getWindowTouchSlop() >> 8) - 99, ImageFormat.getBitsPerPixel(0) - 691179602, (byte) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (short) (Drawable.resolveOpacity(0, 0) + 127), objArr);
        String[] strArrSplit = str2.split(((String) objArr[0]).intern());
        String str3 = new String(getDeviceData(((String) getSDKReferenceNumber.getSDKReferenceNumber(106455532, new Object[]{sDKTransactionID, strArrSplit[0]}, getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData(), -106455530)).getBytes(sDKAppID), ((String) getSDKReferenceNumber.getSDKReferenceNumber(106455532, new Object[]{sDKTransactionID, strArrSplit[1]}, getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData(), -106455530)).getBytes(sDKAppID)), sDKAppID);
        ChallengeResultCancelled = (getMessageVersion + 117) % 128;
        return str3;
    }

    public static void getSDKReferenceNumber() {
        getSDKAppID = 408847472;
        getSDKReferenceNumber = 829166663;
        getSDKTransactionID = -231280793;
        AuthenticationRequestParameters = new byte[]{35};
    }

    public static void init$0() {
        $$a = new byte[]{66, -81, 60, 85};
        $$b = 9;
    }

    private static byte[] AuthenticationRequestParameters(int i11) {
        byte[] bArr = new byte[i11];
        new Random(System.currentTimeMillis()).nextBytes(bArr);
        ChallengeResultCancelled = (getMessageVersion + 65) % 128;
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = (byte) (Math.abs((int) bArr[i12]) % 127);
        }
        ChallengeResultCancelled = (getMessageVersion + 23) % 128;
        return bArr;
    }
}
