package atd.k;

import android.text.TextUtils;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/TimeZone;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/TimeZoneConverter;", "timeZoneConverter", "<init>", "(Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/TimeZoneConverter;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/TimeZoneConverter;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTimeZone.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeZone.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/common/TimeZone\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public final class protocolError extends DeviceParameter {
    private static boolean AuthenticationRequestParameters = false;
    private static int BuildConfig = 0;
    private static int ChallengeResult = 1;
    private static int ChallengeResultCancelled = 1;
    private static int getDeviceData;
    private static boolean getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static char[] getSDKReferenceNumber;

    @NotNull
    private final cancelled getSDKTransactionID;

    static {
        AuthenticationRequestParameters();
        TextUtils.getOffsetAfter("", 0);
        new AuthenticationRequestParameters((byte) 0);
        ChallengeResultCancelled = (BuildConfig + 61) % 128;
    }

    public /* synthetic */ protocolError(byte b8) {
        this(new getDeviceData());
    }

    public static void AuthenticationRequestParameters() {
        getSDKReferenceNumber = new char[]{21665, 21682, 21684};
        getDeviceData = 1286296674;
        getSDKAppID = true;
        AuthenticationRequestParameters = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() {
        /*
            r5 = this;
            atd.k.cancelled r0 = r5.getSDKTransactionID
            long r0 = r0.getSDKAppID()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r1 = r0.longValue()
            r3 = -720(0xfffffffffffffd30, double:NaN)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 > 0) goto L23
            int r3 = atd.k.protocolError.ChallengeResult
            int r3 = r3 + 49
            int r3 = r3 % 128
            atd.k.protocolError.getSDKEphemeralPublicKey = r3
            r3 = 841(0x349, double:4.155E-321)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L2b
            goto L34
        L23:
            int r0 = atd.k.protocolError.ChallengeResult
            int r0 = r0 + 95
            int r0 = r0 % 128
            atd.k.protocolError.getSDKEphemeralPublicKey = r0
        L2b:
            int r0 = atd.k.protocolError.getSDKEphemeralPublicKey
            int r0 = r0 + 11
            int r0 = r0 % 128
            atd.k.protocolError.ChallengeResult = r0
            r0 = 0
        L34:
            if (r0 == 0) goto L43
            long r0 = r0.longValue()
            long r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.LongValue.m158constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$LongValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.LongValue.m157boximpl(r0)
            return r0
        L43:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.k.protocolError.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/TimeZone$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "MIN_VALUE", "", "MAX_VALUE", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private AuthenticationRequestParameters() {
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b8) {
            this();
        }
    }

    private protocolError(@NotNull cancelled cancelledVar) {
        cancelledVar.getClass();
        this.getSDKTransactionID = cancelledVar;
    }

    public protocolError() {
        this((byte) 0);
    }
}
