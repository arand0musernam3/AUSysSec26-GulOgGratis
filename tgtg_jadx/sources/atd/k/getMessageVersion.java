package atd.k;

import android.app.Application;
import android.os.Process;
import android.text.TextUtils;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Locale;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/ApplicationLocale;", "applicationLocale", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/ApplicationLocale;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/ApplicationLocale;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getMessageVersion extends DeviceParameter {
    private static long AuthenticationRequestParameters = 0;
    private static int BuildConfig = 1;
    private static int getDeviceData = 1;
    private static char[] getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;

    @NotNull
    private final atd.k.getSDKReferenceNumber getSDKTransactionID;

    static {
        AuthenticationRequestParameters();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        Process.myPid();
        TextUtils.lastIndexOf("", '0', 0, 0);
        new getSDKReferenceNumber((byte) 0);
        int i11 = getSDKEphemeralPublicKey + 27;
        BuildConfig = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 40 / 0;
        }
    }

    private getMessageVersion(@NotNull Application application, @NotNull atd.k.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKTransactionID = getsdkreferencenumber;
    }

    public static void AuthenticationRequestParameters() {
        getSDKAppID = new char[]{62541, 47076, 29578, 16309};
        AuthenticationRequestParameters = 8451260710526695380L;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() {
        /*
            r4 = this;
            int r0 = atd.k.getMessageVersion.getDeviceData
            int r0 = r0 + 3
            int r0 = r0 % 128
            atd.k.getMessageVersion.getSDKReferenceNumber = r0
            atd.k.getSDKReferenceNumber r0 = r4.getSDKTransactionID
            java.util.Locale r0 = r0.getDeviceData()
            java.lang.String r1 = r0.getLanguage()
            java.lang.String r0 = r0.getCountry()
            r1.getClass()
            int r2 = r1.length()
            if (r2 != 0) goto L2b
            int r2 = atd.k.getMessageVersion.getDeviceData
            int r2 = r2 + 83
            int r3 = r2 % 128
            atd.k.getMessageVersion.getSDKReferenceNumber = r3
            int r2 = r2 % 2
            if (r2 == 0) goto L3c
        L2b:
            r0.getClass()
            int r2 = r0.length()
            if (r2 != 0) goto L44
            int r0 = atd.k.getMessageVersion.getDeviceData
            int r0 = r0 + 113
            int r0 = r0 % 128
            atd.k.getMessageVersion.getSDKReferenceNumber = r0
        L3c:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        L44:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r1 = 45
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m165constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$StringValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m164boximpl(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.k.getMessageVersion.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Locale$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private getSDKReferenceNumber() {
        }

        public /* synthetic */ getSDKReferenceNumber(byte b8) {
            this();
        }
    }

    public /* synthetic */ getMessageVersion(Application application) {
        this(application, new AuthenticationRequestParameters(application));
    }
}
