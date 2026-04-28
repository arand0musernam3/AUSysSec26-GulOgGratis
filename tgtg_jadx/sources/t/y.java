package t;

import android.hardware.biometrics.BiometricPrompt;
import android.security.identity.IdentityCredential;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    @NonNull
    public static BiometricPrompt.CryptoObject a(@NonNull IdentityCredential identityCredential) {
        return new BiometricPrompt.CryptoObject(identityCredential);
    }

    public static IdentityCredential b(@NonNull BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getIdentityCredential();
    }
}
