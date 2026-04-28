package atd.o;

import android.annotation.SuppressLint;
import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.os.Process;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/Address;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/BluetoothDeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/bluetooth/BluetoothAdapter;", "", "address", "(Landroid/bluetooth/BluetoothAdapter;)Ljava/lang/String;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAddress.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Address.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/Address\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
public final class AuthenticationRequestParameters extends getSDKReferenceNumber {
    private static int AuthenticationRequestParameters = 1;
    private static int ChallengeResult = 1;
    private static int getDeviceData;
    private static long getSDKAppID;
    private static int getSDKReferenceNumber;
    private static char[] getSDKTransactionID;

    static {
        getSDKAppID();
        Process.getElapsedCpuTime();
        ViewConfiguration.getZoomControlsTimeout();
        ViewConfiguration.getGlobalActionKeyTimeout();
        new getSDKAppID((byte) 0);
        getDeviceData = (ChallengeResult + 103) % 128;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AuthenticationRequestParameters(@NotNull Application application, @NotNull PermissionChecker permissionChecker) {
        super(application, permissionChecker);
        application.getClass();
        permissionChecker.getClass();
    }

    @SuppressLint({"HardwareIds"})
    private static String getDeviceData(BluetoothAdapter bluetoothAdapter) {
        getSDKReferenceNumber = (AuthenticationRequestParameters + 41) % 128;
        String address = bluetoothAdapter.getAddress();
        AuthenticationRequestParameters = (getSDKReferenceNumber + 33) % 128;
        return address;
    }

    public static void getSDKAppID() {
        getSDKTransactionID = new char[]{36062, 27760, 19730, 11835};
        getSDKAppID = 603573462692861137L;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r4.getMessageVersion()
            r1 = 0
            if (r0 != 0) goto L25
            int r0 = atd.o.AuthenticationRequestParameters.AuthenticationRequestParameters
            int r0 = r0 + 35
            int r2 = r0 % 128
            atd.o.AuthenticationRequestParameters.getSDKReferenceNumber = r2
            int r0 = r0 % 2
            if (r0 != 0) goto L21
            boolean r0 = r4.ChallengeResultCancelled()
            if (r0 != 0) goto L25
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.MISSING_PERMISSION
            r0.<init>(r1)
            return r0
        L21:
            r4.ChallengeResultCancelled()
            throw r1
        L25:
            android.bluetooth.BluetoothAdapter r0 = r4.getSDKEphemeralPublicKey()
            if (r0 == 0) goto L85
            java.lang.String r0 = getDeviceData(r0)
            if (r0 == 0) goto L85
            int r2 = atd.o.AuthenticationRequestParameters.AuthenticationRequestParameters
            int r2 = r2 + 111
            int r3 = r2 % 128
            atd.o.AuthenticationRequestParameters.getSDKReferenceNumber = r3
            int r2 = r2 % 2
            if (r2 == 0) goto L48
            boolean r2 = atd.o.ChallengeResultCancelled.AuthenticationRequestParameters(r0)
            r3 = 82
            int r3 = r3 / 0
            if (r2 == 0) goto L5c
            goto L4e
        L48:
            boolean r2 = atd.o.ChallengeResultCancelled.AuthenticationRequestParameters(r0)
            if (r2 == 0) goto L5c
        L4e:
            int r2 = atd.o.AuthenticationRequestParameters.getSDKReferenceNumber
            int r2 = r2 + 61
            int r3 = r2 % 128
            atd.o.AuthenticationRequestParameters.AuthenticationRequestParameters = r3
            int r2 = r2 % 2
            if (r2 == 0) goto L5b
            goto L65
        L5b:
            throw r1
        L5c:
            int r0 = atd.o.AuthenticationRequestParameters.getSDKReferenceNumber
            int r0 = r0 + 29
            int r0 = r0 % 128
            atd.o.AuthenticationRequestParameters.AuthenticationRequestParameters = r0
            r0 = r1
        L65:
            if (r0 == 0) goto L85
            int r2 = atd.o.AuthenticationRequestParameters.getSDKReferenceNumber
            int r2 = r2 + 69
            int r2 = r2 % 128
            atd.o.AuthenticationRequestParameters.AuthenticationRequestParameters = r2
            java.lang.String r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m165constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$StringValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m164boximpl(r0)
            int r2 = atd.o.AuthenticationRequestParameters.getSDKReferenceNumber
            int r2 = r2 + 45
            int r3 = r2 % 128
            atd.o.AuthenticationRequestParameters.AuthenticationRequestParameters = r3
            int r2 = r2 % 2
            if (r2 == 0) goto L84
            return r0
        L84:
            throw r1
        L85:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.o.AuthenticationRequestParameters.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/Address$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private getSDKAppID() {
        }

        public /* synthetic */ getSDKAppID(byte b8) {
            this();
        }
    }

    public /* synthetic */ AuthenticationRequestParameters(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }
}
