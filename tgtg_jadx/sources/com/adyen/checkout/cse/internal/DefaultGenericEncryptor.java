package com.adyen.checkout.cse.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.x0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\bH\u0016JE\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2.\u0010\u000e\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00100\u000f\"\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0010H\u0016¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/adyen/checkout/cse/internal/DefaultGenericEncryptor;", "Lcom/adyen/checkout/cse/internal/BaseGenericEncryptor;", "dateGenerator", "Lcom/adyen/checkout/cse/internal/DateGenerator;", "jweEncryptor", "Lcom/adyen/checkout/cse/internal/JSONWebEncryptor;", "(Lcom/adyen/checkout/cse/internal/DateGenerator;Lcom/adyen/checkout/cse/internal/JSONWebEncryptor;)V", "encryptField", "", "fieldKeyToEncrypt", "fieldValueToEncrypt", "", "publicKey", "encryptFields", "fieldsToEncrypt", "", "Lkotlin/Pair;", "(Ljava/lang/String;[Lkotlin/Pair;)Ljava/lang/String;", "cse_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultGenericEncryptor implements BaseGenericEncryptor {

    @NotNull
    private final DateGenerator dateGenerator;

    @NotNull
    private final JSONWebEncryptor jweEncryptor;

    public DefaultGenericEncryptor(@NotNull DateGenerator dateGenerator, @NotNull JSONWebEncryptor jSONWebEncryptor) {
        dateGenerator.getClass();
        jSONWebEncryptor.getClass();
        this.dateGenerator = dateGenerator;
        this.jweEncryptor = jSONWebEncryptor;
    }

    @Override // com.adyen.checkout.cse.internal.BaseGenericEncryptor
    @NotNull
    public String encryptField(@NotNull String fieldKeyToEncrypt, @Nullable Object fieldValueToEncrypt, @NotNull String publicKey) {
        fieldKeyToEncrypt.getClass();
        publicKey.getClass();
        return encryptFields(publicKey, new Pair(fieldKeyToEncrypt, fieldValueToEncrypt));
    }

    @Override // com.adyen.checkout.cse.internal.BaseGenericEncryptor
    @NotNull
    public String encryptFields(@NotNull String publicKey, @NotNull Pair<String, ? extends Object>... fieldsToEncrypt) {
        publicKey.getClass();
        fieldsToEncrypt.getClass();
        return this.jweEncryptor.encrypt(publicKey, EncryptionPlainTextGenerator.INSTANCE.generate(this.dateGenerator.getCurrentDate(), x0.e((Pair[]) Arrays.copyOf(fieldsToEncrypt, fieldsToEncrypt.length))));
    }
}
