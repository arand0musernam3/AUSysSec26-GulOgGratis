package atd.x;

import android.text.TextUtils;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import kotlin.Metadata;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/SysPropSettingVersion;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Failure;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Failure;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeStatusReceiver extends DeviceParameter {
    private static boolean AuthenticationRequestParameters = false;
    private static int BuildConfig = 1;
    private static int ChallengeResult = 0;
    private static char[] getDeviceData = null;
    private static int getMessageVersion = 1;
    private static boolean getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    static {
        getSDKAppID();
        TextUtils.lastIndexOf("", '0', 0, 0);
        new getSDKAppID((byte) 0);
        BuildConfig = (ChallengeResult + 93) % 128;
    }

    public static void getSDKAppID() {
        getDeviceData = new char[]{21571, 21586, 21589, 21595};
        getSDKReferenceNumber = 1286296578;
        AuthenticationRequestParameters = true;
        getSDKAppID = true;
    }

    @NotNull
    private static DeviceParameterResult.Failure getSDKTransactionID() {
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        getMessageVersion = (getSDKTransactionID + 13) % 128;
        return failure;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getSDKReferenceNumber() {
        getSDKTransactionID = (getMessageVersion + 49) % 128;
        DeviceParameterResult.Failure sDKTransactionID = getSDKTransactionID();
        int i11 = getMessageVersion + 117;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 48 / 0;
        }
        return sDKTransactionID;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/SysPropSettingVersion$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static long getSDKReferenceNumber;
        private static int getSDKTransactionID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(short r6, byte r7, byte r8) {
            /*
                byte[] r0 = atd.x.ChallengeStatusReceiver.getSDKAppID.$$c
                int r7 = r7 * 4
                int r7 = 1 - r7
                int r6 = r6 * 2
                int r6 = r6 + 97
                int r8 = r8 * 4
                int r8 = 4 - r8
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r7
                r6 = r8
                r5 = r2
                goto L27
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r6
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r7) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L25:
                r3 = r0[r8]
            L27:
                int r8 = r8 + 1
                int r3 = -r3
                int r6 = r6 + r3
                r3 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.ChallengeStatusReceiver.getSDKAppID.$$e(short, byte, byte):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKTransactionID = 0;
            AuthenticationRequestParameters = 1;
            getSDKReferenceNumber = -5678424388709487683L;
        }

        private getSDKAppID() {
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0147  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(java.lang.String r21, int r22, java.lang.Object[] r23) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 336
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.ChallengeStatusReceiver.getSDKAppID.a(java.lang.String, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(int r5, short r6, int r7, java.lang.Object[] r8) {
            /*
                int r6 = 122 - r6
                int r0 = 19 - r5
                byte[] r1 = atd.x.ChallengeStatusReceiver.getSDKAppID.$$a
                int r7 = 25 - r7
                byte[] r0 = new byte[r0]
                int r5 = 18 - r5
                r2 = 0
                if (r1 != 0) goto L12
                r4 = r5
                r3 = r2
                goto L24
            L12:
                r3 = r2
            L13:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r5) goto L20
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L20:
                int r3 = r3 + 1
                r4 = r1[r7]
            L24:
                int r4 = -r4
                int r6 = r6 + r4
                int r6 = r6 + (-11)
                int r7 = r7 + 1
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.ChallengeStatusReceiver.getSDKAppID.b(int, short, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0259  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x029f  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x02f7 A[Catch: all -> 0x053a, TryCatch #1 {all -> 0x053a, blocks: (B:36:0x02e4, B:38:0x02f7, B:39:0x0338, B:52:0x03a5, B:54:0x03b2, B:55:0x03ed, B:57:0x040a, B:58:0x0448), top: B:78:0x02e4 }] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0531  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int getSDKAppID(java.util.List r30) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1347
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.ChallengeStatusReceiver.getSDKAppID.getSDKAppID(java.util.List):int");
        }

        public static void init$0() {
            $$a = new byte[]{101, 73, 104, 45, -9, -26, 22, 4, -18, -20, -41, 6, -24, -16, 7, -13, -28, 0, -17, -10, 26, -6, 32, -34, 41, 0, -18, -19};
            $$b = 205;
        }

        public static void init$1() {
            $$c = new byte[]{43, -52, -24, 121};
            $$d = BERTags.PRIVATE;
        }

        public /* synthetic */ getSDKAppID(byte b8) {
            this();
        }
    }
}
