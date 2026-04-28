package atd.z;

import android.app.Application;
import android.graphics.Color;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.LocalizedMessage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WepSupported;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiDeviceParameter;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWepSupported.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WepSupported.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WepSupported\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class getErrorDescription extends getErrorCode {
    private static char AuthenticationRequestParameters = 0;
    private static int BuildConfig = 0;
    private static int ChallengeResult = 1;
    private static int getDeviceData = 0;
    private static long getSDKAppID = 0;
    private static int getSDKReferenceNumber = 0;
    private static int getSDKTransactionID = 1;

    static {
        getSDKAppID();
        View.resolveSizeAndState(0, 0, 0);
        AndroidCharacter.getMirror('0');
        new getSDKAppID((byte) 0);
        int i11 = ChallengeResult + 35;
        BuildConfig = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getErrorDescription(@NotNull Application application) {
        super(application);
        application.getClass();
    }

    public static void getSDKAppID() {
        getSDKAppID = 1905653906042338631L;
        getDeviceData = -463349676;
        AuthenticationRequestParameters = (char) 15687;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() {
        int i11 = getSDKTransactionID + 97;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0 && Build.VERSION.SDK_INT < 35) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        }
        WifiManager wifiManagerChallengeResult = ChallengeResult();
        if (wifiManagerChallengeResult == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        int i12 = getSDKTransactionID + 73;
        getSDKReferenceNumber = i12 % 128;
        if (i12 % 2 == 0) {
            return DeviceParameterResult.Success.BooleanValue.m129boximpl(DeviceParameterResult.Success.BooleanValue.m130constructorimpl(wifiManagerChallengeResult.isWepSupported()));
        }
        DeviceParameterResult.Success.BooleanValue.m129boximpl(DeviceParameterResult.Success.BooleanValue.m130constructorimpl(wifiManagerChallengeResult.isWepSupported()));
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WepSupported$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static char[] getSDKReferenceNumber;
        private static int getSDKTransactionID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(short r5, short r6, byte r7) {
            /*
                int r6 = 110 - r6
                int r5 = r5 * 4
                int r0 = 1 - r5
                byte[] r1 = atd.z.getErrorDescription.getSDKAppID.$$a
                int r7 = r7 * 2
                int r7 = 4 - r7
                byte[] r0 = new byte[r0]
                r2 = 0
                int r5 = 0 - r5
                if (r1 != 0) goto L16
                r4 = r5
                r3 = r2
                goto L26
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r5) goto L22
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                return r5
            L22:
                int r3 = r3 + 1
                r4 = r1[r7]
            L26:
                int r4 = -r4
                int r7 = r7 + 1
                int r6 = r6 + r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.z.getErrorDescription.getSDKAppID.$$c(short, short, byte):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getSDKTransactionID = 711855351;
            getSDKReferenceNumber = new char[]{63468, 63303, 63282, 63291, 63268, 63283, 63317, 63343, 63339, 63312, 63314, 63300, 63292, 63285, 63294, 63282, 63341, 63312, 63320, 63303, 63273, 63289, 63317, 63343, 63339, 63312, 63314, 63300, 63292, 63286, 63283, 63406, 63439, 63430, 63451, 63408, 63410, 63433, 63408, 63448, 63462, 63460, 63487, 63459, 63465, 63431, 63416, 63431, 63434, 63408, 63448, 63462, 63460, 63487, 63459, 63465, 63437, 63421, 63451, 63468, 63460, 63457, 63421, 63430, 63431, 63462, 63457, 63486, 63459, 63462, 63486, 63454, 63415, 63446, 63457, 63486, 63459, 63457, 63481, 63461, 63464, 63462, 63460, 63487, 63459, 63420, 63465, 63459, 63469, 63447, 63469, 63464, 63465, 63467, 63465, 63446, 63448, 63464, 63462, 63416, 63461, 63461, 63444, 63448, 63465, 63467, 63465, 63464, 63469, 63447, 63408, 63426, 63457, 63424, 63454, 63486, 63462, 63459, 63486, 63457, 63462, 63431, 63430, 63465, 63459, 63487, 63460, 63462, 63464, 63472, 63333, 63319, 63318, 63316, 63414, 63459, 63467, 63459, 63484, 63458, 63457, 63481, 63452, 63431, 63467, 63460, 63484, 63454, 63415, 63451, 63460, 63484, 63457, 63464, 63464, 63465, 63469, 63461, 63459, 63450, 63452, 63469, 63460, 63486, 63487, 63482, 63486, 63466, 63460, 63460, 63432, 63331, 63332, 63337, 63310, 63331, 63314, 63312, 63314, 63316, 63337, 63318, 63461, 63325, 63286, 63281, 63320, 63298, 63291, 63285, 63324, 63301, 63297, 63421, 63459, 63461, 63469, 63465, 63464, 63464, 63457, 63484, 63460, 63451, 63409, 63419, 63421, 63433, 63436, 63454, 63484, 63460, 63467, 63431, 63452, 63481, 63457, 63458, 63484, 63459, 63467, 63459, 63455, 63432, 63460, 63460, 63466};
        }

        private getSDKAppID() {
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0169  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x016a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(boolean r24, int r25, java.lang.String r26, int r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 373
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.z.getErrorDescription.getSDKAppID.a(boolean, int, java.lang.String, int, int, java.lang.Object[]):void");
        }

        private static void b(String str, boolean z11, int[] iArr, Object[] objArr) throws Throwable {
            int i11;
            byte[] bArr;
            int i12;
            String str2 = str;
            $10 = ($11 + 95) % 128;
            Object bytes = str2;
            if (str2 != null) {
                bytes = str2.getBytes(LocalizedMessage.DEFAULT_ENCODING);
            }
            byte[] bArr2 = (byte[]) bytes;
            atd.bb.ChallengeResultError challengeResultError = new atd.bb.ChallengeResultError();
            int i13 = 0;
            int i14 = iArr[0];
            int i15 = iArr[1];
            int i16 = iArr[2];
            int i17 = iArr[3];
            char[] cArr = getSDKReferenceNumber;
            Class cls = Integer.TYPE;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i18 = 0;
                while (i18 < length) {
                    $10 = ($11 + 55) % 128;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i18])};
                        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(754517312);
                        if (sDKTransactionID == null) {
                            int i19 = 2944 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                            bArr = bArr2;
                            char cIndexOf = (char) TextUtils.indexOf("", "", i13, i13);
                            int iMakeMeasureSpec = 37 - View.MeasureSpec.makeMeasureSpec(i13, i13);
                            byte b8 = (byte) i13;
                            byte b11 = (byte) (b8 + 3);
                            i12 = i18;
                            sDKTransactionID = atd.e.ChallengeResult.getDeviceData(i19, cIndexOf, iMakeMeasureSpec, -258931888, false, $$c(b8, b11, (byte) (b11 - 3)), new Class[]{cls});
                        } else {
                            bArr = bArr2;
                            i12 = i18;
                        }
                        cArr2[i12] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                        i18 = i12 + 1;
                        bArr2 = bArr;
                        i13 = 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            byte[] bArr3 = bArr2;
            char[] cArr3 = new char[i15];
            System.arraycopy(cArr, i14, cArr3, 0, i15);
            if (bArr3 != null) {
                char[] cArr4 = new char[i15];
                challengeResultError.AuthenticationRequestParameters = 0;
                char c3 = 0;
                while (true) {
                    int i21 = challengeResultError.AuthenticationRequestParameters;
                    if (i21 >= i15) {
                        break;
                    }
                    if (bArr3[i21] == 1) {
                        Object[] objArr3 = {Integer.valueOf(cArr3[i21]), Integer.valueOf(c3)};
                        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(788825057);
                        if (sDKTransactionID2 == null) {
                            byte b12 = (byte) 0;
                            byte b13 = (byte) (b12 + 2);
                            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getLongPressTimeout() >> 16) + 3095, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 14367), 18 - TextUtils.indexOf("", "", 0), -210991631, false, $$c(b12, b13, (byte) (b13 - 2)), new Class[]{cls, cls});
                        }
                        cArr4[i21] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                    } else {
                        Object[] objArr4 = {Integer.valueOf(cArr3[i21]), Integer.valueOf(c3)};
                        Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-565071239);
                        if (sDKTransactionID3 == null) {
                            byte b14 = (byte) 0;
                            byte b15 = b14;
                            sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(2774 - View.MeasureSpec.getMode(0), (char) (Color.green(0) + 13060), View.combineMeasuredStates(0, 0) + 25, 37336169, false, $$c(b14, b15, b15), new Class[]{cls, cls});
                        }
                        cArr4[i21] = ((Character) ((Method) sDKTransactionID3).invoke(null, objArr4)).charValue();
                    }
                    c3 = cArr4[challengeResultError.AuthenticationRequestParameters];
                    Object[] objArr5 = {challengeResultError, challengeResultError};
                    Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(2107237619);
                    if (sDKTransactionID4 == null) {
                        sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(2279 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (65522 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 34, -1577983261, false, "m", new Class[]{Object.class, Object.class});
                    }
                    ((Method) sDKTransactionID4).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i17 > 0) {
                char[] cArr5 = new char[i15];
                i11 = 0;
                System.arraycopy(cArr3, 0, cArr5, 0, i15);
                int i22 = i15 - i17;
                System.arraycopy(cArr5, 0, cArr3, i22, i17);
                System.arraycopy(cArr5, i17, cArr3, 0, i22);
                $10 = ($11 + 99) % 128;
            } else {
                i11 = 0;
            }
            if (z11) {
                char[] cArr6 = new char[i15];
                challengeResultError.AuthenticationRequestParameters = i11;
                while (true) {
                    int i23 = challengeResultError.AuthenticationRequestParameters;
                    if (i23 >= i15) {
                        break;
                    }
                    cArr6[i23] = cArr3[(i15 - i23) - 1];
                    challengeResultError.AuthenticationRequestParameters = i23 + 1;
                }
                cArr3 = cArr6;
            }
            if (i16 > 0) {
                int i24 = $11 + 93;
                $10 = i24 % 128;
                int i25 = i24 % 2;
                challengeResultError.AuthenticationRequestParameters = 0;
                while (true) {
                    int i26 = challengeResultError.AuthenticationRequestParameters;
                    if (i26 >= i15) {
                        break;
                    }
                    cArr3[i26] = (char) (cArr3[i26] - iArr[2]);
                    challengeResultError.AuthenticationRequestParameters = i26 + 1;
                }
            }
            objArr[0] = new String(cArr3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0 */
        /* JADX WARN: Type inference failed for: r10v14 */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v14 */
        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getSDKReferenceNumber(android.content.Context r36, int r37, int r38) {
            /*
                Method dump skipped, instruction units count: 1324
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.z.getErrorDescription.getSDKAppID.getSDKReferenceNumber(android.content.Context, int, int):java.lang.Object[]");
        }

        public static void init$0() {
            $$a = new byte[]{83, 102, 74, -77};
            $$b = 88;
        }

        public /* synthetic */ getSDKAppID(byte b8) {
            this();
        }
    }
}
