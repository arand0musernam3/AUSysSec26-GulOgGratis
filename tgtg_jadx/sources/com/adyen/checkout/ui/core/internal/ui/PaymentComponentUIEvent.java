package com.adyen.checkout.ui.core.internal.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIEvent;", "", "()V", "HideKeyboard", "InvalidUI", "Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIEvent$HideKeyboard;", "Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIEvent$InvalidUI;", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class PaymentComponentUIEvent {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIEvent$HideKeyboard;", "Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIEvent;", "()V", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HideKeyboard extends PaymentComponentUIEvent {

        @NotNull
        public static final HideKeyboard INSTANCE = new HideKeyboard();

        private HideKeyboard() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIEvent$InvalidUI;", "Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIEvent;", "()V", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InvalidUI extends PaymentComponentUIEvent {

        @NotNull
        public static final InvalidUI INSTANCE = new InvalidUI();

        private InvalidUI() {
            super(null);
        }
    }

    public /* synthetic */ PaymentComponentUIEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PaymentComponentUIEvent() {
    }
}
