package atd.af;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.ag.getMessageVersion;
import atd.aj.ChallengeResultCancelled;
import atd.bb.ChallengeResultKt;
import atd.e.ChallengeResult;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import org.json.JSONObject;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getDeviceData extends getSDKTransactionID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int getMessageVersion;
    private static char getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static char[] getSDKReferenceNumber;
    private RSAPublicKey getDeviceData;
    private RSAPrivateKey getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r5, int r6, int r7) {
        /*
            int r5 = r5 * 4
            int r0 = 1 - r5
            byte[] r1 = atd.af.getDeviceData.$$a
            int r6 = r6 + 4
            int r7 = 122 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r5
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            int r6 = r6 + 1
            r3 = r1[r6]
        L27:
            int r7 = r7 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.af.getDeviceData.$$c(int, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        getMessageVersion = 1;
        AuthenticationRequestParameters = 0;
        BuildConfig = 1;
        getSDKReferenceNumber();
        ViewConfiguration.getFadingEdgeLength();
        AudioTrack.getMinVolume();
        getSDKEphemeralPublicKey = (getMessageVersion + 113) % 128;
    }

    public getDeviceData(JSONObject jSONObject) throws Throwable {
        BigInteger sDKAppID;
        super(jSONObject);
        atd.bc.getSDKReferenceNumber sDKTransactionID = atd.bc.getSDKReferenceNumber.getSDKTransactionID();
        Object[] objArr = new Object[1];
        a("㙡", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) ((Process.myPid() >> 22) + 109), objArr);
        BigInteger sDKAppID2 = atd.aj.getSDKAppID.getSDKAppID(sDKTransactionID.getSDKAppID(jSONObject.getString(((String) objArr[0]).intern())));
        Object[] objArr2 = new Object[1];
        a("㙢", -TextUtils.lastIndexOf("", '0', 0, 0), (byte) (99 - KeyEvent.getDeadChar(0, 0)), objArr2);
        BigInteger sDKAppID3 = atd.aj.getSDKAppID.getSDKAppID(sDKTransactionID.getSDKAppID(jSONObject.getString(((String) objArr2[0]).intern())));
        Object[] objArr3 = new Object[1];
        a("㘞", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (byte) (31 - TextUtils.indexOf((CharSequence) "", '0', 0)), objArr3);
        if (jSONObject.has(((String) objArr3[0]).intern())) {
            Object[] objArr4 = new Object[1];
            a("㘞", '1' - AndroidCharacter.getMirror('0'), (byte) (33 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), objArr4);
            sDKAppID = atd.aj.getSDKAppID.getSDKAppID(sDKTransactionID.getSDKAppID(jSONObject.getString(((String) objArr4[0]).intern())));
        } else {
            sDKAppID = null;
        }
        this.getDeviceData = ChallengeResultCancelled.getSDKTransactionID(sDKAppID2, sDKAppID3);
        this.getSDKTransactionID = sDKAppID != null ? ChallengeResultCancelled.getDeviceData(sDKAppID2, sDKAppID) : null;
    }

    private static void a(String str, int i11, byte b8, Object[] objArr) throws Throwable {
        int i12;
        char c3;
        char c7;
        char c8;
        char c11;
        char c12;
        int length;
        char[] cArr;
        int i13;
        int i14;
        float f11;
        char c13;
        char c14 = '\t';
        $10 = ($11 + 9) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        ChallengeResultKt challengeResultKt = new ChallengeResultKt();
        char[] cArr2 = getSDKReferenceNumber;
        Class cls = Integer.TYPE;
        int i15 = -317146529;
        float f12 = 0.0f;
        char c15 = 2;
        int i16 = 0;
        if (cArr2 != null) {
            int i17 = $11 + 99;
            $10 = i17 % 128;
            if (i17 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i13 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i13 = 0;
            }
            while (i13 < length) {
                try {
                    char c16 = c14;
                    Object[] objArr2 = {Integer.valueOf(cArr2[i13])};
                    Object sDKTransactionID = ChallengeResult.getSDKTransactionID(i15);
                    if (sDKTransactionID == null) {
                        i14 = i15;
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2158;
                        f11 = f12;
                        char c17 = (char) (TypedValue.complexToFraction(i16, f12, f12) > f11 ? 1 : (TypedValue.complexToFraction(i16, f12, f12) == f11 ? 0 : -1));
                        int size = View.MeasureSpec.getSize(i16) + 36;
                        c13 = c15;
                        byte b11 = $$a[i16];
                        byte b12 = (byte) (b11 - 1);
                        byte b13 = (byte) (-b11);
                        sDKTransactionID = ChallengeResult.getDeviceData(jumpTapTimeout, c17, size, 829471823, false, $$c(b12, b13, (byte) (b13 & 57)), new Class[]{cls});
                    } else {
                        i14 = i15;
                        f11 = f12;
                        c13 = c15;
                    }
                    cArr[i13] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i13++;
                    i15 = i14;
                    c14 = c16;
                    f12 = f11;
                    c15 = c13;
                    i16 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char c18 = c14;
        int i18 = i15;
        float f13 = f12;
        char c19 = c15;
        Object[] objArr3 = {Integer.valueOf(getSDKAppID)};
        Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(i18);
        if (sDKTransactionID2 == null) {
            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 2159;
            char cBlue = (char) Color.blue(0);
            int iIndexOf = 36 - TextUtils.indexOf("", "", 0);
            byte b14 = $$a[0];
            byte b15 = (byte) (b14 - 1);
            byte b16 = (byte) (-b14);
            sDKTransactionID2 = ChallengeResult.getDeviceData(iLastIndexOf, cBlue, iIndexOf, 829471823, false, $$c(b15, b16, (byte) (b16 & 57)), new Class[]{cls});
        }
        char cCharValue = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
        char[] cArr3 = new char[i11];
        if (i11 % 2 != 0) {
            int i19 = $10 + 121;
            $11 = i19 % 128;
            if (i19 % 2 == 0) {
                i12 = i11 + 119;
                cArr3[i12] = (char) (charArray[i12] * b8);
            } else {
                i12 = i11 - 1;
                cArr3[i12] = (char) (charArray[i12] - b8);
            }
        } else {
            i12 = i11;
        }
        if (i12 > 1) {
            challengeResultKt.getSDKReferenceNumber = 0;
            while (true) {
                int i21 = challengeResultKt.getSDKReferenceNumber;
                if (i21 >= i12) {
                    break;
                }
                char c21 = charArray[i21];
                challengeResultKt.getDeviceData = c21;
                char c22 = charArray[i21 + 1];
                challengeResultKt.getSDKAppID = c22;
                if (c21 == c22) {
                    cArr3[i21] = (char) (c21 - b8);
                    cArr3[i21 + 1] = (char) (c22 - b8);
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = challengeResultKt;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = challengeResultKt;
                    objArr4[c18] = challengeResultKt;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = challengeResultKt;
                    objArr4[6] = challengeResultKt;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = challengeResultKt;
                    objArr4[3] = challengeResultKt;
                    objArr4[c19] = Integer.valueOf(cCharValue);
                    objArr4[1] = challengeResultKt;
                    objArr4[0] = challengeResultKt;
                    Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(835518319);
                    if (sDKTransactionID3 == null) {
                        c3 = '\n';
                        int i22 = 1259 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        c7 = 7;
                        char defaultSize = (char) (34414 - View.getDefaultSize(0, 0));
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 41;
                        c8 = '\b';
                        byte b17 = $$a[0];
                        c11 = 6;
                        byte b18 = (byte) (b17 - 1);
                        byte b19 = (byte) (-b17);
                        c12 = 4;
                        String str$$c = $$c(b18, b19, (byte) (b19 & 55));
                        Class cls2 = Integer.TYPE;
                        sDKTransactionID3 = ChallengeResult.getDeviceData(i22, defaultSize, edgeSlop, -307955329, false, str$$c, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                    } else {
                        c3 = '\n';
                        c7 = 7;
                        c8 = '\b';
                        c11 = 6;
                        c12 = 4;
                    }
                    int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                    int i23 = challengeResultKt.ChallengeResultCancelled;
                    if (iIntValue == i23) {
                        $11 = ($10 + 101) % 128;
                        Object[] objArr5 = new Object[11];
                        objArr5[c3] = challengeResultKt;
                        objArr5[c18] = Integer.valueOf(cCharValue);
                        objArr5[c8] = challengeResultKt;
                        objArr5[c7] = Integer.valueOf(cCharValue);
                        objArr5[c11] = Integer.valueOf(cCharValue);
                        objArr5[5] = challengeResultKt;
                        objArr5[c12] = challengeResultKt;
                        objArr5[3] = Integer.valueOf(cCharValue);
                        objArr5[c19] = Integer.valueOf(cCharValue);
                        objArr5[1] = challengeResultKt;
                        objArr5[0] = challengeResultKt;
                        Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(-758961112);
                        if (sDKTransactionID4 == null) {
                            int jumpTapTimeout2 = 2223 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                            char c23 = (char) (53070 - (AudioTrack.getMinVolume() > f13 ? 1 : (AudioTrack.getMinVolume() == f13 ? 0 : -1)));
                            int iMakeMeasureSpec = 21 - View.MeasureSpec.makeMeasureSpec(0, 0);
                            byte b21 = $$a[0];
                            byte b22 = (byte) (b21 - 1);
                            byte b23 = (byte) (-b21);
                            String str$$c2 = $$c(b22, b23, (byte) (b23 + 1));
                            Class cls3 = Integer.TYPE;
                            sDKTransactionID4 = ChallengeResult.getDeviceData(jumpTapTimeout2, c23, iMakeMeasureSpec, 246098488, false, str$$c2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                        int i24 = (challengeResultKt.getSDKTransactionID * cCharValue) + challengeResultKt.ChallengeResultCancelled;
                        int i25 = challengeResultKt.getSDKReferenceNumber;
                        cArr3[i25] = cArr2[iIntValue2];
                        cArr3[i25 + 1] = cArr2[i24];
                    } else {
                        int i26 = challengeResultKt.AuthenticationRequestParameters;
                        int i27 = challengeResultKt.getSDKTransactionID;
                        if (i26 == i27) {
                            $10 = ($11 + 89) % 128;
                            int iC = k.c(challengeResultKt.getMessageVersion, cCharValue, 1, cCharValue);
                            challengeResultKt.getMessageVersion = iC;
                            int iC2 = k.c(i23, cCharValue, 1, cCharValue);
                            challengeResultKt.ChallengeResultCancelled = iC2;
                            int i28 = (i27 * cCharValue) + iC2;
                            int i29 = challengeResultKt.getSDKReferenceNumber;
                            cArr3[i29] = cArr2[(i26 * cCharValue) + iC];
                            cArr3[i29 + 1] = cArr2[i28];
                        } else {
                            int i31 = (i26 * cCharValue) + i23;
                            int i32 = (i27 * cCharValue) + challengeResultKt.getMessageVersion;
                            int i33 = challengeResultKt.getSDKReferenceNumber;
                            cArr3[i33] = cArr2[i31];
                            cArr3[i33 + 1] = cArr2[i32];
                            challengeResultKt.getSDKReferenceNumber += 2;
                        }
                    }
                }
                challengeResultKt.getSDKReferenceNumber += 2;
            }
        }
        for (int i34 = 0; i34 < i11; i34++) {
            cArr3[i34] = (char) (cArr3[i34] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    public static void getSDKReferenceNumber() {
        getSDKReferenceNumber = new char[]{19805, 30883, 30895, 30855, 30868, 30869, 30888, 30893, 30882};
        getSDKAppID = (char) 19807;
    }

    public static void init$0() {
        $$a = new byte[]{1, -27, -86, -84};
        $$b = 64;
    }

    @Override // atd.af.getSDKReferenceNumber
    public final void AuthenticationRequestParameters() {
        BuildConfig = (AuthenticationRequestParameters + 27) % 128;
        super.AuthenticationRequestParameters();
        this.getDeviceData = null;
        try {
            RSAPrivateKey rSAPrivateKey = this.getSDKTransactionID;
            if (rSAPrivateKey != null) {
                int i11 = AuthenticationRequestParameters + 37;
                BuildConfig = i11 % 128;
                if (i11 % 2 != 0) {
                    rSAPrivateKey.destroy();
                    this.getSDKTransactionID = null;
                } else {
                    rSAPrivateKey.destroy();
                    this.getSDKTransactionID = null;
                    int i12 = 34 / 0;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final RSAPublicKey getSDKAppID() {
        int i11 = AuthenticationRequestParameters + 33;
        BuildConfig = i11 % 128;
        int i12 = i11 % 2;
        RSAPublicKey rSAPublicKey = this.getDeviceData;
        if (i12 != 0) {
            return rSAPublicKey;
        }
        throw null;
    }

    @Override // atd.ae.getSDKReferenceNumber
    public final Object getSDKTransactionID$9f036af() throws Throwable {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        String messageVersion = getMessageVersion();
        if (messageVersion != null) {
            BuildConfig = (AuthenticationRequestParameters + 97) % 128;
            if (!messageVersion.isEmpty()) {
                int i11 = AuthenticationRequestParameters + 113;
                BuildConfig = i11 % 128;
                if (i11 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    a("\b\u0001㘷", 3 / (ViewConfiguration.getMaximumFlingVelocity() >> 11), (byte) (1 << (ViewConfiguration.getZoomControlsTimeout() > 1L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 1L ? 0 : -1))), objArr);
                    obj = objArr[0];
                } else {
                    Object[] objArr2 = new Object[1];
                    a("\b\u0001㘷", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3, (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 56), objArr2);
                    obj = objArr2[0];
                }
                jSONObject.put(((String) obj).intern(), messageVersion);
            }
        }
        atd.ae.ChallengeResultCancelled challengeResultCancelled = new atd.ae.ChallengeResultCancelled(getMessageVersion.getDeviceData, atd.ah.getSDKTransactionID.getDeviceData, jSONObject);
        int deviceData = atd.ak.getDeviceData.getDeviceData();
        atd.bc.getDeviceData.getSDKTransactionID(atd.ak.getDeviceData.getDeviceData(), atd.ak.getDeviceData.getDeviceData(), atd.ak.getDeviceData.getDeviceData(), deviceData, -1676234569, new Object[]{jSONObject}, 1676234570);
        try {
            Object[] objArr3 = {challengeResultCancelled, challengeResultCancelled.getSDKTransactionID().AuthenticationRequestParameters(challengeResultCancelled, this), this};
            Object sDKTransactionID = ChallengeResult.getSDKTransactionID(1473484158);
            if (sDKTransactionID == null) {
                sDKTransactionID = ChallengeResult.getDeviceData(View.combineMeasuredStates(0, 0) + 147, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 32, -1950641298, false, null, new Class[]{atd.ae.ChallengeResultCancelled.class, atd.ah.AuthenticationRequestParameters.class, getSDKReferenceNumber.class});
            }
            Object objNewInstance = ((Constructor) sDKTransactionID).newInstance(objArr3);
            AuthenticationRequestParameters = (BuildConfig + 65) % 128;
            return objNewInstance;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }
}
