package com.adyen.checkout.cse.internal;

import com.adyen.checkout.cse.EncryptedCard;
import com.adyen.checkout.cse.UnencryptedCard;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/cse/internal/BaseCardEncryptor;", "", "encrypt", "", "unencryptedCard", "Lcom/adyen/checkout/cse/UnencryptedCard;", "publicKey", "encryptBin", "bin", "encryptFields", "Lcom/adyen/checkout/cse/EncryptedCard;", "cse_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface BaseCardEncryptor {
    @NotNull
    String encrypt(@NotNull UnencryptedCard unencryptedCard, @NotNull String publicKey);

    @NotNull
    String encryptBin(@NotNull String bin, @NotNull String publicKey);

    @NotNull
    EncryptedCard encryptFields(@NotNull UnencryptedCard unencryptedCard, @NotNull String publicKey);
}
