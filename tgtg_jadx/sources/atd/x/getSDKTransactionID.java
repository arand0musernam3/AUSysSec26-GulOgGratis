package atd.x;

import android.app.Application;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/AndroidId;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "", "", "isHexadecimalWith8bytes", "(Ljava/lang/String;)Z", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidId.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/AndroidId\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
public final class getSDKTransactionID extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static int getMessageVersion;
    private static char getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static char getSDKReferenceNumber;
    private static char getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getDeviceData;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(short r5, int r6, int r7) {
        /*
            int r5 = r5 * 2
            int r5 = r5 + 4
            int r7 = r7 * 3
            int r7 = r7 + 66
            byte[] r0 = atd.x.getSDKTransactionID.$$a
            int r6 = r6 * 4
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r0[r5]
        L26:
            int r4 = -r4
            int r5 = r5 + 1
            int r7 = r7 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.getSDKTransactionID.$$d(short, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        BuildConfig = 1;
        getMessageVersion = 0;
        ChallengeResult = 1;
        getSDKTransactionID();
        ViewConfiguration.getDoubleTapTimeout();
        new C0017getSDKTransactionID((byte) 0);
        getSDKEphemeralPublicKey = (BuildConfig + 103) % 128;
    }

    private getSDKTransactionID(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getDeviceData = getsdkreferencenumber;
    }

    private static boolean AuthenticationRequestParameters(String str) throws Throwable {
        Object[] objArr = new Object[1];
        b("빾⾷胦鑣組셠᠄\uf518⬗呜淳⍼", (ViewConfiguration.getFadingEdgeLength() >> 16) + 12, objArr);
        if (new Regex(((String) objArr[0]).intern()).e(str)) {
            int i11 = ChallengeResult + 111;
            getMessageVersion = i11 % 128;
            int i12 = i11 % 2;
            int length = str.length();
            if (i12 == 0 ? length == 16 : length == 26) {
                getMessageVersion = (ChallengeResult + 73) % 128;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(java.lang.String r31, int r32, java.lang.Object[] r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.getSDKTransactionID.b(java.lang.String, int, java.lang.Object[]):void");
    }

    public static void getSDKTransactionID() {
        getSDKAppID = (char) 57160;
        getSDKReferenceNumber = (char) 36619;
        getSDKTransactionID = (char) 34722;
        AuthenticationRequestParameters = (char) 30189;
    }

    public static void init$0() {
        $$a = new byte[]{77, -47, 38, 84};
        $$b = 24;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004f A[PHI: r0
      0x004f: PHI (r0v11 java.lang.String) = (r0v10 java.lang.String), (r0v27 java.lang.String) binds: [B:8:0x004d, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = atd.x.getSDKTransactionID.ChallengeResult
            int r0 = r0 + 113
            int r1 = r0 % 128
            atd.x.getSDKTransactionID.getMessageVersion = r1
            int r0 = r0 % 2
            atd.t.getSDKReferenceNumber r1 = r6.getDeviceData
            r2 = 1
            java.lang.String r3 = "⏣꽯꿗뤐髏鄗恔\ue0fb欽毘"
            r4 = 0
            if (r0 == 0) goto L32
            int r0 = android.os.Process.getThreadPriority(r4)
            int r0 = r0 + 72
            int r0 = r0 >>> 29
            r5 = 116(0x74, float:1.63E-43)
            int r0 = r5 >> r0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            b(r3, r0, r2)
            r0 = r2[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L72
            goto L4f
        L32:
            int r0 = android.os.Process.getThreadPriority(r4)
            int r0 = r0 + 20
            int r0 = r0 >> 6
            int r0 = 10 - r0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            b(r3, r0, r2)
            r0 = r2[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L72
        L4f:
            boolean r1 = AuthenticationRequestParameters(r0)
            if (r1 == 0) goto L5e
            int r1 = atd.x.getSDKTransactionID.ChallengeResult
            int r1 = r1 + 43
            int r1 = r1 % 128
            atd.x.getSDKTransactionID.getMessageVersion = r1
            goto L67
        L5e:
            int r0 = atd.x.getSDKTransactionID.ChallengeResult
            int r0 = r0 + 71
            int r0 = r0 % 128
            atd.x.getSDKTransactionID.getMessageVersion = r0
            r0 = 0
        L67:
            if (r0 == 0) goto L72
            java.lang.String r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m165constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$StringValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m164boximpl(r0)
            return r0
        L72:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.getSDKTransactionID.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: renamed from: atd.x.getSDKTransactionID$getSDKTransactionID, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/AndroidId$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0017getSDKTransactionID {
        private C0017getSDKTransactionID() {
        }

        public /* synthetic */ C0017getSDKTransactionID(byte b8) {
            this();
        }
    }

    public /* synthetic */ getSDKTransactionID(Application application) {
        this(application, new atd.t.getSDKTransactionID(application));
    }
}
