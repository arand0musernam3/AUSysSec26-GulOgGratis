package atd.w;

import android.annotation.SuppressLint;
import android.app.Application;
import android.graphics.Color;
import android.os.Build;
import android.telephony.NetworkRegistrationInfo;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/NonTerrestrialNet;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "", "areAllRequiredPermissionsGranted", "()Z", "Landroid/telephony/TelephonyManager;", "Landroid/telephony/ServiceState;", "serviceState", "(Landroid/telephony/TelephonyManager;)Landroid/telephony/ServiceState;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNonTerrestrialNet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonTerrestrialNet.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/telephony/NonTerrestrialNet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1755#2,3:52\n1#3:55\n*S KotlinDebug\n*F\n+ 1 NonTerrestrialNet.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/telephony/NonTerrestrialNet\n*L\n26#1:52,3\n*E\n"})
public final class ChallengeStatusHandler extends InitializeResultSuccess {
    private static char AuthenticationRequestParameters = 0;
    private static int BuildConfig = 0;
    private static int ChallengeResultCancelled = 1;
    private static char getDeviceData = 0;
    private static int getSDKAppID = 0;
    private static int getSDKEphemeralPublicKey = 1;
    private static char getSDKReferenceNumber;
    private static char getSDKTransactionID;

    static {
        getSDKTransactionID();
        Color.rgb(0, 0, 0);
        new AuthenticationRequestParameters((byte) 0);
        BuildConfig = (getSDKEphemeralPublicKey + 51) % 128;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ChallengeStatusHandler(@NotNull Application application, @NotNull PermissionChecker permissionChecker) {
        super(application, permissionChecker);
        application.getClass();
        permissionChecker.getClass();
    }

    private final boolean getSDKAppID() throws Throwable {
        int i11 = getSDKAppID + 121;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            getSDKEphemeralPublicKey();
            throw null;
        }
        if (!getSDKEphemeralPublicKey() || !ChallengeResultTimeout()) {
            return false;
        }
        getSDKAppID = (ChallengeResultCancelled + 75) % 128;
        return true;
    }

    @SuppressLint({"MissingPermission"})
    private static ServiceState getSDKTransactionID(TelephonyManager telephonyManager) {
        getSDKAppID = (ChallengeResultCancelled + 7) % 128;
        ServiceState serviceState = telephonyManager.getServiceState();
        int i11 = getSDKAppID + 35;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0) {
            return serviceState;
        }
        throw null;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() {
        ServiceState sDKTransactionID;
        List<NetworkRegistrationInfo> networkRegistrationInfoList;
        int i11 = getSDKAppID + 59;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0 ? Build.VERSION.SDK_INT < 35 : Build.VERSION.SDK_INT < 99) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        }
        if (!getSDKAppID()) {
            DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
            int i12 = getSDKAppID + 53;
            ChallengeResultCancelled = i12 % 128;
            if (i12 % 2 != 0) {
                return failure;
            }
            throw null;
        }
        TelephonyManager telephonyManagerChallengeResult = ChallengeResult();
        if (telephonyManagerChallengeResult == null || (sDKTransactionID = getSDKTransactionID(telephonyManagerChallengeResult)) == null || (networkRegistrationInfoList = sDKTransactionID.getNetworkRegistrationInfoList()) == null) {
            DeviceParameterResult.Failure failure2 = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
            getSDKAppID = (ChallengeResultCancelled + 27) % 128;
            return failure2;
        }
        boolean z11 = true;
        if (Objects.nonNull(networkRegistrationInfoList) && networkRegistrationInfoList.isEmpty()) {
            z11 = false;
        } else {
            Iterator<T> it = networkRegistrationInfoList.iterator();
            while (it.hasNext()) {
                ChallengeResultCancelled = (getSDKAppID + 13) % 128;
                if (((NetworkRegistrationInfo) it.next()).isNonTerrestrialNetwork()) {
                    break;
                }
            }
            z11 = false;
        }
        return DeviceParameterResult.Success.BooleanValue.m129boximpl(DeviceParameterResult.Success.BooleanValue.m130constructorimpl(z11));
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/NonTerrestrialNet$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private AuthenticationRequestParameters() {
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b8) {
            this();
        }
    }

    public /* synthetic */ ChallengeStatusHandler(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }

    public static void getSDKTransactionID() {
        getSDKTransactionID = (char) 39950;
        AuthenticationRequestParameters = (char) 47943;
        getDeviceData = (char) 4589;
        getSDKReferenceNumber = (char) 55070;
    }
}
