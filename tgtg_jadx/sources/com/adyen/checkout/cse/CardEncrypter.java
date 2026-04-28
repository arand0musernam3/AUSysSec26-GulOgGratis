package com.adyen.checkout.cse;

import com.adyen.checkout.cse.internal.BaseCardEncryptor;
import com.adyen.checkout.cse.internal.CardEncryptorFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/adyen/checkout/cse/CardEncrypter;", "", "()V", "encryptor", "Lcom/adyen/checkout/cse/internal/BaseCardEncryptor;", "encrypt", "", "unencryptedCard", "Lcom/adyen/checkout/cse/UnencryptedCard;", "publicKey", "encryptBin", "bin", "encryptFields", "Lcom/adyen/checkout/cse/EncryptedCard;", "cse_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardEncrypter {

    @NotNull
    public static final CardEncrypter INSTANCE = new CardEncrypter();

    @NotNull
    private static final BaseCardEncryptor encryptor = CardEncryptorFactory.INSTANCE.provide();

    private CardEncrypter() {
    }

    @NotNull
    public final String encrypt(@NotNull UnencryptedCard unencryptedCard, @NotNull String publicKey) throws EncryptionException {
        unencryptedCard.getClass();
        publicKey.getClass();
        return encryptor.encrypt(unencryptedCard, publicKey);
    }

    @NotNull
    public final String encryptBin(@NotNull String bin, @NotNull String publicKey) throws EncryptionException {
        bin.getClass();
        publicKey.getClass();
        return encryptor.encryptBin(bin, publicKey);
    }

    @NotNull
    public final EncryptedCard encryptFields(@NotNull UnencryptedCard unencryptedCard, @NotNull String publicKey) throws EncryptionException {
        unencryptedCard.getClass();
        publicKey.getClass();
        return encryptor.encryptFields(unencryptedCard, publicKey);
    }
}
