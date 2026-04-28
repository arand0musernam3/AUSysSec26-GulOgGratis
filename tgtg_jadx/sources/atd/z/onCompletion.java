package atd.z;

import android.app.Application;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import com.braze.Constants;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.LocalizedMessage;
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/PasspointFqdn;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiDeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/PasspointProvider;", "passpointFqdn", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/PasspointProvider;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/PasspointProvider;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPasspointFqdn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PasspointFqdn.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/wifi/PasspointFqdn\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
public final class onCompletion extends getErrorCode {
    private static int AuthenticationRequestParameters = 0;
    private static int ChallengeResult = 0;
    private static long getDeviceData = 0;
    private static int getSDKEphemeralPublicKey = 1;
    private static char[] getSDKReferenceNumber = null;
    private static int getSDKTransactionID = 1;

    @NotNull
    private final completed getSDKAppID;

    static {
        AuthenticationRequestParameters();
        PointF.length(0.0f, 0.0f);
        View.MeasureSpec.getMode(0);
        TextUtils.getOffsetAfter("", 0);
        new AuthenticationRequestParameters((byte) 0);
        ChallengeResult = (getSDKEphemeralPublicKey + 23) % 128;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private onCompletion(@NotNull Application application, @NotNull PermissionChecker permissionChecker, @NotNull completed completedVar) {
        super(application, permissionChecker);
        application.getClass();
        permissionChecker.getClass();
        completedVar.getClass();
        this.getSDKAppID = completedVar;
    }

    public static void AuthenticationRequestParameters() {
        getSDKReferenceNumber = new char[]{29987, 39837, 43210, 47423};
        getDeviceData = 2506603317358631616L;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() {
        getSDKTransactionID = (AuthenticationRequestParameters + 91) % 128;
        if (Build.VERSION.SDK_INT < 29) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        }
        if (!getSDKEphemeralPublicKey()) {
            DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
            getSDKTransactionID = (AuthenticationRequestParameters + 7) % 128;
            return failure;
        }
        String strAuthenticationRequestParameters = this.getSDKAppID.AuthenticationRequestParameters();
        if (strAuthenticationRequestParameters == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        int i11 = AuthenticationRequestParameters + 9;
        getSDKTransactionID = i11 % 128;
        int i12 = i11 % 2;
        String strM165constructorimpl = DeviceParameterResult.Success.StringValue.m165constructorimpl(strAuthenticationRequestParameters);
        if (i12 != 0) {
            return DeviceParameterResult.Success.StringValue.m164boximpl(strM165constructorimpl);
        }
        DeviceParameterResult.Success.StringValue.m164boximpl(strM165constructorimpl);
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/PasspointFqdn$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static boolean getDeviceData;
        private static int getMessageVersion;
        private static char[] getSDKAppID;
        private static boolean getSDKReferenceNumber;
        private static int getSDKTransactionID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(short r6, byte r7, short r8) {
            /*
                int r8 = r8 * 2
                int r8 = 4 - r8
                int r6 = r6 * 4
                int r6 = r6 + 1
                int r7 = r7 * 4
                int r7 = r7 + 111
                byte[] r0 = atd.z.onCompletion.AuthenticationRequestParameters.$$c
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r0
                r4 = r2
                r0 = r8
                goto L30
            L17:
                r3 = r8
                r8 = r7
                r7 = r3
                r3 = r2
            L1b:
                byte r4 = (byte) r8
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L28:
                r4 = r0[r7]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r0
                r0 = r5
            L30:
                int r7 = -r7
                int r8 = r8 + 1
                int r7 = r7 + r0
                r0 = r8
                r8 = r7
                r7 = r0
                r0 = r3
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.z.onCompletion.AuthenticationRequestParameters.$$e(short, byte, short):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKTransactionID = 0;
            getMessageVersion = 1;
            getSDKAppID = new char[]{21826, 21825};
            AuthenticationRequestParameters = 1286296829;
            getSDKReferenceNumber = true;
            getDeviceData = true;
        }

        private AuthenticationRequestParameters() {
        }

        public static void AuthenticationRequestParameters(long j9, long j11) throws Throwable {
            getSDKTransactionID = (getMessageVersion + 111) % 128;
            byte[] bArr = $$a;
            byte b8 = bArr[28];
            byte b11 = b8;
            Object[] objArr = new Object[1];
            a(b8, b11, (byte) (b11 + 1), objArr);
            a0.B(null, (String) objArr[0], "AuthenticationRequestParameters");
            getMessageVersion = (getSDKTransactionID + 35) % 128;
            try {
                byte b12 = bArr[28];
                byte b13 = b12;
                Object[] objArr2 = new Object[1];
                a(b12, b13, (byte) (b13 + 1), objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                byte b14 = bArr[28];
                byte b15 = (byte) (b14 + 1);
                Object[] objArr3 = new Object[1];
                a(b15, b15, b14, objArr3);
                Method method = cls.getMethod((String) objArr3[0], null);
                method.setAccessible(true);
                Object objInvoke = method.invoke(null, null);
                Object[] objArr4 = {atd.as.getSDKEphemeralPublicKey.class.getField("getDeviceData").get(null)};
                Object[] objArr5 = new Object[1];
                b(TextUtils.lastIndexOf("", '0', 0) + 128, null, null, "\u0082\u0082\u0081", objArr5);
                Method method2 = Set.class.getMethod(((String) objArr5[0]).intern(), Object.class);
                method2.setAccessible(true);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r7, int r8, short r9, java.lang.Object[] r10) {
            /*
                int r8 = r8 * 6
                int r8 = r8 + 97
                byte[] r0 = atd.z.onCompletion.AuthenticationRequestParameters.$$a
                int r7 = r7 * 15
                int r7 = 26 - r7
                int r9 = r9 * 25
                int r9 = 29 - r9
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r0
                r4 = r2
                r0 = r9
                goto L2e
            L17:
                r3 = r2
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                r3 = r0[r9]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r0
                r0 = r6
            L2e:
                int r8 = -r8
                int r9 = r9 + r8
                int r8 = r9 + (-5)
                int r9 = r0 + 1
                r0 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.z.onCompletion.AuthenticationRequestParameters.a(int, int, short, java.lang.Object[]):void");
        }

        private static void b(int i11, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
            char[] charArray;
            int i12;
            long j9;
            String str3 = str2;
            Object bytes = str3;
            if (str3 != null) {
                $10 = ($11 + 55) % 128;
                bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
            }
            byte[] bArr = (byte[]) bytes;
            if (str != null) {
                charArray = str.toCharArray();
                $10 = ($11 + 95) % 128;
            } else {
                charArray = str;
            }
            char[] cArr = charArray;
            atd.bb.ChallengeResultTimeout challengeResultTimeout = new atd.bb.ChallengeResultTimeout();
            char[] cArr2 = getSDKAppID;
            Class cls = Integer.TYPE;
            long j11 = 0;
            int i13 = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                $11 = ($10 + 87) % 128;
                int i14 = 0;
                while (i14 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i14])};
                        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(887083134);
                        if (sDKTransactionID == null) {
                            int packedPositionType = ExpandableListView.getPackedPositionType(j11) + 2555;
                            char cResolveSize = (char) (48598 - View.resolveSize(i13, i13));
                            int packedPositionChild = ExpandableListView.getPackedPositionChild(j11) + 32;
                            j9 = j11;
                            byte b8 = (byte) i13;
                            byte b11 = b8;
                            sDKTransactionID = atd.e.ChallengeResult.getDeviceData(packedPositionType, cResolveSize, packedPositionChild, -390605202, false, $$e(b8, b11, b11), new Class[]{cls});
                        } else {
                            j9 = j11;
                        }
                        cArr3[i14] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                        i14++;
                        j11 = j9;
                        i13 = 0;
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
            long j12 = j11;
            Object[] objArr3 = {Integer.valueOf(AuthenticationRequestParameters)};
            Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-1144184369);
            if (sDKTransactionID2 == null) {
                sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(148 - (ViewConfiguration.getZoomControlsTimeout() > j12 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j12 ? 0 : -1)), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > j12 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j12 ? 0 : -1)) - 1), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 32, 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
            }
            int iIntValue = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
            int i15 = 1124287645;
            if (getDeviceData) {
                $10 = ($11 + 9) % 128;
                int length2 = bArr.length;
                challengeResultTimeout.AuthenticationRequestParameters = length2;
                char[] cArr4 = new char[length2];
                challengeResultTimeout.getSDKAppID = 0;
                while (true) {
                    int i16 = challengeResultTimeout.getSDKAppID;
                    int i17 = challengeResultTimeout.AuthenticationRequestParameters;
                    if (i16 >= i17) {
                        objArr[0] = new String(cArr4);
                        return;
                    }
                    cArr4[i16] = (char) (cArr2[bArr[(i17 - 1) - i16] + i11] - iIntValue);
                    Object[] objArr4 = {challengeResultTimeout, challengeResultTimeout};
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(i15);
                    if (sDKTransactionID3 == null) {
                        byte b12 = (byte) 0;
                        byte b13 = (byte) (b12 + 1);
                        i12 = i15;
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1697, (char) (KeyEvent.getMaxKeyCode() >> 16), 29 - (ViewConfiguration.getTapTimeout() >> 16), -1620360563, false, $$e(b12, b13, (byte) (b13 - 1)), new Class[]{Object.class, Object.class});
                    } else {
                        i12 = i15;
                    }
                    ((Method) sDKTransactionID3).invoke(null, objArr4);
                    i15 = i12;
                }
            } else if (getSDKReferenceNumber) {
                $11 = ($10 + 23) % 128;
                int length3 = cArr.length;
                challengeResultTimeout.AuthenticationRequestParameters = length3;
                char[] cArr5 = new char[length3];
                challengeResultTimeout.getSDKAppID = 0;
                while (true) {
                    int i18 = challengeResultTimeout.getSDKAppID;
                    int i19 = challengeResultTimeout.AuthenticationRequestParameters;
                    if (i18 >= i19) {
                        objArr[0] = new String(cArr5);
                        return;
                    }
                    $10 = ($11 + 17) % 128;
                    cArr5[i18] = (char) (cArr2[cArr[(i19 - 1) - i18] - i11] - iIntValue);
                    Object[] objArr5 = {challengeResultTimeout, challengeResultTimeout};
                    Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                    if (sDKTransactionID4 == null) {
                        byte b14 = (byte) 0;
                        byte b15 = (byte) (b14 + 1);
                        sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(Color.rgb(0, 0, 0) + 16778913, (char) View.resolveSize(0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 28, -1620360563, false, $$e(b14, b15, (byte) (b15 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) sDKTransactionID4).invoke(null, objArr5);
                }
            } else {
                int length4 = iArr.length;
                challengeResultTimeout.AuthenticationRequestParameters = length4;
                char[] cArr6 = new char[length4];
                challengeResultTimeout.getSDKAppID = 0;
                while (true) {
                    int i21 = challengeResultTimeout.getSDKAppID;
                    int i22 = challengeResultTimeout.AuthenticationRequestParameters;
                    if (i21 >= i22) {
                        objArr[0] = new String(cArr6);
                        return;
                    } else {
                        cArr6[i21] = (char) (cArr2[iArr[(i22 - 1) - i21] - i11] - iIntValue);
                        challengeResultTimeout.getSDKAppID = i21 + 1;
                    }
                }
            }
        }

        public static void init$0() {
            $$a = new byte[]{39, 64, -52, -10, -24, 11, 49, -56, -22, 63, -62, -3, -20, 28, 10, -12, -14, -35, 12, -18, -10, 13, -7, -22, 6, -11, -4, 32, 0, -3, -20, 28, 10, -12, 5, -52, -5, 34, 0};
            $$b = 200;
        }

        public static void init$1() {
            $$c = new byte[]{7, 12, 52, -54};
            $$d = 22;
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b8) {
            this();
        }
    }

    public /* synthetic */ onCompletion(Application application) {
        this(application, new DefaultPermissionChecker(application), new ChallengeStatusHandler(application));
    }
}
