package atd.w;

import android.app.Application;
import android.view.ViewConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SimOperator;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "", "", "isNumeric", "(Ljava/lang/String;)Z", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSimOperator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimOperator.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SimOperator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,26:1\n1#2:27\n1069#3,2:28\n*S KotlinDebug\n*F\n+ 1 SimOperator.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SimOperator\n*L\n17#1:28,2\n*E\n"})
public final class getErrorCode extends InitializeResultSuccess {
    private static int AuthenticationRequestParameters = 1;
    private static int getDeviceData = 0;
    private static long getSDKAppID = 0;
    private static int getSDKReferenceNumber = 0;
    private static int getSDKTransactionID = 1;

    static {
        getSDKTransactionID();
        ViewConfiguration.getWindowTouchSlop();
        new getSDKAppID((byte) 0);
        getDeviceData = (AuthenticationRequestParameters + 17) % 128;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getErrorCode(@NotNull Application application) {
        super(application);
        application.getClass();
    }

    private static boolean AuthenticationRequestParameters(String str) {
        int i11 = getSDKReferenceNumber;
        int i12 = i11 + 75;
        getSDKTransactionID = i12 % 128;
        getSDKTransactionID = (i11 + 57) % 128;
        for (int i13 = i12 % 2 == 0 ? 1 : 0; i13 < str.length(); i13++) {
            if (!Character.isDigit(str.charAt(i13))) {
                return false;
            }
        }
        return true;
    }

    public static void getSDKTransactionID() {
        getSDKAppID = 1311978225161082434L;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() {
        /*
            r3 = this;
            android.telephony.TelephonyManager r0 = r3.ChallengeResult()
            if (r0 == 0) goto L43
            java.lang.String r0 = r0.getSimOperator()
            if (r0 == 0) goto L43
            int r1 = atd.w.getErrorCode.getSDKReferenceNumber
            int r1 = r1 + 73
            int r2 = r1 % 128
            atd.w.getErrorCode.getSDKTransactionID = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L21
            int r1 = r0.length()
            r2 = 111(0x6f, float:1.56E-43)
            if (r1 > r2) goto L37
            goto L28
        L21:
            int r1 = r0.length()
            r2 = 6
            if (r1 > r2) goto L37
        L28:
            boolean r1 = AuthenticationRequestParameters(r0)
            if (r1 == 0) goto L37
            int r1 = atd.w.getErrorCode.getSDKTransactionID
            int r1 = r1 + 87
            int r1 = r1 % 128
            atd.w.getErrorCode.getSDKReferenceNumber = r1
            goto L38
        L37:
            r0 = 0
        L38:
            if (r0 == 0) goto L43
            java.lang.String r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m165constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$StringValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m164boximpl(r0)
            return r0
        L43:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.w.getErrorCode.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SimOperator$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "MAX_LENGTH", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private getSDKAppID() {
        }

        public /* synthetic */ getSDKAppID(byte b8) {
            this();
        }
    }
}
