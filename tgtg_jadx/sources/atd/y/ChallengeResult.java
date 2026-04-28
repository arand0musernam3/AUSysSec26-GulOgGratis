package atd.y;

import android.app.Application;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/HapticFeedbackEnabled;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHapticFeedbackEnabled.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HapticFeedbackEnabled.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/HapticFeedbackEnabled\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
public final class ChallengeResult extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static int ChallengeResultCancelled;
    private static int getDeviceData;
    private static int getMessageVersion;
    private static long getSDKReferenceNumber;
    private static int getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKAppID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(short r6, byte r7, byte r8) {
        /*
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r0 = atd.y.ChallengeResult.$$a
            int r7 = r7 * 4
            int r1 = 1 - r7
            int r8 = 106 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            r3 = -1
            if (r0 != 0) goto L17
            r4 = r8
            r8 = r6
            goto L29
        L17:
            r5 = r8
            r8 = r6
            r6 = r5
        L1a:
            int r3 = r3 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r4 = r0[r8]
        L29:
            int r6 = r6 + r4
            int r8 = r8 + 1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.ChallengeResult.$$d(short, byte, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMessageVersion = 0;
        ChallengeResultCancelled = 1;
        getSDKTransactionID = 0;
        getDeviceData = 1;
        getSDKTransactionID();
        KeyEvent.getMaxKeyCode();
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
        SystemClock.uptimeMillis();
        new AuthenticationRequestParameters((byte) 0);
        ChallengeResultCancelled = (getMessageVersion + 99) % 128;
    }

    private ChallengeResult(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKAppID = getsdkreferencenumber;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(char r26, int r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.ChallengeResult.b(char, int, int, java.lang.Object[]):void");
    }

    public static void getSDKTransactionID() {
        AuthenticationRequestParameters = new char[]{'\"', 55350, 45056, 34921, 24663, 14520, 4283, 59623, 49351, 39210, 28940, 18711, 8567, 63824, 53687, 43430, 33279, 22985, 12833, 2575, 57954, 47694, 37456, 2374, 53547, 47373, 33127};
        getSDKReferenceNumber = -2419297796218541037L;
    }

    public static void init$0() {
        $$a = new byte[]{62, -80, -102, 31};
        $$b = 81;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        Boolean sDKTransactionID;
        getDeviceData = (getSDKTransactionID + 97) % 128;
        if (Build.VERSION.SDK_INT < 33) {
            atd.t.getSDKReferenceNumber getsdkreferencenumber = this.getSDKAppID;
            Object[] objArr = new Object[1];
            b((char) (Color.alpha(0) + 62532), View.combineMeasuredStates(0, 0) + 23, ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr);
            String strAuthenticationRequestParameters = getsdkreferencenumber.AuthenticationRequestParameters(((String) objArr[0]).intern());
            return (strAuthenticationRequestParameters == null || (sDKTransactionID = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKTransactionID(strAuthenticationRequestParameters)) == null) ? new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK) : a0.h(sDKTransactionID);
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        int i11 = getSDKTransactionID + 81;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            return failure;
        }
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/HapticFeedbackEnabled$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        public static int getDeviceData;
        public static int getSDKAppID;

        private AuthenticationRequestParameters() {
        }

        public static int getSDKAppID() {
            int i11 = getDeviceData;
            int i12 = i11 % 9953628;
            getDeviceData = i11 + 1;
            if (i12 != 0) {
                return getSDKAppID;
            }
            int iMyTid = Process.myTid();
            getSDKAppID = iMyTid;
            return iMyTid;
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b8) {
            this();
        }
    }

    public /* synthetic */ ChallengeResult(Application application) {
        this(application, new atd.t.AuthenticationRequestParameters(application));
    }
}
