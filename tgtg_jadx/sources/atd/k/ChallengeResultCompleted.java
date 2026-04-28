package atd.k;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/LocationResult;", "", "Success", "Failure", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/LocationResult$Failure$EmptyOrNull;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/LocationResult$Failure$MissingPermissions;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/LocationResult$Success;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ChallengeResultCompleted {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/LocationResult$Success;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/LocationResult;", "field", "", "<init>", "(D)V", "getField", "()D", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData implements ChallengeResultCompleted {
        private static int AuthenticationRequestParameters = 1;
        private static int getDeviceData;
        private final double getSDKReferenceNumber;

        public getDeviceData(double d3) {
            this.getSDKReferenceNumber = d3;
        }

        public final double getSDKReferenceNumber() {
            int i11 = AuthenticationRequestParameters;
            int i12 = i11 & 125;
            int i13 = (~i12) & (i11 | 125);
            int i14 = i12 << 1;
            int i15 = (i13 & i14) + (i14 | i13);
            getDeviceData = i15 % 128;
            int i16 = i15 % 2;
            double d3 = this.getSDKReferenceNumber;
            if (i16 != 0) {
                int i17 = 33 / 0;
            }
            getDeviceData = (i11 + 89) % 128;
            return d3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/LocationResult$Failure;", "", "<init>", "()V", "EmptyOrNull", "MissingPermissions", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private static int getDeviceData = 0;
        private static int getSDKTransactionID = 1;

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/LocationResult$Failure$EmptyOrNull;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/LocationResult;", "<init>", "()V", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class getDeviceData implements ChallengeResultCompleted {

            @NotNull
            public static final getDeviceData AuthenticationRequestParameters = new getDeviceData();
            private static int getDeviceData = 0;
            private static int getSDKReferenceNumber = 1;

            static {
                int i11 = getSDKReferenceNumber;
                int i12 = i11 ^ 33;
                int i13 = ((i11 & 33) | i12) << 1;
                int i14 = -i12;
                int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
                getDeviceData = i15 % 128;
                if (i15 % 2 != 0) {
                    throw null;
                }
            }

            private getDeviceData() {
            }
        }

        /* JADX INFO: renamed from: atd.k.ChallengeResultCompleted$getSDKReferenceNumber$getSDKReferenceNumber, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/LocationResult$Failure$MissingPermissions;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/LocationResult;", "<init>", "()V", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0008getSDKReferenceNumber implements ChallengeResultCompleted {
            private static int AuthenticationRequestParameters = 1;
            private static int getDeviceData;

            @NotNull
            public static final C0008getSDKReferenceNumber getSDKAppID = new C0008getSDKReferenceNumber();

            static {
                int i11 = getDeviceData;
                int i12 = i11 & 45;
                int i13 = ((i11 ^ 45) | i12) << 1;
                int i14 = -((i11 | 45) & (~i12));
                AuthenticationRequestParameters = ((i13 & i14) + (i14 | i13)) % 128;
            }

            private C0008getSDKReferenceNumber() {
            }
        }

        static {
            new getSDKReferenceNumber();
            int i11 = getSDKTransactionID + 9;
            getDeviceData = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        }

        private getSDKReferenceNumber() {
        }
    }
}
