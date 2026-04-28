package atd.k;

import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/OsVersion;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResultTimeout extends DeviceParameter {
    private static char[] AuthenticationRequestParameters = null;
    private static int getDeviceData = 1;
    private static int getSDKAppID = 1;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    static {
        getSDKTransactionID();
        new AuthenticationRequestParameters((byte) 0);
        int i11 = getDeviceData + 85;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 42 / 0;
        }
    }

    @NotNull
    private static String AuthenticationRequestParameters() {
        getSDKReferenceNumber = (getSDKAppID + 1) % 128;
        String str = Build.VERSION.RELEASE;
        str.getClass();
        String strM165constructorimpl = DeviceParameterResult.Success.StringValue.m165constructorimpl(str);
        int i11 = getSDKReferenceNumber + 89;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 41 / 0;
        }
        return strM165constructorimpl;
    }

    public static void getSDKTransactionID() {
        AuthenticationRequestParameters = new char[]{63465, 63309, 63286, 63284};
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getSDKReferenceNumber() {
        getSDKAppID = (getSDKReferenceNumber + 85) % 128;
        DeviceParameterResult.Success.StringValue stringValueM164boximpl = DeviceParameterResult.Success.StringValue.m164boximpl(AuthenticationRequestParameters());
        int i11 = getSDKAppID + 21;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            return stringValueM164boximpl;
        }
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/OsVersion$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static final int $$f = 0;
        private static int $10;
        private static int $11;
        private static long AuthenticationRequestParameters;
        private static int getDeviceData;
        private static int getSDKTransactionID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$g(byte r7, int r8, int r9) {
            /*
                int r9 = r9 * 2
                int r9 = 99 - r9
                byte[] r0 = atd.k.ChallengeResultTimeout.AuthenticationRequestParameters.$$c
                int r8 = r8 * 4
                int r8 = r8 + 4
                int r7 = r7 * 4
                int r7 = 1 - r7
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L18
                r3 = r0
                r4 = r2
                r0 = r9
                r9 = r8
                goto L2d
            L18:
                r3 = r2
            L19:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r7) goto L26
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L26:
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r0
                r0 = r6
            L2d:
                int r8 = r8 + r0
                int r9 = r9 + 1
                r0 = r9
                r9 = r8
                r8 = r0
                r0 = r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.k.ChallengeResultTimeout.AuthenticationRequestParameters.$$g(byte, int, int):java.lang.String");
        }

        static {
            init$2();
            $10 = 0;
            $11 = 1;
            init$1();
            init$0();
            getSDKTransactionID = 0;
            getDeviceData = 1;
            AuthenticationRequestParameters = 3252244722766302745L;
        }

        private AuthenticationRequestParameters() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v31 */
        /* JADX WARN: Type inference failed for: r0v32 */
        /* JADX WARN: Type inference failed for: r0v72 */
        /* JADX WARN: Type inference failed for: r0v93 */
        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] AuthenticationRequestParameters(android.content.Context r28, int r29, int r30, int r31) {
            /*
                Method dump skipped, instruction units count: 1377
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.k.ChallengeResultTimeout.AuthenticationRequestParameters.AuthenticationRequestParameters(android.content.Context, int, int, int):java.lang.Object[]");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r5, int r6, int r7, java.lang.Object[] r8) {
            /*
                int r7 = r7 * 25
                int r7 = r7 + 4
                byte[] r0 = atd.k.ChallengeResultTimeout.AuthenticationRequestParameters.$$d
                int r6 = r6 * 15
                int r1 = 26 - r6
                int r5 = r5 * 6
                int r5 = r5 + 97
                byte[] r1 = new byte[r1]
                int r6 = 25 - r6
                r2 = 0
                if (r0 != 0) goto L18
                r4 = r7
                r3 = r2
                goto L2a
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r5
                r1[r3] = r4
                if (r3 != r6) goto L26
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L26:
                int r3 = r3 + 1
                r4 = r0[r7]
            L2a:
                int r7 = r7 + 1
                int r4 = -r4
                int r5 = r5 + r4
                int r5 = r5 + (-5)
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.k.ChallengeResultTimeout.AuthenticationRequestParameters.a(int, int, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0110, code lost:
        
            r4[r6] = (char) r5[r6];
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0116, code lost:
        
            r0 = new java.lang.Object[]{r3, r3};
            r1 = atd.e.ChallengeResult.getSDKTransactionID(1456884118);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0120, code lost:
        
            if (r1 != null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0122, code lost:
        
            r1 = (byte) 0;
            r2 = r1;
            r1 = atd.e.ChallengeResult.getDeviceData(3095 - (android.os.Process.myPid() >> 22), (char) (14367 - android.view.View.MeasureSpec.getSize(0)), 18 - (android.view.ViewConfiguration.getTouchSlop() >> 8), -1967239290, false, $$g(r1, r2, (byte) (r2 + 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x014e, code lost:
        
            ((java.lang.reflect.Method) r1).invoke(null, r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0153, code lost:
        
            throw null;
         */
        /* JADX WARN: Removed duplicated region for block: B:44:0x019f  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x01a0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(java.lang.String r24, int r25, java.lang.Object[] r26) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 425
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.k.ChallengeResultTimeout.AuthenticationRequestParameters.b(java.lang.String, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void c(byte r7, short r8, int r9, java.lang.Object[] r10) {
            /*
                int r7 = 19 - r7
                int r8 = 104 - r8
                byte[] r0 = atd.k.ChallengeResultTimeout.AuthenticationRequestParameters.$$a
                int r9 = r9 + 4
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L12
                r8 = r7
                r3 = r0
                r4 = r2
                r0 = r9
                goto L2a
            L12:
                r3 = r2
            L13:
                int r9 = r9 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L24
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L24:
                r3 = r0[r9]
                r6 = r0
                r0 = r9
                r9 = r3
                r3 = r6
            L2a:
                int r9 = -r9
                int r8 = r8 + r9
                int r8 = r8 + (-2)
                r9 = r0
                r0 = r3
                r3 = r4
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.k.ChallengeResultTimeout.AuthenticationRequestParameters.c(byte, short, int, java.lang.Object[]):void");
        }

        public static void getDeviceData(long j9, long j11) throws Throwable {
            int i11 = getDeviceData + 119;
            getSDKTransactionID = i11 % 128;
            if (i11 % 2 != 0) {
                byte b8 = $$d[28];
                byte b11 = b8;
                Object[] objArr = new Object[1];
                a(b8, b11, b11, objArr);
                a0.B(null, (String) objArr[0], "AuthenticationRequestParameters");
                throw null;
            }
            byte[] bArr = $$d;
            byte b12 = bArr[28];
            byte b13 = b12;
            Object[] objArr2 = new Object[1];
            a(b12, b13, b13, objArr2);
            a0.B(null, (String) objArr2[0], "AuthenticationRequestParameters");
            getSDKTransactionID = (getDeviceData + 5) % 128;
            try {
                byte b14 = bArr[28];
                byte b15 = b14;
                Object[] objArr3 = new Object[1];
                a(b14, b15, b15, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                byte b16 = (byte) ($$e & 5);
                byte b17 = b16;
                Object[] objArr4 = new Object[1];
                a(b16, b17, b17, objArr4);
                Method method = cls.getMethod((String) objArr4[0], null);
                method.setAccessible(true);
                Object objInvoke = method.invoke(null, null);
                Object[] objArr5 = {atd.as.getSDKReferenceNumber.class.getField("getDeviceData").get(null)};
                Object[] objArr6 = new Object[1];
                b("힐髌䴧", 19800 - TextUtils.indexOf((CharSequence) "", '0'), objArr6);
                Method method2 = Set.class.getMethod(((String) objArr6[0]).intern(), Object.class);
                method2.setAccessible(true);
                int i12 = getSDKTransactionID + 31;
                getDeviceData = i12 % 128;
                if (i12 % 2 == 0) {
                    throw null;
                }
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }

        private static void getSDKAppID() throws Throwable {
            int i11 = getDeviceData + 43;
            getSDKTransactionID = i11 % 128;
            if (i11 % 2 != 0) {
                byte b8 = $$d[28];
                byte b11 = b8;
                Object[] objArr = new Object[1];
                a(b8, b11, b11, objArr);
                a0.B(null, (String) objArr[0], "AuthenticationRequestParameters");
                throw null;
            }
            byte[] bArr = $$d;
            byte b12 = bArr[28];
            byte b13 = b12;
            Object[] objArr2 = new Object[1];
            a(b12, b13, b13, objArr2);
            a0.B(null, (String) objArr2[0], "AuthenticationRequestParameters");
            getDeviceData = (getSDKTransactionID + 73) % 128;
            try {
                byte b14 = bArr[28];
                byte b15 = b14;
                Object[] objArr3 = new Object[1];
                a(b14, b15, b15, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                byte b16 = (byte) ($$e & 5);
                byte b17 = b16;
                Object[] objArr4 = new Object[1];
                a(b16, b17, b17, objArr4);
                Method method = cls.getMethod((String) objArr4[0], null);
                method.setAccessible(true);
                Object objInvoke = method.invoke(null, null);
                Object[] objArr5 = {atd.as.AuthenticationRequestParameters.class.getField("getSDKAppID").get(null)};
                Object[] objArr6 = new Object[1];
                b("힐髌䴧", (Process.myTid() >> 22) + 19801, objArr6);
                Method method2 = Set.class.getMethod(((String) objArr6[0]).intern(), Object.class);
                method2.setAccessible(true);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }

        public static void init$0() {
            $$a = new byte[]{81, 50, 24, 73, 0, -17, 31, 13, -9, 8, -49, -2, 37, 3, 0, -17, 31, 13, -9, -11, -32, 15, -15, -7, 16, -4, -19, 9, -8, -1, 35, 3, -3, 3, -3, 50};
            $$b = 74;
        }

        public static void init$1() {
            $$d = new byte[]{36, 103, 52, 113, -24, 11, 49, -56, -22, 63, -62, -3, -20, 28, 10, -12, -14, -35, 12, -18, -10, 13, -7, -22, 6, -11, -4, 32, 0, -3, -20, 28, 10, -12, 5, -52, -5, 34, 0};
            $$e = 91;
        }

        public static void init$2() {
            $$c = new byte[]{28, 119, -33, 109};
            $$f = 175;
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b8) {
            this();
        }
    }
}
