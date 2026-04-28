package atd.z;

import android.app.Application;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/FiveGhzBandWifiFeatureSupport;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiFeatureSupport;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "isSupported", "", "()Ljava/lang/Boolean;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKTransactionID implements getTransactionID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10;
    private static int $11;
    private static long AuthenticationRequestParameters;
    private static int ChallengeResultCancelled;
    private static char getDeviceData;
    private static char getMessageVersion;
    private static int getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static char[] getSDKReferenceNumber;

    @NotNull
    private final Application getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(int r5, int r6, short r7) {
        /*
            int r5 = r5 + 4
            int r6 = r6 * 3
            int r0 = 1 - r6
            int r7 = r7 + 65
            byte[] r1 = atd.z.getSDKTransactionID.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L20:
            int r5 = r5 + 1
            int r3 = r3 + 1
            r4 = r1[r5]
        L26:
            int r4 = -r4
            int r7 = r7 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.z.getSDKTransactionID.$$e(int, int, short):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        ChallengeResultCancelled = 0;
        getSDKEphemeralPublicKey = 1;
        AuthenticationRequestParameters = 7947593148309753643L;
        getSDKAppID = -2038612665;
        getDeviceData = (char) 15687;
        getSDKReferenceNumber = new char[]{30884, 30873, 30901, 30848, 30885, 30850, 30902, 30893, 30895, 30881, 30898, 30889, 30953, 30890, 30883, 30888, 30886, 30967, 30911, 30887, 30897, 30882, 30900, 30899, 30880};
        getMessageVersion = (char) 19801;
    }

    public getSDKTransactionID(@NotNull Application application) {
        application.getClass();
        this.getSDKTransactionID = application;
    }

    private static void a(String str, String str2, String str3, int i11, char c3, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        int i13;
        int i14;
        long j9;
        char[] cArr;
        char c7;
        $11 = ($10 + 113) % 128;
        char[] charArray2 = str3 != null ? str3.toCharArray() : str3;
        if (str2 != null) {
            $10 = ($11 + 27) % 128;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr2 = charArray;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        atd.bb.onCompletion oncompletion = new atd.bb.onCompletion();
        int length = cArr2.length;
        char[] cArr3 = new char[length];
        int length2 = charArray3.length;
        char[] cArr4 = new char[length2];
        int i15 = 0;
        System.arraycopy(cArr2, 0, cArr3, 0, length);
        System.arraycopy(charArray3, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c3);
        int i16 = 2;
        cArr4[2] = (char) (cArr4[2] + ((char) i11));
        int length3 = charArray2.length;
        char[] cArr5 = new char[length3];
        oncompletion.getDeviceData = 0;
        while (oncompletion.getDeviceData < length3) {
            $11 = ($10 + 69) % 128;
            try {
                Object[] objArr2 = {oncompletion};
                Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(874886523);
                if (sDKTransactionID == null) {
                    int capsMode = TextUtils.getCapsMode("", i15, i15) + 2069;
                    char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 44657);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i15) + 33;
                    byte b8 = (byte) (-1);
                    i13 = i15;
                    byte b11 = (byte) (b8 + 1);
                    i12 = i16;
                    sDKTransactionID = atd.e.ChallengeResult.getDeviceData(capsMode, touchSlop, iIndexOf, -397560981, false, $$e(b8, b11, (byte) (b11 | 52)), new Class[]{Object.class});
                } else {
                    i12 = i16;
                    i13 = i15;
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {oncompletion};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(1806403515);
                if (sDKTransactionID2 == null) {
                    j9 = 0;
                    byte b12 = (byte) (-1);
                    byte b13 = (byte) (b12 + 1);
                    i14 = -1;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(3096 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 14367), 18 - View.MeasureSpec.getSize(i13), -1211924053, false, $$e(b12, b13, (byte) (b13 | 53)), new Class[]{Object.class});
                } else {
                    i14 = -1;
                    j9 = 0;
                }
                int iIntValue2 = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                int i17 = cArr3[oncompletion.getDeviceData % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i12] = Integer.valueOf(cArr4[iIntValue]);
                objArr4[1] = Integer.valueOf(i17);
                objArr4[i13] = oncompletion;
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1695612280);
                Class cls = Integer.TYPE;
                if (sDKTransactionID3 == null) {
                    c7 = 1;
                    byte b14 = (byte) i14;
                    byte b15 = (byte) (b14 + 1);
                    cArr = charArray2;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(Color.blue(i13) + 1428, (char) ((-1) - Process.getGidForName("")), (ViewConfiguration.getTouchSlop() >> 8) + 30, -1183253656, false, $$e(b14, b15, (byte) (b15 | 54)), new Class[]{Object.class, cls, cls});
                } else {
                    cArr = charArray2;
                    c7 = 1;
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                int i18 = cArr3[iIntValue2] * 32718;
                char c8 = cArr4[iIntValue];
                int i19 = i12;
                Object[] objArr5 = new Object[i19];
                objArr5[c7] = Integer.valueOf(c8);
                objArr5[i13] = Integer.valueOf(i18);
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(814479823);
                if (sDKTransactionID4 == null) {
                    int i21 = i13;
                    byte b16 = (byte) (-1);
                    byte b17 = (byte) (b16 + 1);
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(2774 - TextUtils.getOffsetBefore("", i21), (char) (13060 - TextUtils.getCapsMode("", i21, i21)), 26 - (SystemClock.elapsedRealtime() > j9 ? 1 : (SystemClock.elapsedRealtime() == j9 ? 0 : -1)), -320602145, false, $$e(b16, b17, (byte) (b17 + 3)), new Class[]{cls, cls});
                }
                cArr4[iIntValue2] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                cArr3[iIntValue2] = oncompletion.AuthenticationRequestParameters;
                int i22 = oncompletion.getDeviceData;
                cArr5[i22] = (char) (((((long) (r0 ^ cArr[i22])) ^ (AuthenticationRequestParameters ^ 1905653906042338631L)) ^ ((long) ((int) (((long) getSDKAppID) ^ 1905653906042338631L)))) ^ ((long) ((char) (((long) getDeviceData) ^ 1905653906042338631L))));
                oncompletion.getDeviceData = i22 + 1;
                i16 = i19;
                charArray2 = cArr;
                i15 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr5);
    }

    private static void b(int i11, byte b8, String str, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        int i13;
        int i14;
        char c3;
        char c7;
        char c8;
        int i15;
        char c11;
        int i16;
        long j9;
        int i17 = $10 + 99;
        $11 = i17 % 128;
        char c12 = 2;
        if (i17 % 2 == 0) {
            throw null;
        }
        if (str != null) {
            charArray = str.toCharArray();
            $10 = ($11 + 77) % 128;
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        atd.bb.ChallengeResultKt challengeResultKt = new atd.bb.ChallengeResultKt();
        char[] cArr2 = getSDKReferenceNumber;
        Class cls = Integer.TYPE;
        int i18 = -317146529;
        long j11 = 0;
        int i19 = -1;
        int i21 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i22 = 0;
            while (i22 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i22])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(i18);
                    if (sDKTransactionID == null) {
                        c11 = c12;
                        i16 = i18;
                        j9 = j11;
                        byte b11 = (byte) i19;
                        byte b12 = (byte) (b11 + 1);
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData((SystemClock.uptimeMillis() > j11 ? 1 : (SystemClock.uptimeMillis() == j11 ? 0 : -1)) + 2157, (char) ((SystemClock.uptimeMillis() > j11 ? 1 : (SystemClock.uptimeMillis() == j11 ? 0 : -1)) - 1), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 36, 829471823, false, $$e(b11, b12, b12), new Class[]{cls});
                    } else {
                        c11 = c12;
                        i16 = i18;
                        j9 = j11;
                    }
                    cArr3[i22] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i22++;
                    i18 = i16;
                    c12 = c11;
                    j11 = j9;
                    i19 = -1;
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
        char c13 = c12;
        int i23 = i18;
        long j12 = j11;
        Object[] objArr3 = {Integer.valueOf(getMessageVersion)};
        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i23);
        if (sDKTransactionID2 == null) {
            byte b13 = (byte) (-1);
            byte b14 = (byte) (b13 + 1);
            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(ExpandableListView.getPackedPositionChild(j12) + 2159, (char) TextUtils.getOffsetBefore("", 0), 36 - KeyEvent.getDeadChar(0, 0), 829471823, false, $$e(b13, b14, b14), new Class[]{cls});
        }
        char cCharValue = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i11];
        if (i11 % 2 != 0) {
            i12 = i11 - 1;
            cArr4[i12] = (char) (cArr[i12] - b8);
        } else {
            i12 = i11;
        }
        int i24 = 1;
        if (i12 > 1) {
            challengeResultKt.getSDKReferenceNumber = 0;
            while (true) {
                int i25 = challengeResultKt.getSDKReferenceNumber;
                if (i25 >= i12) {
                    break;
                }
                char c14 = cArr[i25];
                challengeResultKt.getDeviceData = c14;
                char c15 = cArr[i25 + 1];
                challengeResultKt.getSDKAppID = c15;
                if (c14 == c15) {
                    cArr4[i25] = (char) (c14 - b8);
                    cArr4[i25 + 1] = (char) (c15 - b8);
                    i15 = i24;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = challengeResultKt;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = challengeResultKt;
                    objArr4[9] = challengeResultKt;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = challengeResultKt;
                    objArr4[6] = challengeResultKt;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = challengeResultKt;
                    objArr4[3] = challengeResultKt;
                    objArr4[c13] = Integer.valueOf(cCharValue);
                    objArr4[i24] = challengeResultKt;
                    objArr4[i21] = challengeResultKt;
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(835518319);
                    if (sDKTransactionID3 == null) {
                        c3 = '\n';
                        int iKeyCodeFromString = 1258 - KeyEvent.keyCodeFromString("");
                        c7 = '\t';
                        char cIndexOf = (char) (34414 - TextUtils.indexOf("", "", i21, i21));
                        int packedPositionGroup = 41 - ExpandableListView.getPackedPositionGroup(j12);
                        i13 = i24;
                        c8 = 7;
                        byte b15 = (byte) (-1);
                        byte b16 = (byte) (b15 + 1);
                        i14 = i21;
                        String str$$e = $$e(b15, b16, (byte) (b16 + 2));
                        Class cls2 = Integer.TYPE;
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(iKeyCodeFromString, cIndexOf, packedPositionGroup, -307955329, false, str$$e, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                    } else {
                        i13 = i24;
                        i14 = i21;
                        c3 = '\n';
                        c7 = '\t';
                        c8 = 7;
                    }
                    int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                    int i26 = challengeResultKt.ChallengeResultCancelled;
                    if (iIntValue == i26) {
                        $10 = ($11 + 77) % 128;
                        Object[] objArr5 = new Object[11];
                        objArr5[c3] = challengeResultKt;
                        objArr5[c7] = Integer.valueOf(cCharValue);
                        objArr5[8] = challengeResultKt;
                        objArr5[c8] = Integer.valueOf(cCharValue);
                        objArr5[6] = Integer.valueOf(cCharValue);
                        objArr5[5] = challengeResultKt;
                        objArr5[4] = challengeResultKt;
                        objArr5[3] = Integer.valueOf(cCharValue);
                        objArr5[c13] = Integer.valueOf(cCharValue);
                        objArr5[i13] = challengeResultKt;
                        objArr5[i14] = challengeResultKt;
                        Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(-758961112);
                        if (sDKTransactionID4 == null) {
                            int i27 = i14;
                            int iRgb = (-16774993) - Color.rgb(i27, i27, i27);
                            char c16 = (char) (53071 - (ViewConfiguration.getZoomControlsTimeout() > j12 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j12 ? 0 : -1)));
                            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 21;
                            byte b17 = (byte) (-1);
                            byte b18 = (byte) (b17 + 1);
                            String str$$e2 = $$e(b17, b18, (byte) (b18 | 57));
                            Class cls3 = Integer.TYPE;
                            sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(iRgb, c16, doubleTapTimeout, 246098488, false, str$$e2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                        int i28 = (challengeResultKt.getSDKTransactionID * cCharValue) + challengeResultKt.ChallengeResultCancelled;
                        int i29 = challengeResultKt.getSDKReferenceNumber;
                        cArr4[i29] = cArr2[iIntValue2];
                        cArr4[i29 + 1] = cArr2[i28];
                        i15 = i13;
                    } else {
                        int i31 = challengeResultKt.AuthenticationRequestParameters;
                        int i32 = challengeResultKt.getSDKTransactionID;
                        int i33 = challengeResultKt.getMessageVersion;
                        if (i31 == i32) {
                            i15 = i13;
                            int iC = k.c(i33, cCharValue, i15, cCharValue);
                            challengeResultKt.getMessageVersion = iC;
                            int iC2 = k.c(i26, cCharValue, i15, cCharValue);
                            challengeResultKt.ChallengeResultCancelled = iC2;
                            int i34 = (i32 * cCharValue) + iC2;
                            int i35 = challengeResultKt.getSDKReferenceNumber;
                            cArr4[i35] = cArr2[(i31 * cCharValue) + iC];
                            cArr4[i35 + i15] = cArr2[i34];
                        } else {
                            i15 = i13;
                            int i36 = (i31 * cCharValue) + i26;
                            int i37 = challengeResultKt.getSDKReferenceNumber;
                            cArr4[i37] = cArr2[i36];
                            cArr4[i37 + i15] = cArr2[(i32 * cCharValue) + i33];
                        }
                    }
                }
                challengeResultKt.getSDKReferenceNumber += 2;
                i24 = i15;
                i21 = 0;
            }
        }
        for (int i38 = 0; i38 < i11; i38++) {
            cArr4[i38] = (char) (cArr4[i38] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r0 = r6 + 4
            int r8 = r8 * 2
            int r8 = r8 + 4
            byte[] r1 = atd.z.getSDKTransactionID.$$a
            int r7 = r7 * 3
            int r7 = 104 - r7
            byte[] r0 = new byte[r0]
            int r6 = r6 + 3
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r1
            r4 = r2
            r1 = r8
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r1
            r1 = r8
            r8 = r4
            r4 = r3
            r3 = r5
        L30:
            int r7 = r7 + r8
            int r7 = r7 + (-2)
            int r8 = r1 + 1
            r1 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.z.getSDKTransactionID.c(short, int, byte, java.lang.Object[]):void");
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] getDeviceData(int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 1470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.z.getSDKTransactionID.getDeviceData(int, int):java.lang.Object[]");
    }

    public static void init$0() {
        $$a = new byte[]{11, -110, -81, 44, 3, -3, 3};
        $$b = BERTags.PRIVATE;
    }

    public static void init$1() {
        $$c = new byte[]{72, -76, 14, -8};
        $$d = 156;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0066 A[PHI: r0
      0x0066: PHI (r0v9 java.lang.Object) = (r0v8 java.lang.Object), (r0v21 java.lang.Object) binds: [B:8:0x0064, B:5:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // atd.z.getTransactionID
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean getDeviceData() throws java.lang.Throwable {
        /*
            r13 = this;
            int r0 = atd.z.getSDKTransactionID.ChallengeResultCancelled
            int r0 = r0 + 43
            int r1 = r0 % 128
            atd.z.getSDKTransactionID.getSDKEphemeralPublicKey = r1
            int r0 = r0 % 2
            android.app.Application r1 = r13.getSDKTransactionID
            r2 = 0
            r3 = 1
            r4 = 39991(0x9c37, float:5.604E-41)
            java.lang.String r5 = ""
            r6 = 0
            if (r0 != 0) goto L3f
            int r10 = android.text.TextUtils.getTrimmedLength(r5)
            int r0 = android.os.Process.myTid()
            int r0 = r0 >> 5
            int r0 = r4 >> r0
            char r11 = (char) r0
            java.lang.Object[] r12 = new java.lang.Object[r3]
            java.lang.String r7 = "\uf26c븩믽琹"
            java.lang.String r8 = "툂핀㟡䦜"
            java.lang.String r9 = "\ueeb4᪳⫴겟"
            a(r7, r8, r9, r10, r11, r12)
            r0 = r12[r6]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.Object r0 = r1.getSystemService(r0)
            boolean r1 = r0 instanceof android.net.wifi.WifiManager
            if (r1 == 0) goto L69
            goto L66
        L3f:
            int r10 = android.text.TextUtils.getTrimmedLength(r5)
            int r0 = android.os.Process.myTid()
            int r0 = r0 >> 22
            int r4 = r4 - r0
            char r11 = (char) r4
            java.lang.Object[] r12 = new java.lang.Object[r3]
            java.lang.String r7 = "\uf26c븩믽琹"
            java.lang.String r8 = "툂핀㟡䦜"
            java.lang.String r9 = "\ueeb4᪳⫴겟"
            a(r7, r8, r9, r10, r11, r12)
            r0 = r12[r6]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.Object r0 = r1.getSystemService(r0)
            boolean r1 = r0 instanceof android.net.wifi.WifiManager
            if (r1 == 0) goto L69
        L66:
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0
            goto L6a
        L69:
            r0 = r2
        L6a:
            if (r0 == 0) goto L84
            boolean r0 = r0.is5GHzBandSupported()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            int r1 = atd.z.getSDKTransactionID.getSDKEphemeralPublicKey
            int r1 = r1 + 41
            int r2 = r1 % 128
            atd.z.getSDKTransactionID.ChallengeResultCancelled = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L83
            r1 = 55
            int r1 = r1 / r6
        L83:
            return r0
        L84:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.z.getSDKTransactionID.getDeviceData():java.lang.Boolean");
    }
}
