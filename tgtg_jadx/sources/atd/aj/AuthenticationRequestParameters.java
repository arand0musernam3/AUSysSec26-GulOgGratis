package atd.aj;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.ChallengeResultError;
import atd.bb.completed;
import com.app.tgtg.model.local.AppConstants;
import i4.a;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class AuthenticationRequestParameters {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ AuthenticationRequestParameters[] $VALUES;
    private static int AuthenticationRequestParameters;
    public static final AuthenticationRequestParameters P256;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static long getSDKTransactionID;
    private final String mApiName;
    private final ECParameterSpec mECParameterSpec;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public interface getSDKReferenceNumber {
        ECParameterSpec getSDKTransactionID();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r5, int r6, byte r7) {
        /*
            int r5 = r5 * 3
            int r0 = r5 + 1
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r7 = 99 - r7
            byte[] r1 = atd.aj.AuthenticationRequestParameters.$$a
            byte[] r0 = new byte[r0]
            r2 = -1
            if (r1 != 0) goto L15
            r3 = r2
            r2 = r1
            r1 = r6
            goto L2f
        L15:
            r4 = r7
            r7 = r6
            r6 = r4
        L18:
            int r2 = r2 + 1
            byte r3 = (byte) r6
            r0[r2] = r3
            int r7 = r7 + 1
            if (r2 != r5) goto L28
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            return r5
        L28:
            r3 = r1[r7]
            r4 = r1
            r1 = r7
            r7 = r3
            r3 = r2
            r2 = r4
        L2f:
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r1
            r1 = r2
            r2 = r3
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aj.AuthenticationRequestParameters.$$c(int, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        getSDKReferenceNumber = 1;
        getSDKAppID = 0;
        AuthenticationRequestParameters = 1;
        getSDKReferenceNumber();
        Object[] objArr = new Object[1];
        a("뛒בּⶵ帷", 19840 - TextUtils.lastIndexOf("", '0'), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("뛒퀖篂芜ⱐ", TextUtils.lastIndexOf("", '0', 0, 0) + 26298, objArr2);
        P256 = new AuthenticationRequestParameters(strIntern, ((String) objArr2[0]).intern(), new getSDKReferenceNumber() { // from class: atd.aj.AuthenticationRequestParameters.AuthenticationRequestParameters
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10;
            private static int $11;
            private static int AuthenticationRequestParameters;
            private static long getDeviceData;
            private static char[] getSDKReferenceNumber;
            private static int getSDKTransactionID;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String $$e(short r7, short r8, short r9) {
                /*
                    int r8 = r8 + 107
                    int r7 = r7 * 2
                    int r7 = 3 - r7
                    byte[] r0 = atd.aj.AuthenticationRequestParameters.C0000AuthenticationRequestParameters.$$c
                    int r9 = r9 * 3
                    int r9 = 1 - r9
                    byte[] r1 = new byte[r9]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r8
                    r5 = r2
                    r8 = r7
                    goto L2a
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r8
                    int r7 = r7 + 1
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r9) goto L25
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L25:
                    r3 = r0[r7]
                    r6 = r8
                    r8 = r7
                    r7 = r6
                L2a:
                    int r7 = r7 + r3
                    r3 = r8
                    r8 = r7
                    r7 = r3
                    r3 = r5
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: atd.aj.AuthenticationRequestParameters.C0000AuthenticationRequestParameters.$$e(short, short, short):java.lang.String");
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                init$0();
                getSDKTransactionID = 0;
                AuthenticationRequestParameters = 1;
                getDeviceData = 1708393606321165345L;
                getSDKReferenceNumber = new char[]{63380, 63411, 63414, 63419, 63410, 63413, 63412, 63411, 63412, 63412, 63422, 63413, 63412, 63420, 63420, 63418, 63409, 63408, 63410, 63437, 63435, 63410, 63410, 63410, 63418, 63419, 63413, 63413, 63419, 63421, 63412, 63411, 63419, 63416, 63420, 63422, 63418, 63410, 63409, 63419, 63422, 63412, 63435, 63436, 63413, 63420, 63413, 63415, 63412, 63410, 63413, 63414, 63421, 63417, 63417, 63419, 63411, 63409, 63415, 63415, 63410, 63413, 63418, 63416, 63381, 63410, 63412, 63420, 63410, 63435, 63411, 63418, 63418, 63416, 63420, 63421, 63418, 63411, 63437, 63437, 63435, 63435, 63435, 63410, 63420, 63421, 63413, 63411, 63417, 63417, 63419, 63420, 63411, 63435, 63437, 63413, 63419, 63420, 63412, 63408, 63408, 63412, 63414, 63410, 63411, 63413, 63412, 63436, 63409, 63409, 63434, 63409, 63410, 63410, 63408, 63409, 63411, 63414, 63412, 63434, 63411, 63412, 63412, 63420, 63420, 63411, 63434, 63410, 63383, 63420, 63418, 63420, 63421, 63419, 63411, 63435, 63411, 63413, 63437, 63437, 63409, 63410, 63413, 63411, 63410, 63417, 63409, 63408, 63415, 63419, 63419, 63411, 63437, 63437, 63438, 63436, 63409, 63410, 63435, 63437, 63435, 63433, 63433, 63433, 63433, 63433, 63433, 63433, 63433, 63433, 63433, 63433, 63433, 63433, 63433, 63433, 63412, 63423, 63423, 63423, 63423, 63423, 63423, 63423, 63412, 63433, 63433, 63433, 63433, 63433, 63433, 63433, 63453, 63274, 63277, 63248, 63274, 63273, 63270, 63265, 63235, 63240, 63277, 63278, 63270, 63395};
            }

            private static void a(String str, int i11, Object[] objArr3) throws Throwable {
                char[] charArray;
                if (str != null) {
                    charArray = str.toCharArray();
                    $10 = ($11 + 83) % 128;
                } else {
                    charArray = str;
                }
                completed completedVar = new completed();
                char[] sDKTransactionID = completed.getSDKTransactionID(getDeviceData ^ 2436480605514729170L, charArray, i11);
                completedVar.getSDKTransactionID = 4;
                while (true) {
                    int i12 = completedVar.getSDKTransactionID;
                    if (i12 >= sDKTransactionID.length) {
                        objArr3[0] = new String(sDKTransactionID, 4, sDKTransactionID.length - 4);
                        return;
                    }
                    $11 = ($10 + 1) % 128;
                    int i13 = i12 - 4;
                    completedVar.getSDKAppID = i13;
                    try {
                        Object[] objArr4 = {Long.valueOf(sDKTransactionID[i12] ^ sDKTransactionID[i12 % 4]), Long.valueOf(i13), Long.valueOf(getDeviceData)};
                        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(2011691457);
                        if (sDKTransactionID2 == null) {
                            int iResolveSize = 2774 - View.resolveSize(0, 0);
                            char gidForName = (char) (13059 - Process.getGidForName(""));
                            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 25;
                            byte b8 = (byte) 0;
                            String str$$e = $$e(b8, (byte) (b8 | 13), b8);
                            Class cls = Long.TYPE;
                            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(iResolveSize, gidForName, scrollBarFadeDuration, -1416626223, false, str$$e, new Class[]{cls, cls, cls});
                        }
                        sDKTransactionID[i12] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr4)).charValue();
                        Object[] objArr5 = {completedVar, completedVar};
                        Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-721583866);
                        if (sDKTransactionID3 == null) {
                            sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(View.getDefaultSize(0, 0) + 408, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (Process.myTid() >> 22) + 30, 144017174, false, "y", new Class[]{Object.class, Object.class});
                        }
                        ((Method) sDKTransactionID3).invoke(null, objArr5);
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
            }

            private static void b(String str, boolean z11, int[] iArr, Object[] objArr3) throws Throwable {
                int i11;
                int i12;
                byte[] bArr;
                int i13;
                String str2 = str;
                Object bytes = str2;
                if (str2 != null) {
                    bytes = str2.getBytes(LocalizedMessage.DEFAULT_ENCODING);
                }
                byte[] bArr2 = (byte[]) bytes;
                ChallengeResultError challengeResultError = new ChallengeResultError();
                int i14 = iArr[0];
                int i15 = iArr[1];
                int i16 = iArr[2];
                int i17 = iArr[3];
                char[] cArr = getSDKReferenceNumber;
                char c3 = '0';
                Class cls = Integer.TYPE;
                if (cArr != null) {
                    int length = cArr.length;
                    i11 = 2;
                    char[] cArr2 = new char[length];
                    int i18 = 0;
                    while (i18 < length) {
                        int i19 = $10 + 5;
                        $11 = i19 % 128;
                        if (i19 % 2 == 0) {
                            try {
                                Object[] objArr4 = {Integer.valueOf(cArr[i18])};
                                Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(754517312);
                                if (sDKTransactionID == null) {
                                    bArr = bArr2;
                                    byte b8 = (byte) 0;
                                    byte b11 = b8;
                                    i13 = i18;
                                    sDKTransactionID = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2942, (char) ((-1) - TextUtils.lastIndexOf("", c3, 0, 0)), TextUtils.indexOf("", "", 0, 0) + 37, -258931888, false, $$e(b8, b11, b11), new Class[]{cls});
                                } else {
                                    bArr = bArr2;
                                    i13 = i18;
                                }
                                cArr2[i13] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr4)).charValue();
                                i18 = i13 - 1;
                            } catch (Throwable th2) {
                                Throwable cause = th2.getCause();
                                if (cause == null) {
                                    throw th2;
                                }
                                throw cause;
                            }
                        } else {
                            bArr = bArr2;
                            int i21 = i18;
                            Object[] objArr5 = {Integer.valueOf(cArr[i21])};
                            Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(754517312);
                            if (sDKTransactionID2 == null) {
                                byte b12 = (byte) 0;
                                byte b13 = b12;
                                sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(MotionEvent.axisFromString("") + 2944, (char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 37, -258931888, false, $$e(b12, b13, b13), new Class[]{cls});
                            }
                            cArr2[i21] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr5)).charValue();
                            i18 = i21 + 1;
                        }
                        bArr2 = bArr;
                        c3 = '0';
                    }
                    cArr = cArr2;
                } else {
                    i11 = 2;
                }
                byte[] bArr3 = bArr2;
                char[] cArr3 = new char[i15];
                System.arraycopy(cArr, i14, cArr3, 0, i15);
                if (bArr3 != null) {
                    char[] cArr4 = new char[i15];
                    challengeResultError.AuthenticationRequestParameters = 0;
                    char c7 = 0;
                    while (true) {
                        int i22 = challengeResultError.AuthenticationRequestParameters;
                        if (i22 >= i15) {
                            break;
                        }
                        if (bArr3[i22] == 1) {
                            char c8 = cArr3[i22];
                            Object[] objArr6 = new Object[i11];
                            objArr6[1] = Integer.valueOf(c7);
                            objArr6[0] = Integer.valueOf(c8);
                            Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(788825057);
                            if (sDKTransactionID3 == null) {
                                byte b14 = (byte) 0;
                                byte b15 = (byte) (b14 + 1);
                                sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(3095 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (14366 - ((byte) KeyEvent.getModifierMetaStateMask())), 17 - TextUtils.indexOf((CharSequence) "", '0'), -210991631, false, $$e(b14, b15, (byte) (b15 - 1)), new Class[]{cls, cls});
                            }
                            cArr4[i22] = ((Character) ((Method) sDKTransactionID3).invoke(null, objArr6)).charValue();
                        } else {
                            Object[] objArr7 = {Integer.valueOf(cArr3[i22]), Integer.valueOf(c7)};
                            Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(-565071239);
                            if (sDKTransactionID4 == null) {
                                byte b16 = (byte) 0;
                                byte b17 = (byte) (b16 + 3);
                                sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(2774 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (13060 - (ViewConfiguration.getTouchSlop() >> 8)), 25 - TextUtils.getCapsMode("", 0, 0), 37336169, false, $$e(b16, b17, (byte) (b17 - 3)), new Class[]{cls, cls});
                            }
                            cArr4[i22] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr7)).charValue();
                            $10 = ($11 + 115) % 128;
                        }
                        c7 = cArr4[challengeResultError.AuthenticationRequestParameters];
                        Object[] objArr8 = {challengeResultError, challengeResultError};
                        Object sDKTransactionID5 = atd.e.ChallengeResult.getSDKTransactionID(2107237619);
                        if (sDKTransactionID5 == null) {
                            sDKTransactionID5 = atd.e.ChallengeResult.getDeviceData(2278 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (65521 - TextUtils.lastIndexOf("", '0', 0, 0)), 34 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1577983261, false, "m", new Class[]{Object.class, Object.class});
                        }
                        ((Method) sDKTransactionID5).invoke(null, objArr8);
                        i11 = 2;
                    }
                    cArr3 = cArr4;
                }
                if (i17 > 0) {
                    int i23 = $10 + 85;
                    $11 = i23 % 128;
                    if (i23 % 2 == 0) {
                        char[] cArr5 = new char[i15];
                        System.arraycopy(cArr3, 1, cArr5, 1, i15);
                        System.arraycopy(cArr5, 1, cArr3, i15 >> i17, i17);
                        i12 = 0;
                        System.arraycopy(cArr5, i17, cArr3, 0, i15 << i17);
                    } else {
                        i12 = 0;
                        char[] cArr6 = new char[i15];
                        System.arraycopy(cArr3, 0, cArr6, 0, i15);
                        int i24 = i15 - i17;
                        System.arraycopy(cArr6, 0, cArr3, i24, i17);
                        System.arraycopy(cArr6, i17, cArr3, 0, i24);
                    }
                } else {
                    i12 = 0;
                }
                if (z11) {
                    char[] cArr7 = new char[i15];
                    challengeResultError.AuthenticationRequestParameters = i12;
                    while (true) {
                        int i25 = challengeResultError.AuthenticationRequestParameters;
                        if (i25 >= i15) {
                            break;
                        }
                        cArr7[i25] = cArr3[(i15 - i25) - 1];
                        challengeResultError.AuthenticationRequestParameters = i25 + 1;
                    }
                    cArr3 = cArr7;
                }
                if (i16 > 0) {
                    challengeResultError.AuthenticationRequestParameters = 0;
                    while (true) {
                        int i26 = challengeResultError.AuthenticationRequestParameters;
                        if (i26 >= i15) {
                            break;
                        }
                        cArr3[i26] = (char) (cArr3[i26] - iArr[2]);
                        challengeResultError.AuthenticationRequestParameters = i26 + 1;
                    }
                }
                objArr3[0] = new String(cArr3);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0022). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static void c(byte r6, short r7, byte r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = atd.aj.AuthenticationRequestParameters.C0000AuthenticationRequestParameters.$$a
                    int r6 = r6 + 4
                    int r8 = 19 - r8
                    int r7 = r7 + 101
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L10
                    r3 = r8
                    r5 = r2
                    goto L22
                L10:
                    r3 = r2
                L11:
                    byte r4 = (byte) r7
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r8) goto L20
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L20:
                    r3 = r0[r6]
                L22:
                    int r3 = -r3
                    int r6 = r6 + 1
                    int r7 = r7 + r3
                    int r7 = r7 + (-2)
                    r3 = r5
                    goto L11
                */
                throw new UnsupportedOperationException("Method not decompiled: atd.aj.AuthenticationRequestParameters.C0000AuthenticationRequestParameters.c(byte, short, byte, java.lang.Object[]):void");
            }

            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] getSDKTransactionID(android.content.Context r28, int r29, int r30, int r31) {
                /*
                    Method dump skipped, instruction units count: 1520
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: atd.aj.AuthenticationRequestParameters.C0000AuthenticationRequestParameters.getSDKTransactionID(android.content.Context, int, int, int):java.lang.Object[]");
            }

            public static void init$0() {
                $$a = new byte[]{106, -60, 87, -65, 0, -17, 31, 13, -9, 8, -49, -2, 37, 3, 0, -17, 31, 13, -9, -11, -32, 15, -15, -7, 16, -4, -19, 9, -8, -1, 35, 3, -3, 3, -3, 50};
                $$b = 133;
            }

            public static void init$1() {
                $$c = new byte[]{29, 9, 51, -111};
                $$d = 22;
            }

            @Override // atd.aj.AuthenticationRequestParameters.getSDKReferenceNumber
            public final ECParameterSpec getSDKTransactionID() throws Throwable {
                Object[] objArr3 = new Object[1];
                a("켽屉콻軼\uf5f2뽠偒쟿蒷䊰І箃墕㛲좼꼡Ⱪ\uea2e粈\ue36c\ue03d幚⃔\u1759뗱ᆖ픠䲅\u09c5엂饬胱\udd99맾䶸㐽酭洪\uf184桩攡Ⅶꗐ鱕㪃铤湪퇷躿䢸ሞֻ䋫㲌웂륏ᘧ\uf040諶\ued13\uea53ꐔ㺺℧뾏Ῠ\ue36e囫", 1 - Drawable.resolveOpacity(0, 0), objArr3);
                ECFieldFp eCFieldFp = new ECFieldFp(new BigInteger(((String) objArr3[0]).intern(), 16));
                Object[] objArr4 = new Object[1];
                a("㑗\ueeb6㐑㰃\u208f饼蔯\ue1e3翝\uf04f텻嶟ꏿ萍᷁褽휃壑꧵앰᭗\ueca5\uf5a9ㅅ些ꍩ]檙\uf2af眽䰑ꛭ⛳ଁ飅ሡ樇\udfd5⓹乵鹋鎙炭멉쇩☛묗\uf7eb痕漢읣⎧릁蹳Ꮏ齓\ued4d䊿律쬏ᄹ᛫\uebc7ܻ䓥괗㘓烲", KeyEvent.normalizeMetaState(0) + 1, objArr4);
                BigInteger bigInteger = new BigInteger(((String) objArr4[0]).intern(), 16);
                Object[] objArr5 = new Object[1];
                a("垩\uddef垜ཝ\ud9e4\uef60籁鞏᱖썥⠒⯽쁰뜥\ue4a9ｐ듴残僫덪磛\udfffಷ䜫ⴗ遄盧ᲀ酖䑢땳탹䔅㡞懜摎\u09ff\uec89\udd93㠝ﶵꃆ覴챕ꈒᕇ䈏膂ᘯ쥨㸈嗋\uda0a봮\uead1\ue94c軆燣ꚕ봐犳◃ኮ煓❫鸸켊ۯ", 1 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr5);
                BigInteger bigInteger2 = new BigInteger(((String) objArr5[0]).intern(), 16);
                Object[] objArr6 = new Object[1];
                a("偤⧉倧\ufb0e杲ᓕ슭汈ᮛ㝀雰큈쟄䍴婉ғ댰龪\uee01䣛罢⮫뉒볪⪯搞䟕\ue731隝끁\u0be5⬰䋂챸\udf4a龏\u0e3c\u18ab挍쎪奔咓㝙㟠", KeyEvent.keyCodeFromString("") + 1, objArr6);
                EllipticCurve ellipticCurve = new EllipticCurve(eCFieldFp, bigInteger, bigInteger2, new BigInteger(((String) objArr6[0]).intern(), 16).toByteArray());
                Object[] objArr7 = new Object[1];
                b("\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", false, new int[]{0, 64, 0, 0}, objArr7);
                BigInteger bigInteger3 = new BigInteger(((String) objArr7[0]).intern(), 16);
                Object[] objArr8 = new Object[1];
                b("\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000", true, new int[]{64, 64, 0, 0}, objArr8);
                BigInteger bigInteger4 = new BigInteger(((String) objArr8[0]).intern(), 16);
                Object[] objArr9 = new Object[1];
                b("\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", true, new int[]{128, 64, 0, 0}, objArr9);
                ECParameterSpec eCParameterSpec = new ECParameterSpec(ellipticCurve, new ECPoint(bigInteger3, bigInteger4), new BigInteger(((String) objArr9[0]).intern(), 16), 1);
                int i11 = getSDKTransactionID + 59;
                AuthenticationRequestParameters = i11 % 128;
                if (i11 % 2 != 0) {
                    return eCParameterSpec;
                }
                throw null;
            }
        });
        $VALUES = getDeviceData();
        getDeviceData = (getSDKReferenceNumber + 121) % 128;
    }

    private AuthenticationRequestParameters(String str, String str2, getSDKReferenceNumber getsdkreferencenumber) {
        this.mApiName = str2;
        this.mECParameterSpec = getsdkreferencenumber.getSDKTransactionID();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.lang.String r29, int r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aj.AuthenticationRequestParameters.a(java.lang.String, int, java.lang.Object[]):void");
    }

    private static /* synthetic */ AuthenticationRequestParameters[] getDeviceData() {
        int i11 = (AuthenticationRequestParameters + 51) % 128;
        getSDKAppID = i11;
        AuthenticationRequestParameters[] authenticationRequestParametersArr = {P256};
        int i12 = i11 + 121;
        AuthenticationRequestParameters = i12 % 128;
        if (i12 % 2 != 0) {
            return authenticationRequestParametersArr;
        }
        throw null;
    }

    public static AuthenticationRequestParameters getSDKReferenceNumber(String str) {
        AuthenticationRequestParameters = (getSDKAppID + 119) % 128;
        for (AuthenticationRequestParameters authenticationRequestParameters : values()) {
            AuthenticationRequestParameters = (getSDKAppID + 121) % 128;
            if (authenticationRequestParameters.mApiName.equals(str)) {
                return authenticationRequestParameters;
            }
        }
        Object[] objArr = new Object[1];
        a("뛗瞟㐗\uf2ae댾燍㹟ﳕ뵮篬㢘肋ꞅ搠⊺\ue349ꇗ渏", 49523 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
        a.f(((String) objArr[0]).intern());
        return null;
    }

    public static void init$0() {
        $$a = new byte[]{45, 58, -109, -84};
        $$b = 214;
    }

    public static AuthenticationRequestParameters valueOf(String str) {
        int i11 = AuthenticationRequestParameters + 39;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            Enum.valueOf(AuthenticationRequestParameters.class, str);
            throw null;
        }
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) Enum.valueOf(AuthenticationRequestParameters.class, str);
        getSDKAppID = (AuthenticationRequestParameters + 85) % 128;
        return authenticationRequestParameters;
    }

    public static AuthenticationRequestParameters[] values() {
        getSDKAppID = (AuthenticationRequestParameters + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
        AuthenticationRequestParameters[] authenticationRequestParametersArr = (AuthenticationRequestParameters[]) $VALUES.clone();
        int i11 = getSDKAppID + 85;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            return authenticationRequestParametersArr;
        }
        throw null;
    }

    public final String getSDKAppID() {
        int i11 = AuthenticationRequestParameters + 55;
        getSDKAppID = i11 % 128;
        int i12 = i11 % 2;
        String str = this.mApiName;
        if (i12 == 0) {
            return str;
        }
        throw null;
    }

    public final ECParameterSpec getSDKTransactionID() {
        int i11 = getSDKAppID;
        int i12 = i11 + 53;
        AuthenticationRequestParameters = i12 % 128;
        int i13 = i12 % 2;
        ECParameterSpec eCParameterSpec = this.mECParameterSpec;
        if (i13 == 0) {
            throw null;
        }
        AuthenticationRequestParameters = (i11 + 31) % 128;
        return eCParameterSpec;
    }

    public static void getSDKReferenceNumber() {
        getSDKTransactionID = -6656892135977799830L;
    }
}
