package com.adyen.checkout.components.core.internal.analytics;

import com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/CheckoutAttemptIdState;", "", "()V", "Available", "Failed", "NotAvailable", "Lcom/adyen/checkout/components/core/internal/analytics/CheckoutAttemptIdState$Available;", "Lcom/adyen/checkout/components/core/internal/analytics/CheckoutAttemptIdState$Failed;", "Lcom/adyen/checkout/components/core/internal/analytics/CheckoutAttemptIdState$NotAvailable;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class CheckoutAttemptIdState {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/CheckoutAttemptIdState$Available;", "Lcom/adyen/checkout/components/core/internal/analytics/CheckoutAttemptIdState;", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, "", "(Ljava/lang/String;)V", "getCheckoutAttemptId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Available extends CheckoutAttemptIdState {

        @NotNull
        private final String checkoutAttemptId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Available(@NotNull String str) {
            super(null);
            str.getClass();
            this.checkoutAttemptId = str;
        }

        public static /* synthetic */ Available copy$default(Available available, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = available.checkoutAttemptId;
            }
            return available.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCheckoutAttemptId() {
            return this.checkoutAttemptId;
        }

        @NotNull
        public final Available copy(@NotNull String checkoutAttemptId) {
            checkoutAttemptId.getClass();
            return new Available(checkoutAttemptId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Available) && Intrinsics.areEqual(this.checkoutAttemptId, ((Available) other).checkoutAttemptId);
        }

        @NotNull
        public final String getCheckoutAttemptId() {
            return this.checkoutAttemptId;
        }

        public int hashCode() {
            return this.checkoutAttemptId.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("Available(checkoutAttemptId=", this.checkoutAttemptId, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/CheckoutAttemptIdState$Failed;", "Lcom/adyen/checkout/components/core/internal/analytics/CheckoutAttemptIdState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Failed extends CheckoutAttemptIdState {

        @NotNull
        public static final Failed INSTANCE = new Failed();

        private Failed() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Failed);
        }

        public int hashCode() {
            return -1655336858;
        }

        @NotNull
        public String toString() {
            return "Failed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/CheckoutAttemptIdState$NotAvailable;", "Lcom/adyen/checkout/components/core/internal/analytics/CheckoutAttemptIdState;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NotAvailable extends CheckoutAttemptIdState {

        @NotNull
        public static final NotAvailable INSTANCE = new NotAvailable();

        private NotAvailable() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof NotAvailable);
        }

        public int hashCode() {
            return 418051743;
        }

        @NotNull
        public String toString() {
            return "NotAvailable";
        }
    }

    public /* synthetic */ CheckoutAttemptIdState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CheckoutAttemptIdState() {
    }
}
