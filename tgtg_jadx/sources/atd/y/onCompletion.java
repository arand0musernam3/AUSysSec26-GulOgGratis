package atd.y;

import android.app.Application;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/ScreenOffTimeout;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScreenOffTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenOffTimeout.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/ScreenOffTimeout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,30:1\n1#2:31\n*E\n"})
public final class onCompletion extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static long getSDKReferenceNumber;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(byte r6, short r7, short r8) {
        /*
            int r6 = r6 * 2
            int r6 = 3 - r6
            int r8 = r8 * 3
            int r8 = r8 + 120
            int r7 = r7 * 3
            int r0 = 1 - r7
            byte[] r1 = atd.y.onCompletion.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L19
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2e
        L19:
            r3 = r2
        L1a:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L27:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2e:
            int r6 = r6 + r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.onCompletion.$$d(byte, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        getMessageVersion = 1;
        AuthenticationRequestParameters = 0;
        getDeviceData = 1;
        getSDKTransactionID();
        ViewConfiguration.getTouchSlop();
        new getSDKReferenceNumber((byte) 0);
        int i11 = getMessageVersion + 69;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 15 / 0;
        }
    }

    private onCompletion(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKTransactionID = getsdkreferencenumber;
    }

    private static void b(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        if (str != null) {
            charArray = str.toCharArray();
            $10 = ($11 + 77) % 128;
        } else {
            charArray = str;
        }
        atd.bb.completed completedVar = new atd.bb.completed();
        char[] sDKTransactionID = atd.bb.completed.getSDKTransactionID(getSDKReferenceNumber ^ 2436480605514729170L, charArray, i11);
        completedVar.getSDKTransactionID = 4;
        while (true) {
            int i12 = completedVar.getSDKTransactionID;
            if (i12 >= sDKTransactionID.length) {
                objArr[0] = new String(sDKTransactionID, 4, sDKTransactionID.length - 4);
                return;
            }
            $10 = ($11 + 79) % 128;
            int i13 = i12 - 4;
            completedVar.getSDKAppID = i13;
            try {
                Object[] objArr2 = {Long.valueOf(sDKTransactionID[i12] ^ sDKTransactionID[i12 % 4]), Long.valueOf(i13), Long.valueOf(getSDKReferenceNumber)};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(2011691457);
                if (sDKTransactionID2 == null) {
                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 2774;
                    char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 13060);
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 25;
                    byte b8 = (byte) 0;
                    byte b11 = b8;
                    String str$$d = $$d(b8, b11, b11);
                    Class cls = Long.TYPE;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(iIndexOf, jumpTapTimeout, edgeSlop, -1416626223, false, str$$d, new Class[]{cls, cls, cls});
                }
                sDKTransactionID[i12] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {completedVar, completedVar};
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-721583866);
                if (sDKTransactionID3 == null) {
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 407, (char) TextUtils.indexOf("", "", 0, 0), TextUtils.indexOf("", "", 0) + 30, 144017174, false, "y", new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr3);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    public static void getSDKTransactionID() {
        getSDKReferenceNumber = 6026607276067598044L;
    }

    public static void init$0() {
        $$a = new byte[]{49, -90, -82, 29};
        $$b = 87;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0041 A[PHI: r0
      0x0041: PHI (r0v8 java.lang.String) = (r0v7 java.lang.String), (r0v20 java.lang.String) binds: [B:8:0x003f, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() throws java.lang.Throwable {
        /*
            r5 = this;
            int r0 = atd.y.onCompletion.getDeviceData
            int r0 = r0 + 3
            int r1 = r0 % 128
            atd.y.onCompletion.AuthenticationRequestParameters = r1
            int r0 = r0 % 2
            atd.t.getSDKReferenceNumber r1 = r5.getSDKTransactionID
            java.lang.String r2 = "ⒽⓎ膚层⧷బ뺛䛔蓠懟ﰧ⚖撫쇯鳿虵쑼ꄬ㲍昦ꐨŭ"
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L2a
            int r0 = android.graphics.Color.argb(r3, r3, r4, r3)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            b(r2, r0, r3)
            r0 = r3[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L6e
            goto L41
        L2a:
            int r0 = android.graphics.Color.argb(r4, r4, r4, r4)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            b(r2, r0, r3)
            r0 = r3[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L6e
        L41:
            int r1 = atd.y.onCompletion.getDeviceData
            int r1 = r1 + 79
            int r1 = r1 % 128
            atd.y.onCompletion.AuthenticationRequestParameters = r1
            java.lang.Integer r0 = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKReferenceNumber(r0)
            r1 = 0
            if (r0 == 0) goto L5d
            int r0 = r0.intValue()
            int r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.m151constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$IntValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.m150boximpl(r0)
            goto L5e
        L5d:
            r0 = r1
        L5e:
            if (r0 == 0) goto L6e
            int r2 = atd.y.onCompletion.getDeviceData
            int r2 = r2 + 19
            int r3 = r2 % 128
            atd.y.onCompletion.AuthenticationRequestParameters = r3
            int r2 = r2 % 2
            if (r2 != 0) goto L6d
            return r0
        L6d:
            throw r1
        L6e:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.onCompletion.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/ScreenOffTimeout$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static int BuildConfig;
        private static char getDeviceData;
        private static char getSDKAppID;
        private static char getSDKReferenceNumber;
        private static char getSDKTransactionID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(short r6, byte r7, int r8) {
            /*
                int r6 = r6 * 3
                int r6 = r6 + 66
                byte[] r0 = atd.y.onCompletion.getSDKReferenceNumber.$$c
                int r7 = r7 + 4
                int r8 = r8 * 2
                int r8 = r8 + 1
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r0
                r4 = r2
                r0 = r7
                goto L2d
            L15:
                r3 = r2
            L16:
                int r7 = r7 + 1
                byte r4 = (byte) r6
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r8) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L25:
                r4 = r0[r7]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r0
                r0 = r5
            L2d:
                int r6 = r6 + r7
                r7 = r0
                r0 = r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.y.onCompletion.getSDKReferenceNumber.$$e(short, byte, int):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            AuthenticationRequestParameters = 0;
            BuildConfig = 1;
            getSDKTransactionID = (char) 25266;
            getSDKAppID = (char) 16302;
            getDeviceData = (char) 15016;
            getSDKReferenceNumber = (char) 55452;
        }

        private getSDKReferenceNumber() {
        }

        private static void a(String str, int i11, Object[] objArr) throws Throwable {
            int i12;
            int i13;
            int i14;
            char[] charArray = str != null ? str.toCharArray() : str;
            atd.bb.ChallengeResultCompleted challengeResultCompleted = new atd.bb.ChallengeResultCompleted();
            char[] cArr = new char[charArray.length];
            int i15 = 0;
            challengeResultCompleted.getDeviceData = 0;
            int i16 = 2;
            char[] cArr2 = new char[2];
            while (true) {
                int i17 = challengeResultCompleted.getDeviceData;
                Object obj = null;
                if (i17 >= charArray.length) {
                    break;
                }
                int i18 = $11 + 89;
                $10 = i18 % 128;
                int i19 = 58224;
                char c3 = 1;
                if (i18 % i16 != 0) {
                    cArr2[i15] = charArray[i17];
                    cArr2[i15] = charArray[i17];
                } else {
                    cArr2[i15] = charArray[i17];
                    cArr2[1] = charArray[i17 + 1];
                }
                int i21 = i15;
                while (i21 < 16) {
                    $11 = ($10 + 69) % 128;
                    char c7 = cArr2[c3];
                    char c8 = cArr2[i15];
                    char c11 = c3;
                    int i22 = (c8 + i19) ^ ((c8 << 4) + ((char) (((long) getDeviceData) ^ 5320350835299930193L)));
                    int i23 = c8 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(getSDKReferenceNumber);
                        objArr2[i16] = Integer.valueOf(i23);
                        objArr2[c11] = Integer.valueOf(i22);
                        objArr2[i15] = Integer.valueOf(c7);
                        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(906025703);
                        Class cls = Integer.TYPE;
                        if (sDKTransactionID == null) {
                            i14 = 906025703;
                            byte b8 = (byte) i15;
                            i13 = i16;
                            byte b11 = (byte) (b8 - 1);
                            i12 = i15;
                            sDKTransactionID = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2828, (char) View.getDefaultSize(i15, i15), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 27, -362226441, false, $$e(b8, b11, (byte) (b11 + 1)), new Class[]{cls, cls, cls, cls});
                        } else {
                            i12 = i15;
                            i13 = i16;
                            i14 = 906025703;
                        }
                        char cCharValue = ((Character) ((Method) sDKTransactionID).invoke(obj, objArr2)).charValue();
                        cArr2[c11] = cCharValue;
                        char c12 = cArr2[i12];
                        int i24 = i19;
                        int i25 = (cCharValue + i19) ^ ((cCharValue << 4) + ((char) (((long) getSDKTransactionID) ^ 5320350835299930193L)));
                        int i26 = cCharValue >>> 5;
                        Object[] objArr3 = new Object[4];
                        objArr3[3] = Integer.valueOf(getSDKAppID);
                        objArr3[i13] = Integer.valueOf(i26);
                        objArr3[c11] = Integer.valueOf(i25);
                        objArr3[i12] = Integer.valueOf(c12);
                        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i14);
                        if (sDKTransactionID2 == null) {
                            int i27 = 2829 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            int i28 = i12;
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', i28, i28) + 1);
                            int absoluteGravity = Gravity.getAbsoluteGravity(i28, i28) + 27;
                            byte b12 = (byte) i28;
                            byte b13 = (byte) (b12 - 1);
                            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(i27, cLastIndexOf, absoluteGravity, -362226441, false, $$e(b12, b13, (byte) (b13 + 1)), new Class[]{cls, cls, cls, cls});
                        }
                        cArr2[0] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                        i19 = i24 - 40503;
                        i21++;
                        c3 = c11;
                        i16 = i13;
                        i15 = 0;
                        obj = null;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                int i29 = i16;
                char c13 = c3;
                int i31 = challengeResultCompleted.getDeviceData;
                cArr[i31] = cArr2[0];
                cArr[i31 + 1] = cArr2[c13];
                Object[] objArr4 = new Object[i29];
                objArr4[c13] = challengeResultCompleted;
                objArr4[0] = challengeResultCompleted;
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-1859796622);
                if (sDKTransactionID3 == null) {
                    int size = View.MeasureSpec.getSize(0) + 3156;
                    char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 25797);
                    int iResolveOpacity = 27 - Drawable.resolveOpacity(0, 0);
                    byte b14 = (byte) ($$d & 3);
                    byte b15 = (byte) (-b14);
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(size, pressedStateDuration, iResolveOpacity, 1296942946, false, $$e(b14, b15, (byte) (b15 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                i15 = 0;
                i16 = 2;
            }
            String str2 = new String(cArr, 0, i11);
            int i32 = $11 + 61;
            $10 = i32 % 128;
            if (i32 % 2 != 0) {
                throw null;
            }
            objArr[0] = str2;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(int r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = atd.y.onCompletion.getSDKReferenceNumber.$$a
                int r7 = r7 * 2
                int r7 = r7 + 104
                int r6 = r6 * 4
                int r6 = 4 - r6
                int r8 = r8 * 3
                int r8 = r8 + 4
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r7
                r4 = r2
                r7 = r6
                goto L29
            L17:
                r3 = r2
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                r3 = r0[r8]
            L29:
                int r7 = r7 + r3
                int r7 = r7 + (-2)
                int r8 = r8 + 1
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.y.onCompletion.getSDKReferenceNumber.b(int, byte, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x015a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x015b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object[] getDeviceData(int r32, int r33) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1237
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.y.onCompletion.getSDKReferenceNumber.getDeviceData(int, int):java.lang.Object[]");
        }

        public static void init$0() {
            $$a = new byte[]{62, -80, -102, 31, 3, -3, 3};
            $$b = 118;
        }

        public static void init$1() {
            $$c = new byte[]{88, -124, -103, 69};
            $$d = 181;
        }

        public /* synthetic */ getSDKReferenceNumber(byte b8) {
            this();
        }
    }

    public /* synthetic */ onCompletion(Application application) {
        this(application, new atd.t.AuthenticationRequestParameters(application));
    }
}
