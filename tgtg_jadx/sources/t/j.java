package t;

import android.hardware.biometrics.BiometricPrompt;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static void a(@NonNull BiometricPrompt.Builder builder, boolean z11) {
        builder.setConfirmationRequired(z11);
    }

    public static void b(@NonNull BiometricPrompt.Builder builder, boolean z11) {
        builder.setDeviceCredentialAllowed(z11);
    }
}
