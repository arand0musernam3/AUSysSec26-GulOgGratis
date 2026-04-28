package atd.w;

import android.app.Application;
import android.graphics.ImageFormat;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SimCarrierIdName;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSimCarrierIdName.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimCarrierIdName.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SimCarrierIdName\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public final class protocolError extends InitializeResultSuccess {
    private static int AuthenticationRequestParameters = 0;
    private static int ChallengeResult = 1;
    private static char[] getDeviceData = null;
    private static long getSDKAppID = 0;
    private static int getSDKReferenceNumber = 0;
    private static int getSDKTransactionID = 1;

    static {
        AuthenticationRequestParameters();
        TextUtils.getTrimmedLength("");
        ImageFormat.getBitsPerPixel(0);
        CdmaCellLocation.convertQuartSecToDecDegrees(0);
        new getSDKAppID((byte) 0);
        ChallengeResult = (getSDKReferenceNumber + 85) % 128;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public protocolError(@NotNull Application application) {
        super(application);
        application.getClass();
    }

    public static void AuthenticationRequestParameters() {
        getDeviceData = new char[]{62543, 13342, 29823, 46164};
        getSDKAppID = 6333264581057983535L;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() {
        /*
            r4 = this;
            int r0 = atd.w.protocolError.AuthenticationRequestParameters
            int r0 = r0 + 119
            int r0 = r0 % 128
            atd.w.protocolError.getSDKTransactionID = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            if (r0 >= r1) goto L24
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED
            r0.<init>(r1)
            int r1 = atd.w.protocolError.AuthenticationRequestParameters
            int r1 = r1 + 115
            int r3 = r1 % 128
            atd.w.protocolError.getSDKTransactionID = r3
            int r1 = r1 % 2
            if (r1 == 0) goto L23
            return r0
        L23:
            throw r2
        L24:
            android.telephony.TelephonyManager r0 = r4.ChallengeResult()
            if (r0 == 0) goto L62
            int r1 = atd.w.protocolError.AuthenticationRequestParameters
            int r1 = r1 + 79
            int r3 = r1 % 128
            atd.w.protocolError.getSDKTransactionID = r3
            int r1 = r1 % 2
            java.lang.CharSequence r0 = r0.getSimCarrierIdName()
            if (r1 != 0) goto L41
            r1 = 16
            int r1 = r1 / 0
            if (r0 == 0) goto L62
            goto L43
        L41:
            if (r0 == 0) goto L62
        L43:
            int r1 = atd.w.protocolError.getSDKTransactionID
            int r1 = r1 + 5
            int r3 = r1 % 128
            atd.w.protocolError.AuthenticationRequestParameters = r3
            int r1 = r1 % 2
            if (r1 != 0) goto L5e
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L62
            java.lang.String r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m165constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$StringValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m164boximpl(r0)
            return r0
        L5e:
            r0.toString()
            throw r2
        L62:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.w.protocolError.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SimCarrierIdName$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private getSDKAppID() {
        }

        public /* synthetic */ getSDKAppID(byte b8) {
            this();
        }
    }
}
