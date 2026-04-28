package atd.e;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.adyen.threeds2.ThreeDS2Service;
import com.adyen.threeds2.customization.UiCustomization;
import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface ChallengeResultError extends ThreeDS2Service {
    public static final ChallengeResultError getDeviceData;

    static {
        try {
            Object sDKTransactionID = ChallengeResult.getSDKTransactionID(-1109983403);
            if (sDKTransactionID == null) {
                sDKTransactionID = ChallengeResult.getDeviceData(TextUtils.lastIndexOf("", '0', 0) + 116, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 30759), 32 - KeyEvent.getDeadChar(0, 0), 1639905605, false, null, new Class[0]);
            }
            getDeviceData = (ChallengeResultError) ((Constructor) sDKTransactionID).newInstance(null);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    atd.ap.getDeviceData getDeviceData();

    UiCustomization getSDKAppID();
}
