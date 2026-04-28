package atd.x;

import android.app.Application;
import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.app.tgtg.model.local.AppConstants;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/TtsEnabledPlugins;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTtsEnabledPlugins.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TtsEnabledPlugins.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/TtsEnabledPlugins\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"})
public final class runtimeError extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static char getDeviceData;
    private static int getMessageVersion;
    private static int getSDKEphemeralPublicKey;
    private static char getSDKReferenceNumber;
    private static char getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKAppID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(byte r6, short r7, byte r8) {
        /*
            byte[] r0 = atd.x.runtimeError.$$a
            int r8 = r8 * 3
            int r8 = 69 - r8
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r6 = r6 * 3
            int r6 = r6 + 1
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r7 = r7 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r4 = -r4
            int r7 = r7 + r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.runtimeError.$$d(byte, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        ChallengeResult = 1;
        ChallengeResultCancelled = 0;
        getMessageVersion = 1;
        getSDKTransactionID();
        TextUtils.lastIndexOf("", '0');
        new getDeviceData((byte) 0);
        int i11 = getSDKEphemeralPublicKey + AppConstants.RESULT_CODE_ORDER_CANCELLED;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private runtimeError(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKAppID = getsdkreferencenumber;
    }

    private static void b(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        int i13;
        int i14;
        char c3;
        if (str != null) {
            $10 = ($11 + 117) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        atd.bb.ChallengeResultCompleted challengeResultCompleted = new atd.bb.ChallengeResultCompleted();
        char[] cArr2 = new char[cArr.length];
        int i15 = 0;
        challengeResultCompleted.getDeviceData = 0;
        int i16 = 2;
        char[] cArr3 = new char[2];
        $11 = ($10 + 47) % 128;
        while (true) {
            int i17 = challengeResultCompleted.getDeviceData;
            if (i17 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i11);
                return;
            }
            $10 = ($11 + 71) % 128;
            cArr3[i15] = cArr[i17];
            char c7 = 1;
            cArr3[1] = cArr[i17 + 1];
            int i18 = 58224;
            int i19 = i15;
            while (i19 < 16) {
                $11 = ($10 + 37) % 128;
                char c8 = cArr3[c7];
                char c11 = cArr3[i15];
                char c12 = c7;
                int i21 = (c11 + i18) ^ ((c11 << 4) + ((char) (((long) getSDKReferenceNumber) ^ 5320350835299930193L)));
                int i22 = c11 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(AuthenticationRequestParameters);
                    objArr2[i16] = Integer.valueOf(i22);
                    objArr2[c12] = Integer.valueOf(i21);
                    objArr2[i15] = Integer.valueOf(c8);
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(906025703);
                    Class cls = Integer.TYPE;
                    if (sDKTransactionID == null) {
                        i14 = 906025703;
                        c3 = 3;
                        byte b8 = (byte) i15;
                        i13 = i16;
                        byte b11 = b8;
                        i12 = i15;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(((byte) KeyEvent.getModifierMetaStateMask()) + 2829, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 27, -362226441, false, $$d(b8, b11, (byte) (b11 + 1)), new Class[]{cls, cls, cls, cls});
                    } else {
                        i12 = i15;
                        i13 = i16;
                        i14 = 906025703;
                        c3 = 3;
                    }
                    char cCharValue = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    cArr3[c12] = cCharValue;
                    char c13 = cArr3[i12];
                    int i23 = (cCharValue + i18) ^ ((cCharValue << 4) + ((char) (((long) getSDKTransactionID) ^ 5320350835299930193L)));
                    int i24 = cCharValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[c3] = Integer.valueOf(getDeviceData);
                    objArr3[i13] = Integer.valueOf(i24);
                    objArr3[c12] = Integer.valueOf(i23);
                    objArr3[i12] = Integer.valueOf(c13);
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i14);
                    if (sDKTransactionID2 == null) {
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 2828;
                        int i25 = i12;
                        char cArgb = (char) Color.argb(i25, i25, i25, i25);
                        int defaultSize = View.getDefaultSize(i25, i25) + 27;
                        byte b12 = (byte) i25;
                        byte b13 = b12;
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(fadingEdgeLength, cArgb, defaultSize, -362226441, false, $$d(b12, b13, (byte) (b13 + 1)), new Class[]{cls, cls, cls, cls});
                    }
                    cArr3[0] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                    i18 -= 40503;
                    i19++;
                    c7 = c12;
                    i16 = i13;
                    i15 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i26 = i16;
            char c14 = c7;
            int i27 = challengeResultCompleted.getDeviceData;
            cArr2[i27] = cArr3[0];
            cArr2[i27 + 1] = cArr3[c14];
            Object[] objArr4 = new Object[i26];
            objArr4[c14] = challengeResultCompleted;
            objArr4[0] = challengeResultCompleted;
            Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-1859796622);
            if (sDKTransactionID3 == null) {
                byte b14 = (byte) 0;
                byte b15 = b14;
                sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getPressedStateDuration() >> 16) + 3156, (char) (25798 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getScrollBarSize() >> 8) + 27, 1296942946, false, $$d(b14, b15, b15), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID3).invoke(null, objArr4);
            i16 = i26;
            i15 = 0;
        }
    }

    public static void getSDKTransactionID() {
        getSDKTransactionID = (char) 18054;
        getDeviceData = (char) 28158;
        getSDKReferenceNumber = (char) 33724;
        AuthenticationRequestParameters = (char) 48127;
    }

    public static void init$0() {
        $$a = new byte[]{77, -47, 38, 84};
        $$b = 153;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
    
        return new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure(com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002c, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0048, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004a, code lost:
    
        r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m164boximpl(com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m165constructorimpl(r0));
        atd.x.runtimeError.getMessageVersion = (atd.x.runtimeError.ChallengeResultCancelled + 55) % 128;
     */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getSDKReferenceNumber() throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = atd.x.runtimeError.getMessageVersion
            int r0 = r0 + 85
            int r1 = r0 % 128
            atd.x.runtimeError.ChallengeResultCancelled = r1
            int r0 = r0 % 2
            atd.t.getSDKReferenceNumber r1 = r6.getSDKAppID
            r2 = 0
            r3 = 1
            java.lang.String r4 = "殓釩\udf04庫솬슳䈄꺚悛\udc8d\udd27\uf317\udf28攕\ufdd6❖쿾տ൦ꌾ"
            if (r0 == 0) goto L2f
            int r0 = android.view.ViewConfiguration.getEdgeSlop()
            int r0 = r0 >>> 80
            r5 = 78
            int r5 = r5 / r0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            b(r4, r5, r0)
            r0 = r0[r2]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L5b
            goto L4a
        L2f:
            int r0 = android.view.ViewConfiguration.getEdgeSlop()
            int r0 = r0 >> 16
            int r0 = r0 + 19
            java.lang.Object[] r3 = new java.lang.Object[r3]
            b(r4, r0, r3)
            r0 = r3[r2]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String r0 = r1.AuthenticationRequestParameters(r0)
            if (r0 == 0) goto L5b
        L4a:
            java.lang.String r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m165constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$StringValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m164boximpl(r0)
            int r1 = atd.x.runtimeError.ChallengeResultCancelled
            int r1 = r1 + 55
            int r1 = r1 % 128
            atd.x.runtimeError.getMessageVersion = r1
            return r0
        L5b:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.runtimeError.getSDKReferenceNumber():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/TtsEnabledPlugins$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b8) {
            this();
        }
    }

    public /* synthetic */ runtimeError(Application application) {
        this(application, new atd.t.getSDKTransactionID(application));
    }
}
