package atd.y;

import android.app.Application;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.app.tgtg.model.local.AppConstants;
import com.braze.Constants;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.x;
import org.bouncycastle.i18n.LocalizedMessage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/FontScale;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFontScale.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontScale.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/FontScale\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,32:1\n1#2:33\n*E\n"})
public final class getSDKEphemeralPublicKey extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static boolean getDeviceData;
    private static int getMessageVersion;
    private static boolean getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKTransactionID;

    @NotNull
    private final atd.t.getSDKReferenceNumber getSDKReferenceNumber;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(short r6, int r7, byte r8) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 111
            byte[] r0 = atd.y.getSDKEphemeralPublicKey.$$a
            int r7 = r7 * 4
            int r7 = r7 + 1
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r6 = r7
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2d
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            int r3 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r4 = r0[r8]
            r5 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r6 = r6 + r8
            r8 = r0
            r0 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.y.getSDKEphemeralPublicKey.$$d(short, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResult = 0;
        getMessageVersion = 1;
        getSDKEphemeralPublicKey = 0;
        ChallengeResultCancelled = 1;
        getSDKAppID();
        ViewConfiguration.getJumpTapTimeout();
        new getSDKAppID((byte) 0);
        getMessageVersion = (ChallengeResult + 7) % 128;
    }

    private getSDKEphemeralPublicKey(@NotNull Application application, @NotNull atd.t.getSDKReferenceNumber getsdkreferencenumber) {
        application.getClass();
        getsdkreferencenumber.getClass();
        this.getSDKReferenceNumber = getsdkreferencenumber;
    }

    private static void b(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
        char[] cArr;
        int length;
        char[] cArr2;
        int i12;
        String str3 = str2;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
        }
        byte[] bArr = (byte[]) bytes;
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.bb.ChallengeResultTimeout challengeResultTimeout = new atd.bb.ChallengeResultTimeout();
        char[] cArr3 = AuthenticationRequestParameters;
        Class cls = Integer.TYPE;
        int i13 = 0;
        if (cArr3 != null) {
            int i14 = $11 + 107;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i15 = 0;
            while (i15 < length) {
                $10 = ($11 + 11) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i15])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(887083134);
                    if (sDKTransactionID == null) {
                        byte b8 = (byte) i13;
                        i12 = i13;
                        byte b11 = b8;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(TextUtils.getCapsMode("", i13, i13) + 2555, (char) (48598 - ExpandableListView.getPackedPositionType(0L)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 30, -390605202, false, $$d(b8, b11, (byte) (b11 - 1)), new Class[]{cls});
                    } else {
                        i12 = i13;
                    }
                    cArr2[i15] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i15++;
                    i13 = i12;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        int i16 = i13;
        Object[] objArr3 = {Integer.valueOf(getSDKTransactionID)};
        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-1144184369);
        if (sDKTransactionID2 == null) {
            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(ImageFormat.getBitsPerPixel(i16) + AppConstants.CONTACT_US_REQUEST_FILE, (char) ((-1) - TextUtils.lastIndexOf("", '0', i16)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 32, 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
        }
        int iIntValue = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
        if (getSDKAppID) {
            int length2 = bArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length2;
            char[] cArr4 = new char[length2];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i17 = challengeResultTimeout.getSDKAppID;
                int i18 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i17 >= i18) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                cArr4[i17] = (char) (cArr3[bArr[(i18 - 1) - i17] + i11] - iIntValue);
                Object[] objArr4 = {challengeResultTimeout, challengeResultTimeout};
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                if (sDKTransactionID3 == null) {
                    byte b12 = (byte) 1;
                    byte b13 = (byte) (b12 - 1);
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(1697 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 29 - TextUtils.indexOf("", "", 0, 0), -1620360563, false, $$d(b12, b13, (byte) (b13 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
            }
        } else if (getDeviceData) {
            int i19 = $10;
            int i21 = i19 + 121;
            $11 = i21 % 128;
            if (i21 % 2 == 0) {
                int length3 = charArray.length;
                challengeResultTimeout.AuthenticationRequestParameters = length3;
                cArr = new char[length3];
                challengeResultTimeout.getSDKAppID = 1;
            } else {
                int length4 = charArray.length;
                challengeResultTimeout.AuthenticationRequestParameters = length4;
                cArr = new char[length4];
                challengeResultTimeout.getSDKAppID = 0;
            }
            $11 = (i19 + 13) % 128;
            while (true) {
                int i22 = challengeResultTimeout.getSDKAppID;
                int i23 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i22 >= i23) {
                    objArr[0] = new String(cArr);
                    return;
                }
                cArr[i22] = (char) (cArr3[charArray[(i23 - 1) - i22] - i11] - iIntValue);
                Object[] objArr5 = {challengeResultTimeout, challengeResultTimeout};
                Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                if (sDKTransactionID4 == null) {
                    byte b14 = (byte) 1;
                    byte b15 = (byte) (b14 - 1);
                    sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1697, (char) Color.red(0), 29 - Color.argb(0, 0, 0, 0), -1620360563, false, $$d(b14, b15, (byte) (b15 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID4).invoke(null, objArr5);
            }
        } else {
            int i24 = 0;
            int length5 = iArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length5;
            char[] cArr5 = new char[length5];
            while (true) {
                challengeResultTimeout.getSDKAppID = i24;
                int i25 = challengeResultTimeout.getSDKAppID;
                int i26 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i25 >= i26) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i25] = (char) (cArr3[iArr[(i26 - 1) - i25] - i11] - iIntValue);
                    i24 = i25 + 1;
                }
            }
        }
    }

    public static void getSDKAppID() {
        AuthenticationRequestParameters = new char[]{21709, 21754, 21749, 21759, 21706, 21758, 21710, 21704, 21751, 21708, 21672, 21688, 21691, 21693};
        getSDKTransactionID = 1286296683;
        getDeviceData = true;
        getSDKAppID = true;
    }

    public static void init$0() {
        $$a = new byte[]{49, 92, 68, -39};
        $$b = 236;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        getSDKEphemeralPublicKey = (ChallengeResultCancelled + 47) % 128;
        atd.t.getSDKReferenceNumber getsdkreferencenumber = this.getSDKReferenceNumber;
        Object[] objArr = new Object[1];
        b(null, null, 127 - (ViewConfiguration.getPressedStateDuration() >> 16), "\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        String strAuthenticationRequestParameters = getsdkreferencenumber.AuthenticationRequestParameters(((String) objArr[0]).intern());
        if (strAuthenticationRequestParameters != null) {
            getSDKEphemeralPublicKey = (ChallengeResultCancelled + 83) % 128;
            Float fG = x.g(strAuthenticationRequestParameters);
            if (fG != null) {
                if (fG.floatValue() < 0.0f) {
                    fG = null;
                }
                if (fG != null) {
                    int i11 = ChallengeResultCancelled + 103;
                    getSDKEphemeralPublicKey = i11 % 128;
                    if (i11 % 2 == 0) {
                        return DeviceParameterResult.Success.FloatValue.m143boximpl(DeviceParameterResult.Success.FloatValue.m144constructorimpl(fG.floatValue()));
                    }
                    DeviceParameterResult.Success.FloatValue.m143boximpl(DeviceParameterResult.Success.FloatValue.m144constructorimpl(fG.floatValue()));
                    throw null;
                }
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/FontScale$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "MIN_VALUE", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private getSDKAppID() {
        }

        public /* synthetic */ getSDKAppID(byte b8) {
            this();
        }
    }

    public /* synthetic */ getSDKEphemeralPublicKey(Application application) {
        this(application, new atd.t.AuthenticationRequestParameters(application));
    }
}
