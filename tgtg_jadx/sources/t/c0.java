package t;

import android.app.KeyguardManager;
import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {
    public static KeyguardManager a(@NonNull Context context) {
        return (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    public static boolean b(@NonNull KeyguardManager keyguardManager) {
        return keyguardManager.isDeviceSecure();
    }
}
