package atd.ag;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.ae.ChallengeResultCancelled;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
final class getSDKReferenceNumber extends getSDKAppID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int[] getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r5, short r6, byte r7) {
        /*
            int r7 = r7 * 2
            int r0 = r7 + 1
            byte[] r1 = atd.ag.getSDKReferenceNumber.$$a
            int r6 = 114 - r6
            int r5 = r5 * 2
            int r5 = r5 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L20:
            int r3 = r3 + 1
            r4 = r1[r5]
        L24:
            int r4 = -r4
            int r5 = r5 + 1
            int r6 = r6 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ag.getSDKReferenceNumber.$$c(short, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AuthenticationRequestParameters = 0;
        getDeviceData = 1;
        getSDKReferenceNumber = 0;
        getSDKAppID = 1;
        getSDKAppID();
        ViewConfiguration.getTouchSlop();
        getDeviceData = (AuthenticationRequestParameters + 101) % 128;
    }

    private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
        char c3;
        int i12;
        int length;
        int[] iArr2;
        int i13;
        char[] cArr;
        int[] iArr3;
        int i14;
        int i15;
        int i16;
        atd.bb.getMessageVersion getmessageversion = new atd.bb.getMessageVersion();
        char[] cArr2 = new char[4];
        int i17 = 2;
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr4 = getSDKTransactionID;
        int i18 = -1667528016;
        Class cls = Integer.TYPE;
        int i19 = 0;
        if (iArr4 != null) {
            $11 = ($10 + 79) % 128;
            int length2 = iArr4.length;
            int[] iArr5 = new int[length2];
            int i21 = 0;
            while (i21 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr4[i21])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(i18);
                    if (sDKTransactionID == null) {
                        i15 = i18;
                        int offsetAfter = 2223 - TextUtils.getOffsetAfter("", i19);
                        i14 = i17;
                        char cResolveSizeAndState = (char) (53070 - View.resolveSizeAndState(i19, i19, i19));
                        int iResolveOpacity = Drawable.resolveOpacity(i19, i19) + 21;
                        byte b8 = (byte) i19;
                        i16 = i19;
                        byte b11 = b8;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(offsetAfter, cResolveSizeAndState, iResolveOpacity, 1089703072, false, $$c(b8, b11, b11), new Class[]{cls});
                    } else {
                        i14 = i17;
                        i15 = i18;
                        i16 = i19;
                    }
                    iArr5[i21] = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                    i21++;
                    i18 = i15;
                    i17 = i14;
                    i19 = i16;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            iArr4 = iArr5;
        }
        int i22 = i17;
        int i23 = i18;
        int i24 = i19;
        int length3 = iArr4.length;
        int[] iArr6 = new int[length3];
        int[] iArr7 = getSDKTransactionID;
        char c7 = '0';
        if (iArr7 != null) {
            int i25 = $10 + 3;
            $11 = i25 % 128;
            if (i25 % 2 == 0) {
                length = iArr7.length;
                iArr2 = new int[length];
                c3 = 3;
                i13 = 1;
            } else {
                length = iArr7.length;
                iArr2 = new int[length];
                c3 = 3;
                i13 = i24;
            }
            while (i13 < length) {
                Object[] objArr3 = {Integer.valueOf(iArr7[i13])};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i23);
                if (sDKTransactionID2 == null) {
                    cArr = cArr2;
                    byte b12 = (byte) i24;
                    byte b13 = b12;
                    iArr3 = iArr7;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(2222 - TextUtils.indexOf("", c7), (char) (53071 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), Color.blue(i24) + 21, 1089703072, false, $$c(b12, b13, b13), new Class[]{cls});
                } else {
                    cArr = cArr2;
                    iArr3 = iArr7;
                }
                iArr2[i13] = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                i13++;
                cArr2 = cArr;
                iArr7 = iArr3;
                c7 = '0';
                i24 = 0;
            }
            iArr7 = iArr2;
        } else {
            c3 = 3;
        }
        char[] cArr4 = cArr2;
        System.arraycopy(iArr7, 0, iArr6, 0, length3);
        getmessageversion.getSDKAppID = 0;
        while (true) {
            int i26 = getmessageversion.getSDKAppID;
            if (i26 >= iArr.length) {
                objArr[0] = new String(cArr3, 0, i11);
                return;
            }
            $10 = ($11 + 113) % 128;
            int i27 = iArr[i26];
            char c8 = (char) (i27 >> 16);
            cArr4[0] = c8;
            char c11 = (char) i27;
            cArr4[1] = c11;
            char c12 = (char) (iArr[i26 + 1] >> 16);
            cArr4[i22] = c12;
            char c13 = (char) iArr[i26 + 1];
            cArr4[c3] = c13;
            getmessageversion.getDeviceData = (c8 << 16) + c11;
            getmessageversion.AuthenticationRequestParameters = (c12 << 16) + c13;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr6);
            int i28 = 0;
            while (true) {
                i12 = getmessageversion.getDeviceData;
                if (i28 >= 16) {
                    break;
                }
                int i29 = i12 ^ iArr6[i28];
                getmessageversion.getDeviceData = i29;
                int sDKReferenceNumber = atd.bb.getMessageVersion.getSDKReferenceNumber(i29);
                Object[] objArr4 = new Object[4];
                objArr4[c3] = getmessageversion;
                objArr4[i22] = getmessageversion;
                objArr4[1] = Integer.valueOf(sDKReferenceNumber);
                objArr4[0] = getmessageversion;
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1513246698);
                if (sDKTransactionID3 == null) {
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 + 2);
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(2386 - TextUtils.getTrimmedLength(""), (char) Color.green(0), 18 - Process.getGidForName(""), -2040903174, false, $$c(b14, b15, (byte) (b15 - 2)), new Class[]{Object.class, cls, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                getmessageversion.AuthenticationRequestParameters = iIntValue;
                i28++;
            }
            int i31 = getmessageversion.AuthenticationRequestParameters;
            getmessageversion.getDeviceData = i31;
            getmessageversion.AuthenticationRequestParameters = i12;
            int i32 = i12 ^ iArr6[16];
            getmessageversion.AuthenticationRequestParameters = i32;
            int i33 = i31 ^ iArr6[17];
            getmessageversion.getDeviceData = i33;
            cArr4[0] = (char) (i33 >>> 16);
            cArr4[1] = (char) i33;
            cArr4[i22] = (char) (i32 >>> 16);
            cArr4[c3] = (char) i32;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr6);
            int i34 = getmessageversion.getSDKAppID;
            cArr3[i34 * 2] = cArr4[0];
            cArr3[(i34 * 2) + 1] = cArr4[1];
            cArr3[(i34 * 2) + 2] = cArr4[i22];
            cArr3[(i34 * 2) + 3] = cArr4[c3];
            int i35 = i22;
            Object[] objArr5 = new Object[i35];
            objArr5[1] = getmessageversion;
            objArr5[0] = getmessageversion;
            Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(35442447);
            if (sDKTransactionID4 == null) {
                byte b16 = (byte) 0;
                byte b17 = (byte) (b16 + 1);
                sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(KeyEvent.keyCodeFromString("") + 1861, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 39 - TextUtils.indexOf((CharSequence) "", '0', 0), -562771681, false, $$c(b16, b17, (byte) (b17 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID4).invoke(null, objArr5);
            i22 = i35;
        }
    }

    public static void getSDKAppID() {
        getSDKTransactionID = new int[]{2111266859, 1001742084, 1343713763, -601267554, -1301099585, -1991877018, -1442728886, 1032767518, -986707395, -1743319793, 1935152977, -1951492228, 439491538, -378255071, 1287979988, -1421780088, -1392007051, -1231571735};
    }

    public static void init$0() {
        $$a = new byte[]{35, 23, 10, 49};
        $$b = 74;
    }

    @Override // atd.ad.AuthenticationRequestParameters
    public final String AuthenticationRequestParameters() throws Throwable {
        Object obj;
        int i11 = getSDKReferenceNumber + 113;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(new int[]{-434982538, -718501165}, 4 << ImageFormat.getBitsPerPixel(1), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(new int[]{-434982538, -718501165}, ImageFormat.getBitsPerPixel(0) + 4, objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        int i12 = getSDKAppID + 115;
        getSDKReferenceNumber = i12 % 128;
        if (i12 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // atd.ag.getSDKAppID
    public final atd.ah.AuthenticationRequestParameters getSDKTransactionID(atd.ah.getDeviceData getdevicedata, byte[] bArr) {
        getdevicedata.getSDKReferenceNumber();
        atd.ah.AuthenticationRequestParameters authenticationRequestParameters = new atd.ah.AuthenticationRequestParameters(Arrays.copyOfRange(bArr, 0, 32), getdevicedata);
        int i11 = getSDKReferenceNumber + 19;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            return authenticationRequestParameters;
        }
        throw null;
    }

    @Override // atd.ag.BuildConfig
    public final atd.ah.AuthenticationRequestParameters AuthenticationRequestParameters(ChallengeResultCancelled challengeResultCancelled, atd.af.getSDKReferenceNumber getsdkreferencenumber) {
        getSDKReferenceNumber = (getSDKAppID + 17) % 128;
        atd.af.getSDKReferenceNumber.getSDKReferenceNumber(getsdkreferencenumber, atd.af.getSDKAppID.class);
        atd.ah.AuthenticationRequestParameters sDKTransactionID = getSDKTransactionID(challengeResultCancelled.getDeviceData(), ((atd.af.getSDKAppID) getsdkreferencenumber).getSDKReferenceNumber());
        int i11 = getSDKReferenceNumber + 19;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            return sDKTransactionID;
        }
        throw null;
    }
}
