package atd.k;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.app.tgtg.model.local.AppConstants;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import r8.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Platform;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResultKt extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int getDeviceData;
    private static char[] getSDKAppID;
    private static char getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(byte r6, int r7, int r8) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 1
            byte[] r0 = atd.k.ChallengeResultKt.$$a
            int r7 = r7 + 65
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r6]
            r5 = r0
            r0 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r7 = -r7
            int r7 = r7 + r0
            int r6 = r6 + 1
            r0 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.k.ChallengeResultKt.$$d(byte, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        BuildConfig = 1;
        getSDKTransactionID = 0;
        AuthenticationRequestParameters = 1;
        getSDKTransactionID();
        Process.getElapsedCpuTime();
        SystemClock.currentThreadTimeMillis();
        new AuthenticationRequestParameters((byte) 0);
        getDeviceData = (BuildConfig + 3) % 128;
    }

    private static void b(int i11, byte b8, String str, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        char c3;
        char c7;
        char c8;
        int i13;
        char c11;
        int i14;
        float f11;
        if (str != null) {
            $11 = ($10 + 55) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        atd.bb.ChallengeResultKt challengeResultKt = new atd.bb.ChallengeResultKt();
        char[] cArr2 = getSDKAppID;
        Class cls = Integer.TYPE;
        int i15 = -317146529;
        float f12 = 0.0f;
        int i16 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i17 = 0;
            while (i17 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i17])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(i15);
                    if (sDKTransactionID == null) {
                        int iCombineMeasuredStates = View.combineMeasuredStates(i16, i16) + 2158;
                        char cMyTid = (char) (Process.myTid() >> 22);
                        int i18 = 36 - (PointF.length(f12, f12) > f12 ? 1 : (PointF.length(f12, f12) == f12 ? 0 : -1));
                        i14 = i15;
                        byte b11 = (byte) i16;
                        f11 = f12;
                        byte b12 = b11;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(iCombineMeasuredStates, cMyTid, i18, 829471823, false, $$d(b11, b12, b12), new Class[]{cls});
                    } else {
                        i14 = i15;
                        f11 = f12;
                    }
                    cArr3[i17] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i17++;
                    i15 = i14;
                    f12 = f11;
                    i16 = 0;
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
        int i19 = i15;
        float f13 = f12;
        Object[] objArr3 = {Integer.valueOf(getSDKReferenceNumber)};
        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i19);
        char c12 = '0';
        char c13 = '\b';
        if (sDKTransactionID2 == null) {
            byte b13 = (byte) 0;
            byte b14 = b13;
            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2157, (char) (ViewConfiguration.getScrollBarSize() >> 8), AndroidCharacter.getMirror('0') - '\f', 829471823, false, $$d(b13, b14, b14), new Class[]{cls});
        }
        char cCharValue = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i11];
        if (i11 % 2 != 0) {
            i12 = i11 - 1;
            cArr4[i12] = (char) (cArr[i12] - b8);
        } else {
            i12 = i11;
        }
        char c14 = 2;
        int i21 = 1;
        if (i12 > 1) {
            $10 = ($11 + 99) % 128;
            challengeResultKt.getSDKReferenceNumber = 0;
            while (true) {
                int i22 = challengeResultKt.getSDKReferenceNumber;
                if (i22 >= i12) {
                    break;
                }
                char c15 = cArr[i22];
                challengeResultKt.getDeviceData = c15;
                char c16 = cArr[i22 + 1];
                challengeResultKt.getSDKAppID = c16;
                if (c15 == c16) {
                    cArr4[i22] = (char) (c15 - b8);
                    cArr4[i22 + 1] = (char) (c16 - b8);
                    c3 = c12;
                    c7 = c13;
                    c8 = c14;
                    i13 = i21;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = challengeResultKt;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = challengeResultKt;
                    objArr4[9] = challengeResultKt;
                    objArr4[c13] = Integer.valueOf(cCharValue);
                    objArr4[7] = challengeResultKt;
                    objArr4[6] = challengeResultKt;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = challengeResultKt;
                    objArr4[3] = challengeResultKt;
                    objArr4[c14] = Integer.valueOf(cCharValue);
                    objArr4[i21] = challengeResultKt;
                    objArr4[0] = challengeResultKt;
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(835518319);
                    if (sDKTransactionID3 == null) {
                        c3 = c12;
                        int i23 = 1258 - (AudioTrack.getMinVolume() > f13 ? 1 : (AudioTrack.getMinVolume() == f13 ? 0 : -1));
                        c7 = c13;
                        char mirror = (char) (34462 - AndroidCharacter.getMirror(c3));
                        int iIndexOf = TextUtils.indexOf("", "") + 41;
                        c8 = c14;
                        c11 = '\n';
                        byte b15 = (byte) 0;
                        byte b16 = (byte) (b15 + 2);
                        i13 = i21;
                        String str$$d = $$d(b15, b16, (byte) (b16 - 2));
                        Class cls2 = Integer.TYPE;
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(i23, mirror, iIndexOf, -307955329, false, str$$d, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                    } else {
                        c3 = c12;
                        c7 = c13;
                        c8 = c14;
                        i13 = i21;
                        c11 = '\n';
                    }
                    int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                    int i24 = challengeResultKt.ChallengeResultCancelled;
                    if (iIntValue == i24) {
                        $10 = ($11 + 61) % 128;
                        Object[] objArr5 = new Object[11];
                        objArr5[c11] = challengeResultKt;
                        objArr5[9] = Integer.valueOf(cCharValue);
                        objArr5[c7] = challengeResultKt;
                        objArr5[7] = Integer.valueOf(cCharValue);
                        objArr5[6] = Integer.valueOf(cCharValue);
                        objArr5[5] = challengeResultKt;
                        objArr5[4] = challengeResultKt;
                        objArr5[3] = Integer.valueOf(cCharValue);
                        objArr5[c8] = Integer.valueOf(cCharValue);
                        objArr5[i13] = challengeResultKt;
                        objArr5[0] = challengeResultKt;
                        Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(-758961112);
                        if (sDKTransactionID4 == null) {
                            int threadPriority = 2223 - ((Process.getThreadPriority(0) + 20) >> 6);
                            char maximumFlingVelocity = (char) (53070 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                            int iAlpha = 21 - Color.alpha(0);
                            byte b17 = (byte) 0;
                            String str$$d2 = $$d(b17, (byte) (b17 | 57), b17);
                            Class cls3 = Integer.TYPE;
                            sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(threadPriority, maximumFlingVelocity, iAlpha, 246098488, false, str$$d2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                        int i25 = (challengeResultKt.getSDKTransactionID * cCharValue) + challengeResultKt.ChallengeResultCancelled;
                        int i26 = challengeResultKt.getSDKReferenceNumber;
                        cArr4[i26] = cArr2[iIntValue2];
                        cArr4[i26 + 1] = cArr2[i25];
                    } else {
                        int i27 = challengeResultKt.AuthenticationRequestParameters;
                        int i28 = challengeResultKt.getSDKTransactionID;
                        if (i27 == i28) {
                            $11 = ($10 + 43) % 128;
                            int i29 = i13;
                            int iC = k.c(challengeResultKt.getMessageVersion, cCharValue, i29, cCharValue);
                            challengeResultKt.getMessageVersion = iC;
                            int iC2 = k.c(i24, cCharValue, i29, cCharValue);
                            challengeResultKt.ChallengeResultCancelled = iC2;
                            int i31 = (i28 * cCharValue) + iC2;
                            int i32 = challengeResultKt.getSDKReferenceNumber;
                            cArr4[i32] = cArr2[(i27 * cCharValue) + iC];
                            cArr4[i32 + i29] = cArr2[i31];
                            i13 = 1;
                        } else {
                            int i33 = (i27 * cCharValue) + i24;
                            int i34 = (i28 * cCharValue) + challengeResultKt.getMessageVersion;
                            int i35 = challengeResultKt.getSDKReferenceNumber;
                            cArr4[i35] = cArr2[i33];
                            i13 = 1;
                            cArr4[i35 + 1] = cArr2[i34];
                        }
                    }
                }
                challengeResultKt.getSDKReferenceNumber += 2;
                c12 = c3;
                c13 = c7;
                c14 = c8;
                i21 = i13;
            }
        }
        int i36 = 0;
        while (i36 < i11) {
            int i37 = $10 + 109;
            $11 = i37 % 128;
            if (i37 % 2 == 0) {
                cArr4[i36] = (char) (cArr4[i36] ^ 6924);
                i36 += AppConstants.RESULT_CODE_ORDER_CANCELLED;
            } else {
                cArr4[i36] = (char) (cArr4[i36] ^ 13722);
                i36++;
            }
        }
        String str2 = new String(cArr4);
        int i38 = $10 + 119;
        $11 = i38 % 128;
        if (i38 % 2 == 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    @NotNull
    private static String getSDKAppID() throws Throwable {
        Object obj;
        int i11 = getSDKTransactionID + 41;
        AuthenticationRequestParameters = i11 % 128;
        int i12 = i11 % 2;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (i12 == 0) {
            Object[] objArr = new Object[1];
            b(36 << (jUptimeMillis > 0L ? 1 : (jUptimeMillis == 0L ? 0 : -1)), (byte) (46 << (ViewConfiguration.getMinimumFlingVelocity() / 14)), "\b\u0001\u0003\u0004\u0003\u0001㘱", objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            b(8 - (jUptimeMillis > 0L ? 1 : (jUptimeMillis == 0L ? 0 : -1)), (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 51), "\b\u0001\u0003\u0004\u0003\u0001㘱", objArr2);
            obj = objArr2[0];
        }
        return DeviceParameterResult.Success.StringValue.m165constructorimpl(((String) obj).intern());
    }

    public static void getSDKTransactionID() {
        getSDKAppID = new char[]{30895, 30967, 30888, 30900, 30889, 30882, 30853, 30855, 30966};
        getSDKReferenceNumber = (char) 19807;
    }

    public static void init$0() {
        $$a = new byte[]{29, 9, 51, -111};
        $$b = 93;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getSDKReferenceNumber() {
        AuthenticationRequestParameters = (getSDKTransactionID + 45) % 128;
        DeviceParameterResult.Success.StringValue stringValueM164boximpl = DeviceParameterResult.Success.StringValue.m164boximpl(getSDKAppID());
        getSDKTransactionID = (AuthenticationRequestParameters + 85) % 128;
        return stringValueM164boximpl;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Platform$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static long AuthenticationRequestParameters;
        private static int getDeviceData;
        private static int getSDKAppID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(int r6, byte r7, int r8) {
            /*
                byte[] r0 = atd.k.ChallengeResultKt.AuthenticationRequestParameters.$$c
                int r7 = r7 * 4
                int r7 = 1 - r7
                int r6 = r6 * 4
                int r6 = r6 + 4
                int r8 = r8 * 2
                int r8 = 99 - r8
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r8 = r6
                r3 = r7
                r5 = r2
                goto L2a
            L17:
                r3 = r8
                r8 = r6
                r6 = r3
                r3 = r2
            L1b:
                byte r4 = (byte) r6
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r7) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L28:
                r3 = r0[r8]
            L2a:
                int r6 = r6 + r3
                int r8 = r8 + 1
                r3 = r5
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.k.ChallengeResultKt.AuthenticationRequestParameters.$$e(int, byte, int):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getDeviceData = 0;
            getSDKAppID = 1;
            AuthenticationRequestParameters = 1000633899230051770L;
        }

        private AuthenticationRequestParameters() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 15
                int r6 = 26 - r6
                int r7 = r7 * 25
                int r7 = r7 + 4
                int r8 = r8 * 6
                int r8 = r8 + 97
                byte[] r0 = atd.k.ChallengeResultKt.AuthenticationRequestParameters.$$a
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r8
                r4 = r2
                r8 = r6
                goto L29
            L17:
                r3 = r2
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                r3 = r0[r7]
            L29:
                int r8 = r8 + r3
                int r7 = r7 + 1
                int r8 = r8 + (-5)
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.k.ChallengeResultKt.AuthenticationRequestParameters.a(int, byte, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(java.lang.String r22, int r23, java.lang.Object[] r24) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 330
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.k.ChallengeResultKt.AuthenticationRequestParameters.b(java.lang.String, int, java.lang.Object[]):void");
        }

        public static void getDeviceData(long j9, long j11) throws Throwable {
            getDeviceData = (getSDKAppID + 97) % 128;
            byte[] bArr = $$a;
            byte b8 = bArr[28];
            byte b11 = b8;
            Object[] objArr = new Object[1];
            a(b8, b11, b11, objArr);
            a0.B(null, (String) objArr[0], "AuthenticationRequestParameters");
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
                Object[] objArr4 = {atd.as.getSDKReferenceNumber.class.getField("getDeviceData").get(null)};
                Object[] objArr5 = new Object[1];
                b("\u2433坡슘", 29527 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr5);
                Method method2 = Set.class.getMethod(((String) objArr5[0]).intern(), Object.class);
                method2.setAccessible(true);
                getDeviceData = (getSDKAppID + 11) % 128;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }

        public static void init$0() {
            $$a = new byte[]{126, 54, -127, -24, 24, -11, -49, 56, 22, -63, 62, 3, 20, -28, -10, 12, 14, 35, -12, 18, 10, -13, 7, 22, -6, 11, 4, -32, 0, 3, 20, -28, -10, 12, -5, 52, 5, -34, 0};
            $$b = 238;
        }

        public static void init$1() {
            $$c = new byte[]{47, -17, 30, 95};
            $$d = 87;
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b8) {
            this();
        }
    }
}
