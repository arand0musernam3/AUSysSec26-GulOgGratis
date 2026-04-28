package com.adyen.checkout.components.core.internal;

import androidx.lifecycle.c1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R(\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/components/core/internal/PaymentDataRepository;", "", "Landroidx/lifecycle/c1;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/c1;)V", "Landroidx/lifecycle/c1;", "", "paymentData", "getPaymentData", "()Ljava/lang/String;", "setPaymentData", "(Ljava/lang/String;)V", "getNativeRedirectData", "setNativeRedirectData", "nativeRedirectData", "Companion", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PaymentDataRepository {

    @NotNull
    private static final String NATIVE_REDIRECT_DATA = "native_redirect_data";

    @NotNull
    private static final String PAYMENT_DATA_KEY = "payment_data";

    @NotNull
    private final c1 savedStateHandle;

    public PaymentDataRepository(@NotNull c1 c1Var) {
        c1Var.getClass();
        this.savedStateHandle = c1Var;
    }

    @Nullable
    public final String getNativeRedirectData() {
        return (String) this.savedStateHandle.a(NATIVE_REDIRECT_DATA);
    }

    @Nullable
    public final String getPaymentData() {
        return (String) this.savedStateHandle.a(PAYMENT_DATA_KEY);
    }

    public final void setNativeRedirectData(@Nullable String str) {
        this.savedStateHandle.d(str, NATIVE_REDIRECT_DATA);
    }

    public final void setPaymentData(@Nullable String str) {
        this.savedStateHandle.d(str, PAYMENT_DATA_KEY);
    }
}
