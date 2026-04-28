package atd.c;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.bb.ChallengeResultKt;
import atd.z.getErrorDetails;
import java.lang.reflect.Method;
import java.util.Objects;
import n90.b0;
import r8.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getMessageVersion implements Parcelable {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int BuildConfig;
    public static final Parcelable.Creator<getMessageVersion> CREATOR;
    private static int ChallengeResult;
    private static int getDeviceData;
    private static int getSDKEphemeralPublicKey;
    private static char[] getSDKReferenceNumber;
    private String AuthenticationRequestParameters;
    private String getSDKAppID;
    private String getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, int r8, byte r9) {
        /*
            int r8 = r8 + 107
            int r9 = r9 * 2
            int r9 = 1 - r9
            int r7 = r7 + 4
            byte[] r0 = atd.c.getMessageVersion.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r8 = r7
            r3 = r0
            r4 = r2
            r0 = r9
            goto L2b
        L14:
            r3 = r2
        L15:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r0
            r0 = r6
        L2b:
            int r7 = -r7
            int r7 = r7 + r0
            r0 = r8
            r8 = r7
            r7 = r0
            r0 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.c.getMessageVersion.$$c(int, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        ChallengeResult = 1;
        getDeviceData = 0;
        BuildConfig = 1;
        getDeviceData();
        CREATOR = new Parcelable.Creator<getMessageVersion>() { // from class: atd.c.getMessageVersion.4
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$c = null;
            private static final int $$d = 0;
            private static int $10;
            private static int $11;
            private static int AuthenticationRequestParameters;
            private static char getSDKAppID;
            private static char[] getSDKReferenceNumber;
            private static int getSDKTransactionID;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String $$e(int r6, int r7, int r8) {
                /*
                    int r8 = 122 - r8
                    int r6 = r6 * 2
                    int r0 = 1 - r6
                    byte[] r1 = atd.c.getMessageVersion.AnonymousClass4.$$c
                    int r7 = r7 * 3
                    int r7 = 4 - r7
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    int r6 = 0 - r6
                    if (r1 != 0) goto L18
                    r3 = r1
                    r4 = r2
                    r1 = r8
                    r8 = r7
                    goto L2e
                L18:
                    r3 = r2
                L19:
                    byte r4 = (byte) r8
                    r0[r3] = r4
                    if (r3 != r6) goto L24
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L24:
                    int r3 = r3 + 1
                    r4 = r1[r7]
                    r5 = r8
                    r8 = r7
                    r7 = r4
                    r4 = r3
                    r3 = r1
                    r1 = r5
                L2e:
                    int r7 = -r7
                    int r7 = r7 + r1
                    int r8 = r8 + 1
                    r1 = r8
                    r8 = r7
                    r7 = r1
                    r1 = r3
                    r3 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: atd.c.getMessageVersion.AnonymousClass4.$$e(int, int, int):java.lang.String");
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                init$0();
                getSDKTransactionID = 0;
                AuthenticationRequestParameters = 1;
                getSDKReferenceNumber = new char[]{30891, 31577, 31579, 30893, 30910, 30953, 30863, 31581, 31578, 30884, 30880, 31572, 30899, 30853, 31576, 30881, 30900, 30883, 30955, 30898, 30888, 30967, 30885, 30882, 30887, 30890, 30886, 31582, 30895, 30952, 30902, 31580, 31583, 30901, 30889, 30855};
                getSDKAppID = (char) 19802;
            }

            private static getMessageVersion[] AuthenticationRequestParameters(int i11) {
                int i12 = getSDKTransactionID;
                AuthenticationRequestParameters = (i12 + 55) % 128;
                getMessageVersion[] getmessageversionArr = new getMessageVersion[i11];
                AuthenticationRequestParameters = (i12 + 77) % 128;
                return getmessageversionArr;
            }

            private static void a(String str, int i11, byte b8, Object[] objArr) throws Throwable {
                int i12;
                int i13;
                int i14;
                char c3;
                char c7;
                int i15;
                char c8;
                char c11;
                int i16;
                int i17;
                int i18;
                char[] charArray = str != null ? str.toCharArray() : str;
                ChallengeResultKt challengeResultKt = new ChallengeResultKt();
                char[] cArr = getSDKReferenceNumber;
                Class cls = Integer.TYPE;
                int i19 = -317146529;
                int i21 = 6;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    int i22 = 0;
                    while (i22 < length) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr[i22])};
                            Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(i19);
                            if (sDKTransactionID == null) {
                                byte b11 = (byte) 0;
                                i17 = i19;
                                byte b12 = b11;
                                i18 = i21;
                                sDKTransactionID = atd.e.ChallengeResult.getDeviceData(Gravity.getAbsoluteGravity(0, 0) + 2158, (char) (Process.myTid() >> 22), 36 - ((Process.getThreadPriority(0) + 20) >> i21), 829471823, false, $$e(b11, b12, (byte) (b12 | 57)), new Class[]{cls});
                            } else {
                                i17 = i19;
                                i18 = i21;
                            }
                            cArr2[i22] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                            i22++;
                            i19 = i17;
                            i21 = i18;
                        } catch (Throwable th2) {
                            Throwable cause = th2.getCause();
                            if (cause == null) {
                                throw th2;
                            }
                            throw cause;
                        }
                    }
                    i12 = i19;
                    i13 = i21;
                    $10 = ($11 + 97) % 128;
                    cArr = cArr2;
                } else {
                    i12 = -317146529;
                    i13 = 6;
                }
                Object[] objArr3 = {Integer.valueOf(getSDKAppID)};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i12);
                char c12 = '\b';
                if (sDKTransactionID2 == null) {
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(2158 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) KeyEvent.normalizeMetaState(0), 36 - (ViewConfiguration.getEdgeSlop() >> 16), 829471823, false, $$e(b13, b14, (byte) (b14 | 57)), new Class[]{cls});
                }
                char cCharValue = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                char[] cArr3 = new char[i11];
                if (i11 % 2 != 0) {
                    $11 = ($10 + 63) % 128;
                    i14 = i11 - 1;
                    cArr3[i14] = (char) (charArray[i14] - b8);
                } else {
                    i14 = i11;
                }
                char c13 = 2;
                int i23 = 1;
                if (i14 > 1) {
                    challengeResultKt.getSDKReferenceNumber = 0;
                    while (true) {
                        int i24 = challengeResultKt.getSDKReferenceNumber;
                        if (i24 >= i14) {
                            break;
                        }
                        char c14 = charArray[i24];
                        challengeResultKt.getDeviceData = c14;
                        char c15 = charArray[i24 + 1];
                        challengeResultKt.getSDKAppID = c15;
                        if (c14 == c15) {
                            cArr3[i24] = (char) (c14 - b8);
                            cArr3[i24 + 1] = (char) (c15 - b8);
                            $10 = ($11 + 25) % 128;
                            c3 = c12;
                            c7 = c13;
                            i16 = i23;
                        } else {
                            Object[] objArr4 = new Object[13];
                            objArr4[12] = challengeResultKt;
                            objArr4[11] = Integer.valueOf(cCharValue);
                            objArr4[10] = challengeResultKt;
                            objArr4[9] = challengeResultKt;
                            objArr4[c12] = Integer.valueOf(cCharValue);
                            objArr4[7] = challengeResultKt;
                            objArr4[i13] = challengeResultKt;
                            objArr4[5] = Integer.valueOf(cCharValue);
                            objArr4[4] = challengeResultKt;
                            objArr4[3] = challengeResultKt;
                            objArr4[c13] = Integer.valueOf(cCharValue);
                            objArr4[i23] = challengeResultKt;
                            objArr4[0] = challengeResultKt;
                            Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(835518319);
                            if (sDKTransactionID3 == null) {
                                c3 = c12;
                                int deadChar = 1258 - KeyEvent.getDeadChar(0, 0);
                                c7 = c13;
                                char cMakeMeasureSpec = (char) (34414 - View.MeasureSpec.makeMeasureSpec(0, 0));
                                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 41;
                                c8 = '\n';
                                byte b15 = (byte) 0;
                                c11 = '\t';
                                byte b16 = b15;
                                i15 = i23;
                                String str$$e = $$e(b15, b16, (byte) (b16 | 55));
                                Class cls2 = Integer.TYPE;
                                sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(deadChar, cMakeMeasureSpec, iCombineMeasuredStates, -307955329, false, str$$e, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                            } else {
                                c3 = c12;
                                c7 = c13;
                                i15 = i23;
                                c8 = '\n';
                                c11 = '\t';
                            }
                            int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                            int i25 = challengeResultKt.ChallengeResultCancelled;
                            if (iIntValue == i25) {
                                $11 = ($10 + 41) % 128;
                                Object[] objArr5 = new Object[11];
                                objArr5[c8] = challengeResultKt;
                                objArr5[c11] = Integer.valueOf(cCharValue);
                                objArr5[c3] = challengeResultKt;
                                objArr5[7] = Integer.valueOf(cCharValue);
                                objArr5[i13] = Integer.valueOf(cCharValue);
                                objArr5[5] = challengeResultKt;
                                objArr5[4] = challengeResultKt;
                                objArr5[3] = Integer.valueOf(cCharValue);
                                objArr5[c7] = Integer.valueOf(cCharValue);
                                objArr5[i15] = challengeResultKt;
                                objArr5[0] = challengeResultKt;
                                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(-758961112);
                                if (sDKTransactionID4 == null) {
                                    int i26 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2222;
                                    char cResolveSize = (char) (View.resolveSize(0, 0) + 53070);
                                    int gidForName = 20 - Process.getGidForName("");
                                    byte b17 = (byte) 0;
                                    byte b18 = b17;
                                    String str$$e2 = $$e(b17, b18, b18);
                                    Class cls3 = Integer.TYPE;
                                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(i26, cResolveSize, gidForName, 246098488, false, str$$e2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                                }
                                int iIntValue2 = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                                int i27 = (challengeResultKt.getSDKTransactionID * cCharValue) + challengeResultKt.ChallengeResultCancelled;
                                int i28 = challengeResultKt.getSDKReferenceNumber;
                                cArr3[i28] = cArr[iIntValue2];
                                cArr3[i28 + 1] = cArr[i27];
                                i16 = i15;
                            } else {
                                int i29 = challengeResultKt.AuthenticationRequestParameters;
                                int i31 = challengeResultKt.getSDKTransactionID;
                                int i32 = challengeResultKt.getMessageVersion;
                                if (i29 == i31) {
                                    i16 = i15;
                                    int iC = k.c(i32, cCharValue, i16, cCharValue);
                                    challengeResultKt.getMessageVersion = iC;
                                    int iC2 = k.c(i25, cCharValue, i16, cCharValue);
                                    challengeResultKt.ChallengeResultCancelled = iC2;
                                    int i33 = (i31 * cCharValue) + iC2;
                                    int i34 = challengeResultKt.getSDKReferenceNumber;
                                    cArr3[i34] = cArr[(i29 * cCharValue) + iC];
                                    cArr3[i34 + i16] = cArr[i33];
                                } else {
                                    i16 = i15;
                                    int i35 = (i29 * cCharValue) + i25;
                                    int i36 = challengeResultKt.getSDKReferenceNumber;
                                    cArr3[i36] = cArr[i35];
                                    cArr3[i36 + i16] = cArr[(i31 * cCharValue) + i32];
                                }
                            }
                        }
                        challengeResultKt.getSDKReferenceNumber += 2;
                        c12 = c3;
                        i23 = i16;
                        c13 = c7;
                    }
                }
                int i37 = 0;
                while (i37 < i11) {
                    int i38 = $11 + 61;
                    $10 = i38 % 128;
                    if (i38 % 2 != 0) {
                        cArr3[i37] = (char) (cArr3[i37] ^ 18847);
                        i37 += 29;
                    } else {
                        cArr3[i37] = (char) (cArr3[i37] ^ 13722);
                        i37++;
                    }
                }
                String str2 = new String(cArr3);
                $10 = ($11 + 31) % 128;
                objArr[0] = str2;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0022). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static void b(byte r6, short r7, short r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = atd.c.getMessageVersion.AnonymousClass4.$$a
                    int r6 = 35 - r6
                    int r7 = 19 - r7
                    int r8 = 104 - r8
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L10
                    r3 = r6
                    r4 = r2
                    goto L22
                L10:
                    r3 = r2
                L11:
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    if (r4 != r7) goto L20
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L20:
                    r3 = r0[r6]
                L22:
                    int r6 = r6 + 1
                    int r3 = -r3
                    int r8 = r8 + r3
                    int r8 = r8 + (-2)
                    r3 = r4
                    goto L11
                */
                throw new UnsupportedOperationException("Method not decompiled: atd.c.getMessageVersion.AnonymousClass4.b(byte, short, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v34 */
            /* JADX WARN: Type inference failed for: r5v35 */
            /* JADX WARN: Type inference failed for: r5v36, types: [int] */
            /* JADX WARN: Type inference failed for: r5v43 */
            /* JADX WARN: Type inference failed for: r5v44 */
            /* JADX WARN: Type inference failed for: r5v45 */
            /* JADX WARN: Type inference failed for: r5v47, types: [int] */
            /* JADX WARN: Type inference failed for: r5v52, types: [java.lang.reflect.Method] */
            /* JADX WARN: Type inference failed for: r5v57, types: [int] */
            /* JADX WARN: Type inference failed for: r5v60 */
            /* JADX WARN: Type inference failed for: r5v77 */
            /* JADX WARN: Type inference failed for: r5v78 */
            /* JADX WARN: Type inference failed for: r5v79 */
            /* JADX WARN: Type inference failed for: r5v80 */
            /* JADX WARN: Type inference failed for: r5v81 */
            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] getSDKAppID(android.content.Context r29, int r30, int r31, int r32) {
                /*
                    Method dump skipped, instruction units count: 1513
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: atd.c.getMessageVersion.AnonymousClass4.getSDKAppID(android.content.Context, int, int, int):java.lang.Object[]");
            }

            public static void init$0() {
                $$a = new byte[]{63, -107, 81, -105, 0, -17, 31, 13, -9, 8, -49, -2, 37, 3, 0, -17, 31, 13, -9, -11, -32, 15, -15, -7, 16, -4, -19, 9, -8, -1, 35, 3, -3, 3, -3, 50};
                $$b = 163;
            }

            public static void init$1() {
                $$c = new byte[]{63, -107, 81, -105};
                $$d = 38;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ getMessageVersion createFromParcel(Parcel parcel) {
                int i11 = AuthenticationRequestParameters + 75;
                getSDKTransactionID = i11 % 128;
                if (i11 % 2 != 0) {
                    getSDKAppID(parcel);
                    throw null;
                }
                getMessageVersion sDKAppID = getSDKAppID(parcel);
                AuthenticationRequestParameters = (getSDKTransactionID + 83) % 128;
                return sDKAppID;
            }

            @Override // android.os.Parcelable.Creator
            public /* synthetic */ getMessageVersion[] newArray(int i11) {
                int i12 = getSDKTransactionID + 39;
                AuthenticationRequestParameters = i12 % 128;
                int i13 = i12 % 2;
                getMessageVersion[] getmessageversionArrAuthenticationRequestParameters = AuthenticationRequestParameters(i11);
                if (i13 == 0) {
                    int i14 = 21 / 0;
                }
                return getmessageversionArrAuthenticationRequestParameters;
            }

            private static getMessageVersion getSDKAppID(Parcel parcel) {
                getMessageVersion getmessageversion = new getMessageVersion(parcel);
                int i11 = getSDKTransactionID + 1;
                AuthenticationRequestParameters = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 49 / 0;
                }
                return getmessageversion;
            }
        };
        int i11 = getSDKEphemeralPublicKey + 27;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private getMessageVersion(b0 b0Var) throws Throwable {
        Object[] objArr = {b0Var, atd.am.getSDKReferenceNumber.ISSUER_IMAGE_MEDIUM};
        int sDKAppID = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID2 = atd.a.getSDKReferenceNumber.getSDKAppID();
        this.getSDKTransactionID = (String) ((atd.am.getSDKTransactionID) atd.d.getSDKEphemeralPublicKey.getSDKAppID(atd.a.getSDKReferenceNumber.getSDKAppID(), atd.a.getSDKReferenceNumber.getSDKAppID(), objArr, sDKAppID2, sDKAppID, 1505785998, -1505785998)).getSDKAppID();
        Object[] objArr2 = {b0Var, atd.am.getSDKReferenceNumber.ISSUER_IMAGE_HIGH};
        int sDKAppID3 = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID4 = atd.a.getSDKReferenceNumber.getSDKAppID();
        this.getSDKAppID = (String) ((atd.am.getSDKTransactionID) atd.d.getSDKEphemeralPublicKey.getSDKAppID(atd.a.getSDKReferenceNumber.getSDKAppID(), atd.a.getSDKReferenceNumber.getSDKAppID(), objArr2, sDKAppID4, sDKAppID3, 1505785998, -1505785998)).getSDKAppID();
        Object[] objArr3 = {b0Var, atd.am.getSDKReferenceNumber.ISSUER_IMAGE_EXTRA_HIGH};
        int sDKAppID5 = atd.a.getSDKReferenceNumber.getSDKAppID();
        int sDKAppID6 = atd.a.getSDKReferenceNumber.getSDKAppID();
        String str = (String) ((atd.am.getSDKTransactionID) atd.d.getSDKEphemeralPublicKey.getSDKAppID(atd.a.getSDKReferenceNumber.getSDKAppID(), atd.a.getSDKReferenceNumber.getSDKAppID(), objArr3, sDKAppID6, sDKAppID5, 1505785998, -1505785998)).getSDKAppID();
        this.AuthenticationRequestParameters = str;
        if (this.getSDKTransactionID == null && this.getSDKAppID == null && str == null) {
            Object[] objArr4 = new Object[1];
            a(new int[]{25, 24, 120, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001", true, objArr4);
            throw new atd.ac.getSDKAppID(((String) objArr4[0]).intern(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_INVALID_FORMAT, atd.am.getSDKEphemeralPublicKey.MESSAGE_ISSUER_IMAGE_NO_DENSITY_PRESENT);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int[] r32, java.lang.String r33, boolean r34, java.lang.Object[] r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.c.getMessageVersion.a(int[], java.lang.String, boolean, java.lang.Object[]):void");
    }

    public static void getDeviceData() {
        getSDKReferenceNumber = new char[]{63462, 63312, 63118, 63125, 63125, 63126, 63126, 63354, 63348, 63149, 63123, 63354, 63355, 63127, 63129, 63126, 63122, 63353, 63355, 63127, 63123, 63127, 63122, 63147, 63106, 63452, 63303, 63339, 63312, 63337, 63337, 63337, 63335, 63342, 63315, 63285, 63285, 63313, 63315, 63312, 63340, 63283, 63285, 63313, 63341, 63313, 63340, 63333, 63324};
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        getMessageVersion getmessageversion = (getMessageVersion) objArr[0];
        int i11 = getDeviceData;
        BuildConfig = (i11 + 45) % 128;
        String str = getmessageversion.getSDKTransactionID;
        int i12 = i11 + 5;
        BuildConfig = i12 % 128;
        if (i12 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ Object getSDKReferenceNumber(int i11, Object[] objArr, int i12, int i13, int i14, int i15, int i16) {
        int i17 = ~(i15 | i12 | i14);
        int i18 = ~i12;
        int i19 = (~(i18 | i14)) | (~((~i14) | i15));
        int i21 = (~(i14 | (~i15))) | i18;
        int i22 = ((-299892736) * i11) + (689963008 * i16) + (606076928 * i13) + ((-441125413) * i21) + (441125413 * i19) + (i17 * 441125413) + (164951516 * i12) + ((1047202342 * i15) - 713031680);
        int iC = a0.c(i11, 1743660113, ((-2044576983) * i16) + i15 + i12 + i13);
        return a0.e(iC, 1885470720, (i11 * (-1448904853)) + ((i16 * 2142076211) + ((i13 * 2048728315) + ((i21 * 441) + ((i19 * (-441)) + ((i17 * (-441)) + ((i12 * 2048728756) + ((i15 * 2048727874) + (-782056376)))))))), -1618345984, ((-1081737216) * iC) + i22) != 1 ? getSDKAppID(objArr) : getSDKTransactionID(objArr);
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) throws Throwable {
        b0 b0Var = (b0) objArr[0];
        atd.am.getSDKReferenceNumber getsdkreferencenumber = (atd.am.getSDKReferenceNumber) objArr[1];
        b0 sDKAppID = atd.d.getSDKEphemeralPublicKey.BuildConfig(b0Var, getsdkreferencenumber).getSDKAppID();
        if (sDKAppID == null) {
            int i11 = getDeviceData + 7;
            BuildConfig = i11 % 128;
            if (i11 % 2 != 0) {
                return null;
            }
            throw null;
        }
        try {
            getMessageVersion getmessageversion = new getMessageVersion(sDKAppID);
            int i12 = BuildConfig + 101;
            getDeviceData = i12 % 128;
            if (i12 % 2 == 0) {
                return getmessageversion;
            }
            throw null;
        } catch (atd.ac.getSDKAppID unused) {
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr2 = new Object[1];
            a(new int[]{0, 25, 178, 0}, "\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001", true, objArr2);
            sb2.append(((String) objArr2[0]).intern());
            sb2.append(getsdkreferencenumber.getSDKReferenceNumber());
            throw new atd.ac.getSDKAppID(sb2.toString(), atd.h.getSDKReferenceNumber.DATA_ELEMENT_INVALID_FORMAT, atd.am.getSDKEphemeralPublicKey.MESSAGE_FIELD_INVALID_FORMAT, getsdkreferencenumber);
        }
    }

    public static void init$0() {
        $$a = new byte[]{40, -95, -33, 71};
        $$b = 71;
    }

    public final String AuthenticationRequestParameters() {
        int i11 = (getDeviceData + 115) % 128;
        BuildConfig = i11;
        String str = this.AuthenticationRequestParameters;
        int i12 = i11 + 13;
        getDeviceData = i12 % 128;
        if (i12 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        BuildConfig = (getDeviceData + 27) % 128;
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            BuildConfig = (getDeviceData + 109) % 128;
            return true;
        }
        if (obj == null || getMessageVersion.class != obj.getClass()) {
            return false;
        }
        getMessageVersion getmessageversion = (getMessageVersion) obj;
        if (!Objects.equals(this.getSDKTransactionID, getmessageversion.getSDKTransactionID)) {
            int i11 = getDeviceData + 43;
            BuildConfig = i11 % 128;
            return i11 % 2 == 0;
        }
        if (Objects.equals(this.getSDKAppID, getmessageversion.getSDKAppID)) {
            return Objects.equals(this.AuthenticationRequestParameters, getmessageversion.AuthenticationRequestParameters);
        }
        getDeviceData = (BuildConfig + 95) % 128;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        String str = this.getSDKTransactionID;
        int iHashCode2 = 0;
        int iHashCode3 = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.getSDKAppID;
        if (str2 != null) {
            int i11 = BuildConfig + 85;
            getDeviceData = i11 % 128;
            if (i11 % 2 != 0) {
                str2.hashCode();
                throw null;
            }
            iHashCode = str2.hashCode();
            getDeviceData = (BuildConfig + 19) % 128;
        } else {
            iHashCode = 0;
        }
        int i12 = (iHashCode3 + iHashCode) * 31;
        String str3 = this.AuthenticationRequestParameters;
        if (str3 != null) {
            int i13 = BuildConfig + 29;
            getDeviceData = i13 % 128;
            if (i13 % 2 != 0) {
                str3.hashCode();
                throw null;
            }
            iHashCode2 = str3.hashCode();
        }
        return i12 + iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        getDeviceData = (BuildConfig + 81) % 128;
        getDeviceData(parcel, this.getSDKTransactionID);
        getDeviceData(parcel, this.getSDKAppID);
        getDeviceData(parcel, this.AuthenticationRequestParameters);
        int i12 = BuildConfig + 101;
        getDeviceData = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    private static void getDeviceData(Parcel parcel, String str) {
        int i11 = BuildConfig;
        getDeviceData = (i11 + 63) % 128;
        if (str != null) {
            int i12 = i11 + 39;
            getDeviceData = i12 % 128;
            if (i12 % 2 == 0) {
                parcel.writeString(str);
                return;
            } else {
                parcel.writeString(str);
                throw null;
            }
        }
        parcel.writeString(null);
    }

    private static String getDeviceData(Parcel parcel) {
        getDeviceData = (BuildConfig + 115) % 128;
        String string = parcel.readString();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        getDeviceData = (BuildConfig + 97) % 128;
        return string;
    }

    public final String getSDKAppID() {
        int i11 = (getDeviceData + 25) % 128;
        BuildConfig = i11;
        String str = this.getSDKAppID;
        getDeviceData = (i11 + 109) % 128;
        return str;
    }

    public final String getSDKTransactionID() {
        int iAuthenticationRequestParameters = getErrorDetails.getSDKAppID.AuthenticationRequestParameters();
        int iAuthenticationRequestParameters2 = getErrorDetails.getSDKAppID.AuthenticationRequestParameters();
        int iAuthenticationRequestParameters3 = getErrorDetails.getSDKAppID.AuthenticationRequestParameters();
        return (String) getSDKReferenceNumber(getErrorDetails.getSDKAppID.AuthenticationRequestParameters(), new Object[]{this}, 998203758, iAuthenticationRequestParameters2, iAuthenticationRequestParameters, -998203758, iAuthenticationRequestParameters3);
    }

    public final void getSDKReferenceNumber() {
        int i11 = BuildConfig + 45;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            this.getSDKTransactionID = null;
            this.getSDKAppID = null;
            this.AuthenticationRequestParameters = null;
        } else {
            this.getSDKTransactionID = null;
            this.getSDKAppID = null;
            this.AuthenticationRequestParameters = null;
            throw null;
        }
    }

    public static getMessageVersion getSDKReferenceNumber(b0 b0Var, atd.am.getSDKReferenceNumber getsdkreferencenumber) throws atd.ac.getSDKAppID {
        int iAuthenticationRequestParameters = getErrorDetails.getSDKAppID.AuthenticationRequestParameters();
        int iAuthenticationRequestParameters2 = getErrorDetails.getSDKAppID.AuthenticationRequestParameters();
        int iAuthenticationRequestParameters3 = getErrorDetails.getSDKAppID.AuthenticationRequestParameters();
        return (getMessageVersion) getSDKReferenceNumber(getErrorDetails.getSDKAppID.AuthenticationRequestParameters(), new Object[]{b0Var, getsdkreferencenumber}, -155256688, iAuthenticationRequestParameters2, iAuthenticationRequestParameters, 155256689, iAuthenticationRequestParameters3);
    }

    public getMessageVersion(Parcel parcel) {
        this.getSDKTransactionID = getDeviceData(parcel);
        this.getSDKAppID = getDeviceData(parcel);
        this.AuthenticationRequestParameters = getDeviceData(parcel);
    }
}
