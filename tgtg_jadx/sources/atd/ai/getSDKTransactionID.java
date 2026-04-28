package atd.ai;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.getMessageVersion;
import atd.e.ChallengeResult;
import java.lang.reflect.Method;
import java.security.PublicKey;
import java.security.Signature;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
final class getSDKTransactionID extends getSDKAppID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int[] getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, byte r8) {
        /*
            int r7 = 114 - r7
            int r8 = r8 * 3
            int r0 = r8 + 1
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r1 = atd.ai.getSDKTransactionID.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r1
            r4 = r2
            r1 = r7
            r7 = r6
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
            int r6 = -r6
            int r6 = r6 + r1
            int r7 = r7 + 1
            r1 = r7
            r7 = r6
            r6 = r1
            r1 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ai.getSDKTransactionID.$$c(short, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        AuthenticationRequestParameters = 1;
        getSDKReferenceNumber = 0;
        getDeviceData = 1;
        getSDKTransactionID();
        PointF.length(0.0f, 0.0f);
        AuthenticationRequestParameters = (getSDKAppID + 121) % 128;
    }

    private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
        int i12;
        int i13;
        char c3;
        char[] cArr;
        int[] iArr2;
        long j9;
        getMessageVersion getmessageversion = new getMessageVersion();
        char[] cArr2 = new char[4];
        int i14 = 2;
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr3 = getSDKTransactionID;
        Class cls = Integer.TYPE;
        int i15 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            i12 = 53070;
            int[] iArr4 = new int[length];
            int i16 = 0;
            i13 = -1667528016;
            while (i16 < length) {
                int i17 = i14;
                int i18 = $10 + 41;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i16])};
                        Object sDKTransactionID = ChallengeResult.getSDKTransactionID(-1667528016);
                        if (sDKTransactionID == null) {
                            int iAlpha = Color.alpha(i15) + 2223;
                            char cResolveOpacity = (char) (53070 - Drawable.resolveOpacity(i15, i15));
                            int mode = 21 - View.MeasureSpec.getMode(i15);
                            byte b8 = $$a[i17];
                            byte b11 = b8;
                            sDKTransactionID = ChallengeResult.getDeviceData(iAlpha, cResolveOpacity, mode, 1089703072, false, $$c(b8, b11, b11), new Class[]{cls});
                        }
                        iArr4[i16] = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                        i16 %= 1;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr3[i16])};
                    Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(-1667528016);
                    if (sDKTransactionID2 == null) {
                        int offsetBefore = 2223 - TextUtils.getOffsetBefore("", 0);
                        char cIndexOf = (char) (53069 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                        int jumpTapTimeout = 21 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        byte b12 = $$a[i17];
                        byte b13 = b12;
                        sDKTransactionID2 = ChallengeResult.getDeviceData(offsetBefore, cIndexOf, jumpTapTimeout, 1089703072, false, $$c(b12, b13, b13), new Class[]{cls});
                    }
                    iArr4[i16] = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                    i16++;
                }
                i14 = i17;
                i15 = 0;
            }
            iArr3 = iArr4;
        } else {
            i12 = 53070;
            i13 = -1667528016;
        }
        int i19 = i14;
        int i21 = 16;
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = getSDKTransactionID;
        long j11 = 0;
        if (iArr6 != null) {
            $11 = ($10 + 5) % 128;
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i22 = 0;
            while (i22 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr6[i22])};
                Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(i13);
                if (sDKTransactionID3 == null) {
                    int minimumFlingVelocity = 2223 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    j9 = j11;
                    char packedPositionType = (char) (ExpandableListView.getPackedPositionType(j11) + i12);
                    int mirror = AndroidCharacter.getMirror('0') - 27;
                    byte b14 = $$a[i19];
                    cArr = cArr2;
                    byte b15 = b14;
                    iArr2 = iArr6;
                    sDKTransactionID3 = ChallengeResult.getDeviceData(minimumFlingVelocity, packedPositionType, mirror, 1089703072, false, $$c(b14, b15, b15), new Class[]{cls});
                } else {
                    cArr = cArr2;
                    iArr2 = iArr6;
                    j9 = j11;
                }
                iArr7[i22] = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                i22++;
                j11 = j9;
                cArr2 = cArr;
                iArr6 = iArr2;
            }
            iArr6 = iArr7;
        }
        char[] cArr4 = cArr2;
        long j12 = j11;
        char c7 = 0;
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        getmessageversion.getSDKAppID = 0;
        while (true) {
            int i23 = getmessageversion.getSDKAppID;
            if (i23 >= iArr.length) {
                objArr[0] = new String(cArr3, 0, i11);
                return;
            }
            int i24 = iArr[i23];
            char c8 = (char) (i24 >> 16);
            cArr4[c7] = c8;
            char c11 = (char) i24;
            char c12 = 1;
            cArr4[1] = c11;
            char c13 = (char) (iArr[i23 + 1] >> 16);
            cArr4[i19] = c13;
            char c14 = (char) iArr[i23 + 1];
            cArr4[3] = c14;
            getmessageversion.getDeviceData = (c8 << 16) + c11;
            getmessageversion.AuthenticationRequestParameters = (c13 << 16) + c14;
            getMessageVersion.getSDKTransactionID(iArr5);
            int i25 = 0;
            while (i25 < i21) {
                int i26 = $10 + 29;
                $11 = i26 % 128;
                int i27 = i26 % 2;
                int i28 = getmessageversion.getDeviceData;
                if (i27 == 0) {
                    int i29 = iArr5[i25] ^ i28;
                    getmessageversion.getDeviceData = i29;
                    int sDKReferenceNumber = getMessageVersion.getSDKReferenceNumber(i29);
                    Object[] objArr5 = new Object[4];
                    objArr5[3] = getmessageversion;
                    objArr5[i19] = getmessageversion;
                    objArr5[c12] = Integer.valueOf(sDKReferenceNumber);
                    objArr5[0] = getmessageversion;
                    Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(1513246698);
                    if (sDKTransactionID4 == null) {
                        int iIndexOf = 2385 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        char mirror2 = (char) ('0' - AndroidCharacter.getMirror('0'));
                        int windowTouchSlop = 19 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        byte b16 = $$a[i19];
                        byte b17 = b16;
                        sDKTransactionID4 = ChallengeResult.getDeviceData(iIndexOf, mirror2, windowTouchSlop, -2040903174, false, $$c(b17, (byte) (b17 + 2), b16), new Class[]{Object.class, cls, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                    getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                    getmessageversion.AuthenticationRequestParameters = iIntValue;
                    i25 += 73;
                } else {
                    int i31 = iArr5[i25] ^ i28;
                    getmessageversion.getDeviceData = i31;
                    int sDKReferenceNumber2 = getMessageVersion.getSDKReferenceNumber(i31);
                    Object[] objArr6 = new Object[4];
                    objArr6[3] = getmessageversion;
                    objArr6[i19] = getmessageversion;
                    objArr6[c12] = Integer.valueOf(sDKReferenceNumber2);
                    objArr6[0] = getmessageversion;
                    Object sDKTransactionID5 = ChallengeResult.getSDKTransactionID(1513246698);
                    if (sDKTransactionID5 == null) {
                        int mirror3 = AndroidCharacter.getMirror('0') + 2338;
                        char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int i32 = (ExpandableListView.getPackedPositionForGroup(0) > j12 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j12 ? 0 : -1)) + 19;
                        byte b18 = $$a[i19];
                        byte b19 = b18;
                        c3 = c12;
                        sDKTransactionID5 = ChallengeResult.getDeviceData(mirror3, scrollBarFadeDuration, i32, -2040903174, false, $$c(b19, (byte) (b19 + 2), b18), new Class[]{Object.class, cls, Object.class, Object.class});
                    } else {
                        c3 = c12;
                    }
                    int iIntValue2 = ((Integer) ((Method) sDKTransactionID5).invoke(null, objArr6)).intValue();
                    getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                    getmessageversion.AuthenticationRequestParameters = iIntValue2;
                    i25++;
                    c12 = c3;
                }
                i21 = 16;
            }
            char c15 = c12;
            int i33 = getmessageversion.getDeviceData;
            int i34 = getmessageversion.AuthenticationRequestParameters;
            getmessageversion.getDeviceData = i34;
            getmessageversion.AuthenticationRequestParameters = i33;
            i21 = 16;
            int i35 = i33 ^ iArr5[16];
            getmessageversion.AuthenticationRequestParameters = i35;
            int i36 = i34 ^ iArr5[17];
            getmessageversion.getDeviceData = i36;
            cArr4[0] = (char) (i36 >>> 16);
            cArr4[c15] = (char) i36;
            cArr4[i19] = (char) (i35 >>> 16);
            cArr4[3] = (char) i35;
            getMessageVersion.getSDKTransactionID(iArr5);
            int i37 = getmessageversion.getSDKAppID;
            cArr3[i37 * 2] = cArr4[0];
            cArr3[(i37 * 2) + 1] = cArr4[c15];
            cArr3[(i37 * 2) + 2] = cArr4[i19];
            cArr3[(i37 * 2) + 3] = cArr4[3];
            Object[] objArr7 = new Object[i19];
            objArr7[c15] = getmessageversion;
            objArr7[0] = getmessageversion;
            Object sDKTransactionID6 = ChallengeResult.getSDKTransactionID(35442447);
            if (sDKTransactionID6 == null) {
                int iGreen = Color.green(0) + 1861;
                char cBlue = (char) Color.blue(0);
                int defaultSize = 40 - View.getDefaultSize(0, 0);
                i19 = 2;
                byte b21 = $$a[2];
                byte b22 = b21;
                sDKTransactionID6 = ChallengeResult.getDeviceData(iGreen, cBlue, defaultSize, -562771681, false, $$c(b22, (byte) (b22 + 1), b21), new Class[]{Object.class, Object.class});
            } else {
                i19 = 2;
            }
            ((Method) sDKTransactionID6).invoke(null, objArr7);
            $11 = ($10 + 85) % 128;
            c7 = 0;
        }
    }

    private static Signature getDeviceData() throws Throwable {
        getSDKReferenceNumber = (getDeviceData + 73) % 128;
        Object[] objArr = new Object[1];
        a(new int[]{1735614676, -1180647564, 610656340, -2064119757, 415415797, 1003403943, -1817954971, 1509373078}, 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
        Signature signature = Signature.getInstance(((String) objArr[0]).intern());
        getDeviceData = (getSDKReferenceNumber + 117) % 128;
        return signature;
    }

    public static void getSDKTransactionID() {
        getSDKTransactionID = new int[]{-201318664, -300310140, -1019876102, 1227826660, 1765034109, 77237235, -42630540, 661442705, 1339084389, 363094085, -726198685, 2130209616, 2061186343, -1156312694, -1985974882, -2067369660, 2113216448, -1561006930};
    }

    public static void init$0() {
        $$a = new byte[]{26, 112, 0, -80};
        $$b = 31;
    }

    @Override // atd.ad.AuthenticationRequestParameters
    public final String AuthenticationRequestParameters() throws Throwable {
        getDeviceData = (getSDKReferenceNumber + 73) % 128;
        Object[] objArr = new Object[1];
        a(new int[]{-1895200293, -1799315048, 701461534, -1358230158}, 5 - View.MeasureSpec.getSize(0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        getSDKReferenceNumber = (getDeviceData + 13) % 128;
        return strIntern;
    }

    @Override // atd.ai.getSDKAppID
    public final boolean getDeviceData(byte[] bArr, byte[] bArr2, PublicKey publicKey) throws Throwable {
        getDeviceData = (getSDKReferenceNumber + 95) % 128;
        Signature deviceData = getDeviceData();
        deviceData.initVerify(publicKey);
        deviceData.update(bArr2);
        boolean zVerify = deviceData.verify(bArr);
        getSDKReferenceNumber = (getDeviceData + 67) % 128;
        return zVerify;
    }
}
