package atd.t;

import android.app.Application;
import android.provider.Settings;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/SystemSettings;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "get", "", "setting", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AuthenticationRequestParameters implements getSDKReferenceNumber {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int getDeviceData;
    private static short[] getMessageVersion;
    private static byte[] getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;

    @NotNull
    private final Application getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(int r6, short r7, int r8) {
        /*
            byte[] r0 = atd.t.AuthenticationRequestParameters.$$c
            int r6 = r6 * 4
            int r1 = r6 + 1
            int r8 = r8 * 2
            int r8 = 3 - r8
            int r7 = r7 * 4
            int r7 = 105 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2d
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r8]
            r5 = r0
            r0 = r8
            r8 = r3
            r3 = r5
        L2d:
            int r7 = r7 + r8
            r8 = r0
            r0 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.t.AuthenticationRequestParameters.$$e(int, short, int):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        BuildConfig = 0;
        getSDKEphemeralPublicKey = 1;
        getDeviceData = -1069820637;
        getSDKReferenceNumber = 829166645;
        AuthenticationRequestParameters = 2009578988;
        getSDKAppID = new byte[]{34, -18, -57, -31, -12, -13, -34, -59, -88, -12, -7, -31, -12, -13, -2, 37, -72, -17, -24, -19, -4, -28, -3, -33, -11, -26, -47, -117, -17, -16, -31, -61, -24, -28, -23, -22, -18, -33, -71, -1, -24, 47, 56, 41, 20, -50, 50, 59, 36, 6, 51, 47, 44, 45, 49, 98, 6, -16, 44, 119, -17, 59, 56, 32, 59, 50, 61, 100, -1, 46, 47, 44, 3, 43, 60, -52, 24, 22, 7, 22, 37, 16, -91, 40, 24, 111, 96, 31, 97, 23, 118, 28, 96, 90, 40, 24, 98, 97, 92, -34, 110, 30, 100, 95, 45, 18, 114, 91, -44, -97, -18, -25, -98, -32, -106, -11, -29, -25, -38, -95, -29, -56};
    }

    public AuthenticationRequestParameters(@NotNull Application application) {
        application.getClass();
        this.getSDKTransactionID = application;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01a0 A[PHI: r9
      0x01a0: PHI (r9v7 int) = (r9v6 int), (r9v21 int) binds: [B:43:0x019e, B:40:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a2 A[PHI: r9
      0x01a2: PHI (r9v18 int) = (r9v6 int), (r9v21 int) binds: [B:43:0x019e, B:40:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r31, int r32, int r33, byte r34, short r35, java.lang.Object[] r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.t.AuthenticationRequestParameters.a(int, int, int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0023). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 2
            int r6 = 35 - r6
            int r8 = r8 + 101
            byte[] r0 = atd.t.AuthenticationRequestParameters.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r6
            r8 = r7
            r4 = r2
            goto L23
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            r3 = r0[r6]
        L23:
            int r6 = r6 + 1
            int r8 = r8 + r3
            int r8 = r8 + (-2)
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.t.AuthenticationRequestParameters.b(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38, types: [int] */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41, types: [long] */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v49, types: [int] */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r12v70 */
    /* JADX WARN: Type inference failed for: r12v71 */
    /* JADX WARN: Type inference failed for: r12v72 */
    /* JADX WARN: Type inference failed for: r12v73 */
    /* JADX WARN: Type inference failed for: r12v74 */
    /* JADX WARN: Type inference failed for: r12v75 */
    /* JADX WARN: Type inference failed for: r12v76 */
    /* JADX WARN: Type inference failed for: r12v77 */
    /* JADX WARN: Type inference failed for: r12v78 */
    /* JADX WARN: Type inference failed for: r12v79 */
    /* JADX WARN: Type inference failed for: r12v80 */
    /* JADX WARN: Type inference failed for: r12v81 */
    /* JADX WARN: Type inference failed for: r12v82 */
    /* JADX WARN: Type inference failed for: r12v83 */
    /* JADX WARN: Type inference failed for: r12v84 */
    /* JADX WARN: Type inference failed for: r12v85 */
    /* JADX WARN: Type inference failed for: r12v86 */
    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] getSDKTransactionID(android.content.Context r30, int r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 1655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.t.AuthenticationRequestParameters.getSDKTransactionID(android.content.Context, int, int, int):java.lang.Object[]");
    }

    public static void init$0() {
        $$a = new byte[]{95, 99, -67, 61, 0, 17, -31, -13, 9, -8, 49, 2, -37, -3, 0, 17, -31, -13, 9, 11, 32, -15, 15, 7, -16, 4, 19, -9, 8, 1, -35, -3, 3, -3, 3, -50};
        $$b = 181;
    }

    public static void init$1() {
        $$c = new byte[]{68, 54, 110, -60};
        $$d = 114;
    }

    @Override // atd.t.getSDKReferenceNumber
    @Nullable
    public final String AuthenticationRequestParameters(@NotNull String str) {
        getSDKEphemeralPublicKey = (BuildConfig + 115) % 128;
        str.getClass();
        String string = Settings.System.getString(this.getSDKTransactionID.getContentResolver(), str);
        int i11 = getSDKEphemeralPublicKey + 77;
        BuildConfig = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 48 / 0;
        }
        return string;
    }
}
