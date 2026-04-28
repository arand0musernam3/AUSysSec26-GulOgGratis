package com.adyen.checkout.cse.internal;

import java.util.regex.Pattern;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/cse/internal/ValidationUtils;", "", "()V", "PUBLIC_KEY_PATTERN", "", "PUBLIC_KEY_SIZE", "", "isPublicKeyValid", "", "publicKey", "cse_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ValidationUtils {

    @NotNull
    public static final ValidationUtils INSTANCE = new ValidationUtils();

    @NotNull
    private static final String PUBLIC_KEY_PATTERN = "([A-F]|[0-9]){5}\\|([A-F]|[0-9]){512}";
    private static final int PUBLIC_KEY_SIZE = 518;

    private ValidationUtils() {
    }

    public static final boolean isPublicKeyValid(@NotNull String publicKey) {
        publicKey.getClass();
        return Pattern.compile(PUBLIC_KEY_PATTERN).matcher(publicKey).find() && publicKey.length() == PUBLIC_KEY_SIZE;
    }
}
