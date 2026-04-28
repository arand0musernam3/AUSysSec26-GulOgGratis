package atd.o;

import android.annotation.SuppressLint;
import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Build;
import android.text.TextUtils;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ7\u0010\u0010\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r\u0018\u00010\u000f0\f*\u00020\u000bH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u00020\rH\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/BondedDevicesAlias;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/BluetoothDeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/bluetooth/BluetoothAdapter;", "", "Landroid/bluetooth/BluetoothDevice;", "kotlin.jvm.PlatformType", "", "bondedDevices", "(Landroid/bluetooth/BluetoothAdapter;)Ljava/util/Set;", "", "alias", "(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBondedDevicesAlias.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BondedDevicesAlias.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/BondedDevicesAlias\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n1863#2,2:57\n*S KotlinDebug\n*F\n+ 1 BondedDevicesAlias.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/BondedDevicesAlias\n*L\n29#1:57,2\n*E\n"})
public final class getSDKTransactionID extends getSDKReferenceNumber {
    private static int[] AuthenticationRequestParameters = null;
    private static int getDeviceData = 0;
    private static int getSDKAppID = 1;
    private static int getSDKReferenceNumber = 1;
    private static int getSDKTransactionID;

    static {
        getSDKTransactionID();
        TextUtils.getOffsetBefore("", 0);
        new AuthenticationRequestParameters((byte) 0);
        getDeviceData = (getSDKReferenceNumber + 61) % 128;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private getSDKTransactionID(@NotNull Application application, @NotNull PermissionChecker permissionChecker) {
        super(application, permissionChecker);
        application.getClass();
        permissionChecker.getClass();
    }

    @SuppressLint({"MissingPermission"})
    private static String AuthenticationRequestParameters(BluetoothDevice bluetoothDevice) {
        getSDKAppID = (getSDKTransactionID + 45) % 128;
        String alias = bluetoothDevice.getAlias();
        getSDKAppID = (getSDKTransactionID + 71) % 128;
        return alias;
    }

    public static void getSDKTransactionID() {
        AuthenticationRequestParameters = new int[]{-1333315867, 798175738, 1296536455, 595562711, 772451829, -308532885, 38309559, -169894078, -260259670, 88305010, 1658857444, -1760862374, -35386676, -389688144, -336273450, 764989193, 1370936896, 360762333};
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() {
        Set<BluetoothDevice> sDKTransactionID;
        if (Build.VERSION.SDK_INT < 30) {
            DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
            getSDKAppID = (getSDKTransactionID + 27) % 128;
            return failure;
        }
        if (!getMessageVersion()) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
        }
        ArrayList arrayList = new ArrayList();
        BluetoothAdapter sDKEphemeralPublicKey = getSDKEphemeralPublicKey();
        if (sDKEphemeralPublicKey != null && (sDKTransactionID = getSDKTransactionID(sDKEphemeralPublicKey)) != null) {
            for (BluetoothDevice bluetoothDevice : sDKTransactionID) {
                if (bluetoothDevice != null) {
                    getSDKTransactionID = (getSDKAppID + 103) % 128;
                    String strAuthenticationRequestParameters = AuthenticationRequestParameters(bluetoothDevice);
                    if (strAuthenticationRequestParameters != null) {
                        arrayList.add(strAuthenticationRequestParameters);
                        getSDKTransactionID = (getSDKAppID + 117) % 128;
                    }
                }
            }
        }
        return DeviceParameterResult.Success.StringsListValue.m171boximpl(DeviceParameterResult.Success.StringsListValue.m172constructorimpl(arrayList));
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/BondedDevicesAlias$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private AuthenticationRequestParameters() {
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b8) {
            this();
        }
    }

    public /* synthetic */ getSDKTransactionID(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }

    @SuppressLint({"MissingPermission"})
    private static Set<BluetoothDevice> getSDKTransactionID(BluetoothAdapter bluetoothAdapter) {
        int i11 = getSDKTransactionID + 67;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            bluetoothAdapter.getBondedDevices();
            throw null;
        }
        Set<BluetoothDevice> bondedDevices = bluetoothAdapter.getBondedDevices();
        int i12 = getSDKAppID + 59;
        getSDKTransactionID = i12 % 128;
        if (i12 % 2 == 0) {
            return bondedDevices;
        }
        throw null;
    }
}
