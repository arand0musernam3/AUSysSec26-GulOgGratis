package com.adyen.checkout.cse.internal;

import f80.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\u0006H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/cse/internal/Base64String;", "", "bytes", "", "([B)V", "value", "", "getValue", "()Ljava/lang/String;", "toString", "cse_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Base64String {

    @NotNull
    private final String value;

    public Base64String(@NotNull byte[] bArr) {
        bArr.getClass();
        c.f17515f.getClass();
        this.value = c.b(c.f17517h, bArr);
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public String toString() {
        return this.value;
    }
}
