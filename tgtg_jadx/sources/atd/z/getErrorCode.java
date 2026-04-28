package atd.z;

import android.app.Application;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import com.app.tgtg.model.local.AppConstants;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0004J\b\u0010\u000e\u001a\u00020\rH\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiDeviceParameter;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "application", "Landroid/app/Application;", "permissionChecker", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "wifiManager", "Landroid/net/wifi/WifiManager;", "getWifiManager", "()Landroid/net/wifi/WifiManager;", "isWifiStatePermissionGranted", "", "isNearbyWifiDevicesPermissionGranted", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class getErrorCode extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int BuildConfig;
    private static char ChallengeResultCancelled;
    private static char getDeviceData;
    private static int getMessageVersion;
    private static char getSDKReferenceNumber;
    private static char getSDKTransactionID;

    @NotNull
    private final PermissionChecker AuthenticationRequestParameters;

    @NotNull
    private final Application getSDKAppID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$d(int r5, int r6, int r7) {
        /*
            int r7 = r7 * 2
            int r0 = 1 - r7
            byte[] r1 = atd.z.getErrorCode.$$a
            int r6 = r6 * 3
            int r6 = r6 + 66
            int r5 = r5 * 2
            int r5 = 3 - r5
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L18
            r4 = r7
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r5 = r5 + 1
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L26:
            int r3 = r3 + 1
            r4 = r1[r5]
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.z.getErrorCode.$$d(int, int, int):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = 0;
        getMessageVersion = 1;
        getSDKTransactionID = (char) 30635;
        getDeviceData = (char) 61879;
        getSDKReferenceNumber = (char) 40739;
        ChallengeResultCancelled = (char) 17001;
    }

    public getErrorCode(@NotNull Application application, @NotNull PermissionChecker permissionChecker) {
        application.getClass();
        permissionChecker.getClass();
        this.getSDKAppID = application;
        this.AuthenticationRequestParameters = permissionChecker;
    }

    private static void b(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        int i13;
        if (str != null) {
            $10 = ($11 + 93) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        atd.bb.ChallengeResultCompleted challengeResultCompleted = new atd.bb.ChallengeResultCompleted();
        char[] cArr2 = new char[cArr.length];
        int i14 = 0;
        challengeResultCompleted.getDeviceData = 0;
        int i15 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i16 = challengeResultCompleted.getDeviceData;
            if (i16 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i11);
                return;
            }
            $11 = ($10 + 85) % 128;
            cArr3[i14] = cArr[i16];
            char c3 = 1;
            cArr3[1] = cArr[i16 + 1];
            int i17 = 58224;
            int i18 = i14;
            while (i18 < 16) {
                $10 = ($11 + 29) % 128;
                char c7 = cArr3[c3];
                char c8 = cArr3[i14];
                char c11 = c3;
                int i19 = (c8 + i17) ^ ((c8 << 4) + ((char) (((long) getSDKReferenceNumber) ^ 5320350835299930193L)));
                int i21 = c8 >>> 5;
                int i22 = i15;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(ChallengeResultCancelled);
                    objArr2[i22] = Integer.valueOf(i21);
                    objArr2[c11] = Integer.valueOf(i19);
                    objArr2[i14] = Integer.valueOf(c7);
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(906025703);
                    Class cls = Integer.TYPE;
                    if (sDKTransactionID == null) {
                        i13 = 906025703;
                        byte b8 = (byte) i14;
                        i12 = i14;
                        byte b11 = b8;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(2829 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), ExpandableListView.getPackedPositionGroup(0L) + 27, -362226441, false, $$d(b8, b11, b11), new Class[]{cls, cls, cls, cls});
                    } else {
                        i12 = i14;
                        i13 = 906025703;
                    }
                    char cCharValue = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    cArr3[c11] = cCharValue;
                    char c12 = cArr3[i12];
                    int i23 = (cCharValue + i17) ^ ((cCharValue << 4) + ((char) (((long) getSDKTransactionID) ^ 5320350835299930193L)));
                    int i24 = cCharValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(getDeviceData);
                    objArr3[i22] = Integer.valueOf(i24);
                    objArr3[c11] = Integer.valueOf(i23);
                    objArr3[i12] = Integer.valueOf(c12);
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i13);
                    if (sDKTransactionID2 == null) {
                        byte b12 = (byte) i12;
                        byte b13 = b12;
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(2828 - (ViewConfiguration.getTapTimeout() >> 16), (char) ((-1) - MotionEvent.axisFromString("")), View.MeasureSpec.getSize(i12) + 27, -362226441, false, $$d(b12, b13, b13), new Class[]{cls, cls, cls, cls});
                    }
                    cArr3[0] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                    i17 -= 40503;
                    i18++;
                    c3 = c11;
                    i15 = i22;
                    i14 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i25 = i15;
            char c13 = c3;
            int i26 = challengeResultCompleted.getDeviceData;
            cArr2[i26] = cArr3[0];
            cArr2[i26 + 1] = cArr3[c13];
            Object[] objArr4 = new Object[i25];
            objArr4[c13] = challengeResultCompleted;
            objArr4[0] = challengeResultCompleted;
            Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-1859796622);
            if (sDKTransactionID3 == null) {
                byte b14 = (byte) 0;
                byte b15 = (byte) (b14 + 1);
                sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getKeyRepeatDelay() >> 16) + 3156, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 25796), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 28, 1296942946, false, $$d(b14, b15, (byte) (b15 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID3).invoke(null, objArr4);
            i15 = i25;
            i14 = 0;
        }
    }

    public static void init$0() {
        $$a = new byte[]{48, -117, 71, 27};
        $$b = 100;
    }

    @Nullable
    public final WifiManager ChallengeResult() {
        BuildConfig = (getMessageVersion + 45) % 128;
        Application application = this.getSDKAppID;
        Object[] objArr = new Object[1];
        b("爽痖弗돠", ExpandableListView.getPackedPositionType(0L) + 4, objArr);
        Object systemService = application.getSystemService(((String) objArr[0]).intern());
        if (!(systemService instanceof WifiManager)) {
            return null;
        }
        WifiManager wifiManager = (WifiManager) systemService;
        BuildConfig = (getMessageVersion + 41) % 128;
        return wifiManager;
    }

    public final boolean ChallengeResultCancelled() throws Throwable {
        Object obj;
        int i11 = getMessageVersion + AppConstants.RESULT_CODE_ORDER_CANCELLED;
        BuildConfig = i11 % 128;
        int i12 = i11 % 2;
        PermissionChecker permissionChecker = this.AuthenticationRequestParameters;
        if (i12 != 0) {
            Object[] objArr = new Object[1];
            b("樱橠邑緢媻)泥혂\ufb1a䉽싳⇱\uf54c\uf570Ṏ劂\ue05eざ㨲\ue092⥯燧깰\uf03d\uf5fb炩奯膧ƽk핗ꖑ饔猌䧯㟒য়뿫", ViewConfiguration.getScrollBarFadeDuration() + 113, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            b("樱橠邑緢媻)泥혂\ufb1a䉽싳⇱\uf54c\uf570Ṏ劂\ue05eざ㨲\ue092⥯燧깰\uf03d\uf5fb炩奯膧ƽk핗ꖑ饔猌䧯㟒য়뿫", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 38, objArr2);
            obj = objArr2[0];
        }
        return permissionChecker.getSDKAppID(((String) obj).intern());
    }

    public final boolean getSDKEphemeralPublicKey() throws Throwable {
        getMessageVersion = (BuildConfig + 79) % 128;
        PermissionChecker permissionChecker = this.AuthenticationRequestParameters;
        Object[] objArr = new Object[1];
        b("樱橠邑緢媻)泥혂\ufb1a䉽싳⇱\uf54c\uf570Ṏ劂\ue05eざ⢓គ伻\ufdedয়뿫\ue1bf爠奯膧ƽk䟀砾鎛ꋚ柬堬", 36 - ExpandableListView.getPackedPositionType(0L), objArr);
        boolean sDKAppID = permissionChecker.getSDKAppID(((String) objArr[0]).intern());
        BuildConfig = (getMessageVersion + 9) % 128;
        return sDKAppID;
    }

    public /* synthetic */ getErrorCode(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }
}
