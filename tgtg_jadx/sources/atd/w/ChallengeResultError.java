package atd.w;

import android.annotation.SuppressLint;
import android.app.Application;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import com.braze.Constants;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.LocalizedMessage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0019B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\f0\f*\u00020\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u0004\u0018\u00010\f*\u00020\u0010H\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0010*\u00020\u0002H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/LineOneNumber;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", "application", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/telephony/TelephonyManager;", "", "kotlin.jvm.PlatformType", "line1Number", "(Landroid/telephony/TelephonyManager;)Ljava/lang/String;", "Landroid/telephony/SubscriptionManager;", "phoneNumber", "(Landroid/telephony/SubscriptionManager;)Ljava/lang/String;", "getSubscriptionManager", "(Landroid/app/Application;)Landroid/telephony/SubscriptionManager;", "", "isAnyRequiredPermissionGrantedForLine1Number", "()Z", "Landroid/app/Application;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLineOneNumber.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LineOneNumber.kt\ncom/adyen/threeds2/internal/deviceinfo/parameter/telephony/LineOneNumber\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,83:1\n1#2:84\n*E\n"})
public final class ChallengeResultError extends InitializeResultSuccess {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static boolean getDeviceData;
    private static int getMessageVersion;
    private static boolean getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static char[] getSDKTransactionID;

    @NotNull
    private final Application getSDKReferenceNumber;

