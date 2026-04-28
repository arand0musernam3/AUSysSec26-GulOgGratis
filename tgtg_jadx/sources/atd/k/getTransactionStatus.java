package atd.k;

import android.location.Location;
import android.view.ViewConfiguration;
import atd.k.ChallengeResultCompleted;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import defpackage.g;
import e40.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Longitude;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Location;", "location", "<init>", "(Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Location;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Location;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLongitude.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Longitude.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/common/Longitude\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"})
public final class getTransactionStatus extends DeviceParameter {
    private static char AuthenticationRequestParameters = 0;
    private static int ChallengeResult = 1;
    private static int getDeviceData = 1;
    private static char[] getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKTransactionID;

    @NotNull
    private final getAdditionalDetails getSDKReferenceNumber;

    static {
        AuthenticationRequestParameters();
        ViewConfiguration.getMaximumFlingVelocity();
        ViewConfiguration.getTouchSlop();
        new getDeviceData((byte) 0);
        ChallengeResult = (getSDKEphemeralPublicKey + 65) % 128;
    }

    public getTransactionStatus(@NotNull getAdditionalDetails getadditionaldetails) {
        getadditionaldetails.getClass();
        this.getSDKReferenceNumber = getadditionaldetails;
    }

    public static void AuthenticationRequestParameters() {
        getSDKAppID = new char[]{30964, 30967, 30853, 30966};
        AuthenticationRequestParameters = (char) 19806;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double getSDKTransactionID(Location location) {
        getDeviceData = (getSDKTransactionID + 37) % 128;
        location.getClass();
        double longitude = location.getLongitude();
        getSDKTransactionID = (getDeviceData + 41) % 128;
        return longitude;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() {
        ChallengeResultCompleted sDKTransactionID = this.getSDKReferenceNumber.getSDKTransactionID(new g(7));
        if (!(sDKTransactionID instanceof ChallengeResultCompleted.getDeviceData)) {
            if (Intrinsics.areEqual(sDKTransactionID, ChallengeResultCompleted.getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters)) {
                return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
            }
            if (Intrinsics.areEqual(sDKTransactionID, ChallengeResultCompleted.getSDKReferenceNumber.C0008getSDKReferenceNumber.getSDKAppID)) {
                return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
            }
            a.f();
            return null;
        }
        getDeviceData = (getSDKTransactionID + 79) % 128;
        Double dValueOf = Double.valueOf(((ChallengeResultCompleted.getDeviceData) sDKTransactionID).getSDKReferenceNumber());
        double dDoubleValue = dValueOf.doubleValue();
        if (-180.0d > dDoubleValue || dDoubleValue > 180.0d) {
            dValueOf = null;
        } else {
            getSDKTransactionID = (getDeviceData + 9) % 128;
        }
        if (dValueOf == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        int i11 = getSDKTransactionID + 41;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            return DeviceParameterResult.Success.DoubleValue.m136boximpl(DeviceParameterResult.Success.DoubleValue.m137constructorimpl(dValueOf.doubleValue()));
        }
        DeviceParameterResult.Success.DoubleValue.m136boximpl(DeviceParameterResult.Success.DoubleValue.m137constructorimpl(dValueOf.doubleValue()));
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Longitude$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "MIN_VALUE", "", "MAX_VALUE", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b8) {
            this();
        }
    }
}
