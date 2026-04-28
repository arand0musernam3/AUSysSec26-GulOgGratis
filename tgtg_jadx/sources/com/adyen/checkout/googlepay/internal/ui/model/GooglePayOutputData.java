package com.adyen.checkout.googlepay.internal.ui.model;

import b3.i;
import e10.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u0003\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u0004\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayOutputData;", "", "", "isButtonVisible", "isLoading", "Le10/l;", "paymentData", "<init>", "(ZZLe10/l;)V", "component1", "()Z", "component2", "component3", "()Le10/l;", "copy", "(ZZLe10/l;)Lcom/adyen/checkout/googlepay/internal/ui/model/GooglePayOutputData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Le10/l;", "getPaymentData", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GooglePayOutputData {
    private final boolean isButtonVisible;
    private final boolean isLoading;

    @Nullable
    private final l paymentData;

    public GooglePayOutputData(boolean z11, boolean z12, @Nullable l lVar) {
        this.isButtonVisible = z11;
        this.isLoading = z12;
        this.paymentData = lVar;
    }

    public static /* synthetic */ GooglePayOutputData copy$default(GooglePayOutputData googlePayOutputData, boolean z11, boolean z12, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = googlePayOutputData.isButtonVisible;
        }
        if ((i11 & 2) != 0) {
            z12 = googlePayOutputData.isLoading;
        }
        if ((i11 & 4) != 0) {
            lVar = googlePayOutputData.paymentData;
        }
        return googlePayOutputData.copy(z11, z12, lVar);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsButtonVisible() {
        return this.isButtonVisible;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final l getPaymentData() {
        return this.paymentData;
    }

    @NotNull
    public final GooglePayOutputData copy(boolean isButtonVisible, boolean isLoading, @Nullable l paymentData) {
        return new GooglePayOutputData(isButtonVisible, isLoading, paymentData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GooglePayOutputData)) {
            return false;
        }
        GooglePayOutputData googlePayOutputData = (GooglePayOutputData) other;
        return this.isButtonVisible == googlePayOutputData.isButtonVisible && this.isLoading == googlePayOutputData.isLoading && Intrinsics.areEqual(this.paymentData, googlePayOutputData.paymentData);
    }

    @Nullable
    public final l getPaymentData() {
        return this.paymentData;
    }

    public int hashCode() {
        int iE = k.e(Boolean.hashCode(this.isButtonVisible) * 31, 31, this.isLoading);
        l lVar = this.paymentData;
        return iE + (lVar == null ? 0 : lVar.hashCode());
    }

    public final boolean isButtonVisible() {
        return this.isButtonVisible;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isButtonVisible;
        boolean z12 = this.isLoading;
        l lVar = this.paymentData;
        StringBuilder sbP = i.p("GooglePayOutputData(isButtonVisible=", z11, ", isLoading=", z12, ", paymentData=");
        sbP.append(lVar);
        sbP.append(")");
        return sbP.toString();
    }
}
