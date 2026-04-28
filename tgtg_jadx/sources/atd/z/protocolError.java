package atd.z;

import android.app.Application;
import android.graphics.Color;
import android.graphics.PointF;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/SixGhzBandWifiFeatureSupport;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiFeatureSupport;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "isSupported", "", "()Ljava/lang/Boolean;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class protocolError implements getTransactionID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AuthenticationRequestParameters;
    private static int ChallengeResultCancelled;
    private static char getDeviceData;
    private static char getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static char getSDKReferenceNumber;

    @NotNull
    private final Application getSDKTransactionID;

    private static String $$c(int i11, int i12, int i13) {
        byte[] bArr = $$a;
        int i14 = i12 * 2;
        int i15 = (i13 * 3) + 66;
        int i16 = 4 - (i11 * 4);
        byte[] bArr2 = new byte[1 - i14];
        int i17 = 0 - i14;
        int i18 = -1;
        if (bArr == null) {
            i15 = (-i15) + i17;
            i16++;
            bArr = bArr;
            i18 = -1;
        }
        while (true) {
            int i19 = i18 + 1;
            bArr2[i19] = (byte) i15;
            if (i19 == i17) {
                return new String(bArr2, 0);
            }
            i15 = (-bArr[i16]) + i15;
            i16++;
            bArr = bArr;
            i18 = i19;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        ChallengeResultCancelled = 1;
        getSDKAppID = (char) 4970;
        getDeviceData = (char) 23669;
        getSDKReferenceNumber = (char) 30293;
        AuthenticationRequestParameters = (char) 48149;
    }

    public protocolError(@NotNull Application application) {
        application.getClass();
        this.getSDKTransactionID = application;
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        int i13;
        int i14;
        if (str != null) {
            $10 = ($11 + 39) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        atd.bb.ChallengeResultCompleted challengeResultCompleted = new atd.bb.ChallengeResultCompleted();
        char[] cArr2 = new char[cArr.length];
        int i15 = 0;
        challengeResultCompleted.getDeviceData = 0;
        int i16 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i17 = challengeResultCompleted.getDeviceData;
            if (i17 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i11);
                return;
            }
            cArr3[i15] = cArr[i17];
            char c3 = 1;
            cArr3[1] = cArr[i17 + 1];
            $11 = ($10 + 39) % 128;
            int i18 = 58224;
            int i19 = i15;
            while (i19 < 16) {
                $11 = ($10 + 33) % 128;
                char c7 = cArr3[c3];
                char c8 = cArr3[i15];
                char c11 = c3;
                int i21 = (c8 + i18) ^ ((c8 << 4) + ((char) (((long) getSDKReferenceNumber) ^ 5320350835299930193L)));
                int i22 = c8 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(AuthenticationRequestParameters);
                    objArr2[i16] = Integer.valueOf(i22);
                    objArr2[c11] = Integer.valueOf(i21);
                    objArr2[i15] = Integer.valueOf(c7);
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(906025703);
                    Class cls = Integer.TYPE;
                    if (sDKTransactionID == null) {
                        i14 = 906025703;
                        byte b8 = (byte) i15;
                        i13 = i16;
                        byte b11 = b8;
                        i12 = i15;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(ExpandableListView.getPackedPositionGroup(0L) + 2828, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), Color.argb(i15, i15, i15, i15) + 27, -362226441, false, $$c(b8, b11, b11), new Class[]{cls, cls, cls, cls});
                    } else {
                        i12 = i15;
                        i13 = i16;
                        i14 = 906025703;
                    }
                    char cCharValue = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    cArr3[c11] = cCharValue;
                    char c12 = cArr3[i12];
                    int i23 = (cCharValue + i18) ^ ((cCharValue << 4) + ((char) (((long) getSDKAppID) ^ 5320350835299930193L)));
                    int i24 = cCharValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(getDeviceData);
                    objArr3[i13] = Integer.valueOf(i24);
                    objArr3[c11] = Integer.valueOf(i23);
                    objArr3[i12] = Integer.valueOf(c12);
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i14);
                    if (sDKTransactionID2 == null) {
                        byte b12 = (byte) i12;
                        byte b13 = b12;
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(KeyEvent.normalizeMetaState(i12) + 2828, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 28 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -362226441, false, $$c(b12, b13, b13), new Class[]{cls, cls, cls, cls});
                    }
                    cArr3[0] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                    i18 -= 40503;
                    i19++;
                    c3 = c11;
                    i16 = i13;
                    i15 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i25 = i16;
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
                byte b15 = b14;
                sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(3155 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (25798 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 27 - View.resolveSizeAndState(0, 0, 0), 1296942946, false, $$c(b14, b15, (byte) (b15 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID3).invoke(null, objArr4);
            i16 = i25;
            i15 = 0;
        }
    }

    public static void init$0() {
        $$a = new byte[]{53, -94, 71, -95};
        $$b = 51;
    }

    @Override // atd.z.getTransactionID
    @Nullable
    public final Boolean getDeviceData() throws Throwable {
        getSDKEphemeralPublicKey = (ChallengeResultCancelled + 115) % 128;
        Application application = this.getSDKTransactionID;
        Object[] objArr = new Object[1];
        a("㣭\uf484硞讫", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4, objArr);
        Object systemService = application.getSystemService(((String) objArr[0]).intern());
        WifiManager wifiManager = systemService instanceof WifiManager ? (WifiManager) systemService : null;
        if (wifiManager == null) {
            return null;
        }
        ChallengeResultCancelled = (getSDKEphemeralPublicKey + 29) % 128;
        Boolean boolValueOf = Boolean.valueOf(wifiManager.is6GHzBandSupported());
        ChallengeResultCancelled = (getSDKEphemeralPublicKey + 5) % 128;
        return boolValueOf;
    }
}
