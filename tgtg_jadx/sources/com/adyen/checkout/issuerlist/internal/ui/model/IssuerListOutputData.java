package com.adyen.checkout.issuerlist.internal.ui.model;

import com.adyen.checkout.components.core.internal.ui.model.OutputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerListOutputData;", "Lcom/adyen/checkout/components/core/internal/ui/model/OutputData;", "selectedIssuer", "Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerModel;", "(Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerModel;)V", "isValid", "", "()Z", "getSelectedIssuer", "()Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerModel;", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "issuer-list_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class IssuerListOutputData implements OutputData {
    private final boolean isValid;

    @Nullable
    private final IssuerModel selectedIssuer;

    public IssuerListOutputData(@Nullable IssuerModel issuerModel) {
        this.selectedIssuer = issuerModel;
        this.isValid = issuerModel != null;
    }

    public static /* synthetic */ IssuerListOutputData copy$default(IssuerListOutputData issuerListOutputData, IssuerModel issuerModel, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            issuerModel = issuerListOutputData.selectedIssuer;
        }
        return issuerListOutputData.copy(issuerModel);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final IssuerModel getSelectedIssuer() {
        return this.selectedIssuer;
    }

    @NotNull
    public final IssuerListOutputData copy(@Nullable IssuerModel selectedIssuer) {
        return new IssuerListOutputData(selectedIssuer);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IssuerListOutputData) && Intrinsics.areEqual(this.selectedIssuer, ((IssuerListOutputData) other).selectedIssuer);
    }

    @Nullable
    public final IssuerModel getSelectedIssuer() {
        return this.selectedIssuer;
    }

    public int hashCode() {
        IssuerModel issuerModel = this.selectedIssuer;
        if (issuerModel == null) {
            return 0;
        }
        return issuerModel.hashCode();
    }

    @Override // com.adyen.checkout.components.core.internal.ui.model.OutputData
    /* JADX INFO: renamed from: isValid, reason: from getter */
    public boolean getIsValid() {
        return this.isValid;
    }

    @NotNull
    public String toString() {
        return "IssuerListOutputData(selectedIssuer=" + this.selectedIssuer + ")";
    }
}
