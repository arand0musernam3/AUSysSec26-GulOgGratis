package atd.x;

import android.app.Application;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/TtsDefaultPitch;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTtsDefaultPitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TtsDefaultPitch.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/TtsDefaultPitch\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class ChallengeResultKt extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static int ChallengeResultCancelled;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static int getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKReferenceNumber;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(byte r5, short r6, int r7) {
        /*
            byte[] r0 = atd.x.ChallengeResultKt.$$a
            int r7 = r7 * 4
            int r1 = r7 + 1
            int r5 = r5 * 3
            int r5 = 3 - r5
            int r6 = 110 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r6 = r5
            r4 = r7
            r3 = r2
            goto L2a
        L15:
            r3 = r6
            r6 = r5
            r5 = r3
            r3 = r2
        L19:
            byte r4 = (byte) r5
            int r6 = r6 + 1
            r1[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L26:
            int r3 = r3 + 1
            r4 = r0[r6]
        L2a:
            int r5 = r5 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.ChallengeResultKt.$$d(byte, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        ChallengeResultCancelled = 1;
        getSDKTransactionID = 0;
        getDeviceData = 1;
        getSDKAppID();
        new getSDKTransactionID((byte) 0);
        int i11 = getSDKAppID + 37;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private ChallengeResultKt(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKReferenceNumber = getsdkreferencenumber;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cc, code lost:
    
        r0 = r0[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d0, code lost:
    
        r1 = new java.lang.Object[r27];
        r1[1] = java.lang.Integer.valueOf(r3);
        r1[0] = java.lang.Integer.valueOf(r0);
        r0 = atd.e.ChallengeResult.getSDKTransactionID(788825057);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e5, code lost:
    
        if (r0 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e7, code lost:
    
        r0 = (byte) 0;
        r2 = (byte) (r0 + 2);
        r0 = atd.e.ChallengeResult.getDeviceData((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 3095, (char) (14367 - android.view.View.MeasureSpec.getMode(0)), (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 17, -210991631, false, $$d(r0, r2, (byte) (r2 - 2)), new java.lang.Class[]{r11, r11});
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0125, code lost:
    
        r4[r5] = ((java.lang.Character) ((java.lang.reflect.Method) r0).invoke(null, r1)).charValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0127, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(java.lang.String r27, boolean r28, int[] r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.ChallengeResultKt.b(java.lang.String, boolean, int[], java.lang.Object[]):void");
    }

    public static void getSDKAppID() {
        AuthenticationRequestParameters = new char[]{63419, 63457, 63483, 63484, 63462, 63470, 63467, 63466, 63468, 63460, 63487, 63487, 63462, 63464, 63459, 63457, 63460, 63247, 63352, 63356, 63356};
    }

    public static void init$0() {
        $$a = new byte[]{105, 109, -121, 42};
        $$b = 78;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if (r0 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        return com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.m150boximpl(com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.m151constructorimpl(r0.intValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
    
        if (r0 != null) goto L11;
     */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() throws java.lang.Throwable {
        /*
            r5 = this;
            int r0 = atd.x.ChallengeResultKt.getDeviceData
            int r0 = r0 + 125
            int r0 = r0 % 128
            atd.x.ChallengeResultKt.getSDKTransactionID = r0
            atd.t.getSDKReferenceNumber r0 = r5.getSDKReferenceNumber
            r1 = 0
            r2 = 17
            r3 = 1
            int[] r2 = new int[]{r1, r2, r1, r3}
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"
            b(r4, r1, r2, r3)
            r2 = r3[r1]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            java.lang.String r0 = r0.AuthenticationRequestParameters(r2)
            if (r0 == 0) goto L50
            int r2 = atd.x.ChallengeResultKt.getDeviceData
            int r2 = r2 + 31
            int r3 = r2 % 128
            atd.x.ChallengeResultKt.getSDKTransactionID = r3
            int r2 = r2 % 2
            if (r2 == 0) goto L3d
            java.lang.Integer r0 = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKReferenceNumber(r0)
            r2 = 57
            int r2 = r2 / r1
            if (r0 == 0) goto L50
            goto L43
        L3d:
            java.lang.Integer r0 = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKReferenceNumber(r0)
            if (r0 == 0) goto L50
        L43:
            int r0 = r0.intValue()
            int r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.m151constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$IntValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.IntValue.m150boximpl(r0)
            return r0
        L50:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.ChallengeResultKt.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/TtsDefaultPitch$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private getSDKTransactionID() {
        }

        public /* synthetic */ getSDKTransactionID(byte b8) {
            this();
        }
    }

    public /* synthetic */ ChallengeResultKt(Application application) {
        this(application, new atd.t.getSDKTransactionID(application));
    }
}
