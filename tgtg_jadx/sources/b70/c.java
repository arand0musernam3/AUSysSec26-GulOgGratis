package b70;

import a3.n2;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.UserNotAuthenticatedException;
import android.util.CloseGuard;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements m1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6058a;

    public c(int i11) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        switch (i11) {
            case 1:
                this.f6058a = new CloseGuard();
                break;
            default:
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                this.f6058a = keyStore;
                break;
        }
    }

    public static a b(Cipher cipher, String str) throws BadPaddingException, IllegalBlockSizeException {
        cipher.getClass();
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        byte[] bArrDoFinal = cipher.doFinal(bytes);
        byte[] iv2 = cipher.getIV();
        iv2.getClass();
        bArrDoFinal.getClass();
        return new a(iv2, bArrDoFinal);
    }

    @Override // m1.b
    public void a() {
        ((CloseGuard) this.f6058a).warnIfOpen();
    }

    @Override // m1.b
    public void c() {
        ((CloseGuard) this.f6058a).open("close");
    }

    @Override // m1.b
    public void close() {
        ((CloseGuard) this.f6058a).close();
    }

    public b d(String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, KeyStoreException, NoSuchProviderException, UnrecoverableEntryException, InvalidAlgorithmParameterException {
        SecretKey secretKeyE = e(str);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        try {
            cipher.init(1, secretKeyE);
            return new b(cipher, false, new au.a(14));
        } catch (UserNotAuthenticatedException unused) {
            cipher.getClass();
            return new b(cipher, true, new n2(24, cipher, secretKeyE));
        }
    }

    public SecretKey e(String str) throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException, UnrecoverableEntryException, InvalidAlgorithmParameterException {
        KeyStore.Entry entry = ((KeyStore) this.f6058a).getEntry("payment_biometric_aes_".concat(str), null);
        KeyStore.SecretKeyEntry secretKeyEntry = entry instanceof KeyStore.SecretKeyEntry ? (KeyStore.SecretKeyEntry) entry : null;
        if (secretKeyEntry != null) {
            SecretKey secretKey = secretKeyEntry.getSecretKey();
            secretKey.getClass();
            return secretKey;
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        KeyGenParameterSpec.Builder userAuthenticationRequired = new KeyGenParameterSpec.Builder("payment_biometric_aes_".concat(str), 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).setRandomizedEncryptionRequired(true).setUserAuthenticationRequired(true);
        if (Build.VERSION.SDK_INT >= 30) {
            userAuthenticationRequired.setUserAuthenticationParameters(0, 2);
        } else {
            userAuthenticationRequired.setUserAuthenticationValidityDurationSeconds(0);
        }
        userAuthenticationRequired.setInvalidatedByBiometricEnrollment(true);
        KeyGenParameterSpec keyGenParameterSpecBuild = userAuthenticationRequired.build();
        keyGenParameterSpecBuild.getClass();
        keyGenerator.init(keyGenParameterSpecBuild);
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        secretKeyGenerateKey.getClass();
        return secretKeyGenerateKey;
    }
}
