package atd.p;

import android.app.Application;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/AnimatorDurationScale;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnimatorDurationScale.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatorDurationScale.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/AnimatorDurationScale\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"})
public final class getDeviceData extends DeviceParameter {
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(int r6, short r7, int r8) {
        /*
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r6 = r6 * 3
            int r6 = r6 + 66
            int r8 = r8 * 4
            int r0 = 1 - r8
            byte[] r1 = atd.p.getDeviceData.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L1a
            r6 = r8
            r3 = r1
            r4 = r2
            r1 = r7
            goto L2f
        L1a:
            r3 = r2
        L1b:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L26:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r1
            r1 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2f:
            int r6 = r6 + r7
            int r7 = r1 + 1
            r1 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.p.getDeviceData.$$d(int, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        BuildConfig = 1;
        getMessageVersion = 0;
        ChallengeResult = 1;
        getSDKAppID();
        Process.getGidForName("");
        new AuthenticationRequestParameters((byte) 0);
        getSDKEphemeralPublicKey = (BuildConfig + 119) % 128;
    }

    private getDeviceData(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getDeviceData = getsdkreferencenumber;
    }

    private static void b(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        int i13;
        int i14;
        Object obj = null;
        int i15 = 2;
        if (str != null) {
            int i16 = $11 + 113;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        atd.bb.ChallengeResultCompleted challengeResultCompleted = new atd.bb.ChallengeResultCompleted();
        char[] cArr2 = new char[cArr.length];
        int i17 = 0;
        challengeResultCompleted.getDeviceData = 0;
        char[] cArr3 = new char[2];
        while (true) {
            int i18 = challengeResultCompleted.getDeviceData;
            if (i18 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i11);
                return;
            }
            $10 = ($11 + 35) % 128;
            cArr3[i17] = cArr[i18];
            int i19 = 1;
            cArr3[1] = cArr[i18 + 1];
            int i21 = 58224;
            int i22 = i17;
            while (i22 < 16) {
                char c3 = cArr3[i19];
                char c7 = cArr3[i17];
                int i23 = i19;
                int i24 = i22;
                int i25 = (c7 + i21) ^ ((c7 << 4) + ((char) (((long) getSDKAppID) ^ 5320350835299930193L)));
                int i26 = c7 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getSDKTransactionID);
                    objArr2[i15] = Integer.valueOf(i26);
                    objArr2[i23] = Integer.valueOf(i25);
                    objArr2[i17] = Integer.valueOf(c3);
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(906025703);
                    Class cls = Integer.TYPE;
                    if (sDKTransactionID == null) {
                        i14 = 906025703;
                        byte b8 = (byte) i17;
                        i12 = i15;
                        byte b11 = b8;
                        i13 = i17;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData((KeyEvent.getMaxKeyCode() >> 16) + 2828, (char) (ViewConfiguration.getTouchSlop() >> 8), View.getDefaultSize(i17, i17) + 27, -362226441, false, $$d(b8, b11, b11), new Class[]{cls, cls, cls, cls});
                    } else {
                        i12 = i15;
                        i13 = i17;
                        i14 = 906025703;
                    }
                    char cCharValue = ((Character) ((Method) sDKTransactionID).invoke(obj, objArr2)).charValue();
                    cArr3[i23] = cCharValue;
                    char c8 = cArr3[i13];
                    int i27 = (cCharValue + i21) ^ ((cCharValue << 4) + ((char) (((long) AuthenticationRequestParameters) ^ 5320350835299930193L)));
                    int i28 = cCharValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(getSDKReferenceNumber);
                    objArr3[i12] = Integer.valueOf(i28);
                    objArr3[i23] = Integer.valueOf(i27);
                    objArr3[i13] = Integer.valueOf(c8);
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i14);
                    if (sDKTransactionID2 == null) {
                        int i29 = i13;
                        byte b12 = (byte) i29;
                        byte b13 = b12;
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(2829 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) Gravity.getAbsoluteGravity(i29, i29), 28 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -362226441, false, $$d(b12, b13, b13), new Class[]{cls, cls, cls, cls});
                    }
                    cArr3[0] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                    i21 -= 40503;
                    i22 = i24 + 1;
                    i19 = i23;
                    i15 = i12;
                    obj = null;
                    i17 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i31 = i15;
            int i32 = i19;
            int i33 = challengeResultCompleted.getDeviceData;
            cArr2[i33] = cArr3[0];
            cArr2[i33 + 1] = cArr3[i32];
            Object[] objArr4 = new Object[i31];
            objArr4[i32] = challengeResultCompleted;
            objArr4[0] = challengeResultCompleted;
            Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-1859796622);
            if (sDKTransactionID3 == null) {
                byte b14 = (byte) i32;
                byte b15 = (byte) (b14 - 1);
                sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(TextUtils.indexOf("", "", 0, 0) + 3156, (char) (25797 - TextUtils.getCapsMode("", 0, 0)), ImageFormat.getBitsPerPixel(0) + 28, 1296942946, false, $$d(b14, b15, b15), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID3).invoke(null, objArr4);
            i15 = i31;
            obj = null;
            i17 = 0;
        }
    }

    public static void getSDKAppID() {
        AuthenticationRequestParameters = (char) 32184;
        getSDKReferenceNumber = (char) 1955;
        getSDKAppID = (char) 55746;
        getSDKTransactionID = (char) 1579;
    }

    public static void init$0() {
        $$a = new byte[]{95, -102, -54, 85};
        $$b = 96;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        Float fG;
        getMessageVersion = (ChallengeResult + 19) % 128;
        atd.t.getSDKReferenceNumber getsdkreferencenumber = this.getDeviceData;
        Object[] objArr = new Object[1];
        b("❲䳓\u2dc7ဦ탸깍⸢\u0c3a걺䛩ퟨ羹탸깍ꑏ쳯尿聉㨄ﮎ玹돸ࡄ➢", (ViewConfiguration.getWindowTouchSlop() >> 8) + 23, objArr);
        String strAuthenticationRequestParameters = getsdkreferencenumber.AuthenticationRequestParameters(((String) objArr[0]).intern());
        if (strAuthenticationRequestParameters == null || (fG = x.g(strAuthenticationRequestParameters)) == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        DeviceParameterResult.Success.FloatValue floatValueM143boximpl = DeviceParameterResult.Success.FloatValue.m143boximpl(DeviceParameterResult.Success.FloatValue.m144constructorimpl(fG.floatValue()));
        int i11 = ChallengeResult + 3;
        getMessageVersion = i11 % 128;
        if (i11 % 2 == 0) {
            return floatValueM143boximpl;
        }
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/AnimatorDurationScale$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private AuthenticationRequestParameters() {
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b8) {
            this();
        }
    }

    public /* synthetic */ getDeviceData(Application application) {
        this(application, new atd.t.getSDKAppID(application));
    }
}
