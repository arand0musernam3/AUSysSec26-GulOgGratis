package atd.w;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/NetworkOperatorName;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNetworkOperatorName.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkOperatorName.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/telephony/NetworkOperatorName\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
public final class onCompletion extends InitializeResultSuccess {
    private static int AuthenticationRequestParameters = 1;
    private static char[] getDeviceData = null;
    private static int getSDKAppID = 0;
    private static int getSDKReferenceNumber = 0;
    private static int getSDKTransactionID = 1;

    static {
        AuthenticationRequestParameters();
        new getSDKTransactionID((byte) 0);
        int i11 = getSDKReferenceNumber + 75;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 36 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onCompletion(@NotNull Application application) {
        super(application);
        application.getClass();
    }

    public static void AuthenticationRequestParameters() {
        getDeviceData = new char[]{63407, 63415, 63423, 63423};
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r0 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r0 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        r2 = atd.w.onCompletion.getSDKAppID + 33;
        atd.w.onCompletion.AuthenticationRequestParameters = r2 % 128;
        r2 = r2 % 2;
        r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m165constructorimpl(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r2 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        return com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m164boximpl(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m164boximpl(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        throw null;
     */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() {
        /*
            r4 = this;
            int r0 = atd.w.onCompletion.AuthenticationRequestParameters
            int r0 = r0 + 81
            int r1 = r0 % 128
            atd.w.onCompletion.getSDKAppID = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L5f
            boolean r0 = r4.getMessageVersion()
            if (r0 == 0) goto L1b
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        L1b:
            android.telephony.TelephonyManager r0 = r4.ChallengeResult()
            if (r0 == 0) goto L57
            int r2 = atd.w.onCompletion.AuthenticationRequestParameters
            int r2 = r2 + 107
            int r3 = r2 % 128
            atd.w.onCompletion.getSDKAppID = r3
            int r2 = r2 % 2
            if (r2 == 0) goto L38
            java.lang.String r0 = r0.getNetworkOperatorName()
            r2 = 23
            int r2 = r2 / 0
            if (r0 == 0) goto L57
            goto L3e
        L38:
            java.lang.String r0 = r0.getNetworkOperatorName()
            if (r0 == 0) goto L57
        L3e:
            int r2 = atd.w.onCompletion.getSDKAppID
            int r2 = r2 + 33
            int r3 = r2 % 128
            atd.w.onCompletion.AuthenticationRequestParameters = r3
            int r2 = r2 % 2
            java.lang.String r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m165constructorimpl(r0)
            if (r2 == 0) goto L53
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$StringValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m164boximpl(r0)
            return r0
        L53:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m164boximpl(r0)
            throw r1
        L57:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        L5f:
            r4.getMessageVersion()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.w.onCompletion.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/NetworkOperatorName$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private getSDKTransactionID() {
        }

        public /* synthetic */ getSDKTransactionID(byte b8) {
            this();
        }
    }
}
