package atd.al;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.aj.getMessageVersion;
import atd.am.getSDKEphemeralPublicKey;
import atd.bc.ChallengeResultTimeout;
import atd.e.ChallengeResult;
import java.lang.reflect.Method;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class AuthenticationRequestParameters extends getMessageVersion {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getSDKAppID;
    private static int[] getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private atd.ai.getSDKAppID AuthenticationRequestParameters;
    private List<X509Certificate> getDeviceData;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, int r7, int r8) {
        /*
            int r7 = r7 + 112
            int r8 = r8 + 4
            byte[] r0 = atd.al.AuthenticationRequestParameters.$$a
            int r6 = r6 * 3
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L15
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2d
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r0
            r0 = r5
        L2d:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r0
            r0 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.al.AuthenticationRequestParameters.$$c(byte, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        getSDKAppID = 1;
        getSDKReferenceNumber = new int[]{573404796, -1478785467, 1516023186, 220803106, -503585148, -749108427, 340750905, 1002512240, -589953732, -540032092, -1407458295, 383960140, -19639300, -74385662, 510517974, 613623136, -1711875114, 2077837418};
    }

    public AuthenticationRequestParameters(String str, List<atd.ai.getSDKAppID> list) throws atd.ac.getSDKAppID {
        super(str, getSDKEphemeralPublicKey.JWS_HEADER_NOT_BASE64URL_ENCODED);
        try {
            JSONObject messageVersion = getMessageVersion();
            Object[] objArr = new Object[1];
            a(new int[]{-234465509, -365772506}, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3, objArr);
            this.AuthenticationRequestParameters = atd.ai.AuthenticationRequestParameters.getDeviceData(messageVersion.getString(((String) objArr[0]).intern()), list);
            this.getDeviceData = new ArrayList();
            Object[] objArr2 = new Object[1];
            a(new int[]{-359732830, -1463853065}, 3 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr2);
            JSONArray jSONArray = messageVersion.getJSONArray(((String) objArr2[0]).intern());
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                this.getDeviceData.add(atd.aj.getSDKEphemeralPublicKey.getSDKTransactionID(jSONArray.getString(i11)));
            }
        } catch (CertificateException | JSONException unused) {
            throw atd.aa.getSDKReferenceNumber.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }

    private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
        int i12;
        int length;
        int[] iArr2;
        int i13;
        char[] cArr;
        int i14;
        int i15;
        int i16;
        atd.bb.getMessageVersion getmessageversion = new atd.bb.getMessageVersion();
        char[] cArr2 = new char[4];
        int i17 = 2;
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr3 = getSDKReferenceNumber;
        Class cls = Integer.TYPE;
        int i18 = 16;
        int i19 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            $10 = ($11 + 111) % 128;
            int i21 = 0;
            while (i21 < length2) {
                int i22 = $11 + 91;
                $10 = i22 % 128;
                if (i22 % i17 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i21])};
                        Object sDKTransactionID = ChallengeResult.getSDKTransactionID(-1667528016);
                        if (sDKTransactionID == null) {
                            i14 = i17;
                            byte b8 = (byte) i19;
                            i15 = i18;
                            byte b11 = (byte) (b8 + 2);
                            i16 = i19;
                            sDKTransactionID = ChallengeResult.getDeviceData(2223 - (ViewConfiguration.getTapTimeout() >> i18), (char) (53070 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), ((byte) KeyEvent.getModifierMetaStateMask()) + 22, 1089703072, false, $$c(b8, b11, (byte) (b11 - 3)), new Class[]{cls});
                        } else {
                            i14 = i17;
                            i15 = i18;
                            i16 = i19;
                        }
                        iArr4[i21] = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                        i21 <<= 1;
                        i17 = i14;
                        i18 = i15;
                        i19 = i16;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    int i23 = i17;
                    int i24 = i18;
                    int i25 = i19;
                    Object[] objArr3 = {Integer.valueOf(iArr3[i21])};
                    Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(-1667528016);
                    if (sDKTransactionID2 == null) {
                        byte b12 = (byte) i25;
                        byte b13 = (byte) (b12 + 2);
                        sDKTransactionID2 = ChallengeResult.getDeviceData(KeyEvent.keyCodeFromString("") + 2223, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(i25) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i25) == 0.0d ? 0 : -1)) + 53070), 21 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1089703072, false, $$c(b12, b13, (byte) (b13 - 3)), new Class[]{cls});
                    }
                    iArr4[i21] = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                    i21++;
                    i17 = i23;
                    i18 = i24;
                    i19 = 0;
                }
            }
            iArr3 = iArr4;
        }
        int i26 = i17;
        int i27 = i18;
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = getSDKReferenceNumber;
        if (iArr6 != null) {
            int i28 = $11 + 55;
            $10 = i28 % 128;
            if (i28 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i13 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i13 = 0;
            }
            while (i13 < length) {
                Object[] objArr4 = {Integer.valueOf(iArr6[i13])};
                Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(-1667528016);
                if (sDKTransactionID3 == null) {
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 + 2);
                    cArr = cArr2;
                    sDKTransactionID3 = ChallengeResult.getDeviceData(2223 - Color.argb(0, 0, 0, 0), (char) (53070 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 20, 1089703072, false, $$c(b14, b15, (byte) (b15 - 3)), new Class[]{cls});
                } else {
                    cArr = cArr2;
                }
                iArr2[i13] = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                i13++;
                cArr2 = cArr;
            }
            iArr6 = iArr2;
        }
        char[] cArr4 = cArr2;
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        getmessageversion.getSDKAppID = 0;
        $10 = ($11 + 101) % 128;
        while (true) {
            int i29 = getmessageversion.getSDKAppID;
            if (i29 >= iArr.length) {
                objArr[0] = new String(cArr3, 0, i11);
                return;
            }
            int i31 = iArr[i29];
            char c3 = (char) (i31 >> 16);
            cArr4[0] = c3;
            char c7 = (char) i31;
            cArr4[1] = c7;
            char c8 = (char) (iArr[i29 + 1] >> 16);
            cArr4[i26] = c8;
            char c11 = (char) iArr[i29 + 1];
            cArr4[3] = c11;
            getmessageversion.getDeviceData = (c3 << 16) + c7;
            getmessageversion.AuthenticationRequestParameters = (c8 << 16) + c11;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr5);
            int i32 = 0;
            while (true) {
                i12 = getmessageversion.getDeviceData;
                if (i32 >= i27) {
                    break;
                }
                int i33 = i12 ^ iArr5[i32];
                getmessageversion.getDeviceData = i33;
                int sDKReferenceNumber = atd.bb.getMessageVersion.getSDKReferenceNumber(i33);
                Object[] objArr5 = new Object[4];
                objArr5[3] = getmessageversion;
                objArr5[i26] = getmessageversion;
                objArr5[1] = Integer.valueOf(sDKReferenceNumber);
                objArr5[0] = getmessageversion;
                Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(1513246698);
                if (sDKTransactionID4 == null) {
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    sDKTransactionID4 = ChallengeResult.getDeviceData((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2386, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), View.resolveSizeAndState(0, 0, 0) + 19, -2040903174, false, $$c(b16, b17, (byte) (b17 - 1)), new Class[]{Object.class, cls, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                getmessageversion.AuthenticationRequestParameters = iIntValue;
                i32++;
                i27 = 16;
            }
            int i34 = getmessageversion.AuthenticationRequestParameters;
            getmessageversion.getDeviceData = i34;
            getmessageversion.AuthenticationRequestParameters = i12;
            i27 = 16;
            int i35 = i12 ^ iArr5[16];
            getmessageversion.AuthenticationRequestParameters = i35;
            int i36 = i34 ^ iArr5[17];
            getmessageversion.getDeviceData = i36;
            cArr4[0] = (char) (i36 >>> 16);
            cArr4[1] = (char) i36;
            cArr4[i26] = (char) (i35 >>> 16);
            cArr4[3] = (char) i35;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr5);
            int i37 = getmessageversion.getSDKAppID;
            cArr3[i37 * 2] = cArr4[0];
            cArr3[(i37 * 2) + 1] = cArr4[1];
            cArr3[(i37 * 2) + 2] = cArr4[i26];
            cArr3[(i37 * 2) + 3] = cArr4[3];
            int i38 = i26;
            Object[] objArr6 = new Object[i38];
            objArr6[1] = getmessageversion;
            objArr6[0] = getmessageversion;
            Object sDKTransactionID5 = ChallengeResult.getSDKTransactionID(35442447);
            if (sDKTransactionID5 == null) {
                byte b18 = (byte) 0;
                byte b19 = (byte) (b18 + 1);
                sDKTransactionID5 = ChallengeResult.getDeviceData(1861 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 39 - ImageFormat.getBitsPerPixel(0), -562771681, false, $$c(b18, b19, (byte) (-b19)), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID5).invoke(null, objArr6);
            i26 = i38;
        }
    }

    public static void init$0() {
        $$a = new byte[]{88, -124, -103, 69};
        $$b = 86;
    }

    public final atd.ai.getSDKAppID AuthenticationRequestParameters() {
        int i11 = getSDKTransactionID;
        atd.ai.getSDKAppID getsdkappid = this.AuthenticationRequestParameters;
        int i12 = i11 + 45;
        getSDKAppID = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 64 / 0;
        }
        return getsdkappid;
    }

    public final List<X509Certificate> getDeviceData() {
        ArrayList arrayList = new ArrayList(this.getDeviceData);
        getSDKTransactionID = (getSDKAppID + 11) % 128;
        return arrayList;
    }

    @Override // atd.aj.getMessageVersion
    public final void getSDKReferenceNumber() {
        Iterator<X509Certificate> it;
        int i11 = getSDKTransactionID + 41;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            super.getSDKReferenceNumber();
            this.AuthenticationRequestParameters = null;
            throw null;
        }
        super.getSDKReferenceNumber();
        this.AuthenticationRequestParameters = null;
        List<X509Certificate> list = this.getDeviceData;
        if (list != null) {
            int i12 = getSDKTransactionID + 29;
            getSDKAppID = i12 % 128;
            if (i12 % 2 == 0) {
                it = list.iterator();
                int i13 = 25 / 0;
            } else {
                it = list.iterator();
            }
            while (it.hasNext()) {
                ChallengeResultTimeout.getSDKTransactionID(it.next());
            }
            this.getDeviceData.clear();
            this.getDeviceData = null;
        }
        getSDKAppID = (getSDKTransactionID + 109) % 128;
    }
}
