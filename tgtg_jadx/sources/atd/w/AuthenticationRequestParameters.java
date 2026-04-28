package atd.w;

import android.annotation.SuppressLint;
import android.app.Application;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\n*\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u0004\u0018\u00010\n*\u00020\tH\u0003¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/DeviceId;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/telephony/TelephonyManager;", "", "kotlin.jvm.PlatformType", "deviceId", "(Landroid/telephony/TelephonyManager;)Ljava/lang/String;", "findDeviceId", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceId.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/telephony/DeviceId\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
public final class AuthenticationRequestParameters extends InitializeResultSuccess {
    private static int AuthenticationRequestParameters = 0;
    private static int ChallengeResultCancelled = 1;
    private static int getDeviceData = 1;
    private static int getMessageVersion;
    private static long getSDKAppID;
    private static int getSDKReferenceNumber;
    private static char getSDKTransactionID;

    static {
        getSDKTransactionID();
        TextUtils.getOffsetAfter("", 0);
        ViewConfiguration.getTapTimeout();
        new getSDKAppID((byte) 0);
        int i11 = getMessageVersion + 7;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticationRequestParameters(@NotNull Application application) {
        super(application);
        application.getClass();
    }

    @SuppressLint({"MissingPermission"})
    private static String AuthenticationRequestParameters(TelephonyManager telephonyManager) {
        int i11 = getSDKReferenceNumber + 99;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            telephonyManager.getPhoneType();
            throw null;
        }
        int phoneType = telephonyManager.getPhoneType();
        if (phoneType == 1) {
            return telephonyManager.getImei();
        }
        if (phoneType != 2) {
            getSDKReferenceNumber = (getDeviceData + 63) % 128;
            return null;
        }
        String meid = telephonyManager.getMeid();
        getSDKReferenceNumber = (getDeviceData + 47) % 128;
        return meid;
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private static String getDeviceData(TelephonyManager telephonyManager) {
        getSDKReferenceNumber = (getDeviceData + 17) % 128;
        String deviceId = telephonyManager.getDeviceId();
        int i11 = getSDKReferenceNumber + 125;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 99 / 0;
        }
        return deviceId;
    }

    public static void getSDKTransactionID() {
        getSDKAppID = -4265277791347268114L;
        AuthenticationRequestParameters = -2038612665;
        getSDKTransactionID = (char) 15687;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() {
        getDeviceData = (getSDKReferenceNumber + 87) % 128;
        try {
            TelephonyManager telephonyManagerChallengeResult = ChallengeResult();
            String strAuthenticationRequestParameters = null;
            if (telephonyManagerChallengeResult != null) {
                int i11 = getSDKReferenceNumber + 85;
                getDeviceData = i11 % 128;
                if (i11 % 2 == 0) {
                    AuthenticationRequestParameters(telephonyManagerChallengeResult);
                    throw null;
                }
                strAuthenticationRequestParameters = AuthenticationRequestParameters(telephonyManagerChallengeResult);
            }
            if (strAuthenticationRequestParameters != null) {
                return DeviceParameterResult.Success.StringValue.m164boximpl(DeviceParameterResult.Success.StringValue.m165constructorimpl(strAuthenticationRequestParameters));
            }
            DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
            getSDKReferenceNumber = (getDeviceData + 13) % 128;
            return failure;
        } catch (SecurityException unused) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/DeviceId$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private getSDKAppID() {
        }

        public /* synthetic */ getSDKAppID(byte b8) {
            this();
        }
    }
}
