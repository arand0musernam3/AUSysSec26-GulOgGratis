package com.adyen.checkout.cse.internal;

import com.adyen.checkout.cse.EncryptionException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/adyen/checkout/cse/internal/CompositeKey;", "", "inputKey", "Ljavax/crypto/SecretKey;", "(Ljavax/crypto/SecretKey;)V", "encKey", "getEncKey", "()Ljavax/crypto/SecretKey;", "macKey", "getMacKey", "truncatedMacLength", "", "getTruncatedMacLength", "()I", "cse_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CompositeKey {

    @NotNull
    private final SecretKey encKey;

    @NotNull
    private final SecretKey macKey;
    private final int truncatedMacLength;

    public CompositeKey(@NotNull SecretKey secretKey) {
        secretKey.getClass();
        byte[] encoded = secretKey.getEncoded();
        int length = encoded.length;
        if (length == 32) {
            this.macKey = new SecretKeySpec(encoded, 0, 16, "HMACSHA256");
            this.encKey = new SecretKeySpec(encoded, 16, 16, "AES");
            this.truncatedMacLength = 16;
        } else if (length == 48) {
            this.macKey = new SecretKeySpec(encoded, 0, 24, "HMACSHA384");
            this.encKey = new SecretKeySpec(encoded, 24, 24, "AES");
            this.truncatedMacLength = 24;
        } else {
            if (length != 64) {
                throw new EncryptionException("Unsupported key length, must be 256, 384 or 512 bits", null);
            }
            this.macKey = new SecretKeySpec(encoded, 0, 32, "HMACSHA512");
            this.encKey = new SecretKeySpec(encoded, 32, 32, "AES");
            this.truncatedMacLength = 32;
        }
    }

    @NotNull
    public final SecretKey getEncKey() {
        return this.encKey;
    }

    @NotNull
    public final SecretKey getMacKey() {
        return this.macKey;
    }

    public final int getTruncatedMacLength() {
        return this.truncatedMacLength;
    }
}
