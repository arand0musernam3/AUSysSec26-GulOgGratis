package com.adyen.checkout.components.core.internal.analytics;

import com.adyen.checkout.components.core.internal.util.CheckoutPlatform;
import com.adyen.checkout.components.core.internal.util.CheckoutPlatformParams;
import e40.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u000b\u001a\u00020\f*\u00020\rH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0011\u0010\u0006\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsPlatformParams;", "", "()V", "channel", "", "getChannel$annotations", "platform", "getPlatform", "()Ljava/lang/String;", "version", "getVersion", "toAnalyticsPlatform", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsPlatform;", "Lcom/adyen/checkout/components/core/internal/util/CheckoutPlatform;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AnalyticsPlatformParams {

    @NotNull
    public static final AnalyticsPlatformParams INSTANCE = new AnalyticsPlatformParams();

    @NotNull
    public static final String channel = "android";

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CheckoutPlatform.values().length];
            try {
                iArr[CheckoutPlatform.ANDROID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckoutPlatform.FLUTTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckoutPlatform.REACT_NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private AnalyticsPlatformParams() {
    }

    private final AnalyticsPlatform toAnalyticsPlatform(CheckoutPlatform checkoutPlatform) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[checkoutPlatform.ordinal()];
        if (i11 == 1) {
            return AnalyticsPlatform.ANDROID;
        }
        if (i11 == 2) {
            return AnalyticsPlatform.FLUTTER;
        }
        if (i11 == 3) {
            return AnalyticsPlatform.REACT_NATIVE;
        }
        a.f();
        return null;
    }

    @NotNull
    public final String getPlatform() {
        return toAnalyticsPlatform(CheckoutPlatformParams.INSTANCE.getPlatform()).getValue();
    }

    @NotNull
    public final String getVersion() {
        return CheckoutPlatformParams.INSTANCE.getVersion();
    }

    public static /* synthetic */ void getChannel$annotations() {
    }
}
