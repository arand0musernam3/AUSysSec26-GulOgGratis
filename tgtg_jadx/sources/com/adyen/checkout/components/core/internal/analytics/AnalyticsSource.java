package com.adyen.checkout.components.core.internal.analytics;

import com.adyen.checkout.components.core.action.Action;
import e0.f;
import e40.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.c0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsSource;", "", "()V", "getPaymentMethods", "", "", "DropIn", "PaymentComponent", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsSource$DropIn;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsSource$PaymentComponent;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AnalyticsSource {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsSource$DropIn;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsSource;", "paymentMethodList", "", "", "(Ljava/util/List;)V", "getPaymentMethodList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DropIn extends AnalyticsSource {

        @NotNull
        private final List<String> paymentMethodList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DropIn(@NotNull List<String> list) {
            super(null);
            list.getClass();
            this.paymentMethodList = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DropIn copy$default(DropIn dropIn, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = dropIn.paymentMethodList;
            }
            return dropIn.copy(list);
        }

        @NotNull
        public final List<String> component1() {
            return this.paymentMethodList;
        }

        @NotNull
        public final DropIn copy(@NotNull List<String> paymentMethodList) {
            paymentMethodList.getClass();
            return new DropIn(paymentMethodList);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DropIn) && Intrinsics.areEqual(this.paymentMethodList, ((DropIn) other).paymentMethodList);
        }

        @NotNull
        public final List<String> getPaymentMethodList() {
            return this.paymentMethodList;
        }

        public int hashCode() {
            return this.paymentMethodList.hashCode();
        }

        @NotNull
        public String toString() {
            return f.m("DropIn(paymentMethodList=", ")", this.paymentMethodList);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsSource$PaymentComponent;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsSource;", Action.PAYMENT_METHOD_TYPE, "", "(Ljava/lang/String;)V", "getPaymentMethodType", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PaymentComponent extends AnalyticsSource {

        @NotNull
        private final String paymentMethodType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentComponent(@NotNull String str) {
            super(null);
            str.getClass();
            this.paymentMethodType = str;
        }

        public static /* synthetic */ PaymentComponent copy$default(PaymentComponent paymentComponent, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = paymentComponent.paymentMethodType;
            }
            return paymentComponent.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPaymentMethodType() {
            return this.paymentMethodType;
        }

        @NotNull
        public final PaymentComponent copy(@NotNull String paymentMethodType) {
            paymentMethodType.getClass();
            return new PaymentComponent(paymentMethodType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PaymentComponent) && Intrinsics.areEqual(this.paymentMethodType, ((PaymentComponent) other).paymentMethodType);
        }

        @NotNull
        public final String getPaymentMethodType() {
            return this.paymentMethodType;
        }

        public int hashCode() {
            return this.paymentMethodType.hashCode();
        }

        @NotNull
        public String toString() {
            return a0.p("PaymentComponent(paymentMethodType=", this.paymentMethodType, ")");
        }
    }

    public /* synthetic */ AnalyticsSource(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final List<String> getPaymentMethods() {
        if (this instanceof DropIn) {
            return ((DropIn) this).getPaymentMethodList();
        }
        if (this instanceof PaymentComponent) {
            return c0.c(((PaymentComponent) this).getPaymentMethodType());
        }
        a.f();
        return null;
    }

    private AnalyticsSource() {
    }
}
