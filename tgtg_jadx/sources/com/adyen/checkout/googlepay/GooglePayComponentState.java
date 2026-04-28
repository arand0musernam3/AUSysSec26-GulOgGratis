package com.adyen.checkout.googlepay;

import com.adyen.checkout.components.core.PaymentComponentData;
import com.adyen.checkout.components.core.PaymentComponentState;
import com.adyen.checkout.components.core.paymentmethod.GooglePayPaymentMethod;
import e10.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\u0006\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\u0007\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0012¨\u0006$"}, d2 = {"Lcom/adyen/checkout/googlepay/GooglePayComponentState;", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "Lcom/adyen/checkout/components/core/paymentmethod/GooglePayPaymentMethod;", "Lcom/adyen/checkout/components/core/PaymentComponentData;", Bayeux.KEY_DATA, "", "isInputValid", "isReady", "Le10/l;", "paymentData", "<init>", "(Lcom/adyen/checkout/components/core/PaymentComponentData;ZZLe10/l;)V", "component1", "()Lcom/adyen/checkout/components/core/PaymentComponentData;", "component2", "()Z", "component3", "component4", "()Le10/l;", "copy", "(Lcom/adyen/checkout/components/core/PaymentComponentData;ZZLe10/l;)Lcom/adyen/checkout/googlepay/GooglePayComponentState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/adyen/checkout/components/core/PaymentComponentData;", "getData", "Z", "Le10/l;", "getPaymentData", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GooglePayComponentState implements PaymentComponentState<GooglePayPaymentMethod> {

    @NotNull
    private final PaymentComponentData<GooglePayPaymentMethod> data;
    private final boolean isInputValid;
    private final boolean isReady;

    @Nullable
    private final l paymentData;

    public GooglePayComponentState(@NotNull PaymentComponentData<GooglePayPaymentMethod> paymentComponentData, boolean z11, boolean z12, @Nullable l lVar) {
        paymentComponentData.getClass();
        this.data = paymentComponentData;
        this.isInputValid = z11;
        this.isReady = z12;
        this.paymentData = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GooglePayComponentState copy$default(GooglePayComponentState googlePayComponentState, PaymentComponentData paymentComponentData, boolean z11, boolean z12, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            paymentComponentData = googlePayComponentState.data;
        }
        if ((i11 & 2) != 0) {
            z11 = googlePayComponentState.isInputValid;
        }
        if ((i11 & 4) != 0) {
            z12 = googlePayComponentState.isReady;
        }
        if ((i11 & 8) != 0) {
            lVar = googlePayComponentState.paymentData;
        }
        return googlePayComponentState.copy(paymentComponentData, z11, z12, lVar);
    }

    @NotNull
    public final PaymentComponentData<GooglePayPaymentMethod> component1() {
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

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final l getPaymentData() {
        return this.paymentData;
    }

    @NotNull
    public final GooglePayComponentState copy(@NotNull PaymentComponentData<GooglePayPaymentMethod> data, boolean isInputValid, boolean isReady, @Nullable l paymentData) {
        data.getClass();
        return new GooglePayComponentState(data, isInputValid, isReady, paymentData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GooglePayComponentState)) {
            return false;
        }
        GooglePayComponentState googlePayComponentState = (GooglePayComponentState) other;
        return Intrinsics.areEqual(this.data, googlePayComponentState.data) && this.isInputValid == googlePayComponentState.isInputValid && this.isReady == googlePayComponentState.isReady && Intrinsics.areEqual(this.paymentData, googlePayComponentState.paymentData);
    }

    @Override // com.adyen.checkout.components.core.PaymentComponentState
    @NotNull
    public PaymentComponentData<GooglePayPaymentMethod> getData() {
        return this.data;
    }

    @Nullable
    public final l getPaymentData() {
        return this.paymentData;
    }

    public int hashCode() {
        int iE = k.e(k.e(this.data.hashCode() * 31, 31, this.isInputValid), 31, this.isReady);
        l lVar = this.paymentData;
        return iE + (lVar == null ? 0 : lVar.hashCode());
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
        return "GooglePayComponentState(data=" + this.data + ", isInputValid=" + this.isInputValid + ", isReady=" + this.isReady + ", paymentData=" + this.paymentData + ")";
    }
}
