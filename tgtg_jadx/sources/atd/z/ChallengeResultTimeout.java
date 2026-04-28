package atd.z;

import android.app.Application;
import android.widget.ExpandableListView;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/MaxWifiChannelNumber;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiDeviceParameter;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMaxWifiChannelNumber.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaxWifiChannelNumber.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/wifi/MaxWifiChannelNumber\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
public final class ChallengeResultTimeout extends getErrorCode {
    private static char[] AuthenticationRequestParameters = null;
    private static int ChallengeResult = 0;
    private static boolean getDeviceData = false;
    private static int getMessageVersion = 1;
    private static int getSDKAppID = 0;
    private static int getSDKEphemeralPublicKey = 1;
    private static int getSDKReferenceNumber;
    private static boolean getSDKTransactionID;

    static {
        getSDKTransactionID();
        ExpandableListView.getPackedPositionForChild(0, 0);
        new getSDKReferenceNumber((byte) 0);
        getSDKEphemeralPublicKey = (ChallengeResult + 53) % 128;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeResultTimeout(@NotNull Application application) {
        super(application);
        application.getClass();
    }

    public static void getSDKTransactionID() {
        AuthenticationRequestParameters = new char[]{21724, 21676, 21712, 21718};
        getSDKReferenceNumber = 1286296735;
        getDeviceData = true;
        getSDKTransactionID = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r0
      0x002b: PHI (r0v9 android.net.wifi.WifiManager) = (r0v8 android.net.wifi.WifiManager), (r0v21 android.net.wifi.WifiManager) binds: [B:10:0x0029, B:7:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() {
        /*
            r4 = this;
            int r0 = atd.z.ChallengeResultTimeout.getMessageVersion
            int r0 = r0 + 95
            int r0 = r0 % 128
            atd.z.ChallengeResultTimeout.getSDKAppID = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L85
            int r0 = atd.z.ChallengeResultTimeout.getSDKAppID
            int r0 = r0 + 89
            int r1 = r0 % 128
            atd.z.ChallengeResultTimeout.getMessageVersion = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L25
            android.net.wifi.WifiManager r0 = r4.ChallengeResult()
            r1 = 25
            int r1 = r1 / 0
            if (r0 == 0) goto L7d
            goto L2b
        L25:
            android.net.wifi.WifiManager r0 = r4.ChallengeResult()
            if (r0 == 0) goto L7d
        L2b:
            int r0 = r0.getMaxNumberOfChannelsPerNetworkSpecifierRequest()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r0.intValue()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r1 = r1.length()
            r2 = 11
            r3 = 0
            if (r1 > r2) goto L5d
            int r1 = atd.z.ChallengeResultTimeout.getSDKAppID
            int r1 = r1 + 13
            int r2 = r1 % 128
            atd.z.ChallengeResultTimeout.getMessageVersion = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L51
            goto L5d
        L51:
            int r2 = r2 + 113
            int r1 = r2 % 128
            atd.z.ChallengeResultTimeout.getSDKAppID = r1
            int r2 = r2 % 2
            if (r2 != 0) goto L5c
            goto L66
        L5c:
            throw r3
        L5d:
            int r0 = atd.z.ChallengeResultTimeout.getSDKAppID
            int r0 = r0 + 119
            int r0 = r0 % 128
            atd.z.ChallengeResultTimeout.getMessageVersion = r0
            r0 = r3
        L66:
            if (r0 == 0) goto L7d
            int r1 = atd.z.ChallengeResultTimeout.getMessageVersion
            int r1 = r1 + 43
            int r1 = r1 % 128
            atd.z.ChallengeResultTimeout.getSDKAppID = r1
            int r0 = r0.intValue()
            int r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.m151constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$IntValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.m150boximpl(r0)
            return r0
        L7d:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        L85:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.z.ChallengeResultTimeout.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/MaxWifiChannelNumber$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "MAX_VALUE_LENGTH", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private getSDKReferenceNumber() {
        }

        public /* synthetic */ getSDKReferenceNumber(byte b8) {
            this();
        }
    }
}
