package atd.c;

import android.graphics.Color;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.am.getSDKTransactionID;
import atd.n.ChallengeResultError;
import atd.y.timedout;
import java.lang.reflect.Method;
import n90.b0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
final class getSDKEphemeralPublicKey {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static int getSDKEphemeralPublicKey;
    private static int[] getSDKReferenceNumber;
    private String AuthenticationRequestParameters;
    private String getDeviceData;
    private boolean getSDKAppID;
    private b0 getSDKTransactionID;

    private static String $$c(byte b8, int i11, int i12) {
        byte[] bArr = $$a;
        int i13 = i12 * 4;
        int i14 = i11 + 4;
        int i15 = 114 - b8;
        byte[] bArr2 = new byte[i13 + 1];
        int i16 = -1;
        if (bArr == null) {
            i15 += i13;
        }
        while (true) {
            i14++;
            i16++;
            bArr2[i16] = (byte) i15;
            if (i16 == i13) {
                return new String(bArr2, 0);
            }
            i15 += bArr[i14];
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = 0;
        getSDKEphemeralPublicKey = 1;
        ChallengeResultCancelled = 0;
        ChallengeResult = 1;
        BuildConfig();
        TextUtils.lastIndexOf("", '0');
        ViewConfiguration.getZoomControlsTimeout();
        ViewConfiguration.getKeyRepeatDelay();
        BuildConfig = (getSDKEphemeralPublicKey + 81) % 128;
    }

    private getSDKEphemeralPublicKey(b0 b0Var) throws Throwable {
        atd.am.getSDKReferenceNumber getsdkreferencenumber = atd.am.getSDKReferenceNumber.MESSAGE_EXTENSION_NAME;
        String sDKAppID = atd.d.getSDKEphemeralPublicKey.getSDKTransactionID(b0Var, getsdkreferencenumber).getSDKAppID();
        this.getDeviceData = sDKAppID;
        if (sDKAppID.length() > 64) {
            Object[] objArr = new Object[1];
            a(new int[]{522653879, -69458993, -1553185663, -1124924516, 1391266981, -375373286, 2049479426, 1333396172, -1494026816, -1425555708}, 20 - TextUtils.getOffsetAfter("", 0), objArr);
            throw new atd.ac.getSDKAppID(((String) objArr[0]).intern(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_INVALID_FORMAT, atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_TOO_LONG, getsdkreferencenumber);
        }
        atd.am.getSDKReferenceNumber getsdkreferencenumber2 = atd.am.getSDKReferenceNumber.MESSAGE_EXTENSION_ID;
        String sDKAppID2 = atd.d.getSDKEphemeralPublicKey.getSDKTransactionID(b0Var, getsdkreferencenumber2).getSDKAppID();
        this.AuthenticationRequestParameters = sDKAppID2;
        if (sDKAppID2.length() > 64) {
            Object[] objArr2 = new Object[1];
            a(new int[]{522653879, -69458993, -1553185663, -1124924516, 1391266981, -375373286, 2049479426, 1333396172, -1494026816, -1425555708}, 20 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
            throw new atd.ac.getSDKAppID(((String) objArr2[0]).intern(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_INVALID_FORMAT, atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_TOO_LONG, getsdkreferencenumber2);
        }
        Object[] objArr3 = {b0Var, atd.am.getSDKReferenceNumber.MESSAGE_EXTENSION_CRITICALITY_INDICATOR};
        int sDKAppID3 = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID4 = atd.a.getSDKReferenceNumber.getSDKAppID();
        boolean zBooleanValue = ((Boolean) ((atd.am.getSDKTransactionID) atd.d.getSDKEphemeralPublicKey.getSDKAppID(atd.a.getSDKReferenceNumber.getSDKAppID(), atd.a.getSDKReferenceNumber.getSDKAppID(), objArr3, sDKAppID4, sDKAppID3, -489461748, 489461751)).getSDKAppID()).booleanValue();
        this.getSDKAppID = zBooleanValue;
        if (zBooleanValue) {
            Object[] objArr4 = new Object[1];
            a(new int[]{-1166565959, 1073955541, -883772453, -226005566, -1800616692, -1945045224, 2094613527, -1858942046, -540207561, -213639944, -1427838315, -1404286324, -1847536896, 899319359, 1879652503, -1278861141, 1834630300, 2133966740, 1840024059, 2093145344}, (ViewConfiguration.getPressedStateDuration() >> 16) + 40, objArr4);
            throw new atd.ac.getSDKAppID(((String) objArr4[0]).intern(), atd.h.getSDKReferenceNumber.MESSAGE_EXTENSION_MISSING, atd.am.getSDKEphemeralPublicKey.MESSAGE_EXTENSION_IS_CRITICAL);
        }
        atd.am.getSDKReferenceNumber getsdkreferencenumber3 = atd.am.getSDKReferenceNumber.MESSAGE_EXTENSION_DATA;
        b0 sDKAppID5 = atd.d.getSDKEphemeralPublicKey.getSDKReferenceNumber(b0Var, getsdkreferencenumber3).getSDKAppID();
        this.getSDKTransactionID = sDKAppID5;
        if (sDKAppID5.toString().length() <= 8059) {
            return;
        }
        Object[] objArr5 = new Object[1];
        a(new int[]{522653879, -69458993, -1553185663, -1124924516, 1391266981, -375373286, 2049479426, 1333396172, -1494026816, -1425555708}, ExpandableListView.getPackedPositionType(0L) + 20, objArr5);
        throw new atd.ac.getSDKAppID(((String) objArr5[0]).intern(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_INVALID_FORMAT, atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_TOO_LONG, getsdkreferencenumber3);
    }

    public static void BuildConfig() {
        getSDKReferenceNumber = new int[]{-218923314, -2097437300, 390682192, -24961701, -1106226790, 1917359018, 1944098087, 1228897796, 633630751, 1900793639, -191217509, -1051885430, 1456062976, -1692159879, 1193326881, 346061646, -660354793, 1033519369};
    }

    private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
        char c3;
        int length;
        int[] iArr2;
        char[] cArr;
        int[] iArr3;
        int i12;
        int i13;
        int i14;
        int i15;
        atd.bb.getMessageVersion getmessageversion = new atd.bb.getMessageVersion();
        char[] cArr2 = new char[4];
        int i16 = 2;
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr4 = getSDKReferenceNumber;
        int i17 = -1667528016;
        Class cls = Integer.TYPE;
        int i18 = 0;
        if (iArr4 != null) {
            int length2 = iArr4.length;
            int[] iArr5 = new int[length2];
            int i19 = 0;
            while (i19 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr4[i19])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(i17);
                    if (sDKTransactionID == null) {
                        i14 = i17;
                        i13 = i16;
                        byte b8 = (byte) i18;
                        byte b11 = (byte) (b8 - 1);
                        i15 = i18;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(Color.alpha(i18) + 2223, (char) (53070 - View.MeasureSpec.getSize(i18)), 22 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1089703072, false, $$c(b8, b11, (byte) (b11 + 1)), new Class[]{cls});
                    } else {
                        i13 = i16;
                        i14 = i17;
                        i15 = i18;
                    }
                    iArr5[i19] = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                    i19++;
                    $10 = ($11 + 29) % 128;
                    i17 = i14;
                    i16 = i13;
                    i18 = i15;
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
        int i21 = i16;
        int i22 = i17;
        int i23 = i18;
        int length3 = iArr4.length;
        int[] iArr6 = new int[length3];
        int[] iArr7 = getSDKReferenceNumber;
        int i24 = 16;
        if (iArr7 != null) {
            int i25 = $10 + 111;
            $11 = i25 % 128;
            if (i25 % 2 == 0) {
                length = iArr7.length;
                iArr2 = new int[length];
            } else {
                length = iArr7.length;
                iArr2 = new int[length];
            }
            int i26 = i23;
            while (i26 < length) {
                int i27 = $11 + 113;
                $10 = i27 % 128;
                if (i27 % 2 != 0) {
                    Object[] objArr3 = {Integer.valueOf(iArr7[i26])};
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i22);
                    if (sDKTransactionID2 == null) {
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> i24) + 2223;
                        i12 = i24;
                        char c7 = (char) (53070 - (CdmaCellLocation.convertQuartSecToDecDegrees(i23) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i23) == 0.0d ? 0 : -1)));
                        int i28 = i23;
                        int iIndexOf = 21 - TextUtils.indexOf("", "", i28);
                        cArr = cArr2;
                        byte b12 = (byte) i28;
                        byte b13 = (byte) (b12 - 1);
                        iArr3 = iArr7;
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(maximumFlingVelocity, c7, iIndexOf, 1089703072, false, $$c(b12, b13, (byte) (b13 + 1)), new Class[]{cls});
                    } else {
                        cArr = cArr2;
                        iArr3 = iArr7;
                        i12 = i24;
                    }
                    iArr2[i26] = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                    i26 %= 0;
                } else {
                    cArr = cArr2;
                    iArr3 = iArr7;
                    i12 = i24;
                    Object[] objArr4 = {Integer.valueOf(iArr3[i26])};
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(i22);
                    if (sDKTransactionID3 == null) {
                        byte b14 = (byte) 0;
                        byte b15 = (byte) (b14 - 1);
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(2223 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (TextUtils.getTrimmedLength("") + 53070), 21 - View.MeasureSpec.getMode(0), 1089703072, false, $$c(b14, b15, (byte) (b15 + 1)), new Class[]{cls});
                    }
                    iArr2[i26] = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                    i26++;
                }
                i24 = i12;
                cArr2 = cArr;
                iArr7 = iArr3;
                i23 = 0;
            }
            iArr7 = iArr2;
        }
        char[] cArr4 = cArr2;
        int i29 = i24;
        System.arraycopy(iArr7, 0, iArr6, 0, length3);
        getmessageversion.getSDKAppID = 0;
        $11 = ($10 + 107) % 128;
        while (true) {
            int i31 = getmessageversion.getSDKAppID;
            if (i31 >= iArr.length) {
                objArr[0] = new String(cArr3, 0, i11);
                return;
            }
            int i32 = iArr[i31];
            char c8 = (char) (i32 >> 16);
            cArr4[0] = c8;
            char c11 = (char) i32;
            char c12 = 1;
            cArr4[1] = c11;
            char c13 = (char) (iArr[i31 + 1] >> 16);
            cArr4[i21] = c13;
            char c14 = (char) iArr[i31 + 1];
            cArr4[3] = c14;
            getmessageversion.getDeviceData = (c8 << 16) + c11;
            getmessageversion.AuthenticationRequestParameters = (c13 << 16) + c14;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr6);
            int i33 = 0;
            while (i33 < i29) {
                $11 = ($10 + 121) % 128;
                int i34 = getmessageversion.getDeviceData ^ iArr6[i33];
                getmessageversion.getDeviceData = i34;
                int sDKReferenceNumber = atd.bb.getMessageVersion.getSDKReferenceNumber(i34);
                Object[] objArr5 = new Object[4];
                objArr5[3] = getmessageversion;
                objArr5[i21] = getmessageversion;
                objArr5[c12] = Integer.valueOf(sDKReferenceNumber);
                objArr5[0] = getmessageversion;
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(1513246698);
                if (sDKTransactionID4 == null) {
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2386;
                    char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                    int i35 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 18;
                    byte b16 = (byte) ($$b & 2);
                    byte b17 = (byte) (b16 - 3);
                    c3 = c12;
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(jumpTapTimeout, offsetAfter, i35, -2040903174, false, $$c(b16, b17, (byte) (b17 + 1)), new Class[]{Object.class, cls, Object.class, Object.class});
                } else {
                    c3 = c12;
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                getmessageversion.AuthenticationRequestParameters = iIntValue;
                i33++;
                c12 = c3;
                i29 = 16;
            }
            char c15 = c12;
            int i36 = getmessageversion.getDeviceData;
            int i37 = getmessageversion.AuthenticationRequestParameters;
            getmessageversion.getDeviceData = i37;
            getmessageversion.AuthenticationRequestParameters = i36;
            i29 = 16;
            int i38 = i36 ^ iArr6[16];
            getmessageversion.AuthenticationRequestParameters = i38;
            int i39 = i37 ^ iArr6[17];
            getmessageversion.getDeviceData = i39;
            cArr4[0] = (char) (i39 >>> 16);
            cArr4[c15] = (char) i39;
            cArr4[i21] = (char) (i38 >>> 16);
            cArr4[3] = (char) i38;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr6);
            int i41 = getmessageversion.getSDKAppID;
            cArr3[i41 * 2] = cArr4[0];
            cArr3[(i41 * 2) + 1] = cArr4[c15];
            cArr3[(i41 * 2) + 2] = cArr4[i21];
            cArr3[(i41 * 2) + 3] = cArr4[3];
            int i42 = i21;
            Object[] objArr6 = new Object[i42];
            objArr6[c15] = getmessageversion;
            objArr6[0] = getmessageversion;
            Object sDKTransactionID5 = atd.e.ChallengeResult.getSDKTransactionID(35442447);
            if (sDKTransactionID5 == null) {
                int iRed = 1861 - Color.red(0);
                char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 41;
                byte b18 = (byte) ($$b & 1);
                byte b19 = (byte) (-b18);
                sDKTransactionID5 = atd.e.ChallengeResult.getDeviceData(iRed, capsMode, iIndexOf2, -562771681, false, $$c(b18, b19, (byte) (b19 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID5).invoke(null, objArr6);
            i21 = i42;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[PHI: r3
      0x003b: PHI (r3v10 atd.am.getSDKTransactionID<n90.b0>) = (r3v6 atd.am.getSDKTransactionID<n90.b0>), (r3v15 atd.am.getSDKTransactionID<n90.b0>) binds: [B:11:0x0039, B:8:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<atd.c.getSDKEphemeralPublicKey> getDeviceData(n90.e r12) throws java.lang.Throwable {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            java.util.List r3 = r12.f30756a
            int r3 = r3.size()
            if (r2 >= r3) goto L70
            int r3 = atd.c.getSDKEphemeralPublicKey.ChallengeResultCancelled
            int r3 = r3 + 53
            int r4 = r3 % 128
            atd.c.getSDKEphemeralPublicKey.ChallengeResult = r4
            int r3 = r3 % 2
            if (r3 != 0) goto L2d
            n90.n r3 = r12.get(r2)
            atd.am.getSDKReferenceNumber r4 = atd.am.getSDKReferenceNumber.NONE
            atd.am.getSDKTransactionID r3 = atd.d.getSDKEphemeralPublicKey.getSDKTransactionID(r3, r4)
            boolean r4 = r3 instanceof atd.am.getSDKTransactionID.getDeviceData
            r5 = 95
            int r5 = r5 / r1
            if (r4 == 0) goto L65
            goto L3b
        L2d:
            n90.n r3 = r12.get(r2)
            atd.am.getSDKReferenceNumber r4 = atd.am.getSDKReferenceNumber.NONE
            atd.am.getSDKTransactionID r3 = atd.d.getSDKEphemeralPublicKey.getSDKTransactionID(r3, r4)
            boolean r4 = r3 instanceof atd.am.getSDKTransactionID.getDeviceData
            if (r4 == 0) goto L65
        L3b:
            atd.c.getSDKEphemeralPublicKey r4 = new atd.c.getSDKEphemeralPublicKey
            atd.am.getSDKTransactionID$getDeviceData r3 = (atd.am.getSDKTransactionID.getDeviceData) r3
            java.lang.Object[] r7 = new java.lang.Object[]{r3}
            int r10 = atd.y.timedout.AuthenticationRequestParameters.getSDKAppID()
            int r8 = atd.y.timedout.AuthenticationRequestParameters.getSDKAppID()
            int r9 = atd.y.timedout.AuthenticationRequestParameters.getSDKAppID()
            int r11 = atd.y.timedout.AuthenticationRequestParameters.getSDKAppID()
            r5 = -568881259(0xffffffffde178f95, float:-2.7302779E18)
            r6 = 568881263(0x21e8706f, float:1.5750692E-18)
            java.lang.Object r3 = atd.am.getSDKTransactionID.getDeviceData.getDeviceData(r5, r6, r7, r8, r9, r10, r11)
            n90.b0 r3 = (n90.b0) r3
            r4.<init>(r3)
            r0.add(r4)
        L65:
            int r2 = r2 + 1
            int r3 = atd.c.getSDKEphemeralPublicKey.ChallengeResult
            int r3 = r3 + 73
            int r3 = r3 % 128
            atd.c.getSDKEphemeralPublicKey.ChallengeResultCancelled = r3
            goto L7
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.c.getSDKEphemeralPublicKey.getDeviceData(n90.e):java.util.List");
    }

    public static void init$0() {
        $$a = new byte[]{83, 102, 74, -77};
        $$b = 191;
    }

    public final JSONObject AuthenticationRequestParameters() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(atd.am.getSDKReferenceNumber.MESSAGE_EXTENSION_NAME.getSDKReferenceNumber(), this.getDeviceData);
        jSONObject.put(atd.am.getSDKReferenceNumber.MESSAGE_EXTENSION_ID.getSDKReferenceNumber(), this.AuthenticationRequestParameters);
        jSONObject.put(atd.am.getSDKReferenceNumber.MESSAGE_EXTENSION_CRITICALITY_INDICATOR.getSDKReferenceNumber(), this.getSDKAppID);
        String sDKReferenceNumber = atd.am.getSDKReferenceNumber.MESSAGE_EXTENSION_DATA.getSDKReferenceNumber();
        Object[] objArr = {this.getSDKTransactionID};
        int sDKAppID = ChallengeResultError.getDeviceData.getSDKAppID();
        int sDKAppID2 = ChallengeResultError.getDeviceData.getSDKAppID();
        jSONObject.put(sDKReferenceNumber, (JSONObject) atd.d.ChallengeResultCancelled.getSDKTransactionID(13061488, sDKAppID, objArr, -13061488, ChallengeResultError.getDeviceData.getSDKAppID(), ChallengeResultError.getDeviceData.getSDKAppID(), sDKAppID2));
        int i11 = ChallengeResult + 105;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            return jSONObject;
        }
        throw null;
    }

    public final void ChallengeResult() {
        int i11 = (ChallengeResultCancelled + 85) % 128;
        ChallengeResult = i11;
        this.getDeviceData = null;
        this.AuthenticationRequestParameters = null;
        this.getSDKAppID = false;
        this.getSDKTransactionID = null;
        int i12 = i11 + 115;
        ChallengeResultCancelled = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public final b0 getSDKAppID() {
        int i11 = (ChallengeResultCancelled + 17) % 128;
        ChallengeResult = i11;
        b0 b0Var = this.getSDKTransactionID;
        ChallengeResultCancelled = (i11 + 29) % 128;
        return b0Var;
    }

    public final String getSDKReferenceNumber() {
        int i11 = ChallengeResult + 83;
        ChallengeResultCancelled = i11 % 128;
        int i12 = i11 % 2;
        String str = this.AuthenticationRequestParameters;
        if (i12 == 0) {
            return str;
        }
        throw null;
    }

    public final String getSDKTransactionID() {
        int i11 = ChallengeResultCancelled;
        String str = this.getDeviceData;
        int i12 = i11 + 57;
        ChallengeResult = i12 % 128;
        if (i12 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getDeviceData() throws Throwable {
        b0 b0Var = this.getSDKTransactionID;
        if (b0Var == null) {
            int i11 = ChallengeResultCancelled + 101;
            ChallengeResult = i11 % 128;
            if (i11 % 2 != 0) {
                return null;
            }
            throw null;
        }
        atd.am.getSDKTransactionID<String> sDKTransactionID = atd.d.getSDKEphemeralPublicKey.getSDKTransactionID(b0Var, atd.am.getSDKReferenceNumber.MESSAGE_EXTENSION_VERSION);
        if (!(sDKTransactionID instanceof getSDKTransactionID.getDeviceData)) {
            int i12 = ChallengeResultCancelled + 75;
            ChallengeResult = i12 % 128;
            if (i12 % 2 != 0) {
                return null;
            }
            throw null;
        }
        String str = (String) getSDKTransactionID.getDeviceData.getDeviceData(-568881259, 568881263, new Object[]{(getSDKTransactionID.getDeviceData) sDKTransactionID}, timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID(), timedout.AuthenticationRequestParameters.getSDKAppID());
        int i13 = ChallengeResultCancelled + 63;
        ChallengeResult = i13 % 128;
        if (i13 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public getSDKEphemeralPublicKey(String str, String str2, b0 b0Var) {
        this.getDeviceData = str;
        this.AuthenticationRequestParameters = str2;
        this.getSDKAppID = false;
        this.getSDKTransactionID = b0Var;
    }
}
