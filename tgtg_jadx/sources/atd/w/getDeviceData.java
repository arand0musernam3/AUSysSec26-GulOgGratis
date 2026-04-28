package atd.w;

import android.app.Application;
import android.graphics.Color;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.braze.Constants;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.LocalizedMessage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/IsHearingAidCompatibilitySupported;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIsHearingAidCompatibilitySupported.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IsHearingAidCompatibilitySupported.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/telephony/IsHearingAidCompatibilitySupported\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
public final class getDeviceData extends InitializeResultSuccess {
    private static int AuthenticationRequestParameters = 1;
    private static int ChallengeResult = 1;
    private static int getDeviceData;
    private static char getSDKAppID;
    private static int getSDKReferenceNumber;
    private static char[] getSDKTransactionID;

    static {
        getSDKAppID();
        Process.myTid();
        ViewConfiguration.getJumpTapTimeout();
        new getSDKTransactionID((byte) 0);
        getDeviceData = (ChallengeResult + 25) % 128;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getDeviceData(@NotNull Application application) {
        super(application);
        application.getClass();
    }

    public static void getSDKAppID() {
        getSDKTransactionID = new char[]{30964, 30965, 30966, 30855};
        getSDKAppID = (char) 19806;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() {
        TelephonyManager telephonyManagerChallengeResult = ChallengeResult();
        if (telephonyManagerChallengeResult == null) {
            DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
            int i11 = getSDKReferenceNumber + 73;
            AuthenticationRequestParameters = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 1 / 0;
            }
            return failure;
        }
        int i13 = getSDKReferenceNumber + 59;
        AuthenticationRequestParameters = i13 % 128;
        int i14 = i13 % 2;
        boolean zM130constructorimpl = DeviceParameterResult.Success.BooleanValue.m130constructorimpl(telephonyManagerChallengeResult.isHearingAidCompatibilitySupported());
        if (i14 != 0) {
            return DeviceParameterResult.Success.BooleanValue.m129boximpl(zM130constructorimpl);
        }
        DeviceParameterResult.Success.BooleanValue.m129boximpl(zM130constructorimpl);
        throw null;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/IsHearingAidCompatibilitySupported$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static char[] AuthenticationRequestParameters;
        private static boolean getDeviceData;
        private static boolean getSDKAppID;
        private static long getSDKReferenceNumber;
        private static int getSDKTransactionID;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r5, byte r6, byte r7) {
            /*
                int r5 = r5 * 4
                int r5 = r5 + 4
                int r7 = 120 - r7
                int r6 = r6 * 4
                int r0 = r6 + 1
                byte[] r1 = atd.w.getDeviceData.getSDKTransactionID.$$a
                byte[] r0 = new byte[r0]
                r2 = 0
                r3 = r7
                if (r1 != 0) goto L15
                r4 = r2
                r7 = r5
                goto L27
            L15:
                r7 = r5
                r5 = r3
                r3 = r2
            L18:
                byte r4 = (byte) r5
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L25
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                return r5
            L25:
                r3 = r1[r7]
            L27:
                int r3 = -r3
                int r5 = r5 + r3
                int r7 = r7 + 1
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.getDeviceData.getSDKTransactionID.$$c(int, byte, byte):java.lang.String");
        }

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            AuthenticationRequestParameters = new char[]{21759, 21750, 21739, 21737, 21667, 21732, 21754, 21748, 21738, 21735, 21758, 21733, 21742, 21753, 21674, 21665, 21705, 21697, 21731, 21729, 21757, 21716, 21699, 21714, 21718, 21749, 21728, 21681, 21717, 21751, 21752, 21693, 21696, 21706, 21700, 21730, 21756, 21698, 21726, 21755, 21719};
            getSDKTransactionID = 1286296721;
            getSDKAppID = true;
            getDeviceData = true;
            getSDKReferenceNumber = -7587293896404570157L;
        }

        private getSDKTransactionID() {
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] AuthenticationRequestParameters(android.content.Context r23, int r24, int r25) {
            /*
                Method dump skipped, instruction units count: 1087
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.getDeviceData.getSDKTransactionID.AuthenticationRequestParameters(android.content.Context, int, int):java.lang.Object[]");
        }

        private static void a(int i11, String str, int[] iArr, String str2, Object[] objArr) throws Throwable {
            char[] charArray;
            long j9;
            String str3 = str2;
            $10 = ($11 + 71) % 128;
            Object bytes = str3;
            if (str3 != null) {
                bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
            }
            byte[] bArr = (byte[]) bytes;
            if (str != null) {
                int i12 = $10 + 73;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    str.toCharArray();
                    throw null;
                }
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
            char[] cArr = charArray;
            atd.bb.ChallengeResultTimeout challengeResultTimeout = new atd.bb.ChallengeResultTimeout();
            char[] cArr2 = AuthenticationRequestParameters;
            Class cls = Integer.TYPE;
            int i13 = 0;
            if (cArr2 != null) {
                $11 = ($10 + 69) % 128;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i14 = 0;
                while (i14 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i14])};
                        Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(887083134);
                        if (sDKTransactionID == null) {
                            byte b8 = (byte) i13;
                            byte b11 = b8;
                            sDKTransactionID = atd.e.ChallengeResult.getDeviceData(TextUtils.getOffsetAfter("", i13) + 2555, (char) (Color.green(i13) + 48598), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 30, -390605202, false, $$c(b8, b11, (byte) (b11 | 9)), new Class[]{cls});
                        }
                        cArr3[i14] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                        i14++;
                        i13 = 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                j9 = 0;
                $11 = ($10 + 7) % 128;
                cArr2 = cArr3;
            } else {
                j9 = 0;
            }
            Object[] objArr3 = {Integer.valueOf(getSDKTransactionID)};
            Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-1144184369);
            if (sDKTransactionID2 == null) {
                sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(146 - MotionEvent.axisFromString(""), (char) TextUtils.getCapsMode("", 0, 0), Color.blue(0) + 32, 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
            }
            int iIntValue = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
            if (getDeviceData) {
                int length2 = bArr.length;
                challengeResultTimeout.AuthenticationRequestParameters = length2;
                char[] cArr4 = new char[length2];
                challengeResultTimeout.getSDKAppID = 0;
                while (true) {
                    int i15 = challengeResultTimeout.getSDKAppID;
                    int i16 = challengeResultTimeout.AuthenticationRequestParameters;
                    if (i15 >= i16) {
                        objArr[0] = new String(cArr4);
                        return;
                    }
                    cArr4[i15] = (char) (cArr2[bArr[(i16 - 1) - i15] + i11] - iIntValue);
                    Object[] objArr4 = {challengeResultTimeout, challengeResultTimeout};
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                    if (sDKTransactionID3 == null) {
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getKeyRepeatDelay() >> 16) + 1697, (char) (AndroidCharacter.getMirror('0') - '0'), 28 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -1620360563, false, $$c(b12, b13, (byte) (b13 + 5)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) sDKTransactionID3).invoke(null, objArr4);
                    $10 = ($11 + 93) % 128;
                }
            } else {
                int i17 = 0;
                if (getSDKAppID) {
                    int length3 = cArr.length;
                    challengeResultTimeout.AuthenticationRequestParameters = length3;
                    char[] cArr5 = new char[length3];
                    challengeResultTimeout.getSDKAppID = 0;
                    while (true) {
                        int i18 = challengeResultTimeout.getSDKAppID;
                        int i19 = challengeResultTimeout.AuthenticationRequestParameters;
                        if (i18 >= i19) {
                            objArr[0] = new String(cArr5);
                            return;
                        }
                        cArr5[i18] = (char) (cArr2[cArr[(i19 - 1) - i18] - i11] - iIntValue);
                        Object[] objArr5 = {challengeResultTimeout, challengeResultTimeout};
                        Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                        if (sDKTransactionID4 == null) {
                            byte b14 = (byte) 0;
                            byte b15 = b14;
                            sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData((Process.getElapsedCpuTime() > j9 ? 1 : (Process.getElapsedCpuTime() == j9 ? 0 : -1)) + 1696, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 29 - (Process.myTid() >> 22), -1620360563, false, $$c(b14, b15, (byte) (b15 + 5)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) sDKTransactionID4).invoke(null, objArr5);
                    }
                } else {
                    int length4 = iArr.length;
                    challengeResultTimeout.AuthenticationRequestParameters = length4;
                    char[] cArr6 = new char[length4];
                    while (true) {
                        challengeResultTimeout.getSDKAppID = i17;
                        int i21 = challengeResultTimeout.getSDKAppID;
                        int i22 = challengeResultTimeout.AuthenticationRequestParameters;
                        if (i21 >= i22) {
                            objArr[0] = new String(cArr6);
                            return;
                        } else {
                            cArr6[i21] = (char) (cArr2[iArr[(i22 - 1) - i21] - i11] - iIntValue);
                            i17 = i21 + 1;
                        }
                    }
                }
            }
        }

        private static void b(String str, int i11, Object[] objArr) throws Throwable {
            char[] charArray;
            int i12 = ($11 + 99) % 128;
            $10 = i12;
            if (str != null) {
                int i13 = i12 + 117;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    str.toCharArray();
                    throw null;
                }
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
            atd.bb.completed completedVar = new atd.bb.completed();
            char[] sDKTransactionID = atd.bb.completed.getSDKTransactionID(getSDKReferenceNumber ^ 2436480605514729170L, charArray, i11);
            completedVar.getSDKTransactionID = 4;
            $11 = ($10 + 75) % 128;
            while (true) {
                int i14 = completedVar.getSDKTransactionID;
                if (i14 >= sDKTransactionID.length) {
                    objArr[0] = new String(sDKTransactionID, 4, sDKTransactionID.length - 4);
                    return;
                }
                $10 = ($11 + 77) % 128;
                int i15 = i14 - 4;
                completedVar.getSDKAppID = i15;
                try {
                    Object[] objArr2 = {Long.valueOf(sDKTransactionID[i14] ^ sDKTransactionID[i14 % 4]), Long.valueOf(i15), Long.valueOf(getSDKReferenceNumber)};
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(2011691457);
                    if (sDKTransactionID2 == null) {
                        int mirror = AndroidCharacter.getMirror('0') + 2726;
                        char cMyTid = (char) ((Process.myTid() >> 22) + 13060);
                        int offsetAfter = 25 - TextUtils.getOffsetAfter("", 0);
                        byte b8 = (byte) 0;
                        byte b11 = b8;
                        String str$$c = $$c(b8, b11, b11);
                        Class cls = Long.TYPE;
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(mirror, cMyTid, offsetAfter, -1416626223, false, str$$c, new Class[]{cls, cls, cls});
                    }
                    sDKTransactionID[i14] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {completedVar, completedVar};
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-721583866);
                    if (sDKTransactionID3 == null) {
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 408, (char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 30, 144017174, false, "y", new Class[]{Object.class, Object.class});
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

        public static void init$0() {
            $$a = new byte[]{4, -104, 34, -4};
            $$b = 241;
        }

        public /* synthetic */ getSDKTransactionID(byte b8) {
            this();
        }
    }
}
