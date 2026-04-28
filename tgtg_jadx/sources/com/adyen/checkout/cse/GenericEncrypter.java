package com.adyen.checkout.cse;

import com.adyen.checkout.cse.internal.BaseGenericEncryptor;
import com.adyen.checkout.cse.internal.GenericEncryptorFactory;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0006JC\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062.\u0010\u000b\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r0\f\"\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/adyen/checkout/cse/GenericEncrypter;", "", "()V", "encryptor", "Lcom/adyen/checkout/cse/internal/BaseGenericEncryptor;", "encryptField", "", "fieldKeyToEncrypt", "fieldValueToEncrypt", "publicKey", "encryptFields", "fieldsToEncrypt", "", "Lkotlin/Pair;", "(Ljava/lang/String;[Lkotlin/Pair;)Ljava/lang/String;", "cse_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GenericEncrypter {

    @NotNull
    public static final GenericEncrypter INSTANCE = new GenericEncrypter();

    @NotNull
    private static final BaseGenericEncryptor encryptor = GenericEncryptorFactory.INSTANCE.provide();

    private GenericEncrypter() {
    }

    @NotNull
    public final String encryptField(@NotNull String fieldKeyToEncrypt, @Nullable Object fieldValueToEncrypt, @NotNull String publicKey) throws EncryptionException {
        fieldKeyToEncrypt.getClass();
        publicKey.getClass();
        return encryptor.encryptField(fieldKeyToEncrypt, fieldValueToEncrypt, publicKey);
    }

    @NotNull
    public final String encryptFields(@NotNull String publicKey, @NotNull Pair<String, ? extends Object>... fieldsToEncrypt) throws EncryptionException {
        publicKey.getClass();
        fieldsToEncrypt.getClass();
        return encryptor.encryptFields(publicKey, (Pair[]) Arrays.copyOf(fieldsToEncrypt, fieldsToEncrypt.length));
    }
}
