package com.adyen.checkout.card;

import com.adyen.checkout.components.core.PaymentComponentData;
import com.adyen.checkout.components.core.PaymentComponentState;
import com.adyen.checkout.components.core.paymentmethod.CardPaymentMethod;
import com.adyen.checkout.core.CardBrand;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nHÆ\u0003J\t\u0010\u001b\u001a\u00020\fHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003JU\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\fHÖ\u0001R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006$"}, d2 = {"Lcom/adyen/checkout/card/CardComponentState;", "Lcom/adyen/checkout/components/core/PaymentComponentState;", "Lcom/adyen/checkout/components/core/paymentmethod/CardPaymentMethod;", Bayeux.KEY_DATA, "Lcom/adyen/checkout/components/core/PaymentComponentData;", "isInputValid", "", "isReady", "cardBrand", "Lcom/adyen/checkout/core/CardBrand;", "Lcom/adyen/checkout/card/CardBrand;", "binValue", "", "lastFourDigits", "(Lcom/adyen/checkout/components/core/PaymentComponentData;ZZLcom/adyen/checkout/core/CardBrand;Ljava/lang/String;Ljava/lang/String;)V", "getBinValue", "()Ljava/lang/String;", "getCardBrand", "()Lcom/adyen/checkout/core/CardBrand;", "getData", "()Lcom/adyen/checkout/components/core/PaymentComponentData;", "()Z", "getLastFourDigits", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CardComponentState implements PaymentComponentState<CardPaymentMethod> {

    @NotNull
    private final String binValue;

    @Nullable
    private final CardBrand cardBrand;

    @NotNull
    private final PaymentComponentData<CardPaymentMethod> data;
    private final boolean isInputValid;
    private final boolean isReady;

    @Nullable
    private final String lastFourDigits;

    public CardComponentState(@NotNull PaymentComponentData<CardPaymentMethod> paymentComponentData, boolean z11, boolean z12, @Nullable CardBrand cardBrand, @NotNull String str, @Nullable String str2) {
        paymentComponentData.getClass();
        str.getClass();
        this.data = paymentComponentData;
        this.isInputValid = z11;
        this.isReady = z12;
        this.cardBrand = cardBrand;
        this.binValue = str;
        this.lastFourDigits = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardComponentState copy$default(CardComponentState cardComponentState, PaymentComponentData paymentComponentData, boolean z11, boolean z12, CardBrand cardBrand, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            paymentComponentData = cardComponentState.data;
        }
        if ((i11 & 2) != 0) {
            z11 = cardComponentState.isInputValid;
        }
        if ((i11 & 4) != 0) {
            z12 = cardComponentState.isReady;
        }
        if ((i11 & 8) != 0) {
            cardBrand = cardComponentState.cardBrand;
        }
        if ((i11 & 16) != 0) {
            str = cardComponentState.binValue;
        }
        if ((i11 & 32) != 0) {
            str2 = cardComponentState.lastFourDigits;
        }
        String str3 = str;
        String str4 = str2;
        return cardComponentState.copy(paymentComponentData, z11, z12, cardBrand, str3, str4);
    }

    @NotNull
    public final PaymentComponentData<CardPaymentMethod> component1() {
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
    public final CardBrand getCardBrand() {
        return this.cardBrand;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBinValue() {
        return this.binValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLastFourDigits() {
        return this.lastFourDigits;
    }

    @NotNull
    public final CardComponentState copy(@NotNull PaymentComponentData<CardPaymentMethod> data, boolean isInputValid, boolean isReady, @Nullable CardBrand cardBrand, @NotNull String binValue, @Nullable String lastFourDigits) {
        data.getClass();
        binValue.getClass();
        return new CardComponentState(data, isInputValid, isReady, cardBrand, binValue, lastFourDigits);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardComponentState)) {
            return false;
        }
        CardComponentState cardComponentState = (CardComponentState) other;
        return Intrinsics.areEqual(this.data, cardComponentState.data) && this.isInputValid == cardComponentState.isInputValid && this.isReady == cardComponentState.isReady && Intrinsics.areEqual(this.cardBrand, cardComponentState.cardBrand) && Intrinsics.areEqual(this.binValue, cardComponentState.binValue) && Intrinsics.areEqual(this.lastFourDigits, cardComponentState.lastFourDigits);
    }

    @NotNull
    public final String getBinValue() {
        return this.binValue;
    }

    @Nullable
    public final CardBrand getCardBrand() {
        return this.cardBrand;
    }

    @Override // com.adyen.checkout.components.core.PaymentComponentState
    @NotNull
    public PaymentComponentData<CardPaymentMethod> getData() {
        return this.data;
    }

    @Nullable
    public final String getLastFourDigits() {
        return this.lastFourDigits;
    }

    public int hashCode() {
        int iE = k.e(k.e(this.data.hashCode() * 31, 31, this.isInputValid), 31, this.isReady);
        CardBrand cardBrand = this.cardBrand;
        int iB = l1.b((iE + (cardBrand == null ? 0 : cardBrand.hashCode())) * 31, 31, this.binValue);
        String str = this.lastFourDigits;
        return iB + (str != null ? str.hashCode() : 0);
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
        PaymentComponentData<CardPaymentMethod> paymentComponentData = this.data;
        boolean z11 = this.isInputValid;
        boolean z12 = this.isReady;
        CardBrand cardBrand = this.cardBrand;
        String str = this.binValue;
        String str2 = this.lastFourDigits;
        StringBuilder sb2 = new StringBuilder("CardComponentState(data=");
        sb2.append(paymentComponentData);
        sb2.append(", isInputValid=");
        sb2.append(z11);
        sb2.append(", isReady=");
        sb2.append(z12);
        sb2.append(", cardBrand=");
        sb2.append(cardBrand);
        sb2.append(", binValue=");
        return f.o(sb2, str, ", lastFourDigits=", str2, ")");
    }
}
