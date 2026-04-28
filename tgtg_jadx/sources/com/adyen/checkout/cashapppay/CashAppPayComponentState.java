package com.adyen.checkout.cashapppay;

import com.adyen.checkout.components.core.PaymentComponentData;
import com.adyen.checkout.components.core.PaymentComponentState;
import com.adyen.checkout.components.core.paymentmethod.CashAppPayPaymentMethod;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/adyen/checkout/cashapppay/CashAppPayComponentState;", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "Lcom/adyen/checkout/components/core/paymentmethod/CashAppPayPaymentMethod;", Bayeux.KEY_DATA, "Lcom/adyen/checkout/components/core/PaymentComponentData;", "isInputValid", "", "isReady", "(Lcom/adyen/checkout/components/core/PaymentComponentData;ZZ)V", "getData", "()Lcom/adyen/checkout/components/core/PaymentComponentData;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "cashapppay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CashAppPayComponentState implements PaymentComponentState<CashAppPayPaymentMethod> {

    @NotNull
    private final PaymentComponentData<CashAppPayPaymentMethod> data;
    private final boolean isInputValid;
    private final boolean isReady;

    public CashAppPayComponentState(@NotNull PaymentComponentData<CashAppPayPaymentMethod> paymentComponentData, boolean z11, boolean z12) {
        paymentComponentData.getClass();
        this.data = paymentComponentData;
        this.isInputValid = z11;
        this.isReady = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CashAppPayComponentState copy$default(CashAppPayComponentState cashAppPayComponentState, PaymentComponentData paymentComponentData, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            paymentComponentData = cashAppPayComponentState.data;
        }
        if ((i11 & 2) != 0) {
            z11 = cashAppPayComponentState.isInputValid;
        }
        if ((i11 & 4) != 0) {
            z12 = cashAppPayComponentState.isReady;
        }
        return cashAppPayComponentState.copy(paymentComponentData, z11, z12);
    }

    @NotNull
    public final PaymentComponentData<CashAppPayPaymentMethod> component1() {
        return this.data;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsInputValid() {
        return this.isInputValid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsReady() {
        return this.isReady;
    }

    @NotNull
    public final CashAppPayComponentState copy(@NotNull PaymentComponentData<CashAppPayPaymentMethod> data, boolean isInputValid, boolean isReady) {
        data.getClass();
        return new CashAppPayComponentState(data, isInputValid, isReady);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CashAppPayComponentState)) {
            return false;
        }
        CashAppPayComponentState cashAppPayComponentState = (CashAppPayComponentState) other;
        return Intrinsics.areEqual(this.data, cashAppPayComponentState.data) && this.isInputValid == cashAppPayComponentState.isInputValid && this.isReady == cashAppPayComponentState.isReady;
    }

    @Override // com.adyen.checkout.components.core.PaymentComponentState
    @NotNull
    public PaymentComponentData<CashAppPayPaymentMethod> getData() {
        return this.data;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isReady) + k.e(this.data.hashCode() * 31, 31, this.isInputValid);
    }

    @Override // com.adyen.checkout.components.core.PaymentComponentState
    public boolean isInputValid() {
        return this.isInputValid;
    }

    @Override // com.adyen.checkout.components.core.PaymentComponentState
    public boolean isReady() {
        return this.isReady;
    }

    @Override // com.adyen.checkout.components.core.PaymentComponentState
    public boolean isValid() {
        return PaymentComponentState.DefaultImpls.isValid(this);
    }

    @NotNull
    public String toString() {
        PaymentComponentData<CashAppPayPaymentMethod> paymentComponentData = this.data;
        boolean z11 = this.isInputValid;
        boolean z12 = this.isReady;
        StringBuilder sb2 = new StringBuilder("CashAppPayComponentState(data=");
        sb2.append(paymentComponentData);
        sb2.append(", isInputValid=");
        sb2.append(z11);
        sb2.append(", isReady=");
        return s.o(sb2, z12, ")");
    }
}
