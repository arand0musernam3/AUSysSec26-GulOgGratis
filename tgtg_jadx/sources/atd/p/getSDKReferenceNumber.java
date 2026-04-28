package atd.p;

import android.app.Application;
import android.graphics.Color;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.app.tgtg.model.local.AppConstants;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/AdbEnabled;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAdbEnabled.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdbEnabled.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/AdbEnabled\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class getSDKReferenceNumber extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static char getDeviceData;
    private static char getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static char getSDKReferenceNumber;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(short r5, int r6, short r7) {
        /*
            int r6 = r6 * 3
            int r6 = 4 - r6
            int r7 = r7 * 3
            int r7 = 69 - r7
            int r5 = r5 * 3
            int r0 = r5 + 1
            byte[] r1 = atd.p.getSDKReferenceNumber.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            r4 = r1[r6]
            int r3 = r3 + 1
        L26:
            int r7 = r7 + r4
            int r6 = r6 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.p.getSDKReferenceNumber.$$d(short, int, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResultCancelled = 0;
        ChallengeResult = 1;
        BuildConfig = 0;
        getSDKEphemeralPublicKey = 1;
        getSDKAppID();
        MotionEvent.axisFromString("");
        new getSDKTransactionID((byte) 0);
        int i11 = ChallengeResult + 65;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private getSDKReferenceNumber(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKTransactionID = getsdkreferencenumber;
    }

    private static void b(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (str != null) {
            $10 = ($11 + 95) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        atd.bb.ChallengeResultCompleted challengeResultCompleted = new atd.bb.ChallengeResultCompleted();
        char[] cArr2 = new char[cArr.length];
        int i17 = 0;
        challengeResultCompleted.getDeviceData = 0;
        int i18 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i19 = challengeResultCompleted.getDeviceData;
            if (i19 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i11);
                return;
            }
            int i21 = $10 + 57;
            $11 = i21 % 128;
            int i22 = 58224;
            char c3 = 1;
            if (i21 % i18 == 0) {
                cArr3[1] = cArr[i19];
                cArr3[i17] = cArr[i19];
                i12 = 1;
            } else {
                cArr3[i17] = cArr[i19];
                cArr3[1] = cArr[i19 + 1];
                i12 = i17;
            }
            while (i12 < 16) {
                $11 = ($10 + 89) % 128;
                char c7 = cArr3[c3];
                char c8 = cArr3[i17];
                char c11 = c3;
                int i23 = (c8 + i22) ^ ((c8 << 4) + ((char) (((long) AuthenticationRequestParameters) ^ 5320350835299930193L)));
                int i24 = c8 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getSDKReferenceNumber);
                    objArr2[i18] = Integer.valueOf(i24);
                    objArr2[c11] = Integer.valueOf(i23);
                    objArr2[i17] = Integer.valueOf(c7);
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(906025703);
                    Class cls = Integer.TYPE;
                    if (sDKTransactionID == null) {
                        int i25 = 2829 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        char cGreen = (char) Color.green(i17);
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 27;
                        i16 = 906025703;
                        byte b8 = $$a[i18];
                        i14 = i17;
                        byte b11 = b8;
                        i15 = i18;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(i25, cGreen, scrollBarSize, -362226441, false, $$d(b8, b11, (byte) (b11 + 1)), new Class[]{cls, cls, cls, cls});
                    } else {
                        i14 = i17;
                        i15 = i18;
                        i16 = 906025703;
                    }
                    char cCharValue = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    cArr3[c11] = cCharValue;
                    char c12 = cArr3[i14];
                    int i26 = (cCharValue + i22) ^ ((cCharValue << 4) + ((char) (((long) getDeviceData) ^ 5320350835299930193L)));
                    int i27 = cCharValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(getSDKAppID);
                    objArr3[i15] = Integer.valueOf(i27);
                    objArr3[c11] = Integer.valueOf(i26);
                    objArr3[i14] = Integer.valueOf(c12);
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i16);
                    if (sDKTransactionID2 == null) {
                        int iGreen = Color.green(i14) + 2828;
                        char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int minimumFlingVelocity = 27 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        byte b12 = $$a[i15];
                        byte b13 = b12;
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(iGreen, maximumDrawingCacheSize, minimumFlingVelocity, -362226441, false, $$d(b12, b13, (byte) (b13 + 1)), new Class[]{cls, cls, cls, cls});
                    }
                    cArr3[i14] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                    i22 -= 40503;
                    i12++;
                    $10 = ($11 + 13) % 128;
                    c3 = c11;
                    i17 = i14;
                    i18 = i15;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i28 = i17;
            int i29 = i18;
            char c13 = c3;
            int i31 = challengeResultCompleted.getDeviceData;
            cArr2[i31] = cArr3[i28];
            cArr2[i31 + 1] = cArr3[c13];
            Object[] objArr4 = new Object[i29];
            objArr4[c13] = challengeResultCompleted;
            objArr4[i28] = challengeResultCompleted;
            Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-1859796622);
            if (sDKTransactionID3 == null) {
                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 3156;
                char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 25797);
                int i32 = 27 - (TypedValue.complexToFraction(i28, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i28, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                i13 = 2;
                byte b14 = $$a[2];
                byte b15 = b14;
                sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(packedPositionType, longPressTimeout, i32, 1296942946, false, $$d(b14, b15, b15), new Class[]{Object.class, Object.class});
            } else {
                i13 = 2;
            }
            ((Method) sDKTransactionID3).invoke(null, objArr4);
            i18 = i13;
            i17 = 0;
        }
    }

    public static void getSDKAppID() {
        getDeviceData = (char) 14764;
        getSDKAppID = (char) 52313;
        AuthenticationRequestParameters = (char) 10966;
        getSDKReferenceNumber = (char) 43895;
    }

    public static void init$0() {
        $$a = new byte[]{26, 112, 0, -80};
        $$b = AppConstants.PERMISSIONS_REQUEST_USE_LOCATION;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004a A[PHI: r0
      0x004a: PHI (r0v10 java.lang.String) = (r0v9 java.lang.String), (r0v21 java.lang.String) binds: [B:8:0x0048, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = atd.p.getSDKReferenceNumber.BuildConfig
            int r0 = r0 + 27
            int r1 = r0 % 128
            atd.p.getSDKReferenceNumber.getSDKEphemeralPublicKey = r1
            int r0 = r0 % 2
            atd.t.getSDKReferenceNumber r1 = r6.getSDKTransactionID
            r2 = 1
            java.lang.String r3 = "⟞熢\ue9d4䮱쵺硫簰豳ᛍﵢ揎㹳"
            r4 = 0
            if (r0 != 0) goto L2f
            int r0 = android.view.ViewConfiguration.getLongPressTimeout()
            int r0 = r0 << 83
            r5 = 12
            int r5 = r5 / r0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            b(r3, r5, r0)
            r0 = r0[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L66
            goto L4a
        L2f:
            int r0 = android.view.ViewConfiguration.getLongPressTimeout()
            int r0 = r0 >> 16
            int r0 = 11 - r0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            b(r3, r0, r2)
            r0 = r2[r4]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L66
        L4a:
            int r1 = atd.p.getSDKReferenceNumber.BuildConfig
            int r1 = r1 + 87
            int r2 = r1 % 128
            atd.p.getSDKReferenceNumber.getSDKEphemeralPublicKey = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L61
            java.lang.Boolean r0 = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKTransactionID(r0)
            if (r0 == 0) goto L66
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$BooleanValue r0 = w.a0.h(r0)
            return r0
        L61:
            com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKTransactionID(r0)
            r0 = 0
            throw r0
        L66:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            int r1 = atd.p.getSDKReferenceNumber.BuildConfig
            int r1 = r1 + 125
            int r2 = r1 % 128
            atd.p.getSDKReferenceNumber.getSDKEphemeralPublicKey = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L7c
            r1 = 45
            int r1 = r1 / r4
        L7c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.p.getSDKReferenceNumber.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/AdbEnabled$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private getSDKTransactionID() {
        }

        public /* synthetic */ getSDKTransactionID(byte b8) {
            this();
        }
    }

    public /* synthetic */ getSDKReferenceNumber(Application application) {
        this(application, new atd.t.getSDKAppID(application));
    }
}
