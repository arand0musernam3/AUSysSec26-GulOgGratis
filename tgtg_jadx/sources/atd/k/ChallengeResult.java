package atd.k;

import android.location.Location;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Latitude;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Location;", "location", "<init>", "(Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Location;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Location;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLatitude.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Latitude.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/common/Latitude\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"})
public final class ChallengeResult extends DeviceParameter {
    private static boolean AuthenticationRequestParameters = false;
    private static int ChallengeResult = 0;
    private static int ChallengeResultCancelled = 1;
    private static int getMessageVersion = 0;
    private static char[] getSDKAppID = null;
    private static int getSDKEphemeralPublicKey = 1;
    private static boolean getSDKReferenceNumber;
    private static int getSDKTransactionID;

    @NotNull
    private final getAdditionalDetails getDeviceData;

    static {
        getSDKTransactionID();
        ViewConfiguration.getScrollBarFadeDuration();
        new getDeviceData((byte) 0);
        int i11 = getSDKEphemeralPublicKey + 125;
        getMessageVersion = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 71 / 0;
        }
    }

    public ChallengeResult(@NotNull getAdditionalDetails getadditionaldetails) {
        getadditionaldetails.getClass();
        this.getDeviceData = getadditionaldetails;
    }

    public static void getSDKTransactionID() {
        getSDKAppID = new char[]{21786, 21735, 21732};
        getSDKTransactionID = 1286296791;
        getSDKReferenceNumber = true;
        AuthenticationRequestParameters = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() {
        /*
            r8 = this;
            int r0 = atd.k.ChallengeResult.ChallengeResultCancelled
            int r0 = r0 + 57
            int r0 = r0 % 128
            atd.k.ChallengeResult.ChallengeResult = r0
            atd.k.getAdditionalDetails r0 = r8.getDeviceData
            g r1 = new g
            r2 = 6
            r1.<init>(r2)
            atd.k.ChallengeResultCompleted r0 = r0.getSDKTransactionID(r1)
            boolean r1 = r0 instanceof atd.k.ChallengeResultCompleted.getDeviceData
            if (r1 == 0) goto L7b
            atd.k.ChallengeResultCompleted$getDeviceData r0 = (atd.k.ChallengeResultCompleted.getDeviceData) r0
            double r0 = r0.getSDKReferenceNumber()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            double r1 = r0.doubleValue()
            r3 = -4587338432941916160(0xc056800000000000, double:-90.0)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r4 = 0
            if (r3 > 0) goto L53
            int r3 = atd.k.ChallengeResult.ChallengeResult
            int r3 = r3 + 67
            int r5 = r3 % 128
            atd.k.ChallengeResult.ChallengeResultCancelled = r5
            int r3 = r3 % 2
            if (r3 == 0) goto L52
            r6 = 4636033603912859648(0x4056800000000000, double:90.0)
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 > 0) goto L5b
            int r5 = r5 + 85
            int r5 = r5 % 128
            atd.k.ChallengeResult.ChallengeResult = r5
            int r5 = r5 + 47
            int r5 = r5 % 128
            atd.k.ChallengeResult.ChallengeResultCancelled = r5
            goto L5c
        L52:
            throw r4
        L53:
            int r0 = atd.k.ChallengeResult.ChallengeResult
            int r0 = r0 + 115
            int r0 = r0 % 128
            atd.k.ChallengeResult.ChallengeResultCancelled = r0
        L5b:
            r0 = r4
        L5c:
            if (r0 == 0) goto L73
            int r1 = atd.k.ChallengeResult.ChallengeResult
            int r1 = r1 + 109
            int r1 = r1 % 128
            atd.k.ChallengeResult.ChallengeResultCancelled = r1
            double r0 = r0.doubleValue()
            double r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.DoubleValue.m137constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$DoubleValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.DoubleValue.m136boximpl(r0)
            return r0
        L73:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        L7b:
            atd.k.ChallengeResultCompleted$getSDKReferenceNumber$getDeviceData r1 = atd.k.ChallengeResultCompleted.getSDKReferenceNumber.getDeviceData.AuthenticationRequestParameters
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r1 == 0) goto L8b
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        L8b:
            atd.k.ChallengeResultCompleted$getSDKReferenceNumber$getSDKReferenceNumber r1 = atd.k.ChallengeResultCompleted.getSDKReferenceNumber.C0008getSDKReferenceNumber.getSDKAppID
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L9b
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.MISSING_PERMISSION
            r0.<init>(r1)
            return r0
        L9b:
            e40.a.f()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.k.ChallengeResult.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Latitude$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "MIN_VALUE", "", "MAX_VALUE", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b8) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double getSDKReferenceNumber(Location location) {
        int i11 = ChallengeResultCancelled + 41;
        ChallengeResult = i11 % 128;
        if (i11 % 2 != 0) {
            location.getClass();
            location.getLatitude();
            throw null;
        }
        location.getClass();
        double latitude = location.getLatitude();
        int i12 = ChallengeResult + 53;
        ChallengeResultCancelled = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 67 / 0;
        }
        return latitude;
    }
}
