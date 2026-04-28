package t;

import android.hardware.biometrics.BiometricPrompt;
import androidx.annotation.NonNull;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    @NonNull
    public static BiometricPrompt.CryptoObject a(@NonNull Signature signature) {
        return new BiometricPrompt.CryptoObject(signature);
    }

    @NonNull
    public static BiometricPrompt.CryptoObject b(@NonNull Cipher cipher) {
        return new BiometricPrompt.CryptoObject(cipher);
    }

    @NonNull
    public static BiometricPrompt.CryptoObject c(@NonNull Mac mac) {
        return new BiometricPrompt.CryptoObject(mac);
    }

    public static Cipher d(@NonNull BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getCipher();
    }

    public static Mac e(@NonNull BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getMac();
    }

    public static Signature f(@NonNull BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getSignature();
    }
}
