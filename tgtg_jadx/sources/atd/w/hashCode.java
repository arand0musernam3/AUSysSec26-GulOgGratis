package atd.w;

import android.app.Application;
import android.graphics.Color;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SubscriptionId;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSubscriptionId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptionId.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SubscriptionId\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public final class hashCode extends InitializeResultSuccess {
    private static long AuthenticationRequestParameters = 0;
    private static int ChallengeResult = 1;
    private static int getDeviceData = 0;
    private static char[] getSDKAppID = null;
    private static int getSDKReferenceNumber = 1;
    private static int getSDKTransactionID;

    static {
        getSDKAppID();
        ViewConfiguration.getKeyRepeatDelay();
        View.MeasureSpec.makeMeasureSpec(0, 0);
        TextUtils.lastIndexOf("", '0');
        new AuthenticationRequestParameters((byte) 0);
        ChallengeResult = (getDeviceData + 41) % 128;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hashCode(@NotNull Application application) {
        super(application);
        application.getClass();
    }

    public static void getSDKAppID() {
        getSDKAppID = new char[]{23203, 49295, 28270, 38339};
        AuthenticationRequestParameters = 9096287992632667730L;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() {
        int i11 = getSDKReferenceNumber + 107;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0 ? Build.VERSION.SDK_INT < 30 : Build.VERSION.SDK_INT < 79) {
            DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
            getSDKTransactionID = (getSDKReferenceNumber + 75) % 128;
            return failure;
        }
        TelephonyManager telephonyManagerChallengeResult = ChallengeResult();
        if (telephonyManagerChallengeResult == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        int i12 = getSDKReferenceNumber + 79;
        getSDKTransactionID = i12 % 128;
        if (i12 % 2 == 0) {
            return DeviceParameterResult.Success.IntValue.m150boximpl(DeviceParameterResult.Success.IntValue.m151constructorimpl(telephonyManagerChallengeResult.getSubscriptionId()));
        }
        DeviceParameterResult.Success.IntValue.m150boximpl(DeviceParameterResult.Success.IntValue.m151constructorimpl(telephonyManagerChallengeResult.getSubscriptionId()));
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SubscriptionId$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static long getSDKAppID;
        private static int getSDKTransactionID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0031). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(short r6, byte r7, byte r8) {
            /*
                int r8 = r8 * 2
                int r8 = r8 + 120
                int r7 = r7 * 2
                int r0 = 1 - r7
                int r6 = r6 * 4
                int r6 = 3 - r6
                byte[] r1 = atd.w.hashCode.AuthenticationRequestParameters.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                int r7 = 0 - r7
                if (r1 != 0) goto L1a
                r8 = r6
                r3 = r1
                r4 = r2
                r1 = r7
                goto L31
            L1a:
                r3 = r2
            L1b:
                int r6 = r6 + 1
                byte r4 = (byte) r8
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L2a
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L2a:
                r3 = r1[r6]
                r5 = r8
                r8 = r6
                r6 = r3
                r3 = r1
                r1 = r5
            L31:
                int r6 = -r6
                int r6 = r6 + r1
                r1 = r8
                r8 = r6
                r6 = r1
                r1 = r3
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.hashCode.AuthenticationRequestParameters.$$e(short, byte, byte):java.lang.String");
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKTransactionID = 0;
            AuthenticationRequestParameters = 1;
            getSDKAppID = -1359336203168953733L;
        }

        private AuthenticationRequestParameters() {
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] AuthenticationRequestParameters(int r31, int r32) {
            /*
                Method dump skipped, instruction units count: 1302
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.hashCode.AuthenticationRequestParameters.AuthenticationRequestParameters(int, int):java.lang.Object[]");
        }

        private static void a(String str, int i11, Object[] objArr) throws Throwable {
            $11 = ($10 + 105) % 128;
            char[] charArray = str != null ? str.toCharArray() : str;
            atd.bb.completed completedVar = new atd.bb.completed();
            char[] sDKTransactionID = atd.bb.completed.getSDKTransactionID(getSDKAppID ^ 2436480605514729170L, charArray, i11);
            completedVar.getSDKTransactionID = 4;
            while (true) {
                int i12 = completedVar.getSDKTransactionID;
                if (i12 >= sDKTransactionID.length) {
                    String str2 = new String(sDKTransactionID, 4, sDKTransactionID.length - 4);
                    $11 = ($10 + 95) % 128;
                    objArr[0] = str2;
                    return;
                }
                $11 = ($10 + 23) % 128;
                int i13 = i12 - 4;
                completedVar.getSDKAppID = i13;
                try {
                    Object[] objArr2 = {Long.valueOf(sDKTransactionID[i12] ^ sDKTransactionID[i12 % 4]), Long.valueOf(i13), Long.valueOf(getSDKAppID)};
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(2011691457);
                    if (sDKTransactionID2 == null) {
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 2775;
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 13061);
                        int i14 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 24;
                        byte b8 = (byte) 0;
                        byte b11 = b8;
                        String str$$e = $$e(b8, b11, b11);
                        Class cls = Long.TYPE;
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(iLastIndexOf, cLastIndexOf, i14, -1416626223, false, str$$e, new Class[]{cls, cls, cls});
                    }
                    sDKTransactionID[i12] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {completedVar, completedVar};
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-721583866);
                    if (sDKTransactionID3 == null) {
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getFadingEdgeLength() >> 16) + 408, (char) TextUtils.getTrimmedLength(""), 30 - Color.alpha(0), 144017174, false, "y", new Class[]{Object.class, Object.class});
                    }
                    ((Method) sDKTransactionID3).invoke(null, objArr3);
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(short r7, short r8, byte r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 * 4
                int r7 = r7 + 4
                int r9 = r9 * 2
                int r9 = 3 - r9
                int r8 = r8 * 2
                int r8 = 104 - r8
                byte[] r0 = atd.w.hashCode.AuthenticationRequestParameters.$$a
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r0
                r4 = r2
                r0 = r9
                goto L30
            L17:
                r3 = r2
            L18:
                int r9 = r9 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L29
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L29:
                r3 = r0[r9]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r0
                r0 = r6
            L30:
                int r9 = r9 + r8
                int r8 = r9 + (-2)
                r9 = r0
                r0 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.hashCode.AuthenticationRequestParameters.b(short, short, byte, java.lang.Object[]):void");
        }

        public static void init$0() {
            $$a = new byte[]{63, -107, 81, -105, 3, -3, 3};
            $$b = 50;
        }

        public static void init$1() {
            $$c = new byte[]{123, 97, -37, -69};
            $$d = 172;
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b8) {
            this();
        }
    }
}
