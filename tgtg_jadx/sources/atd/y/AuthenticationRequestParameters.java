package atd.y;

import android.app.Application;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import r8.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/DtmfToneTypeWhenDialing;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDtmfToneTypeWhenDialing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DtmfToneTypeWhenDialing.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/DtmfToneTypeWhenDialing\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"})
public final class AuthenticationRequestParameters extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static int ChallengeResultCancelled;
    private static char getDeviceData;
    private static int getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(byte r5, byte r6, int r7) {
        /*
            int r6 = 122 - r6
            int r5 = r5 * 4
            int r0 = 1 - r5
            int r7 = r7 * 3
            int r7 = r7 + 4
            byte[] r1 = atd.y.AuthenticationRequestParameters.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L17
            r6 = r5
            r4 = r7
            r3 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
        L27:
            int r7 = r7 + 1
            int r6 = r6 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.AuthenticationRequestParameters.$$d(byte, byte, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResultCancelled = 0;
        getSDKEphemeralPublicKey = 1;
        getSDKReferenceNumber = 0;
        getSDKAppID = 1;
        getSDKAppID();
        MotionEvent.axisFromString("");
        ViewConfiguration.getFadingEdgeLength();
        new getDeviceData((byte) 0);
        int i11 = ChallengeResultCancelled + 111;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 15 / 0;
        }
    }

    private AuthenticationRequestParameters(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKTransactionID = getsdkreferencenumber;
    }

    private static void b(int i11, byte b8, String str, Object[] objArr) throws Throwable {
        int i12;
        char c3;
        int i13;
        char c7;
        int i14;
        char c8;
        char c11;
        int i15;
        char c12 = 3;
        int i16 = $11 + 3;
        $10 = i16 % 128;
        char c13 = 2;
        if (i16 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.bb.ChallengeResultKt challengeResultKt = new atd.bb.ChallengeResultKt();
        char[] cArr = AuthenticationRequestParameters;
        Class cls = Integer.TYPE;
        int i17 = -317146529;
        int i18 = 0;
        if (cArr != null) {
            $10 = ($11 + 61) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i19 = 0;
            while (i19 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i19])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(i17);
                    if (sDKTransactionID == null) {
                        c8 = c12;
                        c11 = c13;
                        byte b11 = (byte) 0;
                        i15 = i17;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getDoubleTapTimeout() >> 16) + 2158, (char) Color.red(0), 36 - KeyEvent.keyCodeFromString(""), 829471823, false, $$d(b11, (byte) (b11 | 57), b11), new Class[]{cls});
                    } else {
                        c8 = c12;
                        c11 = c13;
                        i15 = i17;
                    }
                    cArr2[i19] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i19++;
                    i17 = i15;
                    c12 = c8;
                    c13 = c11;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char c14 = c12;
        char c15 = c13;
        int i21 = i17;
        Object[] objArr3 = {Integer.valueOf(getDeviceData)};
        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i21);
        char c16 = '\b';
        float f11 = 0.0f;
        if (sDKTransactionID2 == null) {
            byte b12 = (byte) 0;
            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(2159 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 35 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 829471823, false, $$d(b12, (byte) (b12 | 57), b12), new Class[]{cls});
        }
        char cCharValue = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
        char[] cArr3 = new char[i11];
        if (i11 % 2 != 0) {
            i12 = i11 - 1;
            cArr3[i12] = (char) (charArray[i12] - b8);
        } else {
            i12 = i11;
        }
        int i22 = 1;
        if (i12 > 1) {
            int i23 = $11 + 39;
            $10 = i23 % 128;
            int i24 = i23 % 2;
            challengeResultKt.getSDKReferenceNumber = 0;
            while (true) {
                int i25 = challengeResultKt.getSDKReferenceNumber;
                if (i25 >= i12) {
                    break;
                }
                char c17 = charArray[i25];
                challengeResultKt.getDeviceData = c17;
                char c18 = charArray[i25 + 1];
                challengeResultKt.getSDKAppID = c18;
                if (c17 == c18) {
                    cArr3[i25] = (char) (c17 - b8);
                    cArr3[i25 + 1] = (char) (c18 - b8);
                    c3 = c16;
                    i14 = i18;
                    i13 = i22;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = challengeResultKt;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = challengeResultKt;
                    objArr4[9] = challengeResultKt;
                    objArr4[c16] = Integer.valueOf(cCharValue);
                    objArr4[7] = challengeResultKt;
                    objArr4[6] = challengeResultKt;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = challengeResultKt;
                    objArr4[c14] = challengeResultKt;
                    objArr4[c15] = Integer.valueOf(cCharValue);
                    objArr4[i22] = challengeResultKt;
                    objArr4[i18] = challengeResultKt;
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(835518319);
                    if (sDKTransactionID3 == null) {
                        c3 = c16;
                        int i26 = (PointF.length(f11, f11) > f11 ? 1 : (PointF.length(f11, f11) == f11 ? 0 : -1)) + 1258;
                        char cAlpha = (char) (Color.alpha(i18) + 34414);
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 41;
                        c7 = '\n';
                        byte b13 = (byte) i18;
                        i13 = i22;
                        String str$$d = $$d(b13, $$a[i13], b13);
                        Class cls2 = Integer.TYPE;
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(i26, cAlpha, doubleTapTimeout, -307955329, false, str$$d, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                    } else {
                        c3 = c16;
                        i13 = i22;
                        c7 = '\n';
                    }
                    int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                    int i27 = challengeResultKt.ChallengeResultCancelled;
                    if (iIntValue == i27) {
                        $11 = ($10 + 11) % 128;
                        Object[] objArr5 = new Object[11];
                        objArr5[c7] = challengeResultKt;
                        objArr5[9] = Integer.valueOf(cCharValue);
                        objArr5[c3] = challengeResultKt;
                        objArr5[7] = Integer.valueOf(cCharValue);
                        objArr5[6] = Integer.valueOf(cCharValue);
                        objArr5[5] = challengeResultKt;
                        objArr5[4] = challengeResultKt;
                        objArr5[c14] = Integer.valueOf(cCharValue);
                        objArr5[c15] = Integer.valueOf(cCharValue);
                        objArr5[i13] = challengeResultKt;
                        objArr5[i18] = challengeResultKt;
                        Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(-758961112);
                        if (sDKTransactionID4 == null) {
                            int iRed = Color.red(i18) + 2223;
                            char cKeyCodeFromString = (char) (53070 - KeyEvent.keyCodeFromString(""));
                            int iResolveSizeAndState = View.resolveSizeAndState(i18, i18, i18) + 21;
                            byte b14 = (byte) i18;
                            byte b15 = b14;
                            i14 = i18;
                            String str$$d2 = $$d(b14, b15, b15);
                            Class cls3 = Integer.TYPE;
                            sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(iRed, cKeyCodeFromString, iResolveSizeAndState, 246098488, false, str$$d2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                        } else {
                            i14 = i18;
                        }
                        int iIntValue2 = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                        int i28 = (challengeResultKt.getSDKTransactionID * cCharValue) + challengeResultKt.ChallengeResultCancelled;
                        int i29 = challengeResultKt.getSDKReferenceNumber;
                        cArr3[i29] = cArr[iIntValue2];
                        cArr3[i29 + 1] = cArr[i28];
                    } else {
                        i14 = i18;
                        int i31 = challengeResultKt.AuthenticationRequestParameters;
                        int i32 = challengeResultKt.getSDKTransactionID;
                        if (i31 == i32) {
                            $11 = ($10 + 1) % 128;
                            int i33 = i13;
                            int iC = k.c(challengeResultKt.getMessageVersion, cCharValue, i33, cCharValue);
                            challengeResultKt.getMessageVersion = iC;
                            int iC2 = k.c(i27, cCharValue, i33, cCharValue);
                            challengeResultKt.ChallengeResultCancelled = iC2;
                            int i34 = (i32 * cCharValue) + iC2;
                            int i35 = challengeResultKt.getSDKReferenceNumber;
                            cArr3[i35] = cArr[(i31 * cCharValue) + iC];
                            cArr3[i35 + i33] = cArr[i34];
                            i13 = 1;
                        } else {
                            int i36 = (i31 * cCharValue) + i27;
                            int i37 = (i32 * cCharValue) + challengeResultKt.getMessageVersion;
                            int i38 = challengeResultKt.getSDKReferenceNumber;
                            cArr3[i38] = cArr[i36];
                            i13 = 1;
                            cArr3[i38 + 1] = cArr[i37];
                        }
                    }
                }
                challengeResultKt.getSDKReferenceNumber += 2;
                c16 = c3;
                i18 = i14;
                i22 = i13;
                f11 = 0.0f;
            }
        }
        int i39 = i18;
        for (int i41 = i39; i41 < i11; i41++) {
            cArr3[i41] = (char) (cArr3[i41] ^ 13722);
        }
        objArr[i39] = new String(cArr3);
    }

    public static void getSDKAppID() {
        AuthenticationRequestParameters = new char[]{30873, 30882, 30898, 30883, 30965, 30888, 30875, 30855, 30889, 30967, 30911, 30902, 30891, 30880, 30874, 30966};
        getDeviceData = (char) 19800;
    }

    public static void init$0() {
        $$a = new byte[]{69, 55, 70, -102};
        $$b = 161;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        Boolean sDKTransactionID;
        atd.t.getSDKReferenceNumber getsdkreferencenumber = this.getSDKTransactionID;
        Object[] objArr = new Object[1];
        b((ViewConfiguration.getPressedStateDuration() >> 16) + 14, (byte) (113 - KeyEvent.normalizeMetaState(0)), "\u0002\u0003\r\u000e\u0001\u0003\t\u0004\u0000\u0001\u0006\u000e\u000f\u0007", objArr);
        String strAuthenticationRequestParameters = getsdkreferencenumber.AuthenticationRequestParameters(((String) objArr[0]).intern());
        if (strAuthenticationRequestParameters == null || (sDKTransactionID = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKTransactionID(strAuthenticationRequestParameters)) == null) {
            DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
            getSDKAppID = (getSDKReferenceNumber + 15) % 128;
            return failure;
        }
        int i11 = getSDKReferenceNumber + 43;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            return a0.h(sDKTransactionID);
        }
        int i12 = 24 / 0;
        return a0.h(sDKTransactionID);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/DtmfToneTypeWhenDialing$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static char[] getSDKAppID;
        private static int getSDKReferenceNumber;

        private static String $$e(short s7, int i11, byte b8) {
            int i12 = b8 * 3;
            int i13 = 110 - s7;
            int i14 = 3 - (i11 * 4);
            byte[] bArr = $$c;
            byte[] bArr2 = new byte[1 - i12];
            int i15 = 0 - i12;
            int i16 = -1;
            if (bArr == null) {
                i13 = (-i13) + i15;
                i14 = i14;
                bArr = bArr;
                i16 = -1;
            }
            while (true) {
                int i17 = i16 + 1;
                int i18 = i14 + 1;
                bArr2[i17] = (byte) i13;
                if (i17 == i15) {
                    return new String(bArr2, 0);
                }
                i13 = (-bArr[i18]) + i13;
                i14 = i18;
                bArr = bArr;
                i16 = i17;
            }
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            AuthenticationRequestParameters = 0;
            getSDKReferenceNumber = 1;
            getSDKAppID = new char[]{63245, 63344, 63119, 63114, 63421, 63462, 63460, 63457, 63459, 63446, 63410, 63454, 63460, 63467, 63463, 63462, 63466, 63460, 63455, 63429, 63461, 63464, 63465, 63426, 63432, 63460, 63460, 63466, 63420, 63465, 63459, 63471, 63441, 63462, 63465, 63464, 63464, 63464, 63460, 63485, 63421, 63464, 63464, 63464, 63465, 63462, 63441, 63410, 63454, 63460, 63467, 63463, 63462, 63466, 63460, 63455, 63429, 63461, 63464, 63465, 63426, 63432, 63460, 63460, 63466, 63457, 63443, 63311, 63309, 63310, 63282, 63269, 63292, 63310, 63421, 63461, 63483, 63465, 63470, 63487, 63484, 63483, 63459, 63444, 63468, 63459, 63465, 63414, 63460, 63459, 63459, 63462, 63464, 63462, 63462, 63447, 63469, 63459, 63465, 63458, 63459, 63461, 63483, 63465};
        }

        private getDeviceData() {
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00f5 A[Catch: all -> 0x01df, TryCatch #0 {all -> 0x01df, blocks: (B:10:0x003b, B:12:0x004c, B:14:0x0089, B:32:0x00dd, B:34:0x00f5, B:35:0x0123, B:44:0x0199, B:46:0x01ab, B:47:0x01d5, B:38:0x0136, B:40:0x0150, B:41:0x0185), top: B:74:0x003b }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0150 A[Catch: all -> 0x01df, TryCatch #0 {all -> 0x01df, blocks: (B:10:0x003b, B:12:0x004c, B:14:0x0089, B:32:0x00dd, B:34:0x00f5, B:35:0x0123, B:44:0x0199, B:46:0x01ab, B:47:0x01d5, B:38:0x0136, B:40:0x0150, B:41:0x0185), top: B:74:0x003b }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int[] r29, java.lang.String r30, boolean r31, java.lang.Object[] r32) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 582
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.y.AuthenticationRequestParameters.getDeviceData.a(int[], java.lang.String, boolean, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(byte r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                int r8 = 19 - r8
                int r6 = 25 - r6
                byte[] r0 = atd.y.AuthenticationRequestParameters.getDeviceData.$$a
                int r7 = r7 + 101
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L11
                r3 = r0
                r4 = r2
                r0 = r8
                goto L28
            L11:
                r3 = r2
            L12:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r8) goto L21
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L21:
                r4 = r0[r6]
                r5 = r0
                r0 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L28:
                int r7 = -r7
                int r0 = r0 + r7
                int r6 = r6 + 1
                int r7 = r0 + (-11)
                r0 = r3
                r3 = r4
                goto L12
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.y.AuthenticationRequestParameters.getDeviceData.b(byte, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x01e1 A[PHI: r25
          0x01e1: PHI (r25v4 int) = (r25v3 int), (r25v5 int) binds: [B:24:0x01df, B:18:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int getSDKTransactionID(java.util.List r33) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1394
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.y.AuthenticationRequestParameters.getDeviceData.getSDKTransactionID(java.util.List):int");
        }

        public static void init$0() {
            $$a = new byte[]{49, -90, -82, 29, -9, -26, 22, 4, -18, -20, -41, 6, -24, -16, 7, -13, -28, 0, -17, -10, 26, -6, 32, -34, 41, 0, -18, -19};
            $$b = 175;
        }

        public static void init$1() {
            $$c = new byte[]{77, 37, -113, 18};
            $$d = 217;
        }

        public /* synthetic */ getDeviceData(byte b8) {
            this();
        }
    }

    public /* synthetic */ AuthenticationRequestParameters(Application application) {
        this(application, new atd.t.AuthenticationRequestParameters(application));
    }
}
