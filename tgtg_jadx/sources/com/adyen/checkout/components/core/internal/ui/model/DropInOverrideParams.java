package com.adyen.checkout.components.core.internal.ui.model;

import com.adyen.checkout.components.core.Amount;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/adyen/checkout/components/core/internal/ui/model/DropInOverrideParams;", "", "amount", "Lcom/adyen/checkout/components/core/Amount;", "sessionParams", "Lcom/adyen/checkout/components/core/internal/ui/model/SessionParams;", "isSubmitButtonVisible", "", "(Lcom/adyen/checkout/components/core/Amount;Lcom/adyen/checkout/components/core/internal/ui/model/SessionParams;Z)V", "getAmount", "()Lcom/adyen/checkout/components/core/Amount;", "()Z", "getSessionParams", "()Lcom/adyen/checkout/components/core/internal/ui/model/SessionParams;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DropInOverrideParams {

    @Nullable
    private final Amount amount;
    private final boolean isSubmitButtonVisible;

    @Nullable
    private final SessionParams sessionParams;

    public DropInOverrideParams(@Nullable Amount amount, @Nullable SessionParams sessionParams, boolean z11) {
        this.amount = amount;
        this.sessionParams = sessionParams;
        this.isSubmitButtonVisible = z11;
    }

    public static /* synthetic */ DropInOverrideParams copy$default(DropInOverrideParams dropInOverrideParams, Amount amount, SessionParams sessionParams, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            amount = dropInOverrideParams.amount;
        }
        if ((i11 & 2) != 0) {
            sessionParams = dropInOverrideParams.sessionParams;
        }
        if ((i11 & 4) != 0) {
            z11 = dropInOverrideParams.isSubmitButtonVisible;
        }
        return dropInOverrideParams.copy(amount, sessionParams, z11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Amount getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SessionParams getSessionParams() {
        return this.sessionParams;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsSubmitButtonVisible() {
        return this.isSubmitButtonVisible;
    }

    @NotNull
    public final DropInOverrideParams copy(@Nullable Amount amount, @Nullable SessionParams sessionParams, boolean isSubmitButtonVisible) {
        return new DropInOverrideParams(amount, sessionParams, isSubmitButtonVisible);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropInOverrideParams)) {
            return false;
        }
        DropInOverrideParams dropInOverrideParams = (DropInOverrideParams) other;
        return Intrinsics.areEqual(this.amount, dropInOverrideParams.amount) && Intrinsics.areEqual(this.sessionParams, dropInOverrideParams.sessionParams) && this.isSubmitButtonVisible == dropInOverrideParams.isSubmitButtonVisible;
    }

    @Nullable
    public final Amount getAmount() {
        return this.amount;
    }

    @Nullable
    public final SessionParams getSessionParams() {
        return this.sessionParams;
    }

    public int hashCode() {
        Amount amount = this.amount;
        int iHashCode = (amount == null ? 0 : amount.hashCode()) * 31;
        SessionParams sessionParams = this.sessionParams;
        return Boolean.hashCode(this.isSubmitButtonVisible) + ((iHashCode + (sessionParams != null ? sessionParams.hashCode() : 0)) * 31);
    }

    public final boolean isSubmitButtonVisible() {
        return this.isSubmitButtonVisible;
    }

    @NotNull
    public String toString() {
        Amount amount = this.amount;
        SessionParams sessionParams = this.sessionParams;
        boolean z11 = this.isSubmitButtonVisible;
        StringBuilder sb2 = new StringBuilder("DropInOverrideParams(amount=");
        sb2.append(amount);
        sb2.append(", sessionParams=");
        sb2.append(sessionParams);
        sb2.append(", isSubmitButtonVisible=");
        return s.o(sb2, z11, ")");
    }

    public /* synthetic */ DropInOverrideParams(Amount amount, SessionParams sessionParams, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(amount, sessionParams, (i11 & 4) != 0 ? true : z11);
    }
}
