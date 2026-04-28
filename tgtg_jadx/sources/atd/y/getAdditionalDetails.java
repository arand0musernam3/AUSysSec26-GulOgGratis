package atd.y;

import android.app.Application;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.app.tgtg.model.local.AppConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/ScreenBrightness;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScreenBrightness.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenBrightness.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/ScreenBrightness\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
public final class getAdditionalDetails extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static char[] getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static long getSDKReferenceNumber;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKTransactionID;

    private static String $$d(int i11, int i12, byte b8) {
        int i13 = i11 * 3;
        int i14 = i12 + 103;
        int i15 = (b8 * 2) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i13];
        int i16 = 0 - i13;
        int i17 = -1;
        if (bArr == null) {
            i14 = i16 + (-i15);
            i15++;
            bArr = bArr;
            i17 = -1;
        }
        while (true) {
            int i18 = i17 + 1;
            bArr2[i18] = (byte) i14;
            if (i18 == i16) {
                return new String(bArr2, 0);
            }
            i14 += -bArr[i15];
            i15++;
            bArr = bArr;
            i17 = i18;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResult = 0;
        getMessageVersion = 1;
        getSDKAppID = 0;
        AuthenticationRequestParameters = 1;
        getSDKTransactionID();
        ExpandableListView.getPackedPositionForGroup(0);
        TextUtils.getTrimmedLength("");
        TextUtils.lastIndexOf("", '0', 0, 0);
        new AuthenticationRequestParameters((byte) 0);
        ChallengeResult = (getMessageVersion + 63) % 128;
    }

    private getAdditionalDetails(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKTransactionID = getsdkreferencenumber;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x014d, code lost:
    
        r4[r6] = (char) r2[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0153, code lost:
    
        r0 = new java.lang.Object[]{r1, r1};
        r1 = atd.e.ChallengeResult.getSDKTransactionID(464282390);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x015d, code lost:
    
        if (r1 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x015f, code lost:
    
        r1 = (byte) 0;
        r2 = (byte) (r1 + 1);
        r1 = atd.e.ChallengeResult.getDeviceData(android.view.MotionEvent.axisFromString("") + 2647, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)) - 1), android.text.TextUtils.lastIndexOf("", '0', 0) + 25, -943430394, false, $$d(r1, r2, (byte) (r2 - 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x018c, code lost:
    
        ((java.lang.reflect.Method) r1).invoke(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0191, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(char r28, int r29, int r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.getAdditionalDetails.b(char, int, int, java.lang.Object[]):void");
    }

    public static void getSDKTransactionID() {
        getDeviceData = new char[]{62589, 37109, 15692, 55715, 26123, 664, 44993, 13380, 53436, 32063, 6553, 42734, 17242, 61400, 29755, 4245, 48637, 52395, 43075, 1515, 57616};
        getSDKReferenceNumber = 2336529288483016854L;
    }

    public static void init$0() {
        $$a = new byte[]{49, 92, 68, -39};
        $$b = 32;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        Integer sDKReferenceNumber;
        atd.t.getSDKReferenceNumber getsdkreferencenumber = this.getSDKTransactionID;
        Object[] objArr = new Object[1];
        b((char) KeyEvent.keyCodeFromString(""), 17 - (ViewConfiguration.getPressedStateDuration() >> 16), ViewConfiguration.getScrollDefaultDelay() >> 16, objArr);
        String strAuthenticationRequestParameters = getsdkreferencenumber.AuthenticationRequestParameters(((String) objArr[0]).intern());
        if (strAuthenticationRequestParameters != null && (sDKReferenceNumber = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKReferenceNumber(strAuthenticationRequestParameters)) != null) {
            getSDKAppID = (AuthenticationRequestParameters + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
            if (sDKReferenceNumber.intValue() > 255) {
                sDKReferenceNumber = null;
            }
            if (sDKReferenceNumber != null) {
                return DeviceParameterResult.Success.IntValue.m150boximpl(DeviceParameterResult.Success.IntValue.m151constructorimpl(sDKReferenceNumber.intValue()));
            }
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        AuthenticationRequestParameters = (getSDKAppID + 89) % 128;
        return failure;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/ScreenBrightness$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "MAX_VALUE", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        public static int AuthenticationRequestParameters;
        public static int getSDKTransactionID;

        private AuthenticationRequestParameters() {
        }

        public static int getSDKAppID() {
            int i11 = getSDKTransactionID;
            int i12 = i11 % 5963086;
            getSDKTransactionID = i11 + 1;
            if (i12 != 0) {
                return AuthenticationRequestParameters;
            }
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            AuthenticationRequestParameters = iUptimeMillis;
            return iUptimeMillis;
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b8) {
            this();
        }
    }

    public /* synthetic */ getAdditionalDetails(Application application) {
        this(application, new atd.t.AuthenticationRequestParameters(application));
    }
}
