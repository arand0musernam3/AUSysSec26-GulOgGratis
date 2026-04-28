package atd.o;

import android.annotation.SuppressLint;
import android.app.Application;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.graphics.Color;
import android.os.Build;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.i0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0014B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f*\u00020\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/AddressType;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/BluetoothDeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/bluetooth/BluetoothManager;", "", "Landroid/bluetooth/BluetoothDevice;", "connectedDevices", "(Landroid/bluetooth/BluetoothManager;)Ljava/util/List;", "", "getSupportedBluetoothProfiles", "()Ljava/util/List;", "supportedBluetoothProfiles", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAddressType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressType.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/AddressType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n1557#2:50\n1628#2,3:51\n1368#2:55\n1454#2,5:56\n1#3:54\n*S KotlinDebug\n*F\n+ 1 AddressType.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/AddressType\n*L\n32#1:50\n32#1:51,3\n42#1:55\n42#1:56,5\n*E\n"})
public final class getDeviceData extends getSDKReferenceNumber {
    private static long AuthenticationRequestParameters = 0;
    private static int BuildConfig = 0;
    private static char getDeviceData = 0;
    private static int getMessageVersion = 1;
    private static int getSDKAppID = 0;
    private static int getSDKReferenceNumber = 1;
    private static int getSDKTransactionID;

    static {
        getSDKTransactionID();
        Color.alpha(0);
        ExpandableListView.getPackedPositionGroup(0L);
        new getSDKAppID((byte) 0);
        getMessageVersion = (BuildConfig + 75) % 128;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private getDeviceData(@NotNull Application application, @NotNull PermissionChecker permissionChecker) {
        super(application, permissionChecker);
        application.getClass();
        permissionChecker.getClass();
    }

    private static List<Integer> getSDKAppID() {
        getSDKAppID = (getSDKReferenceNumber + 3) % 128;
        List<Integer> listH = d0.h(7, 8);
        getSDKReferenceNumber = (getSDKAppID + 33) % 128;
        return listH;
    }

    @SuppressLint({"MissingPermission"})
    private static List<BluetoothDevice> getSDKTransactionID(BluetoothManager bluetoothManager) {
        List<Integer> sDKAppID = getSDKAppID();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sDKAppID.iterator();
        getSDKAppID = (getSDKReferenceNumber + 77) % 128;
        while (it.hasNext()) {
            int i11 = getSDKReferenceNumber + 87;
            getSDKAppID = i11 % 128;
            if (i11 % 2 != 0) {
                List<BluetoothDevice> connectedDevices = bluetoothManager.getConnectedDevices(((Number) it.next()).intValue());
                connectedDevices.getClass();
                i0.s(connectedDevices, arrayList);
                int i12 = 60 / 0;
            } else {
                List<BluetoothDevice> connectedDevices2 = bluetoothManager.getConnectedDevices(((Number) it.next()).intValue());
                connectedDevices2.getClass();
                i0.s(connectedDevices2, arrayList);
            }
        }
        return arrayList;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        int i11 = getSDKAppID + 45;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0 ? Build.VERSION.SDK_INT < 35 : Build.VERSION.SDK_INT < 87) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        }
        if (!getMessageVersion()) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
        }
        BluetoothManager bluetoothManagerAuthenticationRequestParameters = AuthenticationRequestParameters();
        if (bluetoothManagerAuthenticationRequestParameters == null) {
            DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
            int i12 = getSDKReferenceNumber + 89;
            getSDKAppID = i12 % 128;
            if (i12 % 2 == 0) {
                return failure;
            }
            throw null;
        }
        List<BluetoothDevice> sDKTransactionID = getSDKTransactionID(bluetoothManagerAuthenticationRequestParameters);
        ArrayList arrayList = new ArrayList(e0.o(sDKTransactionID, 10));
        Iterator<T> it = sDKTransactionID.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((BluetoothDevice) it.next()).getAddressType()));
            getSDKAppID = (getSDKReferenceNumber + 75) % 128;
        }
        return DeviceParameterResult.Success.StringsListValue.m171boximpl(DeviceParameterResult.Success.StringsListValue.m172constructorimpl(arrayList));
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/AddressType$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private getSDKAppID() {
        }

        public /* synthetic */ getSDKAppID(byte b8) {
            this();
        }
    }

    public /* synthetic */ getDeviceData(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }

    public static void getSDKTransactionID() {
        AuthenticationRequestParameters = -7294626308091423823L;
        getSDKTransactionID = -2038612665;
        getDeviceData = (char) 15687;
    }
}
