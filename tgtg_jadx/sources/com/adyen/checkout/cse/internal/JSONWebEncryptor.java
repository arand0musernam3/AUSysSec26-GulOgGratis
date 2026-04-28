package com.adyen.checkout.cse.internal;

import com.adyen.checkout.cse.EncryptionException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0016\u0010\u0005\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u0011\u001a\u00020\nH\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\bH\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\fH\u0002J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u0010H\u0002J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/adyen/checkout/cse/internal/JSONWebEncryptor;", "", "()V", "keyFactory", "Ljava/security/KeyFactory;", "encrypt", "Lcom/adyen/checkout/cse/internal/JWEObject;", "payload", "", "contentKey", "Ljavax/crypto/SecretKey;", "encryptedKey", "Lcom/adyen/checkout/cse/internal/Base64String;", "publicKey", "encryptContentEncryptionKey", "", "Ljava/security/PublicKey;", "generateContentEncryptionKey", "generateInitializationVector", "generatePublicKey", "getAESCipher", "Ljavax/crypto/Cipher;", "secretKey", "iv", "getAdditionalAuthenticationData", "encodedHeader", "getRSACipher", "serialize", "jweObject", "Companion", "cse_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class JSONWebEncryptor {

    @NotNull
    private static final String AES_ALGORITHM = "AES";

    @NotNull
    private static final String AES_GCM_CIPHER = "AES/GCM/NoPadding";
    private static final int AUTH_TAG_LENGTH = 16;
    private static final int BITES_IN_BYTE = 8;
    private static final int CONTENT_ENCRYPTION_KEY_BYTES = 32;

    @NotNull
    private static final JSONObject HEADER;
    private static final int INITIALIZATION_VECTOR_BYTES = 12;

    @NotNull
    private static final String MGF_NAME = "MGF1";

    @NotNull
    private static final String OAEP_ALGORITHM = "OAEP";
    private static final int RADIX = 16;

    @NotNull
    private static final String RSA_ALGORITHM = "RSA";

    @NotNull
    private static final String RSA_OAEP_CIPHER = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";

    @NotNull
    private final KeyFactory keyFactory;

    static {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", "RSA-OAEP-256");
        jSONObject.put("enc", "A256GCM");
        jSONObject.put("version", "1");
        HEADER = jSONObject;
    }

    public JSONWebEncryptor() {
        try {
            KeyFactory keyFactory = KeyFactory.getInstance(RSA_ALGORITHM);
            keyFactory.getClass();
            this.keyFactory = keyFactory;
        } catch (NoSuchAlgorithmException e5) {
            throw new EncryptionException("RSA KeyFactory not found", e5);
        }
    }

    private final JWEObject encrypt(String payload, SecretKey contentKey, Base64String encryptedKey) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, InvalidAlgorithmParameterException {
        String string = HEADER.toString();
        string.getClass();
        Charset charset = Charsets.UTF_8;
        byte[] bytes = string.getBytes(charset);
        bytes.getClass();
        Base64String base64String = new Base64String(bytes);
        byte[] additionalAuthenticationData = getAdditionalAuthenticationData(base64String);
        byte[] bArrGenerateInitializationVector = generateInitializationVector();
        Cipher aESCipher = getAESCipher(contentKey, bArrGenerateInitializationVector);
        aESCipher.updateAAD(additionalAuthenticationData);
        byte[] bytes2 = payload.getBytes(charset);
        bytes2.getClass();
        byte[] bArrDoFinal = aESCipher.doFinal(bytes2);
        int length = bArrDoFinal.length - 16;
        return new JWEObject(base64String, encryptedKey, new Base64String(bArrGenerateInitializationVector), new Base64String(x.k(bArrDoFinal, 0, length)), new Base64String(x.k(bArrDoFinal, length, bArrDoFinal.length)));
    }

    private final byte[] encryptContentEncryptionKey(PublicKey publicKey, SecretKey contentKey) throws BadPaddingException, NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            byte[] bArrDoFinal = getRSACipher(publicKey).doFinal(contentKey.getEncoded());
            bArrDoFinal.getClass();
            return bArrDoFinal;
        } catch (IllegalBlockSizeException e5) {
            throw new EncryptionException("The RSA key is invalid", e5);
        }
    }

    private final SecretKey generateContentEncryptionKey() {
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        return new SecretKeySpec(bArr, AES_ALGORITHM);
    }

    private final byte[] generateInitializationVector() {
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    private final PublicKey generatePublicKey(String publicKey) {
        List listSplit$default = StringsKt__StringsKt.split$default(publicKey, new String[]{"|"}, false, 0, 6, null);
        try {
            PublicKey publicKeyGeneratePublic = this.keyFactory.generatePublic(new RSAPublicKeySpec(new BigInteger((String) listSplit$default.get(1), 16), new BigInteger((String) listSplit$default.get(0), 16)));
            publicKeyGeneratePublic.getClass();
            return publicKeyGeneratePublic;
        } catch (InvalidKeySpecException e5) {
            throw new EncryptionException("Problem reading public key", e5);
        }
    }

    private final Cipher getAESCipher(SecretKey secretKey, byte[] iv2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getEncoded(), AES_ALGORITHM);
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, iv2);
        try {
            Cipher cipher = Cipher.getInstance(AES_GCM_CIPHER);
            cipher.init(1, secretKeySpec, gCMParameterSpec);
            return cipher;
        } catch (NoSuchAlgorithmException e5) {
            throw new EncryptionException("Problem instantiating AES/GCM/NoPadding Algorithm", e5);
        } catch (NoSuchPaddingException e11) {
            throw new EncryptionException("Problem instantiating AES/GCM/NoPadding Padding", e11);
        }
    }

    private final byte[] getAdditionalAuthenticationData(Base64String encodedHeader) {
        byte[] bytes = encodedHeader.getValue().getBytes(Charsets.f26580d);
        bytes.getClass();
        return bytes;
    }

    private final Cipher getRSACipher(PublicKey publicKey) throws NoSuchAlgorithmException, InvalidParameterSpecException, InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(OAEP_ALGORITHM);
        MGF1ParameterSpec mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        algorithmParameters.init(new OAEPParameterSpec(mGF1ParameterSpec.getDigestAlgorithm(), MGF_NAME, mGF1ParameterSpec, PSource.PSpecified.DEFAULT));
        try {
            Cipher cipher = Cipher.getInstance(RSA_OAEP_CIPHER);
            cipher.init(1, publicKey, algorithmParameters);
            return cipher;
        } catch (NoSuchAlgorithmException e5) {
            throw new EncryptionException("Problem instantiating RSA/ECB/OAEPWithSHA-256AndMGF1Padding Algorithm", e5);
        } catch (NoSuchPaddingException e11) {
            throw new EncryptionException("Problem instantiating RSA/ECB/OAEPWithSHA-256AndMGF1Padding Padding", e11);
        }
    }

    private final String serialize(JWEObject jweObject) {
        return jweObject.getHeader() + "." + jweObject.getEncryptedKey() + "." + jweObject.getInitializationVector() + "." + jweObject.getCipherText() + "." + jweObject.getAuthTag();
    }

    @NotNull
    public final String encrypt(@NotNull String publicKey, @NotNull String payload) {
        publicKey.getClass();
        payload.getClass();
        if (ValidationUtils.isPublicKeyValid(publicKey)) {
            PublicKey publicKeyGeneratePublicKey = generatePublicKey(publicKey);
            SecretKey secretKeyGenerateContentEncryptionKey = generateContentEncryptionKey();
            return serialize(encrypt(payload, secretKeyGenerateContentEncryptionKey, new Base64String(encryptContentEncryptionKey(publicKeyGeneratePublicKey, secretKeyGenerateContentEncryptionKey))));
        }
        throw new EncryptionException("Invalid public key", null);
    }
}
