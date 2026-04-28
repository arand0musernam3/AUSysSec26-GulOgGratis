package com.adyen.checkout.ui.core.internal.ui.model;

import com.adyen.checkout.components.core.internal.ui.model.AddressInputModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/model/AddressLookupInputData;", "", "query", "", "selectedAddress", "Lcom/adyen/checkout/components/core/internal/ui/model/AddressInputModel;", "(Ljava/lang/String;Lcom/adyen/checkout/components/core/internal/ui/model/AddressInputModel;)V", "getQuery", "()Ljava/lang/String;", "setQuery", "(Ljava/lang/String;)V", "getSelectedAddress", "()Lcom/adyen/checkout/components/core/internal/ui/model/AddressInputModel;", "setSelectedAddress", "(Lcom/adyen/checkout/components/core/internal/ui/model/AddressInputModel;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AddressLookupInputData {

    @NotNull
    private String query;

    @NotNull
    private AddressInputModel selectedAddress;

    public /* synthetic */ AddressLookupInputData(String str, AddressInputModel addressInputModel, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? new AddressInputModel(null, null, null, null, null, null, null, null, 255, null) : addressInputModel);
    }

    public static /* synthetic */ AddressLookupInputData copy$default(AddressLookupInputData addressLookupInputData, String str, AddressInputModel addressInputModel, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = addressLookupInputData.query;
        }
        if ((i11 & 2) != 0) {
            addressInputModel = addressLookupInputData.selectedAddress;
        }
        return addressLookupInputData.copy(str, addressInputModel);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AddressInputModel getSelectedAddress() {
        return this.selectedAddress;
    }

    @NotNull
    public final AddressLookupInputData copy(@NotNull String query, @NotNull AddressInputModel selectedAddress) {
        query.getClass();
        selectedAddress.getClass();
        return new AddressLookupInputData(query, selectedAddress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressLookupInputData)) {
            return false;
        }
        AddressLookupInputData addressLookupInputData = (AddressLookupInputData) other;
        return Intrinsics.areEqual(this.query, addressLookupInputData.query) && Intrinsics.areEqual(this.selectedAddress, addressLookupInputData.selectedAddress);
    }

    @NotNull
    public final String getQuery() {
        return this.query;
    }

    @NotNull
    public final AddressInputModel getSelectedAddress() {
        return this.selectedAddress;
    }

    public int hashCode() {
        return this.selectedAddress.hashCode() + (this.query.hashCode() * 31);
    }

    public final void setQuery(@NotNull String str) {
        str.getClass();
        this.query = str;
    }

    public final void setSelectedAddress(@NotNull AddressInputModel addressInputModel) {
        addressInputModel.getClass();
        this.selectedAddress = addressInputModel;
    }

    @NotNull
    public String toString() {
        return "AddressLookupInputData(query=" + this.query + ", selectedAddress=" + this.selectedAddress + ")";
    }

    public AddressLookupInputData(@NotNull String str, @NotNull AddressInputModel addressInputModel) {
        str.getClass();
        addressInputModel.getClass();
        this.query = str;
        this.selectedAddress = addressInputModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddressLookupInputData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
