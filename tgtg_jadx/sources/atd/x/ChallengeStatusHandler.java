package atd.x;

import android.app.Application;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.app.tgtg.model.local.AppConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/TtsDefaultRate;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTtsDefaultRate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TtsDefaultRate.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/TtsDefaultRate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class ChallengeStatusHandler extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKReferenceNumber;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(byte r5, int r6, byte r7) {
        /*
            int r6 = r6 * 4
            int r0 = 1 - r6
            byte[] r1 = atd.x.ChallengeStatusHandler.$$a
            int r5 = r5 * 2
            int r5 = r5 + 98
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L19
            r5 = r6
            r4 = r7
            r3 = r2
            goto L29
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L25:
            r4 = r1[r7]
            int r3 = r3 + 1
        L29:
            int r7 = r7 + 1
            int r5 = r5 + r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.ChallengeStatusHandler.$$d(byte, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AuthenticationRequestParameters = 0;
        getSDKEphemeralPublicKey = 1;
        getSDKTransactionID = 0;
        getSDKAppID = 1;
        AuthenticationRequestParameters();
        ViewConfiguration.getScrollBarFadeDuration();
        Color.red(0);
        ExpandableListView.getPackedPositionForGroup(0);
        new getSDKReferenceNumber((byte) 0);
        int i11 = AuthenticationRequestParameters + 35;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 90 / 0;
        }
    }

    private ChallengeStatusHandler(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKReferenceNumber = getsdkreferencenumber;
    }

    public static void AuthenticationRequestParameters() {
        getDeviceData = 711855245;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r25, int r26, java.lang.String r27, int r28, boolean r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.ChallengeStatusHandler.b(int, int, java.lang.String, int, boolean, java.lang.Object[]):void");
    }

    public static void init$0() {
        $$a = new byte[]{125, 105, -35, 39};
        $$b = 153;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        Integer sDKReferenceNumber;
        atd.t.getSDKReferenceNumber getsdkreferencenumber = this.getSDKReferenceNumber;
        Object[] objArr = new Object[1];
        b(15 - View.MeasureSpec.getSize(0), 179 - ImageFormat.getBitsPerPixel(0), "\n\t\ufff5\ufffa\ufffb￼\ufff7\u000b\u0002\n\ufff5\b\ufff7\n\ufffb\n", 16 - ((Process.getThreadPriority(0) + 20) >> 6), false, objArr);
        String strAuthenticationRequestParameters = getsdkreferencenumber.AuthenticationRequestParameters(((String) objArr[0]).intern());
        if (strAuthenticationRequestParameters == null || (sDKReferenceNumber = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKReferenceNumber(strAuthenticationRequestParameters)) == null) {
            DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
            getSDKTransactionID = (getSDKAppID + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
            return failure;
        }
        int i11 = getSDKTransactionID + 91;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            return DeviceParameterResult.Success.IntValue.m150boximpl(DeviceParameterResult.Success.IntValue.m151constructorimpl(sDKReferenceNumber.intValue()));
        }
        DeviceParameterResult.Success.IntValue.m150boximpl(DeviceParameterResult.Success.IntValue.m151constructorimpl(sDKReferenceNumber.intValue()));
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/TtsDefaultRate$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private getSDKReferenceNumber() {
        }

        public /* synthetic */ getSDKReferenceNumber(byte b8) {
            this();
        }
    }

    public /* synthetic */ ChallengeStatusHandler(Application application) {
        this(application, new atd.t.getSDKTransactionID(application));
    }
}
