package atd.z;

import android.app.Application;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\rB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/IsDeviceToApRttSupported;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiFeatureSupport;", "deviceToApRtt", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiFeatureSupport;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/app/Application;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiFeatureSupport;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIsDeviceToApRttSupported.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IsDeviceToApRttSupported.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/wifi/IsDeviceToApRttSupported\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,30:1\n1#2:31\n*E\n"})
public final class getSDKEphemeralPublicKey extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static boolean AuthenticationRequestParameters;
    private static int BuildConfig;
    private static boolean ChallengeResult;
    private static int ChallengeResultCancelled;
    private static char[] getDeviceData;
    private static int getMessageVersion;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKTransactionID;

    @NotNull
    private final Application getSDKAppID;

    @NotNull
    private final getTransactionID getSDKReferenceNumber;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(int r6, short r7, int r8) {
        /*
            int r6 = r6 * 4
            int r0 = 1 - r6
            byte[] r1 = atd.z.getSDKEphemeralPublicKey.$$a
            int r8 = r8 * 4
            int r8 = r8 + 111
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            int r7 = r7 + 1
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r7 = r7 + r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.z.getSDKEphemeralPublicKey.$$d(int, short, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        getMessageVersion = 1;
        ChallengeResultCancelled = 0;
        BuildConfig = 1;
        getSDKTransactionID();
        AudioTrack.getMinVolume();
        new getSDKAppID((byte) 0);
        getMessageVersion = (getSDKEphemeralPublicKey + 19) % 128;
    }

    private getSDKEphemeralPublicKey(@NotNull Application application, @NotNull getTransactionID gettransactionid) {
        application.getClass();
        gettransactionid.getClass();
        this.getSDKAppID = application;
        this.getSDKReferenceNumber = gettransactionid;
    }

    private static void b(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        int i13;
        int i14;
        String str3 = str2;
        $10 = ($11 + 11) % 128;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
        }
        byte[] bArr = (byte[]) bytes;
        if (str != null) {
            charArray = str.toCharArray();
            $10 = ($11 + 95) % 128;
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        atd.bb.ChallengeResultTimeout challengeResultTimeout = new atd.bb.ChallengeResultTimeout();
        char[] cArr2 = getDeviceData;
        Class cls = Integer.TYPE;
        int i15 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i16 = 0;
            while (i16 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i16])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(887083134);
                    if (sDKTransactionID == null) {
                        byte b8 = (byte) i15;
                        i14 = i15;
                        byte b11 = (byte) (b8 - 1);
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(2554 - MotionEvent.axisFromString(""), (char) (48598 - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31, -390605202, false, $$d(b8, b11, (byte) (b11 + 1)), new Class[]{cls});
                    } else {
                        i14 = i15;
                    }
                    cArr3[i16] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i16++;
                    i15 = i14;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            i12 = i15;
            $11 = ($10 + 5) % 128;
            cArr2 = cArr3;
        } else {
            i12 = 0;
        }
        Object[] objArr3 = {Integer.valueOf(getSDKTransactionID)};
        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-1144184369);
        if (sDKTransactionID2 == null) {
            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(147 - Color.alpha(i12), (char) KeyEvent.keyCodeFromString(""), 32 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
        }
        int iIntValue = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
        int i17 = 1124287645;
        if (ChallengeResult) {
            int length2 = bArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length2;
            char[] cArr4 = new char[length2];
            challengeResultTimeout.getSDKAppID = i12;
            while (true) {
                int i18 = challengeResultTimeout.getSDKAppID;
                int i19 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i18 >= i19) {
                    break;
                }
                cArr4[i18] = (char) (cArr2[bArr[(i19 - 1) - i18] + i11] - iIntValue);
                Object[] objArr4 = {challengeResultTimeout, challengeResultTimeout};
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(i17);
                if (sDKTransactionID3 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = (byte) (b12 - 1);
                    i13 = i17;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(Drawable.resolveOpacity(0, 0) + 1697, (char) KeyEvent.keyCodeFromString(""), Process.getGidForName("") + 30, -1620360563, false, $$d(b12, b13, (byte) (-b13)), new Class[]{Object.class, Object.class});
                } else {
                    i13 = i17;
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
                i17 = i13;
            }
            String str4 = new String(cArr4);
            int i21 = $10 + 119;
            $11 = i21 % 128;
            if (i21 % 2 == 0) {
                throw null;
            }
            objArr[0] = str4;
            return;
        }
        int i22 = i12;
        if (AuthenticationRequestParameters) {
            int length3 = cArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length3;
            char[] cArr5 = new char[length3];
            challengeResultTimeout.getSDKAppID = i22;
            while (true) {
                int i23 = challengeResultTimeout.getSDKAppID;
                int i24 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i23 >= i24) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                int i25 = $11 + 77;
                $10 = i25 % 128;
                if (i25 % 2 != 0) {
                    cArr5[i23] = (char) (cArr2[cArr[(i24 - 1) << i23] << i11] - iIntValue);
                    Object[] objArr5 = {challengeResultTimeout, challengeResultTimeout};
                    Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                    if (sDKTransactionID4 == null) {
                        byte b14 = (byte) 0;
                        byte b15 = (byte) (b14 - 1);
                        sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1697, (char) View.resolveSizeAndState(0, 0, 0), TextUtils.indexOf((CharSequence) "", '0') + 30, -1620360563, false, $$d(b14, b15, (byte) (-b15)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) sDKTransactionID4).invoke(null, objArr5);
                } else {
                    cArr5[i23] = (char) (cArr2[cArr[(i24 - 1) - i23] - i11] - iIntValue);
                    Object[] objArr6 = {challengeResultTimeout, challengeResultTimeout};
                    Object sDKTransactionID5 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                    if (sDKTransactionID5 == null) {
                        byte b16 = (byte) 0;
                        byte b17 = (byte) (b16 - 1);
                        sDKTransactionID5 = atd.e.ChallengeResult.getDeviceData(1697 - View.resolveSize(0, 0), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 29 - TextUtils.getTrimmedLength(""), -1620360563, false, $$d(b16, b17, (byte) (-b17)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) sDKTransactionID5).invoke(null, objArr6);
                }
            }
        } else {
            int length4 = iArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length4;
            char[] cArr6 = new char[length4];
            challengeResultTimeout.getSDKAppID = i22;
            while (true) {
                int i26 = challengeResultTimeout.getSDKAppID;
                int i27 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i26 >= i27) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i26] = (char) (cArr2[iArr[(i27 - 1) - i26] - i11] - iIntValue);
                    challengeResultTimeout.getSDKAppID = i26 + 1;
                }
            }
        }
    }

    public static void getSDKTransactionID() {
        getDeviceData = new char[]{21723, 21700, 21726, 21704, 21701, 21699, 21636, 21698, 21709, 21727, 21724, 21710, 21691, 21642, 21641};
        getSDKTransactionID = 1286296698;
        AuthenticationRequestParameters = true;
        ChallengeResult = true;
    }

    public static void init$0() {
        $$a = new byte[]{121, -69, 41, 13};
        $$b = 242;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        Boolean boolValueOf;
        int i11 = ChallengeResultCancelled + 105;
        BuildConfig = i11 % 128;
        if (i11 % 2 != 0 && Build.VERSION.SDK_INT < 28) {
            boolValueOf = this.getSDKReferenceNumber.getDeviceData();
        } else {
            PackageManager packageManager = this.getSDKAppID.getPackageManager();
            Object[] objArr = new Object[1];
            b(null, null, 128 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\u008c\u008c\u0084\u0087\u0086\u008b\u0086\u0089\u0087\u008a\u0084\u0081\u0089\u0083\u0084\u0081\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
            boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature(((String) objArr[0]).intern()));
            ChallengeResultCancelled = (BuildConfig + 29) % 128;
        }
        return boolValueOf != null ? a0.h(boolValueOf) : new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/IsDeviceToApRttSupported$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private getSDKAppID() {
        }

        public /* synthetic */ getSDKAppID(byte b8) {
            this();
        }
    }

    public /* synthetic */ getSDKEphemeralPublicKey(Application application) {
        this(application, new AuthenticationRequestParameters(application));
    }
}
