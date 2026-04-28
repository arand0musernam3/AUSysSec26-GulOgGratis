package atd.z;

import android.app.Application;
import android.graphics.Color;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/DeviceToApRttWifiFeatureSupport;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiFeatureSupport;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "isSupported", "", "()Ljava/lang/Boolean;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AuthenticationRequestParameters implements getTransactionID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getSDKAppID;
    private static long getSDKTransactionID;

    @NotNull
    private final Application getDeviceData;

    private static String $$c(byte b8, int i11, byte b11) {
        byte[] bArr = $$a;
        int i12 = i11 * 2;
        int i13 = (b8 * 3) + 4;
        int i14 = 120 - (b11 * 2);
        byte[] bArr2 = new byte[i12 + 1];
        int i15 = -1;
        if (bArr == null) {
            i14 = (-i13) + i12;
            i13++;
            bArr = bArr;
            i15 = -1;
        }
        while (true) {
            int i16 = i15 + 1;
            bArr2[i16] = (byte) i14;
            if (i16 == i12) {
                return new String(bArr2, 0);
            }
            int i17 = i14;
            byte[] bArr3 = bArr;
            i14 = (-bArr[i13]) + i17;
            i13++;
            bArr = bArr3;
            i15 = i16;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AuthenticationRequestParameters = 0;
        getSDKAppID = 1;
        getSDKTransactionID = 1656481553124031354L;
    }

    public AuthenticationRequestParameters(@NotNull Application application) {
        application.getClass();
        this.getDeviceData = application;
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        long j9;
        if (str != null) {
            charArray = str.toCharArray();
            $11 = ($10 + 37) % 128;
        } else {
            charArray = str;
        }
        atd.bb.completed completedVar = new atd.bb.completed();
        char[] sDKTransactionID = atd.bb.completed.getSDKTransactionID(getSDKTransactionID ^ 2436480605514729170L, charArray, i11);
        completedVar.getSDKTransactionID = 4;
        while (true) {
            int i12 = completedVar.getSDKTransactionID;
            if (i12 >= sDKTransactionID.length) {
                objArr[0] = new String(sDKTransactionID, 4, sDKTransactionID.length - 4);
                return;
            }
            $10 = ($11 + 99) % 128;
            int i13 = i12 - 4;
            completedVar.getSDKAppID = i13;
            try {
                Object[] objArr2 = {Long.valueOf(sDKTransactionID[i12] ^ sDKTransactionID[i12 % 4]), Long.valueOf(i13), Long.valueOf(getSDKTransactionID)};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(2011691457);
                if (sDKTransactionID2 == null) {
                    int maxKeyCode = 2774 - (KeyEvent.getMaxKeyCode() >> 16);
                    char c3 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 13060);
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 25;
                    byte b8 = (byte) 0;
                    byte b11 = b8;
                    j9 = 0;
                    String str$$c = $$c(b8, b11, b11);
                    Class cls = Long.TYPE;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(maxKeyCode, c3, scrollBarSize, -1416626223, false, str$$c, new Class[]{cls, cls, cls});
                } else {
                    j9 = 0;
                }
                sDKTransactionID[i12] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {completedVar, completedVar};
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-721583866);
                if (sDKTransactionID3 == null) {
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(407 - TextUtils.lastIndexOf("", '0', 0, 0), (char) Color.green(0), 31 - (SystemClock.uptimeMillis() > j9 ? 1 : (SystemClock.uptimeMillis() == j9 ? 0 : -1)), 144017174, false, "y", new Class[]{Object.class, Object.class});
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
        $$a = new byte[]{123, 97, -37, -69};
        $$b = 252;
    }

    @Override // atd.z.getTransactionID
    @Nullable
    public final Boolean getDeviceData() throws Throwable {
        WifiManager wifiManager;
        Application application = this.getDeviceData;
        Object[] objArr = new Object[1];
        a("싥\ue779绛슒䛂骸藭㹓", KeyEvent.normalizeMetaState(0), objArr);
        Object systemService = application.getSystemService(((String) objArr[0]).intern());
        if (systemService instanceof WifiManager) {
            AuthenticationRequestParameters = (getSDKAppID + 75) % 128;
            wifiManager = (WifiManager) systemService;
        } else {
            wifiManager = null;
        }
        if (wifiManager == null) {
            return null;
        }
        int i11 = getSDKAppID + 55;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return Boolean.valueOf(wifiManager.isDeviceToApRttSupported());
        }
        wifiManager.isDeviceToApRttSupported();
        throw null;
    }
}
