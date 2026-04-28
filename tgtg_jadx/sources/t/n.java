package t;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static int a(@NonNull BiometricManager biometricManager) {
        return biometricManager.canAuthenticate();
    }

    public static BiometricManager b(@NonNull Context context) {
        return (BiometricManager) context.getSystemService(BiometricManager.class);
    }

    public static Method c() {
        try {
            return BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
