package com.adyen.checkout.ui.core.internal.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIState;", "", "()V", "isInteractionBlocked", "", "Blocked", "Idle", "PendingSubmit", "Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIState$Blocked;", "Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIState$Idle;", "Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIState$PendingSubmit;", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class PaymentComponentUIState {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIState$Blocked;", "Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIState;", "()V", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Blocked extends PaymentComponentUIState {

        @NotNull
        public static final Blocked INSTANCE = new Blocked();

        private Blocked() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIState$Idle;", "Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIState;", "()V", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Idle extends PaymentComponentUIState {

        @NotNull
        public static final Idle INSTANCE = new Idle();

        private Idle() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIState$PendingSubmit;", "Lcom/adyen/checkout/ui/core/internal/ui/PaymentComponentUIState;", "()V", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PendingSubmit extends PaymentComponentUIState {

        @NotNull
        public static final PendingSubmit INSTANCE = new PendingSubmit();

        private PendingSubmit() {
            super(null);
        }
    }

    public /* synthetic */ PaymentComponentUIState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean isInteractionBlocked() {
        return (this instanceof Blocked) || (this instanceof PendingSubmit);
    }

    private PaymentComponentUIState() {
    }
}
