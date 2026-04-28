package atd.d;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/adyen/threeds2/internal/api/JsonResult;", "T", "", "EmptyOrNull", "InvalidFormat", "NotPresent", "Valid", "Lcom/adyen/threeds2/internal/api/JsonResult$EmptyOrNull;", "Lcom/adyen/threeds2/internal/api/JsonResult$InvalidFormat;", "Lcom/adyen/threeds2/internal/api/JsonResult$NotPresent;", "Lcom/adyen/threeds2/internal/api/JsonResult$Valid;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
interface ChallengeResultTimeout<T> {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/adyen/threeds2/internal/api/JsonResult$EmptyOrNull;", "Lcom/adyen/threeds2/internal/api/JsonResult;", "", "<init>", "()V", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData implements ChallengeResultTimeout {
        private static int getSDKAppID = 0;
        private static int getSDKReferenceNumber = 1;

        @NotNull
        public static final getDeviceData getSDKTransactionID = new getDeviceData();

        static {
            int i11 = getSDKReferenceNumber + 95;
            getSDKAppID = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        }

        private getDeviceData() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/api/JsonResult$Valid;", "T", "Lcom/adyen/threeds2/internal/api/JsonResult;", "value", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID<T> implements ChallengeResultTimeout<T> {
        private static int getDeviceData = 1;
        private static int getSDKTransactionID;
        private final T getSDKReferenceNumber;

        public getSDKAppID(T t9) {
            this.getSDKReferenceNumber = t9;
        }

        public final T getSDKReferenceNumber() {
            int i11 = getSDKTransactionID;
            int i12 = (((i11 | 121) << 1) - (i11 ^ 121)) % 128;
            getDeviceData = i12;
            T t9 = this.getSDKReferenceNumber;
            getSDKTransactionID = ((((i12 ^ 109) | (i12 & 109)) << 1) - (((~i12) & 109) | (i12 & (-110)))) % 128;
            return t9;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/adyen/threeds2/internal/api/JsonResult$NotPresent;", "Lcom/adyen/threeds2/internal/api/JsonResult;", "", "<init>", "()V", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber implements ChallengeResultTimeout {

        @NotNull
        public static final getSDKReferenceNumber AuthenticationRequestParameters = new getSDKReferenceNumber();
        private static int getSDKReferenceNumber = 0;
        private static int getSDKTransactionID = 1;

        static {
            int i11 = getSDKTransactionID;
            int i12 = i11 ^ 29;
            int i13 = ((i11 & 29) | i12) << 1;
            int i14 = -i12;
            getSDKReferenceNumber = ((i13 & i14) + (i13 | i14)) % 128;
        }

        private getSDKReferenceNumber() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/adyen/threeds2/internal/api/JsonResult$InvalidFormat;", "Lcom/adyen/threeds2/internal/api/JsonResult;", "", "<init>", "()V", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID implements ChallengeResultTimeout {

        @NotNull
        public static final getSDKTransactionID getDeviceData = new getSDKTransactionID();
        private static int getSDKAppID = 1;
        private static int getSDKReferenceNumber;

        static {
            int i11 = getSDKReferenceNumber;
            int i12 = (((i11 | 26) << 1) - (i11 ^ 26)) - 1;
            getSDKAppID = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 85 / 0;
            }
        }

        private getSDKTransactionID() {
        }
    }
}
