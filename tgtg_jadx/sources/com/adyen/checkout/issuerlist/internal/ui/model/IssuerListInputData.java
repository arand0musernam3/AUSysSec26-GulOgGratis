package com.adyen.checkout.issuerlist.internal.ui.model;

import com.adyen.checkout.components.core.internal.ui.model.InputData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerListInputData;", "Lcom/adyen/checkout/components/core/internal/ui/model/InputData;", "selectedIssuer", "Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerModel;", "(Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerModel;)V", "getSelectedIssuer", "()Lcom/adyen/checkout/issuerlist/internal/ui/model/IssuerModel;", "setSelectedIssuer", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "issuer-list_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class IssuerListInputData implements InputData {

    @Nullable
    private IssuerModel selectedIssuer;

    public /* synthetic */ IssuerListInputData(IssuerModel issuerModel, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : issuerModel);
    }

    public static /* synthetic */ IssuerListInputData copy$default(IssuerListInputData issuerListInputData, IssuerModel issuerModel, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            issuerModel = issuerListInputData.selectedIssuer;
        }
        return issuerListInputData.copy(issuerModel);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final IssuerModel getSelectedIssuer() {
        return this.selectedIssuer;
    }

    @NotNull
    public final IssuerListInputData copy(@Nullable IssuerModel selectedIssuer) {
        return new IssuerListInputData(selectedIssuer);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IssuerListInputData) && Intrinsics.areEqual(this.selectedIssuer, ((IssuerListInputData) other).selectedIssuer);
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

    public final void setSelectedIssuer(@Nullable IssuerModel issuerModel) {
        this.selectedIssuer = issuerModel;
    }

    @NotNull
    public String toString() {
        return "IssuerListInputData(selectedIssuer=" + this.selectedIssuer + ")";
    }

    public IssuerListInputData(@Nullable IssuerModel issuerModel) {
        this.selectedIssuer = issuerModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IssuerListInputData() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
