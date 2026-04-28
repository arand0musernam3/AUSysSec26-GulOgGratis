package com.adyen.checkout.components.core.internal.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007J\b\u0010\u000e\u001a\u00020\rH\u0007R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/adyen/checkout/components/core/internal/util/CheckoutPlatformParams;", "", "()V", "<set-?>", "Lcom/adyen/checkout/components/core/internal/util/CheckoutPlatform;", "platform", "getPlatform", "()Lcom/adyen/checkout/components/core/internal/util/CheckoutPlatform;", "", "version", "getVersion", "()Ljava/lang/String;", "overrideForCrossPlatform", "", "resetDefaults", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CheckoutPlatformParams {

    @NotNull
    public static final CheckoutPlatformParams INSTANCE = new CheckoutPlatformParams();

    @NotNull
    private static CheckoutPlatform platform = CheckoutPlatform.ANDROID;

    @NotNull
    private static String version = "5.17.0";

    private CheckoutPlatformParams() {
    }

    @NotNull
    public final CheckoutPlatform getPlatform() {
        return platform;
    }

    @NotNull
    public final String getVersion() {
        return version;
    }

    public final void overrideForCrossPlatform(@NotNull CheckoutPlatform platform2, @NotNull String version2) {
        platform2.getClass();
        version2.getClass();
        platform = platform2;
        version = version2;
    }

    public final void resetDefaults() {
        platform = CheckoutPlatform.ANDROID;
        version = "5.17.0";
    }
}
