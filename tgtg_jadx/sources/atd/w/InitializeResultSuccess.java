package atd.w;

import android.app.Application;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import kotlin.Metadata;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b \u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0004J\b\u0010\u000e\u001a\u00020\rH\u0004J\b\u0010\u000f\u001a\u00020\rH\u0004J\b\u0010\u0010\u001a\u00020\rH\u0004J\b\u0010\u0011\u001a\u00020\rH\u0004J\b\u0010\u0012\u001a\u00020\rH\u0004J\b\u0010\u0013\u001a\u00020\rH\u0004J\b\u0010\u0014\u001a\u00020\rH\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "application", "Landroid/app/Application;", "permissionChecker", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "telephonyManager", "Landroid/telephony/TelephonyManager;", "getTelephonyManager", "()Landroid/telephony/TelephonyManager;", "appHasCarrierPrivileges", "", "isNetworkCdma", "isReadPhoneStatePermissionGranted", "isReadBasicPhoneStatePermissionGranted", "isReadSmsPermissionGranted", "isReadPrivilegedPhoneStatePermissionGranted", "isReadPhoneNumbersPermissionGranted", "isAccessCoarseLocationPermissionGranted", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class InitializeResultSuccess extends DeviceParameter {
    private static final byte[] $$e = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static int ChallengeResultCancelled;
    private static int getMessageVersion;
    private static char[] getSDKAppID;
    private static long getSDKReferenceNumber;

    @Nullable
    private final TelephonyManager AuthenticationRequestParameters;

    @NotNull
    private final Application getDeviceData;

    @NotNull
    private final PermissionChecker getSDKTransactionID;

    private static String $$i(byte b8, byte b11, int i11) {
        int i12 = b8 * 2;
        byte[] bArr = $$e;
        int i13 = 3 - (i11 * 4);
        int i14 = 106 - b11;
        byte[] bArr2 = new byte[i12 + 1];
        int i15 = -1;
        if (bArr == null) {
            i14 += i12;
        }
        while (true) {
            i13++;
            i15++;
            bArr2[i15] = (byte) i14;
            if (i15 == i12) {
                return new String(bArr2, 0);
            }
            i14 += bArr[i13];
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResultCancelled = 0;
        getMessageVersion = 1;
        getSDKAppID = new char[]{58350, 58031, 57667, 59387, 59039, 62575, 62777, 63192, 61559, 61701, 62170, 64636, 64847, 65206, 63562, 63750, 64176, 58443, 58872, 59043, 57424, 57841, 57993, 60514, 60871, 61119, 59394, 59884, 60078, 54278, 54775, 55115, 53283, 53751, 54084, 56371, 56733, 57199, 55331, 55705, 13285, 12979, 12626, 14333, 13967, 13648, 15350, 15045, 14652, 16320, 16012, 15674, 9153, 8818, 8489, 10202, 9851, 9475, 11240, 10829, 10549, 12168, 11878, 11556, 5022, 4724, 4317, 6062, 5755, 5326, 7098, 6667, 6379, 8115, 7699, 7408, 851, 525, 243, 1887, 1577, 46972, 46634, 46539, 45924, 45590, 45513, 49007, 48732, 48549, 47961, 47637, 47523, 42840, 42731, 42416, 41795, 41698, 41370, 44913, 44756, 44460, 43793, 43775, 43453, 38678, 38625, 37956, 32185, 31983, 32526, 31137, 30931, 31500, 30122, 29849, 30560, 29084, 28880, 29542, 28061, 27694, 28533, 27014, 26663, 27487, 26036, 25617, 26473, 25044, 24634, 25464, 24016, 23611, 24219, 23021, 22573, 23169, 22003, 21592, 22205, 20965, 20565, 21155, 19732, 19530, 20128, 18706, 18543, 19146, 17686, 17514, 18112, 16696, 64978, 64644, 65381, 63946, 63672, 64359, 62913, 62706, 63243, 61943, 61627, 62221, 60918, 60485, 61214, 59885, 59468, 60212, 58847, 58490, 59138, 57791, 57425, 58131, 56763, 56394, 57078, 55710, 55370, 56057, 54675, 54305, 55006, 53640, 53284, 53962, 52580, 50816, 51158, 50231, 49816, 50154, 49205, 52883, 53152, 52313, 51877, 52201, 51295, 54948, 55063, 54348, 53951, 54046, 53350, 56973, 57147, 56406, 56047, 56066, 55373, 59114, 59151, 58792, 58061, 58140, 57766, 61148, 61283, 60830, 60116, 60284, 59785, 63012, 63336, 62878, 61985, 62279};
        getSDKReferenceNumber = 3991705100746487127L;
    }

    public InitializeResultSuccess(@NotNull Application application, @NotNull PermissionChecker permissionChecker) throws Throwable {
        application.getClass();
        permissionChecker.getClass();
        this.getDeviceData = application;
        this.getSDKTransactionID = permissionChecker;
        Object[] objArr = new Object[1];
        c(KeyEvent.keyCodeFromString("") + 5, View.combineMeasuredStates(0, 0), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6032), objArr);
        Object systemService = application.getSystemService(((String) objArr[0]).intern());
        this.AuthenticationRequestParameters = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x027c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r31, int r32, char r33, java.lang.Object[] r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.w.InitializeResultSuccess.c(int, int, char, java.lang.Object[]):void");
    }

    public static void init$0() {
        $$e = new byte[]{27, 20, 100, 39};
        $$h = 71;
    }

    public final boolean BuildConfig() throws Throwable {
        int i11 = getMessageVersion + 39;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0 ? Build.VERSION.SDK_INT < 33 : Build.VERSION.SDK_INT < 69) {
            int i12 = ChallengeResultCancelled + 113;
            getMessageVersion = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 7 / 0;
            }
            return false;
        }
        PermissionChecker permissionChecker = this.getSDKTransactionID;
        Object[] objArr = new Object[1];
        c((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 41, (ViewConfiguration.getTouchSlop() >> 8) + 40, (char) (51082 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr);
        return permissionChecker.getSDKAppID(((String) objArr[0]).intern());
    }

    @Nullable
    public final TelephonyManager ChallengeResult() {
        int i11 = (getMessageVersion + 115) % 128;
        ChallengeResultCancelled = i11;
        TelephonyManager telephonyManager = this.AuthenticationRequestParameters;
        int i12 = i11 + 99;
        getMessageVersion = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 70 / 0;
        }
        return telephonyManager;
    }

    public final boolean ChallengeResultCancelled() {
        TelephonyManager telephonyManager = this.AuthenticationRequestParameters;
        if (telephonyManager != null) {
            ChallengeResultCancelled = (getMessageVersion + 109) % 128;
            if (telephonyManager.hasCarrierPrivileges()) {
                return true;
            }
        }
        return false;
    }

    public final boolean ChallengeResultCompleted() throws Throwable {
        getMessageVersion = (ChallengeResultCancelled + 89) % 128;
        PermissionChecker permissionChecker = this.getSDKTransactionID;
        Object[] objArr = new Object[1];
        c(27 - Color.argb(0, 0, 0, 0), TextUtils.indexOf("", "", 0) + 81, (char) (Color.alpha(0) + 17171), objArr);
        boolean sDKAppID = permissionChecker.getSDKAppID(((String) objArr[0]).intern());
        ChallengeResultCancelled = (getMessageVersion + 97) % 128;
        return sDKAppID;
    }

    public final boolean ChallengeResultTimeout() throws Throwable {
        ChallengeResultCancelled = (getMessageVersion + 65) % 128;
        PermissionChecker permissionChecker = this.getSDKTransactionID;
        Object[] objArr = new Object[1];
        c((ViewConfiguration.getScrollDefaultDelay() >> 16) + 41, 190 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (13039 - TextUtils.getCapsMode("", 0, 0)), objArr);
        boolean sDKAppID = permissionChecker.getSDKAppID(((String) objArr[0]).intern());
        ChallengeResultCancelled = (getMessageVersion + 21) % 128;
        return sDKAppID;
    }

    public final boolean getAdditionalDetails() throws Throwable {
        int i11 = getMessageVersion + 15;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0 && Build.VERSION.SDK_INT < 81) {
            ChallengeResultCancelled = (getMessageVersion + 61) % 128;
            return false;
        }
        PermissionChecker permissionChecker = this.getSDKTransactionID;
        Object[] objArr = new Object[1];
        c((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 36, TextUtils.lastIndexOf("", '0', 0) + 155, (char) (Gravity.getAbsoluteGravity(0, 0) + 2493), objArr);
        return permissionChecker.getSDKAppID(((String) objArr[0]).intern());
    }

    public final boolean getMessageVersion() {
        int i11 = getMessageVersion;
        ChallengeResultCancelled = (i11 + 85) % 128;
        TelephonyManager telephonyManager = this.AuthenticationRequestParameters;
        if (telephonyManager != null) {
            int i12 = i11 + 125;
            ChallengeResultCancelled = i12 % 128;
            if (i12 % 2 != 0) {
                if (telephonyManager.getPhoneType() == 4) {
                    return true;
                }
            } else if (telephonyManager.getPhoneType() == 2) {
                return true;
            }
        }
        return false;
    }

    public final boolean getSDKEphemeralPublicKey() throws Throwable {
        Object obj;
        int i11 = getMessageVersion + 67;
        ChallengeResultCancelled = i11 % 128;
        int i12 = i11 % 2;
        PermissionChecker permissionChecker = this.getSDKTransactionID;
        if (i12 != 0) {
            Object[] objArr = new Object[1];
            c(3 / AndroidCharacter.getMirror('O'), TextUtils.indexOf("", Matrix.MATRIX_TYPE_ZERO, 0) + 6, (char) (ViewConfiguration.getFadingEdgeLength() << 24), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            c('S' - AndroidCharacter.getMirror('0'), TextUtils.indexOf((CharSequence) "", '0', 0) + 6, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr2);
            obj = objArr2[0];
        }
        boolean sDKAppID = permissionChecker.getSDKAppID(((String) obj).intern());
        int i13 = getMessageVersion + 55;
        ChallengeResultCancelled = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 30 / 0;
        }
        return sDKAppID;
    }

    public final boolean getTransactionStatus() throws Throwable {
        Object obj;
        int i11 = ChallengeResultCancelled + 87;
        getMessageVersion = i11 % 128;
        int i12 = i11 % 2;
        PermissionChecker permissionChecker = this.getSDKTransactionID;
        if (i12 == 0) {
            Object[] objArr = new Object[1];
            c(38 - TextUtils.lastIndexOf("", (char) 18, 1, 0), ExpandableListView.getPackedPositionType(1L) + 26, (char) (35286 - ((Process.getThreadPriority(1) << 117) % 71)), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            c(45 - TextUtils.lastIndexOf("", '0', 0, 0), 108 - ExpandableListView.getPackedPositionType(0L), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 35286), objArr2);
            obj = objArr2[0];
        }
        return permissionChecker.getSDKAppID(((String) obj).intern());
    }

    public /* synthetic */ InitializeResultSuccess(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }
}
