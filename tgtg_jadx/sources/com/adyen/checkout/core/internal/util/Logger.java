package com.adyen.checkout.core.internal.util;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/adyen/checkout/core/internal/util/Logger;", "", "()V", "NONE", "", "getNONE$annotations", "SENSITIVE", "LogLevel", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Logger {

    @NotNull
    public static final Logger INSTANCE = new Logger();
    public static final int NONE = 8;
    private static final int SENSITIVE = -1;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/adyen/checkout/core/internal/util/Logger$LogLevel;", "", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    @Retention(RetentionPolicy.SOURCE)
    public @interface LogLevel {
    }

    private Logger() {
    }

    @d
    public static /* synthetic */ void getNONE$annotations() {
    }
}
