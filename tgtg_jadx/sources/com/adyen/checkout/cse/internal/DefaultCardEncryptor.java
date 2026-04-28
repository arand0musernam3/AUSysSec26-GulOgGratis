package com.adyen.checkout.cse.internal;

import com.adyen.checkout.cse.EncryptedCard;
import com.adyen.checkout.cse.EncryptionException;
import com.adyen.checkout.cse.UnencryptedCard;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/adyen/checkout/cse/internal/DefaultCardEncryptor;", "Lcom/adyen/checkout/cse/internal/BaseCardEncryptor;", "genericEncryptor", "Lcom/adyen/checkout/cse/internal/BaseGenericEncryptor;", "(Lcom/adyen/checkout/cse/internal/BaseGenericEncryptor;)V", "encrypt", "", "unencryptedCard", "Lcom/adyen/checkout/cse/UnencryptedCard;", "publicKey", "encryptBin", "bin", "encryptFields", "Lcom/adyen/checkout/cse/EncryptedCard;", "Companion", "cse_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultCardEncryptor implements BaseCardEncryptor {

    @NotNull
    private static final String BIN_KEY = "binValue";

    @NotNull
    private static final String CARD_NUMBER_KEY = "number";

    @NotNull
    private static final String CVC_KEY = "cvc";

    @NotNull
    private static final String EXPIRY_MONTH_KEY = "expiryMonth";

    @NotNull
    private static final String EXPIRY_YEAR_KEY = "expiryYear";

    @NotNull
    private static final String HOLDER_NAME_KEY = "holderName";

    @NotNull
    private final BaseGenericEncryptor genericEncryptor;

    public DefaultCardEncryptor(@NotNull BaseGenericEncryptor baseGenericEncryptor) {
        baseGenericEncryptor.getClass();
        this.genericEncryptor = baseGenericEncryptor;
    }

    @Override // com.adyen.checkout.cse.internal.BaseCardEncryptor
    @NotNull
    public String encrypt(@NotNull UnencryptedCard unencryptedCard, @NotNull String publicKey) {
        unencryptedCard.getClass();
        publicKey.getClass();
        return this.genericEncryptor.encryptFields(publicKey, new Pair("number", unencryptedCard.getNumber()), new Pair(EXPIRY_MONTH_KEY, unencryptedCard.getExpiryMonth()), new Pair(EXPIRY_YEAR_KEY, unencryptedCard.getExpiryYear()), new Pair(CVC_KEY, unencryptedCard.getCvc()), new Pair(HOLDER_NAME_KEY, unencryptedCard.getCardHolderName()));
    }

    @Override // com.adyen.checkout.cse.internal.BaseCardEncryptor
    @NotNull
    public String encryptBin(@NotNull String bin, @NotNull String publicKey) {
        bin.getClass();
        publicKey.getClass();
        return this.genericEncryptor.encryptField(BIN_KEY, bin, publicKey);
    }

    @Override // com.adyen.checkout.cse.internal.BaseCardEncryptor
    @NotNull
    public EncryptedCard encryptFields(@NotNull UnencryptedCard unencryptedCard, @NotNull String publicKey) {
        String strEncryptField;
        String strEncryptField2;
        unencryptedCard.getClass();
        publicKey.getClass();
        try {
            String number = unencryptedCard.getNumber();
            String strEncryptField3 = number != null ? this.genericEncryptor.encryptField("number", number, publicKey) : null;
            if (unencryptedCard.getExpiryMonth() != null && unencryptedCard.getExpiryYear() != null) {
                strEncryptField = this.genericEncryptor.encryptField(EXPIRY_MONTH_KEY, unencryptedCard.getExpiryMonth(), publicKey);
                strEncryptField2 = this.genericEncryptor.encryptField(EXPIRY_YEAR_KEY, unencryptedCard.getExpiryYear(), publicKey);
            } else {
                if (unencryptedCard.getExpiryMonth() != null || unencryptedCard.getExpiryYear() != null) {
                    throw new EncryptionException("Both expiryMonth and expiryYear need to be set for encryption.", null);
                }
                strEncryptField = null;
                strEncryptField2 = null;
            }
            String cvc = unencryptedCard.getCvc();
            return new EncryptedCard(strEncryptField3, strEncryptField, strEncryptField2, cvc != null ? this.genericEncryptor.encryptField(CVC_KEY, cvc, publicKey) : null);
        } catch (IllegalStateException e5) {
            String message = e5.getMessage();
            if (message == null) {
                message = "No message.";
            }
            throw new EncryptionException(message, e5);
        }
    }
}
