package com.adyen.checkout.core.internal.util;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/adyen/checkout/core/internal/util/Sha256;", "", "()V", "SHA_256", "", "digest", "Ljava/security/MessageDigest;", "kotlin.jvm.PlatformType", "hash", "", "byteArray", "hashString", "string", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Sha256 {

    @NotNull
    private static final String SHA_256 = "SHA-256";

    @NotNull
    public static final Sha256 INSTANCE = new Sha256();
    private static final MessageDigest digest = MessageDigest.getInstance("SHA-256");

    private Sha256() {
    }

    private final byte[] hash(byte[] byteArray) {
        MessageDigest messageDigest = digest;
        messageDigest.reset();
        messageDigest.update(byteArray);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return bArrDigest;
    }

    @NotNull
    public final String hashString(@NotNull String string) {
        string.getClass();
        Charset charset = Charsets.UTF_8;
        byte[] bytes = string.getBytes(charset);
        bytes.getClass();
        return new String(hash(bytes), charset);
    }
}