    private static String $$d(byte b8, short s7, int i11) {
        int i12 = (s7 * 3) + 4;
        byte[] bArr = $$a;
        int i13 = i11 * 3;
        int i14 = (b8 * 4) + 111;
        byte[] bArr2 = new byte[i13 + 1];
        int i15 = -1;
        if (bArr == null) {
            i12++;
            i14 = i12 + (-i13);
        }
        while (true) {
            int i16 = i12;
            int i17 = i14;
            i15++;
            bArr2[i15] = (byte) i17;
            if (i15 == i13) {
                return new String(bArr2, 0);
            }
            i12 = i16 + 1;
            i14 = i17 + (-bArr[i16]);
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = 0;
        ChallengeResult = 1;
        getSDKEphemeralPublicKey = 0;
        getMessageVersion = 1;
        getSDKTransactionID();
        TypedValue.complexToFloat(0);
        new getDeviceData((byte) 0);
        int i11 = BuildConfig + 43;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ChallengeResultError(@NotNull Application application, @NotNull PermissionChecker permissionChecker) {
        super(application, permissionChecker);
        application.getClass();
        permissionChecker.getClass();
        this.getSDKReferenceNumber = application;
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private static String AuthenticationRequestParameters(TelephonyManager telephonyManager) {
        getSDKEphemeralPublicKey = (getMessageVersion + 23) % 128;
        String line1Number = telephonyManager.getLine1Number();
        int i11 = getMessageVersion + 33;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 87 / 0;
        }
        return line1Number;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r3 = atd.w.ChallengeResultError.getMessageVersion + 45;
        atd.w.ChallengeResultError.getSDKEphemeralPublicKey = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        if ((r3 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r3 = r3.getPhoneNumber(r0.getSubscriptionId());
        atd.w.ChallengeResultError.getSDKEphemeralPublicKey = (atd.w.ChallengeResultError.getMessageVersion + 63) % 128;
     */
    @android.annotation.SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String a_(android.telephony.SubscriptionManager r3) {
        /*
            r2 = this;
            int r0 = atd.w.ChallengeResultError.getSDKEphemeralPublicKey
            int r0 = r0 + 87
            int r1 = r0 % 128
            atd.w.ChallengeResultError.getMessageVersion = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L17
            android.telephony.TelephonyManager r0 = r2.ChallengeResult()
            r1 = 9
            int r1 = r1 / 0
            if (r0 == 0) goto L2e
            goto L1d
        L17:
            android.telephony.TelephonyManager r0 = r2.ChallengeResult()
            if (r0 == 0) goto L2e
        L1d:
            int r0 = r0.getSubscriptionId()
            java.lang.String r3 = r3.getPhoneNumber(r0)
            int r0 = atd.w.ChallengeResultError.getMessageVersion
            int r0 = r0 + 63
            int r0 = r0 % 128
            atd.w.ChallengeResultError.getSDKEphemeralPublicKey = r0
            return r3
        L2e:
            int r3 = atd.w.ChallengeResultError.getMessageVersion
            int r3 = r3 + 45
            int r0 = r3 % 128
            atd.w.ChallengeResultError.getSDKEphemeralPublicKey = r0
            int r3 = r3 % 2
            r0 = 0
            if (r3 != 0) goto L3c
            return r0
        L3c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.w.ChallengeResultError.a_(android.telephony.SubscriptionManager):java.lang.String");
    }

    private static void b(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
        long j9;
        String str3 = str2;
        int i12 = $10 + 99;
        $11 = i12 % 128;
        Object bytes = str3;
        if (i12 % 2 == 0) {
            throw null;
        }
        if (str3 != null) {
            bytes = str3.getBytes(LocalizedMessage.DEFAULT_ENCODING);
        }
        byte[] bArr = (byte[]) bytes;
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.bb.ChallengeResultTimeout challengeResultTimeout = new atd.bb.ChallengeResultTimeout();
        char[] cArr = getSDKTransactionID;
        Class cls = Integer.TYPE;
        long j11 = 0;
        int i13 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i14 = 0;
            while (i14 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i14])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(887083134);
                    if (sDKTransactionID == null) {
                        j9 = j11;
                        byte b8 = (byte) ($$b - 5);
                        byte b11 = b8;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(Color.argb(i13, i13, i13, i13) + 2555, (char) (48599 - (SystemClock.elapsedRealtimeNanos() > j11 ? 1 : (SystemClock.elapsedRealtimeNanos() == j11 ? 0 : -1))), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31, -390605202, false, $$d(b8, b11, b11), new Class[]{cls});
                    } else {
                        j9 = j11;
                    }
                    cArr2[i14] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i14++;
                    j11 = j9;
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
        long j12 = j11;
        Object[] objArr3 = {Integer.valueOf(AuthenticationRequestParameters)};
        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-1144184369);
        if (sDKTransactionID2 == null) {
            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getTouchSlop() >> 8) + 147, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > j12 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j12 ? 0 : -1))), 32 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1738876895, false, Constants.BRAZE_PUSH_TITLE_KEY, new Class[]{cls});
        }
        int iIntValue = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
        if (getSDKAppID) {
            int length2 = bArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length2;
            char[] cArr3 = new char[length2];
            challengeResultTimeout.getSDKAppID = 0;
            while (true) {
                int i15 = challengeResultTimeout.getSDKAppID;
                int i16 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i15 >= i16) {
                    objArr[0] = new String(cArr3);
                    return;
                }
                cArr3[i15] = (char) (cArr[bArr[(i16 - 1) - i15] + i11] - iIntValue);
                Object[] objArr4 = {challengeResultTimeout, challengeResultTimeout};
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                if (sDKTransactionID3 == null) {
                    byte b12 = (byte) ($$b - 4);
                    byte b13 = (byte) (b12 - 1);
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(TextUtils.lastIndexOf("", '0') + 1698, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), 29 - Color.argb(0, 0, 0, 0), -1620360563, false, $$d(b12, b13, b13), new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr4);
            }
        } else {
            if (getDeviceData) {
                int length3 = charArray.length;
                challengeResultTimeout.AuthenticationRequestParameters = length3;
                char[] cArr4 = new char[length3];
                challengeResultTimeout.getSDKAppID = 0;
                $10 = ($11 + 49) % 128;
                while (true) {
                    int i17 = challengeResultTimeout.getSDKAppID;
                    int i18 = challengeResultTimeout.AuthenticationRequestParameters;
                    if (i17 >= i18) {
                        break;
                    }
                    cArr4[i17] = (char) (cArr[charArray[(i18 - 1) - i17] - i11] - iIntValue);
                    Object[] objArr5 = {challengeResultTimeout, challengeResultTimeout};
                    Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(1124287645);
                    if (sDKTransactionID4 == null) {
                        byte b14 = (byte) ($$b - 4);
                        byte b15 = (byte) (b14 - 1);
                        sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(1697 - (ViewConfiguration.getTouchSlop() >> 8), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29, -1620360563, false, $$d(b14, b15, b15), new Class[]{Object.class, Object.class});
                    }
                    ((Method) sDKTransactionID4).invoke(null, objArr5);
                }
                String str4 = new String(cArr4);
                int i19 = $11 + 103;
                $10 = i19 % 128;
                if (i19 % 2 != 0) {
                    throw null;
                }
                objArr[0] = str4;
                return;
            }
            int i21 = 0;
            int length4 = iArr.length;
            challengeResultTimeout.AuthenticationRequestParameters = length4;
            char[] cArr5 = new char[length4];
            while (true) {
                challengeResultTimeout.getSDKAppID = i21;
                int i22 = challengeResultTimeout.getSDKAppID;
                int i23 = challengeResultTimeout.AuthenticationRequestParameters;
                if (i22 >= i23) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                int i24 = $11 + 57;
                $10 = i24 % 128;
                if (i24 % 2 != 0) {
                    cArr5[i22] = (char) (cArr[iArr[i23 / i22] * i11] / iIntValue);
                } else {
                    cArr5[i22] = (char) (cArr[iArr[(i23 - 1) - i22] - i11] - iIntValue);
                }
                i21 = i22 + 1;
            }
        }
    }

    private static SubscriptionManager b_(Application application) throws Throwable {
        Object[] objArr = new Object[1];
        b(null, null, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 126, "\u0082\u008d\u008f\u0090\u008e\u0082\u008a\u0089\u0087\u0086\u008f\u0081\u0084\u008f\u008e\u008d\u008a\u008c\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081", objArr);
        Object systemService = application.getSystemService(((String) objArr[0]).intern());
        if (!(systemService instanceof SubscriptionManager)) {
            int i11 = getSDKEphemeralPublicKey + 87;
            getMessageVersion = i11 % 128;
            if (i11 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int i12 = getSDKEphemeralPublicKey + 91;
        getMessageVersion = i12 % 128;
        SubscriptionManager subscriptionManager = (SubscriptionManager) systemService;
        if (i12 % 2 == 0) {
            int i13 = 57 / 0;
        }
        return subscriptionManager;
    }

    private final boolean getSDKAppID() throws Throwable {
        if (Build.VERSION.SDK_INT <= 29) {
            int i11 = getSDKEphemeralPublicKey + 63;
            getMessageVersion = i11 % 128;
            if (i11 % 2 == 0) {
                getSDKEphemeralPublicKey();
                throw null;
            }
            if (getSDKEphemeralPublicKey()) {
                return true;
            }
        }
        if (ChallengeResultCompleted()) {
            return true;
        }
        getMessageVersion = (getSDKEphemeralPublicKey + 119) % 128;
        return getAdditionalDetails();
    }

    public static void getSDKTransactionID() {
        getSDKTransactionID = new char[]{21780, 21733, 21740, 21776, 21736, 21779, 21778, 21785, 21731, 21783, 21781, 21734, 21735, 21782, 21737, 21786, 21697, 21712, 21717};
        AuthenticationRequestParameters = 1286296704;
        getDeviceData = true;
        getSDKAppID = true;
    }

    public static void init$0() {
        $$a = new byte[]{40, 31, 100, 78};
        $$b = 5;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    @NotNull
    public final DeviceParameterResult getSDKReferenceNumber() throws Throwable {
        String strAuthenticationRequestParameters;
        String str = null;
        if (Build.VERSION.SDK_INT < 33) {
            getSDKEphemeralPublicKey = (getMessageVersion + 111) % 128;
            if (!getSDKAppID() && !ChallengeResultCancelled()) {
                DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
                int i11 = getMessageVersion + 67;
                getSDKEphemeralPublicKey = i11 % 128;
                if (i11 % 2 == 0) {
                    return failure;
                }
                throw null;
            }
            TelephonyManager telephonyManagerChallengeResult = ChallengeResult();
            if (telephonyManagerChallengeResult == null || (strAuthenticationRequestParameters = AuthenticationRequestParameters(telephonyManagerChallengeResult)) == null) {
                return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
            }
            int i12 = getSDKEphemeralPublicKey + 95;
            getMessageVersion = i12 % 128;
            if (i12 % 2 != 0) {
                return DeviceParameterResult.Success.StringValue.m164boximpl(DeviceParameterResult.Success.StringValue.m165constructorimpl(strAuthenticationRequestParameters));
            }
            DeviceParameterResult.Success.StringValue.m164boximpl(DeviceParameterResult.Success.StringValue.m165constructorimpl(strAuthenticationRequestParameters));
            throw null;
        }
        if (!getTransactionStatus() && !getAdditionalDetails() && !ChallengeResultCancelled()) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
        }
        SubscriptionManager subscriptionManagerB_ = b_(this.getSDKReferenceNumber);
        if (subscriptionManagerB_ != null) {
            int i13 = getMessageVersion + 21;
            getSDKEphemeralPublicKey = i13 % 128;
            if (i13 % 2 != 0) {
                a_(subscriptionManagerB_);
                throw null;
            }
            String strA_ = a_(subscriptionManagerB_);
            if (strA_ != null) {
                if (strA_.length() > 0) {
                    getSDKEphemeralPublicKey = (getMessageVersion + 9) % 128;
                    str = strA_;
                }
                if (str != null) {
                    return DeviceParameterResult.Success.StringValue.m164boximpl(DeviceParameterResult.Success.StringValue.m165constructorimpl(str));
                }
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/LineOneNumber$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b8) {
            this();
        }
    }

    public /* synthetic */ ChallengeResultError(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }
}
