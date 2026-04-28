package atd.p;

import android.app.Application;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import atd.bb.onCompletion;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/AutoTimeZone;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAutoTimeZone.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoTimeZone.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/AutoTimeZone\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class getSDKEphemeralPublicKey extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static long getSDKAppID;
    private static char getSDKReferenceNumber;
    private static int getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getDeviceData;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(byte r6, byte r7, short r8) {
        /*
            int r7 = r7 * 4
            int r0 = 1 - r7
            int r6 = r6 * 3
            int r6 = 3 - r6
            int r8 = r8 + 68
            byte[] r1 = atd.p.getSDKEphemeralPublicKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L17
            r3 = r1
            r4 = r2
            r1 = r7
            goto L2e
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r1
            r1 = r8
            r8 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r8 = -r8
            int r8 = r8 + r1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.p.getSDKEphemeralPublicKey.$$d(byte, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResultCancelled = 0;
        ChallengeResult = 1;
        AuthenticationRequestParameters = 0;
        BuildConfig = 1;
        getSDKTransactionID();
        ViewConfiguration.getEdgeSlop();
        View.MeasureSpec.makeMeasureSpec(0, 0);
        new getSDKReferenceNumber((byte) 0);
        ChallengeResult = (ChallengeResultCancelled + 39) % 128;
    }

    private getSDKEphemeralPublicKey(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getDeviceData = getsdkreferencenumber;
    }

    private static void b(int i11, String str, String str2, char c3, String str3, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        int i13;
        int i14;
        char c7;
        int i15 = $10;
        int i16 = i15 + 75;
        $11 = i16 % 128;
        int i17 = 2;
        Object obj = null;
        if (i16 % 2 == 0) {
            throw null;
        }
        if (str3 != null) {
            $11 = (i15 + 41) % 128;
            charArray = str3.toCharArray();
        } else {
            charArray = str3;
        }
        char[] cArr = charArray;
        char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        onCompletion oncompletion = new onCompletion();
        int length = charArray3.length;
        char[] cArr2 = new char[length];
        int length2 = cArr.length;
        char[] cArr3 = new char[length2];
        int i18 = 0;
        System.arraycopy(charArray3, 0, cArr2, 0, length);
        System.arraycopy(cArr, 0, cArr3, 0, length2);
        cArr2[0] = (char) (cArr2[0] ^ c3);
        cArr3[2] = (char) (cArr3[2] + ((char) i11));
        int length3 = charArray2.length;
        char[] cArr4 = new char[length3];
        oncompletion.getDeviceData = 0;
        $10 = ($11 + 55) % 128;
        while (oncompletion.getDeviceData < length3) {
            $10 = ($11 + 23) % 128;
            try {
                Object[] objArr2 = {oncompletion};
                Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(874886523);
                if (sDKTransactionID == null) {
                    byte b8 = (byte) i18;
                    byte b11 = b8;
                    i12 = i17;
                    sDKTransactionID = atd.e.ChallengeResult.getDeviceData(2069 - View.MeasureSpec.getSize(i18), (char) (44657 - Color.argb(i18, i18, i18, i18)), 32 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -397560981, false, $$d(b8, b11, (byte) (b11 | 49)), new Class[]{Object.class});
                } else {
                    i12 = i17;
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID).invoke(obj, objArr2)).intValue();
                Object[] objArr3 = {oncompletion};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(1806403515);
                if (sDKTransactionID2 == null) {
                    byte b12 = (byte) i18;
                    byte b13 = b12;
                    i13 = i18;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(3095 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (14366 - TextUtils.indexOf((CharSequence) "", '0', i18, i18)), 18 - Color.red(i18), -1211924053, false, $$d(b12, b13, (byte) (b13 | 50)), new Class[]{Object.class});
                } else {
                    i13 = i18;
                }
                int iIntValue2 = ((Integer) ((Method) sDKTransactionID2).invoke(obj, objArr3)).intValue();
                int i19 = cArr2[oncompletion.getDeviceData % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i12] = Integer.valueOf(cArr3[iIntValue]);
                objArr4[1] = Integer.valueOf(i19);
                objArr4[i13] = oncompletion;
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1695612280);
                Class cls = Integer.TYPE;
                if (sDKTransactionID3 == null) {
                    int i21 = i13;
                    int iCombineMeasuredStates = 1428 - View.combineMeasuredStates(i21, i21);
                    c7 = 1;
                    char cResolveSizeAndState = (char) View.resolveSizeAndState(i21, i21, i21);
                    int offsetBefore = TextUtils.getOffsetBefore("", i21) + 30;
                    byte b14 = (byte) i21;
                    byte b15 = b14;
                    i14 = length3;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(iCombineMeasuredStates, cResolveSizeAndState, offsetBefore, -1183253656, false, $$d(b14, b15, (byte) (b15 | 51)), new Class[]{Object.class, cls, cls});
                } else {
                    i14 = length3;
                    c7 = 1;
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                int i22 = cArr2[iIntValue2] * 32718;
                Object[] objArr5 = new Object[i12];
                objArr5[c7] = Integer.valueOf(cArr3[iIntValue]);
                objArr5[0] = Integer.valueOf(i22);
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(814479823);
                if (sDKTransactionID4 == null) {
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(View.MeasureSpec.getSize(0) + 2774, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 13059), 25 - TextUtils.getTrimmedLength(""), -320602145, false, $$d(b16, b17, b17), new Class[]{cls, cls});
                }
                cArr3[iIntValue2] = ((Character) ((Method) sDKTransactionID4).invoke(null, objArr5)).charValue();
                cArr2[iIntValue2] = oncompletion.AuthenticationRequestParameters;
                int i23 = oncompletion.getDeviceData;
                cArr4[i23] = (char) (((((long) (r0 ^ charArray2[i23])) ^ (getSDKAppID ^ 1905653906042338631L)) ^ ((long) ((int) (((long) getSDKTransactionID) ^ 1905653906042338631L)))) ^ ((long) ((char) (((long) getSDKReferenceNumber) ^ 1905653906042338631L))));
                oncompletion.getDeviceData = i23 + 1;
                length3 = i14;
                i17 = 2;
                obj = null;
                i18 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        String str4 = new String(cArr4);
        int i24 = $10 + 13;
        $11 = i24 % 128;
        if (i24 % 2 != 0) {
            objArr[0] = str4;
        } else {
            int i25 = 17 / 0;
            objArr[0] = str4;
        }
    }

    public static void getSDKTransactionID() {
        getSDKAppID = 1905653906042338631L;
        getSDKTransactionID = -2038612665;
        getSDKReferenceNumber = (char) 14870;
    }

    public static void init$0() {
        $$a = new byte[]{78, 97, 15, -120};
        $$b = 232;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0069 A[PHI: r0
      0x0069: PHI (r0v10 java.lang.String) = (r0v9 java.lang.String), (r0v20 java.lang.String) binds: [B:8:0x0067, B:5:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() throws java.lang.Throwable {
        /*
            r14 = this;
            int r0 = atd.p.getSDKEphemeralPublicKey.BuildConfig
            int r0 = r0 + 7
            int r1 = r0 % 128
            atd.p.getSDKEphemeralPublicKey.AuthenticationRequestParameters = r1
            int r0 = r0 % 2
            atd.t.getSDKReferenceNumber r1 = r14.getDeviceData
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L3d
            long r4 = android.os.SystemClock.elapsedRealtimeNanos()
            r6 = 1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            int r8 = r0 * (-1)
            long r4 = android.os.SystemClock.elapsedRealtime()
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            int r0 = r0 + 27291
            char r11 = (char) r0
            java.lang.Object[] r13 = new java.lang.Object[r3]
            java.lang.String r9 = "艏몆\ueca7㱠"
            java.lang.String r10 = "ꩿਲ਼⦈崉椿휬Ꮽ侂琐ꣁ债쇧ꊘ\ue494"
            java.lang.String r12 = "\u0000\u0000\u0000\u0000"
            b(r8, r9, r10, r11, r12, r13)
            r0 = r13[r2]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L7c
            goto L69
        L3d:
            long r4 = android.os.SystemClock.elapsedRealtimeNanos()
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            int r8 = r0 + (-1)
            long r4 = android.os.SystemClock.elapsedRealtime()
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            int r0 = 24813 - r0
            char r11 = (char) r0
            java.lang.Object[] r13 = new java.lang.Object[r3]
            java.lang.String r9 = "艏몆\ueca7㱠"
            java.lang.String r10 = "ꩿਲ਼⦈崉椿휬Ꮽ侂琐ꣁ债쇧ꊘ\ue494"
            java.lang.String r12 = "\u0000\u0000\u0000\u0000"
            b(r8, r9, r10, r11, r12, r13)
            r0 = r13[r2]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L7c
        L69:
            java.lang.Boolean r0 = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKTransactionID(r0)
            if (r0 == 0) goto L7c
            int r1 = atd.p.getSDKEphemeralPublicKey.BuildConfig
            int r1 = r1 + 79
            int r1 = r1 % 128
            atd.p.getSDKEphemeralPublicKey.AuthenticationRequestParameters = r1
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$BooleanValue r0 = w.a0.h(r0)
            return r0
        L7c:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.p.getSDKEphemeralPublicKey.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/AutoTimeZone$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        public static int getSDKReferenceNumber;
        public static int getSDKTransactionID;

        private getSDKReferenceNumber() {
        }

        public static int AuthenticationRequestParameters() {
            int i11 = getSDKReferenceNumber;
            int i12 = i11 % 5354625;
            getSDKReferenceNumber = i11 + 1;
            if (i12 != 0) {
                return getSDKTransactionID;
            }
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            getSDKTransactionID = iFreeMemory;
            return iFreeMemory;
        }

        public /* synthetic */ getSDKReferenceNumber(byte b8) {
            this();
        }
    }

    public /* synthetic */ getSDKEphemeralPublicKey(Application application) {
        this(application, new atd.t.getSDKAppID(application));
    }
}
