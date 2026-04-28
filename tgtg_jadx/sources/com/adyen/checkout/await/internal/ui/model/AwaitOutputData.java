package com.adyen.checkout.await.internal.ui.model;

import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.components.core.internal.ui.model.OutputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/adyen/checkout/await/internal/ui/model/AwaitOutputData;", "Lcom/adyen/checkout/components/core/internal/ui/model/OutputData;", "isValid", "", Action.PAYMENT_METHOD_TYPE, "", "(ZLjava/lang/String;)V", "()Z", "getPaymentMethodType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "await_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AwaitOutputData implements OutputData {
    private final boolean isValid;

    @Nullable
    private final String paymentMethodType;

    public AwaitOutputData(boolean z11, @Nullable String str) {
        this.isValid = z11;
        this.paymentMethodType = str;
    }

    public static /* synthetic */ AwaitOutputData copy$default(AwaitOutputData awaitOutputData, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = awaitOutputData.isValid;
        }
        if ((i11 & 2) != 0) {
            str = awaitOutputData.paymentMethodType;
        }
        return awaitOutputData.copy(z11, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    @NotNull
    public final AwaitOutputData copy(boolean isValid, @Nullable String paymentMethodType) {
        return new AwaitOutputData(isValid, paymentMethodType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AwaitOutputData)) {
            return false;
        }
        AwaitOutputData awaitOutputData = (AwaitOutputData) other;
        return this.isValid == awaitOutputData.isValid && Intrinsics.areEqual(this.paymentMethodType, awaitOutputData.paymentMethodType);
    }

    @Nullable
    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isValid) * 31;
        String str = this.paymentMethodType;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.OutputData
    public boolean isValid() {
        return this.isValid;
    }

    @NotNull
    public String toString() {
        return "AwaitOutputData(isValid=" + this.isValid + ", paymentMethodType=" + this.paymentMethodType + ")";
    }
}
