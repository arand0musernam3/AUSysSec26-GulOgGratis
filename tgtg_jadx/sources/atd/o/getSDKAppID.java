package atd.o;

import android.annotation.SuppressLint;
import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0010\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r\u0018\u00010\u000f0\f*\u00020\u000bH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/BondedDevicesMac;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/BluetoothDeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/bluetooth/BluetoothAdapter;", "", "Landroid/bluetooth/BluetoothDevice;", "kotlin.jvm.PlatformType", "", "bondedDevices", "(Landroid/bluetooth/BluetoothAdapter;)Ljava/util/Set;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBondedDevicesMac.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BondedDevicesMac.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/BondedDevicesMac\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1863#2,2:43\n*S KotlinDebug\n*F\n+ 1 BondedDevicesMac.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/BondedDevicesMac\n*L\n22#1:43,2\n*E\n"})
public final class getSDKAppID extends atd.o.getSDKReferenceNumber {
    private static int AuthenticationRequestParameters = 0;
    private static int ChallengeResult = 0;
    private static char getDeviceData = 0;
    private static int getSDKAppID = 0;
    private static int getSDKEphemeralPublicKey = 1;
    private static int getSDKReferenceNumber = 1;
    private static long getSDKTransactionID;

    static {
        getSDKTransactionID();
        TextUtils.getOffsetAfter("", 0);
        TextUtils.lastIndexOf("", '0', 0, 0);
        new getSDKReferenceNumber((byte) 0);
        ChallengeResult = (getSDKEphemeralPublicKey + 25) % 128;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private getSDKAppID(@NotNull Application application, @NotNull PermissionChecker permissionChecker) {
        super(application, permissionChecker);
        application.getClass();
        permissionChecker.getClass();
    }

    @SuppressLint({"MissingPermission"})
    private static Set<BluetoothDevice> AuthenticationRequestParameters(BluetoothAdapter bluetoothAdapter) {
        AuthenticationRequestParameters = (getSDKReferenceNumber + 53) % 128;
        Set<BluetoothDevice> bondedDevices = bluetoothAdapter.getBondedDevices();
        getSDKReferenceNumber = (AuthenticationRequestParameters + 13) % 128;
        return bondedDevices;
    }

    public static void getSDKTransactionID() {
        getSDKTransactionID = 1905653906042338631L;
        getSDKAppID = 1121361888;
        getDeviceData = (char) 15687;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        return new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure(com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r0 = new java.util.ArrayList();
        r1 = getSDKEphemeralPublicKey();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        r1 = AuthenticationRequestParameters(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        r1 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r1.hasNext() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        r2 = (android.bluetooth.BluetoothDevice) r1.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r2 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        r2 = r2.getAddress();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r2 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (atd.o.ChallengeResultCancelled.AuthenticationRequestParameters(r2) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        r0.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        atd.o.getSDKAppID.getSDKReferenceNumber = (atd.o.getSDKAppID.AuthenticationRequestParameters + 109) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        atd.o.getSDKAppID.AuthenticationRequestParameters = (atd.o.getSDKAppID.getSDKReferenceNumber + 35) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        return com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringsListValue.m171boximpl(com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringsListValue.m172constructorimpl(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (getMessageVersion() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (getMessageVersion() == false) goto L9;
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
            int r0 = atd.o.getSDKAppID.getSDKReferenceNumber
            int r0 = r0 + 47
            int r1 = r0 % 128
            atd.o.getSDKAppID.AuthenticationRequestParameters = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L16
            boolean r0 = r4.getMessageVersion()
            r1 = 1
            int r1 = r1 / 0
            if (r0 != 0) goto L24
            goto L1c
        L16:
            boolean r0 = r4.getMessageVersion()
            if (r0 != 0) goto L24
        L1c:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.MISSING_PERMISSION
            r0.<init>(r1)
            return r0
        L24:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.bluetooth.BluetoothAdapter r1 = r4.getSDKEphemeralPublicKey()
            if (r1 == 0) goto L6a
            java.util.Set r1 = AuthenticationRequestParameters(r1)
            if (r1 == 0) goto L6a
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L3b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6a
            java.lang.Object r2 = r1.next()
            android.bluetooth.BluetoothDevice r2 = (android.bluetooth.BluetoothDevice) r2
            if (r2 == 0) goto L61
            java.lang.String r2 = r2.getAddress()
            if (r2 == 0) goto L61
            boolean r3 = atd.o.ChallengeResultCancelled.AuthenticationRequestParameters(r2)
            if (r3 == 0) goto L58
            r0.add(r2)
        L58:
            int r2 = atd.o.getSDKAppID.AuthenticationRequestParameters
            int r2 = r2 + 109
            int r2 = r2 % 128
            atd.o.getSDKAppID.getSDKReferenceNumber = r2
            goto L3b
        L61:
            int r2 = atd.o.getSDKAppID.getSDKReferenceNumber
            int r2 = r2 + 35
            int r2 = r2 % 128
            atd.o.getSDKAppID.AuthenticationRequestParameters = r2
            goto L3b
        L6a:
            java.util.List r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringsListValue.m172constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$StringsListValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringsListValue.m171boximpl(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.o.getSDKAppID.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/BondedDevicesMac$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private getSDKReferenceNumber() {
        }

        public /* synthetic */ getSDKReferenceNumber(byte b8) {
            this();
        }
    }

    public /* synthetic */ getSDKAppID(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }
}
