package atd.n;

import android.os.Build;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Time;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$LongValue;", "getDeviceParameterResult-9LCWfJs", "()J", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeStatusHandler extends DeviceParameter {
    private static int AuthenticationRequestParameters = 1;
    private static int getDeviceData = 0;
    private static int getSDKAppID = 1;
    private static int getSDKReferenceNumber;
    private static char[] getSDKTransactionID;

    static {
        getSDKTransactionID();
        new AuthenticationRequestParameters((byte) 0);
        getSDKReferenceNumber = (getSDKAppID + 5) % 128;
    }

    private static long AuthenticationRequestParameters() {
        getDeviceData = (AuthenticationRequestParameters + 117) % 128;
        long jM158constructorimpl = DeviceParameterResult.Success.LongValue.m158constructorimpl(Build.TIME);
        getDeviceData = (AuthenticationRequestParameters + 51) % 128;
        return jM158constructorimpl;
    }

    public static void getSDKTransactionID() {
        getSDKTransactionID = new char[]{63454, 63278, 63250, 63276};
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getSDKReferenceNumber() {
        getDeviceData = (AuthenticationRequestParameters + 31) % 128;
        DeviceParameterResult.Success.LongValue longValueM157boximpl = DeviceParameterResult.Success.LongValue.m157boximpl(AuthenticationRequestParameters());
        int i11 = AuthenticationRequestParameters + 45;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            return longValueM157boximpl;
        }
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Time$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static int getDeviceData;
        private static int getSDKReferenceNumber;
        private static int getSDKTransactionID;

        private static String $$e(short s7, int i11, byte b8) {
            int i12 = 100 - (b8 * 2);
            byte[] bArr = $$c;
            int i13 = s7 * 2;
            int i14 = 3 - (i11 * 4);
            byte[] bArr2 = new byte[i13 + 1];
            int i15 = -1;
            if (bArr == null) {
                i12 = i13 + i12;
            }
            while (true) {
                i15++;
                i14++;
                bArr2[i15] = (byte) i12;
                if (i15 == i13) {
                    return new String(bArr2, 0);
                }
                i12 += bArr[i14];
            }
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKTransactionID = 0;
            getSDKReferenceNumber = 1;
            getDeviceData = 711855197;
        }

        private AuthenticationRequestParameters() {
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x0174  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0175  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(boolean r24, int r25, java.lang.String r26, int r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 385
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.n.ChallengeStatusHandler.AuthenticationRequestParameters.a(boolean, int, java.lang.String, int, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(byte r5, int r6, int r7, java.lang.Object[] r8) {
            /*
                int r7 = r7 * 3
                int r0 = r7 + 4
                int r6 = r6 * 4
                int r6 = 4 - r6
                byte[] r1 = atd.n.ChallengeStatusHandler.AuthenticationRequestParameters.$$a
                int r5 = r5 * 2
                int r5 = 104 - r5
                byte[] r0 = new byte[r0]
                int r7 = r7 + 3
                r2 = 0
                if (r1 != 0) goto L19
                r5 = r6
                r4 = r7
                r3 = r2
                goto L2e
            L19:
                r3 = r6
                r6 = r5
                r5 = r3
                r3 = r2
            L1d:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r7) goto L2a
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L2a:
                int r3 = r3 + 1
                r4 = r1[r5]
            L2e:
                int r4 = -r4
                int r6 = r6 + r4
                int r5 = r5 + 1
                int r6 = r6 + (-2)
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.n.ChallengeStatusHandler.AuthenticationRequestParameters.b(byte, int, int, java.lang.Object[]):void");
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getDeviceData(int r31, int r32) {
            /*
                Method dump skipped, instruction units count: 1481
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.n.ChallengeStatusHandler.AuthenticationRequestParameters.getDeviceData(int, int):java.lang.Object[]");
        }

        public static void init$0() {
            $$a = new byte[]{88, -33, -84, -115, -3, 3, -3};
            $$b = 9;
        }

        public static void init$1() {
            $$c = new byte[]{39, 8, -31, -31};
            $$d = 74;
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b8) {
            this();
        }
    }
}
