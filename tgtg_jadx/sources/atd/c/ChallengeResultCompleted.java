package atd.c;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.n.getSDKAppID;
import com.braze.Constants;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import n90.b0;
import n90.e;
import org.bouncycastle.i18n.LocalizedMessage;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ChallengeResultCompleted extends getTransactionStatus {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$k = null;
    private static final int $$l = 0;
    private static int $10;
    private static int $11;
    private static final List<String> AuthenticationRequestParameters;
    private static int BuildConfig;
    public static final Parcelable.Creator<ChallengeResultCompleted> CREATOR;
    private static boolean ChallengeResult;
    private static int ChallengeResultCancelled;
    private static int ChallengeResultCompleted;
    private static int getAdditionalDetails;
    private static char[] getMessageVersion;
    private static boolean getSDKEphemeralPublicKey;
    private static int getTransactionStatus;
    private String getDeviceData;
    private String getSDKAppID;
    private String getSDKReferenceNumber;
    private String getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$m(short r6, byte r7, byte r8) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 111
            int r7 = r7 * 2
            int r0 = 1 - r7
            byte[] r1 = atd.c.ChallengeResultCompleted.$$k
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L1a
            r3 = r1
            r4 = r2
            r1 = r8
            r8 = r6
            goto L30
        L1a:
            r3 = r2
        L1b:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L26:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L30:
            int r6 = -r6
            int r6 = r6 + r1
            int r8 = r8 + 1
            r1 = r8
            r8 = r6
            r6 = r1
            r1 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.c.ChallengeResultCompleted.$$m(short, byte, byte):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        getTransactionStatus = 0;
        ChallengeResultCompleted = 1;
        BuildConfig = 0;
        getAdditionalDetails = 1;
        cancelled();
        CREATOR = new Parcelable.Creator<ChallengeResultCompleted>() { // from class: atd.c.ChallengeResultCompleted.1
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10;
            private static int $11;
            private static int AuthenticationRequestParameters;
            private static char getDeviceData;
            private static int getSDKAppID;
            private static long getSDKReferenceNumber;
            private static int getSDKTransactionID;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String $$e(int r6, short r7, byte r8) {
                /*
                    int r6 = r6 + 68
                    byte[] r0 = atd.c.ChallengeResultCompleted.AnonymousClass1.$$c
                    int r7 = r7 * 3
                    int r1 = 1 - r7
                    int r8 = r8 * 3
                    int r8 = 4 - r8
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r7 = 0 - r7
                    if (r0 != 0) goto L18
                    r3 = r0
                    r4 = r2
                    r0 = r8
                    r8 = r7
                    goto L2e
                L18:
                    r3 = r2
                L19:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    if (r3 != r7) goto L24
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L24:
                    r4 = r0[r8]
                    int r3 = r3 + 1
                    r5 = r8
                    r8 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r0
                    r0 = r5
                L2e:
                    int r6 = -r6
                    int r0 = r0 + 1
                    int r6 = r6 + r8
                    r8 = r0
                    r0 = r3
                    r3 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: atd.c.ChallengeResultCompleted.AnonymousClass1.$$e(int, short, byte):java.lang.String");
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                init$0();
                getSDKAppID = 0;
                getSDKTransactionID = 1;
                getSDKReferenceNumber = 1905653906042338631L;
                AuthenticationRequestParameters = -2038612665;
                getDeviceData = (char) 58924;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static void a(short r6, byte r7, short r8, java.lang.Object[] r9) {
                /*
                    int r6 = r6 * 6
                    int r6 = r6 + 97
                    int r8 = r8 * 15
                    int r0 = 26 - r8
                    int r7 = r7 * 25
                    int r7 = r7 + 4
                    byte[] r1 = atd.c.ChallengeResultCompleted.AnonymousClass1.$$a
                    byte[] r0 = new byte[r0]
                    int r8 = 25 - r8
                    r2 = 0
                    if (r1 != 0) goto L19
                    r6 = r7
                    r4 = r8
                    r3 = r2
                    goto L2e
                L19:
                    r3 = r2
                L1a:
                    byte r4 = (byte) r6
                    r0[r3] = r4
                    if (r3 != r8) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L27:
                    int r3 = r3 + 1
                    r4 = r1[r7]
                    r5 = r7
                    r7 = r6
                    r6 = r5
                L2e:
                    int r7 = r7 + r4
                    int r6 = r6 + 1
                    int r7 = r7 + (-5)
                    r5 = r7
                    r7 = r6
                    r6 = r5
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: atd.c.ChallengeResultCompleted.AnonymousClass1.a(short, byte, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static void b(java.lang.String r23, java.lang.String r24, java.lang.String r25, int r26, char r27, java.lang.Object[] r28) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 566
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: atd.c.ChallengeResultCompleted.AnonymousClass1.b(java.lang.String, java.lang.String, java.lang.String, int, char, java.lang.Object[]):void");
            }

            private static ChallengeResultCompleted getSDKAppID(Parcel parcel) {
                ChallengeResultCompleted challengeResultCompleted = new ChallengeResultCompleted(parcel);
                int i11 = getSDKTransactionID + 107;
                getSDKAppID = i11 % 128;
                if (i11 % 2 == 0) {
                    return challengeResultCompleted;
                }
                throw null;
            }

            public static void getSDKTransactionID(long j9, long j11) throws Throwable {
                byte[] bArr = $$a;
                byte b8 = bArr[28];
                byte b11 = b8;
                Object[] objArr = new Object[1];
                a(b8, b11, b11, objArr);
                a0.B(null, (String) objArr[0], "AuthenticationRequestParameters");
                getSDKAppID = (getSDKTransactionID + 113) % 128;
                try {
                    byte b12 = bArr[28];
                    byte b13 = b12;
                    Object[] objArr2 = new Object[1];
                    a(b12, b13, b13, objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    byte b14 = (byte) (bArr[28] + 1);
                    byte b15 = b14;
                    Object[] objArr3 = new Object[1];
                    a(b14, b15, b15, objArr3);
                    Method method = cls.getMethod((String) objArr3[0], null);
                    method.setAccessible(true);
                    Object objInvoke = method.invoke(null, null);
                    Object[] objArr4 = {atd.as.AuthenticationRequestParameters.class.getField("getSDKAppID").get(null)};
                    Object[] objArr5 = new Object[1];
                    b("\u0000\u0000\u0000\u0000", "圕隨\u2e6e㓆", "졙⎰锼", 1855367255 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (50734 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr5);
                    Method method2 = Set.class.getMethod(((String) objArr5[0]).intern(), Object.class);
                    method2.setAccessible(true);
                    int i11 = getSDKTransactionID + 35;
                    getSDKAppID = i11 % 128;
                    if (i11 % 2 != 0) {
                        throw null;
                    }
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }

            public static void init$0() {
                $$a = new byte[]{105, 109, -121, 42, 24, -11, -49, 56, 22, -63, 62, 3, 20, -28, -10, 12, 14, 35, -12, 18, 10, -13, 7, 22, -6, 11, 4, -32, 0, 3, 20, -28, -10, 12, -5, 52, 5, -34, 0};
                $$b = 210;
            }

            public static void init$1() {
                $$c = new byte[]{36, -24, 120, 1};
                $$d = 114;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ChallengeResultCompleted createFromParcel(Parcel parcel) {
                getSDKTransactionID = (getSDKAppID + 7) % 128;
                ChallengeResultCompleted sDKAppID = getSDKAppID(parcel);
                getSDKTransactionID = (getSDKAppID + 29) % 128;
                return sDKAppID;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ ChallengeResultCompleted[] newArray(int i11) {
                int i12 = getSDKAppID + 25;
                getSDKTransactionID = i12 % 128;
                if (i12 % 2 == 0) {
                    getSDKTransactionID(i11);
                    throw null;
                }
                ChallengeResultCompleted[] sDKTransactionID = getSDKTransactionID(i11);
                getSDKTransactionID = (getSDKAppID + 31) % 128;
                return sDKTransactionID;
            }

            private static ChallengeResultCompleted[] getSDKTransactionID(int i11) {
                int i12 = getSDKAppID + 9;
                getSDKTransactionID = i12 % 128;
                ChallengeResultCompleted[] challengeResultCompletedArr = new ChallengeResultCompleted[i11];
                if (i12 % 2 != 0) {
                    return challengeResultCompletedArr;
                }
                throw null;
            }
        };
        Object[] objArr = new Object[1];
        d(null, AndroidCharacter.getMirror('0') + 'O', null, "\u009d\u0087¢", objArr);
        AuthenticationRequestParameters = Collections.singletonList(((String) objArr[0]).intern());
        getTransactionStatus = (ChallengeResultCompleted + 33) % 128;
    }

    public ChallengeResultCompleted(b0 b0Var) throws atd.ac.getSDKAppID {
        super(b0Var);
        Object[] objArr = {b0Var, atd.am.getSDKReferenceNumber.CHALLENGE_ADD_INFO};
        int sDKAppID = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID2 = atd.a.getSDKReferenceNumber.getSDKAppID();
        this.getSDKTransactionID = (String) ((atd.am.getSDKTransactionID) atd.d.getSDKEphemeralPublicKey.getSDKAppID(atd.a.getSDKReferenceNumber.getSDKAppID(), atd.a.getSDKReferenceNumber.getSDKAppID(), objArr, sDKAppID2, sDKAppID, 1505785998, -1505785998)).getSDKAppID();
        Object[] objArr2 = {b0Var, atd.am.getSDKReferenceNumber.OOP_APP_LABEL};
        int sDKAppID3 = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID4 = atd.a.getSDKReferenceNumber.getSDKAppID();
        this.getSDKAppID = (String) ((atd.am.getSDKTransactionID) atd.d.getSDKEphemeralPublicKey.getSDKAppID(atd.a.getSDKReferenceNumber.getSDKAppID(), atd.a.getSDKReferenceNumber.getSDKAppID(), objArr2, sDKAppID4, sDKAppID3, 1505785998, -1505785998)).getSDKAppID();
        Object[] objArr3 = {b0Var, atd.am.getSDKReferenceNumber.OOB_APP_URL};
        int sDKAppID5 = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID6 = atd.a.getSDKReferenceNumber.getSDKAppID();
        this.getDeviceData = (String) ((atd.am.getSDKTransactionID) atd.d.getSDKEphemeralPublicKey.getSDKAppID(atd.a.getSDKReferenceNumber.getSDKAppID(), atd.a.getSDKReferenceNumber.getSDKAppID(), objArr3, sDKAppID6, sDKAppID5, 1505785998, -1505785998)).getSDKAppID();
        this.getSDKReferenceNumber = atd.d.getSDKEphemeralPublicKey.getSDKTransactionID(b0Var, atd.am.getSDKReferenceNumber.OOB_CONTINUE_LABEL).getSDKAppID();
        AuthenticationRequestParameters(b0Var);
    }

    public static /* synthetic */ Object AuthenticationRequestParameters(int i11, int i12, int i13, int i14, Object[] objArr, int i15, int i16) {
        int i17 = ~i11;
        int i18 = ~(i17 | i12);
        int i19 = ~i12;
        int i21 = ~((~i14) | i19);
        int i22 = ~(i19 | i11);
        int i23 = i21 | i22;
        int i24 = (~(i14 | i17)) | i22 | i18;
        int i25 = 366215168 * i13;
        int i26 = 1604583424 * i16;
        int i27 = (216268800 * i15) + i26 + i25 + ((-1289454384) * i24) + (i23 * (-1289454384)) + ((-1716058528) * i18) + ((-923239215) * i11) + ((-1349843359) * i12) + 1460535296;
        int iC = a0.c(i15, 1787681333, ((-168536539) * i16) + i12 + i11 + i13);
        return a0.e(iC, -2030960640, (i15 * 30625011) + ((i16 * 1252505731) + ((i13 * (-925913209)) + ((i24 * 432) + ((i23 * 432) + ((i18 * (-864)) + ((i11 * (-925912777)) + ((i12 * (-925914073)) + 175428941))))))), 899809280, (1778253824 * iC) + i27) != 1 ? getSDKAppID(objArr) : AuthenticationRequestParameters(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r0 = 15 - r6
            int r8 = r8 * 2
            int r8 = 26 - r8
            int r7 = r7 * 36
            int r7 = 103 - r7
            byte[] r1 = atd.c.ChallengeResultCompleted.$$a
            byte[] r0 = new byte[r0]
            int r6 = 14 - r6
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r1
            r4 = r2
            r1 = r8
            goto L33
        L19:
            r3 = r8
            r8 = r7
            r7 = r3
            r3 = r2
        L1d:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2c:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r5
        L33:
            int r7 = -r7
            int r8 = r8 + 1
            int r7 = r7 + r1
            r1 = r8
            r8 = r7
            r7 = r1
            r1 = r3
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.c.ChallengeResultCompleted.c(short, byte, short, java.lang.Object[]):void");
    }

    public static void cancelled() {
        getMessageVersion = new char[]{21716, 21697, 21723, 21701, 21702, 21724, 21633, 21706, 21674, 21708, 21707, 21720, 21696, 21690, 21699, 21722, 21698, 21703, 21669, 21684, 21705, 21675, 21727, 21704, 21725, 21726, 21695, 21685, 21639, 21647, 21637, 21632, 21643, 21636};
        ChallengeResultCancelled = 1286296695;
        ChallengeResult = true;
        getSDKEphemeralPublicKey = true;
    }

    private static void d(int[] iArr, int i11, String str, String str2, Object[] objArr) throws Throwable {
        int i12;
        char[] cArr;
        float f11;
        int i13;
        float f12;
        String str3 = str2;
        int i14 = 0;
        Object bytes = str3;
        if (str3 != null) {
            int i15 = $11 + 17;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 65 / 0;
                bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
            } else {
                bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
            }
        }
        byte[] bArr = (byte[]) bytes;
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.bb.ChallengeResultTimeout challengeResultTimeout = new atd.bb.ChallengeResultTimeout();
        char[] cArr2 = getMessageVersion;
        Class cls = Integer.TYPE;
        float f13 = 0.0f;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i17 = 0;
            while (i17 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i17])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(887083134);
                    if (sDKTransactionID == null) {
                        f12 = f13;
                        byte b8 = (byte) i14;
                        byte b11 = b8;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(2555 - (CdmaCellLocation.convertQuartSecToDecDegrees(i14) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i14) == 0.0d ? 0 : -1)), (char) ((TypedValue.complexToFraction(i14, f13, f13) > f13 ? 1 : (TypedValue.complexToFraction(i14, f13, f13) == f13 ? 0 : -1)) + 48598), ExpandableListView.getPackedPositionChild(0L) + 32, -390605202, false, $$m(b8, b11, b11), new Class[]{cls});
                    } else {
                        f12 = f13;
                    }
                    cArr3[i17] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i17++;
                    f13 = f12;
                    i14 = 0;
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
        float f14 = f13;
        Object[] objArr3 = {Integer.valueOf(ChallengeResultCancelled)};
        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-1144184369);
        if (sDKTransactionID2 == null) {
            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(TextUtils.getOffsetBefore("", 0) + 147, (char) TextUtils.getOffsetBefore("", 0), 32 - (TypedValue.complexToFloat(0) > f14 ? 1 : (TypedValue.complexToFloat(0) == f14 ? 0 : -1)), 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
        }
        int iIntValue = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
        int i18 = 1124287645;
        if (getSDKEphemeralPublicKey) {
            int length2 = bArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length2;
            char[] cArr4 = new char[length2];
            challengeResultTimeout.getSDKAppID = 0;
            $10 = ($11 + 37) % 128;
            while (true) {
                int i19 = challengeResultTimeout.getSDKAppID;
                int i21 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i19 >= i21) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                cArr4[i19] = (char) (cArr2[bArr[(i21 - 1) - i19] + i11] - iIntValue);
                Object[] objArr4 = {challengeResultTimeout, challengeResultTimeout};
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(i18);
                if (sDKTransactionID3 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    i13 = i18;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(1696 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (Process.getGidForName("") + 1), 29 - TextUtils.indexOf("", ""), -1620360563, false, $$m(b12, b13, (byte) (b13 + 1)), new Class[]{Object.class, Object.class});
                } else {
                    i13 = i18;
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                i18 = i13;
            }
        } else if (ChallengeResult) {
            int i22 = $11 + 111;
            $10 = i22 % 128;
            if (i22 % 2 != 0) {
                int length3 = charArray.length;
                challengeResultTimeout.AuthenticationRequestParameters = length3;
                cArr = new char[length3];
                i12 = 0;
            } else {
                i12 = 0;
                int length4 = charArray.length;
                challengeResultTimeout.AuthenticationRequestParameters = length4;
                cArr = new char[length4];
            }
            challengeResultTimeout.getSDKAppID = i12;
            while (true) {
                int i23 = challengeResultTimeout.getSDKAppID;
                int i24 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i23 >= i24) {
                    objArr[0] = new String(cArr);
                    return;
                }
                cArr[i23] = (char) (cArr2[charArray[(i24 - 1) - i23] - i11] - iIntValue);
                Object[] objArr5 = {challengeResultTimeout, challengeResultTimeout};
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                if (sDKTransactionID4 == null) {
                    float f15 = f14;
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(TextUtils.getTrimmedLength("") + 1697, (char) (PointF.length(f15, f15) > f15 ? 1 : (PointF.length(f15, f15) == f15 ? 0 : -1)), TextUtils.indexOf("", "", 0) + 29, -1620360563, false, $$m(b14, b15, (byte) (b15 + 1)), new Class[]{Object.class, Object.class});
                    f11 = 0.0f;
                } else {
                    f11 = f14;
                }
                ((Method) sDKTransactionID4).invoke(null, objArr5);
                f14 = f11;
            }
        } else {
            int i25 = 0;
            int length5 = iArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length5;
            char[] cArr5 = new char[length5];
            while (true) {
                challengeResultTimeout.getSDKAppID = i25;
                int i26 = challengeResultTimeout.getSDKAppID;
                int i27 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i26 >= i27) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i26] = (char) (cArr2[iArr[(i27 - 1) - i26] - i11] - iIntValue);
                    i25 = i26 + 1;
                }
            }
        }
    }

    private static void e(short s7, short s8, short s11, Object[] objArr) {
        int i11 = 103 - (s11 * 6);
        int i12 = s8 + 4;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[38 - s7];
        int i13 = 37 - s7;
        int i14 = -1;
        if (bArr == null) {
            i12++;
            i11 = (i13 + (-i12)) - 2;
        }
        while (true) {
            i14++;
            bArr2[i14] = (byte) i11;
            if (i14 == i13) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b8 = bArr[i12];
                i12++;
                i11 = (i11 + (-b8)) - 2;
            }
        }
    }

    private void getDeviceData(getSDKEphemeralPublicKey getsdkephemeralpublickey) throws atd.ac.getSDKAppID {
        BuildConfig = (getAdditionalDetails + 107) % 128;
        b0 sDKAppID = atd.d.getSDKEphemeralPublicKey.getSDKReferenceNumber(getsdkephemeralpublickey.getSDKAppID(), atd.am.getSDKReferenceNumber.MESSAGE_EXTENSION_CHALLENGE_DATA).getSDKAppID();
        Object[] objArr = {sDKAppID, atd.am.getSDKReferenceNumber.OOP_APP_LABEL};
        int sDKAppID2 = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID3 = atd.a.getSDKReferenceNumber.getSDKAppID();
        this.getSDKAppID = (String) ((atd.am.getSDKTransactionID) atd.d.getSDKEphemeralPublicKey.getSDKAppID(atd.a.getSDKReferenceNumber.getSDKAppID(), atd.a.getSDKReferenceNumber.getSDKAppID(), objArr, sDKAppID3, sDKAppID2, 1505785998, -1505785998)).getSDKAppID();
        Object[] objArr2 = {sDKAppID, atd.am.getSDKReferenceNumber.OOB_APP_URL};
        int sDKAppID4 = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID5 = atd.a.getSDKReferenceNumber.getSDKAppID();
        this.getDeviceData = (String) ((atd.am.getSDKTransactionID) atd.d.getSDKEphemeralPublicKey.getSDKAppID(atd.a.getSDKReferenceNumber.getSDKAppID(), atd.a.getSDKReferenceNumber.getSDKAppID(), objArr2, sDKAppID5, sDKAppID4, 1505785998, -1505785998)).getSDKAppID();
        int i11 = getAdditionalDetails + 101;
        BuildConfig = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean getSDKAppID(atd.c.getSDKEphemeralPublicKey r7) throws java.lang.Throwable {
        /*
            r0 = 0
            int r0 = android.widget.ExpandableListView.getPackedPositionType(r0)
            int r0 = 127 - r0
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            java.lang.String r4 = "\u009a\u0082\u0086\u009a\u0083\u0086\u0084\u009c"
            d(r3, r0, r3, r4, r2)
            r0 = 0
            r2 = r2[r0]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            java.lang.String r4 = r7.getSDKTransactionID()
            boolean r2 = r2.equals(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r0)
            int r4 = r4 + 127
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r6 = "¡\u009d\u009d \u009f\u009d\u009e\u009d\u009d\u009d\u009d\u009d\u009d\u0094"
            d(r3, r4, r3, r6, r5)
            r4 = r5[r0]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r4.intern()
            java.lang.String r5 = r7.getSDKReferenceNumber()
            boolean r4 = r4.equals(r5)
            java.lang.String r5 = r7.getDeviceData()
            if (r5 == 0) goto L70
            int r5 = atd.c.ChallengeResultCompleted.getAdditionalDetails
            int r5 = r5 + 107
            int r6 = r5 % 128
            atd.c.ChallengeResultCompleted.BuildConfig = r6
            int r5 = r5 % 2
            if (r5 == 0) goto L61
            java.util.List<java.lang.String> r5 = atd.c.ChallengeResultCompleted.AuthenticationRequestParameters
            java.lang.String r7 = r7.getDeviceData()
            boolean r7 = r5.contains(r7)
            r5 = 42
            int r5 = r5 / r0
            if (r7 == 0) goto L6e
            goto L70
        L61:
            java.util.List<java.lang.String> r5 = atd.c.ChallengeResultCompleted.AuthenticationRequestParameters
            java.lang.String r7 = r7.getDeviceData()
            boolean r7 = r5.contains(r7)
            if (r7 == 0) goto L6e
            goto L70
        L6e:
            r7 = r0
            goto L71
        L70:
            r7 = r1
        L71:
            if (r2 == 0) goto L91
            int r2 = atd.c.ChallengeResultCompleted.BuildConfig
            int r5 = r2 + 111
            int r6 = r5 % 128
            atd.c.ChallengeResultCompleted.getAdditionalDetails = r6
            int r5 = r5 % 2
            if (r5 == 0) goto L90
            if (r4 == 0) goto L91
            int r2 = r2 + 121
            int r2 = r2 % 128
            atd.c.ChallengeResultCompleted.getAdditionalDetails = r2
            if (r7 == 0) goto L91
            int r2 = r2 + 71
            int r2 = r2 % 128
            atd.c.ChallengeResultCompleted.BuildConfig = r2
            return r1
        L90:
            throw r3
        L91:
            int r7 = atd.c.ChallengeResultCompleted.BuildConfig
            int r7 = r7 + 83
            int r7 = r7 % 128
            atd.c.ChallengeResultCompleted.getAdditionalDetails = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.c.ChallengeResultCompleted.getSDKAppID(atd.c.getSDKEphemeralPublicKey):boolean");
    }

    public static void init$0() {
        $$a = new byte[]{118, -50, -83, 89, 2, -15, 48, -33, -17, 13, 6, -2, 33, -29, -19, 19, 2, -15, 33, 15, -7, 10, -47, 0, 39, 5, -37, 7, -11, 0, 7, -9, 7, 2, 19, -19, -14, -2, 9, -8};
        $$b = 143;
    }

    public static void init$1() {
        $$d = new byte[]{76, -80, -7, 6, -21, 14, 52, -77, 73, -59, 0, -17, 30, -32, 15, -15, -7, 16, -4, -19, 9, -8, -1, 25, -35, 17, -21, -3, 0, 77, -69, 0, -17, 31, 13, -9, 8, -49, -2, 37, 3, 0, -17, 46, -35, -19, 11, 4, -4, 31, -31, -21, 17, 0, -17, 31, 13, -9, -9, -21, -3, -1, -15, 11, -11, 9, -4, 21, -41, 6, 9, -5, -15};
        $$e = 181;
    }

    public static void init$2() {
        $$k = new byte[]{72, 63, -104, 21};
        $$l = 208;
    }

    public final String ChallengeResultKt() {
        int deviceData = getSDKAppID.getSDKReferenceNumber.getDeviceData();
        return (String) AuthenticationRequestParameters(55108837, -55108836, getSDKAppID.getSDKReferenceNumber.getDeviceData(), deviceData, new Object[]{this}, getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData());
    }

    public final String ChallengeStatusHandler() {
        int i11 = BuildConfig + 43;
        getAdditionalDetails = i11 % 128;
        int i12 = i11 % 2;
        String str = this.getSDKTransactionID;
        if (i12 != 0) {
            return str;
        }
        throw null;
    }

    public final String ChallengeStatusReceiver() {
        int i11 = getAdditionalDetails;
        int i12 = i11 + 39;
        BuildConfig = i12 % 128;
        int i13 = i12 % 2;
        String str = this.getDeviceData;
        if (i13 != 0) {
            int i14 = 41 / 0;
        }
        int i15 = i11 + 3;
        BuildConfig = i15 % 128;
        if (i15 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String completed() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.c.ChallengeResultCompleted.completed():java.lang.String");
    }

    @Override // atd.c.getTransactionStatus, atd.c.getSDKTransactionID, android.os.Parcelable
    public final int describeContents() {
        BuildConfig = (getAdditionalDetails + 59) % 128;
        return 0;
    }

    @Override // atd.c.getTransactionStatus, atd.c.getSDKTransactionID
    public final boolean equals(Object obj) {
        int deviceData = getSDKAppID.getSDKReferenceNumber.getDeviceData();
        return ((Boolean) AuthenticationRequestParameters(-1718587113, 1718587113, getSDKAppID.getSDKReferenceNumber.getDeviceData(), deviceData, new Object[]{this, obj}, getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData())).booleanValue();
    }

    @Override // atd.c.getTransactionStatus, atd.c.getSDKTransactionID
    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3 = super.hashCode() * 31;
        String str = this.getSDKTransactionID;
        if (str != null) {
            int i11 = BuildConfig + 75;
            getAdditionalDetails = i11 % 128;
            if (i11 % 2 == 0) {
                str.hashCode();
                throw null;
            }
            iHashCode = str.hashCode();
        } else {
            iHashCode = 0;
        }
        int i12 = (iHashCode3 + iHashCode) * 31;
        String str2 = this.getSDKAppID;
        int iHashCode4 = (i12 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.getDeviceData;
        if (str3 != null) {
            getAdditionalDetails = (BuildConfig + 75) % 128;
            iHashCode2 = str3.hashCode();
        } else {
            iHashCode2 = 0;
        }
        int i13 = (iHashCode4 + iHashCode2) * 31;
        String str4 = this.getSDKReferenceNumber;
        return i13 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // atd.c.getTransactionStatus, atd.c.getSDKTransactionID, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = BuildConfig + 93;
        getAdditionalDetails = i12 % 128;
        if (i12 % 2 != 0) {
            super.writeToParcel(parcel, i11);
            parcel.writeString(this.getSDKTransactionID);
            parcel.writeString(this.getSDKAppID);
            parcel.writeString(this.getDeviceData);
            parcel.writeString(this.getSDKReferenceNumber);
            return;
        }
        super.writeToParcel(parcel, i11);
        parcel.writeString(this.getSDKTransactionID);
        parcel.writeString(this.getSDKAppID);
        parcel.writeString(this.getDeviceData);
        parcel.writeString(this.getSDKReferenceNumber);
        throw null;
    }

    @Override // atd.c.getTransactionStatus, atd.c.getSDKTransactionID
    public final void getDeviceData() {
        int i11 = BuildConfig + 33;
        getAdditionalDetails = i11 % 128;
        if (i11 % 2 != 0) {
            super.getDeviceData();
            this.getSDKTransactionID = null;
            this.getSDKAppID = null;
            this.getDeviceData = null;
            this.getSDKReferenceNumber = null;
            return;
        }
        super.getDeviceData();
        this.getSDKTransactionID = null;
        this.getSDKAppID = null;
        this.getDeviceData = null;
        this.getSDKReferenceNumber = null;
        throw null;
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        ChallengeResultCompleted challengeResultCompleted = (ChallengeResultCompleted) objArr[0];
        int i11 = (BuildConfig + 7) % 128;
        getAdditionalDetails = i11;
        String str = challengeResultCompleted.getSDKAppID;
        int i12 = i11 + 41;
        BuildConfig = i12 % 128;
        if (i12 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private void AuthenticationRequestParameters(b0 b0Var) throws atd.ac.getSDKAppID {
        Iterator<getSDKEphemeralPublicKey> it;
        getAdditionalDetails = (BuildConfig + 87) % 128;
        e sDKAppID = atd.d.getSDKEphemeralPublicKey.getSDKEphemeralPublicKey(b0Var, atd.am.getSDKReferenceNumber.MESSAGE_EXTENSION).getSDKAppID();
        if (sDKAppID != null) {
            int i11 = BuildConfig + 73;
            getAdditionalDetails = i11 % 128;
            if (i11 % 2 == 0) {
                it = getSDKEphemeralPublicKey.getDeviceData(sDKAppID).iterator();
                int i12 = 81 / 0;
            } else {
                it = getSDKEphemeralPublicKey.getDeviceData(sDKAppID).iterator();
            }
            while (it.hasNext()) {
                getSDKEphemeralPublicKey next = it.next();
                if (getSDKAppID(next)) {
                    getDeviceData(next);
                }
            }
        }
    }

    public ChallengeResultCompleted(Parcel parcel) {
        super(parcel);
        this.getSDKTransactionID = parcel.readString();
        this.getSDKAppID = parcel.readString();
        this.getDeviceData = parcel.readString();
        this.getSDKReferenceNumber = parcel.readString();
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        ChallengeResultCompleted challengeResultCompleted = (ChallengeResultCompleted) objArr[0];
        Object obj = objArr[1];
        if (challengeResultCompleted == obj) {
            return Boolean.TRUE;
        }
        if (obj != null) {
            int i11 = BuildConfig + 5;
            getAdditionalDetails = i11 % 128;
            if (i11 % 2 == 0) {
                challengeResultCompleted.getClass();
                obj.getClass();
                throw null;
            }
            if (challengeResultCompleted.getClass() == obj.getClass()) {
                if (!super.equals(obj)) {
                    return Boolean.FALSE;
                }
                ChallengeResultCompleted challengeResultCompleted2 = (ChallengeResultCompleted) obj;
                if (!Objects.equals(challengeResultCompleted.getSDKTransactionID, challengeResultCompleted2.getSDKTransactionID)) {
                    int i12 = BuildConfig + 23;
                    getAdditionalDetails = i12 % 128;
                    if (i12 % 2 != 0) {
                        return Boolean.FALSE;
                    }
                    throw null;
                }
                if (!Objects.equals(challengeResultCompleted.getSDKAppID, challengeResultCompleted2.getSDKAppID)) {
                    return Boolean.FALSE;
                }
                if (Objects.equals(challengeResultCompleted.getDeviceData, challengeResultCompleted2.getDeviceData)) {
                    return Boolean.valueOf(Objects.equals(challengeResultCompleted.getSDKReferenceNumber, challengeResultCompleted2.getSDKReferenceNumber));
                }
                BuildConfig = (getAdditionalDetails + 3) % 128;
                return Boolean.FALSE;
            }
        }
        return Boolean.FALSE;
    }
}
