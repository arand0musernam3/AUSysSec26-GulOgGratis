package atd.x;

import android.app.Application;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.braze.Constants;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.LocalizedMessage;
import org.jetbrains.annotations.NotNull;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/AccessibilityEnabled;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAccessibilityEnabled.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessibilityEnabled.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/AccessibilityEnabled\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class getDeviceData extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static int getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static boolean getSDKReferenceNumber;
    private static boolean getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getDeviceData;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(short r5, byte r6, short r7) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 1
            byte[] r0 = atd.x.getDeviceData.$$a
            int r6 = r6 * 4
            int r6 = r6 + 4
            int r5 = r5 * 4
            int r5 = 115 - r5
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r6
            r5 = r7
            r3 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            r4 = r0[r6]
        L27:
            int r6 = r6 + 1
            int r5 = r5 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.getDeviceData.$$d(short, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = 0;
        ChallengeResultCancelled = 1;
        getSDKEphemeralPublicKey = 0;
        ChallengeResult = 1;
        AuthenticationRequestParameters();
        ImageFormat.getBitsPerPixel(0);
        new getSDKTransactionID((byte) 0);
        ChallengeResultCancelled = (BuildConfig + 87) % 128;
    }

    private getDeviceData(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getDeviceData = getsdkreferencenumber;
    }

    public static void AuthenticationRequestParameters() {
        AuthenticationRequestParameters = new char[]{21915, 21913, 21919, 21897, 21891, 21912, 21894, 21902, 21939, 21909, 21892, 21918, 21883, 21834, 21836};
        getSDKAppID = 1286296890;
        getSDKTransactionID = true;
        getSDKReferenceNumber = true;
    }

    private static void b(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        String str3 = str2;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
        }
        byte[] bArr = (byte[]) bytes;
        if (str != null) {
            $11 = ($10 + 13) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        atd.bb.ChallengeResultTimeout challengeResultTimeout = new atd.bb.ChallengeResultTimeout();
        char[] cArr2 = AuthenticationRequestParameters;
        Class cls = Integer.TYPE;
        char c3 = '0';
        int i13 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i14 = 0;
            while (i14 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i14])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(887083134);
                    if (sDKTransactionID == null) {
                        int iLastIndexOf = TextUtils.lastIndexOf("", c3, i13, i13) + 2556;
                        char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 48598);
                        int jumpTapTimeout = 31 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        byte b8 = (byte) ($$b & 1);
                        byte b11 = (byte) (b8 - 1);
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(iLastIndexOf, scrollDefaultDelay, jumpTapTimeout, -390605202, false, $$d(b8, b11, b11), new Class[]{cls});
                    }
                    cArr3[i14] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i14++;
                    c3 = '0';
                    i13 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(getSDKAppID)};
        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-1144184369);
        if (sDKTransactionID2 == null) {
            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(147 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 32 - Drawable.resolveOpacity(0, 0), 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
        }
        int iIntValue = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
        int i15 = 1124287645;
        if (getSDKReferenceNumber) {
            int length2 = bArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length2;
            char[] cArr4 = new char[length2];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i16 = challengeResultTimeout.getSDKAppID;
                int i17 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i16 >= i17) {
                    break;
                }
                cArr4[i16] = (char) (cArr2[bArr[(i17 - 1) - i16] + i11] - iIntValue);
                Object[] objArr4 = {challengeResultTimeout, challengeResultTimeout};
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(i15);
                if (sDKTransactionID3 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    i12 = i15;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(1696 - TextUtils.lastIndexOf("", '0', 0, 0), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 29 - TextUtils.getOffsetBefore("", 0), -1620360563, false, $$d(b12, b13, b13), new Class[]{Object.class, Object.class});
                } else {
                    i12 = i15;
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                i15 = i12;
            }
            String str4 = new String(cArr4);
            int i18 = $10 + 13;
            $11 = i18 % 128;
            if (i18 % 2 == 0) {
                throw null;
            }
            objArr[0] = str4;
            return;
        }
        if (getSDKTransactionID) {
            int length3 = cArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length3;
            char[] cArr5 = new char[length3];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i19 = challengeResultTimeout.getSDKAppID;
                int i21 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i19 >= i21) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                cArr5[i19] = (char) (cArr2[cArr[(i21 - 1) - i19] - i11] - iIntValue);
                Object[] objArr5 = {challengeResultTimeout, challengeResultTimeout};
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                if (sDKTransactionID4 == null) {
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(ImageFormat.getBitsPerPixel(0) + 1698, (char) (Process.myPid() >> 22), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 29, -1620360563, false, $$d(b14, b15, b15), new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID4).invoke(null, objArr5);
            }
        } else {
            int length4 = iArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length4;
            char[] cArr6 = new char[length4];
            challengeResultTimeout.getSDKAppID = 0;
            $11 = ($10 + 67) % 128;
            while (true) {
                int i22 = challengeResultTimeout.getSDKAppID;
                int i23 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i22 >= i23) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i22] = (char) (cArr2[iArr[(i23 - 1) - i22] - i11] - iIntValue);
                    challengeResultTimeout.getSDKAppID = i22 + 1;
                }
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{95, 116, 104, 93};
        $$b = 247;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        atd.t.getSDKReferenceNumber getsdkreferencenumber = this.getDeviceData;
        Object[] objArr = new Object[1];
        b(null, null, 127 - View.combineMeasuredStates(0, 0), "\u008c\u0083\u0087\u0086\u0081\u008b\u0083\u008a\u0089\u0088\u0085\u0087\u0085\u0086\u0085\u0084\u0084\u0083\u0082\u0082\u0081", objArr);
        String strAuthenticationRequestParameters = getsdkreferencenumber.AuthenticationRequestParameters(((String) objArr[0]).intern());
        if (strAuthenticationRequestParameters != null) {
            ChallengeResult = (getSDKEphemeralPublicKey + 57) % 128;
            Boolean sDKTransactionID = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKAppID.getSDKTransactionID(strAuthenticationRequestParameters);
            if (sDKTransactionID != null) {
                ChallengeResult = (getSDKEphemeralPublicKey + 111) % 128;
                return a0.h(sDKTransactionID);
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/AccessibilityEnabled$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        public static int AuthenticationRequestParameters;
        public static int getSDKAppID;

        private getSDKTransactionID() {
        }

        public static int getSDKReferenceNumber() {
            int i11 = AuthenticationRequestParameters;
            int i12 = i11 % 5199991;
            AuthenticationRequestParameters = i11 + 1;
            if (i12 != 0) {
                return getSDKAppID;
            }
            int iA = a0.a();
            getSDKAppID = iA;
            return iA;
        }

        public /* synthetic */ getSDKTransactionID(byte b8) {
            this();
        }
    }

    public /* synthetic */ getDeviceData(Application application) {
        this(application, new atd.t.getSDKTransactionID(application));
    }
}
